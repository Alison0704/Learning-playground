$score=50; #change the value of score to see other results

if ($score > 100){ # If score is greater than 100
print "Error: the score is greater than 100!\n";
}
elsif ($score < 0){ # Else If score is less than 0
print "Error: the score is less than 0!\n";
}
elsif ($score >= 50){ # Else if score is greater or equal to 50
print "Pass!\n";
}
else{ # If none above, then score must be between 0 and 49
print "Fail!\n";
}