package v;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.w2;
import com.google.android.exoplayer2.C;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g implements androidx.camera.core.impl.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f173806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptureResult f173807b;

    public g(w2 w2Var, CaptureResult captureResult) {
        this.f173806a = w2Var;
        this.f173807b = captureResult;
    }

    @Override // androidx.camera.core.impl.c0
    public final w2 a() {
        return this.f173806a;
    }

    @Override // androidx.camera.core.impl.c0
    public final androidx.camera.core.impl.b0 b() {
        Integer num = (Integer) this.f173807b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return androidx.camera.core.impl.b0.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return androidx.camera.core.impl.b0.NONE;
        }
        if (iIntValue != 2) {
            return (iIntValue == 3 || iIntValue == 4) ? androidx.camera.core.impl.b0.FIRED : androidx.camera.core.impl.b0.UNKNOWN;
        }
        return androidx.camera.core.impl.b0.READY;
    }

    @Override // androidx.camera.core.impl.c0
    public final void c(j0.j.b bVar) {
        String strValueOf;
        CaptureResult captureResult = this.f173807b;
        super.c(bVar);
        ArrayList arrayList = bVar.f95937a;
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
        }
        Long l14 = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l14 != null) {
            bVar.c("ExposureTime", String.valueOf(l14.longValue() / C.NANOS_PER_SECOND), arrayList);
        }
        Float f14 = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f14 != null) {
            bVar.c("FNumber", String.valueOf(f14.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            bVar.c("SensitivityType", String.valueOf(3), arrayList);
            bVar.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
        }
        Float f15 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f15 != null) {
            bVar.c("FocalLength", new j0.o((long) (f15.floatValue() * 1000.0f), 1000L).toString(), arrayList);
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            j0.j.c cVar = j0.j.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = j0.j.c.MANUAL;
            }
            int iOrdinal = cVar.ordinal();
            if (iOrdinal != 0) {
                strValueOf = iOrdinal != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            bVar.c("WhiteBalance", strValueOf, arrayList);
        }
    }

    @Override // androidx.camera.core.impl.c0
    public final androidx.camera.core.impl.y d() {
        Integer num = (Integer) this.f173807b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return androidx.camera.core.impl.y.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return androidx.camera.core.impl.y.INACTIVE;
            case 1:
            case 3:
                return androidx.camera.core.impl.y.SCANNING;
            case 2:
                return androidx.camera.core.impl.y.PASSIVE_FOCUSED;
            case 4:
                return androidx.camera.core.impl.y.LOCKED_FOCUSED;
            case 5:
                return androidx.camera.core.impl.y.LOCKED_NOT_FOCUSED;
            case 6:
                return androidx.camera.core.impl.y.PASSIVE_NOT_FOCUSED;
            default:
                return androidx.camera.core.impl.y.UNKNOWN;
        }
    }

    @Override // androidx.camera.core.impl.c0
    public final androidx.camera.core.impl.a0 e() {
        Integer num = (Integer) this.f173807b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return androidx.camera.core.impl.a0.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return androidx.camera.core.impl.a0.INACTIVE;
        }
        if (iIntValue == 1) {
            return androidx.camera.core.impl.a0.METERING;
        }
        if (iIntValue != 2) {
            return iIntValue != 3 ? androidx.camera.core.impl.a0.UNKNOWN : androidx.camera.core.impl.a0.LOCKED;
        }
        return androidx.camera.core.impl.a0.CONVERGED;
    }

    @Override // androidx.camera.core.impl.c0
    public final androidx.camera.core.impl.w f() {
        Integer num = (Integer) this.f173807b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return androidx.camera.core.impl.w.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return androidx.camera.core.impl.w.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return androidx.camera.core.impl.w.CONVERGED;
            }
            if (iIntValue == 3) {
                return androidx.camera.core.impl.w.LOCKED;
            }
            if (iIntValue == 4) {
                return androidx.camera.core.impl.w.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                return androidx.camera.core.impl.w.UNKNOWN;
            }
        }
        return androidx.camera.core.impl.w.SEARCHING;
    }

    @Override // androidx.camera.core.impl.c0
    public final CaptureResult g() {
        return this.f173807b;
    }

    @Override // androidx.camera.core.impl.c0
    public final long getTimestamp() {
        Long l14 = (Long) this.f173807b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l14 == null) {
            return -1L;
        }
        return l14.longValue();
    }

    public g(CaptureResult captureResult) {
        this(w2.f5840b, captureResult);
    }
}
