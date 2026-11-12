package defpackage;

import androidx.annotation.RestrictTo;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class r6r<T> extends WeakReference<ViewDataBinding> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5h<T> f32266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32267b;
    public T c;

    public r6r(ViewDataBinding viewDataBinding, int i, k5h<T> k5hVar, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f32267b = i;
        this.f32266a = k5hVar;
    }

    public ViewDataBinding a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            e();
        }
        return viewDataBinding;
    }

    public T b() {
        return this.c;
    }

    public void c(LifecycleOwner lifecycleOwner) {
        this.f32266a.setLifecycleOwner(lifecycleOwner);
    }

    public void d(T t) {
        e();
        this.c = t;
        if (t != null) {
            this.f32266a.addListener(t);
        }
    }

    public boolean e() {
        boolean z;
        T t = this.c;
        if (t != null) {
            this.f32266a.removeListener(t);
            z = true;
        } else {
            z = false;
        }
        this.c = null;
        return z;
    }
}
