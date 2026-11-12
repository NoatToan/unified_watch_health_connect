package fa;

import android.annotation.SuppressLint;
import android.util.Pair;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.common.base.Ascii;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f70005a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f70006b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f70007c = Pattern.compile("^\\D?(\\d+)$");

    private d() {
    }

    public static String a(int i14, boolean z14, int i15, int i16, int[] iArr, int i17) {
        Object[] objArr = {f70006b[i14], Integer.valueOf(i15), Integer.valueOf(i16), Character.valueOf(z14 ? 'H' : 'L'), Integer.valueOf(i17)};
        int i18 = z.f70071a;
        StringBuilder sb3 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i19 = 0; i19 < length; i19++) {
            sb3.append(String.format(".%02X", Integer.valueOf(iArr[i19])));
        }
        return sb3.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair<Integer, Integer> b(String str, String[] strArr, androidx.media3.common.i iVar) {
        int i14;
        Integer numValueOf;
        if (strArr.length < 4) {
            k.g("Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        Matcher matcher = f70007c.matcher(strArr[1]);
        if (!matcher.matches()) {
            k.g("Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        byte b14 = 6;
        if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strGroup)) {
            i14 = 1;
        } else if ("2".equals(strGroup)) {
            i14 = (iVar == null || iVar.f8317c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                k.g("Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i14 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    b14 = !str2.equals("H30") ? (byte) -1 : (byte) 0;
                    break;
                case 70914:
                    b14 = !str2.equals("H60") ? (byte) -1 : (byte) 1;
                    break;
                case 70917:
                    b14 = !str2.equals("H63") ? (byte) -1 : (byte) 2;
                    break;
                case 71007:
                    b14 = !str2.equals("H90") ? (byte) -1 : (byte) 3;
                    break;
                case 71010:
                    b14 = !str2.equals("H93") ? (byte) -1 : (byte) 4;
                    break;
                case 74665:
                    b14 = !str2.equals("L30") ? (byte) -1 : (byte) 5;
                    break;
                case 74758:
                    if (!str2.equals("L60")) {
                        b14 = -1;
                    }
                    break;
                case 74761:
                    b14 = !str2.equals("L63") ? (byte) -1 : (byte) 7;
                    break;
                case 74851:
                    b14 = !str2.equals("L90") ? (byte) -1 : (byte) 8;
                    break;
                case 74854:
                    b14 = !str2.equals("L93") ? (byte) -1 : (byte) 9;
                    break;
                case 2193639:
                    b14 = !str2.equals("H120") ? (byte) -1 : (byte) 10;
                    break;
                case 2193642:
                    b14 = !str2.equals("H123") ? (byte) -1 : Ascii.VT;
                    break;
                case 2193732:
                    b14 = !str2.equals("H150") ? (byte) -1 : Ascii.FF;
                    break;
                case 2193735:
                    b14 = !str2.equals("H153") ? (byte) -1 : Ascii.CR;
                    break;
                case 2193738:
                    b14 = !str2.equals("H156") ? (byte) -1 : Ascii.SO;
                    break;
                case 2193825:
                    b14 = !str2.equals("H180") ? (byte) -1 : Ascii.SI;
                    break;
                case 2193828:
                    b14 = !str2.equals("H183") ? (byte) -1 : (byte) 16;
                    break;
                case 2193831:
                    b14 = !str2.equals("H186") ? (byte) -1 : (byte) 17;
                    break;
                case 2312803:
                    b14 = !str2.equals("L120") ? (byte) -1 : Ascii.DC2;
                    break;
                case 2312806:
                    b14 = !str2.equals("L123") ? (byte) -1 : (byte) 19;
                    break;
                case 2312896:
                    b14 = !str2.equals("L150") ? (byte) -1 : Ascii.DC4;
                    break;
                case 2312899:
                    b14 = !str2.equals("L153") ? (byte) -1 : Ascii.NAK;
                    break;
                case 2312902:
                    b14 = !str2.equals("L156") ? (byte) -1 : Ascii.SYN;
                    break;
                case 2312989:
                    b14 = !str2.equals("L180") ? (byte) -1 : Ascii.ETB;
                    break;
                case 2312992:
                    b14 = !str2.equals("L183") ? (byte) -1 : Ascii.CAN;
                    break;
                case 2312995:
                    b14 = !str2.equals("L186") ? (byte) -1 : Ascii.EM;
                    break;
                default:
                    b14 = -1;
                    break;
            }
            switch (b14) {
                case 0:
                    numValueOf = 2;
                    break;
                case 1:
                    numValueOf = 8;
                    break;
                case 2:
                    numValueOf = 32;
                    break;
                case 3:
                    numValueOf = 128;
                    break;
                case 4:
                    numValueOf = 512;
                    break;
                case 5:
                    numValueOf = 1;
                    break;
                case 6:
                    numValueOf = 4;
                    break;
                case 7:
                    numValueOf = 16;
                    break;
                case 8:
                    numValueOf = 64;
                    break;
                case 9:
                    numValueOf = 256;
                    break;
                case 10:
                    numValueOf = 2048;
                    break;
                case 11:
                    numValueOf = 8192;
                    break;
                case 12:
                    numValueOf = 32768;
                    break;
                case 13:
                    numValueOf = 131072;
                    break;
                case 14:
                    numValueOf = 524288;
                    break;
                case 15:
                    numValueOf = 2097152;
                    break;
                case 16:
                    numValueOf = 8388608;
                    break;
                case 17:
                    numValueOf = 33554432;
                    break;
                case 18:
                    numValueOf = 1024;
                    break;
                case 19:
                    numValueOf = 4096;
                    break;
                case 20:
                    numValueOf = 16384;
                    break;
                case 21:
                    numValueOf = 65536;
                    break;
                case 22:
                    numValueOf = Integer.valueOf(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                    break;
                case 23:
                    numValueOf = Integer.valueOf(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    break;
                case 24:
                    numValueOf = 4194304;
                    break;
                case 25:
                    numValueOf = Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair<>(Integer.valueOf(i14), numValueOf);
        }
        k.g("Unknown HEVC level string: " + str2);
        return null;
    }
}
