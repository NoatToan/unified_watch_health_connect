package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class tzo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f35225a = c(new byte[]{116, 116, 99, 102});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35226b = c(new byte[]{99, 109, APDUConstants.TAG_MORE_DATA, 112});
    public static final int c = c(new byte[]{104, 101, APDUConstants.TAG_MORE_DATA, 100});
    public static final int d = c(new byte[]{104, 104, 101, APDUConstants.TAG_MORE_DATA});
    public static final int e = c(new byte[]{104, 109, 116, 120});
    public static final int f = c(new byte[]{109, APDUConstants.TAG_MORE_DATA, 120, 112});
    public static final int g = c(new byte[]{110, APDUConstants.TAG_MORE_DATA, 109, 101});
    public static final int h = c(new byte[]{79, 83, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR});
    public static final int i = c(new byte[]{112, 111, 115, 116});
    public static final int j = c(new byte[]{99, 118, 116, 32});

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f35227k = c(new byte[]{102, 112, 103, 109});
    public static final int l = c(new byte[]{103, 108, 121, 102});
    public static final int m = c(new byte[]{108, 111, 99, APDUConstants.TAG_MORE_DATA});
    public static final int n = c(new byte[]{112, 114, 101, 112});
    public static final int o = c(new byte[]{67, 70, 70, 32});
    public static final int p = c(new byte[]{86, 79, 82, 71});
    public static final int q = c(new byte[]{69, 66, 68, 84});

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f35228r = c(new byte[]{69, 66, 76, 67});
    public static final int s = c(new byte[]{69, 66, 83, 67});
    public static final int t = c(new byte[]{66, HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 83, 69});
    public static final int u = c(new byte[]{71, 68, 69, 70});
    public static final int v = c(new byte[]{71, SettingsModule.VALUE_TYPE_FLAG, 79, 83});
    public static final int w = c(new byte[]{71, 83, 85, 66});
    public static final int x = c(new byte[]{74, 83, 84, 70});
    public static final int y = c(new byte[]{68, 83, 73, 71});
    public static final int z = c(new byte[]{103, APDUConstants.TAG_MORE_DATA, 115, 112});
    public static final int A = c(new byte[]{104, 100, 109, 120});
    public static final int B = c(new byte[]{107, 101, 114, 110});
    public static final int C = c(new byte[]{76, 84, 83, 72});
    public static final int D = c(new byte[]{SettingsModule.VALUE_TYPE_FLAG, 67, 76, 84});
    public static final int E = c(new byte[]{86, 68, 77, 88});
    public static final int F = c(new byte[]{118, 104, 101, APDUConstants.TAG_MORE_DATA});
    public static final int G = c(new byte[]{118, 109, 116, 120});
    public static final int H = c(new byte[]{98, 115, 108, 110});
    public static final int I = c(new byte[]{102, 101, APDUConstants.TAG_MORE_DATA, 116});
    public static final int J = c(new byte[]{108, 99, APDUConstants.TAG_MORE_DATA, 114});
    public static final int K = c(new byte[]{109, 111, 114, 120});
    public static final int L = c(new byte[]{111, 112, 98, 100});
    public static final int M = c(new byte[]{112, 114, 111, 112});
    public static final int N = c(new byte[]{70, 101, APDUConstants.TAG_MORE_DATA, 116});
    public static final int O = c(new byte[]{71, 108, APDUConstants.TAG_MORE_DATA, 116});
    public static final int P = c(new byte[]{71, 108, 111, 99});
    public static final int Q = c(new byte[]{83, 105, 108, 101});
    public static final int R = c(new byte[]{83, 105, 108, 102});
    public static final int S = c(new byte[]{98, 104, 101, 100});
    public static final int T = c(new byte[]{98, 100, APDUConstants.TAG_MORE_DATA, 116});
    public static final int U = c(new byte[]{98, 108, 111, 99});

    public static byte[] a(int i2) {
        return new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)};
    }

    public static int b(String str) {
        try {
            return c(str.substring(0, 4).getBytes("US-ASCII"));
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    public static int c(byte[] bArr) {
        return bArr[3] | (bArr[0] << 24) | (bArr[1] << 16) | (bArr[2] << 8);
    }

    public static boolean d(int i2) {
        return i2 == c || i2 == S;
    }

    public static String e(int i2) {
        try {
            return new String(a(i2), "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }
}
