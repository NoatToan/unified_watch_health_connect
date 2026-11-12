package vd0;

import com.garmin.android.apps.connectmobile.dogs.presentation.AllDogsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AllDogsActivity f177390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f177391c;

    public /* synthetic */ u(AllDogsActivity allDogsActivity, long j8, int i14) {
        this.f177389a = i14;
        this.f177390b = allDogsActivity;
        this.f177391c = j8;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f177389a;
        long j8 = this.f177391c;
        AllDogsActivity allDogsActivity = this.f177390b;
        switch (i14) {
            case 0:
                lc.m0 m0Var = allDogsActivity.f34692f;
                if (m0Var != null) {
                    lc.y.l(m0Var, new xd0.a.i(j8));
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("navController");
                throw null;
            case 1:
                AllDogsActivity.a aVar = AllDogsActivity.f34686g;
                allDogsActivity.ea().x4(j8);
                return Unit.INSTANCE;
            default:
                lc.m0 m0Var2 = allDogsActivity.f34692f;
                if (m0Var2 != null) {
                    lc.y.l(m0Var2, new xd0.a.j(j8));
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("navController");
                throw null;
        }
    }
}
