package androidx.transition;

/* JADX INFO: loaded from: classes7.dex */
public class g implements m.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f11116a;

    public g(e eVar, Runnable runnable) {
        this.f11116a = runnable;
    }

    @Override // androidx.transition.m.h
    public final void onTransitionCancel(m mVar) {
    }

    @Override // androidx.transition.m.h
    public final void onTransitionEnd(m mVar) {
        this.f11116a.run();
    }

    @Override // androidx.transition.m.h
    public final void onTransitionPause(m mVar) {
    }

    @Override // androidx.transition.m.h
    public final void onTransitionResume(m mVar) {
    }

    @Override // androidx.transition.m.h
    public final void onTransitionStart(m mVar) {
    }
}
