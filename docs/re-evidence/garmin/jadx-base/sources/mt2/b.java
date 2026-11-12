package mt2;

import lc.u0;
import o73.u;
import o73.v;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt2/b;", "", "<init>", "(Ljava/lang/String;I)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum b {
    ABOVE,
    BELOW;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120996a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ABOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.BELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f120996a = iArr;
        }
    }

    public final Object a(v13.c cVar) {
        int i14 = a.f120996a[ordinal()];
        if (i14 == 1) {
            kt2.f.f106534a.getClass();
            kt2.e.f106460a.getClass();
            return v.a((u) kt2.e.f106468c1.getValue(), cVar);
        }
        if (i14 != 2) {
            u0.r();
            return null;
        }
        kt2.f.f106534a.getClass();
        kt2.e.f106460a.getClass();
        return v.a((u) kt2.e.f106471d1.getValue(), cVar);
    }
}
