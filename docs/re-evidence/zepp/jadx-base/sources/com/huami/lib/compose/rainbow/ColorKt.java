package com.huami.lib.compose.rainbow;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0002\u0018\u0002\n\u0003\b¬\u0001\"\u001c\u0010\u0005\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\b\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u001c\u0010\u000b\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001c\u0010\u000e\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u001c\u0010\u0011\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001c\u0010\u0014\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u001c\u0010\u0017\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u001c\u0010\u001a\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0004\"\u001c\u0010\u001d\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u001c\u0010 \u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u001c\u0010#\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u001c\u0010&\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004\"\u001c\u0010)\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0004\"\u001c\u0010,\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0004\"\u001c\u0010/\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0004\"\u001c\u00102\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b0\u0010\u0002\u001a\u0004\b1\u0010\u0004\"\u001c\u00105\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0004\"\u001c\u00108\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b6\u0010\u0002\u001a\u0004\b7\u0010\u0004\"\u001c\u0010;\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0004\"\u001c\u0010>\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b<\u0010\u0002\u001a\u0004\b=\u0010\u0004\"\u001c\u0010A\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0004\"\u001c\u0010D\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bB\u0010\u0002\u001a\u0004\bC\u0010\u0004\"\u001c\u0010G\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\u0004\"\u001c\u0010J\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u0004\"\u001c\u0010M\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\u0004\"\u001c\u0010P\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bN\u0010\u0002\u001a\u0004\bO\u0010\u0004\"\u001c\u0010S\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bQ\u0010\u0002\u001a\u0004\bR\u0010\u0004\"\u001c\u0010V\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bT\u0010\u0002\u001a\u0004\bU\u0010\u0004\"\u001c\u0010Y\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bW\u0010\u0002\u001a\u0004\bX\u0010\u0004\"\u001c\u0010\\\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bZ\u0010\u0002\u001a\u0004\b[\u0010\u0004\"\u001c\u0010_\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b]\u0010\u0002\u001a\u0004\b^\u0010\u0004\"\u001c\u0010b\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b`\u0010\u0002\u001a\u0004\ba\u0010\u0004\"\u001c\u0010e\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bc\u0010\u0002\u001a\u0004\bd\u0010\u0004\"\u001c\u0010h\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bf\u0010\u0002\u001a\u0004\bg\u0010\u0004\"\u001c\u0010k\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bi\u0010\u0002\u001a\u0004\bj\u0010\u0004\"\u001c\u0010m\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0002\u0010\u0002\u001a\u0004\bl\u0010\u0004\"\u001c\u0010p\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bn\u0010\u0002\u001a\u0004\bo\u0010\u0004\"\u001c\u0010s\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bq\u0010\u0002\u001a\u0004\br\u0010\u0004\"\u001c\u0010v\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bt\u0010\u0002\u001a\u0004\bu\u0010\u0004\"\u001c\u0010y\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bw\u0010\u0002\u001a\u0004\bx\u0010\u0004\"\u001c\u0010|\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bz\u0010\u0002\u001a\u0004\b{\u0010\u0004\"\u001c\u0010\u007f\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b}\u0010\u0002\u001a\u0004\b~\u0010\u0004\"\u001f\u0010\u0082\u0001\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0002\u001a\u0005\b\u0081\u0001\u0010\u0004\"\u001f\u0010\u0085\u0001\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0002\u001a\u0005\b\u0084\u0001\u0010\u0004\"\u001f\u0010\u0088\u0001\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0002\u001a\u0005\b\u0087\u0001\u0010\u0004\"\u001f\u0010\u008b\u0001\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0002\u001a\u0005\b\u008a\u0001\u0010\u0004\"\u001f\u0010\u008e\u0001\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0002\u001a\u0005\b\u008d\u0001\u0010\u0004\"\u001f\u0010\u0091\u0001\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0002\u001a\u0005\b\u0090\u0001\u0010\u0004\"\u001f\u0010\u0094\u0001\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0002\u001a\u0005\b\u0093\u0001\u0010\u0004\"\u001f\u0010\u0097\u0001\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0002\u001a\u0005\b\u0096\u0001\u0010\u0004\"\u001f\u0010\u009a\u0001\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\u0002\u001a\u0005\b\u0099\u0001\u0010\u0004\"\u001f\u0010\u009d\u0001\u001a\u00020\u00008\u0006@\u0006ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0002\u001a\u0005\b\u009c\u0001\u0010\u0004\"\u0018\u0010\u009f\u0001\u001a\u00020\u00008F@\u0006ø\u0001\u0000¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\u0004\"\u0018\u0010¡\u0001\u001a\u00020\u00008F@\u0006ø\u0001\u0000¢\u0006\u0007\u001a\u0005\b \u0001\u0010\u0004\"\u0018\u0010£\u0001\u001a\u00020\u00008F@\u0006ø\u0001\u0000¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010\u0004\"\u0018\u0010¥\u0001\u001a\u00020\u00008F@\u0006ø\u0001\u0000¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\u0004\"\u0018\u0010§\u0001\u001a\u00020\u00008F@\u0006ø\u0001\u0000¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010\u0004\"\u0018\u0010©\u0001\u001a\u00020\u00008F@\u0006ø\u0001\u0000¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010\u0004\"\u0018\u0010«\u0001\u001a\u00020\u00008F@\u0006ø\u0001\u0000¢\u0006\u0007\u001a\u0005\bª\u0001\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006¬\u0001"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "a", "J", "getP2", "()J", "p2", "b", "getP3_light", "p3_light", "c", "getP3_night", "p3_night", GoogleApiAvailabilityLight.a, "getP4", "p4", "e", "getP5", "p5", "f", "getP6", "p6", "g", "getP51", "p51", "h", "getS1_light", "s1_light", "i", "getS1_night", "s1_night", z.j, "getS2_light", "s2_light", hl.k, "getS2_night", "s2_night", "l", "getS3", "s3", "m", "getS4_light", "s4_light", GoogleApiAvailabilityLight.b, "getS4_night", "s4_night", "o", "getS5", "s5", b.r, "getS10_light", "s10_light", DTransferConstants.SEARCH_KEY, "getS10_night", "s10_night", "r", "getS14", "s14", SOAP.XMLNS, "getS15", "s15", "t", "getS16", "s16", "u", "getS17", "s17", "v", "getS19", "s19", "w", "getS20", "s20", "x", "getS21", "s21", "y", "getS22", "s22", "z", "getS23", "s23", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getS24", "s24", "B", "getS25", "s25", "C", "getS26", "s26", LogUtil.D, "getS27", "s27", "E", "getS29", "s29", "F", "getS30", "s30", "G", "getS31", "s31", "H", "getS32", "s32", LogUtil.I, "getS33", "s33", "getS34", "s34", "K", "getS36", "s36", "L", "getS38_light", "s38_light", "M", "getS38_night", "s38_night", "N", "getS39_light", "s39_light", "O", "getS39_night", "s39_night", "P", "getS40", "s40", "Q", "getS41", "s41", "R", "getS42", "s42", ExifInterface.LATITUDE_SOUTH, "getS43", "s43", ExifInterface.GPS_DIRECTION_TRUE, "getS44", "s44", "U", "getS45", "s45", "V", "getS46", "s46", "W", "getS50", "s50", "X", "getS51", "s51", "Y", "getS52", "s52", "Z", "getS53", "s53", "getP3", "p3", "getS1", "s1", "getS2", "s2", "getS4", "s4", "getS10", "s10", "getS38", "s38", "getS39", "s39", "rainbow_release"}, k = 2, mv = {1, 5, 1})
public final class ColorKt {
    private static final long a = androidx.compose.ui.graphics.ColorKt.Color(4292819764L);
    private static final long b = androidx.compose.ui.graphics.ColorKt.Color(4294924368L);
    private static final long c = androidx.compose.ui.graphics.ColorKt.Color(4292819764L);
    private static final long d = androidx.compose.ui.graphics.ColorKt.Color(4294600801L);
    private static final long e = androidx.compose.ui.graphics.ColorKt.Color(4294676105L);
    private static final long f = androidx.compose.ui.graphics.ColorKt.Color(4278366093L);
    private static final long g = androidx.compose.ui.graphics.ColorKt.Color(4294924368L);
    private static final long h = androidx.compose.ui.graphics.ColorKt.Color(4279834905L);
    private static final long i = androidx.compose.ui.graphics.ColorKt.Color(4293454057L);
    private static final long j = androidx.compose.ui.graphics.ColorKt.Color(4284900966L);
    private static final long k = androidx.compose.ui.graphics.ColorKt.Color(4288980389L);
    private static final long l = androidx.compose.ui.graphics.ColorKt.Color(4289901234L);
    private static final long m = androidx.compose.ui.graphics.ColorKt.Color(4294111986L);
    private static final long n = androidx.compose.ui.graphics.ColorKt.Color(4281874746L);
    private static final long o = androidx.compose.ui.graphics.ColorKt.Color(4294967295L);
    private static final long p = androidx.compose.ui.graphics.ColorKt.Color(4293388781L);
    private static final long q = androidx.compose.ui.graphics.ColorKt.Color(4279505940L);
    private static final long r = androidx.compose.ui.graphics.ColorKt.Color(4278226885L);
    private static final long s = androidx.compose.ui.graphics.ColorKt.Color(4278231260L);
    private static final long t = androidx.compose.ui.graphics.ColorKt.Color(4281578467L);
    private static final long u = androidx.compose.ui.graphics.ColorKt.Color(4284925674L);
    private static final long v = androidx.compose.ui.graphics.ColorKt.Color(4278230650L);
    private static final long w = androidx.compose.ui.graphics.ColorKt.Color(4278366093L);
    private static final long x = androidx.compose.ui.graphics.ColorKt.Color(4281581728L);
    private static final long y = androidx.compose.ui.graphics.ColorKt.Color(4284928184L);
    private static final long z = androidx.compose.ui.graphics.ColorKt.Color(4278366093L);
    private static final long A = androidx.compose.ui.graphics.ColorKt.Color(4287124962L);
    private static final long B = androidx.compose.ui.graphics.ColorKt.Color(4288176124L);
    private static final long C = androidx.compose.ui.graphics.ColorKt.Color(4289560573L);
    private static final long D = androidx.compose.ui.graphics.ColorKt.Color(4290879485L);
    private static final long E = androidx.compose.ui.graphics.ColorKt.Color(4293351424L);
    private static final long F = androidx.compose.ui.graphics.ColorKt.Color(4294339093L);
    private static final long G = androidx.compose.ui.graphics.ColorKt.Color(4294937670L);
    private static final long H = androidx.compose.ui.graphics.ColorKt.Color(4294945399L);
    private static final long I = androidx.compose.ui.graphics.ColorKt.Color(4294945539L);
    private static final long J = androidx.compose.ui.graphics.ColorKt.Color(4294954344L);
    private static final long K = androidx.compose.ui.graphics.ColorKt.Color(4294967295L);
    private static final long L = androidx.compose.ui.graphics.ColorKt.Color(4294967295L);
    private static final long M = androidx.compose.ui.graphics.ColorKt.Color(4280098335L);
    private static final long N = androidx.compose.ui.graphics.ColorKt.Color(4294967295L);
    private static final long O = androidx.compose.ui.graphics.ColorKt.Color(4281216816L);
    private static final long P = androidx.compose.ui.graphics.ColorKt.Color(4281216816L);
    private static final long Q = androidx.compose.ui.graphics.ColorKt.Color(4281299669L);
    private static final long R = androidx.compose.ui.graphics.ColorKt.Color(4294954186L);
    private static final long S = androidx.compose.ui.graphics.ColorKt.Color(4288931028L);
    private static final long T = androidx.compose.ui.graphics.ColorKt.Color(4278190080L);
    private static final long U = androidx.compose.ui.graphics.ColorKt.Color(4279834905L);
    private static final long V = androidx.compose.ui.graphics.ColorKt.Color(4289901234L);
    private static final long W = androidx.compose.ui.graphics.ColorKt.Color(4292819764L);
    private static final long X = androidx.compose.ui.graphics.ColorKt.Color(4294924368L);
    private static final long Y = androidx.compose.ui.graphics.ColorKt.Color(4294600801L);
    private static final long Z = androidx.compose.ui.graphics.ColorKt.Color(4294676105L);

    public static final long getP2() {
        return a;
    }

    public static final long getP3() {
        return ThemeKt.isDarkModeTheme() ? c : b;
    }

    public static final long getP3_light() {
        return b;
    }

    public static final long getP3_night() {
        return c;
    }

    public static final long getP4() {
        return d;
    }

    public static final long getP5() {
        return e;
    }

    public static final long getP51() {
        return g;
    }

    public static final long getP6() {
        return f;
    }

    public static final long getS1() {
        return ThemeKt.isDarkModeTheme() ? i : h;
    }

    public static final long getS10() {
        return ThemeKt.isDarkModeTheme() ? q : p;
    }

    public static final long getS10_light() {
        return p;
    }

    public static final long getS10_night() {
        return q;
    }

    public static final long getS14() {
        return r;
    }

    public static final long getS15() {
        return s;
    }

    public static final long getS16() {
        return t;
    }

    public static final long getS17() {
        return u;
    }

    public static final long getS19() {
        return v;
    }

    public static final long getS1_light() {
        return h;
    }

    public static final long getS1_night() {
        return i;
    }

    public static final long getS2() {
        return ThemeKt.isDarkModeTheme() ? k : j;
    }

    public static final long getS20() {
        return w;
    }

    public static final long getS21() {
        return x;
    }

    public static final long getS22() {
        return y;
    }

    public static final long getS23() {
        return z;
    }

    public static final long getS24() {
        return A;
    }

    public static final long getS25() {
        return B;
    }

    public static final long getS26() {
        return C;
    }

    public static final long getS27() {
        return D;
    }

    public static final long getS29() {
        return E;
    }

    public static final long getS2_light() {
        return j;
    }

    public static final long getS2_night() {
        return k;
    }

    public static final long getS3() {
        return l;
    }

    public static final long getS30() {
        return F;
    }

    public static final long getS31() {
        return G;
    }

    public static final long getS32() {
        return H;
    }

    public static final long getS33() {
        return I;
    }

    public static final long getS34() {
        return J;
    }

    public static final long getS36() {
        return K;
    }

    public static final long getS38() {
        return ThemeKt.isDarkModeTheme() ? M : L;
    }

    public static final long getS38_light() {
        return L;
    }

    public static final long getS38_night() {
        return M;
    }

    public static final long getS39() {
        return ThemeKt.isDarkModeTheme() ? O : N;
    }

    public static final long getS39_light() {
        return N;
    }

    public static final long getS39_night() {
        return O;
    }

    public static final long getS4() {
        return ThemeKt.isDarkModeTheme() ? n : m;
    }

    public static final long getS40() {
        return P;
    }

    public static final long getS41() {
        return Q;
    }

    public static final long getS42() {
        return R;
    }

    public static final long getS43() {
        return S;
    }

    public static final long getS44() {
        return T;
    }

    public static final long getS45() {
        return U;
    }

    public static final long getS46() {
        return V;
    }

    public static final long getS4_light() {
        return m;
    }

    public static final long getS4_night() {
        return n;
    }

    public static final long getS5() {
        return o;
    }

    public static final long getS50() {
        return W;
    }

    public static final long getS51() {
        return X;
    }

    public static final long getS52() {
        return Y;
    }

    public static final long getS53() {
        return Z;
    }
}
