package com.mi.health.course.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.mi.health.course.util.LogUtil;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J0\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0014J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/mi/health/course/widget/CourseLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "screenHeight", "", "screenWidth", "videoRatio", "videoWidth", "videoHeight", "finalVideoW", "finalVideoH", "reset", "", "setRatio", "onLayout", "changed", "", "left", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseLayout extends ViewGroup {
    private float finalVideoH;
    private float finalVideoW;
    private float screenHeight;
    private float screenWidth;
    private int videoHeight;
    private float videoRatio;
    private int videoWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CourseLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        float f = 2;
        int i = (int) ((this.screenWidth - this.finalVideoW) / f);
        int i2 = (int) ((this.screenHeight - this.finalVideoH) / f);
        float f2 = i;
        getChildAt(0).layout(i, i2, (int) (this.finalVideoW + f2), (int) (i2 + this.finalVideoH));
        if (this.finalVideoW >= this.screenWidth) {
            i = 0;
        }
        if (this.finalVideoH >= this.screenHeight) {
            i2 = 0;
        }
        getChildAt(1).layout(i, i2, (int) (this.screenWidth - f2), (int) (this.finalVideoH + i2));
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measureChild(getChildAt(0), widthMeasureSpec, heightMeasureSpec);
        float f = this.finalVideoW;
        float f2 = this.screenWidth;
        if (f >= f2) {
            f = f2;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
        float f3 = this.finalVideoH;
        float f4 = this.screenHeight;
        if (f3 >= f4) {
            f3 = f4;
        }
        measureChild(getChildAt(1), iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) f3, 1073741824));
    }

    public final void reset() {
        int i;
        this.screenHeight = DisplayUtil.getScreenHeight();
        this.screenWidth = DisplayUtil.getScreenWidth();
        int i2 = this.videoWidth;
        if (i2 == 0 || (i = this.videoHeight) == 0) {
            return;
        }
        setRatio(i2, i);
    }

    public final void setRatio(int videoWidth, int videoHeight) {
        float f;
        float f2;
        float f3;
        if (videoHeight == 0 || videoWidth == 0) {
            return;
        }
        float f4 = this.screenWidth;
        float f5 = this.screenHeight;
        float f6 = f4 / f5;
        if (f6 > 2.33f) {
            f3 = f5 * 2.33f;
            f2 = 2.33f;
            f = f5;
        } else {
            if (f6 < 1.7f) {
                f2 = 1.7f;
                f = f4 / 1.7f;
            } else {
                f = f5;
                f2 = f6;
            }
            f3 = f4;
        }
        this.videoWidth = videoWidth;
        this.videoHeight = videoHeight;
        float f7 = videoWidth;
        float f8 = videoHeight;
        float f9 = f7 / f8;
        this.videoRatio = f9;
        LogUtil logUtil = LogUtil.INSTANCE;
        logUtil.d("CourseLayout", "setRation: sW = " + f4 + ", finalSW = " + f3 + "; sH = " + f5 + ", finalSH = " + f + "; sRatio = " + f2 + "; vRatio = " + f9);
        if (this.videoRatio <= f2) {
            this.finalVideoH = (f3 / f7) * f8;
            this.finalVideoW = f3;
        } else {
            this.finalVideoW = (f / f8) * f7;
            this.finalVideoH = f;
        }
        logUtil.d("CourseLayout", "setRation: videoW = " + videoWidth + "; videoH = " + videoHeight + "; finalVideoW = " + this.finalVideoW + "; finalVideoH = " + this.finalVideoH);
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CourseLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CourseLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.screenHeight = DisplayUtil.getScreenHeight();
        float screenWidth = DisplayUtil.getScreenWidth();
        this.screenWidth = screenWidth;
        this.finalVideoW = screenWidth;
        this.finalVideoH = this.screenHeight;
    }

    public /* synthetic */ CourseLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
