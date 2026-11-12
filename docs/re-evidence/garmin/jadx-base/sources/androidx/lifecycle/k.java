package androidx.lifecycle;

import com.garmin.android.apps.connectmobile.g3;
import java.util.List;
import mt0.i4;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f7949b;

    public /* synthetic */ k(w0 w0Var, int i14) {
        this.f7948a = i14;
        this.f7949b = w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        T t7;
        int i14 = this.f7948a;
        o13.u uVarD = null;
        w0 w0Var = this.f7949b;
        switch (i14) {
            case 0:
                w0Var.m(obj);
                return Unit.INSTANCE;
            case 1:
                w0Var.m(obj);
                return Unit.INSTANCE;
            case 2:
                w0Var.m((g3) obj);
                return Unit.INSTANCE;
            case 3:
                w0Var.m((g3) obj);
                return Unit.INSTANCE;
            case 4:
                fw.m mVar = (fw.m) obj;
                int i15 = cu0.i.f55582o;
                fw.p pVar = mVar.f73769b;
                iu0.d dVar = (iu0.d) mVar.f73770c;
                w0Var.m(new fw.m(null, pVar, dVar != null ? dVar.f95018a : null, null));
                return Unit.INSTANCE;
            case 5:
                g3 g3Var = (g3) obj;
                int i16 = com.garmin.android.apps.connectmobile.userprofile.i.I;
                o13.u uVar = (o13.u) w0Var.d();
                if (uVar != null) {
                    g3Var.getClass();
                    uVarD = o13.u.d(uVar, g3Var, null, null, 6);
                }
                w0Var.m(uVarD);
                return Unit.INSTANCE;
            case 6:
                g3 g3Var2 = (g3) obj;
                int i17 = com.garmin.android.apps.connectmobile.userprofile.i.I;
                o13.u uVar2 = (o13.u) w0Var.d();
                if (uVar2 != null) {
                    g3Var2.getClass();
                    uVarD = o13.u.d(uVar2, null, g3Var2, null, 5);
                }
                w0Var.m(uVarD);
                return Unit.INSTANCE;
            case 7:
                g3 g3Var3 = (g3) obj;
                int i18 = com.garmin.android.apps.connectmobile.userprofile.i.I;
                o13.u uVar3 = (o13.u) w0Var.d();
                if (uVar3 != null) {
                    g3Var3.getClass();
                    uVarD = o13.u.d(uVar3, null, null, g3Var3, 3);
                }
                w0Var.m(uVarD);
                return Unit.INSTANCE;
            case 8:
                return mr2.c.M4(w0Var, (List) obj);
            case 9:
                g3 g3Var4 = (g3) obj;
                i4.f120659a.debug("transformTeamChallengeData");
                if (g3Var4.f35300a == fw.p.SUCCESS && (t7 = g3Var4.f35301b) != 0) {
                    w0Var.m(t7);
                }
                return Unit.INSTANCE;
            case 10:
                com.garmin.android.apps.connectmobile.leaderboard.model.v vVarF = ((com.garmin.android.apps.connectmobile.leaderboard.model.h0) obj).f();
                if (w0Var.d() != vVarF) {
                    i4.f120659a.debug("transformTeamChallengeStatus: " + vVarF);
                    w0Var.m(vVarF);
                }
                return Unit.INSTANCE;
            case 11:
                int i19 = yo.e.f198230s;
                w0Var.j((o13.p) obj);
                return Unit.INSTANCE;
            default:
                w0Var.j(Boolean.valueOf(((List) obj).size() > 2));
                return Unit.INSTANCE;
        }
    }
}
