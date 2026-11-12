package com.kogitune.activity_transition.fragment;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.kogitune.activity_transition.core.MoveData;
import com.kogitune.activity_transition.core.TransitionAnimation;

/* JADX INFO: loaded from: classes18.dex */
public class ExitFragmentTransition {
    private final MoveData a;
    private Fragment b;
    private androidx.fragment.app.Fragment c;
    private TimeInterpolator d;
    private Animator.AnimatorListener e;

    public class a implements View.OnKeyListener {
        public final /* synthetic */ Runnable a;

        /* JADX INFO: renamed from: com.kogitune.activity_transition.fragment.ExitFragmentTransition$a$a, reason: collision with other inner class name */
        public class RunnableC0726a implements Runnable {
            public RunnableC0726a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FragmentManager fragmentManager;
                androidx.fragment.app.FragmentManager fragmentManager2;
                a aVar = a.this;
                Runnable runnable = aVar.a;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                if (ExitFragmentTransition.this.b == null) {
                    if (ExitFragmentTransition.this.c.isResumed() && (fragmentManager2 = ExitFragmentTransition.this.c.getFragmentManager()) != null) {
                        fragmentManager2.popBackStack();
                        return;
                    }
                    return;
                }
                if (ExitFragmentTransition.this.b.isResumed() && (fragmentManager = ExitFragmentTransition.this.b.getFragmentManager()) != null) {
                    fragmentManager.popBackStack();
                }
            }
        }

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            if (keyEvent.getAction() != 1) {
                return true;
            }
            TransitionAnimation.startExitAnimation(ExitFragmentTransition.this.a, ExitFragmentTransition.this.d, new RunnableC0726a(), ExitFragmentTransition.this.e);
            return true;
        }
    }

    public ExitFragmentTransition(Fragment fragment, MoveData moveData) {
        this.b = fragment;
        this.a = moveData;
    }

    public ExitFragmentTransition exitListener(Animator.AnimatorListener animatorListener) {
        this.e = animatorListener;
        return this;
    }

    public ExitFragmentTransition interpolator(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
        return this;
    }

    public void startExitListening() {
        startExitListening(null);
    }

    public void startExitListening(Runnable runnable) {
        if (this.d == null) {
            this.d = new DecelerateInterpolator();
        }
        View view = this.a.toView;
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new a(runnable));
    }

    public ExitFragmentTransition(androidx.fragment.app.Fragment fragment, MoveData moveData) {
        this.c = fragment;
        this.a = moveData;
    }
}
