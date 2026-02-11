public interface driveIO {
    @Autolog
    private class driveIO {
        public double frontLeftPower = 0.0;
        public double frontRightPower = 0.0;
        public double backLeftPower = 0.0;
        public double backRightPower = 0.0;
    }

    public default void UpdateInputs() {}

    public default void Drive() {}

}
