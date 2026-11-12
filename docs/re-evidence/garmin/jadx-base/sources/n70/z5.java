package n70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001B)\u0012 \u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln70/z5;", "Ln70/a0;", "Lr53/i;", "", "Lr70/s;", "Lo13/p;", "Lo70/y;", "Lj70/k$f;", "dashboardData", "<init>", "(Lr53/i;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z5 implements a0<r53.i<? extends List<? extends r70.s>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<o13.p<List<o70.y>, j70.k.f>> f124823a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124824a;

        static {
            int[] iArr = new int[o70.y.values().length];
            try {
                iArr[o70.y.JET_LAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.y.SLEEP_COACH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f124824a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z5(r53.i<? extends o13.p<? extends List<? extends o70.y>, j70.k.f>> iVar) {
        iVar.getClass();
        this.f124823a = iVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetTemporaryItemsUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends List<? extends r70.s>> invoke() {
        return r53.s.A(new a6(this.f124823a), o53.s0.f129406a);
    }
}
