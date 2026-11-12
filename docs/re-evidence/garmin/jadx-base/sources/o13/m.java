package o13;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/LazyKt")
public class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128589a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f128589a = iArr;
        }
    }

    public static <T> l<T> a(n nVar, e23.a<? extends T> aVar) {
        nVar.getClass();
        aVar.getClass();
        int i14 = a.f128589a[nVar.ordinal()];
        if (i14 == 1) {
            return new t(aVar, null, 2, null);
        }
        if (i14 == 2) {
            return new s(aVar);
        }
        if (i14 == 3) {
            return new e0(aVar);
        }
        u0.r();
        return null;
    }

    public static t b(e23.a aVar) {
        aVar.getClass();
        return new t(aVar, null, 2, null);
    }
}
