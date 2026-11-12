package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class s0b {

    public enum a {
        numberOfContours(0),
        headerEnd(10),
        compositeFlags(0),
        compositeGlyphIndex(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33128a;

        a(int i) {
            this.f33128a = i;
        }
    }

    public static int a(int i) {
        int i2 = (i & 1) != 0 ? 8 : 6;
        if ((i & 8) != 0) {
            return i2 + 2;
        }
        if ((i & 64) != 0) {
            return i2 + 4;
        }
        return (i & 128) != 0 ? i2 + 8 : i2;
    }

    public static boolean b(jgj jgjVar) {
        return jgjVar.e() > 0 && jgjVar.r(a.numberOfContours.f33128a) < 0;
    }

    public static jgj c(jgj jgjVar, Map<Integer, Integer> map) {
        apr aprVarC = apr.C(jgjVar.e());
        jgjVar.j(aprVarC);
        int iA = a.headerEnd.f33128a;
        int iV = 32;
        while ((iV & 32) != 0) {
            iV = jgjVar.v(a.compositeFlags.f33128a + iA);
            a aVar = a.compositeGlyphIndex;
            aprVarC.Q(aVar.f33128a + iA, map.get(Integer.valueOf(jgjVar.v(aVar.f33128a + iA))).intValue());
            iA += a(iV);
        }
        return aprVarC;
    }

    public static jgj d(jgj jgjVar, Map<Integer, Integer> map) {
        return b(jgjVar) ? c(jgjVar, map) : jgjVar;
    }
}
