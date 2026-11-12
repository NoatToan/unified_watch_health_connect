package com.xiaomi.fitness.sport_eco.view.lockscreen.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.fitness.sport_eco.view.lockscreen.ui.LockUnderView;
import com.xiaomi.onetrack.OneTrack;
import defpackage.fvi;
import defpackage.zri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0002'(B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0012J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0014\u0010 \u001a\u00020\u0016*\u00020!2\u0006\u0010\u001f\u001a\u00020\u000bH\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020\u0016H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0001X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/lockscreen/ui/LockUnderView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mStartY", "", "mScreenWidth", "", "mScreenHeight", "mLimitHeight", "mCurAlpha", "mContext", "moveView", "mOnAlphaChangeListener", "Lcom/xiaomi/fitness/sport_eco/view/lockscreen/ui/LockUnderView$OnAlphaChangeListener;", "moveListenerCallback", "Lkotlin/Function1;", "", "", "setOnMoveListener", "callback", "setOnAlphaChangeListener", "onAlphaChangeListener", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "handMoveView", "ny", "resetAlpha", "Landroid/view/ViewGroup;", "doTrigger", "doTriggerView", "to", OneTrack.Event.UNLOCK, "onFinishInflate", "OnAlphaChangeListener", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LockUnderView extends RelativeLayout {

    @NotNull
    private static final String TAG = "LockUnderView";

    @NotNull
    private final Context mContext;
    private int mCurAlpha;
    private int mLimitHeight;
    private OnAlphaChangeListener mOnAlphaChangeListener;
    private int mScreenHeight;
    private int mScreenWidth;
    private float mStartY;
    private Function1<? super Boolean, Unit> moveListenerCallback;
    private RelativeLayout moveView;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/lockscreen/ui/LockUnderView$OnAlphaChangeListener;", "", "onAlphaChange", "", SleepAnalyzerAlpha.NAME_ALPHA, "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnAlphaChangeListener {
        void onAlphaChange(int alpha);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockUnderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        LayoutInflater.from(context).inflate(fvi.F, this);
    }

    private final void doTrigger(float ny) {
        float f = this.mStartY;
        float f2 = ny - f;
        String str = TAG;
        Logger.d(str, "handMoveView doTrigger mStartY " + f + " pointY " + f2);
        float f3 = -f2;
        if (f3 < 20.0f) {
            return;
        }
        int i = this.mLimitHeight;
        if (f3 <= i) {
            doTriggerView(0.0f, false);
            return;
        }
        Logger.d(str, "handMoveView doTrigger translationY " + f3 + "  mLimitHeight " + i);
        int i2 = this.mScreenHeight;
        RelativeLayout relativeLayout = this.moveView;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moveView");
            relativeLayout = null;
        }
        Logger.i("handMoveView doTrigger bottom  = " + (i2 - relativeLayout.getBottom()), new Object[0]);
        doTriggerView((float) this.mScreenHeight, true);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    private final void doTriggerView(float to, final boolean unlock) {
        Logger.d("handMoveView doTriggerView unlock=" + unlock, new Object[0]);
        float fAbs = Math.abs(to);
        int i = 255;
        if (fAbs > 0.0f) {
            if (fAbs > 0.0f) {
                int i2 = this.mLimitHeight;
                if (fAbs < i2) {
                    i = (int) (((i2 - fAbs) / i2) * 255);
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
        }
        int i3 = this.mCurAlpha;
        Logger.i("handMoveView doTriggerView start  = " + i3 + " end  = " + i, new Object[0]);
        RelativeLayout relativeLayout = this.moveView;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moveView");
            relativeLayout = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, SleepAnalyzerAlpha.NAME_ALPHA, i3, i);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: koe
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LockUnderView.doTriggerView$lambda$0(this.f24047a, unlock, valueAnimator);
            }
        });
        objectAnimatorOfFloat.setDuration(200L).start();
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.xiaomi.fitness.sport_eco.view.lockscreen.ui.LockUnderView.doTriggerView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Function1 function1 = LockUnderView.this.moveListenerCallback;
                if (function1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("moveListenerCallback");
                    function1 = null;
                }
                function1.invoke2(Boolean.valueOf(unlock));
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doTriggerView$lambda$0(LockUnderView this$0, boolean z, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        RelativeLayout relativeLayout = this$0.moveView;
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moveView");
            relativeLayout = null;
        }
        Logger.i("handMoveView doTriggerView alpha  = " + relativeLayout.getAlpha(), new Object[0]);
        RelativeLayout relativeLayout3 = this$0.moveView;
        if (relativeLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moveView");
            relativeLayout3 = null;
        }
        int translationY = (int) relativeLayout3.getTranslationY();
        if (z) {
            translationY = this$0.mScreenHeight;
            Logger.d(TAG, "unlock now");
        }
        Logger.d("handMoveView doTriggerView in updateListener y " + translationY, new Object[0]);
        RelativeLayout relativeLayout4 = this$0.moveView;
        if (relativeLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moveView");
            relativeLayout4 = null;
        }
        Drawable background = relativeLayout4.getBackground();
        RelativeLayout relativeLayout5 = this$0.moveView;
        if (relativeLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moveView");
            relativeLayout5 = null;
        }
        background.setAlpha((int) relativeLayout5.getAlpha());
        OnAlphaChangeListener onAlphaChangeListener = this$0.mOnAlphaChangeListener;
        if (onAlphaChangeListener != null) {
            if (onAlphaChangeListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOnAlphaChangeListener");
                onAlphaChangeListener = null;
            }
            RelativeLayout relativeLayout6 = this$0.moveView;
            if (relativeLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("moveView");
            } else {
                relativeLayout2 = relativeLayout6;
            }
            onAlphaChangeListener.onAlphaChange((int) relativeLayout2.getAlpha());
        }
    }

    private final void handMoveView(float ny) {
        float f = this.mStartY;
        float f2 = ny - f;
        if (f2 > 100.0f) {
            f2 = 0.0f;
        }
        Logger.i("handMoveView translationY = " + f2 + " ny = " + ny + " startY = " + f, new Object[0]);
        RelativeLayout relativeLayout = this.moveView;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moveView");
            relativeLayout = null;
        }
        resetAlpha(relativeLayout, (int) f2);
    }

    private final void resetAlpha(ViewGroup viewGroup, int i) {
        int i2;
        int iAbs = Math.abs(i);
        int i3 = 255;
        if (iAbs > 0) {
            if (iAbs <= 0 || iAbs >= (i2 = this.mLimitHeight)) {
                i3 = 0;
            } else {
                i3 = (int) (((i2 - iAbs) / i2) * 255);
                Logger.i("handMoveView resetAlpha alpha = " + i3 + " mLimitHeight = " + i2 + " translationY = " + iAbs + " sub = " + (i2 - iAbs) + " result = " + ((i2 - iAbs) / i2), new Object[0]);
            }
        }
        OnAlphaChangeListener onAlphaChangeListener = this.mOnAlphaChangeListener;
        if (onAlphaChangeListener != null) {
            if (onAlphaChangeListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOnAlphaChangeListener");
                onAlphaChangeListener = null;
            }
            onAlphaChangeListener.onAlphaChange(i3);
        }
        this.mCurAlpha = i3;
        viewGroup.getBackground().setAlpha(i3);
        Logger.d("handMoveView resetAlpha background alpha is " + i3, new Object[0]);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        this.mScreenWidth = displayMetrics.widthPixels;
        int i = displayMetrics.heightPixels;
        this.mScreenHeight = i;
        this.mLimitHeight = i / 5;
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(zri.l1);
        this.moveView = relativeLayout;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moveView");
            relativeLayout = null;
        }
        relativeLayout.getBackground().setAlpha(255);
        Logger.i("onFinishInflate screenWidth = " + this.mScreenWidth + " screenHeight = " + this.mScreenHeight, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.mStartY = event.getY();
            Logger.d(TAG, 0, Float.valueOf(this.mStartY));
        } else if (action == 1) {
            doTrigger(event.getY());
        } else if (action == 2) {
            handMoveView(event.getY());
        } else if (action == 3) {
            doTrigger(event.getY());
        }
        return true;
    }

    public final void setOnAlphaChangeListener(@NotNull OnAlphaChangeListener onAlphaChangeListener) {
        Intrinsics.checkNotNullParameter(onAlphaChangeListener, "onAlphaChangeListener");
        this.mOnAlphaChangeListener = onAlphaChangeListener;
    }

    public final void setOnMoveListener(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.moveListenerCallback = callback;
    }
}
