package bv1;

import android.app.Activity;
import com.garmin.android.apps.connectmobile.e3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f21455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iw1.a f21456c;

    public /* synthetic */ x(Activity activity, iw1.a aVar, int i14) {
        this.f21454a = i14;
        this.f21455b = activity;
        this.f21456c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f21454a) {
            case 0:
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachWorkoutDetailsView");
                e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                iw1.a aVar = this.f21456c;
                e3Var.f(this.f21455b, aVar.I == m52.k.A, aVar.f95314b);
                break;
            default:
                rt1.l.f154545a.getClass();
                rt1.l.a("GarminCoachWorkoutDetailsView");
                e3 e3Var2 = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                iw1.a aVar2 = this.f21456c;
                e3Var2.f(this.f21455b, aVar2.I == m52.k.A, aVar2.f95314b);
                break;
        }
        return Unit.INSTANCE;
    }
}
