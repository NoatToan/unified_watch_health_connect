package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.sdk.m.x.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u001e\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000\u001a&\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001a\u001d\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n*\u00028\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a%\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u000b*\u00020\n*\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", c.c, "Landroidx/compose/animation/core/AnimationVector1D;", "AnimationVector", "v2", "Landroidx/compose/animation/core/AnimationVector2D;", "v3", "Landroidx/compose/animation/core/AnimationVector3D;", "v4", "Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_DIRECTION_TRUE, "newInstance", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "copy", "source", "", "copyFrom", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 2, mv = {1, 5, 1})
public final class AnimationVectorsKt {
    @NotNull
    public static final AnimationVector1D AnimationVector(float f) {
        return new AnimationVector1D(f);
    }

    @NotNull
    public static final <T extends AnimationVector> T copy(@NotNull T t) {
        T t2 = (T) newInstance(t);
        int size = t2.getSize();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                t2.set$animation_core_release(i, t.get$animation_core_release(i));
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return t2;
    }

    public static final <T extends AnimationVector> void copyFrom(@NotNull T t, @NotNull T t2) {
        int size = t.getSize();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            t.set$animation_core_release(i, t2.get$animation_core_release(i));
            if (i2 >= size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @NotNull
    public static final <T extends AnimationVector> T newInstance(@NotNull T t) {
        return (T) t.newVector$animation_core_release();
    }

    @NotNull
    public static final AnimationVector2D AnimationVector(float f, float f2) {
        return new AnimationVector2D(f, f2);
    }

    @NotNull
    public static final AnimationVector3D AnimationVector(float f, float f2, float f3) {
        return new AnimationVector3D(f, f2, f3);
    }

    @NotNull
    public static final AnimationVector4D AnimationVector(float f, float f2, float f3, float f4) {
        return new AnimationVector4D(f, f2, f3, f4);
    }
}
