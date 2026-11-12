package com.xiaomi.hm.health.device.headset.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.badge.BadgeDrawable;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.headset.ui.MarqueeView;
import com.xiaomi.hm.health.utils.UtilsKt;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(21)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0001\u0010!\u001a\u00020\u0004\u0012\b\b\u0001\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$B%\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0001\u0010!\u001a\u00020\u0004¢\u0006\u0004\b#\u0010%B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010&B\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\b2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00020\u000fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/MarqueeView;", "Landroid/widget/FrameLayout;", "", GoogleApiAvailabilityLight.a, "", UserDataStore.DATE_OF_BIRTH, "b", "index", "", "enable", "c", "dbVolume", "f", "(Ljava/lang/Integer;)I", "isUseAnimator", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "dbValue", "onAnimation", "lightView", "a", "Ljava/lang/Integer;", "lastDb", "Landroid/animation/ValueAnimator;", "Lkotlin/Lazy;", "getValueAnimator", "()Landroid/animation/ValueAnimator;", "valueAnimator", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"SetTextI18n"})
public final class MarqueeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Integer lastDb;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy valueAnimator;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/ValueAnimator;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ValueAnimator> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ValueAnimator invoke() {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setInterpolator(new AccelerateInterpolator());
            valueAnimator.setDuration(320L);
            return valueAnimator;
        }
    }

    public MarqueeView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        this.valueAnimator = LazyKt__LazyJVMKt.lazy(a.a);
        d();
    }

    private final void b(int db) {
        View childAt = getChildAt(0);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) childAt;
        int iF = f(Integer.valueOf(db));
        int childCount = linearLayoutCompat.getChildCount();
        if (iF == -1) {
            if (childCount <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (linearLayoutCompat.getChildAt(i).getAlpha() == 1.0f) {
                    c(i, false);
                }
                if (i2 >= childCount) {
                    return;
                } else {
                    i = i2;
                }
            }
        } else {
            if (childCount <= 0) {
                return;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 <= iF) {
                    if (!(linearLayoutCompat.getChildAt(i3).getAlpha() == 1.0f)) {
                        c(i3, true);
                    }
                } else {
                    if (linearLayoutCompat.getChildAt(i3).getAlpha() == 1.0f) {
                        c(i3, false);
                    }
                }
                if (i4 >= childCount) {
                    return;
                } else {
                    i3 = i4;
                }
            }
        }
    }

    private final void c(int index, boolean enable) {
        View childAt = getChildAt(0);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        try {
            ((LinearLayoutCompat) childAt).getChildAt(index).setAlpha(enable ? 1.0f : 0.2f);
        } catch (Exception unused) {
        }
    }

    private final void d() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        float f = 10.0f;
        linearLayoutCompat.setPadding(0, 0, UtilsKt.dip2px(getContext(), 10.0f), 0);
        linearLayoutCompat.setLayoutParams(layoutParams);
        linearLayoutCompat.setOrientation(0);
        int color = ContextCompat.getColor(getContext(), R.color.cl_f7b500);
        int color2 = ContextCompat.getColor(getContext(), R.color.cl_fa6400);
        int color3 = ContextCompat.getColor(getContext(), R.color.cl_02af8d);
        int i = 1;
        while (true) {
            int i2 = i + 1;
            View view = new View(getContext());
            LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(UtilsKt.dip2px(getContext(), 8.0f), UtilsKt.dip2px(getContext(), ((i - 1) * 1) + f));
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 80;
            if (i < 22) {
                layoutParams2.setMarginEnd(UtilsKt.dip2px(getContext(), 3.0f));
            }
            view.setLayoutParams(layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setTintMode(PorterDuff.Mode.SRC_IN);
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(UtilsKt.dip2px(getContext(), 8.0f));
            if (i <= 16) {
                gradientDrawable.setTint(color3);
            } else {
                if (17 <= i && i <= 19) {
                    gradientDrawable.setTint(color);
                } else {
                    gradientDrawable.setTint(color2);
                }
            }
            view.setBackground(gradientDrawable);
            view.setAlpha(0.2f);
            linearLayoutCompat.addView(view);
            if (i2 > 22) {
                addView(linearLayoutCompat);
                Typeface font = ResourcesCompat.getFont(getContext(), com.huami.lib.rainbow.R.font.maisonneue);
                TextView textView = new TextView(getContext());
                textView.setTypeface(font);
                textView.setTextSize(1, 12.0f);
                Context context = getContext();
                int i3 = R.color.s2;
                textView.setTextColor(ContextCompat.getColor(context, i3));
                textView.setText("0");
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = BadgeDrawable.BOTTOM_START;
                layoutParams3.topMargin = UtilsKt.dip2px(getContext(), 38.0f);
                Unit unit = Unit.INSTANCE;
                textView.setLayoutParams(layoutParams3);
                addView(textView);
                TextView textView2 = new TextView(getContext());
                textView2.setTypeface(font);
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(ContextCompat.getColor(getContext(), i3));
                textView2.setText("80");
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams4.gravity = BadgeDrawable.BOTTOM_END;
                layoutParams4.topMargin = UtilsKt.dip2px(getContext(), 38.0f);
                layoutParams4.setMarginEnd(UtilsKt.dip2px(getContext(), 73.0f));
                textView2.setLayoutParams(layoutParams4);
                addView(textView2);
                TextView textView3 = new TextView(getContext());
                textView3.setTypeface(font);
                textView3.setTextSize(1, 12.0f);
                textView3.setTextColor(ContextCompat.getColor(getContext(), i3));
                textView3.setText("110");
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = BadgeDrawable.BOTTOM_END;
                layoutParams5.topMargin = UtilsKt.dip2px(getContext(), 38.0f);
                layoutParams5.setMarginEnd(UtilsKt.dip2px(getContext(), 3.0f));
                textView3.setLayoutParams(layoutParams5);
                addView(textView3);
                return;
            }
            i = i2;
            f = 10.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MarqueeView marqueeView, Function1 function1, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        marqueeView.b(iIntValue);
        function1.invoke(Integer.valueOf(iIntValue));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[PHI: r1
      0x0020: PHI (r1v4 int) = (r1v2 int), (r1v5 int) binds: [B:27:0x0038, B:15:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    private final int f(Integer dbVolume) {
        int i;
        int i2 = 0;
        int iIntValue = dbVolume == null ? 0 : dbVolume.intValue();
        if (iIntValue <= 0) {
            return -1;
        }
        if (1 <= iIntValue && iIntValue <= 80) {
            i = iIntValue / 5;
            if (iIntValue % 5 != 0) {
                i2 = 1;
            }
        } else {
            if (!(81 <= iIntValue && iIntValue <= 110)) {
                return 21;
            }
            int i3 = iIntValue - 80;
            i = (i3 / 5) + 15;
            if (i3 % 5 != 0) {
                i2 = 1;
            }
        }
        return i + i2;
    }

    private final ValueAnimator getValueAnimator() {
        return (ValueAnimator) this.valueAnimator.getValue();
    }

    public static /* synthetic */ void lightView$default(MarqueeView marqueeView, int i, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        marqueeView.lightView(i, z, function1);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void lightView(final int db, boolean isUseAnimator, @NotNull final Function1<? super Integer, Unit> onAnimation) {
        Integer num = this.lastDb;
        if (num != null && num.intValue() == db) {
            return;
        }
        if (!isUseAnimator) {
            b(db);
            onAnimation.invoke(Integer.valueOf(db));
            return;
        }
        if (getValueAnimator().isRunning()) {
            getValueAnimator().end();
            getValueAnimator().cancel();
            getValueAnimator().removeAllListeners();
        }
        ValueAnimator valueAnimator = getValueAnimator();
        int[] iArr = new int[2];
        Integer num2 = this.lastDb;
        iArr[0] = num2 == null ? 0 : num2.intValue();
        iArr[1] = db;
        valueAnimator.setIntValues(iArr);
        getValueAnimator().addListener(new Animator.AnimatorListener() { // from class: com.xiaomi.hm.health.device.headset.ui.MarqueeView.lightView.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@Nullable Animator animation) {
                MarqueeView.this.lastDb = Integer.valueOf(db);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@Nullable Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@Nullable Animator animation) {
            }
        });
        getValueAnimator().addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jv4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                MarqueeView.e(this.a, onAnimation, valueAnimator2);
            }
        });
        getValueAnimator().start();
    }

    public MarqueeView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
    }

    public MarqueeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarqueeView(@NotNull Context context) {
        this(context, null);
    }
}
