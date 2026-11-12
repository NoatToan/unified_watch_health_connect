package vn1;

import com.garmin.android.apps.connectmobile.smartrequest.FindMyPhoneActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FindMyPhoneActivity f178839b;

    public /* synthetic */ a(FindMyPhoneActivity findMyPhoneActivity, int i14) {
        this.f178838a = i14;
        this.f178839b = findMyPhoneActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f178838a;
        FindMyPhoneActivity findMyPhoneActivity = this.f178839b;
        switch (i14) {
            case 0:
                int i15 = FindMyPhoneActivity.f44350g;
                findMyPhoneActivity.P9(false);
                break;
            default:
                int i16 = FindMyPhoneActivity.f44350g;
                findMyPhoneActivity.P9(false);
                break;
        }
    }
}
