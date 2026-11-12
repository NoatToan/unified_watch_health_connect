package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lp3/t;", "T", "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Le23/a;)V", "Lp3/m2;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f135311a;

    private t(e23.a<? extends T> aVar) {
        this.f135311a = new c1(aVar);
    }

    public c4<T> a() {
        return this.f135311a;
    }

    public abstract c4<T> b(n2<T> n2Var, c4<T> c4Var);

    public /* synthetic */ t(e23.a aVar, p005kotlin.jvm.internal.j jVar) {
        this(aVar);
    }
}
