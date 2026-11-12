package i10;

import android.view.MenuItem;
import android.widget.TextView;
import androidx.lifecycle.i0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.leaderboard.model.s;
import e23.l;
import i10.c.C1728c;
import lc.u0;
import mt0.x0;
import o53.c2;
import o53.f0;
import o53.s0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f87002b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f87001a = i14;
        this.f87002b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        x0 x0Var;
        int i14 = this.f87001a;
        c cVar = this.f87002b;
        switch (i14) {
            case 0:
                cVar.f87018y = ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            default:
                g3 g3Var = (g3) obj;
                c.a aVar = c.A;
                g3Var.getClass();
                if (!cVar.isAdded()) {
                    return Unit.INSTANCE;
                }
                int i15 = c.b.f87020a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    cVar.G6();
                } else if (i15 == 2) {
                    GroupChallengeDTO groupChallengeDTO = (GroupChallengeDTO) g3Var.f35301b;
                    cVar.f87012q = groupChallengeDTO;
                    if (groupChallengeDTO != null) {
                        c2 c2Var = cVar.f87017x;
                        if (c2Var != null) {
                            c2Var.c(null);
                        }
                        s sVar = groupChallengeDTO.f31514c;
                        if (sVar != null) {
                            switch (c.b.f87021b[sVar.ordinal()]) {
                                case 1:
                                    x0Var = x0.STEPS;
                                    break;
                                case 2:
                                    x0Var = x0.CALORIES_BURNED;
                                    break;
                                case 3:
                                    x0Var = x0.CYCLING;
                                    break;
                                case 4:
                                    x0Var = x0.SWIMMING;
                                    break;
                                case 5:
                                case 6:
                                case 7:
                                    x0Var = x0.RUNNING;
                                    break;
                                case 8:
                                    x0Var = x0.PARASPORTS;
                                    break;
                                case 9:
                                    x0Var = x0.PUSHES;
                                    break;
                                default:
                                    x0Var = x0.STEPS;
                                    break;
                            }
                        } else {
                            x0Var = x0.STEPS;
                        }
                        cVar.f87009n = x0Var;
                        a aVar2 = cVar.f87004i;
                        if (aVar2 != null) {
                            x0Var.getClass();
                            aVar2.f86999f = x0Var;
                        }
                        a aVar3 = cVar.f87004i;
                        if (aVar3 != null) {
                            yc.f.e eVar = aVar3.f196614b.f195910h;
                            eVar.getClass();
                            yc.g3.f195987a.getClass();
                            yc.g3.a(3);
                            eVar.f195738c.a();
                        }
                        i0 i0VarW = f0.w(cVar);
                        x53.c cVar2 = s0.f129406a;
                        cVar.f87017x = ge1.b.T(i0VarW, x53.b.f189152a, null, cVar.new C1728c(groupChallengeDTO, null), 2);
                        MenuItem menuItem = cVar.f87016w;
                        if (menuItem != null) {
                            menuItem.setVisible(true);
                        }
                        cVar.J6();
                        cVar.w6();
                    }
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    cVar.w6();
                    String strN = fb1.c.n("Get Challenge Detail failed with challenge id: ", cVar.f87010o);
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var, "GroupChallengeLeaderboardFragment", strN);
                    TextView textView = cVar.f87015v;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    cVar.F6(true);
                }
                return Unit.INSTANCE;
        }
    }
}
