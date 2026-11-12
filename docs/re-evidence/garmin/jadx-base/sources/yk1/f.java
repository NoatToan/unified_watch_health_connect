package yk1;

import androidx.lifecycle.j1;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import e23.l;
import java.util.List;
import lc.m0;
import lc.v;
import lc.y;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f197609b;

    public /* synthetic */ f(m0 m0Var, int i14) {
        this.f197608a = i14;
        this.f197609b = m0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        j1 j1VarA;
        int i14 = this.f197608a;
        m0 m0Var = this.f197609b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                StrideLengthSettingsActivity.a aVar = StrideLengthSettingsActivity.f44198b;
                str.getClass();
                y.k(str, m0Var);
                break;
            case 1:
                List list = (List) obj;
                list.getClass();
                v vVarF = m0Var.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(list, zq0.f.UPDATED_LIST_KEY.f206640a);
                }
                break;
            default:
                zq0.e eVar = (zq0.e) obj;
                eVar.getClass();
                y.l(m0Var, eVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
