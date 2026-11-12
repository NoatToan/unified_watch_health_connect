package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.C0042a f2579b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2578a = obj;
        this.f2579b = a.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f2579b.a(lifecycleOwner, event, this.f2578a);
    }
}
