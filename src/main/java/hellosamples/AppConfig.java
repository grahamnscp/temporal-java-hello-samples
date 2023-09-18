package hellosamples;

public final class AppConfig {

  public static final String TEMPORAL_NAMESPACE=System.getenv("TEMPORAL_NAMESPACE");
  public static final String TASK_QUEUE=System.getenv("TASK_QUEUE");

  private AppConfig() {
  }
}
