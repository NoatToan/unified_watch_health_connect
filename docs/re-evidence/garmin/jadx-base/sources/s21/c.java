package s21;

import c22.g2;
import c22.x0;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls21/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    TIMELINE,
    CLASSIC;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f156079a = new a(null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156083a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.TIMELINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.CLASSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f156083a = iArr;
        }
    }

    public final g2 a() {
        int i14 = b.f156083a[ordinal()];
        if (i14 == 1) {
            x0.f23314a.getClass();
            return g2.b(x0.Oe);
        }
        if (i14 == 2) {
            x0.f23314a.getClass();
            return g2.b(x0.f23530me);
        }
        u0.r();
        return null;
    }

    public final l01.e b() {
        int i14 = b.f156083a[ordinal()];
        if (i14 == 1) {
            return l01.e.TIMELINE;
        }
        if (i14 == 2) {
            return l01.e.CLASSICAL;
        }
        u0.r();
        return null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls21/c$a;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(l01.e eVar, boolean z14) {
            return (z14 && eVar == l01.e.CLASSICAL) ? c.CLASSIC : c.TIMELINE;
        }

        private a() {
        }
    }
}
