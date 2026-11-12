package kotlin;

import g6.h;
import g6.m;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Li5/v1;", "", "Lg6/m;", "pxSize", "Lg6/h;", "dpSize", "<init>", "(JJLkotlin/jvm/internal/j;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f91599c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v1 f91600d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f91601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f91602b;

    static {
        m.f76012b.getClass();
        h.f76000b.getClass();
        f91600d = new v1(0L, 0L, null);
    }

    private v1(long j8, long j14) {
        this.f91601a = j8;
        this.f91602b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            return m.c(this.f91601a, v1Var.f91601a) && this.f91602b == v1Var.f91602b;
        }
        return false;
    }

    public final int hashCode() {
        m.a aVar = m.f76012b;
        int iHashCode = Long.hashCode(this.f91601a) * 31;
        h.a aVar2 = h.f76000b;
        return Long.hashCode(this.f91602b) + iHashCode;
    }

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/v1$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ v1(long j8, long j14, j jVar) {
        this(j8, j14);
    }
}
