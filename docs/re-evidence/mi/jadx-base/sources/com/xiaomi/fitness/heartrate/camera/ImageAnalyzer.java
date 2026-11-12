package com.xiaomi.fitness.heartrate.camera;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.g;
import androidx.camera.core.m;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.cj8;
import defpackage.f43;
import defpackage.gmf;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001\u0017B\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/heartrate/camera/ImageAnalyzer;", "Lgmf;", "Lcom/xiaomi/fitness/heartrate/camera/DetectResult;", "Landroidx/camera/core/g$a;", "Landroidx/camera/core/m;", "image", "", "analyze", "(Landroidx/camera/core/m;)V", "", "colorAvg", "analyzeImage", "([F)V", LifecycleConstantKt.ON_PAUSE, "()V", LifecycleConstantKt.ON_RESUME, "", "mLast", "J", "", "mPaused", "Z", "<init>", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ImageAnalyzer extends gmf<DetectResult> implements g.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "ImageAnalyzer";
    private long mLast;
    private volatile boolean mPaused;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/heartrate/camera/ImageAnalyzer$Companion;", "", "Lf43;", "bmpResult", "", "avgRed", "avgGreen", "", "parseBmpResult", "(Lf43;FF)Ljava/lang/String;", "TAG", "Ljava/lang/String;", "<init>", "()V", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String parseBmpResult(@Nullable f43 bmpResult, float avgRed, float avgGreen) {
            if (bmpResult == null) {
                return "bmpResult is null";
            }
            int iA = bmpResult.a();
            int iB = bmpResult.b();
            String string = bmpResult.c().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "avg = %d,bmp = %d,state = %s, r = %f, g = %f", Arrays.copyOf(new Object[]{Integer.valueOf(iA), Integer.valueOf(iB), string, Float.valueOf(avgRed), Float.valueOf(avgGreen)}, 5));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
    }

    @Override // androidx.camera.core.g.a
    public void analyze(@NotNull m image) {
        Intrinsics.checkNotNullParameter(image, "image");
        if (this.mPaused) {
            image.close();
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            float[] fArrYuvToAvgColor = YuvToRgbConverter.INSTANCE.yuvToAvgColor(image);
            image.close();
            analyzeImage(fArrYuvToAvgColor);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Logger.d(TAG, "analyze: cost = " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + ", image update = " + (jCurrentTimeMillis2 - this.mLast));
            AutoCloseableKt.closeFinally(image, null);
            this.mLast = jCurrentTimeMillis2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(image, th);
                throw th2;
            }
        }
    }

    public final void analyzeImage(@NotNull float[] colorAvg) {
        Intrinsics.checkNotNullParameter(colorAvg, "colorAvg");
        float f = colorAvg[0];
        float f2 = colorAvg[1];
        BmpMonitorHelper bmpMonitorHelper = BmpMonitorHelper.INSTANCE;
        f43 f43VarExtractBmp = bmpMonitorHelper.extractBmp(f, f2);
        boolean zIsFingerTip = bmpMonitorHelper.isFingerTip(f, f2);
        Logger.d(TAG, "analyze:" + INSTANCE.parseBmpResult(f43VarExtractBmp, f, f2));
        postValue(new DetectResult(f43VarExtractBmp, zIsFingerTip));
    }

    @Override // androidx.camera.core.g.a
    @cj8
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    @Override // androidx.camera.core.g.a
    @cj8
    public /* bridge */ /* synthetic */ Size getTargetResolutionOverride() {
        return super.getTargetResolutionOverride();
    }

    public final void onPause() {
        this.mPaused = true;
    }

    public final void onResume() {
        this.mPaused = false;
    }

    @Override // androidx.camera.core.g.a
    @cj8
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }
}
