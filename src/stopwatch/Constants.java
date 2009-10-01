package stopwatch;

/**
 * Event labels for the stopwatch.
 */
public interface Constants {

    // misc constants
  
    int SEC_PER_TICK  = 1;
    int SEC_PER_MIN   = 60;
    int SEC_PER_HOUR  = 3600;  

    // incoming events

    String START      = "Start";
    String RESET      = "Reset";

    // outgoing events

    String NOW        = "Now";
}