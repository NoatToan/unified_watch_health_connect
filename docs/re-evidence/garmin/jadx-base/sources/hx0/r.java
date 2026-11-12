package hx0;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lhx0/r;", "Lmx0/a;", "Lww0/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends mx0.a<ww0.f> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhx0/r$a;", "Lmx0/a$a;", "Lww0/f;", "Landroid/view/View;", "itemView", "<init>", "(Lhx0/r;Landroid/view/View;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends mx0.a.AbstractC2298a<ww0.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LottieAnimationView f86129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f86130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f86131c;

        /* JADX INFO: renamed from: hx0.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hx0/r$a$a", "Landroid/animation/Animator$AnimatorListener;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1711a implements Animator.AnimatorListener {
            public C1711a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                animator.getClass();
                a.this.f86129a.removeAnimatorListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animator.getClass();
                a aVar = a.this;
                aVar.f86129a.removeAnimatorListener(this);
                LottieAnimationView lottieAnimationView = aVar.f86129a;
                ex0.a.C1395a c1395a = ex0.a.f66914i;
                c1395a.getClass();
                j23.l lVar = ex0.a.f66918m;
                int i14 = lVar.f96796a;
                c1395a.getClass();
                lottieAnimationView.setMinAndMaxFrame(i14, lVar.f96797b);
                aVar.f86129a.playAnimation();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                animator.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                animator.getClass();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, View view2) {
            super(view2);
            view2.getClass();
            this.f86131c = rVar;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view2.findViewById(R.id.view_display_icon_image);
            this.f86129a = lottieAnimationView;
            this.f86130b = (TextView) view2.findViewById(R.id.view_display_icon_label);
            lottieAnimationView.setOnClickListener(new go1.g0(this, 10));
        }

        @Override // mx0.a.AbstractC2298a
        public final void d(ww0.f fVar) {
            ww0.f fVar2 = fVar;
            fVar2.getClass();
            LottieAnimationView lottieAnimationView = this.f86129a;
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setAnimation(fVar2.b());
            lottieAnimationView.setFrame(0);
            this.f86130b.setText(fVar2.a(this.f86131c.f121332a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        super(context);
        context.getClass();
    }

    @Override // mx0.a
    public final mx0.a.AbstractC2298a r(ViewGroup viewGroup, LayoutInflater layoutInflater, int i14) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.view_display_icon, viewGroup, false);
        viewInflate.getClass();
        return new a(this, viewInflate);
    }
}
