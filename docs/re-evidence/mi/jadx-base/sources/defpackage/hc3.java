package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class hc3 implements ye3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzo f19924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptureResult f19925b;

    public hc3(uzo uzoVar, CaptureResult captureResult) {
        this.f19924a = uzoVar;
        this.f19925b = captureResult;
    }

    @Override // defpackage.ye3
    public uzo a() {
        return this.f19924a;
    }

    @Override // defpackage.ye3
    public void b(ExifData.b bVar) {
        super.b(bVar);
        Rect rect = (Rect) this.f19925b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.j(rect.width()).i(rect.height());
        }
        Integer num = (Integer) this.f19925b.get(CaptureResult.JPEG_ORIENTATION);
        if (num != null) {
            bVar.m(num.intValue());
        }
        Long l = (Long) this.f19925b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            bVar.f(l.longValue());
        }
        Float f = (Float) this.f19925b.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            bVar.l(f.floatValue());
        }
        Integer numValueOf = (Integer) this.f19925b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) this.f19925b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            bVar.k(numValueOf.intValue());
        }
        Float f2 = (Float) this.f19925b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            bVar.h(f2.floatValue());
        }
        Integer num3 = (Integer) this.f19925b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            ExifData.WhiteBalanceMode whiteBalanceMode = ExifData.WhiteBalanceMode.AUTO;
            if (num3.intValue() == 0) {
                whiteBalanceMode = ExifData.WhiteBalanceMode.MANUAL;
            }
            bVar.n(whiteBalanceMode);
        }
    }

    @Override // defpackage.ye3
    public CameraCaptureMetaData$FlashState c() {
        Integer num = (Integer) this.f19925b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return CameraCaptureMetaData$FlashState.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return CameraCaptureMetaData$FlashState.NONE;
        }
        if (iIntValue == 2) {
            return CameraCaptureMetaData$FlashState.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return CameraCaptureMetaData$FlashState.FIRED;
        }
        zpe.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return CameraCaptureMetaData$FlashState.UNKNOWN;
    }

    @Override // defpackage.ye3
    public CaptureResult d() {
        return this.f19925b;
    }

    public CameraCaptureMetaData$AeState e() {
        Integer num = (Integer) this.f19925b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AeState.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return CameraCaptureMetaData$AeState.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return CameraCaptureMetaData$AeState.CONVERGED;
            }
            if (iIntValue == 3) {
                return CameraCaptureMetaData$AeState.LOCKED;
            }
            if (iIntValue == 4) {
                return CameraCaptureMetaData$AeState.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                zpe.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return CameraCaptureMetaData$AeState.UNKNOWN;
            }
        }
        return CameraCaptureMetaData$AeState.SEARCHING;
    }

    public CameraCaptureMetaData$AfMode f() {
        Integer num = (Integer) this.f19925b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return CameraCaptureMetaData$AfMode.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return CameraCaptureMetaData$AfMode.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return CameraCaptureMetaData$AfMode.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                zpe.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return CameraCaptureMetaData$AfMode.UNKNOWN;
            }
        }
        return CameraCaptureMetaData$AfMode.OFF;
    }

    public CameraCaptureMetaData$AfState g() {
        Integer num = (Integer) this.f19925b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return CameraCaptureMetaData$AfState.INACTIVE;
            case 1:
            case 3:
                return CameraCaptureMetaData$AfState.SCANNING;
            case 2:
                return CameraCaptureMetaData$AfState.PASSIVE_FOCUSED;
            case 4:
                return CameraCaptureMetaData$AfState.LOCKED_FOCUSED;
            case 5:
                return CameraCaptureMetaData$AfState.LOCKED_NOT_FOCUSED;
            case 6:
                return CameraCaptureMetaData$AfState.PASSIVE_NOT_FOCUSED;
            default:
                zpe.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return CameraCaptureMetaData$AfState.UNKNOWN;
        }
    }

    @Override // defpackage.ye3
    public long getTimestamp() {
        Long l = (Long) this.f19925b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public CameraCaptureMetaData$AwbState h() {
        Integer num = (Integer) this.f19925b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AwbState.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return CameraCaptureMetaData$AwbState.INACTIVE;
        }
        if (iIntValue == 1) {
            return CameraCaptureMetaData$AwbState.METERING;
        }
        if (iIntValue == 2) {
            return CameraCaptureMetaData$AwbState.CONVERGED;
        }
        if (iIntValue == 3) {
            return CameraCaptureMetaData$AwbState.LOCKED;
        }
        zpe.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return CameraCaptureMetaData$AwbState.UNKNOWN;
    }

    public hc3(CaptureResult captureResult) {
        this(uzo.a(), captureResult);
    }
}
