package p3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bg\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lp3/n2;", "T", "", "Lp3/t;", "compositionLocal", "value", "", "explicitNull", "Lp3/p3;", "mutationPolicy", "Lp3/p1;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lp3/u;", "compute", "isDynamic", "<init>", "(Lp3/t;Ljava/lang/Object;ZLp3/p3;Lp3/p1;Le23/l;Z)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t<T> f135167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f135168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3<T> f135169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1<T> f135170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.l<u, T> f135171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f135172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T f135173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f135174h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public n2(t<T> tVar, T t7, boolean z14, p3<T> p3Var, p1<T> p1Var, e23.l<? super u, ? extends T> lVar, boolean z15) {
        this.f135167a = tVar;
        this.f135168b = z14;
        this.f135169c = p3Var;
        this.f135170d = p1Var;
        this.f135171e = lVar;
        this.f135172f = z15;
        this.f135173g = t7;
    }

    public final T a() {
        if (this.f135168b) {
            return null;
        }
        p1<T> p1Var = this.f135170d;
        if (p1Var != null) {
            return p1Var.getF182175a();
        }
        T t7 = this.f135173g;
        if (t7 != null) {
            return t7;
        }
        n.b("Unexpected form of a provided value");
        o2.c.f();
        return null;
    }
}
