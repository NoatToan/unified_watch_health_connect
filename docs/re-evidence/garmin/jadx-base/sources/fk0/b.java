package fk0;

import ak0.d0;
import ak0.e0;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gcplus.presentation.home.e;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f71928b;

    public /* synthetic */ b(e eVar, int i14) {
        this.f71927a = i14;
        this.f71928b = eVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f71927a) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                e eVar = this.f71928b;
                eVar.getClass();
                a2 a2Var = a2.SUBSCRIPTIONS;
                String strH = com.airbnb.lottie.animation.keyframe.a.h("Setting home screen insights to ", zBooleanValue);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "GCPlusHomeViewModel", strH);
                p2 p2Var = eVar.f35424r;
                g3.f35298f.getClass();
                p2Var.k(null, g3.a.b(bool));
                ge1.b.T(v1.a(eVar), null, null, new e0(eVar, zBooleanValue, null), 3);
                break;
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                e eVar2 = this.f71928b;
                p2 p2Var2 = eVar2.f35426v;
                g3.f35298f.getClass();
                p2Var2.k(null, g3.a.b(bool));
                ge1.b.T(v1.a(eVar2), null, null, new d0(eVar2, zBooleanValue2, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
