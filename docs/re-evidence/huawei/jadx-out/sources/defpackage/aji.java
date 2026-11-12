package defpackage;

import com.github.promeg.pinyinhelper.PinyinDict;
import com.github.promeg.pinyinhelper.SegmentationSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class aji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static List<PinyinDict> f476a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static zup f477c;
    static SegmentationSelector d;

    public static void c(b bVar) {
        if (bVar == null) {
            f476a = null;
            f477c = null;
            d = null;
        } else if (bVar.e()) {
            f476a = Collections.unmodifiableList(bVar.c());
            f477c = ajn.d(bVar.c());
            d = bVar.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b a() {
        return new b(null);
    }

    public static String b(String str, String str2) {
        return aje.a(str, f477c, f476a, str2, d);
    }

    public static String d(char c2) {
        if (!e(c2)) {
            return String.valueOf(c2);
        }
        if (c2 == 12295) {
            return "LING";
        }
        return ajm.f482a[a(c2)];
    }

    public static boolean e(char c2) {
        return (19968 <= c2 && c2 <= 40869 && a(c2) > 0) || 12295 == c2;
    }

    private static int a(char c2) {
        int i = c2 - 19968;
        if (i >= 0 && i < 7000) {
            return c(ajl.d, ajl.e, i);
        }
        if (7000 <= i && i < 14000) {
            return c(ajk.f480a, ajk.f481b, c2 - 26968);
        }
        return c(ajj.e, ajj.f479c, c2 - 33968);
    }

    private static short c(byte[] bArr, byte[] bArr2, int i) {
        short s = (short) (bArr2[i] & 255);
        return (bArr[i / 8] & ajm.f483c[i % 8]) != 0 ? (short) (s | 256) : s;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<PinyinDict> f478b;
        SegmentationSelector e;

        private b(List<PinyinDict> list) {
            if (list != null) {
                this.f478b = new ArrayList(list);
            }
            this.e = new ajg();
        }

        public b c(PinyinDict pinyinDict) {
            if (pinyinDict != null) {
                List<PinyinDict> list = this.f478b;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f478b = arrayList;
                    arrayList.add(pinyinDict);
                    return this;
                }
                if (!list.contains(pinyinDict)) {
                    this.f478b.add(pinyinDict);
                }
            }
            return this;
        }

        boolean e() {
            return (c() == null || b() == null) ? false : true;
        }

        SegmentationSelector b() {
            return this.e;
        }

        List<PinyinDict> c() {
            return this.f478b;
        }
    }
}
