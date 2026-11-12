package en0;

import android.content.Intent;
import android.os.Handler;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.handalignment.HandAlignmentCameraActivity;
import com.garmin.android.apps.connectmobile.handalignment.HandsCalibrationActivity;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandAlignmentCameraActivity f64694b;

    public /* synthetic */ d(HandAlignmentCameraActivity handAlignmentCameraActivity, int i14) {
        this.f64693a = i14;
        this.f64694b = handAlignmentCameraActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f64693a;
        int i15 = 1;
        HandAlignmentCameraActivity handAlignmentCameraActivity = this.f64694b;
        switch (i14) {
            case 0:
                HandAlignmentCameraActivity.b bVar = HandAlignmentCameraActivity.f36526q;
                if (((Boolean) obj).booleanValue()) {
                    new Handler().postDelayed(new e(handAlignmentCameraActivity, 0), 1000L);
                } else {
                    HandAlignmentCameraActivity.f36527r.error("start failed");
                    handAlignmentCameraActivity.ea();
                }
                return Unit.INSTANCE;
            case 1:
                HandAlignmentCameraActivity.f36527r.error("startManual error: %" + ((Throwable) obj).getMessage());
                handAlignmentCameraActivity.ea();
                return Unit.INSTANCE;
            case 2:
                Boolean bool = (Boolean) obj;
                Logger logger = HandAlignmentCameraActivity.f36527r;
                logger.debug("rotateDegrees result: " + bool);
                if (!bool.booleanValue()) {
                    handAlignmentCameraActivity.ea();
                } else if (!handAlignmentCameraActivity.isFinishing() && handAlignmentCameraActivity.f36539l) {
                    vd2.g gVar = handAlignmentCameraActivity.f36543p;
                    gVar.f177514g.initialize(gVar.f177511d.ordinal());
                    gVar.f177513f.set(true);
                    logger.debug("Restarted watch hand detection.");
                }
                return Unit.INSTANCE;
            case 3:
                HandAlignmentCameraActivity.f36527r.error("rotateDegrees error: " + ((Throwable) obj).getMessage());
                handAlignmentCameraActivity.ea();
                return Unit.INSTANCE;
            case 4:
                Boolean bool2 = (Boolean) obj;
                HandAlignmentCameraActivity.f36527r.debug("rotateDegrees result: " + bool2);
                if (!bool2.booleanValue()) {
                    handAlignmentCameraActivity.ea();
                } else if (!handAlignmentCameraActivity.isFinishing() && handAlignmentCameraActivity.f36539l) {
                    handAlignmentCameraActivity.fa(HandAlignmentCameraActivity.a.Aligned);
                    ImageView imageView = handAlignmentCameraActivity.f36532e;
                    if (imageView == null) {
                        p005kotlin.jvm.internal.s.m("watchFaceCircle");
                        throw null;
                    }
                    imageView.postDelayed(new e(handAlignmentCameraActivity, i15), 3000L);
                }
                return Unit.INSTANCE;
            case 5:
                HandAlignmentCameraActivity.f36527r.error("rotateDegrees error: " + ((Throwable) obj).getMessage());
                handAlignmentCameraActivity.ea();
                return Unit.INSTANCE;
            case 6:
                HandAlignmentCameraActivity.f36527r.error("save error: " + ((Throwable) obj).getMessage());
                handAlignmentCameraActivity.ea();
                return Unit.INSTANCE;
            case 7:
                HandAlignmentCameraActivity.f36527r.error("start error: " + ((Throwable) obj).getMessage());
                handAlignmentCameraActivity.ea();
                return Unit.INSTANCE;
            case 8:
                HandAlignmentCameraActivity.f36527r.error("abort error: " + ((Throwable) obj).getMessage());
                handAlignmentCameraActivity.finish();
                return Unit.INSTANCE;
            default:
                HandAlignmentCameraActivity.b bVar2 = HandAlignmentCameraActivity.f36526q;
                if (((Boolean) obj).booleanValue()) {
                    handAlignmentCameraActivity.f36540m = true;
                    HandsCalibrationActivity.a aVar = HandsCalibrationActivity.f36565z;
                    long j8 = handAlignmentCameraActivity.f36534g;
                    String str = handAlignmentCameraActivity.f36535h;
                    aVar.getClass();
                    Intent intent = new Intent(handAlignmentCameraActivity, (Class<?>) HandsCalibrationActivity.class);
                    intent.putExtra("GCM_deviceUnitID", j8);
                    intent.putExtra("GCM_deviceName", str);
                    handAlignmentCameraActivity.startActivity(intent);
                    handAlignmentCameraActivity.finish();
                } else {
                    HandAlignmentCameraActivity.f36527r.error("startManual failed");
                    handAlignmentCameraActivity.ea();
                }
                return Unit.INSTANCE;
        }
    }
}
