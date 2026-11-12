package c63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc63/b0;", "", "Lc63/k;", "Lc63/v0;", "Lg63/c;", "Lc63/a0;", "date", "Lc63/c0;", "time", "<init>", "(Lc63/a0;Lc63/c0;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 implements k, v0, g63.c<b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f24946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f24947b;

    public /* synthetic */ b0(a0 a0Var, c0 c0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new a0(null, null, null, null, 15, null) : a0Var, (i14 & 2) != 0 ? new c0(null, null, null, null, null, null, 63, null) : c0Var);
    }

    @Override // c63.v0
    public final void B(Integer num) {
        this.f24947b.f24950a = num;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: a */
    public final Integer getF24953d() {
        return this.f24947b.f24953d;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: b */
    public final Integer getF24950a() {
        return this.f24947b.f24950a;
    }

    @Override // c63.v0
    public final void c(Integer num) {
        this.f24947b.f24954e = num;
    }

    @Override // g63.c
    public final b0 copy() {
        return new b0(this.f24946a.copy(), this.f24947b.copy());
    }

    @Override // c63.v0
    public final void e(d63.a aVar) {
        this.f24947b.e(aVar);
    }

    @Override // c63.v0
    public final void f(i iVar) {
        this.f24947b.f24952c = iVar;
    }

    @Override // c63.k
    /* JADX INFO: renamed from: getDay */
    public final Integer getF24942b() {
        return this.f24946a.f24942b;
    }

    @Override // c63.k
    /* JADX INFO: renamed from: getDayOfWeek */
    public final Integer getF24943c() {
        return this.f24946a.f24943c;
    }

    @Override // c63.k
    /* JADX INFO: renamed from: getDayOfYear */
    public final Integer getF24944d() {
        return this.f24946a.f24944d;
    }

    @Override // c63.l1
    /* JADX INFO: renamed from: getYear */
    public final Integer getF24963a() {
        return this.f24946a.f24941a.f24963a;
    }

    @Override // c63.k
    public final void i(Integer num) {
        this.f24946a.f24942b = num;
    }

    @Override // c63.k
    public final void j(Integer num) {
        this.f24946a.f24943c = num;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: k */
    public final Integer getF24954e() {
        return this.f24947b.f24954e;
    }

    @Override // c63.k
    public final void l(Integer num) {
        this.f24946a.f24944d = num;
    }

    @Override // c63.l1
    public final void m(Integer num) {
        this.f24946a.f24941a.f24964b = num;
    }

    @Override // c63.v0
    public final d63.a n() {
        return this.f24947b.n();
    }

    @Override // c63.l1
    public final void o(Integer num) {
        this.f24946a.f24941a.f24963a = num;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: r */
    public final Integer getF24955f() {
        return this.f24947b.f24955f;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: s */
    public final Integer getF24951b() {
        return this.f24947b.f24951b;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: u */
    public final i getF24952c() {
        return this.f24947b.f24952c;
    }

    @Override // c63.v0
    public final void v(Integer num) {
        this.f24947b.f24951b = num;
    }

    @Override // c63.v0
    public final void w(Integer num) {
        this.f24947b.f24955f = num;
    }

    @Override // c63.l1
    /* JADX INFO: renamed from: x */
    public final Integer getF24964b() {
        return this.f24946a.f24941a.f24964b;
    }

    @Override // c63.v0
    public final void y(Integer num) {
        this.f24947b.f24953d = num;
    }

    public b0(a0 a0Var, c0 c0Var) {
        a0Var.getClass();
        c0Var.getClass();
        this.f24946a = a0Var;
        this.f24947b = c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
