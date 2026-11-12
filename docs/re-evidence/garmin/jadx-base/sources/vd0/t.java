package vd0;

import com.garmin.android.apps.connectmobile.dogs.presentation.AllDogsActivity;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AllDogsActivity f177382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f177383c;

    public /* synthetic */ t(AllDogsActivity allDogsActivity, long j8, int i14) {
        this.f177381a = i14;
        this.f177382b = allDogsActivity;
        this.f177383c = j8;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        int i14 = this.f177381a;
        long j8 = this.f177383c;
        AllDogsActivity allDogsActivity = this.f177382b;
        s9.g gVar = (s9.g) obj;
        switch (i14) {
            case 0:
                AllDogsActivity.a aVar = AllDogsActivity.f34686g;
                gVar.getClass();
                allDogsActivity.ea().x4(j8);
                return new AllDogsActivity.d(gVar);
            default:
                AllDogsActivity.a aVar2 = AllDogsActivity.f34686g;
                gVar.getClass();
                oe0.s sVarFa = allDogsActivity.fa();
                if (j8 != sVarFa.f131416l) {
                    p2 p2Var = sVarFa.f131410f;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, oe0.o.a((oe0.o) value, true, false, false, false, false, 254)));
                    ge1.b.T(androidx.lifecycle.v1.a(sVarFa), null, null, new oe0.r(sVarFa, j8, null), 3);
                }
                return new AllDogsActivity.e(gVar);
        }
    }
}
