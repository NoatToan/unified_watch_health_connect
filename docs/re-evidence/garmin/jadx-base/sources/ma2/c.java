package ma2;

import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public interface c {
    void onBleCharacteristicNotificationSet(String str, UUID uuid, UUID uuid2, boolean z14);

    void onBleCharacteristicWritten(String str, UUID uuid, UUID uuid2, boolean z14);

    void onBlePacketReceived(String str, UUID uuid, UUID uuid2, byte[] bArr);

    void onBleServicesDiscovered(da2.k kVar, UUID uuid, UUID[] uuidArr);

    void onRemoteDeviceDisconnected(String str);
}
