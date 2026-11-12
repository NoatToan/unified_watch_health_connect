package c63;

import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005B3\b\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc63/o;", "Lc63/k;", "Lc63/v0;", "Lc63/c1;", "", "Lg63/c;", "Lc63/a0;", "date", "Lc63/c0;", "time", "Lc63/d0;", MapboxMap.QFE_OFFSET, "", "timeZoneId", "<init>", "(Lc63/a0;Lc63/c0;Lc63/d0;Ljava/lang/String;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements k, v0, c1, g63.c<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f25029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f25030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f25031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25032d;

    public /* synthetic */ o(a0 a0Var, c0 c0Var, d0 d0Var, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new a0(null, null, null, null, 15, null) : a0Var, (i14 & 2) != 0 ? new c0(null, null, null, null, null, null, 63, null) : c0Var, (i14 & 4) != 0 ? new d0(null, null, null, null, 15, null) : d0Var, (i14 & 8) != 0 ? null : str);
    }

    @Override // c63.c1
    /* JADX INFO: renamed from: A */
    public final Integer getF24958c() {
        return this.f25031c.f24958c;
    }

    @Override // c63.v0
    public final void B(Integer num) {
        this.f25030b.f24950a = num;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: a */
    public final Integer getF24953d() {
        return this.f25030b.f24953d;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: b */
    public final Integer getF24950a() {
        return this.f25030b.f24950a;
    }

    @Override // c63.v0
    public final void c(Integer num) {
        this.f25030b.f24954e = num;
    }

    @Override // g63.c
    public final o copy() {
        a0 a0VarCopy = this.f25029a.copy();
        c0 c0VarCopy = this.f25030b.copy();
        d0 d0Var = this.f25031c;
        return new o(a0VarCopy, c0VarCopy, new d0(d0Var.f24956a, d0Var.f24957b, d0Var.f24958c, d0Var.f24959d), this.f25032d);
    }

    @Override // c63.c1
    public final void d(Integer num) {
        this.f25031c.f24959d = num;
    }

    @Override // c63.v0
    public final void e(d63.a aVar) {
        this.f25030b.e(aVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(oVar.f25029a, this.f25029a) && p005kotlin.jvm.internal.s.g(oVar.f25030b, this.f25030b) && p005kotlin.jvm.internal.s.g(oVar.f25031c, this.f25031c) && p005kotlin.jvm.internal.s.g(oVar.f25032d, this.f25032d);
    }

    @Override // c63.v0
    public final void f(i iVar) {
        this.f25030b.f24952c = iVar;
    }

    @Override // c63.c1
    /* JADX INFO: renamed from: g */
    public final Integer getF24959d() {
        return this.f25031c.f24959d;
    }

    @Override // c63.k
    /* JADX INFO: renamed from: getDay */
    public final Integer getF24942b() {
        return this.f25029a.f24942b;
    }

    @Override // c63.k
    /* JADX INFO: renamed from: getDayOfWeek */
    public final Integer getF24943c() {
        return this.f25029a.f24943c;
    }

    @Override // c63.k
    /* JADX INFO: renamed from: getDayOfYear */
    public final Integer getF24944d() {
        return this.f25029a.f24944d;
    }

    @Override // c63.l1
    /* JADX INFO: renamed from: getYear */
    public final Integer getF24963a() {
        return this.f25029a.f24941a.f24963a;
    }

    @Override // c63.c1
    public final void h(Integer num) {
        this.f25031c.f24957b = num;
    }

    public final int hashCode() {
        int iHashCode = (this.f25029a.hashCode() ^ this.f25030b.hashCode()) ^ this.f25031c.hashCode();
        String str = this.f25032d;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override // c63.k
    public final void i(Integer num) {
        this.f25029a.f24942b = num;
    }

    @Override // c63.k
    public final void j(Integer num) {
        this.f25029a.f24943c = num;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: k */
    public final Integer getF24954e() {
        return this.f25030b.f24954e;
    }

    @Override // c63.k
    public final void l(Integer num) {
        this.f25029a.f24944d = num;
    }

    @Override // c63.l1
    public final void m(Integer num) {
        this.f25029a.f24941a.f24964b = num;
    }

    @Override // c63.v0
    public final d63.a n() {
        return this.f25030b.n();
    }

    @Override // c63.l1
    public final void o(Integer num) {
        this.f25029a.f24941a.f24963a = num;
    }

    @Override // c63.c1
    /* JADX INFO: renamed from: p */
    public final Boolean getF24956a() {
        return this.f25031c.f24956a;
    }

    @Override // c63.c1
    public final void q(Integer num) {
        this.f25031c.f24958c = num;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: r */
    public final Integer getF24955f() {
        return this.f25030b.f24955f;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: s */
    public final Integer getF24951b() {
        return this.f25030b.f24951b;
    }

    @Override // c63.c1
    /* JADX INFO: renamed from: t */
    public final Integer getF24957b() {
        return this.f25031c.f24957b;
    }

    @Override // c63.v0
    /* JADX INFO: renamed from: u */
    public final i getF24952c() {
        return this.f25030b.f24952c;
    }

    @Override // c63.v0
    public final void v(Integer num) {
        this.f25030b.f24951b = num;
    }

    @Override // c63.v0
    public final void w(Integer num) {
        this.f25030b.f24955f = num;
    }

    @Override // c63.l1
    /* JADX INFO: renamed from: x */
    public final Integer getF24964b() {
        return this.f25029a.f24941a.f24964b;
    }

    @Override // c63.v0
    public final void y(Integer num) {
        this.f25030b.f24953d = num;
    }

    @Override // c63.c1
    public final void z(Boolean bool) {
        this.f25031c.f24956a = bool;
    }

    public o(a0 a0Var, c0 c0Var, d0 d0Var, String str) {
        a0Var.getClass();
        c0Var.getClass();
        d0Var.getClass();
        this.f25029a = a0Var;
        this.f25030b = c0Var;
        this.f25031c = d0Var;
        this.f25032d = str;
    }

    public o() {
        this(null, null, null, null, 15, null);
    }
}
