package com.huami.moving.ui.sport.in;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.huami.moving.R;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes4.dex */
public class AnimateCountDownFragment extends DialogFragment {
    private static final String g = "start_count_number";
    private static final long h = 1000;
    private static final String i = "AnimateCountDownFragment";
    private TextView a = null;
    private int b = 0;
    private int c = 0;
    private boolean d = false;
    private AnimationCountDownListener e = null;
    private AnimatorSet f = null;

    public interface AnimationCountDownListener {
        void onCountDownAnimationStart();

        void onCountDownCancelled();

        void onFinished();
    }

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AnimateCountDownFragment.this.dismissAllowingStateLoss();
            if (AnimateCountDownFragment.this.d || AnimateCountDownFragment.this.e == null) {
                return;
            }
            AnimateCountDownFragment.this.e.onFinished();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (!AnimateCountDownFragment.this.d && AnimateCountDownFragment.this.c > 0) {
                AnimateCountDownFragment.this.c--;
                TextView textView = AnimateCountDownFragment.this.a;
                AnimateCountDownFragment animateCountDownFragment = AnimateCountDownFragment.this;
                int i = animateCountDownFragment.b;
                animateCountDownFragment.b = i - 1;
                textView.setText(String.valueOf(i));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (AnimateCountDownFragment.this.e != null) {
                AnimateCountDownFragment.this.e.onCountDownAnimationStart();
            }
            TextView textView = AnimateCountDownFragment.this.a;
            AnimateCountDownFragment animateCountDownFragment = AnimateCountDownFragment.this;
            int i = animateCountDownFragment.b;
            animateCountDownFragment.b = i - 1;
            textView.setText(String.valueOf(i));
        }
    }

    private int j() {
        return R.layout.fragment_running_count_down;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        HMLog.i(i, "showAnimation", new Object[0]);
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        this.a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue() / 100.0f);
    }

    private void m() {
        if (this.b <= 0) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(100);
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.setRepeatCount(this.c);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.l(valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new a());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f = animatorSet;
        animatorSet.playSequentially(valueAnimatorOfInt);
        this.f.start();
    }

    public static AnimateCountDownFragment newInstance(int i2) {
        AnimateCountDownFragment animateCountDownFragment = new AnimateCountDownFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(g, i2);
        animateCountDownFragment.setArguments(bundle);
        return animateCountDownFragment;
    }

    public long getAnimationSuration() {
        return ((long) this.c) * 1000;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.d = true;
        AnimationCountDownListener animationCountDownListener = this.e;
        if (animationCountDownListener != null) {
            animationCountDownListener.onCountDownCancelled();
            this.e = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.CountDownDialogStyle);
        int i2 = getArguments().getInt(g);
        this.b = i2;
        this.c = i2 - 1;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), getTheme())).inflate(j(), viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.counter);
        this.a = textView;
        textView.postDelayed(new Runnable() { // from class: ig
            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        }, 500L);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (getActivity() == null || !getActivity().isFinishing()) {
            return;
        }
        this.d = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    public void setAnimationCountDownListener(AnimationCountDownListener animationCountDownListener) {
        if (animationCountDownListener == null) {
            return;
        }
        this.e = animationCountDownListener;
    }
}
