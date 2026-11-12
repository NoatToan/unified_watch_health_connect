package jc2;

/* JADX INFO: loaded from: classes11.dex */
public enum a {
    GARMIN_DEVICE_SYNC("ConnectMobileDeviceSync"),
    GARMIN_DEVICE_HANDSHAKE("ConnectMobileHandshake"),
    GARMIN_DEVICE_PAIRING("ConnectMobileDevicePair"),
    GARMIN_DEVICE_DISCONNECT("ConnectMobileDeviceDisconnect"),
    GARMIN_DEVICE_FILE_TRANSFER("FileTransferEventDetails");

    public String omtEventTypeValue;

    a(String str) {
        this.omtEventTypeValue = str;
    }
}
