package xc;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wc.g;
import wc.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxc/a;", "Lwc/g;", "T", "Lwc/e;", "initialInfo", "Lkotlin/Function1;", "Lwc/j;", "", "onTransitionStateChanged", "<init>", "(Lwc/g;Le23/l;)V", "navigationevent-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a<T extends g> extends wc.e<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l<j, Unit> f189873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e23.a<Unit> f189874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e23.a<Unit> f189875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e23.a<Unit> f189876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e23.a<Unit> f189877l;

    /* JADX WARN: Multi-variable type inference failed */
    public a(T t7, l<? super j, Unit> lVar) {
        super(t7, false, false);
        this.f189873h = lVar;
        this.f189874i = new xa1.j(1);
        this.f189875j = new xa1.j(2);
        this.f189876k = new xa1.j(3);
        this.f189877l = new xa1.j(4);
    }

    @Override // wc.e
    public final void c() {
        this.f189873h.invoke(this.f184236d);
        this.f189876k.invoke();
    }

    @Override // wc.e
    public final void d() {
        this.f189873h.invoke(this.f184236d);
        this.f189877l.invoke();
    }

    @Override // wc.e
    public final void e(wc.b bVar) {
        this.f189873h.invoke(this.f184236d);
    }

    @Override // wc.e
    public final void f(wc.b bVar) {
        this.f189873h.invoke(this.f184236d);
    }

    @Override // wc.e
    public final void g() {
        this.f189873h.invoke(this.f184236d);
        this.f189874i.invoke();
    }

    public /* synthetic */ a(g gVar, l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, (i14 & 2) != 0 ? new x91.j(11) : lVar);
    }
}
