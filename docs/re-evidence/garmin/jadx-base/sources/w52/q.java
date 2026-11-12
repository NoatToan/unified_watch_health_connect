package w52;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f182715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f182716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f182717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f182718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f182719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f182720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f182721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f182722i;

    public /* synthetic */ q(x0 x0Var, m52.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, boolean z14, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f182714a = 0;
        this.f182717d = x0Var;
        this.f182718e = kVar;
        this.f182719f = j0Var;
        this.f182715b = z14;
        this.f182720g = aVar;
        this.f182721h = aVar2;
        this.f182722i = aVar3;
        this.f182716c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f182714a) {
            case 0:
                ((Integer) obj2).intValue();
                r.c((x0) this.f182717d, (m52.k) this.f182718e, (com.garmin.android.apps.connectmobile.workouts.data.model.j0) this.f182719f, this.f182715b, (e23.a) this.f182720g, (e23.a) this.f182721h, (e23.a) this.f182722i, (p3.m) obj, p3.p0.t(this.f182716c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                yg2.q0.b((yg2.a) this.f182717d, (yg2.o) this.f182718e, (yg2.h0) this.f182719f, (yg2.u0) this.f182720g, (e2.i0) this.f182721h, (o53.b0) this.f182722i, this.f182715b, (p3.m) obj, iT, this.f182716c);
                break;
            case 2:
                ((Integer) obj2).intValue();
                yu1.i.b(this.f182715b, (com.garmin.android.apps.connectmobile.workouts.data.model.k) this.f182717d, (com.garmin.android.apps.connectmobile.workouts.data.model.c) this.f182718e, (com.garmin.android.apps.connectmobile.workouts.data.model.k) this.f182719f, (com.garmin.android.apps.connectmobile.workouts.data.model.c) this.f182720g, (com.garmin.android.apps.connectmobile.workouts.data.model.k) this.f182721h, (com.garmin.android.apps.connectmobile.workouts.data.model.c) this.f182722i, (p3.m) obj, p3.p0.t(this.f182716c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                yy1.v.f(this.f182715b, (AddTIEventViewModel) this.f182717d, (String) this.f182718e, (List) this.f182719f, (DateTime) this.f182720g, (my1.g) this.f182721h, (e23.p) this.f182722i, (p3.m) obj, p3.p0.t(this.f182716c | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q(yg2.a aVar, yg2.o oVar, yg2.h0 h0Var, yg2.u0 u0Var, e2.i0 i0Var, o53.b0 b0Var, boolean z14, int i14, int i15) {
        this.f182714a = 1;
        this.f182717d = aVar;
        this.f182718e = oVar;
        this.f182719f = h0Var;
        this.f182720g = u0Var;
        this.f182721h = i0Var;
        this.f182722i = b0Var;
        this.f182715b = z14;
        this.f182716c = i15;
    }

    public /* synthetic */ q(boolean z14, Object obj, Object obj2, Object obj3, Object obj4, Parcelable parcelable, Object obj5, int i14, int i15) {
        this.f182714a = i15;
        this.f182715b = z14;
        this.f182717d = obj;
        this.f182718e = obj2;
        this.f182719f = obj3;
        this.f182720g = obj4;
        this.f182721h = parcelable;
        this.f182722i = obj5;
        this.f182716c = i14;
    }
}
