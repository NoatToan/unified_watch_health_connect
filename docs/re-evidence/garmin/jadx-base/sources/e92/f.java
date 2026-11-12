package e92;

import o4.d0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.a4;
import p3.c2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Le92/f;", "", "Lo4/d0;", "default", "secondary", "action", "success", "<init>", "(JJJJLkotlin/jvm/internal/j;)V", "warning", "onPrimary", "(JJJJJJLkotlin/jvm/internal/j;)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f63524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f63525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f63526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f63528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f63529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f63530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c2 f63531h;

    private f(long j8, long j14, long j15, long j16) {
        d0 d0VarA = d0.a(j8);
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        this.f63524a = new c2(d0VarA, a4Var);
        this.f63525b = new c2(d0.a(j14), a4Var);
        this.f63526c = new c2(d0.a(j15), a4Var);
        d0.f128823b.getClass();
        this.f63527d = d0.f128826e;
        this.f63528e = d0.f128824c;
        long j17 = d0.f128830i;
        this.f63529f = new c2(d0.a(j17), a4Var);
        this.f63530g = new c2(d0.a(j16), a4Var);
        this.f63531h = new c2(d0.a(j17), a4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        return ((d0) this.f63526c.getF182175a()).f128833a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((d0) this.f63524a.getF182175a()).f128833a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((d0) this.f63531h.getF182175a()).f128833a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d() {
        return ((d0) this.f63525b.getF182175a()).f128833a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e() {
        return ((d0) this.f63529f.getF182175a()).f128833a;
    }

    public /* synthetic */ f(long j8, long j14, long j15, long j16, j jVar) {
        this(j8, j14, j15, j16);
    }

    public /* synthetic */ f(long j8, long j14, long j15, long j16, long j17, long j18, j jVar) {
        this(j8, j14, j15, j16, j17, j18);
    }

    private f(long j8, long j14, long j15, long j16, long j17, long j18) {
        this(j8, j14, j15, j17, null);
        this.f63531h.setValue(d0.a(j18));
        this.f63529f.setValue(d0.a(j16));
    }
}
