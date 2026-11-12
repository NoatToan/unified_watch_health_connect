package ty1;

import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.a f167153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<ww1.g, Unit> f167154b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f167155a;

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
            f167155a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar, e23.l<? super ww1.g, Unit> lVar) {
        this.f167153a = aVar;
        this.f167154b = lVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        g3 g3Var = (g3) obj;
        if (g3Var != null) {
            int i14 = a.f167155a[g3Var.f35300a.ordinal()];
            com.garmin.android.apps.connectmobile.traininginitiative.ui.a aVar = this.f167153a;
            e23.l<ww1.g, Unit> lVar = this.f167154b;
            if (i14 == 1) {
                g22.e.f(aVar);
                lVar.invoke((ww1.g) g3Var.f35301b);
            } else if (i14 == 2) {
                g22.e.f(aVar);
                lVar.invoke(null);
            } else {
                if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                g22.e.l(aVar);
            }
        }
        return Unit.INSTANCE;
    }
}
