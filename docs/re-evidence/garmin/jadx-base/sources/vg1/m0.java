package vg1;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.settings.devices.common.FindMyWatchActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FindMyWatchActivity f178139b;

    public /* synthetic */ m0(FindMyWatchActivity findMyWatchActivity, int i14) {
        this.f178138a = i14;
        this.f178139b = findMyWatchActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i14 = this.f178138a;
        FindMyWatchActivity findMyWatchActivity = this.f178139b;
        switch (i14) {
            case 0:
                int i15 = FindMyWatchActivity.f42782c;
                findMyWatchActivity.finish();
                break;
            case 1:
                int i16 = FindMyWatchActivity.f42782c;
                findMyWatchActivity.finish();
                break;
            default:
                int i17 = FindMyWatchActivity.f42782c;
                findMyWatchActivity.finish();
                break;
        }
    }
}
