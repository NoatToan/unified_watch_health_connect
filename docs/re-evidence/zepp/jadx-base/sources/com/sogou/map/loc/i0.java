package com.sogou.map.loc;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.nfc.applet.ISeCommandKt;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;

/* JADX INFO: loaded from: classes18.dex */
final class i0 {
    private static final byte[] d = {65, org.threeten.bp.a.l, org.threeten.bp.a.m, org.threeten.bp.a.n, org.threeten.bp.a.o, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, RaceType.CMD_NEED_RESP, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, ISeCommandKt.RPDU_NEED_JUDGE, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, HMDisplaySetting.TYPE_OSPREY_W, 50, HMDisplaySetting.TYPE_VENICE, 52, 53, 54, 55, 56, 57, 45, 95};
    public byte[] a = null;
    private final byte[] b = new byte[2];
    private int c = 0;

    public i0(byte[] bArr) {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    public final boolean a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        byte b;
        byte b2;
        byte b3;
        byte[] bArr2 = d;
        byte[] bArr3 = this.a;
        int i6 = i2 + i;
        int i7 = this.c;
        int i8 = 0;
        if (i7 != 1) {
            if (i7 == 2 && (i3 = i + 1) <= i6) {
                byte[] bArr4 = this.b;
                i4 = (bArr[i] & 255) | ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16);
                this.c = 0;
            } else {
                i3 = i;
                i4 = -1;
            }
        } else if (i + 2 <= i6) {
            int i9 = i + 1;
            i3 = i9 + 1;
            i4 = ((bArr[i] & 255) << 8) | ((this.b[0] & 255) << 16) | (bArr[i9] & 255);
            this.c = 0;
        } else {
            i3 = i;
            i4 = -1;
        }
        if (i4 != -1) {
            bArr3[0] = bArr2[(i4 >> 18) & 63];
            bArr3[1] = bArr2[(i4 >> 12) & 63];
            bArr3[2] = bArr2[(i4 >> 6) & 63];
            bArr3[3] = bArr2[i4 & 63];
            i5 = 4;
        } else {
            i5 = 0;
        }
        while (true) {
            int i10 = i3 + 3;
            if (i10 > i6) {
                break;
            }
            int i11 = (bArr[i3 + 2] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8);
            bArr3[i5] = bArr2[(i11 >> 18) & 63];
            bArr3[i5 + 1] = bArr2[(i11 >> 12) & 63];
            bArr3[i5 + 2] = bArr2[(i11 >> 6) & 63];
            bArr3[i5 + 3] = bArr2[i11 & 63];
            i5 += 4;
            i3 = i10;
        }
        int i12 = this.c;
        if (i3 - i12 == i6 - 1) {
            if (i12 > 0) {
                b3 = this.b[0];
                i8 = 1;
            } else {
                b3 = bArr[i3];
            }
            int i13 = (b3 & 255) << 4;
            this.c = i12 - i8;
            bArr3[i5] = bArr2[(i13 >> 6) & 63];
            bArr3[i5 + 1] = bArr2[i13 & 63];
        } else if (i3 - i12 == i6 - 2) {
            if (i12 > 1) {
                b = this.b[0];
                i8 = 1;
            } else {
                int i14 = i3 + 1;
                byte b4 = bArr[i3];
                i3 = i14;
                b = b4;
            }
            int i15 = (b & 255) << 10;
            if (i12 > 0) {
                b2 = this.b[i8];
                i8++;
            } else {
                b2 = bArr[i3];
            }
            int i16 = ((b2 & 255) << 2) | i15;
            this.c = i12 - i8;
            int i17 = i5 + 1;
            bArr3[i5] = bArr2[(i16 >> 12) & 63];
            bArr3[i17] = bArr2[(i16 >> 6) & 63];
            bArr3[i17 + 1] = bArr2[i16 & 63];
        }
        return true;
    }
}
