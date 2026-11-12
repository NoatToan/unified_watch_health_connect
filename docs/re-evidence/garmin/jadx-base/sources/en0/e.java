package en0;

import android.widget.Button;
import com.garmin.android.apps.connectmobile.handalignment.HandAlignmentCameraActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandAlignmentCameraActivity f64696b;

    public /* synthetic */ e(HandAlignmentCameraActivity handAlignmentCameraActivity, int i14) {
        this.f64695a = i14;
        this.f64696b = handAlignmentCameraActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f64695a;
        HandAlignmentCameraActivity handAlignmentCameraActivity = this.f64696b;
        switch (i14) {
            case 0:
                HandAlignmentCameraActivity.b bVar = HandAlignmentCameraActivity.f36526q;
                vd2.g gVar = handAlignmentCameraActivity.f36543p;
                gVar.f177514g.initialize(gVar.f177511d.ordinal());
                gVar.f177513f.set(true);
                return;
            case 1:
                HandAlignmentCameraActivity.f36527r.debug("save");
                s03.a aVar = handAlignmentCameraActivity.f36538k;
                com.garmin.android.apps.connectmobile.handalignment.f fVar = handAlignmentCameraActivity.f36537j;
                if (fVar == null) {
                    p005kotlin.jvm.internal.s.m("watchHandController");
                    throw null;
                }
                aVar.a(fVar.c().k(r03.a.a()).h(r03.a.a()).i(new com.mapbox.maps.renderer.e(new d(handAlignmentCameraActivity, 6), 18), new f(handAlignmentCameraActivity, 0)));
                return;
            default:
                HandAlignmentCameraActivity.b bVar2 = HandAlignmentCameraActivity.f36526q;
                if (handAlignmentCameraActivity.isFinishing()) {
                    return;
                }
                Button button = handAlignmentCameraActivity.f36533f;
                if (button != null) {
                    button.setVisibility(0);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("tryManualButton");
                    throw null;
                }
        }
    }
}
