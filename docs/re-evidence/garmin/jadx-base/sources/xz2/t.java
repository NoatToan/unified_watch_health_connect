package xz2;

import android.R;
import android.animation.Animator;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f192922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yz2.g f192923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f192924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f192925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f192926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DecelerateInterpolator f192927f = new DecelerateInterpolator(2.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f192928g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f192929h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f192930i = null;

    public class a extends xz2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f192931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f192932b;

        public a(CharSequence charSequence, int i14) {
            this.f192931a = charSequence;
            this.f192932b = i14;
        }

        @Override // xz2.a, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            t tVar = t.this;
            tVar.b(tVar.f192922a, 0);
            tVar.f192922a.setAlpha(1.0f);
        }

        @Override // xz2.a, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            t tVar = t.this;
            tVar.f192922a.setText(this.f192931a);
            TextView textView = tVar.f192922a;
            tVar.b(textView, this.f192932b);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = textView.animate();
            if (tVar.f192928g == 1) {
                viewPropertyAnimatorAnimate.translationX(0.0f);
            } else {
                viewPropertyAnimatorAnimate.translationY(0.0f);
            }
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(tVar.f192925d).setInterpolator(tVar.f192927f).setListener(new xz2.a()).start();
        }
    }

    public t(TextView textView) {
        this.f192922a = textView;
        Resources resources = textView.getResources();
        this.f192924c = 400;
        this.f192925d = resources.getInteger(R.integer.config_shortAnimTime) / 2;
        this.f192926e = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
    }

    public final void a(long j8, b bVar, boolean z14) {
        TextView textView = this.f192922a;
        textView.animate().cancel();
        b(textView, 0);
        textView.setAlpha(1.0f);
        this.f192929h = j8;
        CharSequence charSequenceA = this.f192923b.a(bVar);
        if (z14) {
            int i14 = this.f192926e * (this.f192930i.i(bVar) ? 1 : -1);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = textView.animate();
            if (this.f192928g == 1) {
                viewPropertyAnimatorAnimate.translationX(i14 * (-1));
            } else {
                viewPropertyAnimatorAnimate.translationY(i14 * (-1));
            }
            viewPropertyAnimatorAnimate.alpha(0.0f).setDuration(this.f192925d).setInterpolator(this.f192927f).setListener(new a(charSequenceA, i14)).start();
        } else {
            textView.setText(charSequenceA);
        }
        this.f192930i = bVar;
    }

    public final void b(TextView textView, int i14) {
        if (this.f192928g == 1) {
            textView.setTranslationX(i14);
        } else {
            textView.setTranslationY(i14);
        }
    }
}
