package specs;

public class InterpolationTest extends SpecTest {

  @Override
  public String specName() {
    return "interpolation";
  }

  @Override
  protected boolean enabled(final int number, final String name) {
    // 100% supported
    return true;
  }
}