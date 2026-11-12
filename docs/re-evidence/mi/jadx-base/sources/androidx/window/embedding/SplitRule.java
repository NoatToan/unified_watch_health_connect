package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\u0001\u001cB1\b\u0000\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\r¨\u0006\u001d"}, d2 = {"Landroidx/window/embedding/SplitRule;", "Landroidx/window/embedding/EmbeddingRule;", "Landroid/view/WindowMetrics;", "parentMetrics", "", "checkParentMetrics", "(Landroid/view/WindowMetrics;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "minWidth", "I", "getMinWidth", "minSmallestWidth", "getMinSmallestWidth", "", "splitRatio", "F", "getSplitRatio", "()F", "layoutDirection", "getLayoutDirection", "<init>", "(IIFI)V", "Api30Impl", "window_release"}, k = 1, mv = {1, 6, 0})
public class SplitRule extends EmbeddingRule {
    private final int layoutDirection;
    private final int minSmallestWidth;
    private final int minWidth;
    private final float splitRatio;

    @RequiresApi(30)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/window/embedding/SplitRule$Api30Impl;", "", "()V", "getBounds", "Landroid/graphics/Rect;", "windowMetrics", "Landroid/view/WindowMetrics;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Api30Impl {

        @NotNull
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @NotNull
        public final Rect getBounds(@NotNull WindowMetrics windowMetrics) {
            Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    public SplitRule() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public final boolean checkParentMetrics(@NotNull WindowMetrics parentMetrics) {
        Intrinsics.checkNotNullParameter(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect bounds = Api30Impl.INSTANCE.getBounds(parentMetrics);
        return (this.minWidth == 0 || bounds.width() >= this.minWidth) && (this.minSmallestWidth == 0 || Math.min(bounds.width(), bounds.height()) >= this.minSmallestWidth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitRule)) {
            return false;
        }
        SplitRule splitRule = (SplitRule) other;
        return this.minWidth == splitRule.minWidth && this.minSmallestWidth == splitRule.minSmallestWidth && this.splitRatio == splitRule.splitRatio && this.layoutDirection == splitRule.layoutDirection;
    }

    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (((((this.minWidth * 31) + this.minSmallestWidth) * 31) + Float.hashCode(this.splitRatio)) * 31) + this.layoutDirection;
    }

    public /* synthetic */ SplitRule(int i, int i2, float f, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0.5f : f, (i4 & 8) != 0 ? 3 : i3);
    }

    public SplitRule(int i, int i2, float f, int i3) {
        this.minWidth = i;
        this.minSmallestWidth = i2;
        this.splitRatio = f;
        this.layoutDirection = i3;
    }
}
