package mt0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 f120951b;

    public /* synthetic */ z2(com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 h0Var, int i14) {
        this.f120950a = i14;
        this.f120951b = h0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        String string;
        int i14 = this.f120950a;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 h0Var = this.f120951b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                Bundle arguments = h0Var.getArguments();
                return (arguments == null || (string = arguments.getString("GCM_userDisplayName")) == null) ? "" : string;
            default:
                f.c<Intent> cVar = h0Var.f37569n;
                ub1.g gVar = (ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null);
                Context contextRequireContext = h0Var.requireContext();
                contextRequireContext.getClass();
                cVar.a(gVar.g(contextRequireContext, c80.q.SOCIAL, false), null);
                return Unit.INSTANCE;
        }
    }
}
