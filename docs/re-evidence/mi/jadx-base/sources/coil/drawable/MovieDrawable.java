package coil.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import coil.decode.DecodeUtils;
import coil.size.Scale;
import coil.transform.AnimatedTransformation;
import coil.transform.PixelOpacity;
import coil.util.GifUtils;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.cb1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0001dB%\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\b\b\u0002\u00104\u001a\u000203\u0012\b\b\u0002\u00109\u001a\u000208¢\u0006\u0004\bb\u0010cJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u001e\u0010\u0015J\u0019\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u0015J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010'R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020)0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010O\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0016\u0010P\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010MR\u0016\u0010%\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010VR\u0016\u0010W\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010VR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010QR\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006e"}, d2 = {"Lcoil/drawable/MovieDrawable;", "Landroid/graphics/drawable/Drawable;", "", "", "updateFrameTime", "()Z", "Landroid/graphics/Canvas;", "canvas", "", "drawFrame", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "bounds", "updateBounds", "(Landroid/graphics/Rect;)V", "draw", "", "repeatCount", "setRepeatCount", "(I)V", "getRepeatCount", "()I", "Lcoil/transform/AnimatedTransformation;", "animatedTransformation", "setAnimatedTransformation", "(Lcoil/transform/AnimatedTransformation;)V", "getAnimatedTransformation", "()Lcoil/transform/AnimatedTransformation;", SleepAnalyzerAlpha.NAME_ALPHA, "setAlpha", "getOpacity", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getIntrinsicWidth", "getIntrinsicHeight", "isRunning", StatConstants.PARAM_START, "()V", BroadcastsKt.SILENT_PUSHING_STOP, "Lcb1;", "callback", "registerAnimationCallback", "(Lcb1;)V", "unregisterAnimationCallback", "(Lcb1;)Z", "clearAnimationCallbacks", "Landroid/graphics/Movie;", "movie", "Landroid/graphics/Movie;", "Landroid/graphics/Bitmap$Config;", q.f13857a, "Landroid/graphics/Bitmap$Config;", "getConfig", "()Landroid/graphics/Bitmap$Config;", "Lcoil/size/Scale;", "scale", "Lcoil/size/Scale;", "getScale", "()Lcoil/size/Scale;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "", "callbacks", "Ljava/util/List;", "currentBounds", "Landroid/graphics/Rect;", "tempCanvasBounds", "softwareCanvas", "Landroid/graphics/Canvas;", "Landroid/graphics/Bitmap;", "softwareBitmap", "Landroid/graphics/Bitmap;", "", "softwareScale", "F", "hardwareScale", "hardwareDx", "hardwareDy", "Z", "", "startTimeMillis", "J", "frameTimeMillis", "I", "loopIteration", "Lcoil/transform/AnimatedTransformation;", "Landroid/graphics/Picture;", "animatedTransformationPicture", "Landroid/graphics/Picture;", "Lcoil/transform/PixelOpacity;", "pixelOpacity", "Lcoil/transform/PixelOpacity;", "isSoftwareScalingEnabled", "getBounds", "(Landroid/graphics/Canvas;)Landroid/graphics/Rect;", "<init>", "(Landroid/graphics/Movie;Landroid/graphics/Bitmap$Config;Lcoil/size/Scale;)V", "Companion", "coil-gif_release"}, k = 1, mv = {1, 7, 1})
public final class MovieDrawable extends Drawable implements Animatable {
    public static final int REPEAT_INFINITE = -1;

    @Nullable
    private AnimatedTransformation animatedTransformation;

    @Nullable
    private Picture animatedTransformationPicture;

    @NotNull
    private final List<cb1> callbacks;

    @NotNull
    private final Bitmap.Config config;

    @NotNull
    private final Rect currentBounds;
    private long frameTimeMillis;
    private float hardwareDx;
    private float hardwareDy;
    private float hardwareScale;
    private boolean isRunning;
    private boolean isSoftwareScalingEnabled;
    private int loopIteration;

    @NotNull
    private final Movie movie;

    @NotNull
    private final Paint paint;

    @NotNull
    private PixelOpacity pixelOpacity;
    private int repeatCount;

    @NotNull
    private final Scale scale;

    @Nullable
    private Bitmap softwareBitmap;

    @Nullable
    private Canvas softwareCanvas;
    private float softwareScale;
    private long startTimeMillis;

    @NotNull
    private final Rect tempCanvasBounds;

    @JvmOverloads
    public MovieDrawable(@NotNull Movie movie) {
        this(movie, null, null, 6, null);
    }

    private final void drawFrame(Canvas canvas) {
        Canvas canvas2 = this.softwareCanvas;
        Bitmap bitmap = this.softwareBitmap;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.softwareScale;
            canvas2.scale(f, f);
            this.movie.draw(canvas2, 0.0f, 0.0f, this.paint);
            Picture picture = this.animatedTransformationPicture;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.hardwareDx, this.hardwareDy);
                float f2 = this.hardwareScale;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    private final Rect getBounds(Canvas canvas) {
        Rect rect = this.tempCanvasBounds;
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        return rect;
    }

    private final void updateBounds(Rect bounds) {
        if (Intrinsics.areEqual(this.currentBounds, bounds)) {
            return;
        }
        this.currentBounds.set(bounds);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int iWidth2 = this.movie.width();
        int iHeight2 = this.movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        double dComputeSizeMultiplier = DecodeUtils.computeSizeMultiplier(iWidth2, iHeight2, iWidth, iHeight, this.scale);
        if (!this.isSoftwareScalingEnabled) {
            dComputeSizeMultiplier = RangesKt___RangesKt.coerceAtMost(dComputeSizeMultiplier, 1.0d);
        }
        float f = (float) dComputeSizeMultiplier;
        this.softwareScale = f;
        int i = (int) (iWidth2 * f);
        int i2 = (int) (f * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, this.config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        Bitmap bitmap = this.softwareBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.softwareBitmap = bitmapCreateBitmap;
        this.softwareCanvas = new Canvas(bitmapCreateBitmap);
        if (this.isSoftwareScalingEnabled) {
            this.hardwareScale = 1.0f;
            this.hardwareDx = 0.0f;
            this.hardwareDy = 0.0f;
        } else {
            float fComputeSizeMultiplier = (float) DecodeUtils.computeSizeMultiplier(i, i2, iWidth, iHeight, this.scale);
            this.hardwareScale = fComputeSizeMultiplier;
            float f2 = iWidth - (i * fComputeSizeMultiplier);
            float f3 = 2;
            this.hardwareDx = bounds.left + (f2 / f3);
            this.hardwareDy = bounds.top + ((iHeight - (fComputeSizeMultiplier * i2)) / f3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean updateFrameTime() {
        boolean z;
        int iDuration = this.movie.duration();
        int i = 0;
        if (iDuration == 0) {
            z = 0;
        } else {
            if (this.isRunning) {
                this.frameTimeMillis = SystemClock.uptimeMillis();
            }
            int i2 = (int) (this.frameTimeMillis - this.startTimeMillis);
            int i3 = i2 / iDuration;
            this.loopIteration = i3;
            int i4 = this.repeatCount;
            i = (i4 == -1 || i3 <= i4) ? 1 : 0;
            if (i != 0) {
                iDuration = i2 - (i3 * iDuration);
            }
            int i5 = i;
            i = iDuration;
            z = i5;
        }
        this.movie.setTime(i);
        return z;
    }

    public void clearAnimationCallbacks() {
        this.callbacks.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        boolean zUpdateFrameTime = updateFrameTime();
        if (this.isSoftwareScalingEnabled) {
            updateBounds(getBounds(canvas));
            int iSave = canvas.save();
            try {
                float f = 1 / this.softwareScale;
                canvas.scale(f, f);
                drawFrame(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            updateBounds(getBounds());
            drawFrame(canvas);
        }
        if (this.isRunning && zUpdateFrameTime) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Nullable
    public final AnimatedTransformation getAnimatedTransformation() {
        return this.animatedTransformation;
    }

    @NotNull
    public final Bitmap.Config getConfig() {
        return this.config;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.movie.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.movie.width();
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        PixelOpacity pixelOpacity;
        return (this.paint.getAlpha() == 255 && ((pixelOpacity = this.pixelOpacity) == PixelOpacity.OPAQUE || (pixelOpacity == PixelOpacity.UNCHANGED && this.movie.isOpaque()))) ? -1 : -3;
    }

    public final int getRepeatCount() {
        return this.repeatCount;
    }

    @NotNull
    public final Scale getScale() {
        return this.scale;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.isRunning;
    }

    public void registerAnimationCallback(@NotNull cb1 callback) {
        this.callbacks.add(callback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (alpha >= 0 && alpha < 256) {
            this.paint.setAlpha(alpha);
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + alpha).toString());
    }

    public final void setAnimatedTransformation(@Nullable AnimatedTransformation animatedTransformation) {
        this.animatedTransformation = animatedTransformation;
        if (animatedTransformation == null || this.movie.width() <= 0 || this.movie.height() <= 0) {
            this.animatedTransformationPicture = null;
            this.pixelOpacity = PixelOpacity.UNCHANGED;
            this.isSoftwareScalingEnabled = false;
        } else {
            Picture picture = new Picture();
            this.pixelOpacity = animatedTransformation.transform(picture.beginRecording(this.movie.width(), this.movie.height()));
            picture.endRecording();
            this.animatedTransformationPicture = picture;
            this.isSoftwareScalingEnabled = true;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public final void setRepeatCount(int repeatCount) {
        if (repeatCount >= -1) {
            this.repeatCount = repeatCount;
            return;
        }
        throw new IllegalArgumentException(("Invalid repeatCount: " + repeatCount).toString());
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        this.loopIteration = 0;
        this.startTimeMillis = SystemClock.uptimeMillis();
        List<cb1> list = this.callbacks;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.isRunning) {
            this.isRunning = false;
            List<cb1> list = this.callbacks;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).onAnimationEnd(this);
            }
        }
    }

    public boolean unregisterAnimationCallback(@NotNull cb1 callback) {
        return this.callbacks.remove(callback);
    }

    @JvmOverloads
    public MovieDrawable(@NotNull Movie movie, @NotNull Bitmap.Config config) {
        this(movie, config, null, 4, null);
    }

    public /* synthetic */ MovieDrawable(Movie movie, Bitmap.Config config, Scale scale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(movie, (i & 2) != 0 ? Bitmap.Config.ARGB_8888 : config, (i & 4) != 0 ? Scale.FIT : scale);
    }

    @JvmOverloads
    public MovieDrawable(@NotNull Movie movie, @NotNull Bitmap.Config config, @NotNull Scale scale) {
        this.movie = movie;
        this.config = config;
        this.scale = scale;
        this.paint = new Paint(3);
        this.callbacks = new ArrayList();
        this.currentBounds = new Rect();
        this.tempCanvasBounds = new Rect();
        this.softwareScale = 1.0f;
        this.hardwareScale = 1.0f;
        this.repeatCount = -1;
        this.pixelOpacity = PixelOpacity.UNCHANGED;
        if (!(!GifUtils.isHardware(config))) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.".toString());
        }
    }
}
