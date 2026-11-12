package op0;

import f12.l;
import gg1.n;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lop0/b;", "", "<init>", "()V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f133168a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lop0/b$a;", "", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: op0.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2528a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f133169a;

            static {
                int[] iArr = new int[n.values().length];
                try {
                    iArr[n.CUP_US.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n.METRIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n.OUNCE_US.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f133169a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static q22.b a(n nVar) {
            nVar.getClass();
            int i14 = C2528a.f133169a[nVar.ordinal()];
            if (i14 == 1) {
                return q22.b.CUP;
            }
            if (i14 == 2) {
                return q22.b.MILLILITER;
            }
            if (i14 == 3) {
                return q22.b.FLUID_OUNCE;
            }
            u0.r();
            return null;
        }

        public static /* synthetic */ q22.b b(a aVar) {
            n nVarD0 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).d0();
            aVar.getClass();
            return a(nVarD0);
        }

        private a() {
        }
    }
}
