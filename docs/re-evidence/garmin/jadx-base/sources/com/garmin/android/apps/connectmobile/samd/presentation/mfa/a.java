package com.garmin.android.apps.connectmobile.samd.presentation.mfa;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import h7.c;
import o13.p;
import p005kotlin.Metadata;
import rf1.b;
import sz0.e;
import sz0.f;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/samd/presentation/mfa/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41187a;

    public a(Context context) {
        context.getClass();
        this.f41187a = context;
    }

    public final void a(b bVar, boolean z14) {
        if (bVar != b.ECG) {
            if (bVar != null) {
                return;
            }
            bv.b.f21239a.getClass();
            bv.b.a();
            if (!k1.f37122a.W()) {
                return;
            }
        }
        MfaSetupActivity.f41181c.getClass();
        Context context = this.f41187a;
        Intent intent = new Intent(context, (Class<?>) MfaSetupActivity.class);
        intent.setFlags(1082130432);
        PendingIntent activity = PendingIntent.getActivity(context, 1, intent, 1275068416);
        String string = context.getString(z14 ? R.string.msg_ecg_account_verification : R.string.msg_ecg_no_two_step_verification);
        string.getClass();
        String string2 = context.getString(z14 ? R.string.lbl_account_verification_required : R.string.lbl_two_step_verification);
        string2.getClass();
        String string3 = context.getString(z14 ? R.string.lbl_common_continue : R.string.mct_set_up);
        string3.getClass();
        e eVar = e.f161377p;
        q qVar = new q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(string2);
        qVar.f202684f = q.e(string);
        qVar.f202689k = q.e("");
        qVar.f202691m = 0;
        o oVar = new o();
        oVar.f202664e = q.e(string);
        qVar.l(oVar);
        qVar.f202686h = activity;
        qVar.a(2131232459, string3, activity);
        qVar.i(16, true);
        Notification notificationC = qVar.c();
        notificationC.getClass();
        f.f161394a.getClass();
        f.a.f(context, notificationC, 38, eVar);
        ht.a aVar = ht.a.f85464a;
        Bundle bundleA = c.a(new p("IsTokenExpired", Boolean.valueOf(z14)));
        aVar.getClass();
        ht.a.a(bundleA, "ECGOnMFARequiredErrorUserNotified");
    }
}
