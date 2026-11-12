package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public class t12 implements v98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f34190a = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f34191b = Base64.padSymbol;
    public final byte[] c = new byte[128];

    public t12() {
        c();
    }

    public final int a(OutputStream outputStream, char c, char c2, char c3, char c4) throws IOException {
        char c5 = this.f34191b;
        if (c3 == c5) {
            if (c4 != c5) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            byte[] bArr = this.c;
            byte b2 = bArr[c];
            byte b3 = bArr[c2];
            if ((b2 | b3) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b2 << 2) | (b3 >> 4));
            return 1;
        }
        if (c4 == c5) {
            byte[] bArr2 = this.c;
            byte b4 = bArr2[c];
            byte b5 = bArr2[c2];
            byte b6 = bArr2[c3];
            if ((b4 | b5 | b6) < 0) {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            outputStream.write((b4 << 2) | (b5 >> 4));
            outputStream.write((b5 << 4) | (b6 >> 2));
            return 2;
        }
        byte[] bArr3 = this.c;
        byte b7 = bArr3[c];
        byte b8 = bArr3[c2];
        byte b9 = bArr3[c3];
        byte b10 = bArr3[c4];
        if ((b7 | b8 | b9 | b10) < 0) {
            throw new IOException("invalid characters encountered at end of base64 data");
        }
        outputStream.write((b7 << 2) | (b8 >> 4));
        outputStream.write((b8 << 4) | (b9 >> 2));
        outputStream.write((b9 << 6) | b10);
        return 3;
    }

    public final boolean b(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public void c() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f34190a;
            if (i >= bArr2.length) {
                return;
            }
            this.c[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public final int d(String str, int i, int i2) {
        while (i < i2 && b(str.charAt(i))) {
            i++;
        }
        return i;
    }

    @Override // defpackage.v98
    public int decode(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && b(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = length;
        int i3 = 0;
        while (i2 > 0 && i3 != 4) {
            if (!b(str.charAt(i2 - 1))) {
                i3++;
            }
            i2--;
        }
        int iD = d(str, 0, i2);
        while (iD < i2) {
            int i4 = iD + 1;
            byte b2 = this.c[str.charAt(iD)];
            int iD2 = d(str, i4, i2);
            int i5 = iD2 + 1;
            byte b3 = this.c[str.charAt(iD2)];
            int iD3 = d(str, i5, i2);
            int i6 = iD3 + 1;
            byte b4 = this.c[str.charAt(iD3)];
            int iD4 = d(str, i6, i2);
            int i7 = iD4 + 1;
            byte b5 = this.c[str.charAt(iD4)];
            if ((b2 | b3 | b4 | b5) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            outputStream.write((b2 << 2) | (b3 >> 4));
            outputStream.write((b3 << 4) | (b4 >> 2));
            outputStream.write((b4 << 6) | b5);
            i += 3;
            iD = d(str, i7, i2);
        }
        int iD5 = d(str, iD, length);
        int iD6 = d(str, iD5 + 1, length);
        int iD7 = d(str, iD6 + 1, length);
        return i + a(outputStream, str.charAt(iD5), str.charAt(iD6), str.charAt(iD7), str.charAt(d(str, iD7 + 1, length)));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a4  */
    @Override // defpackage.v98
    public int encode(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        int i3;
        byte b2;
        int i4 = i2 % 3;
        int i5 = i2 - i4;
        int i6 = i;
        while (true) {
            i3 = i + i5;
            if (i6 >= i3) {
                break;
            }
            int i7 = bArr[i6] & 255;
            int i8 = bArr[i6 + 1] & 255;
            byte b3 = bArr[i6 + 2];
            outputStream.write(this.f34190a[(i7 >>> 2) & 63]);
            outputStream.write(this.f34190a[((i7 << 4) | (i8 >>> 4)) & 63]);
            outputStream.write(this.f34190a[((i8 << 2) | ((b3 & 255) >>> 6)) & 63]);
            outputStream.write(this.f34190a[b3 & 63]);
            i6 += 3;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                int i9 = bArr[i3] & 255;
                int i10 = bArr[i3 + 1] & 255;
                outputStream.write(this.f34190a[(i9 >>> 2) & 63]);
                outputStream.write(this.f34190a[((i9 << 4) | (i10 >>> 4)) & 63]);
                b2 = this.f34190a[(i10 << 2) & 63];
            }
            return ((i5 / 3) * 4) + (i4 == 0 ? 0 : 4);
        }
        int i11 = bArr[i3] & 255;
        outputStream.write(this.f34190a[(i11 >>> 2) & 63]);
        outputStream.write(this.f34190a[(i11 << 4) & 63]);
        b2 = this.f34191b;
        outputStream.write(b2);
        outputStream.write(this.f34191b);
        return ((i5 / 3) * 4) + (i4 == 0 ? 0 : 4);
    }
}
