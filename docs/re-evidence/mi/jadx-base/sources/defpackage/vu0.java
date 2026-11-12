package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class vu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Range<Integer> f37226a;

    public vu0(lgi lgiVar) {
        wu0 wu0Var = (wu0) lgiVar.b(wu0.class);
        if (wu0Var == null) {
            this.f37226a = null;
        } else {
            this.f37226a = wu0Var.b();
        }
    }

    public void a(pe3.a aVar) {
        Range<Integer> range = this.f37226a;
        if (range != null) {
            aVar.e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
