package androidx.p004activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import defpackage.p7h;
import defpackage.ri3;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f1373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<p7h> f1374b;

    public class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, ri3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f1375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p7h f1376b;
        public ri3 c;

        public LifecycleOnBackPressedCancellable(Lifecycle lifecycle, p7h p7hVar) {
            this.f1375a = lifecycle;
            this.f1376b = p7hVar;
            lifecycle.addObserver(this);
        }

        @Override // defpackage.ri3
        public void cancel() {
            this.f1375a.removeObserver(this);
            this.f1376b.removeCancellable(this);
            ri3 ri3Var = this.c;
            if (ri3Var != null) {
                ri3Var.cancel();
                this.c = null;
            }
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.c = OnBackPressedDispatcher.this.c(this.f1376b);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                ri3 ri3Var = this.c;
                if (ri3Var != null) {
                    ri3Var.cancel();
                }
            }
        }
    }

    public class a implements ri3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p7h f1377a;

        public a(p7h p7hVar) {
            this.f1377a = p7hVar;
        }

        @Override // defpackage.ri3
        public void cancel() {
            OnBackPressedDispatcher.this.f1374b.remove(this.f1377a);
            this.f1377a.removeCancellable(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    public void a(p7h p7hVar) {
        c(p7hVar);
    }

    @SuppressLint({"LambdaLast"})
    public void b(LifecycleOwner lifecycleOwner, p7h p7hVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        p7hVar.addCancellable(new LifecycleOnBackPressedCancellable(lifecycle, p7hVar));
    }

    public ri3 c(p7h p7hVar) {
        this.f1374b.add(p7hVar);
        a aVar = new a(p7hVar);
        p7hVar.addCancellable(aVar);
        return aVar;
    }

    public void d() {
        Iterator<p7h> itDescendingIterator = this.f1374b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            p7h next = itDescendingIterator.next();
            if (next.isEnabled()) {
                next.handleOnBackPressed();
                return;
            }
        }
        Runnable runnable = this.f1373a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f1374b = new ArrayDeque<>();
        this.f1373a = runnable;
    }
}
