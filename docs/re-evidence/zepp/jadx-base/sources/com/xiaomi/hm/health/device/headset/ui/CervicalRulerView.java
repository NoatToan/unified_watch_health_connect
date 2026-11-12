package com.xiaomi.hm.health.device.headset.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.tencent.connect.common.Constants;
import com.xiaomi.hm.health.device.headset.ui.CervicalRulerView;
import com.xiaomi.hm.health.utils.UtilsKt;
import com.xmlywind.sdk.common.mta.PointType;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(21)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0001\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B%\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010#B\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b!\u0010$B\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b!\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/CervicalRulerView;", "Landroid/widget/FrameLayout;", "", "value", "", "c", "angle", GoogleApiAvailabilityLight.a, "e", "setAngle", "Landroid/view/View;", "a", "Landroid/view/View;", "normalView", "b", "commonView", "largerView", "tooBigView", "", "Ljava/util/List;", "lines", "f", "cervicalCursor", "Landroid/animation/ObjectAnimator;", "g", "Landroid/animation/ObjectAnimator;", "translationAnimator", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CervicalRulerView extends FrameLayout {
    private static final long h = 600;
    private static final long i = 500;
    private static final int j = 15;
    private static final int k = 16;
    private static final int l = 30;
    private static final int m = 31;
    private static final int n = 45;
    private static final int o = 60;
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 3;
    private static final float t = 1.0f;
    private static final float u = 0.3f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private View normalView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private View commonView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private View largerView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private View tooBigView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final List<View> lines;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private View cervicalCursor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private ObjectAnimator translationAnimator;

    public CervicalRulerView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        super(context, attributeSet, i2, i3);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_cervical_ruler, (ViewGroup) this, true);
        this.normalView = viewInflate.findViewById(R.id.ruler_normal);
        this.commonView = viewInflate.findViewById(R.id.ruler_common);
        this.largerView = viewInflate.findViewById(R.id.ruler_larger);
        this.tooBigView = viewInflate.findViewById(R.id.ruler_too_big);
        this.cervicalCursor = viewInflate.findViewById(R.id.cervical_cursor);
        this.lines = CollectionsKt__CollectionsKt.mutableListOf(this.normalView, this.commonView, this.largerView, this.tooBigView);
        TextView textView = (TextView) viewInflate.findViewById(R.id.angle_0);
        int i4 = R.string.headset_cervical_protection_angle;
        textView.setText(context.getString(i4, "0"));
        ((TextView) viewInflate.findViewById(R.id.angle_15)).setText(context.getString(i4, Constants.VIA_REPORT_TYPE_WPA_STATE));
        ((TextView) viewInflate.findViewById(R.id.angle_30)).setText(context.getString(i4, PointType.DOWNLOAD_TRACKING));
        ((TextView) viewInflate.findViewById(R.id.angle_45)).setText(context.getString(i4, "45"));
        ((TextView) viewInflate.findViewById(R.id.angle_60)).setText(context.getString(i4, PointType.WIND_COMMON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(CervicalRulerView cervicalRulerView, int i2) {
        cervicalRulerView.c(i2);
    }

    private final void c(final int value) {
        float width;
        int width2;
        float width3;
        if (value <= 15) {
            int i2 = value <= 0 ? 0 : value;
            View view = this.normalView;
            width3 = ((((view.getWidth() - view.getPaddingStart()) - view.getPaddingEnd()) * (i2 / 15.0f)) + view.getPaddingStart()) - (this.cervicalCursor.getWidth() / 2);
        } else {
            if (16 <= value && value <= 30) {
                View view2 = this.commonView;
                width = (((view2.getWidth() - view2.getPaddingStart()) - view2.getPaddingEnd()) * (((value - 15) / 15.0f) + 1.0f)) + view2.getPaddingStart() + UtilsKt.dip2px(view2.getContext(), 2.0f);
                width2 = this.cervicalCursor.getWidth() / 2;
            } else {
                if (31 <= value && value <= 45) {
                    View view3 = this.largerView;
                    width = (((view3.getWidth() - view3.getPaddingStart()) - view3.getPaddingEnd()) * (((value - 30) / 15.0f) + 2.0f)) + view3.getPaddingStart() + (UtilsKt.dip2px(view3.getContext(), 2.0f) * 2);
                    width2 = this.cervicalCursor.getWidth() / 2;
                } else {
                    int i3 = value < 60 ? value : 60;
                    View view4 = this.tooBigView;
                    width = (((view4.getWidth() - view4.getPaddingStart()) - view4.getPaddingEnd()) * (((i3 - 45) / 15.0f) + 3.0f)) + view4.getPaddingStart() + (UtilsKt.dip2px(view4.getContext(), 2.0f) * 3);
                    width2 = this.cervicalCursor.getWidth() / 2;
                }
            }
            width3 = width - width2;
        }
        if (this.translationAnimator == null) {
            View view5 = this.cervicalCursor;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view5, "translationX", view5.getTranslationX(), width3);
            objectAnimatorOfFloat.setDuration(500L);
            this.translationAnimator = objectAnimatorOfFloat;
        }
        ObjectAnimator objectAnimator = this.translationAnimator;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.translationAnimator;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator objectAnimator3 = this.translationAnimator;
            if (objectAnimator3 != null) {
                objectAnimator3.removeAllListeners();
            }
        }
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: com.xiaomi.hm.health.device.headset.ui.CervicalRulerView$translateX$animatorListener$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                this.a.d(value);
                this.a.e(value);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animation) {
            }
        };
        ObjectAnimator objectAnimator4 = this.translationAnimator;
        if (objectAnimator4 != null) {
            objectAnimator4.addListener(animatorListener);
        }
        ObjectAnimator objectAnimator5 = this.translationAnimator;
        if (objectAnimator5 != null) {
            objectAnimator5.setFloatValues(width3);
        }
        ObjectAnimator objectAnimator6 = this.translationAnimator;
        if (objectAnimator6 == null) {
            return;
        }
        objectAnimator6.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int angle) {
        int color;
        if (angle <= 15) {
            color = ContextCompat.getColor(getContext(), R.color.cl_02af8d);
        } else {
            boolean z = false;
            if (16 <= angle && angle <= 30) {
                color = ContextCompat.getColor(getContext(), R.color.cl_ffcd68);
            } else {
                if (31 <= angle && angle <= 45) {
                    z = true;
                }
                color = z ? ContextCompat.getColor(getContext(), R.color.cl_ff8c46) : ContextCompat.getColor(getContext(), R.color.cl_ff5850);
            }
        }
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.shape_triangle);
        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        DrawableCompat.setTint(layerDrawable.getDrawable(1), color);
        this.cervicalCursor.setBackground(layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int angle) {
        int i2 = 1;
        int i3 = 0;
        if (angle <= 15) {
            i2 = 0;
        } else if (!(16 <= angle && angle <= 30)) {
            i2 = ((31 > angle || angle > 45) ? 0 : 1) != 0 ? 2 : 3;
        }
        for (Object obj : this.lines) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            View view = (View) obj;
            if (i3 == i2) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(0.3f);
            }
            i3 = i4;
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void setAngle(final int value) {
        postDelayed(new Runnable() { // from class: in0
            @Override // java.lang.Runnable
            public final void run() {
                CervicalRulerView.b(this.a, value);
            }
        }, 600L);
    }

    public CervicalRulerView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2) {
        this(context, attributeSet, i2, 0);
    }

    public CervicalRulerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CervicalRulerView(@NotNull Context context) {
        this(context, null);
    }
}
