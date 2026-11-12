package yt;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.TextDelegate;
import com.airbnb.lottie.model.Marker;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.math.MathKt;
import p13.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lyt/h;", "Landroidx/fragment/app/Fragment;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator$AnimatorPauseListener;", "<init>", "()V", "a", "", "progress", "", "chapterIndex", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends Fragment implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener, Animator.AnimatorPauseListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f199301x = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ut.a f199303b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LottieDrawable f199306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c2 f199307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ot.s f199308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f199309h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f199311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Handler f199312k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f199314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaPlayer f199315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f199316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f199317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f199318q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f199320t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.appcompat.app.e f199322w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f199302a = new w1(s0.f105811a.b(n.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<Float> f199304c = new y0<>(Float.valueOf(0.0f));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<Boolean> f199305d = new y0<>(Boolean.FALSE);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o13.t f199310i = o13.m.b(new yt.a(this, 0));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f199313l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o13.t f199319r = o13.m.b(new yt.a(this, 3));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o13.t f199321v = o13.m.b(new yt.a(this, 5));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199323a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.INTRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.CHAPTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r.SHARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[r.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f199323a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f199324a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f199324a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f199324a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f199324a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f199325a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f199325a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f199325a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f199326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f199327b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f199326a = aVar;
            this.f199327b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f199326a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f199327b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f199328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f199328a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f199328a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    public final void A6(boolean z14) {
        this.f199313l.removeCallbacksAndMessages(null);
        this.f199305d.j(Boolean.valueOf(!z14));
    }

    public final void C6(boolean z14) {
        String str = "setPlayPauseMediaPlayer playEnable = " + z14 + ", mediaPosition = " + this.f199316o;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerFragment", str);
        MediaPlayer mediaPlayer = this.f199315n;
        boolean zIsPlaying = mediaPlayer != null ? mediaPlayer.isPlaying() : false;
        if (p005kotlin.jvm.internal.s.g(this.f199320t, Boolean.TRUE) && z14 && !zIsPlaying) {
            MediaPlayer mediaPlayer2 = this.f199315n;
            if (mediaPlayer2 != null) {
                mediaPlayer2.seekTo(this.f199316o);
            }
            MediaPlayer mediaPlayer3 = this.f199315n;
            if (mediaPlayer3 != null) {
                mediaPlayer3.start();
                return;
            }
            return;
        }
        if (z14 || !zIsPlaying) {
            return;
        }
        MediaPlayer mediaPlayer4 = this.f199315n;
        if (mediaPlayer4 != null) {
            mediaPlayer4.pause();
        }
        MediaPlayer mediaPlayer5 = this.f199315n;
        this.f199316o = mediaPlayer5 != null ? mediaPlayer5.getCurrentPosition() : 0;
    }

    public final void E6(Uri uri, boolean z14) {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f199315n = mediaPlayer;
            mediaPlayer.setDataSource(requireContext(), uri);
            MediaPlayer mediaPlayer2 = this.f199315n;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            }
            MediaPlayer mediaPlayer3 = this.f199315n;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setLooping(z14);
            }
            MediaPlayer mediaPlayer4 = this.f199315n;
            if (mediaPlayer4 != null) {
                mediaPlayer4.prepare();
            }
            if (p005kotlin.jvm.internal.s.g(this.f199320t, Boolean.TRUE)) {
                MediaPlayer mediaPlayer5 = this.f199315n;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.start();
                    return;
                }
                return;
            }
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AnnualReportPlayerFragment", "[AudioFocus] Not playing annual report audio as we didn't get audio focus");
        } catch (Exception e4) {
            String strN = fb1.c.n("setChapterMusic error, ", e4.getMessage());
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "AnnualReportPlayerFragment", strN);
        }
    }

    public final void F6(boolean z14) {
        MediaPlayer mediaPlayer = this.f199315n;
        long j8 = z14 ? 0L : 3000L;
        int i14 = z14 ? 1 : 20;
        if (mediaPlayer != null) {
            p0 p0Var = new p0();
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new k(p0Var, i14, mediaPlayer, handler, j8 / ((long) i14)));
        }
        this.f199315n = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerFragment", "onAnimationCancel");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        r rVarY4 = w6().y4();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerFragment", "onAnimationEnd currentViewState = " + rVarY4);
        int i14 = rVarY4 == null ? -1 : b.f199323a[rVarY4.ordinal()];
        if (i14 == 2) {
            w6().B4();
            return;
        }
        if (i14 == 3) {
            if (animator.isRunning()) {
                return;
            }
            y0<ot.l> y0Var = w6().f199340a;
            n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            dh.b.L(y0Var, viewLifecycleOwner, new c(new yt.b(this, 2)));
            w6().A4();
            return;
        }
        if (i14 != 4) {
            return;
        }
        ot.p pVarX4 = w6().x4();
        if (pVarX4 != null) {
            LottieDrawable lottieDrawable = this.f199306e;
            ArrayList arrayList = pVarX4.f133651e;
            if (lottieDrawable != null) {
                float progressForFrame = lottieDrawable.getComposition().getProgressForFrame(lottieDrawable.getMaxFrame()) - pVarX4.f133654h;
                i2.a.b(a2Var, "AnnualReportPlayable", "hasRemainFrameDisplay current Frame = " + lottieDrawable.getFrame() + ", maxFrame = " + lottieDrawable.getMaxFrame() + ", currentMaxProgress = " + progressForFrame);
                if (progressForFrame < pVarX4.f133653g && !arrayList.isEmpty()) {
                    ot.p.a aVar2 = (ot.p.a) h0.b0(arrayList);
                    float f14 = aVar2.f133659a + aVar2.f133660b;
                    float progressForFrame2 = lottieDrawable.getComposition().getProgressForFrame(aVar2.f133659a);
                    float f15 = arrayList.size() > 1 ? ((ot.p.a) arrayList.get(1)).f133659a : pVarX4.f133652f;
                    pVarX4.f133654h = (lottieDrawable.getComposition().getProgressForFrame(f14) - progressForFrame2) + pVarX4.f133654h;
                    lottieDrawable.setMinAndMaxFrame(MathKt.c(f14), MathKt.c(f15));
                    float f16 = pVarX4.f133654h;
                    StringBuilder sbI = v.e0.i("hasRemainFrameDisplay continuallySkipMaxFrame = ", f14, ", remainMaxFrame = ", f15, ", skipFramesTotalProgress = ");
                    sbI.append(f16);
                    sbI.append(", skipMinFrameProgress = ");
                    sbI.append(progressForFrame2);
                    i2.a.b(a2Var, "AnnualReportPlayable", sbI.toString());
                    arrayList.remove(aVar2);
                    LottieDrawable lottieDrawable2 = this.f199306e;
                    if (lottieDrawable2 != null) {
                        lottieDrawable2.playAnimation();
                        return;
                    }
                    return;
                }
            }
        }
        if (animator.isRunning()) {
            return;
        }
        n nVarW6 = w6();
        y0<r> y0Var2 = nVarW6.f199345f;
        Integer numD = nVarW6.f199343d.d();
        int iJ = p13.x.j(nVarW6.f199344e);
        if (numD != null && numD.intValue() == iJ) {
            r rVarD = y0Var2.d();
            r rVar = r.SHARE;
            if (rVarD != rVar) {
                y0Var2.j(rVar);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        animator.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerFragment", "onAnimationPause");
        this.f199313l.postDelayed(new yt.e(this, 1), 200L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerFragment", "onAnimationRepeat");
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        animator.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerFragment", "onAnimationResume");
        ot.p pVarX4 = w6().x4();
        i2.a.b(a2Var, "AnnualReportPlayerFragment", "handleChapterResume " + (pVarX4 != null ? pVarX4.getClass().getSimpleName() : null));
        A6(false);
        C6(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerFragment", "onAnimationStart");
        A6(false);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        ot.p pVarX4 = w6().x4();
        if (pVarX4 != null) {
            this.f199304c.j(Float.valueOf((fFloatValue - pVarX4.f133654h) / pVarX4.f133653g));
            LottieDrawable lottieDrawable = this.f199306e;
            if (lottieDrawable == null || fFloatValue != lottieDrawable.getComposition().getProgressForFrame(pVarX4.f133652f)) {
                return;
            }
            w6().A4();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ut.a aVarA = ut.a.a(layoutInflater, viewGroup);
        this.f199303b = aVarA;
        ConstraintLayout constraintLayout = aVarA.f172541a;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        c2 c2Var = this.f199307f;
        if (c2Var != null) {
            c2Var.c(null);
        }
        u6();
        F6(true);
        AudioManager audioManager = (AudioManager) this.f199319r.getValue();
        if (audioManager != null) {
            audioManager.abandonAudioFocusRequest((AudioFocusRequest) this.f199321v.getValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        androidx.appcompat.app.e eVar = this.f199322w;
        if (eVar != null) {
            eVar.dismiss();
        }
        this.f199322w = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        xj1.b bVar = new xj1.b(9, this, view2);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(view2, bVar);
        AudioManager audioManager = (AudioManager) this.f199319r.getValue();
        String string = null;
        Integer numValueOf = audioManager != null ? Integer.valueOf(audioManager.requestAudioFocus((AudioFocusRequest) this.f199321v.getValue())) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AnnualReportPlayerFragment", "[AudioFocus] We get audio focus on request");
            this.f199320t = Boolean.TRUE;
            return;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            d53.a.a(16);
            string = Integer.toString(iIntValue, 16);
            string.getClass();
        }
        String strM = am.j.m("[AudioFocus] We didn't get audio focus (", string, ") :(");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "AnnualReportPlayerFragment", strM);
    }

    public final void u6() {
        LottieDrawable lottieDrawable;
        LottieDrawable lottieDrawable2 = this.f199306e;
        if (lottieDrawable2 != null && lottieDrawable2.isAnimating() && (lottieDrawable = this.f199306e) != null) {
            lottieDrawable.cancelAnimation();
        }
        LottieDrawable lottieDrawable3 = this.f199306e;
        if (lottieDrawable3 != null) {
            lottieDrawable3.removeAllAnimatorListeners();
        }
        LottieDrawable lottieDrawable4 = this.f199306e;
        if (lottieDrawable4 != null) {
            lottieDrawable4.removeAllUpdateListeners();
        }
        LottieDrawable lottieDrawable5 = this.f199306e;
        if (lottieDrawable5 != null) {
            lottieDrawable5.removeAnimatorPauseListener(this);
        }
        LottieDrawable lottieDrawable6 = this.f199306e;
        if (lottieDrawable6 != null) {
            lottieDrawable6.clearComposition();
        }
    }

    public final void v6() {
        ut.a aVar = this.f199303b;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("binding");
            throw null;
        }
        ComposeView composeView = aVar.f172542b;
        composeView.setAlpha(0.0f);
        composeView.setVisibility(0);
        composeView.animate().alpha(1.0f).setDuration(500L).setListener(null);
    }

    public final n w6() {
        return (n) this.f199302a.getValue();
    }

    public final void y6(ot.p pVar) {
        String str = "playAnimation current view state = " + w6().y4() + ", chapter = " + pVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerFragment", str);
        z6(pVar);
        LottieDrawable lottieDrawable = this.f199306e;
        if (lottieDrawable != null) {
            lottieDrawable.playAnimation();
        }
        this.f199304c.j(Float.valueOf(0.0f));
    }

    public final void z6(ot.p pVar) {
        List<Marker> markers;
        u6();
        LottieDrawable lottieDrawable = new LottieDrawable();
        this.f199306e = lottieDrawable;
        ut.a aVar = this.f199303b;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("binding");
            throw null;
        }
        aVar.f172545e.setImageDrawable(lottieDrawable);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        LottieDrawable lottieDrawable2 = this.f199306e;
        pVar.getClass();
        ArrayList arrayList = pVar.f133650d;
        arrayList.clear();
        pVar.f133651e.clear();
        pVar.f133652f = 0.0f;
        pVar.f133653g = 1.0f;
        pVar.f133654h = 0.0f;
        if (lottieDrawable2 != null) {
            lottieDrawable2.setImagesAssetsFolder(pVar.getF133672o());
        }
        TextDelegate textDelegate = new TextDelegate(lottieDrawable2);
        if (lottieDrawable2 != null) {
            lottieDrawable2.setTextDelegate(textDelegate);
        }
        LottieComposition lottieCompositionE = pVar.e();
        if (lottieCompositionE != null) {
            pVar.f133652f = lottieCompositionE.getEndFrame();
        }
        LottieComposition lottieCompositionE2 = pVar.e();
        if (lottieCompositionE2 != null && (markers = lottieCompositionE2.getMarkers()) != null) {
            arrayList.addAll(markers);
        }
        if (lottieDrawable2 != null) {
            lottieDrawable2.setComposition(pVar.e());
        }
        pVar.i(contextRequireContext, lottieDrawable2);
        LottieDrawable lottieDrawable3 = this.f199306e;
        if (lottieDrawable3 != null) {
            lottieDrawable3.addAnimatorListener(this);
        }
        LottieDrawable lottieDrawable4 = this.f199306e;
        if (lottieDrawable4 != null) {
            lottieDrawable4.addAnimatorUpdateListener(this);
        }
        LottieDrawable lottieDrawable5 = this.f199306e;
        if (lottieDrawable5 != null) {
            lottieDrawable5.addAnimatorPauseListener(this);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lyt/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "LOADING_BANNER_DISPLAY_ANIMATION_DURATION", "J", "LOADING_BANNER_DISPLAY_WAITING_DURATION", "LONG_PRESS_TIMEOUT", "PAUSE_ANIMATION_TIMEOUT", "BACKGROUND_MUSIC_FADE_OUT_DURATION", "", "BACKGROUND_MUSIC_FADE_OUT_STEPS", "I", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
