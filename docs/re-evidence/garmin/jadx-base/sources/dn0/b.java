package dn0;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.gsm.GSMRedirectActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GSMRedirectActivity.g f60494b;

    public /* synthetic */ b(GSMRedirectActivity.g gVar, int i14) {
        this.f60493a = i14;
        this.f60494b = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f60493a) {
            case 0:
                GSMRedirectActivity gSMRedirectActivity = this.f60494b.f36478d;
                gSMRedirectActivity.setResult(0);
                gSMRedirectActivity.finish();
                break;
            case 1:
                dialogInterface.dismiss();
                GSMRedirectActivity.g gVar = this.f60494b;
                gVar.e();
                gVar.f36478d.finish();
                break;
            default:
                dialogInterface.dismiss();
                this.f60494b.f36478d.finish();
                break;
        }
    }
}
