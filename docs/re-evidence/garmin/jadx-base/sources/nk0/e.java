package nk0;

import androidx.lifecycle.j1;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import lc.m0;
import lc.v;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f126387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GearActivity.w f126388c;

    public /* synthetic */ e(m0 m0Var, GearActivity.w wVar, int i14) {
        this.f126386a = i14;
        this.f126387b = m0Var;
        this.f126388c = wVar;
    }

    @Override // e23.a
    public final Object invoke() {
        j1 j1VarA;
        j1 j1VarA2;
        int i14 = this.f126386a;
        GearActivity.w wVar = this.f126388c;
        m0 m0Var = this.f126387b;
        switch (i14) {
            case 0:
                GearActivity.a aVar = GearActivity.f35500b;
                v vVarF = m0Var.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(Boolean.TRUE, "EditCollectionScreen_Edited");
                }
                wVar.invoke();
                break;
            default:
                GearActivity.a aVar2 = GearActivity.f35500b;
                v vVarF2 = m0Var.f();
                if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                    j1VarA2.f(Boolean.TRUE, "CollectionDetailsScreen_Edited");
                }
                wVar.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
