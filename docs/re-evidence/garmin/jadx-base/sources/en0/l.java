package en0;

import com.garmin.android.apps.connectmobile.handalignment.HandsCalibrationActivity;
import ds.e0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandsCalibrationActivity f64709b;

    public /* synthetic */ l(HandsCalibrationActivity handsCalibrationActivity, int i14) {
        this.f64708a = i14;
        this.f64709b = handsCalibrationActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f64708a;
        HandsCalibrationActivity handsCalibrationActivity = this.f64709b;
        switch (i14) {
            case 0:
                HandsCalibrationActivity.A.error("Abort error: " + ((Throwable) obj).getMessage());
                handsCalibrationActivity.finish();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                HandsCalibrationActivity.a aVar = HandsCalibrationActivity.f36565z;
                if (bool.booleanValue()) {
                    handsCalibrationActivity.f36569d = null;
                    handsCalibrationActivity.ea();
                } else {
                    HandsCalibrationActivity.A.error("Step result: " + bool);
                    HandsCalibrationActivity.a aVar2 = HandsCalibrationActivity.f36565z;
                    k kVar = new k(handsCalibrationActivity, 6);
                    aVar2.getClass();
                    HandsCalibrationActivity.a.a(handsCalibrationActivity, kVar);
                }
                break;
            case 2:
                e0.v("Step error: ", ((Throwable) obj).getMessage(), HandsCalibrationActivity.A);
                handsCalibrationActivity.f36569d = null;
                HandsCalibrationActivity.a aVar3 = HandsCalibrationActivity.f36565z;
                k kVar2 = new k(handsCalibrationActivity, 4);
                aVar3.getClass();
                HandsCalibrationActivity.a.a(handsCalibrationActivity, kVar2);
                break;
            default:
                HandsCalibrationActivity.A.error("Save error: " + ((Throwable) obj).getMessage());
                handsCalibrationActivity.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
