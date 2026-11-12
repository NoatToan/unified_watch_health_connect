package dn0;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GSMRedirectActivity.r f60502b;

    public /* synthetic */ f(GSMRedirectActivity.r rVar, int i14) {
        this.f60501a = i14;
        this.f60502b = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f60501a) {
            case 0:
                GSMRedirectActivity gSMRedirectActivity = this.f60502b.f36503l;
                gSMRedirectActivity.setResult(2);
                gSMRedirectActivity.finish();
                break;
            case 1:
                GSMRedirectActivity gSMRedirectActivity2 = this.f60502b.f36503l;
                gSMRedirectActivity2.setResult(2);
                gSMRedirectActivity2.finish();
                break;
            default:
                this.f60502b.f36503l.finish();
                break;
        }
    }
}
