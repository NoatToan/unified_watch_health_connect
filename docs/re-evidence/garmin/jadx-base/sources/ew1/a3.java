package ew1;

import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a3 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3 f66322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3 f66323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f66324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f66325e;

    public /* synthetic */ a3(b3 b3Var, g3 g3Var, p3.p1 p1Var, int i14, int i15) {
        this.f66321a = i15;
        this.f66322b = b3Var;
        this.f66323c = g3Var;
        this.f66324d = p1Var;
        this.f66325e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66321a;
        int i15 = this.f66325e;
        p3.p1<fg0.k> p1Var = this.f66324d;
        g3<fw1.a> g3Var = this.f66323c;
        b3 b3Var = this.f66322b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        b3.a aVar = b3.f66335d;
        switch (i14) {
            case 0:
                b3Var.y6(g3Var, p1Var, mVar, p3.p0.t(i15 | 1));
                break;
            default:
                b3Var.z6(g3Var, p1Var, mVar, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
