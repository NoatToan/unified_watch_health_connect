package r22;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr22/p0;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p0 extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LottieAnimationView f149781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f149782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f149783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f149784d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr22/p0$a;", "", "", "animResId", "<init>", "(Ljava/lang/String;II)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        PROGRESS(R.raw.button_to_checkmark_2_spinner),
        SUCCESS(R.raw.button_to_checkmark_3_success),
        ERROR(R.raw.button_to_checkmark_3_fail);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f149789a;

        a(int i14) {
            this.f149789a = i14;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149790a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f149790a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"r22/p0$c", "Landroid/animation/AnimatorListenerAdapter;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f149791b = 0;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            p0 p0Var = p0.this;
            a aVar = p0Var.f149784d;
            if (aVar == a.SUCCESS || aVar == a.ERROR) {
                new Handler().postDelayed(new po.g(p0Var, 13), 1000L);
            }
        }
    }

    @Override // androidx.fragment.app.i
    @SuppressLint({"InflateParams"})
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.gcm4_lottie_progress_dialog, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.animation_view);
        viewFindViewById.getClass();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        this.f149781a = lottieAnimationView;
        lottieAnimationView.addAnimatorListener(new c());
        View viewFindViewById2 = viewInflate.findViewById(R.id.title_view);
        viewFindViewById2.getClass();
        this.f149782b = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.description_view);
        viewFindViewById3.getClass();
        this.f149783c = (TextView) viewFindViewById3;
        v6(a.PROGRESS);
        Dialog dialog = new Dialog(requireContext(), R.style.GCMInfoDialogStyle);
        dialog.setContentView(viewInflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.setCanceledOnTouchOutside(false);
        return dialog;
    }

    public final void u6(int i14, boolean z14, boolean z15) {
        LottieAnimationView lottieAnimationView = this.f149781a;
        if (lottieAnimationView == null) {
            p005kotlin.jvm.internal.s.m("animationView");
            throw null;
        }
        lottieAnimationView.setAnimation(i14);
        LottieAnimationView lottieAnimationView2 = this.f149781a;
        if (lottieAnimationView2 == null) {
            p005kotlin.jvm.internal.s.m("animationView");
            throw null;
        }
        lottieAnimationView2.setProgress(0.0f);
        LottieAnimationView lottieAnimationView3 = this.f149781a;
        if (lottieAnimationView3 == null) {
            p005kotlin.jvm.internal.s.m("animationView");
            throw null;
        }
        lottieAnimationView3.setRepeatCount(z14 ? -1 : 0);
        if (z15) {
            LottieAnimationView lottieAnimationView4 = this.f149781a;
            if (lottieAnimationView4 != null) {
                lottieAnimationView4.playAnimation();
            } else {
                p005kotlin.jvm.internal.s.m("animationView");
                throw null;
            }
        }
    }

    public final void v6(a aVar) {
        this.f149784d = aVar;
        int i14 = aVar == null ? -1 : b.f149790a[aVar.ordinal()];
        if (i14 != -1) {
            if (i14 == 1) {
                u6(a.PROGRESS.f149789a, true, false);
                return;
            }
            if (i14 == 2) {
                u6(a.SUCCESS.f149789a, false, true);
            } else if (i14 == 3) {
                u6(a.ERROR.f149789a, false, true);
            } else {
                lc.u0.r();
            }
        }
    }

    public final void w6() {
        if (getDialog() == null || !requireDialog().isShowing()) {
            return;
        }
        v6(a.ERROR);
        TextView textView = this.f149782b;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("titleTextView");
            throw null;
        }
        textView.setText(R.string.lbl_retry);
        TextView textView2 = this.f149783c;
        if (textView2 != null) {
            textView2.setText(R.string.startup_no_server_conn_desc);
        } else {
            p005kotlin.jvm.internal.s.m("descriptionTextView");
            throw null;
        }
    }

    public final void y6(int i14, int i15) {
        if (getDialog() == null || !requireDialog().isShowing()) {
            return;
        }
        v6(a.SUCCESS);
        TextView textView = this.f149782b;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("titleTextView");
            throw null;
        }
        textView.setText(i14);
        TextView textView2 = this.f149783c;
        if (textView2 != null) {
            textView2.setText(i15);
        } else {
            p005kotlin.jvm.internal.s.m("descriptionTextView");
            throw null;
        }
    }
}
