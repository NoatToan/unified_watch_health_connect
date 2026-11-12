package ohos.ace.adapter.capability.platformview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.AceTextureHolder;
import ohos.ace.adapter.IAceOnResourceEvent;

/* JADX INFO: loaded from: classes46.dex */
public class AcePlatformViewAosp extends AcePlatformViewBase {
    private static final String ANGLE = "angle";
    private static final float AXIS_X_DEFAULT = 0.0f;
    private static final float AXIS_Y_DEFAULT = 0.0f;
    private static final float AXIS_Z_DEFAULT = 0.0f;
    private static final String CENTER_X = "centerX";
    private static final String CENTER_X_DEFAULT = "50%";
    private static final String CENTER_Y = "centerY";
    private static final String CENTER_Y_DEFAULT = "50%";
    private static final String FAIL = "fail";
    private static final String KEY_TEXTUREID = "textureId";
    private static final String LOG_TAG = "AcePlatformViewAosp";
    private static final String PERSPECTIVE = "perspective";
    private static final String PERSPECTIVE_DEFAULT = "";
    private static final String PLATFORM_VIEW_HEIGHT = "platformViewHeight";
    private static final String PLATFORM_VIEW_LEFT = "platformViewLeft";
    private static final Object PLATFORM_VIEW_LOCK = new Object();
    private static final String PLATFORM_VIEW_TOP = "platformViewTop";
    private static final String PLATFORM_VIEW_TOUCH_POINT_OFFSET_X = "platformViewTouchPointOffsetX";
    private static final String PLATFORM_VIEW_TOUCH_POINT_OFFSET_Y = "platformViewTouchPointOffsetY";
    private static final String PLATFORM_VIEW_WIDTH = "platformViewWidth";
    private static final float ROTATION_ANGLE_DEFAULT = 0.0f;
    private static final float ROTATION_X_DEFAULT = 0.0f;
    private static final float ROTATION_Y_DEFAULT = 0.0f;
    private static final float ROTATION_Z_DEFAULT = 0.0f;
    private static final float SCALE_X_DEFAULT = 1.0f;
    private static final float SCALE_Y_DEFAULT = 1.0f;
    private static final float SCALE_Z_DEFAULT = 1.0f;
    private static final String SUCCESS = "success";
    private static final float TRANSLATION_X_DEFAULT = 0.0f;
    private static final float TRANSLATION_Y_DEFAULT = 0.0f;
    private static final float TRANSLATION_Z_DEFAULT = 0.0f;
    private static final String X = "X";
    private static final String Y = "Y";
    private static final String Z = "Z";
    private float[] affineMatrix;
    private Handler asyncHandler;
    private float axisX;
    private float axisY;
    private float axisZ;
    private String centerX;
    private String centerY;
    private final Context context;
    private HandlerThread handlerThread;
    private int height;
    private boolean isTransformMatrix;
    private final Handler mainHandler;
    private MotionEvent motionEvent;
    private int offsetX;
    private int offsetY;
    private String perspective;
    private IPlatformView platformView;
    private float rotationAngle;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float scaleZ;
    private long textureId;
    private float[] transformMatrix;
    private float translationX;
    private float translationY;
    private float translationZ;
    private AtomicLong viewId;
    private PlatformViewWrapper viewWrapper;
    private int width;

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    public void onActivityPause() {
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    public void onActivityResume() {
    }

    public AcePlatformViewAosp(long j, Context context, IAceOnResourceEvent iAceOnResourceEvent) {
        super(j, iAceOnResourceEvent);
        this.textureId = 0L;
        this.viewId = new AtomicLong(0L);
        this.platformView = null;
        this.offsetX = 0;
        this.offsetY = 0;
        this.width = 0;
        this.height = 0;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.scaleZ = 1.0f;
        this.axisX = 0.0f;
        this.axisY = 0.0f;
        this.axisZ = 0.0f;
        this.rotationX = 0.0f;
        this.rotationY = 0.0f;
        this.rotationZ = 0.0f;
        this.rotationAngle = 0.0f;
        this.translationX = 0.0f;
        this.translationY = 0.0f;
        this.translationZ = 0.0f;
        this.centerX = "50%";
        this.centerY = "50%";
        this.perspective = "";
        this.isTransformMatrix = false;
        this.context = context;
        this.mainHandler = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("platformview-" + j);
        this.handlerThread = handlerThread;
        handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        if (looper != null) {
            this.asyncHandler = new Handler(looper);
        } else {
            this.asyncHandler = new Handler();
        }
    }

    public void setPlatformView(IPlatformView iPlatformView) {
        synchronized (PLATFORM_VIEW_LOCK) {
            this.platformView = iPlatformView;
        }
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    public void release() {
        runAsync(new Runnable() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewAosp$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1982x583d26fb();
            }
        });
        ViewParent parent = this.viewWrapper.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.viewWrapper);
        }
    }

    /* JADX INFO: renamed from: lambda$release$1$ohos-ace-adapter-capability-platformview-AcePlatformViewAosp, reason: not valid java name */
    /* synthetic */ void m1982x583d26fb() {
        synchronized (PLATFORM_VIEW_LOCK) {
            if (this.platformView != null) {
                runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewAosp$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1980xadc12c02();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: lambda$null$0$ohos-ace-adapter-capability-platformview-AcePlatformViewAosp, reason: not valid java name */
    /* synthetic */ void m1980xadc12c02() {
        this.platformView.onDispose();
        this.platformView = null;
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    public String registerPlatformView(Map<String, String> map) {
        if (map == null) {
            ALog.e(LOG_TAG, "registerPlatformView failed: params is null");
            return "fail";
        }
        if (this.viewWrapper == null) {
            this.viewWrapper = new PlatformViewWrapper(this.context);
        }
        if (map.containsKey(KEY_TEXTUREID)) {
            try {
                this.textureId = Integer.parseInt(map.get(KEY_TEXTUREID));
                this.viewWrapper.setSurface(getSurface());
                this.viewWrapper.setTextureId(this.textureId);
            } catch (NumberFormatException unused) {
                return "fail";
            }
        }
        runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewAosp$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1981xa676e04c();
            }
        });
        return "success";
    }

    /* JADX INFO: renamed from: lambda$registerPlatformView$2$ohos-ace-adapter-capability-platformview-AcePlatformViewAosp, reason: not valid java name */
    /* synthetic */ void m1981xa676e04c() {
        synchronized (PLATFORM_VIEW_LOCK) {
            IPlatformView iPlatformView = this.platformView;
            if (iPlatformView != null) {
                View view = iPlatformView.getView();
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                this.viewWrapper.addView(view);
                this.viewWrapper.displayPlatformView();
                platformViewReady();
            }
        }
        m1983x590a7e93();
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    public String updateLayout(Map<String, String> map) {
        if (this.viewWrapper == null) {
            this.viewWrapper = new PlatformViewWrapper(this.context);
        }
        if (map == null) {
            ALog.e(LOG_TAG, "updateLayout failed: params is null");
            return "fail";
        }
        if (!map.containsKey(PLATFORM_VIEW_HEIGHT)) {
            ALog.e(LOG_TAG, "updateLayout failed: platformViewHeight is illegal");
            return "fail";
        }
        if (!map.containsKey(PLATFORM_VIEW_WIDTH)) {
            ALog.e(LOG_TAG, "updateLayout failed: platformViewWidth is illegal");
            return "fail";
        }
        if (!map.containsKey(PLATFORM_VIEW_TOP)) {
            ALog.e(LOG_TAG, "updateLayout failed: platformViewTop is illegal");
            return "fail";
        }
        if (!map.containsKey(PLATFORM_VIEW_LEFT)) {
            ALog.e(LOG_TAG, "updateLayout failed: platformViewLeft is illegal");
            return "fail";
        }
        try {
            this.offsetX = toPhysicalPixels(Double.parseDouble(map.get(PLATFORM_VIEW_LEFT)));
            this.offsetY = toPhysicalPixels(Double.parseDouble(map.get(PLATFORM_VIEW_TOP)));
            this.width = toPhysicalPixels(Double.parseDouble(map.get(PLATFORM_VIEW_WIDTH)));
            this.height = toPhysicalPixels(Double.parseDouble(map.get(PLATFORM_VIEW_HEIGHT)));
            runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.platformview.AcePlatformViewAosp$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1983x590a7e93();
                }
            });
            return "success";
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "NumberFormatException, setSurfaceSize failed");
            return "fail";
        }
    }

    private int toPhysicalPixels(double d) {
        return (int) Math.round(d * ((double) 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateLayout, reason: merged with bridge method [inline-methods] */
    public void m1983x590a7e93() {
        if (this.viewWrapper == null) {
            ALog.e(LOG_TAG, "updateLayout failed: viewWrapper is null");
            return;
        }
        updateMatrix();
        this.viewWrapper.resize(this.width, this.height);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.width, this.height);
        layoutParams.leftMargin = this.offsetX;
        layoutParams.topMargin = this.offsetY;
        this.viewWrapper.setLayoutParams(layoutParams);
        synchronized (PLATFORM_VIEW_LOCK) {
            IPlatformView iPlatformView = this.platformView;
            if (iPlatformView != null) {
                iPlatformView.getView().setLayoutParams(new FrameLayout.LayoutParams(this.width, this.height));
            }
        }
    }

    private float calculateCameraDistance() {
        float f = this.context.getResources().getDisplayMetrics().density;
        int i = this.width;
        int i2 = this.height;
        return BigDecimal.valueOf(Math.sqrt((i * i) + (i2 * i2)) * 0.5d * ((double) f)).floatValue() * 4.0f;
    }

    private void updateMatrix() {
        float f;
        BigDecimal bigDecimalValueOf;
        if (this.viewWrapper == null) {
            this.viewWrapper = new PlatformViewWrapper(this.context);
        }
        this.viewWrapper.getPivotX();
        this.viewWrapper.getPivotY();
        float f2 = this.centerX.contains("%") ? this.width * (Float.parseFloat(this.centerX.replace("%", "")) / 100.0f) : Float.parseFloat(this.centerX);
        float f3 = this.centerY.contains("%") ? this.height * (Float.parseFloat(this.centerY.replace("%", "")) / 100.0f) : Float.parseFloat(this.centerY);
        try {
            f = Float.parseFloat(this.perspective);
        } catch (NumberFormatException unused) {
            f = 0.0f;
        }
        int i = this.context.getResources().getDisplayMetrics().densityDpi;
        if (f > 0.0f) {
            this.viewWrapper.setRotationX(-this.rotationX);
            this.viewWrapper.setRotationY(-this.rotationY);
            bigDecimalValueOf = BigDecimal.valueOf(f).multiply(BigDecimal.valueOf(i));
        } else if (f < 0.0f) {
            this.viewWrapper.setRotationX(this.rotationX);
            this.viewWrapper.setRotationY(this.rotationY);
            bigDecimalValueOf = BigDecimal.valueOf(f).multiply(BigDecimal.valueOf(i));
        } else {
            this.viewWrapper.setRotationX(this.rotationX);
            this.viewWrapper.setRotationY(this.rotationY);
            bigDecimalValueOf = BigDecimal.valueOf(calculateCameraDistance());
        }
        this.viewWrapper.setRotation(this.rotationZ);
        this.viewWrapper.setTranslationX(this.translationX);
        this.viewWrapper.setTranslationY(this.translationY);
        this.viewWrapper.setTranslationZ(this.translationZ);
        this.viewWrapper.setPivotX(f2);
        this.viewWrapper.setPivotY(f3);
        this.viewWrapper.setScaleX(this.scaleX);
        this.viewWrapper.setScaleY(this.scaleY);
        if (!this.isTransformMatrix) {
            this.viewWrapper.setCameraDistance(bigDecimalValueOf.floatValue());
        } else {
            this.viewWrapper.setCameraDistance(Float.MAX_VALUE);
        }
    }

    public void processTouchEvent() {
        MotionEvent motionEvent = getMotionEvent();
        if (motionEvent != null) {
            synchronized (PLATFORM_VIEW_LOCK) {
                IPlatformView iPlatformView = this.platformView;
                if (iPlatformView != null) {
                    iPlatformView.getView().dispatchTouchEvent(motionEvent);
                }
            }
        }
    }

    private MotionEvent getMotionEvent() {
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent == null) {
            return null;
        }
        int pointerCount = motionEvent.getPointerCount();
        Matrix matrix = new Matrix(this.viewWrapper.getMatrix());
        Matrix matrix2 = new Matrix();
        boolean zInvert = matrix.invert(matrix2);
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i = 0; i < this.motionEvent.getPointerCount(); i++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i] = pointerProperties;
            this.motionEvent.getPointerProperties(i, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            this.motionEvent.getPointerCoords(i, pointerCoords);
            float[] fArr = {pointerCoords.x - this.offsetX, pointerCoords.y - this.offsetY};
            if (zInvert) {
                matrix2.mapPoints(fArr);
            }
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i] = pointerCoords2;
            pointerCoords2.x = fArr[0];
            pointerCoordsArr[i].y = fArr[1];
        }
        return MotionEvent.obtain(this.motionEvent.getDownTime(), this.motionEvent.getEventTime(), this.motionEvent.getAction(), this.motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, this.motionEvent.getMetaState(), this.motionEvent.getButtonState(), this.motionEvent.getXPrecision(), this.motionEvent.getYPrecision(), this.motionEvent.getDeviceId(), this.motionEvent.getEdgeFlags(), this.motionEvent.getSource(), this.motionEvent.getFlags());
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    /* JADX INFO: renamed from: touchDown */
    public String m1984x4418ece9(Map<String, String> map) {
        if (!map.containsKey(PLATFORM_VIEW_TOUCH_POINT_OFFSET_X)) {
            ALog.e(LOG_TAG, "touchDown failed: platformViewTouchPointOffsetX is illegal");
            return "fail";
        }
        if (!map.containsKey(PLATFORM_VIEW_TOUCH_POINT_OFFSET_Y)) {
            ALog.e(LOG_TAG, "touchDown failed: platformViewTouchPointOffsetX is illegal");
            return "fail";
        }
        processTouchEvent();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    /* JADX INFO: renamed from: touchUp */
    public String m1985xd8575c88(Map<String, String> map) {
        if (!map.containsKey(PLATFORM_VIEW_TOUCH_POINT_OFFSET_X)) {
            ALog.e(LOG_TAG, "touchUp failed: platformViewTouchPointOffsetX is illegal");
            return "fail";
        }
        if (!map.containsKey(PLATFORM_VIEW_TOUCH_POINT_OFFSET_Y)) {
            ALog.e(LOG_TAG, "touchUp failed: platformViewTouchPointOffsetX is illegal");
            return "fail";
        }
        processTouchEvent();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    /* JADX INFO: renamed from: touchMove */
    public String m1986x6c95cc27(Map<String, String> map) {
        if (!map.containsKey(PLATFORM_VIEW_TOUCH_POINT_OFFSET_X)) {
            ALog.e(LOG_TAG, "touchMove failed: platformViewTouchPointOffsetX is illegal");
            return "fail";
        }
        if (!map.containsKey(PLATFORM_VIEW_TOUCH_POINT_OFFSET_Y)) {
            ALog.e(LOG_TAG, "touchMove failed: platformViewTouchPointOffsetX is illegal");
            return "fail";
        }
        processTouchEvent();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    /* JADX INFO: renamed from: touchCancel */
    public String m1987xd43bc6(Map<String, String> map) {
        if (!map.containsKey(PLATFORM_VIEW_TOUCH_POINT_OFFSET_X)) {
            ALog.e(LOG_TAG, "touchCancel failed: platformViewTouchPointOffsetX is illegal");
            return "fail";
        }
        if (!map.containsKey(PLATFORM_VIEW_TOUCH_POINT_OFFSET_Y)) {
            ALog.e(LOG_TAG, "touchCancel failed: platformViewTouchPointOffsetX is illegal");
            return "fail";
        }
        processTouchEvent();
        return "success";
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    /* JADX INFO: renamed from: dispose */
    public String m1988x9512ab65(Map<String, String> map) {
        synchronized (PLATFORM_VIEW_LOCK) {
            IPlatformView iPlatformView = this.platformView;
            if (iPlatformView != null) {
                iPlatformView.onDispose();
                this.platformView = null;
            }
        }
        return "success";
    }

    private Float parseFloatParam(Map<String, String> map, String str, Float f) {
        if (map.containsKey(str)) {
            try {
                return Float.valueOf(Float.parseFloat(map.get(str)));
            } catch (NumberFormatException unused) {
                ALog.e(LOG_TAG, "parse failed " + str);
            }
        }
        return f;
    }

    private String parseStringParam(Map<String, String> map, String str, String str2) {
        return map.containsKey(str) ? map.get(str) : str2;
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    /* JADX INFO: renamed from: setScale */
    public String m1989x29511b04(Map<String, String> map) {
        Float fValueOf = Float.valueOf(1.0f);
        this.scaleX = parseFloatParam(map, X, fValueOf).floatValue();
        this.scaleY = parseFloatParam(map, "Y", fValueOf).floatValue();
        this.scaleZ = parseFloatParam(map, Z, fValueOf).floatValue();
        this.centerX = parseStringParam(map, CENTER_X, "50%");
        this.centerY = parseStringParam(map, CENTER_Y, "50%");
        return "success";
    }

    private static BigDecimal sqrt(BigDecimal bigDecimal, int i) {
        if (bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
            return BigDecimal.ZERO;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(2L);
        BigDecimal bigDecimal2 = new BigDecimal(Math.sqrt(bigDecimal.doubleValue()));
        while (true) {
            BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, i, RoundingMode.HALF_UP).add(bigDecimal2).divide(bigDecimalValueOf, i, RoundingMode.HALF_UP);
            if (bigDecimalDivide.equals(bigDecimal2)) {
                return bigDecimalDivide;
            }
            bigDecimal2 = bigDecimalDivide;
        }
    }

    private void calculateRotationComponents(float f, float f2, float f3, float f4) {
        MathContext mathContext = new MathContext(20, RoundingMode.HALF_UP);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(f);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(f2);
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(f3);
        BigDecimal bigDecimalSqrt = sqrt(bigDecimalValueOf.multiply(bigDecimalValueOf, mathContext).add(bigDecimalValueOf2.multiply(bigDecimalValueOf2, mathContext), mathContext).add(bigDecimalValueOf3.multiply(bigDecimalValueOf3, mathContext), mathContext), 20);
        if (bigDecimalSqrt.compareTo(BigDecimal.ZERO) <= 0) {
            bigDecimalSqrt = BigDecimal.ONE;
        }
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(f4).divide(bigDecimalSqrt, mathContext);
        this.rotationX = bigDecimalDivide.multiply(bigDecimalValueOf, mathContext).floatValue();
        this.rotationY = bigDecimalDivide.multiply(bigDecimalValueOf2, mathContext).floatValue();
        this.rotationZ = bigDecimalDivide.multiply(bigDecimalValueOf3, mathContext).floatValue();
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    /* JADX INFO: renamed from: setRotation */
    public String m1991x51cdfa42(Map<String, String> map) {
        Float fValueOf = Float.valueOf(0.0f);
        this.axisX = parseFloatParam(map, X, fValueOf).floatValue();
        this.axisY = parseFloatParam(map, "Y", fValueOf).floatValue();
        this.axisZ = parseFloatParam(map, Z, fValueOf).floatValue();
        this.rotationAngle = parseFloatParam(map, ANGLE, fValueOf).floatValue();
        this.centerX = parseStringParam(map, CENTER_X, "50%");
        this.centerY = parseStringParam(map, CENTER_Y, "50%");
        this.perspective = parseStringParam(map, PERSPECTIVE, "");
        calculateRotationComponents(this.axisX, this.axisY, this.axisZ, this.rotationAngle);
        return "success";
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    /* JADX INFO: renamed from: setTranslation */
    public String m1990xbd8f8aa3(Map<String, String> map) {
        Float fValueOf = Float.valueOf(0.0f);
        this.translationX = parseFloatParam(map, X, fValueOf).floatValue();
        this.translationY = parseFloatParam(map, "Y", fValueOf).floatValue();
        this.translationZ = parseFloatParam(map, Z, fValueOf).floatValue();
        this.translationX *= this.context.getResources().getDisplayMetrics().density;
        this.translationY *= this.context.getResources().getDisplayMetrics().density;
        this.translationZ *= this.context.getResources().getDisplayMetrics().density;
        return "success";
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    /* JADX INFO: renamed from: setTransformMatrix */
    public String m1992xe60c69e1(Map<String, String> map) {
        this.transformMatrix = new float[16];
        for (int i = 0; i < 16; i++) {
            String str = FitRunPlayAudio.OPPORTUNITY_M + i;
            if (!map.containsKey(str)) {
                ALog.e(LOG_TAG, "setTransformMatrix failed: missing key " + str);
                return "fail";
            }
            try {
                this.transformMatrix[i] = Float.parseFloat(map.get(str));
            } catch (NumberFormatException unused) {
                ALog.e(LOG_TAG, "setTransformMatrix failed: parse error for " + str);
                return "fail";
            }
        }
        float f = this.transformMatrix[15];
        if (Float.compare(f, 0.0f) == 0) {
            f = 1.0f;
        }
        this.affineMatrix = new float[16];
        for (int i2 = 0; i2 < 16; i2++) {
            this.affineMatrix[i2] = this.transformMatrix[i2] / f;
        }
        extractScale();
        extractRotation();
        extractTranslation(this.transformMatrix);
        this.isTransformMatrix = true;
        return "success";
    }

    private void extractScale() {
        MathContext mathContext = new MathContext(20, RoundingMode.HALF_UP);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.affineMatrix[0]);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(this.affineMatrix[1]);
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(this.affineMatrix[2]);
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(this.affineMatrix[4]);
        BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(this.affineMatrix[5]);
        BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(this.affineMatrix[6]);
        BigDecimal bigDecimalValueOf7 = BigDecimal.valueOf(this.affineMatrix[8]);
        BigDecimal bigDecimalValueOf8 = BigDecimal.valueOf(this.affineMatrix[9]);
        BigDecimal bigDecimalValueOf9 = BigDecimal.valueOf(this.affineMatrix[10]);
        BigDecimal bigDecimalAdd = bigDecimalValueOf.multiply(bigDecimalValueOf, mathContext).add(bigDecimalValueOf2.multiply(bigDecimalValueOf2, mathContext), mathContext).add(bigDecimalValueOf3.multiply(bigDecimalValueOf3, mathContext), mathContext);
        BigDecimal bigDecimalAdd2 = bigDecimalValueOf4.multiply(bigDecimalValueOf4, mathContext).add(bigDecimalValueOf5.multiply(bigDecimalValueOf5, mathContext), mathContext).add(bigDecimalValueOf6.multiply(bigDecimalValueOf6, mathContext), mathContext);
        BigDecimal bigDecimalAdd3 = bigDecimalValueOf7.multiply(bigDecimalValueOf7, mathContext).add(bigDecimalValueOf8.multiply(bigDecimalValueOf8, mathContext), mathContext).add(bigDecimalValueOf9.multiply(bigDecimalValueOf9, mathContext), mathContext);
        this.scaleX = sqrt(bigDecimalAdd, 20).floatValue();
        this.scaleY = sqrt(bigDecimalAdd2, 20).floatValue();
        this.scaleZ = sqrt(bigDecimalAdd3, 20).floatValue();
        if (Float.compare(this.scaleX, 0.0f) == 0) {
            this.scaleX = 1.0f;
        }
        if (Float.compare(this.scaleY, 0.0f) == 0) {
            this.scaleY = 1.0f;
        }
        if (Float.compare(this.scaleZ, 0.0f) == 0) {
            this.scaleZ = 1.0f;
        }
    }

    private void extractRotation() {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.scaleX);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(this.scaleY);
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(this.scaleZ);
        if (bigDecimalValueOf.compareTo(BigDecimal.ZERO) == 0) {
            bigDecimalValueOf = BigDecimal.ONE;
        }
        if (bigDecimalValueOf2.compareTo(BigDecimal.ZERO) == 0) {
            bigDecimalValueOf2 = BigDecimal.ONE;
        }
        if (bigDecimalValueOf3.compareTo(BigDecimal.ZERO) == 0) {
            bigDecimalValueOf3 = BigDecimal.ONE;
        }
        MathContext mathContext = new MathContext(20, RoundingMode.HALF_UP);
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(this.affineMatrix[0]).divide(bigDecimalValueOf, mathContext);
        BigDecimal bigDecimalDivide2 = BigDecimal.valueOf(this.affineMatrix[4]).divide(bigDecimalValueOf2, mathContext);
        BigDecimal bigDecimalDivide3 = BigDecimal.valueOf(this.affineMatrix[8]).divide(bigDecimalValueOf3, mathContext);
        BigDecimal bigDecimalDivide4 = BigDecimal.valueOf(this.affineMatrix[9]).divide(bigDecimalValueOf3, mathContext);
        BigDecimal bigDecimalDivide5 = BigDecimal.valueOf(this.affineMatrix[10]).divide(bigDecimalValueOf3, mathContext);
        this.rotationY = -((float) Math.atan2(-bigDecimalDivide3.doubleValue(), sqrt(bigDecimalDivide4.multiply(bigDecimalDivide4, mathContext).add(bigDecimalDivide5.multiply(bigDecimalDivide5, mathContext)), 20).doubleValue()));
        this.rotationX = -((float) Math.atan2(bigDecimalDivide4.doubleValue(), bigDecimalDivide5.doubleValue()));
        this.rotationZ = -((float) Math.atan2(bigDecimalDivide2.doubleValue(), bigDecimalDivide.doubleValue()));
        this.rotationX = (float) Math.toDegrees(this.rotationX);
        this.rotationY = (float) Math.toDegrees(this.rotationY);
        this.rotationZ = (float) Math.toDegrees(this.rotationZ);
    }

    private void extractTranslation(float[] fArr) {
        MathContext mathContext = new MathContext(20, RoundingMode.HALF_UP);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(fArr[12]);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(fArr[13]);
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(fArr[14]);
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(fArr[3]);
        BigDecimal bigDecimalValueOf5 = BigDecimal.valueOf(fArr[7]);
        BigDecimal bigDecimalValueOf6 = BigDecimal.valueOf(fArr[11]);
        this.translationX = bigDecimalValueOf.subtract(bigDecimalValueOf4, mathContext).floatValue();
        this.translationY = bigDecimalValueOf2.subtract(bigDecimalValueOf5, mathContext).floatValue();
        this.translationZ = bigDecimalValueOf3.subtract(bigDecimalValueOf6, mathContext).floatValue();
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    public void setTouchEvent(MotionEvent motionEvent) {
        this.motionEvent = MotionEvent.obtain(motionEvent);
    }

    @Override // ohos.ace.adapter.capability.platformview.AcePlatformViewBase
    public String runAsync(Runnable runnable) {
        this.asyncHandler.post(runnable);
        return "success";
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    private Surface getSurface() {
        SurfaceTexture surfaceTexture = AceTextureHolder.getSurfaceTexture(this.textureId);
        if (surfaceTexture != null) {
            return new Surface(surfaceTexture);
        }
        return null;
    }

    public long getAtomicId() {
        return this.viewId.getAndIncrement();
    }
}
