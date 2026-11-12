package mu0;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.e f121118b;

    public /* synthetic */ m(com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar, int i14) {
        this.f121117a = i14;
        this.f121118b = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f121117a) {
            case 0:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar = this.f121118b;
                eVar.f38620y.debug("In showLiveEventDialog() has been turned on and dialog has been accepted turning on live event sharing...");
                eVar.K6().D4(false);
                eVar.C.f(false);
                eVar.requireActivity().onBackPressed();
                dialogInterface.dismiss();
                break;
            default:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.e eVar2 = this.f121118b;
                eVar2.f38620y.debug("In showLiveEventDialog() has been turned on and dialog has been accepted turning on live event sharing...");
                eVar2.K6().D4(true);
                dialogInterface.dismiss();
                break;
        }
    }
}
