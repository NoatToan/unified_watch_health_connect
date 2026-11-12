package miui.bluetooth.ble;

import android.os.ParcelUuid;

/* JADX INFO: loaded from: classes23.dex */
public class MiServiceData {
    public static final byte CAPABILITY_CENTRAL = 2;
    public static final byte CAPABILITY_CONNECTABLE = 1;
    public static final byte CAPABILITY_ENCRYPT = 4;
    public static final byte CAPABILITY_IO = 24;
    private static final int e = 5;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 4;
    private static final int i = 8;
    private static final int j = 16;
    private static final int k = 32;
    private static final int l = 64;
    private static final int m = 128;
    private static final int n = 256;
    private static final int o = 512;
    private byte[] a;
    private int b;
    private int c;
    private static final String d = "0000%4s-0000-1000-8000-00805f9b34fb";
    public static final ParcelUuid MI_SERVICE_UUID = ParcelUuid.fromString(String.format(d, "fe95"));

    public MiServiceData(byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            throw new IllegalArgumentException("Mi Service data length must >= 5");
        }
        this.a = bArr;
        this.b = (bArr[0] & 255) | ((bArr[1] & 255) << 8);
        this.c = (bArr[1] & 240) >> 4;
    }

    private int a() {
        int i2 = hasMacAddress() ? 11 : 5;
        return hasCapability() ? i2 + 1 : i2;
    }

    public static MiServiceData fromScanRecord(ScanRecord scanRecord) {
        byte[] serviceData;
        if (scanRecord == null || scanRecord.getServiceData() == null || (serviceData = scanRecord.getServiceData(MI_SERVICE_UUID)) == null || serviceData.length < 5) {
            return null;
        }
        return new MiServiceData(serviceData);
    }

    public byte getCapability() {
        if (!hasCapability()) {
            return (byte) 0;
        }
        int i2 = hasMacAddress() ? 11 : 5;
        byte[] bArr = this.a;
        if (bArr.length >= i2 + 6) {
            return bArr[i2];
        }
        return (byte) 0;
    }

    public byte[] getCustomData() {
        if (!hasCustomData()) {
            return null;
        }
        int i2 = hasMacAddress() ? 11 : 5;
        if (hasCapability()) {
            i2++;
        }
        if (hasEvent()) {
            i2 += 3;
        }
        byte[] bArr = this.a;
        if (bArr.length <= i2) {
            return null;
        }
        int i3 = bArr[i2];
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2 + 1, bArr2, 0, i3);
        return bArr2;
    }

    public byte[] getData() {
        return this.a;
    }

    public byte getEvent() {
        if (!hasEvent()) {
            return (byte) 0;
        }
        int iA = a();
        byte[] bArr = this.a;
        if (bArr.length >= iA + 3) {
            return bArr[iA + 2];
        }
        return (byte) 0;
    }

    public int getEventID() {
        if (!hasEvent()) {
            return 0;
        }
        int iA = a();
        byte[] bArr = this.a;
        return ((bArr[iA + 1] & 255) << 8) | (bArr[iA] & 255);
    }

    public int getFrameCounter() {
        return this.a[4] & 255;
    }

    public byte[] getMacAddress() {
        if (!hasMacAddress()) {
            return null;
        }
        byte[] bArr = this.a;
        if (bArr.length < 11) {
            return null;
        }
        byte[] bArr2 = new byte[6];
        System.arraycopy(bArr, 5, bArr2, 0, 6);
        return bArr2;
    }

    public int getProductID() {
        byte[] bArr = this.a;
        return ((bArr[3] & 255) << 8) | (bArr[2] & 255);
    }

    public boolean hasCapability() {
        return (this.b & 32) != 0;
    }

    public boolean hasCustomData() {
        return (this.b & 128) != 0;
    }

    public boolean hasEvent() {
        return (this.b & 64) != 0;
    }

    public boolean hasMacAddress() {
        return (this.b & 16) != 0;
    }

    public boolean hasSubTitle() {
        return (this.b & 256) != 0;
    }

    public boolean isBindingFrame() {
        return (this.b & 512) != 0;
    }

    public boolean isCentral() {
        return (this.b & 4) != 0;
    }

    public boolean isConnected() {
        return (this.b & 2) != 0;
    }

    public boolean isEncrypted() {
        return (this.b & 8) != 0;
    }

    public boolean isNewFactory() {
        return (this.b & 1) != 0;
    }
}
