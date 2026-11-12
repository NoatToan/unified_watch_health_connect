package f1;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.impl.f1;
import b0.b0;
import b0.g1;
import b0.t0;
import b1.i;
import com.google.android.exoplayer2.util.MimeTypes;
import g1.e0;
import j20.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k7.h;
import z0.p0;
import z0.q;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f67787a;

    static {
        HashMap map = new HashMap();
        f67787a = map;
        HashMap map2 = new HashMap();
        g1.e eVar = e0.f74699a;
        map2.put(1, eVar);
        g1.e eVar2 = e0.f74702d;
        map2.put(2, eVar2);
        g1.e eVar3 = e0.f74703e;
        map2.put(4096, eVar3);
        map2.put(8192, eVar3);
        HashMap map3 = new HashMap();
        map3.put(1, eVar);
        map3.put(2, eVar2);
        map3.put(4096, eVar3);
        map3.put(8192, eVar3);
        HashMap map4 = new HashMap();
        map4.put(1, eVar);
        map4.put(4, eVar2);
        map4.put(4096, eVar3);
        map4.put(16384, eVar3);
        map4.put(2, eVar);
        map4.put(8, eVar2);
        map4.put(8192, eVar3);
        map4.put(32768, eVar3);
        HashMap map5 = new HashMap();
        map5.put(256, eVar2);
        map5.put(512, e0.f74700b);
        map.put(MimeTypes.VIDEO_H265, map2);
        map.put(MimeTypes.VIDEO_AV1, map3);
        map.put(MimeTypes.VIDEO_VP9, map4);
        map.put(MimeTypes.VIDEO_DOLBY_VISION, map5);
    }

    private d() {
    }

    public static e0 a(int i14, String str) {
        e0 e0Var;
        Map map = (Map) f67787a.get(str);
        if (map != null && (e0Var = (e0) map.get(Integer.valueOf(i14))) != null) {
            return e0Var;
        }
        String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i14));
        return e0.f74699a;
    }

    public static b b(p0 p0Var, Range<Integer> range) {
        Range<Integer> range2 = g1.f13904q;
        int iIntValue = range2.equals(range) ? 30 : ((Integer) range.getUpper()).intValue();
        int iD = p0Var.d() != 0 ? p0Var.d() : iIntValue;
        Locale locale = Locale.ENGLISH;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iD);
        boolean zEquals = range2.equals(range);
        Object obj = range;
        if (zEquals) {
            obj = "<UNSPECIFIED>";
        }
        String.format(locale, "Resolved capture/encode frame rate %dfps/%dfps, [Expected operating range: %s]", numValueOf, numValueOf2, obj);
        return new b(iIntValue, iD);
    }

    public static a c(q qVar, b0 b0Var, i iVar) {
        f1.c next;
        boolean zB = b0Var.b();
        int i14 = b0Var.f13860a;
        h.f(zB, "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + b0Var + "]");
        int iC = qVar.c();
        String str = MimeTypes.VIDEO_H264;
        String str2 = iC != 1 ? MimeTypes.VIDEO_H264 : MimeTypes.VIDEO_VP8;
        if (iVar == null) {
            next = null;
        } else {
            Set set = (Set) h1.b.f80734b.get(Integer.valueOf(i14));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) h1.b.f80733a.get(Integer.valueOf(b0Var.f13861b));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            Iterator<f1.c> it = ((b1.a) iVar).f14185d.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (set.contains(Integer.valueOf(next.f())) && set2.contains(Integer.valueOf(next.a()))) {
                        String strH = next.h();
                        if (!str2.equals(strH)) {
                            if (qVar.c() == -1) {
                                b0Var.toString();
                            }
                        }
                        str2 = strH;
                    }
                } else {
                    next = null;
                }
            }
        }
        if (next == null) {
            if (qVar.c() == -1) {
                if (i14 != 1) {
                    if (i14 == 3 || i14 == 4 || i14 == 5) {
                        str = MimeTypes.VIDEO_H265;
                    } else {
                        if (i14 != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + b0Var + "\nNo supported default mime type available.");
                        }
                        str = MimeTypes.VIDEO_DOLBY_VISION;
                    }
                }
                str2 = str;
            }
            if (iVar == null) {
                b0Var.toString();
            } else {
                b0Var.toString();
            }
        }
        a.b bVar = new a.b();
        if (str2 == null) {
            x.l("Null mimeType");
            return null;
        }
        bVar.f67782a = str2;
        bVar.f67783b = -1;
        if (next != null) {
            bVar.f67784c = next;
        }
        String str3 = bVar.f67782a == null ? " mimeType" : "";
        if (str3.isEmpty()) {
            return new a(bVar.f67782a, bVar.f67783b.intValue(), bVar.f67784c);
        }
        vb.h.z("Missing required properties:".concat(str3));
        return null;
    }

    public static int d(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, Range<Integer> range) {
        Rational rational = new Rational(i15, i16);
        Rational rational2 = new Rational(i17, i18);
        Rational rational3 = new Rational(i19, i24);
        Rational rational4 = new Rational(i25, i26);
        int iDoubleValue = (int) (rational4.doubleValue() * rational3.doubleValue() * rational2.doubleValue() * rational.doubleValue() * ((double) i14));
        if (t0.a(3, "VideoConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(i19), Integer.valueOf(i24), Integer.valueOf(i25), Integer.valueOf(i26), Integer.valueOf(iDoubleValue));
        }
        if (p0.f200704a.equals(range)) {
            return iDoubleValue;
        }
        Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
        int iIntValue = num.intValue();
        if (t0.a(3, "VideoConfigUtil")) {
            String.format("\nClamped to range %s -> %dbps", range, num);
        }
        return iIntValue;
    }
}
