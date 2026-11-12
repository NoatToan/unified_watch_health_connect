package vg1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.common.FindMyWatchActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f178142b;

    public /* synthetic */ n0(o0 o0Var, int i14) {
        this.f178141a = i14;
        this.f178142b = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f178141a) {
            case 0:
                FindMyWatchActivity findMyWatchActivity = this.f178142b.f178144a;
                findMyWatchActivity.getClass();
                androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(findMyWatchActivity);
                aVar.setMessage(R.string.find_my_watch_found_msg).setTitle(R.string.find_my_watch_found_title);
                aVar.setPositiveButton(R.string.lbl_close, new l0(findMyWatchActivity, 2));
                androidx.appcompat.app.e eVarCreate = aVar.create();
                eVarCreate.setOnCancelListener(new m0(findMyWatchActivity, 2));
                eVarCreate.show();
                break;
            default:
                this.f178142b.f178144a.P9();
                break;
        }
    }
}
