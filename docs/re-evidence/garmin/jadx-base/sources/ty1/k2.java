package ty1;

import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k2<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 f167161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<ww1.g, Unit> f167162b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167163a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f167163a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k2(com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var, e23.l<? super ww1.g, Unit> lVar) {
        this.f167161a = a0Var;
        this.f167162b = lVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        g3 g3Var = (g3) obj;
        if (g3Var != null) {
            int i14 = a.f167163a[g3Var.f35300a.ordinal()];
            com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var = this.f167161a;
            e23.l<ww1.g, Unit> lVar = this.f167162b;
            if (i14 == 1) {
                g22.e.f(a0Var);
                lVar.invoke((ww1.g) g3Var.f35301b);
            } else if (i14 == 2) {
                g22.e.f(a0Var);
                lVar.invoke(null);
            } else {
                if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                g22.e.l(a0Var);
            }
        }
        return Unit.INSTANCE;
    }
}
