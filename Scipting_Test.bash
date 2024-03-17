#!/bin/bash

# Function to print HTTP error code of guvi.in
check_http_error_code() {
    url="https://guvi.in"
    http_code=$(curl -s -o /dev/null -w "%{http_code}" $url)
    
    echo "HTTP Error Code for $url: $http_code"
    
    if [[ $http_code == 200 ]]; then
        echo "Success: Website is accessible."
    else
        echo "Failure: Website is not accessible."
    fi
}

# Function to replace occurrences of "give" with "learning" from 5th line onwards where "welcome" is present
replace_word_in_file() {
    file="$1"
    sed -i '5,$s/give/learning/g' "$file"
    echo "Replacement completed in $file"
}

# Main script starts here
check_http_error_code
file="example.txt"  # Replace with your file name
replace_word_in_file "$file"
