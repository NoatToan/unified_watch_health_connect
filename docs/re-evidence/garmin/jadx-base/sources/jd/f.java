package jd;

import c53.c0;
import java.util.Iterator;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\t\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Ljd/f;", "Lud/a;", "Lz53/a;", "delegate", "lock", "", "preparedStatementCacheSize", "<init>", "(Lud/a;Lz53/a;I)V", "b", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements ud.a, z53.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.a f98215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z53.a f98216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t13.g f98217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f98218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f98219e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljd/f$a;", "Lud/c;", "delegate", "<init>", "(Lud/c;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ud.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ud.c f98220a;

        public a(ud.c cVar) {
            cVar.getClass();
            this.f98220a = cVar;
        }

        @Override // ud.c
        public final boolean J0() {
            return this.f98220a.J0();
        }

        @Override // ud.c
        public final String M1(int i14) {
            return this.f98220a.M1(i14);
        }

        @Override // ud.c
        public final boolean P3() {
            return this.f98220a.P3();
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            ud.c cVar = this.f98220a;
            cVar.reset();
            cVar.o();
        }

        @Override // ud.c
        public final byte[] getBlob(int i14) {
            return this.f98220a.getBlob(i14);
        }

        @Override // ud.c
        public final int getColumnCount() {
            return this.f98220a.getColumnCount();
        }

        @Override // ud.c
        public final String getColumnName(int i14) {
            return this.f98220a.getColumnName(i14);
        }

        @Override // ud.c
        public final double getDouble(int i14) {
            return this.f98220a.getDouble(i14);
        }

        @Override // ud.c
        public final long getLong(int i14) {
            return this.f98220a.getLong(i14);
        }

        @Override // ud.c
        public final void h(int i14, long j8) {
            this.f98220a.h(i14, j8);
        }

        @Override // ud.c
        public final boolean isNull(int i14) {
            return this.f98220a.isNull(i14);
        }

        @Override // ud.c
        public final void m(double d14, int i14) {
            this.f98220a.m(d14, i14);
        }

        @Override // ud.c
        public final void o() {
            this.f98220a.o();
        }

        @Override // ud.c
        public final void q3(int i14, String str) {
            str.getClass();
            this.f98220a.q3(i14, str);
        }

        @Override // ud.c
        public final void reset() {
            this.f98220a.reset();
        }

        @Override // ud.c
        public final void t(int i14, byte[] bArr) {
            this.f98220a.t(i14, bArr);
        }

        @Override // ud.c
        public final void u(int i14) {
            this.f98220a.u(i14);
        }
    }

    public f(ud.a aVar, z53.a aVar2, int i14) {
        aVar.getClass();
        aVar2.getClass();
        this.f98215a = aVar;
        this.f98216b = aVar2;
        this.f98219e = i14 > 0 ? new b(i14) : null;
    }

    @Override // ud.a
    public final boolean D() {
        return this.f98215a.D();
    }

    @Override // ud.a
    public final ud.c M0(String str) {
        str.getClass();
        b bVar = this.f98219e;
        if (bVar == null) {
            return this.f98215a.M0(str);
        }
        ud.c cVar = bVar.get(str);
        cVar.getClass();
        return new a(cVar);
    }

    @Override // z53.a
    public final boolean a() {
        return this.f98216b.a();
    }

    @Override // z53.a
    public final Object c(t13.d dVar) {
        return this.f98216b.c(dVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        b bVar = this.f98219e;
        if (bVar != null) {
            bVar.evictAll();
        }
        this.f98215a.close();
    }

    @Override // z53.a
    public final void e(Object obj) {
        this.f98216b.e(null);
    }

    public final void f(StringBuilder sb3) {
        if (this.f98217c == null && this.f98218d == null) {
            sb3.append("\t\tStatus: Free connection");
            sb3.append('\n');
        } else {
            sb3.append("\t\tStatus: Acquired connection");
            sb3.append('\n');
            t13.g gVar = this.f98217c;
            if (gVar != null) {
                sb3.append("\t\tCoroutine: " + gVar);
                sb3.append('\n');
            }
            Throwable th3 = this.f98218d;
            if (th3 != null) {
                sb3.append("\t\tAcquired:");
                sb3.append('\n');
                Iterator it = h0.U(c0.s(new d53.v(o13.g.b(th3))), 1).iterator();
                while (it.hasNext()) {
                    sb3.append("\t\t" + ((String) it.next()));
                    sb3.append('\n');
                }
            }
        }
        b bVar = this.f98219e;
        if (bVar != null) {
            sb3.append("\t\tPrepared Statement Cache Size: " + bVar.size());
            sb3.append('\n');
        }
    }

    public final String toString() {
        return this.f98215a.toString();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljd/f$b;", "Lp1/c0;", "", "Lud/c;", "", "maxSize", "<init>", "(Ljd/f;I)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends p1.c0<String, ud.c> {
        public /* synthetic */ b(f fVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? 25 : i14);
        }

        @Override // p1.c0
        public final ud.c create(String str) {
            String str2 = str;
            str2.getClass();
            return f.this.f98215a.M0(str2);
        }

        @Override // p1.c0
        public final void entryRemoved(boolean z14, String str, ud.c cVar, ud.c cVar2) throws Exception {
            String str2 = str;
            ud.c cVar3 = cVar;
            str2.getClass();
            cVar3.getClass();
            cVar3.close();
            super.entryRemoved(z14, str2, cVar3, cVar2);
        }

        public b(int i14) {
            super(i14);
        }
    }

    public /* synthetic */ f(ud.a aVar, z53.a aVar2, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i15 & 2) != 0 ? z53.c.a() : aVar2, i14);
    }
}
