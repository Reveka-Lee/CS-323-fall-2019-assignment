/**
 * Running Trials
 * Author: Reveka Lee and Carolyn Yao
 * Does this compile or finish running within 5 seconds? Y/N
DOES NOT COMPILE. See code.
 */

public class RunningTrials {

  // Do not change the parameters!
  public int runTrialsRecur(int possibleSpeeds, int weeks) {
    int minTests = 0;
    // Your code here
    return minTests + runTrialsRecur(possibleSpeeds-1, weeks+1);
  }

  // Optional:
  // Pick whatever parameters you want to, just make sure to return an int.
  public int runTrialsMemoized() {
    int minTests = 0;
    // Your optional code here
    return minTests;
  }

  // Do not change the parameters!
  public int runTrialsBottomUp(int possibleSpeeds, int weeks) {
    int minTests = 0;
    // Your code here
    for(int i = 0; i < possibleSpeeds; i++){
     for(int j = 0; j < weeks; j++){
      runTrialsBottomUp[i,j]= max(runTrialsBottomUp(i-1, j) + runTrialsBottomUp(i, j+1));
      minTests[i,j] = runTrialBottomUp [i,j];
     }
   }
    return minTests;
  }

  public static void main(String args[]){
      RunningTrials running = new RunningTrials();

      // Do not touch the below lines of code, your output will automatically be formatted
      int minTrials1Recur = running.runTrialsRecur(12, 5);
      int minTrials1Bottom = running.runTrialsBottomUp(12, 5);
      int minTrials2Recur = running.runTrialsRecur(20, 8);
      int minTrials2Bottom = running.runTrialsBottomUp(20, 8);
      System.out.println("12 speeds, 5 weeks: " + minTrials1Recur + " " + minTrials1Bottom);
      System.out.println("20 speeds, 8 weeks: " + minTrials2Recur + " " + minTrials2Bottom);
  }
}
