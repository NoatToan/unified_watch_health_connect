package rp2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerBankTermsConditionActivity;
import o13.p;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayIssuerBankTermsConditionActivity f154089b;

    public /* synthetic */ c(FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity, int i14) {
        this.f154088a = i14;
        this.f154089b = fitPayIssuerBankTermsConditionActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f154088a) {
            case 0:
                FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity = this.f154089b;
                if (!fitPayIssuerBankTermsConditionActivity.f51598k || (!fitPayIssuerBankTermsConditionActivity.f51605r && !fitPayIssuerBankTermsConditionActivity.isFinishing() && !fitPayIssuerBankTermsConditionActivity.isDestroyed())) {
                    fitPayIssuerBankTermsConditionActivity.f51605r = true;
                    fitPayIssuerBankTermsConditionActivity.f51603p.removeCallbacks(fitPayIssuerBankTermsConditionActivity.f51604q);
                    FitPayIssuerBankTermsConditionActivity.a.a(FitPayIssuerBankTermsConditionActivity.f51592t).debug("handleInactivityTimeout");
                    fitPayIssuerBankTermsConditionActivity.runOnUiThread(new c(fitPayIssuerBankTermsConditionActivity, 1));
                }
                break;
            default:
                FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity2 = this.f154089b;
                if (fitPayIssuerBankTermsConditionActivity2.f51605r && !fitPayIssuerBankTermsConditionActivity2.isFinishing() && !fitPayIssuerBankTermsConditionActivity2.isDestroyed()) {
                    FitPayIssuerBankTermsConditionActivity.a.a(FitPayIssuerBankTermsConditionActivity.f51592t).debug("showRetryTimeoutDialog");
                    String string = fitPayIssuerBankTermsConditionActivity2.getString(R.string.time_expired_title);
                    string.getClass();
                    String string2 = fitPayIssuerBankTermsConditionActivity2.getString(R.string.time_expired_message);
                    string2.getClass();
                    String string3 = fitPayIssuerBankTermsConditionActivity2.getString(R.string.lbl_start_over);
                    string3.getClass();
                    androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, fitPayIssuerBankTermsConditionActivity2, string, string2, new p(string3, new a(fitPayIssuerBankTermsConditionActivity2, 0)), null, null, false, SyslogConstants.LOG_LOCAL6);
                    if (eVarQ != null) {
                        eVarQ.show();
                    }
                    break;
                }
                break;
        }
    }
}
