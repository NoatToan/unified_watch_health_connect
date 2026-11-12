package en0;

import com.garmin.android.apps.connectmobile.handalignment.HandAlignmentCameraActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandAlignmentCameraActivity f64698b;

    public /* synthetic */ f(HandAlignmentCameraActivity handAlignmentCameraActivity, int i14) {
        this.f64697a = i14;
        this.f64698b = handAlignmentCameraActivity;
    }

    @Override // u03.a
    public final void run() {
        int i14 = this.f64697a;
        HandAlignmentCameraActivity handAlignmentCameraActivity = this.f64698b;
        switch (i14) {
            case 0:
                HandAlignmentCameraActivity.f36527r.debug("save successfully");
                handAlignmentCameraActivity.f36539l = false;
                handAlignmentCameraActivity.finish();
                break;
            default:
                HandAlignmentCameraActivity.b bVar = HandAlignmentCameraActivity.f36526q;
                handAlignmentCameraActivity.finish();
                break;
        }
    }
}
