package j1;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements l0.a, p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f96234a;

    public /* synthetic */ f(i iVar) {
        this.f96234a = iVar;
    }

    @Override // l0.a
    public ListenableFuture apply(Object obj) {
        return this.f96234a.f96243d.g();
    }

    @Override // p.a, u03.f
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public Object mo330apply(Object obj) {
        this.f96234a.b(k.e.STREAMING);
        return null;
    }
}
