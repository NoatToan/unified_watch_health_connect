package x;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.h;
import androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import androidx.camera.core.impl.f2;
import androidx.camera.core.impl.g2;
import androidx.camera.core.impl.i2;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private a() {
    }

    /* JADX WARN: Code duplicated, block: B:285:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:317:0x054e  */
    public static i2 a(h hVar) {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Integer num;
        g2 g2Var = g2.f5561c;
        g2Var.getClass();
        try {
            f2 f2Var = g2Var.f5562a.b().get();
            ArrayList arrayList = new ArrayList();
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num2 = (Integer) hVar.a(key);
            if (f2Var.a(AeFpsRangeLegacyQuirk.class, num2 != null && num2.intValue() == 2)) {
                arrayList.add(new AeFpsRangeLegacyQuirk(hVar));
            }
            if (f2Var.a(AspectRatioLegacyApi21Quirk.class, false)) {
                arrayList.add(new AspectRatioLegacyApi21Quirk());
            }
            HashSet hashSet = JpegHalCorruptImageQuirk.f5398a;
            String str = Build.DEVICE;
            Locale locale = Locale.US;
            if (f2Var.a(JpegHalCorruptImageQuirk.class, hashSet.contains(str.toLowerCase(locale)))) {
                arrayList.add(new JpegHalCorruptImageQuirk());
            }
            HashSet hashSet2 = JpegCaptureDownsizingQuirk.f5397a;
            String str2 = Build.MODEL;
            if (f2Var.a(JpegCaptureDownsizingQuirk.class, hashSet2.contains(str2.toLowerCase(locale)) && ((Integer) hVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new JpegCaptureDownsizingQuirk());
            }
            Integer num3 = (Integer) hVar.a(key);
            if (f2Var.a(CamcorderProfileResolutionQuirk.class, num3 != null && num3.intValue() == 2)) {
                arrayList.add(new CamcorderProfileResolutionQuirk(hVar));
            }
            String str3 = Build.HARDWARE;
            if (f2Var.a(CaptureNoResponseQuirk.class, ("samsungexynos7420".equalsIgnoreCase(str3) || "universal7420".equalsIgnoreCase(str3)) && ((Integer) hVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CaptureNoResponseQuirk());
            }
            Integer num4 = (Integer) hVar.a(key);
            if (f2Var.a(LegacyCameraOutputConfigNullPointerQuirk.class, num4 != null && num4.intValue() == 2)) {
                arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
            }
            if (f2Var.a(LegacyCameraSurfaceCleanupQuirk.class, Build.VERSION.SDK_INT < 29 && (num = (Integer) hVar.a(key)) != null && num.intValue() == 2)) {
                arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
            }
            if (f2Var.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.f5392a.contains(str2.toUpperCase(locale)) && ((Integer) hVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new ImageCaptureWashedOutImageQuirk());
            }
            if (f2Var.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.f5377a.contains(str2.toUpperCase(locale)) && ((Integer) hVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
            }
            String str4 = Build.BRAND;
            if (f2Var.a(YuvImageOnePixelShiftQuirk.class, ("motorola".equalsIgnoreCase(str4) && "MotoG3".equalsIgnoreCase(str2)) || ("samsung".equalsIgnoreCase(str4) && "SM-G532F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str4) && "SM-J700F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str4) && "SM-A920F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str4) && "SM-J415F".equalsIgnoreCase(str2)) || ("xiaomi".equalsIgnoreCase(str4) && "Mi A1".equalsIgnoreCase(str2))))))) {
                arrayList.add(new YuvImageOnePixelShiftQuirk());
            }
            Iterator<String> it = FlashTooSlowQuirk.f5386a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                        if (((Integer) hVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                            z14 = true;
                            break;
                        }
                    }
                }
                z14 = false;
                break;
            }
            if (f2Var.a(FlashTooSlowQuirk.class, z14)) {
                arrayList.add(new FlashTooSlowQuirk());
            }
            if (f2Var.a(AfRegionFlipHorizontallyQuirk.class, Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) hVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new AfRegionFlipHorizontallyQuirk());
            }
            CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num5 = (Integer) hVar.a(key2);
            if (f2Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, num5 != null && num5.intValue() == 2)) {
                arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
            }
            Integer num6 = (Integer) hVar.a(key2);
            if (f2Var.a(PreviewOrientationIncorrectQuirk.class, num6 != null && num6.intValue() == 2)) {
                arrayList.add(new PreviewOrientationIncorrectQuirk());
            }
            Integer num7 = (Integer) hVar.a(key2);
            if (f2Var.a(CaptureSessionStuckQuirk.class, num7 != null && num7.intValue() == 2)) {
                arrayList.add(new CaptureSessionStuckQuirk());
            }
            List<String> list = ImageCaptureFlashNotFireQuirk.f5390b;
            String str5 = Build.MODEL;
            Locale locale2 = Locale.US;
            if (f2Var.a(ImageCaptureFlashNotFireQuirk.class, (list.contains(str5.toLowerCase(locale2)) && ((Integer) hVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || ImageCaptureFlashNotFireQuirk.f5389a.contains(str5.toLowerCase(locale2)))) {
                arrayList.add(new ImageCaptureFlashNotFireQuirk());
            }
            if (f2Var.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.f5393a.contains(str5.toLowerCase(locale2)) && ((Integer) hVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
            }
            if (f2Var.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.f5387a.contains(str5.toLowerCase(locale2)) && ((Integer) hVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
            }
            Integer num8 = (Integer) hVar.a(key2);
            if (f2Var.a(IncorrectCaptureStateQuirk.class, num8 != null && num8.intValue() == 2)) {
                arrayList.add(new IncorrectCaptureStateQuirk());
            }
            Iterator<String> it3 = TorchFlashRequiredFor3aUpdateQuirk.f5404b.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (Build.MODEL.toUpperCase(Locale.US).equals(it3.next())) {
                        if (((Integer) hVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                            z15 = true;
                            break;
                        }
                    }
                }
                z15 = false;
                break;
            }
            if (f2Var.a(TorchFlashRequiredFor3aUpdateQuirk.class, z15)) {
                arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(hVar));
            }
            String str6 = Build.MANUFACTURER;
            if (f2Var.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, ("HUAWEI".equalsIgnoreCase(str6) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str6) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str6) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str6) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (("OPPO".equalsIgnoreCase(str6) && "A37F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str6) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))))) {
                arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
            }
            if (f2Var.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, "Huawei".equalsIgnoreCase(str6))) {
                arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
            }
            if (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.f() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.g() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.j() || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.h()) {
                z16 = true;
            } else {
                String str7 = Build.MODEL;
                if (("pixel 4 xl".equalsIgnoreCase(str7) && Build.VERSION.SDK_INT == 29) || (("motorola".equalsIgnoreCase(Build.BRAND) && "moto e13".equalsIgnoreCase(str7)) || ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.i() || b.a())) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            }
            if (f2Var.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, z16)) {
                arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
            }
            String str8 = Build.MODEL;
            if (f2Var.a(TemporalNoiseQuirk.class, "Pixel 8".equalsIgnoreCase(str8) && ((Integer) hVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new TemporalNoiseQuirk());
            }
            HashSet hashSet3 = ImageCaptureFailedForVideoSnapshotQuirk.f5388a;
            Locale locale3 = Locale.US;
            if (hashSet3.contains(str8.toLowerCase(locale3)) || (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER))) {
                z17 = true;
            } else {
                String str9 = Build.HARDWARE;
                if (str9.toLowerCase(locale3).startsWith("ums")) {
                    z17 = true;
                } else {
                    String str10 = Build.BRAND;
                    if (("itel".equalsIgnoreCase(str10) && str9.toLowerCase(locale3).startsWith("sp")) || ("HUAWEI".equalsIgnoreCase(str10) && "FIG-LX1".equalsIgnoreCase(str8))) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                }
            }
            if (f2Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class, z17)) {
                arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
            }
            String str11 = Build.BRAND;
            if (f2Var.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class, "motorola".equalsIgnoreCase(str11) && "moto e20".equalsIgnoreCase(str8) && hVar.f5351c.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE))) {
                arrayList.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
            }
            if (f2Var.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, "samsung".equalsIgnoreCase(str11) && Build.DEVICE.equalsIgnoreCase("m55xq"))) {
                arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
            }
            i2 i2Var = new i2(arrayList);
            i2.d(i2Var);
            return i2Var;
        } catch (InterruptedException | ExecutionException e4) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e4);
        }
    }
}
