package com.google.zxing.client.android.camera;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import io.netty.util.internal.StringUtil;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraConfigurationUtils {
    private static final String a = "CameraConfiguration";
    private static final Pattern b = Pattern.compile(";");
    private static final float c = 1.5f;
    private static final float d = 0.0f;
    private static final int e = 10;
    private static final int f = 20;
    private static final int g = 400;

    private CameraConfigurationUtils() {
    }

    @TargetApi(15)
    private static List<Camera.Area> a(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    private static String b(String str, Collection<String> collection, String... strArr) {
        Log.i(a, "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i(a, "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i(a, "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i(a, "No supported values match");
        return null;
    }

    private static Integer c(Camera.Parameters parameters, double d2) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        Log.i(a, "Zoom ratios: " + zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            Log.w(a, "Invalid zoom ratios!");
            return null;
        }
        double d3 = d2 * 100.0d;
        double d4 = Double.POSITIVE_INFINITY;
        int i = 0;
        for (int i2 = 0; i2 < zoomRatios.size(); i2++) {
            double dAbs = Math.abs(((double) zoomRatios.get(i2).intValue()) - d3);
            if (dAbs < d4) {
                i = i2;
                d4 = dAbs;
            }
        }
        Log.i(a, "Chose zoom ratio of " + (((double) zoomRatios.get(i).intValue()) / 100.0d));
        return Integer.valueOf(i);
    }

    public static String collectStats(Camera.Parameters parameters) {
        return collectStats(parameters.flatten());
    }

    @TargetApi(15)
    private static String d(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb.append(area.rect);
            sb.append(JsonLexerKt.COLON);
            sb.append(area.weight);
            sb.append(StringUtil.SPACE);
        }
        return sb.toString();
    }

    private static String e(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(JsonLexerKt.BEGIN_LIST);
        Iterator<int[]> it2 = collection.iterator();
        while (it2.hasNext()) {
            sb.append(Arrays.toString(it2.next()));
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }

    public static void setBarcodeSceneMode(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            Log.i(a, "Barcode scene mode already set");
            return;
        }
        String strB = b("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (strB != null) {
            parameters.setSceneMode(strB);
        }
    }

    public static void setBestExposure(Camera.Parameters parameters, boolean z) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            if (exposureCompensationStep > 0.0f) {
                int iRound = Math.round((z ? 0.0f : 1.5f) / exposureCompensationStep);
                float f2 = exposureCompensationStep * iRound;
                int iMax = Math.max(Math.min(iRound, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == iMax) {
                    Log.i(a, "Exposure compensation already set to " + iMax + " / " + f2);
                    return;
                }
                Log.i(a, "Setting exposure compensation to " + iMax + " / " + f2);
                parameters.setExposureCompensation(iMax);
                return;
            }
        }
        Log.i(a, "Camera does not support exposure compensation");
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters) {
        setBestPreviewFPS(parameters, 10, 20);
    }

    public static void setFocus(Camera.Parameters parameters, CameraSettings.FocusMode focusMode, boolean z) {
        String strB;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (z || focusMode == CameraSettings.FocusMode.AUTO) {
            strB = b("focus mode", supportedFocusModes, "auto");
        } else if (focusMode == CameraSettings.FocusMode.CONTINUOUS) {
            strB = b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        } else if (focusMode == CameraSettings.FocusMode.INFINITY) {
            strB = b("focus mode", supportedFocusModes, "infinity");
        } else {
            strB = focusMode == CameraSettings.FocusMode.MACRO ? b("focus mode", supportedFocusModes, "macro") : null;
        }
        if (!z && strB == null) {
            strB = b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strB != null) {
            if (!strB.equals(parameters.getFocusMode())) {
                parameters.setFocusMode(strB);
                return;
            }
            Log.i(a, "Focus mode already set to " + strB);
        }
    }

    @TargetApi(15)
    public static void setFocusArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() <= 0) {
            Log.i(a, "Device does not support focus areas");
            return;
        }
        Log.i(a, "Old focus areas: " + d(parameters.getFocusAreas()));
        List<Camera.Area> listA = a(400);
        Log.i(a, "Setting focus area to : " + d(listA));
        parameters.setFocusAreas(listA);
    }

    public static void setInvertColor(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i(a, "Negative effect already set");
            return;
        }
        String strB = b("color effect", parameters.getSupportedColorEffects(), "negative");
        if (strB != null) {
            parameters.setColorEffect(strB);
        }
    }

    @TargetApi(15)
    public static void setMetering(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() <= 0) {
            Log.i(a, "Device does not support metering areas");
            return;
        }
        Log.i(a, "Old metering areas: " + parameters.getMeteringAreas());
        List<Camera.Area> listA = a(400);
        Log.i(a, "Setting metering area to : " + d(listA));
        parameters.setMeteringAreas(listA);
    }

    public static void setTorch(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String strB = z ? b("flash mode", supportedFlashModes, "torch", "on") : b("flash mode", supportedFlashModes, "off");
        if (strB != null) {
            if (strB.equals(parameters.getFlashMode())) {
                Log.i(a, "Flash mode already set to " + strB);
                return;
            }
            Log.i(a, "Setting flash mode to " + strB);
            parameters.setFlashMode(strB);
        }
    }

    @TargetApi(15)
    public static void setVideoStabilization(Camera.Parameters parameters) {
        if (!parameters.isVideoStabilizationSupported()) {
            Log.i(a, "This device does not support video stabilization");
        } else if (parameters.getVideoStabilization()) {
            Log.i(a, "Video stabilization already enabled");
        } else {
            Log.i(a, "Enabling video stabilization...");
            parameters.setVideoStabilization(true);
        }
    }

    public static void setZoom(Camera.Parameters parameters, double d2) {
        if (!parameters.isZoomSupported()) {
            Log.i(a, "Zoom is not supported");
            return;
        }
        Integer numC = c(parameters, d2);
        if (numC == null) {
            return;
        }
        if (parameters.getZoom() == numC.intValue()) {
            Log.i(a, "Zoom is already set to " + numC);
            return;
        }
        Log.i(a, "Setting zoom to " + numC);
        parameters.setZoom(numC.intValue());
    }

    public static String collectStats(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=");
        sb.append(Build.BOARD);
        sb.append('\n');
        sb.append("BRAND=");
        sb.append(Build.BRAND);
        sb.append('\n');
        sb.append("CPU_ABI=");
        sb.append(Build.CPU_ABI);
        sb.append('\n');
        sb.append("DEVICE=");
        sb.append(Build.DEVICE);
        sb.append('\n');
        sb.append("DISPLAY=");
        sb.append(Build.DISPLAY);
        sb.append('\n');
        sb.append("FINGERPRINT=");
        sb.append(Build.FINGERPRINT);
        sb.append('\n');
        sb.append("HOST=");
        sb.append(Build.HOST);
        sb.append('\n');
        sb.append("ID=");
        sb.append(Build.ID);
        sb.append('\n');
        sb.append("MANUFACTURER=");
        sb.append(Build.MANUFACTURER);
        sb.append('\n');
        sb.append("MODEL=");
        sb.append(Build.MODEL);
        sb.append('\n');
        sb.append("PRODUCT=");
        sb.append(Build.PRODUCT);
        sb.append('\n');
        sb.append("TAGS=");
        sb.append(Build.TAGS);
        sb.append('\n');
        sb.append("TIME=");
        sb.append(Build.TIME);
        sb.append('\n');
        sb.append("TYPE=");
        sb.append(Build.TYPE);
        sb.append('\n');
        sb.append("USER=");
        sb.append(Build.USER);
        sb.append('\n');
        sb.append("VERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME);
        sb.append('\n');
        sb.append("VERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append('\n');
        sb.append("VERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE);
        sb.append('\n');
        sb.append("VERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append('\n');
        if (charSequence != null) {
            String[] strArrSplit = b.split(charSequence);
            Arrays.sort(strArrSplit);
            for (String str : strArrSplit) {
                sb.append(str);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters, int i, int i2) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i(a, "Supported FPS ranges: " + e(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        int[] iArr = null;
        for (int[] iArr2 : supportedPreviewFpsRange) {
            int i3 = iArr2[0];
            int i4 = iArr2[1];
            if (i3 >= i * 1000 && i4 <= i2 * 1000) {
                iArr = iArr2;
                break;
            }
        }
        if (iArr == null) {
            Log.i(a, "No suitable FPS range?");
            return;
        }
        int[] iArr3 = new int[2];
        parameters.getPreviewFpsRange(iArr3);
        if (Arrays.equals(iArr3, iArr)) {
            Log.i(a, "FPS range already set to " + Arrays.toString(iArr));
            return;
        }
        Log.i(a, "Setting FPS range to " + Arrays.toString(iArr));
        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
    }
}
