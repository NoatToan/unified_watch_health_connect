package defpackage;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import miuix.animation.Folme;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.appcompat.widget.Spinner;

/* JADX INFO: loaded from: classes7.dex */
public class nuf {

    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f28376a;

        public a(View view) {
            this.f28376a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Folme.useAt(this.f28376a).touch().cancel();
            Folme.useAt(this.f28376a).touch().setScale(1.04f, ITouchStyle.TouchType.UP).touchUp(new AnimConfig[0]);
        }
    }

    public class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f28377a;

        public b(View view) {
            this.f28377a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f28377a.setAlpha(1.0f);
            this.f28377a.setScaleX(1.0f);
            this.f28377a.setScaleY(1.0f);
            this.f28377a.setScrollX(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Folme.useAt(this.f28377a).touch().setScale(1.0f, ITouchStyle.TouchType.UP).touchUp(new AnimConfig[0]);
        }
    }

    @RequiresApi(api = 21)
    public static void c(View view) {
        view.animate().setDuration(200L).translationZ(0.0f).setListener(new b(view));
    }

    @RequiresApi(api = 21)
    public static void d(View view) {
        view.animate().setDuration(300L).translationZ(20.0f).setListener(new a(view)).start();
    }

    public static ITouchStyle e(View view) {
        ITouchStyle iTouchStyle = Folme.useAt(view).touch();
        iTouchStyle.setBackgroundColor(0.0f, 0.0f, 0.0f, 0.0f);
        iTouchStyle.setTint(0.0f, 0.0f, 0.0f, 0.0f);
        iTouchStyle.handleTouchOf(view, new AnimConfig[0]);
        return iTouchStyle;
    }

    public static ITouchStyle f(View view) {
        ITouchStyle iTouchStyle = Folme.useAt(view).touch();
        iTouchStyle.handleTouchOf(view, new AnimConfig[0]);
        return iTouchStyle;
    }

    public static ITouchStyle g(View view) {
        ITouchStyle iTouchStyle = Folme.useAt(view).touch();
        iTouchStyle.setScale(1.0f, ITouchStyle.TouchType.DOWN).setScale(1.0f, ITouchStyle.TouchType.UP).handleTouchOf(view, new AnimConfig[0]);
        return iTouchStyle;
    }

    public static void h(View... viewArr) {
        for (View view : viewArr) {
            g(view);
        }
    }

    @RequiresApi(api = 23)
    @SuppressLint({"ClickableViewAccessibility"})
    public static void i(final View view, final Spinner spinner) {
        spinner.setClickable(false);
        spinner.setLongClickable(false);
        spinner.setContextClickable(false);
        spinner.setOnSpinnerDismissListener(new Spinner.h() { // from class: luf
            @Override // miuix.appcompat.widget.Spinner.h
            public final void a() {
                nuf.j(view);
            }
        });
        view.setOnTouchListener(new View.OnTouchListener() { // from class: muf
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return nuf.k(spinner, view2, motionEvent);
            }
        });
    }

    public static /* synthetic */ void j(View view) {
        Folme.useAt(view).touch().touchUp(new AnimConfig[0]);
    }

    public static /* synthetic */ boolean k(Spinner spinner, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            Folme.useAt(view).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).touchDown(new AnimConfig[0]);
        } else if (action == 1) {
            spinner.l(motionEvent.getX(), motionEvent.getY());
        } else if (action == 3) {
            Folme.useAt(view).touch().touchUp(new AnimConfig[0]);
        }
        return true;
    }
}
