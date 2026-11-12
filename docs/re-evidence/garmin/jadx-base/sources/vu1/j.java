package vu1;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FBTDashBoardActivity f180345b;

    public /* synthetic */ j(FBTDashBoardActivity fBTDashBoardActivity, int i14) {
        this.f180344a = i14;
        this.f180345b = fBTDashBoardActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f180344a;
        FBTDashBoardActivity fBTDashBoardActivity = this.f180345b;
        switch (i14) {
            case 0:
                FBTDashBoardActivity.a aVar = FBTDashBoardActivity.f45458n;
                p92.o oVar = p92.o.f136619a;
                q92.x xVar = q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
                oVar.getClass();
                q92.v vVarN = p92.o.n(xVar);
                if (!fBTDashBoardActivity.f45463i || vVarN == null || vVarN.b()) {
                    fBTDashBoardActivity.setResult(-1);
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("EXTRA_CLOSE_COACH_SCREEN", true);
                    fBTDashBoardActivity.setResult(-1, intent);
                }
                fBTDashBoardActivity.finish();
                break;
            default:
                FBTDashBoardActivity.a aVar2 = FBTDashBoardActivity.f45458n;
                fy1.i.f73924a.getClass();
                fy1.i.a.s(500L);
                p92.o oVar2 = p92.o.f136619a;
                q92.x xVar2 = q92.x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
                oVar2.getClass();
                q92.v vVarN2 = p92.o.n(xVar2);
                if (!fBTDashBoardActivity.f45463i || vVarN2 == null || vVarN2.b()) {
                    fBTDashBoardActivity.setResult(-1);
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("EXTRA_CLOSE_COACH_SCREEN", true);
                    fBTDashBoardActivity.setResult(-1, intent2);
                }
                fBTDashBoardActivity.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
