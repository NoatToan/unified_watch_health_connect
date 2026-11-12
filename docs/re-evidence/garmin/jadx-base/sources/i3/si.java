package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Li3/si;", "Li3/ri;", "", "initialHour", "initialMinute", "", "is24Hour", "<init>", "(IIZ)V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class si implements ri {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f89706e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f89707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c2 f89708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.a2 f89709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.a2 f89710d;

    public si(int i14, int i15, boolean z14) {
        if (i14 < 0 || i14 >= 24) {
            vb.h.s("initialHour should in [0..23] range");
            throw null;
        }
        if (i15 < 0 || i15 >= 60) {
            vb.h.s("initialMinute should be in [0..59] range");
            throw null;
        }
        this.f89707a = z14;
        qi.f89469b.getClass();
        this.f89708b = p3.p0.n(qi.a(0));
        this.f89709c = new p3.a2(i14);
        this.f89710d = new p3.a2(i15);
    }

    @Override // i3.ri
    public final int a() {
        return this.f89710d.getIntValue();
    }

    @Override // i3.ri
    public final int b() {
        return this.f89709c.getIntValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i3.ri
    public final int c() {
        return ((qi) this.f89708b.getF182175a()).f89471a;
    }

    @Override // i3.ri
    public final void d(int i14) {
        this.f89708b.setValue(qi.a(i14));
    }

    @Override // i3.ri
    public final void e(int i14) {
        this.f89709c.t(i14);
    }

    @Override // i3.ri
    public final void f(int i14) {
        this.f89710d.t(i14);
    }

    @Override // i3.ri
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF89707a() {
        return this.f89707a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/si$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
