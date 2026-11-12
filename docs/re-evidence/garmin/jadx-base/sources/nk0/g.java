package nk0;

import androidx.lifecycle.j1;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import java.util.ArrayList;
import java.util.List;
import jk0.x;
import lc.m0;
import lc.v;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f126392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GearActivity.w f126393c;

    public /* synthetic */ g(m0 m0Var, GearActivity.w wVar, int i14) {
        this.f126391a = i14;
        this.f126392b = m0Var;
        this.f126393c = wVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        j1 j1VarA;
        j1 j1VarA2;
        int i14 = this.f126391a;
        GearActivity.w wVar = this.f126393c;
        m0 m0Var = this.f126392b;
        switch (i14) {
            case 0:
                List list = (List) obj;
                GearActivity.a aVar = GearActivity.f35500b;
                list.getClass();
                v vVarF = m0Var.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(new ArrayList(list), "ManageCollectionGearScreen_SelectedGear");
                }
                wVar.invoke();
                break;
            default:
                x xVar = (x) obj;
                GearActivity.a aVar2 = GearActivity.f35500b;
                xVar.getClass();
                v vVarF2 = m0Var.f();
                if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                    j1VarA2.f(xVar, "EditGearScreen_Edited");
                }
                wVar.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
