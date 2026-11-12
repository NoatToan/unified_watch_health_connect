package c42;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import c22.s3;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.NewCreateChallengeActivity;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.q f24387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f24388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f24389d;

    public /* synthetic */ f(c.q qVar, Context context, p1 p1Var, int i14) {
        this.f24386a = i14;
        this.f24387b = qVar;
        this.f24389d = context;
        this.f24388c = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f24386a;
        p1 p1Var = this.f24388c;
        Context context = this.f24389d;
        c.q qVar = this.f24387b;
        switch (i14) {
            case 0:
                p1Var.setValue(Boolean.FALSE);
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                qVar.a(intent, null);
                break;
            case 1:
                p1Var.setValue(Boolean.FALSE);
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
                qVar.a(intent2, null);
                break;
            case 2:
                p1Var.setValue(Boolean.FALSE);
                Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent3.setData(Uri.fromParts("package", context.getApplicationContext().getPackageName(), null));
                qVar.a(intent3, null);
                break;
            case 3:
                p1Var.setValue(Boolean.FALSE);
                Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent4.setData(Uri.fromParts("package", context.getApplicationContext().getPackageName(), null));
                qVar.a(intent4, null);
                break;
            default:
                int i15 = wt0.h.f187018c;
                if (s3.b()) {
                    p1Var.setValue(Boolean.TRUE);
                } else {
                    NewCreateChallengeActivity.f37257f.getClass();
                    context.getClass();
                    qVar.a(new Intent(context, (Class<?>) NewCreateChallengeActivity.class), null);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(c.q qVar, p1 p1Var, Context context, int i14) {
        this.f24386a = i14;
        this.f24387b = qVar;
        this.f24388c = p1Var;
        this.f24389d = context;
    }
}
