package f2;

import g2.v0;
import p005kotlin.Metadata;
import p3.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf2/k0;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f68224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f68225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f68226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f68227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f68228e;

    public k0(int i14, int i15) {
        this.f68224a = new a2(i14);
        this.f68225b = new a2(i15);
        this.f68228e = new v0(i14, 90, 200);
    }

    public final void a(int i14, int i15) {
        if (i14 < 0.0f) {
            b2.e.a("Index should be non-negative");
        }
        this.f68224a.t(i14);
        this.f68228e.a(i14);
        this.f68225b.t(i15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k0() {
        int i14 = 0;
        this(i14, i14, 3, null);
    }

    public /* synthetic */ k0(int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 0 : i14, (i16 & 2) != 0 ? 0 : i15);
    }
}
