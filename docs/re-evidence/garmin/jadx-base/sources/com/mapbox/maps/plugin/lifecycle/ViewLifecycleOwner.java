package com.mapbox.maps.plugin.lifecycle;

import android.view.View;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import java.lang.ref.WeakReference;
import p005kotlin.Metadata;
import vb.h;
import xy2.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u001e\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0014\u0010\fR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/mapbox/maps/plugin/lifecycle/ViewLifecycleOwner;", "Landroidx/lifecycle/n0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "doOnAttached", "doOnDetached", "()V", "Landroidx/lifecycle/o0;", "getLifecycle", "()Landroidx/lifecycle/o0;", "cleanUp", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "viewWeakReference", "Ljava/lang/ref/WeakReference;", "viewLifecycleRegistry", "Landroidx/lifecycle/o0;", "getViewLifecycleRegistry$plugin_lifecycle_release", "getViewLifecycleRegistry$plugin_lifecycle_release$annotations", "", "isAttached", "Z", "hostingLifecycleOwner", "Landroidx/lifecycle/n0;", "Landroidx/lifecycle/k0;", "hostingLifecycleObserver", "Landroidx/lifecycle/k0;", "com/mapbox/maps/plugin/lifecycle/ViewLifecycleOwner$attachStateChangeListener$1", "attachStateChangeListener", "Lcom/mapbox/maps/plugin/lifecycle/ViewLifecycleOwner$attachStateChangeListener$1;", "plugin-lifecycle_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ViewLifecycleOwner implements n0 {
    private final ViewLifecycleOwner$attachStateChangeListener$1 attachStateChangeListener;
    private final k0 hostingLifecycleObserver;
    private n0 hostingLifecycleOwner;
    private boolean isAttached;
    private final o0 viewLifecycleRegistry;
    private final WeakReference<View> viewWeakReference;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$OnAttachStateChangeListener, com.mapbox.maps.plugin.lifecycle.ViewLifecycleOwner$attachStateChangeListener$1] */
    public ViewLifecycleOwner(View view2) {
        view2.getClass();
        this.viewWeakReference = new WeakReference<>(view2);
        this.viewLifecycleRegistry = new o0(this);
        this.hostingLifecycleObserver = new a0(this, 3);
        ?? r14 = new View.OnAttachStateChangeListener() { // from class: com.mapbox.maps.plugin.lifecycle.ViewLifecycleOwner$attachStateChangeListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view3) {
                view3.getClass();
                this.this$0.doOnAttached(view3);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view3) {
                view3.getClass();
                this.this$0.doOnDetached();
            }
        };
        this.attachStateChangeListener = r14;
        view2.addOnAttachStateChangeListener(r14);
        if (view2.isAttachedToWindow()) {
            doOnAttached(view2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doOnAttached(View view2) {
        b0 viewLifecycleRegistry;
        if (this.isAttached) {
            return;
        }
        n0 n0Var = this.hostingLifecycleOwner;
        if (n0Var != null && (viewLifecycleRegistry = n0Var.getF158016a()) != null) {
            viewLifecycleRegistry.d(this.hostingLifecycleObserver);
        }
        n0 n0VarR = b.r(view2);
        if (n0VarR == null) {
            h.z("Please ensure that the hosting activity/fragment is a valid LifecycleOwner");
            return;
        }
        this.viewLifecycleRegistry.i(n0VarR.getF158016a().getF7973d());
        n0VarR.getF158016a().a(this.hostingLifecycleObserver);
        this.hostingLifecycleOwner = n0VarR;
        this.isAttached = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doOnDetached() {
        if (this.isAttached) {
            this.isAttached = false;
            n0 n0Var = this.hostingLifecycleOwner;
            if (n0Var == null) {
                h.z("Required value was null.");
                return;
            }
            b0.b f7973d = n0Var.getF158016a().getF7973d();
            b0.b bVar = b0.b.CREATED;
            if (f7973d.a(bVar)) {
                this.viewLifecycleRegistry.i(bVar);
            }
        }
    }

    public static /* synthetic */ void getViewLifecycleRegistry$plugin_lifecycle_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hostingLifecycleObserver$lambda$0(ViewLifecycleOwner viewLifecycleOwner, n0 n0Var, b0.a aVar) {
        viewLifecycleOwner.getClass();
        n0Var.getClass();
        aVar.getClass();
        boolean zA = viewLifecycleOwner.viewLifecycleRegistry.f7973d.a(b0.b.CREATED);
        if (viewLifecycleOwner.isAttached || (zA && aVar == b0.a.ON_DESTROY)) {
            viewLifecycleOwner.viewLifecycleRegistry.g(aVar);
        }
    }

    public final void cleanUp() {
        b0 viewLifecycleRegistry;
        n0 n0Var = this.hostingLifecycleOwner;
        if (n0Var != null && (viewLifecycleRegistry = n0Var.getF158016a()) != null) {
            viewLifecycleRegistry.d(this.hostingLifecycleObserver);
        }
        View view2 = this.viewWeakReference.get();
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this.attachStateChangeListener);
        }
    }

    public final o0 getViewLifecycleRegistry$plugin_lifecycle_release() {
        return this.viewLifecycleRegistry;
    }

    @Override // androidx.lifecycle.n0
    /* JADX INFO: renamed from: getLifecycle, reason: from getter */
    public o0 getF158016a() {
        return this.viewLifecycleRegistry;
    }
}
