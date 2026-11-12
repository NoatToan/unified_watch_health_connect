package miuix.appcompat.internal.widget;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.dz5;
import defpackage.rr1;
import defpackage.tc8;
import miuix.autodensity.AutoDensityConfig;

/* JADX INFO: loaded from: classes3.dex */
public class DialogRootView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26562b;
    public c c;
    public ComponentCallbacks d;

    public class a implements ComponentCallbacks {

        /* JADX INFO: renamed from: miuix.appcompat.internal.widget.DialogRootView$a$a, reason: collision with other inner class name */
        public class RunnableC1030a implements Runnable {
            public RunnableC1030a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (DialogRootView.this.f26561a && DialogRootView.this.isAttachedToWindow()) {
                    DialogRootView.this.requestLayout();
                }
            }
        }

        public a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            DialogRootView.this.f26561a = true;
            DialogRootView.this.onConfigurationChanged(configuration);
            Handler handler = DialogRootView.this.getHandler();
            if (handler == null) {
                return;
            }
            if (DialogRootView.this.f26562b && Looper.myLooper() == handler.getLooper()) {
                DialogRootView.this.requestLayout();
            } else {
                DialogRootView.this.post(new RunnableC1030a());
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rr1 f26565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f26566b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        public b(rr1 rr1Var, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f26565a = rr1Var;
            this.f26566b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            Configuration configuration = DialogRootView.this.getResources().getConfiguration();
            if (this.f26565a != null) {
                configuration = AutoDensityConfig.updateDensityOverrideConfiguration(DialogRootView.this.getContext(), configuration);
            }
            Configuration configuration2 = configuration;
            if (configuration2.screenWidthDp == this.f26566b && configuration2.screenHeightDp == this.c) {
                return;
            }
            if (this.f26565a != null) {
                tc8.t(DialogRootView.this.getContext());
            }
            if (DialogRootView.this.c != null) {
                DialogRootView.this.c.onConfigurationChanged(configuration2, this.d, this.e, this.f, this.g);
            }
        }
    }

    public interface c {
        void onConfigurationChanged(Configuration configuration, int i, int i2, int i3, int i4);
    }

    public DialogRootView(Context context) {
        super(context);
        this.f26561a = false;
        this.f26562b = false;
        this.d = new a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchConfigurationChanged(Configuration configuration) {
        this.f26562b = true;
        super.dispatchConfigurationChanged(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getContext().registerComponentCallbacks(this.d);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        rr1 rr1VarC = dz5.c(getContext());
        if (rr1VarC != null) {
            rr1VarC.b().setTo(configuration);
            if (this.f26561a) {
                return;
            }
            AutoDensityConfig.updateDensityOverrideConfiguration(getContext(), configuration);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getContext().unregisterComponentCallbacks(this.d);
        rr1 rr1VarC = dz5.c(getContext());
        if (rr1VarC != null) {
            rr1VarC.c();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f26561a) {
            this.f26562b = false;
            this.f26561a = false;
            Configuration configuration = getResources().getConfiguration();
            rr1 rr1VarC = dz5.c(getContext());
            if (rr1VarC != null) {
                rr1VarC.b().setTo(configuration);
                AutoDensityConfig.updateDensityOverrideConfiguration(getContext(), configuration);
            }
            int i5 = configuration.screenWidthDp;
            int i6 = configuration.screenHeightDp;
            c cVar = this.c;
            if (cVar != null) {
                cVar.onConfigurationChanged(getResources().getConfiguration(), i, i2, i3, i4);
            }
            post(new b(rr1VarC, i5, i6, i, i2, i3, i4));
        }
    }

    public void setConfigurationChangedCallback(c cVar) {
        this.c = cVar;
    }

    public DialogRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26561a = false;
        this.f26562b = false;
        this.d = new a();
    }

    public DialogRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26561a = false;
        this.f26562b = false;
        this.d = new a();
    }
}
