package en0;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.handalignment.HandAlignmentCameraDebugActivity;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandAlignmentCameraDebugActivity f64700b;

    public /* synthetic */ g(HandAlignmentCameraDebugActivity handAlignmentCameraDebugActivity, int i14) {
        this.f64699a = i14;
        this.f64700b = handAlignmentCameraDebugActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f64699a;
        HandAlignmentCameraDebugActivity handAlignmentCameraDebugActivity = this.f64700b;
        switch (i14) {
            case 0:
                Logger logger = HandAlignmentCameraDebugActivity.f36551n;
                if (!((Boolean) obj).booleanValue()) {
                    Toast.makeText(handAlignmentCameraDebugActivity, "Hand alignment start failed.", 1).show();
                    handAlignmentCameraDebugActivity.finish();
                }
                break;
            default:
                Logger logger2 = HandAlignmentCameraDebugActivity.f36551n;
                Toast.makeText(handAlignmentCameraDebugActivity, "Hand alignment start error: " + ((Throwable) obj).getMessage(), 1).show();
                handAlignmentCameraDebugActivity.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
