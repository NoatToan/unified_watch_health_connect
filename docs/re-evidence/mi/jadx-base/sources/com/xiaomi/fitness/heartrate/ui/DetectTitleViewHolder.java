package com.xiaomi.fitness.heartrate.ui;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.widget.view.DurationTextView;
import defpackage.d0j;
import defpackage.fri;
import defpackage.rgi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0004J\u0012\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u0016\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\u001a\u001a\u00020\u00152\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0018\u0010$\u001a\u00060\u0013R\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/DetectTitleViewHolder;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "mTvDesc", "Landroid/widget/TextView;", "mTvTitle", "mTvBeatCount", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "mHrmUnit", "", "mAnimShow", "Landroid/view/animation/Animation;", "mAnimHide", "mAnimListener", "Lcom/xiaomi/fitness/heartrate/ui/DetectTitleViewHolder$AnimListener;", "onInitView", "", "setTitle", "resId", "", "title", "setDesc", "desc", "shouldShow", "show", "", "animShow", "getAnimShow", "()Landroid/view/animation/Animation;", "animHide", "getAnimHide", "animListener", "getAnimListener", "()Lcom/xiaomi/fitness/heartrate/ui/DetectTitleViewHolder$AnimListener;", "setBeatCount", "count", "AnimListener", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DetectTitleViewHolder implements DefaultLifecycleObserver {

    @Nullable
    private Animation mAnimHide;

    @Nullable
    private AnimListener mAnimListener;

    @Nullable
    private Animation mAnimShow;

    @Nullable
    private String mHrmUnit;

    @Nullable
    private DurationTextView mTvBeatCount;

    @Nullable
    private TextView mTvDesc;

    @Nullable
    private TextView mTvTitle;

    @NotNull
    private final View view;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/DetectTitleViewHolder$AnimListener;", "Landroid/view/animation/Animation$AnimationListener;", "<init>", "(Lcom/xiaomi/fitness/heartrate/ui/DetectTitleViewHolder;)V", "onAnimationStart", "", "animation", "Landroid/view/animation/Animation;", "onAnimationEnd", "onAnimationRepeat", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AnimListener implements Animation.AnimationListener {
        public AnimListener() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (animation == DetectTitleViewHolder.this.mAnimHide) {
                DetectTitleViewHolder.this.getView().setVisibility(4);
                DetectTitleViewHolder.this.setTitle("");
            } else if (animation == DetectTitleViewHolder.this.mAnimShow) {
                DetectTitleViewHolder.this.getView().setVisibility(0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    public DetectTitleViewHolder(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        onInitView(view);
    }

    private final Animation getAnimHide() {
        if (this.mAnimHide == null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(ApplicationExtKt.getApplication(), rgi.f32522a);
            this.mAnimHide = animationLoadAnimation;
            Intrinsics.checkNotNull(animationLoadAnimation);
            animationLoadAnimation.setAnimationListener(getAnimListener());
        }
        return this.mAnimHide;
    }

    private final AnimListener getAnimListener() {
        if (this.mAnimListener == null) {
            this.mAnimListener = new AnimListener();
        }
        AnimListener animListener = this.mAnimListener;
        Intrinsics.checkNotNull(animListener);
        return animListener;
    }

    private final Animation getAnimShow() {
        if (this.mAnimShow == null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(ApplicationExtKt.getApplication(), rgi.f32523b);
            this.mAnimShow = animationLoadAnimation;
            Intrinsics.checkNotNull(animationLoadAnimation);
            animationLoadAnimation.setAnimationListener(getAnimListener());
        }
        return this.mAnimShow;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public final void onInitView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.mTvTitle = (TextView) view.findViewById(fri.H);
        this.mTvDesc = (TextView) view.findViewById(fri.E);
        this.mTvBeatCount = (DurationTextView) view.findViewById(fri.D);
        this.mHrmUnit = view.getContext().getString(d0j.B);
        setTitle(d0j.C);
    }

    public final void setBeatCount(int count) {
        DurationTextView durationTextView = this.mTvBeatCount;
        Intrinsics.checkNotNull(durationTextView);
        durationTextView.setVisibility(0);
        TextView textView = this.mTvTitle;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(8);
        String strValueOf = count == 0 ? "--" : String.valueOf(count);
        DurationTextView durationTextView2 = this.mTvBeatCount;
        Intrinsics.checkNotNull(durationTextView2);
        durationTextView2.setText(strValueOf, this.mHrmUnit);
    }

    @SuppressLint({"ResourceType"})
    public final void setDesc(int resId) {
        if (resId <= 0) {
            setDesc("");
        } else {
            setDesc(ResourceExtKt.getString(resId));
        }
    }

    @SuppressLint({"ResourceType"})
    public final void setTitle(int resId) {
        if (resId <= 0) {
            setTitle("");
        } else {
            setTitle(ResourceExtKt.getString(resId));
        }
    }

    public final void shouldShow(boolean show) {
        View view = this.view;
        if (show) {
            if (view.getVisibility() != 0) {
                view.startAnimation(getAnimShow());
            }
        } else if (view.getVisibility() == 0) {
            view.startAnimation(getAnimHide());
        }
    }

    public final void setDesc(@Nullable String desc) {
        if (TextUtils.isEmpty(desc)) {
            TextView textView = this.mTvDesc;
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(8);
        } else {
            TextView textView2 = this.mTvDesc;
            Intrinsics.checkNotNull(textView2);
            textView2.setVisibility(0);
            TextView textView3 = this.mTvDesc;
            Intrinsics.checkNotNull(textView3);
            textView3.setText(desc);
        }
    }

    public final void setTitle(@Nullable String title) {
        TextView textView = this.mTvTitle;
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(0);
        DurationTextView durationTextView = this.mTvBeatCount;
        Intrinsics.checkNotNull(durationTextView);
        durationTextView.setVisibility(8);
        TextView textView2 = this.mTvTitle;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(title);
        setDesc((String) null);
    }
}
