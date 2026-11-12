package vg1;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.settings.devices.common.FindMyWatchActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FindMyWatchActivity f178136b;

    public /* synthetic */ l0(FindMyWatchActivity findMyWatchActivity, int i14) {
        this.f178135a = i14;
        this.f178136b = findMyWatchActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f178135a;
        FindMyWatchActivity findMyWatchActivity = this.f178136b;
        switch (i15) {
            case 0:
                int i16 = FindMyWatchActivity.f42782c;
                findMyWatchActivity.finish();
                break;
            case 1:
                int i17 = FindMyWatchActivity.f42782c;
                dialogInterface.dismiss();
                findMyWatchActivity.finish();
                break;
            default:
                sd2.f fVar = findMyWatchActivity.f42784b;
                xt2.a aVarO9 = fVar != null ? FindMyWatchActivity.O9(fVar) : null;
                if (aVarO9 != null) {
                    aVarO9.c(new p0(findMyWatchActivity));
                }
                dialogInterface.dismiss();
                findMyWatchActivity.finish();
                break;
        }
    }
}
