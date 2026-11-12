package miuix.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import defpackage.alb;
import defpackage.awi;
import defpackage.bj1;
import defpackage.dz5;
import defpackage.ebk;
import defpackage.fx5;
import defpackage.if1;
import defpackage.n1p;
import defpackage.tc8;
import defpackage.yu6;
import defpackage.z1j;
import defpackage.zhi;
import java.lang.reflect.InvocationTargetException;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class c extends if1 implements DialogInterface {
    public static final int[] g = {awi.q, awi.f3519r};
    public final AlertController c;
    public b d;
    public CharSequence e;
    public yu6.a f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.AlertParams f26312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26313b;

        public a(Context context) {
            this(context, c.w(context, 0));
        }

        public a A(View view) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            return this;
        }

        public a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, int i) {
            this.f26312a.mExtraButtonList.add(new AlertController.ButtonInfo(charSequence, R.attr.buttonBarNeutralButtonStyle, onClickListener, i));
            return this;
        }

        public c b() {
            c cVar = new c(this.f26312a.mContext, this.f26313b);
            this.f26312a.apply(cVar.c);
            cVar.setCancelable(this.f26312a.mCancelable);
            if (this.f26312a.mCancelable) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f26312a.mOnCancelListener);
            cVar.setOnDismissListener(this.f26312a.mOnDismissListener);
            cVar.setOnShowListener(this.f26312a.mOnShowListener);
            cVar.setOnShowAnimListener(this.f26312a.mOnDialogShowAnimListener);
            DialogInterface.OnKeyListener onKeyListener = this.f26312a.mOnKeyListener;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public a d(boolean z) {
            this.f26312a.mButtonForceVertical = z;
            return this;
        }

        public a e(boolean z) {
            this.f26312a.mCancelable = z;
            return this;
        }

        public a f(View view) {
            this.f26312a.mCustomTitleView = view;
            return this;
        }

        public a g(boolean z) {
            this.f26312a.mEnableDialogImmersive = z;
            return this;
        }

        public a h(boolean z) {
            this.f26312a.mEnableEnterAnim = z;
            return this;
        }

        public a i(boolean z) {
            this.f26312a.mHapticFeedbackEnabled = z;
            return this;
        }

        public a j(Drawable drawable) {
            this.f26312a.mIcon = drawable;
            return this;
        }

        public a k(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public a l(int i) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mMessage = alertParams.mContext.getText(i);
            return this;
        }

        public a m(CharSequence charSequence) {
            this.f26312a.mMessage = charSequence;
            return this;
        }

        public a n(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mCheckedItems = zArr;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public a o(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mNegativeButtonText = alertParams.mContext.getText(i);
            this.f26312a.mNegativeButtonListener = onClickListener;
            return this;
        }

        public a p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mNegativeButtonText = charSequence;
            alertParams.mNegativeButtonListener = onClickListener;
            return this;
        }

        public a q(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mNeutralButtonText = alertParams.mContext.getText(i);
            this.f26312a.mNeutralButtonListener = onClickListener;
            return this;
        }

        public a r(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mNeutralButtonText = charSequence;
            alertParams.mNeutralButtonListener = onClickListener;
            return this;
        }

        public a s(DialogInterface.OnDismissListener onDismissListener) {
            this.f26312a.mOnDismissListener = onDismissListener;
            return this;
        }

        public a t(DialogInterface.OnKeyListener onKeyListener) {
            this.f26312a.mOnKeyListener = onKeyListener;
            return this;
        }

        public a u(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mPositiveButtonText = alertParams.mContext.getText(i);
            this.f26312a.mPositiveButtonListener = onClickListener;
            return this;
        }

        public a v(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mPositiveButtonText = charSequence;
            alertParams.mPositiveButtonListener = onClickListener;
            return this;
        }

        public a w(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public a x(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public a y(int i) {
            AlertController.AlertParams alertParams = this.f26312a;
            alertParams.mTitle = alertParams.mContext.getText(i);
            return this;
        }

        public a z(CharSequence charSequence) {
            this.f26312a.mTitle = charSequence;
            return this;
        }

        public a(Context context, int i) {
            this.f26312a = new AlertController.AlertParams(new ContextThemeWrapper(context, c.w(context, i)));
            this.f26313b = i;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f26314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n1p f26315b;

        public class a extends fx5 {
            public volatile Handler d;
            public final Object e = new Object();

            public a() {
            }

            @Override // defpackage.fx5, defpackage.n1p
            public boolean c() {
                return true;
            }

            @Override // defpackage.fx5, defpackage.n1p
            public void d(Runnable runnable) {
                if (this.d == null) {
                    synchronized (this.e) {
                        try {
                            if (this.d == null) {
                                this.d = e(Looper.myLooper());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.d.post(runnable);
            }

            public final Handler e(Looper looper) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return Handler.createAsync(looper);
                }
                try {
                    return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                    return new Handler(looper);
                } catch (InvocationTargetException unused2) {
                    return new Handler(looper);
                }
            }
        }

        public b() {
        }

        @SuppressLint({"RestrictedApi"})
        public final n1p a() {
            return new a();
        }

        @SuppressLint({"RestrictedApi"})
        public void b() {
            try {
                try {
                    try {
                        Object objJ = ebk.j(bj1.class, bj1.h(), "mDelegate");
                        if (objJ != null) {
                            this.f26314a = objJ;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("onCreate() taskExecutor get failed IllegalAccessException ");
                        sb.append(e);
                    }
                } catch (NoSuchMethodException e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onCreate() taskExecutor get failed NoSuchMethodException ");
                    sb2.append(e2);
                } catch (InvocationTargetException e3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("onCreate() taskExecutor get failed InvocationTargetException ");
                    sb3.append(e3);
                }
            } finally {
                this.f26315b = a();
                bj1.h().l(this.f26315b);
            }
        }

        @SuppressLint({"RestrictedApi"})
        public void c() {
            if (this.f26314a instanceof n1p) {
                bj1.h().l((n1p) this.f26314a);
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        @SuppressLint({"RestrictedApi"})
        public void d() {
            try {
                try {
                    Object objJ = ebk.j(bj1.class, bj1.h(), "mDelegate");
                    if (objJ != null && objJ != this.f26314a) {
                        this.f26314a = objJ;
                    }
                    if (objJ != this.f26315b || !bj1.h().c()) {
                        bj1.h().l(this.f26315b);
                    }
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onStop() taskExecutor get failed IllegalAccessException ");
                    sb.append(e);
                    if (this.f26315b != null || !bj1.h().c()) {
                        bj1.h().l(this.f26315b);
                    }
                } catch (NoSuchMethodException e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onStop() taskExecutor get failed NoSuchMethodException ");
                    sb2.append(e2);
                    if (this.f26315b != null || !bj1.h().c()) {
                        bj1.h().l(this.f26315b);
                    }
                } catch (InvocationTargetException e3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("onStop() taskExecutor get failed InvocationTargetException ");
                    sb3.append(e3);
                    if (this.f26315b != null || !bj1.h().c()) {
                        bj1.h().l(this.f26315b);
                    }
                }
            } catch (Throwable th) {
                if (this.f26315b != null || !bj1.h().c()) {
                    bj1.h().l(this.f26315b);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.c$c, reason: collision with other inner class name */
    public interface InterfaceC1021c {
    }

    public interface d {
        void onShowAnimComplete();

        void onShowAnimStart();
    }

    public interface e {
    }

    public c(Context context) {
        this(context, 0);
    }

    public static int w(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(zhi.J, typedValue, true);
        return typedValue.resourceId;
    }

    public void A(View view) {
        this.c.t1(view);
    }

    @Override // defpackage.if1, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.c.t0()) {
            this.c.V0();
        }
        View decorView = getWindow().getDecorView();
        if (this.c.C0()) {
            this.c.n1(true);
            return;
        }
        this.c.n1(false);
        if (dz5.c(decorView.getContext()) != null) {
            tc8.u(decorView.getContext());
        }
        if (!this.c.y0()) {
            i(decorView);
            return;
        }
        Activity activityL = l();
        if (activityL == null || !activityL.isFinishing()) {
            k(decorView);
        } else {
            i(decorView);
        }
    }

    @Override // defpackage.if1, android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.c.R(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void i(View view) {
        if (view == null || view.isAttachedToWindow()) {
            super.dismiss();
        }
    }

    public void j(View view) {
        if (Thread.currentThread() == view.getHandler().getLooper().getThread()) {
            this.c.Q(this.f);
        } else {
            view.post(new Runnable() { // from class: u41
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35350a.q();
                }
            });
        }
    }

    public void k(View view) {
        if (view == null) {
            super.dismiss();
        } else if (view.getHandler() != null) {
            j(view);
        } else {
            i(view);
        }
    }

    public Activity l() {
        Activity ownerActivity = getOwnerActivity();
        Context context = getContext();
        while (ownerActivity == null && context != null) {
            if (context instanceof Activity) {
                ownerActivity = (Activity) context;
            } else {
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        return ownerActivity;
    }

    public Button m(int i) {
        return this.c.U(i);
    }

    public ListView n() {
        return this.c.g0();
    }

    public TextView o() {
        return this.c.h0();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        if (decorView != null && this.c.o0) {
            HapticCompat.performHapticFeedbackAsync(decorView, alb.E, alb.n);
        }
        this.c.J0();
        x(decorView);
    }

    @Override // defpackage.if1, androidx.p004activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        b bVar;
        if (p() && (bVar = this.d) != null) {
            bVar.b();
        }
        if (this.c.y0() || !this.c.j) {
            getWindow().setWindowAnimations(0);
        }
        super.onCreate(bundle);
        this.c.s0(bundle);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.L0();
    }

    @Override // androidx.p004activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        this.c.N0();
    }

    @Override // defpackage.if1, androidx.p004activity.ComponentDialog, android.app.Dialog
    public void onStop() {
        b bVar;
        b bVar2;
        if (p() && (bVar2 = this.d) != null) {
            bVar2.d();
        }
        super.onStop();
        this.c.O0();
        if (!p() || (bVar = this.d) == null) {
            return;
        }
        bVar.c();
    }

    public final boolean p() {
        return TextUtils.equals("android.ui", Thread.currentThread().getName()) || TextUtils.equals("android.imms", Thread.currentThread().getName()) || TextUtils.equals("system_server", Thread.currentThread().getName());
    }

    public final /* synthetic */ void q() {
        this.c.Q(this.f);
    }

    public final /* synthetic */ void r() {
        View decorView;
        if (getWindow() == null || (decorView = getWindow().getDecorView()) == null || !decorView.isAttachedToWindow()) {
            return;
        }
        v();
    }

    public final /* synthetic */ void s() {
        if (this.c.o0()) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        this.c.a1(z);
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.c.b1(z);
    }

    public void setOnLayoutReloadListener(InterfaceC1021c interfaceC1021c) {
        this.c.setLayoutReloadListener(interfaceC1021c);
    }

    public void setOnShowAnimListener(d dVar) {
        this.c.setShowAnimListener(dVar);
    }

    @Override // defpackage.if1, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.c.p1(charSequence);
    }

    @Override // android.app.Dialog
    public void show() {
        this.c.z = SystemClock.uptimeMillis();
        super.show();
        if (getWindow() == null || this.c.y0()) {
            return;
        }
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: v41
            @Override // java.lang.Runnable
            public final void run() {
                this.f36457a.s();
            }
        }, this.c.y);
    }

    public void t() {
    }

    public final Context u(Context context) {
        return (context != null && context.getClass() == ContextThemeWrapper.class) ? context : getContext();
    }

    public void v() {
        super.dismiss();
    }

    public final void x(View view) {
        if (view == null) {
            return;
        }
        androidx.core.view.c.u0(view, this.e);
    }

    public void y(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.c.Y0(i, charSequence, onClickListener, null);
    }

    public void z(int i) {
        this.c.h1(i);
    }

    public c(Context context, int i) {
        super(context, w(context, i));
        this.f = new yu6.a() { // from class: t41
            @Override // yu6.a
            public final void end() {
                this.f34284a.r();
            }
        };
        Context contextU = u(context);
        if (dz5.c(contextU) != null) {
            tc8.u(context);
        }
        this.c = new AlertController(contextU, this, getWindow());
        this.d = new b();
        this.e = context.getResources().getString(z1j.o);
    }
}
