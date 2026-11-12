package defpackage;

import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class l7c implements v98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24737a = {48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f24738b = new byte[128];

    public l7c() {
        b();
    }

    private static boolean a(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public void b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f24738b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f24737a;
            if (i >= bArr2.length) {
                byte[] bArr3 = this.f24738b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.f24738b[bArr2[i]] = (byte) i;
            i++;
        }
    }

    @Override // defpackage.v98
    public int decode(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && a(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            while (i < length && a(str.charAt(i))) {
                i++;
            }
            int i3 = i + 1;
            byte b2 = this.f24738b[str.charAt(i)];
            while (i3 < length && a(str.charAt(i3))) {
                i3++;
            }
            int i4 = i3 + 1;
            byte b3 = this.f24738b[str.charAt(i3)];
            if ((b2 | b3) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            outputStream.write((b2 << 4) | b3);
            i2++;
            i = i4;
        }
        return i2;
    }

    @Override // defpackage.v98
    public int encode(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            byte b2 = bArr[i3];
            outputStream.write(this.f24737a[(b2 & 255) >>> 4]);
            outputStream.write(this.f24737a[b2 & 15]);
        }
        return i2 * 2;
    }
}
