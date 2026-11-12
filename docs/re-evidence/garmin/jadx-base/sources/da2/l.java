package da2;

import com.garmin.device.datatypes.DeviceProfile;

/* JADX INFO: loaded from: classes7.dex */
public interface l {
    <T> T getCapability(Class<T> cls);

    int getConnectionType();

    String getMacAddress();

    DeviceProfile getProfile();

    boolean isHandshakeCompleted();
}
