package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import androidx.health.connect.client.records.OvulationTestRecord;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class cg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f5300a = Pattern.compile(";");

    public static List<Camera.Area> a(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    public static Point b(Camera.Parameters parameters, Point point) {
        Camera.Size size;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            ipe.h("Device returned no supported preview sizes; using default");
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        if (ipe.g()) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size2 : supportedPreviewSizes) {
                sb.append(size2.width);
                sb.append('x');
                sb.append(size2.height);
                sb.append(' ');
            }
            ipe.a("Supported preview sizes: " + ((Object) sb));
        }
        int i = point.x;
        int i2 = point.y;
        double d = i < i2 ? ((double) i) / ((double) i2) : ((double) i2) / ((double) i);
        ipe.a("screenAspectRatio: " + d);
        Camera.Size size3 = null;
        int i3 = 0;
        for (Camera.Size size4 : supportedPreviewSizes) {
            int i4 = size4.width;
            int i5 = size4.height;
            int i6 = i4 * i5;
            if (i6 < 153600) {
                size = size3;
            } else {
                boolean z = i4 < i5;
                int i7 = z ? i4 : i5;
                int i8 = z ? i5 : i4;
                ipe.a(String.format("maybeFlipped:%d * %d", Integer.valueOf(i7), Integer.valueOf(i8)));
                size = size3;
                double d2 = ((double) i7) / ((double) i8);
                ipe.a("aspectRatio: " + d2);
                double dAbs = Math.abs(d2 - d);
                ipe.a("distortion: " + dAbs);
                if (dAbs <= 0.06d) {
                    if (i7 == point.x && i8 == point.y) {
                        Point point2 = new Point(i4, i5);
                        ipe.a("Found preview size exactly matching screen size: " + point2);
                        return point2;
                    }
                    if (i6 > i3) {
                        size3 = size4;
                        i3 = i6;
                    }
                }
            }
            size3 = size;
        }
        Camera.Size size5 = size3;
        if (size5 != null) {
            Point point3 = new Point(size5.width, size5.height);
            ipe.a("Using largest suitable preview size: " + point3);
            return point3;
        }
        Camera.Size previewSize2 = parameters.getPreviewSize();
        if (previewSize2 == null) {
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        Point point4 = new Point(previewSize2.width, previewSize2.height);
        ipe.a("No suitable preview sizes, using default: " + point4);
        return point4;
    }

    public static String c(String str, Collection<String> collection, String... strArr) {
        ipe.a("Requesting " + str + " value from among: " + Arrays.toString(strArr));
        ipe.a("Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    ipe.a("Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        ipe.a("No supported values match");
        return null;
    }

    public static void d(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            ipe.a("Barcode scene mode already set");
            return;
        }
        String strC = c("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (strC != null) {
            parameters.setSceneMode(strC);
        }
    }

    public static void e(Camera.Parameters parameters, boolean z) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            if (exposureCompensationStep > 0.0f) {
                int iRound = Math.round((z ? 0.0f : 1.5f) / exposureCompensationStep);
                float f = exposureCompensationStep * iRound;
                int iMax = Math.max(Math.min(iRound, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == iMax) {
                    ipe.a("Exposure compensation already set to " + iMax + " / " + f);
                    return;
                }
                ipe.a("Setting exposure compensation to " + iMax + " / " + f);
                parameters.setExposureCompensation(iMax);
                return;
            }
        }
        ipe.a("Camera does not support exposure compensation");
    }

    public static void f(Camera.Parameters parameters, boolean z, boolean z2, boolean z3) {
        String strC;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (z) {
            strC = (z3 || z2) ? c("focus mode", supportedFocusModes, "auto") : c("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        } else {
            strC = null;
        }
        if (!z3 && strC == null) {
            strC = c("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strC != null) {
            if (!strC.equals(parameters.getFocusMode())) {
                parameters.setFocusMode(strC);
                return;
            }
            ipe.a("Focus mode already set to " + strC);
        }
    }

    public static void g(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() <= 0) {
            ipe.a("Device does not support focus areas");
            return;
        }
        ipe.a("Old focus areas: " + l(parameters.getFocusAreas()));
        List<Camera.Area> listA = a(400);
        ipe.a("Setting focus area to : " + l(listA));
        parameters.setFocusAreas(listA);
    }

    public static void h(Camera.Parameters parameters) {
        if (OvulationTestRecord.Result.NEGATIVE.equals(parameters.getColorEffect())) {
            ipe.a("Negative effect already set");
            return;
        }
        String strC = c("color effect", parameters.getSupportedColorEffects(), OvulationTestRecord.Result.NEGATIVE);
        if (strC != null) {
            parameters.setColorEffect(strC);
        }
    }

    public static void i(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() <= 0) {
            ipe.a("Device does not support metering areas");
            return;
        }
        ipe.a("Old metering areas: " + parameters.getMeteringAreas());
        List<Camera.Area> listA = a(400);
        ipe.a("Setting metering area to : " + l(listA));
        parameters.setMeteringAreas(listA);
    }

    public static void j(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String strC = z ? c("flash mode", supportedFlashModes, "torch", DebugKt.DEBUG_PROPERTY_VALUE_ON) : c("flash mode", supportedFlashModes, DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        if (strC != null) {
            if (strC.equals(parameters.getFlashMode())) {
                ipe.a("Flash mode already set to " + strC);
                return;
            }
            ipe.a("Setting flash mode to " + strC);
            parameters.setFlashMode(strC);
        }
    }

    public static void k(Camera.Parameters parameters) {
        if (!parameters.isVideoStabilizationSupported()) {
            ipe.a("This device does not support video stabilization");
        } else if (parameters.getVideoStabilization()) {
            ipe.a("Video stabilization already enabled");
        } else {
            ipe.a("Enabling video stabilization...");
            parameters.setVideoStabilization(true);
        }
    }

    public static String l(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb.append(area.rect);
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(area.weight);
            sb.append(' ');
        }
        return sb.toString();
    }
}
