package coil.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PostProcessor;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import coil.transform.AnimatedTransformation;
import coil.transform.PixelOpacity;
import coil.util.GifUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.cb1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: coil.util.-GifUtils, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a4\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0010H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a*\u0010\u0019\u001a\u00020\u0017*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u0017*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004H\u0080\b¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\u0017*\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0018\u0010\"\u001a\u00020\u0017*\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0018\u0010%\u001a\u00020$*\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcoil/transform/AnimatedTransformation;", "Landroid/graphics/PostProcessor;", "asPostProcessor", "(Lcoil/transform/AnimatedTransformation;)Landroid/graphics/PostProcessor;", "Lkotlin/Function0;", "", LifecycleConstantKt.ON_START, "onEnd", "Landroid/graphics/drawable/Animatable2$AnimationCallback;", "animatable2CallbackOf", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/graphics/drawable/Animatable2$AnimationCallback;", "Lcb1;", "animatable2CompatCallbackOf", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcb1;", "T", "", "Lkotlin/Function1;", "action", "forEachIndices", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lcoil/size/Size;", "Lcoil/size/Scale;", "scale", "", "original", "widthPx", "(Lcoil/size/Size;Lcoil/size/Scale;Lkotlin/jvm/functions/Function0;)I", "heightPx", "Lcoil/size/Dimension;", "toPx", "(Lcoil/size/Dimension;Lcoil/size/Scale;)I", "Lcoil/transform/PixelOpacity;", "getFlag", "(Lcoil/transform/PixelOpacity;)I", "flag", "Landroid/graphics/Bitmap$Config;", "", "isHardware", "(Landroid/graphics/Bitmap$Config;)Z", "coil-gif_release"}, k = 2, mv = {1, 7, 1})
@JvmName(name = "-GifUtils")
public final class GifUtils {

    /* JADX INFO: renamed from: coil.util.-GifUtils$WhenMappings */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PixelOpacity.values().length];
            iArr[PixelOpacity.UNCHANGED.ordinal()] = 1;
            iArr[PixelOpacity.TRANSLUCENT.ordinal()] = 2;
            iArr[PixelOpacity.OPAQUE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Scale.values().length];
            iArr2[Scale.FILL.ordinal()] = 1;
            iArr2[Scale.FIT.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @RequiresApi(23)
    @NotNull
    public static final Animatable2.AnimationCallback animatable2CallbackOf(@Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1) {
        return new Animatable2.AnimationCallback() { // from class: coil.util.-GifUtils.animatable2CallbackOf.1
            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(@Nullable Drawable drawable) {
                Function0<Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke();
                }
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(@Nullable Drawable drawable) {
                Function0<Unit> function2 = function0;
                if (function2 != null) {
                    function2.invoke();
                }
            }
        };
    }

    @NotNull
    public static final cb1 animatable2CompatCallbackOf(@Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1) {
        return new cb1() { // from class: coil.util.-GifUtils.animatable2CompatCallbackOf.1
            @Override // defpackage.cb1
            public void onAnimationEnd(@Nullable Drawable drawable) {
                Function0<Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke();
                }
            }

            @Override // defpackage.cb1
            public void onAnimationStart(@Nullable Drawable drawable) {
                Function0<Unit> function2 = function0;
                if (function2 != null) {
                    function2.invoke();
                }
            }
        };
    }

    @RequiresApi(28)
    @NotNull
    public static final PostProcessor asPostProcessor(@NotNull final AnimatedTransformation animatedTransformation) {
        return new PostProcessor() { // from class: f
            @Override // android.graphics.PostProcessor
            public final int onPostProcess(Canvas canvas) {
                return GifUtils.m77asPostProcessor$lambda0(animatedTransformation, canvas);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: asPostProcessor$lambda-0, reason: not valid java name */
    public static final int m77asPostProcessor$lambda0(AnimatedTransformation animatedTransformation, Canvas canvas) {
        return getFlag(animatedTransformation.transform(canvas));
    }

    public static final <T> void forEachIndices(@NotNull List<? extends T> list, @NotNull Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke2(list.get(i));
        }
    }

    public static final int getFlag(@NotNull PixelOpacity pixelOpacity) {
        int i = WhenMappings.$EnumSwitchMapping$0[pixelOpacity.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return -3;
        }
        if (i == 3) {
            return -1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int heightPx(@NotNull Size size, @NotNull Scale scale, @NotNull Function0<Integer> function0) {
        return Sizes.isOriginal(size) ? function0.invoke().intValue() : toPx(size.getHeight(), scale);
    }

    public static final boolean isHardware(@NotNull Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    public static final int toPx(@NotNull Dimension dimension, @NotNull Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).px;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int widthPx(@NotNull Size size, @NotNull Scale scale, @NotNull Function0<Integer> function0) {
        return Sizes.isOriginal(size) ? function0.invoke().intValue() : toPx(size.getWidth(), scale);
    }
}
