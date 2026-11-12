package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f174091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f174092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f174093c;

    public v1(l lVar, androidx.camera.camera2.internal.compat.h hVar, Executor executor) {
        new AtomicInteger(-1);
        this.f174091a = new Object();
        this.f174092b = executor;
        boolean zA = a(hVar);
        new androidx.lifecycle.y0(-1);
        u1 u1Var = new u1();
        if (zA) {
            lVar.p(u1Var);
        }
    }

    public static boolean a(androidx.camera.camera2.internal.compat.h hVar) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) hVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i14 : iArr) {
                if (i14 == 6) {
                    return true;
                }
            }
        }
        return false;
    }
}
