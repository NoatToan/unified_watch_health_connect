package rs2;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    String getBleMacAddress();

    int getBluetoothLimitation();

    String getBtcMacAddress();

    Set<Integer> getConfigurationFlags();

    String getConnectionId();

    String getDeviceName();

    int getProductNumber();

    int getSoftwareVersion();

    long getUnitId();

    boolean isDualBluetoothConnection();
}
