package h2;

import f5.v1;
import java.util.ArrayList;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81025a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f81026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f81027c;

    public /* synthetic */ y(ArrayList arrayList, p1 p1Var) {
        this.f81026b = arrayList;
        this.f81027c = p1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f81025a) {
            case 0:
                v1.a aVar = (v1.a) obj;
                com.garmin.android.apps.connectmobile.workouts.data.model.g0 g0Var = new com.garmin.android.apps.connectmobile.workouts.data.model.g0(4, this.f81026b);
                aVar.f69149a = true;
                g0Var.invoke(aVar);
                aVar.f69149a = false;
                this.f81027c.getF182175a();
                break;
            default:
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                sa0.b.C2989b c2989b = sa0.b.C2989b.f158163a;
                ArrayList arrayList = this.f81026b;
                f0Var.a(arrayList.size(), null, new sa0.b.c(c2989b, arrayList), new z3.e(802480018, true, new sa0.b.d(arrayList, arrayList, this.f81027c)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ y(p1 p1Var, ArrayList arrayList) {
        this.f81027c = p1Var;
        this.f81026b = arrayList;
    }
}
