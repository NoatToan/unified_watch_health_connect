package coil.drawable;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import coil.decode.DecodeUtils;
import coil.size.Scale;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.cb1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0011\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001pBE\b\u0007\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010l\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010T\u001a\u00020S\u0012\b\b\u0002\u0010X\u001a\u00020\u0004\u0012\b\b\u0002\u0010[\u001a\u00020!\u0012\b\b\u0002\u0010^\u001a\u00020!¢\u0006\u0004\bn\u0010oJ#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0015\u0010\u0011J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0004H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0011J\u001f\u0010-\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00012\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0001H\u0016¢\u0006\u0004\b/\u00100J'\u00103\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00012\u0006\u0010,\u001a\u00020+2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\t2\u0006\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\u0014J\u0019\u00109\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010A\u001a\u00020\t2\b\u0010@\u001a\u0004\u0018\u00010?H\u0017¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020!H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\tH\u0016¢\u0006\u0004\bE\u0010\u000bJ\u000f\u0010F\u001a\u00020\tH\u0016¢\u0006\u0004\bF\u0010\u000bJ\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020!2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\bM\u0010\u000bJ\u001f\u0010R\u001a\u00020\t2\u0006\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\u001cH\u0001¢\u0006\u0004\bP\u0010QR\u0017\u0010T\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010\u0011R\u0017\u0010[\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010DR\u0017\u0010^\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b^\u0010\\\u001a\u0004\b_\u0010DR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020G0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010YR\u0014\u0010d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010YR\u0016\u0010e\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010YR\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010YR(\u0010E\u001a\u0004\u0018\u00010\u00012\b\u0010h\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bE\u0010i\u001a\u0004\bj\u0010kR\u0019\u0010l\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bl\u0010i\u001a\u0004\bm\u0010k¨\u0006q"}, d2 = {"Lcoil/drawable/CrossfadeDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "", "", "startSize", "endSize", "computeIntrinsicDimension", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", "", "markDone", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "getAlpha", "()I", SleepAnalyzerAlpha.NAME_ALPHA, "setAlpha", "(I)V", "getOpacity", "Landroid/graphics/ColorFilter;", "getColorFilter", "()Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "level", "", "onLevelChange", "(I)Z", "", "state", "onStateChange", "([I)Z", "getIntrinsicWidth", "getIntrinsicHeight", "who", "Ljava/lang/Runnable;", "what", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "when", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "tintColor", "setTint", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "blendMode", "setTintBlendMode", "(Landroid/graphics/BlendMode;)V", "isRunning", "()Z", StatConstants.PARAM_START, BroadcastsKt.SILENT_PUSHING_STOP, "Lcb1;", "callback", "registerAnimationCallback", "(Lcb1;)V", "unregisterAnimationCallback", "(Lcb1;)Z", "clearAnimationCallbacks", "drawable", "targetBounds", "updateBounds$coil_base_release", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Rect;)V", "updateBounds", "Lcoil/size/Scale;", "scale", "Lcoil/size/Scale;", "getScale", "()Lcoil/size/Scale;", "durationMillis", "I", "getDurationMillis", "fadeStart", "Z", "getFadeStart", "preferExactIntrinsicSize", "getPreferExactIntrinsicSize", "", "callbacks", "Ljava/util/List;", "intrinsicWidth", "intrinsicHeight", "startTimeMillis", "J", "maxAlpha", "<set-?>", "Landroid/graphics/drawable/Drawable;", "getStart", "()Landroid/graphics/drawable/Drawable;", StatConstants.PARAM_END, "getEnd", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/size/Scale;IZZ)V", "Companion", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class CrossfadeDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int DEFAULT_DURATION = 100;
    private static final int STATE_DONE = 2;
    private static final int STATE_RUNNING = 1;
    private static final int STATE_START = 0;

    @NotNull
    private final List<cb1> callbacks;
    private final int durationMillis;

    @Nullable
    private final Drawable end;
    private final boolean fadeStart;
    private final int intrinsicHeight;
    private final int intrinsicWidth;
    private int maxAlpha;
    private final boolean preferExactIntrinsicSize;

    @NotNull
    private final Scale scale;

    @Nullable
    private Drawable start;
    private long startTimeMillis;
    private int state;

    @JvmOverloads
    public CrossfadeDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this(drawable, drawable2, null, 0, false, false, 60, null);
    }

    private final int computeIntrinsicDimension(Integer startSize, Integer endSize) {
        if (this.preferExactIntrinsicSize || ((startSize == null || startSize.intValue() != -1) && (endSize == null || endSize.intValue() != -1))) {
            return Math.max(startSize != null ? startSize.intValue() : -1, endSize != null ? endSize.intValue() : -1);
        }
        return -1;
    }

    private final void markDone() {
        this.state = 2;
        this.start = null;
        List<cb1> list = this.callbacks;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onAnimationEnd(this);
        }
    }

    public void clearAnimationCallbacks() {
        this.callbacks.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Drawable drawable;
        int i = this.state;
        if (i == 0) {
            Drawable drawable2 = this.start;
            if (drawable2 != null) {
                drawable2.setAlpha(this.maxAlpha);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        if (i == 2) {
            Drawable drawable3 = this.end;
            if (drawable3 != null) {
                drawable3.setAlpha(this.maxAlpha);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.startTimeMillis) / ((double) this.durationMillis);
        double dCoerceIn = RangesKt___RangesKt.coerceIn(dUptimeMillis, 0.0d, 1.0d);
        int i2 = this.maxAlpha;
        int i3 = (int) (dCoerceIn * ((double) i2));
        if (this.fadeStart) {
            i2 -= i3;
        }
        boolean z = dUptimeMillis >= 1.0d;
        if (!z && (drawable = this.start) != null) {
            drawable.setAlpha(i2);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave3);
                throw th;
            }
        }
        Drawable drawable4 = this.end;
        if (drawable4 != null) {
            drawable4.setAlpha(i3);
            int iSave4 = canvas.save();
            try {
                drawable4.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave4);
                throw th2;
            }
        }
        if (z) {
            markDone();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.maxAlpha;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i = this.state;
        if (i == 0) {
            Drawable drawable2 = this.start;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (i != 1) {
            if (i == 2 && (drawable = this.end) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.end;
        if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable4 = this.start;
        if (drawable4 != null) {
            return drawable4.getColorFilter();
        }
        return null;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @Nullable
    public final Drawable getEnd() {
        return this.end;
    }

    public final boolean getFadeStart() {
        return this.fadeStart;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.intrinsicHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.intrinsicWidth;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        Drawable drawable = this.start;
        Drawable drawable2 = this.end;
        int i = this.state;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.preferExactIntrinsicSize;
    }

    @NotNull
    public final Scale getScale() {
        return this.scale;
    }

    @Nullable
    public final Drawable getStart() {
        return this.start;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable who) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.state == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Drawable drawable = this.start;
        if (drawable != null) {
            updateBounds$coil_base_release(drawable, bounds);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            updateBounds$coil_base_release(drawable2, bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        Drawable drawable = this.start;
        boolean level2 = drawable != null ? drawable.setLevel(level) : false;
        Drawable drawable2 = this.end;
        return level2 || (drawable2 != null ? drawable2.setLevel(level) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NotNull int[] state) {
        Drawable drawable = this.start;
        boolean state2 = drawable != null ? drawable.setState(state) : false;
        Drawable drawable2 = this.end;
        return state2 || (drawable2 != null ? drawable2.setState(state) : false);
    }

    public void registerAnimationCallback(@NotNull cb1 callback) {
        this.callbacks.add(callback);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NotNull Drawable who, @NotNull Runnable what, long when) {
        scheduleSelf(what, when);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (alpha >= 0 && alpha < 256) {
            this.maxAlpha = alpha;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + alpha).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.end;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int tintColor) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTint(tintColor);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTint(tintColor);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(29)
    public void setTintBlendMode(@Nullable BlendMode blendMode) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList tint) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintList(tint);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintList(tint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode tintMode) {
        Drawable drawable = this.start;
        if (drawable != null) {
            drawable.setTintMode(tintMode);
        }
        Drawable drawable2 = this.end;
        if (drawable2 != null) {
            drawable2.setTintMode(tintMode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.start;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.end;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.state != 0) {
            return;
        }
        this.state = 1;
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
        Object obj = this.start;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.end;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.state != 2) {
            markDone();
        }
    }

    public boolean unregisterAnimationCallback(@NotNull cb1 callback) {
        return this.callbacks.remove(callback);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NotNull Drawable who, @NotNull Runnable what) {
        unscheduleSelf(what);
    }

    @VisibleForTesting
    public final void updateBounds$coil_base_release(@NotNull Drawable drawable, @NotNull Rect targetBounds) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(targetBounds);
            return;
        }
        int iWidth = targetBounds.width();
        int iHeight = targetBounds.height();
        double dComputeSizeMultiplier = DecodeUtils.computeSizeMultiplier(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.scale);
        double d = 2;
        int iRoundToInt = MathKt__MathJVMKt.roundToInt((((double) iWidth) - (((double) intrinsicWidth) * dComputeSizeMultiplier)) / d);
        int iRoundToInt2 = MathKt__MathJVMKt.roundToInt((((double) iHeight) - (dComputeSizeMultiplier * ((double) intrinsicHeight))) / d);
        drawable.setBounds(targetBounds.left + iRoundToInt, targetBounds.top + iRoundToInt2, targetBounds.right - iRoundToInt, targetBounds.bottom - iRoundToInt2);
    }

    @JvmOverloads
    public CrossfadeDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull Scale scale) {
        this(drawable, drawable2, scale, 0, false, false, 56, null);
    }

    @JvmOverloads
    public CrossfadeDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull Scale scale, int i) {
        this(drawable, drawable2, scale, i, false, false, 48, null);
    }

    @JvmOverloads
    public CrossfadeDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull Scale scale, int i, boolean z) {
        this(drawable, drawable2, scale, i, z, false, 32, null);
    }

    public /* synthetic */ CrossfadeDrawable(Drawable drawable, Drawable drawable2, Scale scale, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, drawable2, (i2 & 4) != 0 ? Scale.FIT : scale, (i2 & 8) != 0 ? 100 : i, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? false : z2);
    }

    @JvmOverloads
    public CrossfadeDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull Scale scale, int i, boolean z, boolean z2) {
        this.scale = scale;
        this.durationMillis = i;
        this.fadeStart = z;
        this.preferExactIntrinsicSize = z2;
        this.callbacks = new ArrayList();
        this.intrinsicWidth = computeIntrinsicDimension(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.intrinsicHeight = computeIntrinsicDimension(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.maxAlpha = 255;
        this.start = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.end = drawableMutate;
        if (i > 0) {
            Drawable drawable3 = this.start;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (drawableMutate == null) {
                return;
            }
            drawableMutate.setCallback(this);
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }
}
