package org.apache.commons.fileupload.util.mime;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.nfc.applet.ISeCommandKt;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes23.dex */
final class a {
    private static final int a = -1;
    private static final int b = -2;
    private static final int c = 255;
    private static final int d = 4;
    private static final byte f = 61;
    private static final byte[] e = {65, org.threeten.bp.a.l, org.threeten.bp.a.m, org.threeten.bp.a.n, org.threeten.bp.a.o, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, RaceType.CMD_NEED_RESP, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, ISeCommandKt.RPDU_NEED_JUDGE, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, HMDisplaySetting.TYPE_OSPREY_W, 50, HMDisplaySetting.TYPE_VENICE, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] g = new byte[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = g;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = e;
            if (i >= bArr2.length) {
                g[61] = -2;
                return;
            } else {
                g[bArr2[i]] = (byte) i;
                i++;
            }
        }
    }

    private a() {
    }

    public static int a(byte[] bArr, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[4];
        int i = 0;
        int i2 = 0;
        for (byte b2 : bArr) {
            byte b3 = g[b2 & 255];
            if (b3 != -1) {
                int i3 = i + 1;
                bArr2[i] = b3;
                if (i3 == 4) {
                    byte b4 = bArr2[0];
                    byte b5 = bArr2[1];
                    byte b6 = bArr2[2];
                    byte b7 = bArr2[3];
                    if (b4 == -2 || b5 == -2) {
                        throw new IOException("Invalid Base64 input: incorrect padding, first two bytes cannot be padding");
                    }
                    outputStream.write((b4 << 2) | (b5 >> 4));
                    i2++;
                    if (b6 != -2) {
                        outputStream.write((b5 << 4) | (b6 >> 2));
                        i2++;
                        if (b7 != -2) {
                            outputStream.write((b6 << 6) | b7);
                            i2++;
                        }
                    } else if (b7 != -2) {
                        throw new IOException("Invalid Base64 input: incorrect padding, 4th byte must be padding if 3rd byte is");
                    }
                    i = 0;
                } else {
                    i = i3;
                }
            }
        }
        if (i == 0) {
            return i2;
        }
        throw new IOException("Invalid Base64 input: truncated");
    }
}
