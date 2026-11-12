package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.view.g1;
import androidx.core.view.w0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\b\u0006\u0007\b\t\n\u000b\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/e;", "Landroidx/fragment/app/q0;", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "<init>", "(Landroid/view/ViewGroup;)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends q0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f7171h = 0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/e$a;", "Landroidx/fragment/app/q0$b;", "Landroidx/fragment/app/e$b;", "animationInfo", "<init>", "(Landroidx/fragment/app/e$b;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends q0.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f7172c;

        /* JADX INFO: renamed from: androidx.fragment.app.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/fragment/app/e$a$a", "Landroid/view/animation/Animation$AnimationListener;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AnimationAnimationListenerC0100a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q0.d f7173a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f7174b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f7175c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f7176d;

            public AnimationAnimationListenerC0100a(q0.d dVar, ViewGroup viewGroup, View view2, a aVar) {
                this.f7173a = dVar;
                this.f7174b = viewGroup;
                this.f7175c = view2;
                this.f7176d = aVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                animation.getClass();
                ViewGroup viewGroup = this.f7174b;
                viewGroup.post(new a8.d(viewGroup, 4, this.f7175c, this.f7176d));
                if (v.R(2)) {
                    Objects.toString(this.f7173a);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                animation.getClass();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                animation.getClass();
                if (v.R(2)) {
                    Objects.toString(this.f7173a);
                }
            }
        }

        public a(b bVar) {
            bVar.getClass();
            this.f7172c = bVar;
        }

        @Override // androidx.fragment.app.q0.b
        public final void b(ViewGroup viewGroup) {
            b bVar = this.f7172c;
            q0.d dVar = bVar.f7189a;
            View view2 = dVar.f7335c.mView;
            view2.clearAnimation();
            viewGroup.endViewTransition(view2);
            bVar.f7189a.c(this);
            if (v.R(2)) {
                dVar.toString();
            }
        }

        @Override // androidx.fragment.app.q0.b
        public final void c(ViewGroup viewGroup) {
            b bVar = this.f7172c;
            boolean zA = bVar.a();
            q0.d dVar = bVar.f7189a;
            if (zA) {
                dVar.c(this);
                return;
            }
            Context context = viewGroup.getContext();
            View view2 = dVar.f7335c.mView;
            context.getClass();
            n.a aVarB = bVar.b(context);
            if (aVarB == null) {
                vb.h.z("Required value was null.");
                return;
            }
            Animation animation = aVarB.f7300a;
            if (animation == null) {
                vb.h.z("Required value was null.");
                return;
            }
            if (dVar.f7333a != q0.d.b.REMOVED) {
                view2.startAnimation(animation);
                dVar.c(this);
                return;
            }
            viewGroup.startViewTransition(view2);
            n.b bVar2 = new n.b(animation, viewGroup, view2);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0100a(dVar, viewGroup, view2, this));
            view2.startAnimation(bVar2);
            if (v.R(2)) {
                dVar.toString();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/fragment/app/e$b;", "Landroidx/fragment/app/e$f;", "Landroidx/fragment/app/q0$d;", "operation", "", "isPop", "<init>", "(Landroidx/fragment/app/q0$d;Z)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public n.a f7179d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0.d dVar, boolean z14) {
            super(dVar);
            dVar.getClass();
            this.f7177b = z14;
        }

        /* JADX WARN: Code duplicated, block: B:74:0x00f5 A[Catch: RuntimeException -> 0x00fb, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fb, blocks: (B:72:0x00ef, B:74:0x00f5), top: B:85:0x00ef }] */
        public final n.a b(Context context) {
            int enterAnim;
            n.a aVar;
            Animator animatorLoadAnimator;
            int iA;
            if (this.f7178c) {
                return this.f7179d;
            }
            q0.d dVar = this.f7189a;
            Fragment fragment = dVar.f7335c;
            boolean z14 = dVar.f7333a == q0.d.b.VISIBLE;
            int nextTransition = fragment.getNextTransition();
            if (this.f7177b) {
                enterAnim = z14 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
            } else {
                enterAnim = z14 ? fragment.getEnterAnim() : fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            n.a aVar2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z14, enterAnim);
                if (animationOnCreateAnimation != null) {
                    aVar2 = new n.a(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z14, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        aVar2 = new n.a(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iA = z14 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            } else if (nextTransition == 8194) {
                                iA = z14 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            } else if (nextTransition == 8197) {
                                iA = z14 ? n.a(android.R.attr.activityCloseEnterAnimation, context) : n.a(android.R.attr.activityCloseExitAnimation, context);
                            } else if (nextTransition == 4099) {
                                iA = z14 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                iA = -1;
                            } else {
                                iA = z14 ? n.a(android.R.attr.activityOpenEnterAnimation, context) : n.a(android.R.attr.activityOpenExitAnimation, context);
                            }
                            enterAnim = iA;
                        }
                        if (enterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                            if (zEquals) {
                                try {
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation != null) {
                                        aVar = new n.a(animationLoadAnimation);
                                        aVar2 = aVar;
                                    }
                                } catch (Resources.NotFoundException e4) {
                                    throw e4;
                                } catch (RuntimeException unused) {
                                    try {
                                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                        if (animatorLoadAnimator != null) {
                                            aVar = new n.a(animatorLoadAnimator);
                                            aVar2 = aVar;
                                        }
                                    } catch (RuntimeException e14) {
                                        if (zEquals) {
                                            throw e14;
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                        if (animationLoadAnimation2 != null) {
                                            aVar2 = new n.a(animationLoadAnimation2);
                                        }
                                    }
                                }
                            } else {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                if (animatorLoadAnimator != null) {
                                    aVar = new n.a(animatorLoadAnimator);
                                    aVar2 = aVar;
                                }
                            }
                        }
                    }
                }
            }
            this.f7179d = aVar2;
            this.f7178c = true;
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/e$c;", "Landroidx/fragment/app/q0$b;", "Landroidx/fragment/app/e$b;", "animatorInfo", "<init>", "(Landroidx/fragment/app/e$b;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends q0.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f7180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AnimatorSet f7181d;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/fragment/app/e$c$a", "Landroid/animation/AnimatorListenerAdapter;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f7182a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f7183b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f7184c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ q0.d f7185d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f7186e;

            public a(ViewGroup viewGroup, View view2, boolean z14, q0.d dVar, c cVar) {
                this.f7182a = viewGroup;
                this.f7183b = view2;
                this.f7184c = z14;
                this.f7185d = dVar;
                this.f7186e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animator.getClass();
                ViewGroup viewGroup = this.f7182a;
                View view2 = this.f7183b;
                viewGroup.endViewTransition(view2);
                boolean z14 = this.f7184c;
                q0.d dVar = this.f7185d;
                if (z14 || dVar.f7333a == q0.d.b.GONE) {
                    q0.d.b bVar = dVar.f7333a;
                    view2.getClass();
                    bVar.a(view2, viewGroup);
                }
                c cVar = this.f7186e;
                cVar.f7180c.f7189a.c(cVar);
                if (v.R(2)) {
                    Objects.toString(dVar);
                }
            }
        }

        public c(b bVar) {
            bVar.getClass();
            this.f7180c = bVar;
        }

        @Override // androidx.fragment.app.q0.b
        public final void b(ViewGroup viewGroup) {
            AnimatorSet animatorSet = this.f7181d;
            b bVar = this.f7180c;
            if (animatorSet == null) {
                bVar.f7189a.c(this);
                return;
            }
            q0.d dVar = bVar.f7189a;
            if (dVar.f7339g) {
                C0101e.f7188a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (v.R(2)) {
                dVar.toString();
            }
        }

        @Override // androidx.fragment.app.q0.b
        public final void c(ViewGroup viewGroup) {
            q0.d dVar = this.f7180c.f7189a;
            AnimatorSet animatorSet = this.f7181d;
            if (animatorSet == null) {
                dVar.c(this);
                return;
            }
            animatorSet.start();
            if (v.R(2)) {
                Objects.toString(dVar);
            }
        }

        @Override // androidx.fragment.app.q0.b
        public final void d(b.c cVar, ViewGroup viewGroup) {
            q0.d dVar = this.f7180c.f7189a;
            AnimatorSet animatorSet = this.f7181d;
            if (animatorSet == null) {
                dVar.c(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !dVar.f7335c.mTransitioning) {
                return;
            }
            if (v.R(2)) {
                dVar.toString();
            }
            long jA = d.f7187a.a(animatorSet);
            long j8 = (long) (cVar.f13789c * jA);
            if (j8 == 0) {
                j8 = 1;
            }
            if (j8 == jA) {
                j8 = jA - 1;
            }
            if (v.R(2)) {
                animatorSet.toString();
                dVar.toString();
            }
            C0101e.f7188a.b(animatorSet, j8);
        }

        @Override // androidx.fragment.app.q0.b
        public final void e(ViewGroup viewGroup) {
            c cVar;
            b bVar = this.f7180c;
            if (bVar.a()) {
                return;
            }
            Context context = viewGroup.getContext();
            context.getClass();
            n.a aVarB = bVar.b(context);
            this.f7181d = aVarB != null ? aVarB.f7301b : null;
            q0.d dVar = bVar.f7189a;
            Fragment fragment = dVar.f7335c;
            boolean z14 = dVar.f7333a == q0.d.b.GONE;
            View view2 = fragment.mView;
            viewGroup.startViewTransition(view2);
            AnimatorSet animatorSet = this.f7181d;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(viewGroup, view2, z14, dVar, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f7181d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/e$d;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f7187a = new d();

        private d() {
        }

        public final long a(AnimatorSet animatorSet) {
            animatorSet.getClass();
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/e$e;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)V", "", "time", "b", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0101e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0101e f7188a = new C0101e();

        private C0101e() {
        }

        public final void a(AnimatorSet animatorSet) {
            animatorSet.getClass();
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long time) {
            animatorSet.getClass();
            animatorSet.setCurrentPlayTime(time);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/e$f;", "", "Landroidx/fragment/app/q0$d;", "operation", "<init>", "(Landroidx/fragment/app/q0$d;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0.d f7189a;

        public f(q0.d dVar) {
            dVar.getClass();
            this.f7189a = dVar;
        }

        public final boolean a() {
            q0.d.b bVarA;
            q0.d dVar = this.f7189a;
            View view2 = dVar.f7335c.mView;
            if (view2 != null) {
                q0.d.b.f7348a.getClass();
                bVarA = q0.d.b.a.a(view2);
            } else {
                bVarA = null;
            }
            q0.d.b bVar = dVar.f7333a;
            if (bVarA == bVar) {
                return true;
            }
            q0.d.b bVar2 = q0.d.b.VISIBLE;
            return (bVarA == bVar2 || bVar == bVar2) ? false : true;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/e$g;", "Landroidx/fragment/app/q0$b;", "", "Landroidx/fragment/app/e$h;", "transitionInfos", "Landroidx/fragment/app/q0$d;", "firstOut", "lastIn", "Landroidx/fragment/app/l0;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Lp1/a;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/q0$d;Landroidx/fragment/app/q0$d;Landroidx/fragment/app/l0;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lp1/a;Ljava/util/ArrayList;Ljava/util/ArrayList;Lp1/a;Lp1/a;Z)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g extends q0.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<h> f7190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final q0.d f7191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final q0.d f7192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final l0 f7193f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f7194g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayList<View> f7195h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ArrayList<View> f7196i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final p1.a<String, String> f7197j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ArrayList<String> f7198k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ArrayList<String> f7199l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final p1.a<String, View> f7200m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final p1.a<String, View> f7201n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f7202o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final h7.d f7203p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f7204q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f7205r;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f7207b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f7208c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f7207b = viewGroup;
                this.f7208c = obj;
            }

            @Override // e23.a
            public final Unit invoke() {
                g.this.f7193f.e(this.f7207b, this.f7208c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class b extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f7210b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f7211c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p005kotlin.jvm.internal.r0<e23.a<Unit>> f7212d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, p005kotlin.jvm.internal.r0<e23.a<Unit>> r0Var) {
                super(0);
                this.f7210b = viewGroup;
                this.f7211c = obj;
                this.f7212d = r0Var;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.fragment.app.g] */
            @Override // e23.a
            public final Unit invoke() {
                g gVar = g.this;
                l0 l0Var = gVar.f7193f;
                ViewGroup viewGroup = this.f7210b;
                Object obj = this.f7211c;
                Object objI = l0Var.i(viewGroup, obj);
                gVar.f7204q = objI;
                if (objI == null) {
                    gVar.f7205r = true;
                } else {
                    this.f7212d.f105810a = new androidx.fragment.app.g(gVar, obj, viewGroup);
                    if (v.R(2)) {
                        Objects.toString(gVar.f7191d);
                        Objects.toString(gVar.f7192e);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public g(List<h> list, q0.d dVar, q0.d dVar2, l0 l0Var, Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2, p1.a<String, String> aVar, ArrayList<String> arrayList3, ArrayList<String> arrayList4, p1.a<String, View> aVar2, p1.a<String, View> aVar3, boolean z14) {
            list.getClass();
            l0Var.getClass();
            arrayList.getClass();
            arrayList2.getClass();
            aVar.getClass();
            arrayList3.getClass();
            arrayList4.getClass();
            aVar2.getClass();
            aVar3.getClass();
            this.f7190c = list;
            this.f7191d = dVar;
            this.f7192e = dVar2;
            this.f7193f = l0Var;
            this.f7194g = obj;
            this.f7195h = arrayList;
            this.f7196i = arrayList2;
            this.f7197j = aVar;
            this.f7198k = arrayList3;
            this.f7199l = arrayList4;
            this.f7200m = aVar2;
            this.f7201n = aVar3;
            this.f7202o = z14;
            this.f7203p = new h7.d();
        }

        public static void f(ArrayList arrayList, View view2) {
            if (!(view2 instanceof ViewGroup)) {
                if (arrayList.contains(view2)) {
                    return;
                }
                arrayList.add(view2);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view2;
            WindowInsets windowInsets = w0.f6584a;
            if (viewGroup.isTransitionGroup()) {
                if (arrayList.contains(view2)) {
                    return;
                }
                arrayList.add(view2);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (childAt.getVisibility() == 0) {
                    f(arrayList, childAt);
                }
            }
        }

        @Override // androidx.fragment.app.q0.b
        public final boolean a() {
            Object obj;
            l0 l0Var = this.f7193f;
            if (!l0Var.l()) {
                return false;
            }
            List<h> list = this.f7190c;
            if (list == null || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || (obj = hVar.f7213b) == null || !l0Var.m(obj)) {
                        return false;
                    }
                }
            }
            Object obj2 = this.f7194g;
            return obj2 == null || l0Var.m(obj2);
        }

        @Override // androidx.fragment.app.q0.b
        public final void b(ViewGroup viewGroup) {
            this.f7203p.a();
        }

        @Override // androidx.fragment.app.q0.b
        public final void c(ViewGroup viewGroup) {
            boolean zIsLaidOut = viewGroup.isLaidOut();
            List<h> list = this.f7190c;
            if (!zIsLaidOut || this.f7205r) {
                for (h hVar : list) {
                    q0.d dVar = hVar.f7189a;
                    if (v.R(2)) {
                        if (this.f7205r) {
                            Objects.toString(dVar);
                        } else {
                            viewGroup.toString();
                            Objects.toString(dVar);
                        }
                    }
                    hVar.f7189a.c(this);
                }
                this.f7205r = false;
                return;
            }
            Object obj = this.f7204q;
            l0 l0Var = this.f7193f;
            q0.d dVar2 = this.f7192e;
            q0.d dVar3 = this.f7191d;
            if (obj != null) {
                l0Var.c(obj);
                if (v.R(2)) {
                    Objects.toString(dVar3);
                    Objects.toString(dVar2);
                    return;
                }
                return;
            }
            o13.p<ArrayList<View>, Object> pVarG = g(viewGroup, dVar2, dVar3);
            ArrayList<View> arrayList = pVarG.f128594a;
            Object obj2 = pVarG.f128595b;
            ArrayList<q0.d> arrayList2 = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).f7189a);
            }
            for (q0.d dVar4 : arrayList2) {
                l0Var.u(dVar4.f7335c, obj2, this.f7203p, new androidx.fragment.app.f(dVar4, this, 1));
            }
            i(arrayList, viewGroup, new a(viewGroup, obj2));
            if (v.R(2)) {
                Objects.toString(dVar3);
                Objects.toString(dVar2);
            }
        }

        @Override // androidx.fragment.app.q0.b
        public final void d(b.c cVar, ViewGroup viewGroup) {
            Object obj = this.f7204q;
            if (obj != null) {
                this.f7193f.r(obj, cVar.f13789c);
            }
        }

        @Override // androidx.fragment.app.q0.b
        public final void e(ViewGroup viewGroup) {
            Object obj;
            boolean zIsLaidOut = viewGroup.isLaidOut();
            List<h> list = this.f7190c;
            if (!zIsLaidOut) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    q0.d dVar = ((h) it.next()).f7189a;
                    if (v.R(2)) {
                        viewGroup.toString();
                        Objects.toString(dVar);
                    }
                }
                return;
            }
            boolean zH = h();
            q0.d dVar2 = this.f7192e;
            q0.d dVar3 = this.f7191d;
            if (zH && (obj = this.f7194g) != null && !a()) {
                Objects.toString(obj);
                Objects.toString(dVar3);
                Objects.toString(dVar2);
            }
            if (a() && h()) {
                p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
                o13.p<ArrayList<View>, Object> pVarG = g(viewGroup, dVar2, dVar3);
                ArrayList<View> arrayList = pVarG.f128594a;
                Object obj2 = pVarG.f128595b;
                ArrayList<q0.d> arrayList2 = new ArrayList(p13.y.r(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((h) it3.next()).f7189a);
                }
                for (q0.d dVar4 : arrayList2) {
                    a0.c cVar = new a0.c(r0Var, 8);
                    Fragment fragment = dVar4.f7335c;
                    this.f7193f.v(obj2, this.f7203p, cVar, new androidx.fragment.app.f(dVar4, this, 0));
                }
                i(arrayList, viewGroup, new b(viewGroup, obj2, r0Var));
            }
        }

        public final o13.p<ArrayList<View>, Object> g(ViewGroup viewGroup, q0.d dVar, q0.d dVar2) {
            ArrayList<View> arrayList;
            ArrayList<View> arrayList2;
            Object obj;
            l0 l0Var;
            Object obj2;
            ArrayList<View> arrayList3;
            this = this;
            View view2 = new View(viewGroup.getContext());
            Rect rect = new Rect();
            List<h> list = this.f7190c;
            Iterator<h> it = list.iterator();
            View view3 = null;
            boolean z14 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f7196i;
                arrayList2 = this.f7195h;
                obj = this.f7194g;
                l0Var = this.f7193f;
                if (!zHasNext) {
                    break;
                }
                if (it.next().f7215d != null && dVar2 != null && dVar != null && !this.f7197j.isEmpty() && obj != null) {
                    Fragment fragment = dVar.f7335c;
                    Fragment fragment2 = dVar2.f7335c;
                    boolean z15 = this.f7202o;
                    p1.a<String, View> aVar = this.f7200m;
                    h0.a(fragment, fragment2, z15, aVar);
                    androidx.core.view.c0.a(viewGroup, new a8.d(dVar, 5, dVar2, this));
                    arrayList2.addAll(aVar.values());
                    ArrayList<String> arrayList4 = this.f7199l;
                    if (!arrayList4.isEmpty()) {
                        String str = arrayList4.get(0);
                        str.getClass();
                        View view4 = aVar.get(str);
                        l0Var.s(view4, obj);
                        view3 = view4;
                    }
                    p1.a<String, View> aVar2 = this.f7201n;
                    arrayList.addAll(aVar2.values());
                    ArrayList<String> arrayList5 = this.f7198k;
                    if (!arrayList5.isEmpty()) {
                        String str2 = arrayList5.get(0);
                        str2.getClass();
                        View view5 = aVar2.get(str2);
                        if (view5 != null) {
                            androidx.core.view.c0.a(viewGroup, new a8.d(l0Var, 6, view5, rect));
                            z14 = true;
                        }
                    }
                    l0Var.w(obj, view2, arrayList2);
                    ArrayList<View> arrayList6 = this.f7196i;
                    l0 l0Var2 = this.f7193f;
                    Object obj3 = this.f7194g;
                    l0Var2.q(obj3, null, null, obj3, arrayList6);
                }
                list = list;
                it = it;
            }
            List<h> list2 = list;
            ArrayList arrayList7 = new ArrayList();
            Iterator<h> it3 = list2.iterator();
            Object objO = null;
            Object objO2 = null;
            while (it3.hasNext()) {
                it3 = it3;
                h next = it3.next();
                z14 = z14;
                q0.d dVar3 = next.f7189a;
                arrayList = arrayList;
                Object objH = l0Var.h(next.f7213b);
                if (objH != null) {
                    ArrayList<View> arrayList8 = arrayList2;
                    ArrayList<View> arrayList9 = new ArrayList<>();
                    Object obj4 = obj;
                    Fragment fragment3 = dVar3.f7335c;
                    Object obj5 = objO2;
                    View view6 = fragment3.mView;
                    view6.getClass();
                    f(arrayList9, view6);
                    if (obj4 != null && (dVar3 == dVar2 || dVar3 == dVar)) {
                        if (dVar3 == dVar2) {
                            arrayList9.removeAll(p13.h0.g1(arrayList8));
                        } else {
                            arrayList9.removeAll(p13.h0.g1(arrayList));
                        }
                    }
                    if (arrayList9.isEmpty()) {
                        l0Var.a(view2, objH);
                        obj2 = objH;
                        arrayList3 = arrayList9;
                    } else {
                        l0Var.b(objH, arrayList9);
                        this.f7193f.q(objH, objH, arrayList9, null, null);
                        obj2 = objH;
                        arrayList3 = arrayList9;
                        if (dVar3.f7333a == q0.d.b.GONE) {
                            dVar3.f7341i = false;
                            ArrayList<View> arrayList10 = new ArrayList<>(arrayList3);
                            arrayList10.remove(fragment3.mView);
                            l0Var.p(obj2, fragment3.mView, arrayList10);
                            androidx.core.view.c0.a(viewGroup, new a0.c(arrayList3, 9));
                        }
                    }
                    if (dVar3.f7333a == q0.d.b.VISIBLE) {
                        arrayList7.addAll(arrayList3);
                        if (z14) {
                            l0Var.t(obj2, rect);
                        }
                        if (v.R(2)) {
                            obj2.toString();
                            for (View view7 : arrayList3) {
                                view7.getClass();
                                view7.toString();
                            }
                        }
                    } else {
                        l0Var.s(view3, obj2);
                        if (v.R(2)) {
                            obj2.toString();
                            for (View view8 : arrayList3) {
                                view8.getClass();
                                view8.toString();
                            }
                        }
                    }
                    if (next.f7214c) {
                        objO = l0Var.o(objO, obj2);
                        arrayList2 = arrayList8;
                        obj = obj4;
                        objO2 = obj5;
                    } else {
                        objO2 = l0Var.o(obj5, obj2);
                        arrayList2 = arrayList8;
                        obj = obj4;
                    }
                }
            }
            Object objN = l0Var.n(objO, objO2, obj);
            if (v.R(2)) {
                Objects.toString(objN);
                viewGroup.toString();
            }
            return new o13.p<>(arrayList7, objN);
        }

        public final boolean h() {
            List<h> list = this.f7190c;
            if (list != null && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).f7189a.f7335c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        public final void i(ArrayList<View> arrayList, ViewGroup viewGroup, e23.a<Unit> aVar) {
            h0.c(4, arrayList);
            l0 l0Var = this.f7193f;
            l0Var.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<View> arrayList3 = this.f7196i;
            int size = arrayList3.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view2 = arrayList3.get(i14);
                WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
                arrayList2.add(view2.getTransitionName());
                view2.setTransitionName(null);
            }
            boolean zR = v.R(2);
            ArrayList<View> arrayList4 = this.f7195h;
            if (zR) {
                for (View view3 : arrayList4) {
                    view3.getClass();
                    View view4 = view3;
                    view4.toString();
                    WeakHashMap<View, g1> weakHashMap2 = androidx.core.view.s0.f6563a;
                    view4.getTransitionName();
                }
                for (View view5 : arrayList3) {
                    view5.getClass();
                    View view6 = view5;
                    view6.toString();
                    WeakHashMap<View, g1> weakHashMap3 = androidx.core.view.s0.f6563a;
                    view6.getTransitionName();
                }
            }
            aVar.invoke();
            int size2 = arrayList3.size();
            ArrayList arrayList5 = new ArrayList();
            int i15 = 0;
            while (true) {
                ArrayList<View> arrayList6 = this.f7195h;
                if (i15 >= size2) {
                    androidx.core.view.c0.a(viewGroup, new k0(l0Var, size2, arrayList3, arrayList2, arrayList6, arrayList5));
                    h0.c(0, arrayList);
                    l0Var.x(this.f7194g, arrayList4, arrayList3);
                    return;
                }
                View view7 = arrayList6.get(i15);
                WeakHashMap<View, g1> weakHashMap4 = androidx.core.view.s0.f6563a;
                String transitionName = view7.getTransitionName();
                arrayList5.add(transitionName);
                if (transitionName != null) {
                    view7.setTransitionName(null);
                    String str = this.f7197j.get(transitionName);
                    for (int i16 = 0; i16 < size2; i16++) {
                        if (str.equals(arrayList2.get(i16))) {
                            arrayList3.get(i16).setTransitionName(transitionName);
                            break;
                        }
                    }
                }
                i15++;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/e$h;", "Landroidx/fragment/app/e$f;", "Landroidx/fragment/app/q0$d;", "operation", "", "isPop", "providesSharedElementTransition", "<init>", "(Landroidx/fragment/app/q0$d;ZZ)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f7213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f7214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f7215d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q0.d dVar, boolean z14, boolean z15) {
            super(dVar);
            dVar.getClass();
            Fragment fragment = dVar.f7335c;
            q0.d.b bVar = dVar.f7333a;
            q0.d.b bVar2 = q0.d.b.VISIBLE;
            this.f7213b = bVar == bVar2 ? z14 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z14 ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.f7214c = dVar.f7333a == bVar2 ? z14 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.f7215d = z15 ? z14 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        public final l0 b() {
            Object obj = this.f7213b;
            l0 l0VarC = c(obj);
            Object obj2 = this.f7215d;
            l0 l0VarC2 = c(obj2);
            if (l0VarC == null || l0VarC2 == null || l0VarC == l0VarC2) {
                return l0VarC == null ? l0VarC2 : l0VarC;
            }
            kg.f.m(this.f7189a.f7335c, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", " returned Transition ", obj, " which uses a different Transition  type than its shared element transition ", obj2);
            return null;
        }

        public final l0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            i0 i0Var = h0.f7262a;
            if (i0Var != null && (obj instanceof Transition)) {
                return i0Var;
            }
            l0 l0Var = h0.f7263b;
            if (l0Var != null && l0Var.g(obj)) {
                return l0Var;
            }
            StringBuilder sb3 = new StringBuilder("Transition ");
            sb3.append(obj);
            Fragment fragment = this.f7189a.f7335c;
            sb3.append(" for fragment ");
            sb3.append(fragment);
            sb3.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ViewGroup viewGroup) {
        super(viewGroup);
        viewGroup.getClass();
    }

    public static void n(p1.a aVar, View view2) {
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        String transitionName = view2.getTransitionName();
        if (transitionName != null) {
            aVar.put(transitionName, view2);
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (childAt.getVisibility() == 0) {
                    n(aVar, childAt);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0403 A[LOOP:19: B:157:0x03fd->B:159:0x0403, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.q0
    public final void b(ArrayList arrayList, boolean z14) {
        Object next;
        Object objPrevious;
        int i14;
        ArrayList<b> arrayList2;
        int i15;
        g gVar;
        boolean z15;
        Iterator it;
        String strB;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            q0.d dVar = (q0.d) next;
            q0.d.b.a aVar = q0.d.b.f7348a;
            View view2 = dVar.f7335c.mView;
            view2.getClass();
            aVar.getClass();
            q0.d.b bVarA = q0.d.b.a.a(view2);
            q0.d.b bVar = q0.d.b.VISIBLE;
            if (bVarA == bVar && dVar.f7333a != bVar) {
                break;
            }
        }
        q0.d dVar2 = (q0.d) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            q0.d dVar3 = (q0.d) objPrevious;
            q0.d.b.a aVar2 = q0.d.b.f7348a;
            View view3 = dVar3.f7335c.mView;
            view3.getClass();
            aVar2.getClass();
            q0.d.b bVarA2 = q0.d.b.a.a(view3);
            q0.d.b bVar2 = q0.d.b.VISIBLE;
            if (bVarA2 != bVar2 && dVar3.f7333a == bVar2) {
                break;
            }
        }
        q0.d dVar4 = (q0.d) objPrevious;
        int i16 = 2;
        if (v.R(2)) {
            Objects.toString(dVar2);
            Objects.toString(dVar4);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Fragment fragment = ((q0.d) p13.h0.m0(arrayList)).f7335c;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Fragment.k kVar = ((q0.d) it4.next()).f7335c.mAnimationInfo;
            Fragment.k kVar2 = fragment.mAnimationInfo;
            kVar.f7100b = kVar2.f7100b;
            kVar.f7101c = kVar2.f7101c;
            kVar.f7102d = kVar2.f7102d;
            kVar.f7103e = kVar2.f7103e;
        }
        Iterator it5 = arrayList.iterator();
        while (true) {
            i14 = 0;
            if (!it5.hasNext()) {
                break;
            }
            q0.d dVar5 = (q0.d) it5.next();
            arrayList3.add(new b(dVar5, z14));
            arrayList4.add(new h(dVar5, z14, !z14 ? dVar5 != dVar4 : dVar5 != dVar2));
            dVar5.f7336d.add(new androidx.fragment.app.d(i14, this, dVar5));
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : arrayList4) {
            if (!((h) obj).a()) {
                arrayList5.add(obj);
            }
        }
        ArrayList<h> arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            if (((h) obj2).b() != null) {
                arrayList6.add(obj2);
            }
        }
        l0 l0Var = null;
        for (h hVar : arrayList6) {
            l0 l0VarB = hVar.b();
            if (l0Var != null && l0VarB != l0Var) {
                StringBuilder sb3 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb3.append(hVar.f7189a.f7335c);
                sb3.append(" returned Transition ");
                vb.h.x(am.j.k(hVar.f7213b, " which uses a different Transition type than other Fragments.", sb3));
                return;
            }
            l0Var = l0VarB;
        }
        if (l0Var == null) {
            arrayList2 = arrayList3;
            i15 = 2;
            z15 = 0;
        } else {
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            p1.a aVar3 = new p1.a();
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            p1.a aVar4 = new p1.a();
            ArrayList<String> sharedElementSourceNames = arrayList10;
            p1.a aVar5 = new p1.a();
            Iterator it6 = arrayList6.iterator();
            Object obj3 = null;
            while (it6.hasNext()) {
                Object obj4 = ((h) it6.next()).f7215d;
                if (obj4 == null || dVar2 == null) {
                    i16 = i16;
                    i14 = i14;
                    i16 = i16;
                    arrayList3 = arrayList3;
                    dVar2 = dVar2;
                    arrayList7 = arrayList7;
                } else {
                    i16 = i16;
                    Fragment fragment2 = dVar2.f7335c;
                    if (dVar4 != null) {
                        Fragment fragment3 = dVar4.f7335c;
                        Object objY = l0Var.y(l0Var.h(obj4));
                        sharedElementSourceNames = fragment3.getSharedElementSourceNames();
                        sharedElementSourceNames.getClass();
                        ArrayList<String> sharedElementSourceNames2 = fragment2.getSharedElementSourceNames();
                        sharedElementSourceNames2.getClass();
                        ArrayList arrayList11 = arrayList3;
                        ArrayList<String> sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                        sharedElementTargetNames.getClass();
                        dVar2 = dVar2;
                        int size = sharedElementTargetNames.size();
                        arrayList7 = arrayList7;
                        int i17 = 0;
                        while (i17 < size) {
                            int i18 = size;
                            int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i17));
                            if (iIndexOf != -1) {
                                sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i17));
                            }
                            i17++;
                            size = i18;
                        }
                        ArrayList<String> sharedElementTargetNames2 = fragment3.getSharedElementTargetNames();
                        sharedElementTargetNames2.getClass();
                        o13.p pVar = !z14 ? new o13.p(fragment2.getExitTransitionCallback(), fragment3.getEnterTransitionCallback()) : new o13.p(fragment2.getEnterTransitionCallback(), fragment3.getExitTransitionCallback());
                        z6.g0 g0Var = (z6.g0) pVar.f128594a;
                        z6.g0 g0Var2 = (z6.g0) pVar.f128595b;
                        int size2 = sharedElementSourceNames.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            String str = sharedElementSourceNames.get(i19);
                            str.getClass();
                            z6.g0 g0Var3 = g0Var;
                            String str2 = str;
                            String str3 = sharedElementTargetNames2.get(i19);
                            str3.getClass();
                            aVar3.put(str2, str3);
                            i19++;
                            g0Var = g0Var3;
                            g0Var2 = g0Var2;
                        }
                        z6.g0 g0Var4 = g0Var;
                        z6.g0 g0Var5 = g0Var2;
                        if (v.R(i16)) {
                            for (String str4 : sharedElementTargetNames2) {
                            }
                            for (String str5 : sharedElementSourceNames) {
                            }
                        }
                        View view4 = fragment2.mView;
                        view4.getClass();
                        n(aVar4, view4);
                        aVar4.n(sharedElementSourceNames);
                        if (g0Var4 != null) {
                            if (v.R(i16)) {
                                dVar2.toString();
                            }
                            int size3 = sharedElementSourceNames.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i24 = size3 - 1;
                                    String str6 = sharedElementSourceNames.get(size3);
                                    str6.getClass();
                                    String str7 = str6;
                                    View view5 = (View) aVar4.get(str7);
                                    if (view5 == null) {
                                        aVar3.remove(str7);
                                    } else {
                                        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
                                        if (!str7.equals(view5.getTransitionName())) {
                                            aVar3.put(view5.getTransitionName(), (String) aVar3.remove(str7));
                                        }
                                    }
                                    if (i24 < 0) {
                                        break;
                                    } else {
                                        size3 = i24;
                                    }
                                }
                            }
                        } else {
                            aVar3.n(aVar4.keySet());
                        }
                        View view6 = fragment3.mView;
                        view6.getClass();
                        n(aVar5, view6);
                        aVar5.n(sharedElementTargetNames2);
                        aVar5.n(aVar3.values());
                        if (g0Var5 != null) {
                            if (v.R(i16)) {
                                dVar4.toString();
                            }
                            int size4 = sharedElementTargetNames2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i25 = size4 - 1;
                                    String str8 = sharedElementTargetNames2.get(size4);
                                    str8.getClass();
                                    String str9 = str8;
                                    View view7 = (View) aVar5.get(str9);
                                    if (view7 == null) {
                                        String strB2 = h0.b(aVar3, str9);
                                        if (strB2 != null) {
                                            aVar3.remove(strB2);
                                        }
                                    } else {
                                        WeakHashMap<View, g1> weakHashMap2 = androidx.core.view.s0.f6563a;
                                        if (!str9.equals(view7.getTransitionName()) && (strB = h0.b(aVar3, str9)) != null) {
                                            aVar3.put(strB, view7.getTransitionName());
                                        }
                                    }
                                    if (i25 < 0) {
                                        break;
                                    } else {
                                        size4 = i25;
                                    }
                                }
                            }
                        } else {
                            i0 i0Var = h0.f7262a;
                            for (int i26 = aVar3.f134761c - 1; -1 < i26; i26--) {
                                if (!aVar5.containsKey((String) aVar3.k(i26))) {
                                    aVar3.i(i26);
                                }
                            }
                        }
                        Set setKeySet = aVar3.keySet();
                        Set setEntrySet = aVar4.entrySet();
                        androidx.fragment.app.h hVar2 = new androidx.fragment.app.h(setKeySet);
                        i14 = 0;
                        p13.d0.z(setEntrySet, hVar2, false);
                        p13.d0.z(aVar5.entrySet(), new androidx.fragment.app.h(aVar3.values()), false);
                        if (aVar3.isEmpty()) {
                            Objects.toString(objY);
                            dVar2.toString();
                            dVar4.toString();
                            arrayList7.clear();
                            arrayList8.clear();
                            obj3 = null;
                        } else {
                            obj3 = objY;
                        }
                        arrayList9 = sharedElementTargetNames2;
                        arrayList3 = arrayList11;
                    } else {
                        i14 = i14;
                        i16 = i16;
                        arrayList3 = arrayList3;
                        dVar2 = dVar2;
                        arrayList7 = arrayList7;
                    }
                }
            }
            arrayList2 = arrayList3;
            q0.d dVar6 = dVar2;
            ArrayList arrayList12 = arrayList7;
            int i27 = i14;
            i15 = i16;
            if (obj3 != null) {
                z15 = i27;
                gVar = new g(arrayList6, dVar6, dVar4, l0Var, obj3, arrayList12, arrayList8, aVar3, arrayList9, sharedElementSourceNames, aVar4, aVar5, z14);
                it = arrayList6.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).f7189a.f7342j.add(gVar);
                }
            } else {
                if (!arrayList6.isEmpty()) {
                    Iterator it7 = arrayList6.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            if (((h) it7.next()).f7213b != null) {
                                z15 = i27;
                                gVar = new g(arrayList6, dVar6, dVar4, l0Var, obj3, arrayList12, arrayList8, aVar3, arrayList9, sharedElementSourceNames, aVar4, aVar5, z14);
                                it = arrayList6.iterator();
                                while (it.hasNext()) {
                                    ((h) it.next()).f7189a.f7342j.add(gVar);
                                }
                            }
                        }
                    }
                }
                z15 = i27;
            }
        }
        ArrayList<b> arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            p13.d0.v(arrayList14, ((b) it8.next()).f7189a.f7343k);
        }
        boolean zIsEmpty = arrayList14.isEmpty();
        boolean z16 = z15;
        for (b bVar3 : arrayList2) {
            Context context = this.f7324a.getContext();
            q0.d dVar7 = bVar3.f7189a;
            context.getClass();
            n.a aVarB = bVar3.b(context);
            if (aVarB != null) {
                if (aVarB.f7301b == null) {
                    arrayList13.add(bVar3);
                } else {
                    Fragment fragment4 = dVar7.f7335c;
                    if (dVar7.f7343k.isEmpty()) {
                        if (dVar7.f7333a == q0.d.b.GONE) {
                            dVar7.f7341i = z15;
                        }
                        dVar7.f7342j.add(new c(bVar3));
                        z16 = true;
                    } else if (v.R(i15)) {
                        Objects.toString(fragment4);
                    }
                }
            }
        }
        for (b bVar4 : arrayList13) {
            q0.d dVar8 = bVar4.f7189a;
            Fragment fragment5 = dVar8.f7335c;
            if (zIsEmpty) {
                if (!z16) {
                    dVar8.f7342j.add(new a(bVar4));
                } else if (v.R(i15)) {
                    Objects.toString(fragment5);
                }
            } else if (v.R(i15)) {
                Objects.toString(fragment5);
            }
        }
    }
}
