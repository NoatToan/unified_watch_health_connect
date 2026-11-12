package jd;

import android.database.SQLException;
import androidx.room.t0;
import androidx.room.u0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p13.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000b\f\rB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Ljd/r;", "Landroidx/room/u0;", "Ljd/w;", "Ljd/b;", "connectionElementKey", "Ljd/f;", "delegate", "", "isReadOnly", "<init>", "(Ljd/b;Ljd/f;Z)V", "c", "b", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements u0, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jd.b f98287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f98288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p13.k<c> f98290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f98291e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljd/r$a;", "Lud/c;", "delegate", "<init>", "(Ljd/r;Lud/c;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements ud.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ud.c f98292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f98293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f98294c;

        public a(r rVar, ud.c cVar) {
            cVar.getClass();
            this.f98294c = rVar;
            this.f98292a = cVar;
            this.f98293b = id.d.a();
        }

        @Override // ud.c
        public final boolean J0() {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                return this.f98292a.J0();
            }
            oe2.f.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // ud.c
        public final String M1(int i14) {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                return this.f98292a.M1(i14);
            }
            oe2.f.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                this.f98292a.close();
            } else {
                oe2.f.a0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // ud.c
        public final byte[] getBlob(int i14) {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                return this.f98292a.getBlob(i14);
            }
            oe2.f.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // ud.c
        public final int getColumnCount() {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                return this.f98292a.getColumnCount();
            }
            oe2.f.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // ud.c
        public final String getColumnName(int i14) {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                return this.f98292a.getColumnName(i14);
            }
            oe2.f.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // ud.c
        public final double getDouble(int i14) {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                return this.f98292a.getDouble(i14);
            }
            oe2.f.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // ud.c
        public final long getLong(int i14) {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                return this.f98292a.getLong(i14);
            }
            oe2.f.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // ud.c
        public final void h(int i14, long j8) {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                this.f98292a.h(i14, j8);
            } else {
                oe2.f.a0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // ud.c
        public final boolean isNull(int i14) {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                return this.f98292a.isNull(i14);
            }
            oe2.f.a0(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // ud.c
        public final void m(double d14, int i14) {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                this.f98292a.m(d14, i14);
            } else {
                oe2.f.a0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // ud.c
        public final void o() {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                this.f98292a.o();
            } else {
                oe2.f.a0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // ud.c
        public final void q3(int i14, String str) {
            str.getClass();
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                this.f98292a.q3(i14, str);
            } else {
                oe2.f.a0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // ud.c
        public final void reset() {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                this.f98292a.reset();
            } else {
                oe2.f.a0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // ud.c
        public final void t(int i14, byte[] bArr) {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                this.f98292a.t(i14, bArr);
            } else {
                oe2.f.a0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // ud.c
        public final void u(int i14) {
            if (this.f98294c.f98291e) {
                oe2.f.a0(21, "Statement is recycled");
                throw null;
            }
            if (this.f98293b == id.d.a()) {
                this.f98292a.u(i14);
            } else {
                oe2.f.a0(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljd/r$b;", "T", "Landroidx/room/t0;", "Ljd/w;", "<init>", "(Ljd/r;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b<T> implements t0<T>, w {
        public b() {
        }

        @Override // jd.w
        /* JADX INFO: renamed from: a */
        public final ud.a getF98235b() {
            return r.this.f98288b;
        }

        @Override // androidx.room.w
        public final Object c(e23.l lVar, String str, v13.c cVar) {
            return r.this.c(lVar, str, cVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljd/r$c;", "", "", TtmlNode.ATTR_ID, "", "shouldRollback", "<init>", "(IZ)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f98297b;

        public c(int i14, boolean z14) {
            this.f98296a = i14;
            this.f98297b = z14;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98298a;

        static {
            int[] iArr = new int[u0.a.values().length];
            try {
                iArr[u0.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f98298a = iArr;
        }
    }

    public r(jd.b bVar, f fVar, boolean z14) {
        bVar.getClass();
        fVar.getClass();
        this.f98287a = bVar;
        this.f98288b = fVar;
        this.f98289c = z14;
        this.f98290d = new p13.k<>();
    }

    @Override // jd.w
    /* JADX INFO: renamed from: a */
    public final ud.a getF98235b() {
        return this.f98288b;
    }

    @Override // androidx.room.u0
    public final Object b(u0.a aVar, e23.p pVar, v13.i iVar) {
        if (this.f98291e) {
            oe2.f.a0(21, "Connection is recycled");
            throw null;
        }
        jd.a aVar2 = (jd.a) iVar.getF129302c().get(this.f98287a);
        if (aVar2 != null && aVar2.f98187b == this) {
            return g(aVar, pVar, iVar);
        }
        oe2.f.a0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.room.w
    public final Object c(e23.l lVar, String str, v13.c cVar) {
        v vVar;
        f fVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f98320f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f98320f = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.f98318d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f98320f;
        if (i15 == 0) {
            o13.r.b(obj);
            if (this.f98291e) {
                oe2.f.a0(21, "Connection is recycled");
                throw null;
            }
            jd.a aVar2 = (jd.a) vVar.getF129302c().get(this.f98287a);
            if (aVar2 == null || aVar2.f98187b != this) {
                oe2.f.a0(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            fVar = this.f98288b;
            vVar.f98315a = str;
            vVar.f98316b = lVar;
            vVar.f98317c = fVar;
            vVar.f98320f = 1;
            if (fVar.f98216b.c(vVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f fVar2 = vVar.f98317c;
            e23.l lVar2 = vVar.f98316b;
            String str2 = vVar.f98315a;
            o13.r.b(obj);
            fVar = fVar2;
            lVar = lVar2;
            str = str2;
        }
        try {
            a aVar3 = new a(this, this.f98288b.M0(str));
            try {
                Object objInvoke = lVar.invoke(aVar3);
                zf.b.h(aVar3, null);
                fVar.e(null);
                return objInvoke;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    zf.b.h(aVar3, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            fVar.e(null);
            throw th5;
        }
    }

    @Override // androidx.room.u0
    public final Boolean d(t13.d dVar) {
        if (this.f98291e) {
            oe2.f.a0(21, "Connection is recycled");
            throw null;
        }
        jd.a aVar = (jd.a) dVar.getF129302c().get(this.f98287a);
        if (aVar != null && aVar.f98187b == this) {
            return Boolean.valueOf(!this.f98290d.isEmpty() || this.f98288b.f98215a.D());
        }
        oe2.f.a0(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(u0.a aVar, v13.c cVar) {
        s sVar;
        f fVar;
        p13.k<c> kVar = this.f98290d;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f98303e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f98303e = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.f98301c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f98303e;
        f fVar2 = this.f98288b;
        if (i15 == 0) {
            o13.r.b(obj);
            sVar.f98299a = aVar;
            sVar.f98300b = fVar2;
            sVar.f98303e = 1;
            if (fVar2.f98216b.c(sVar) == aVar2) {
                return aVar2;
            }
            fVar = fVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f fVar3 = sVar.f98300b;
            u0.a aVar3 = sVar.f98299a;
            o13.r.b(obj);
            fVar = fVar3;
            aVar = aVar3;
        }
        try {
            int i16 = kVar.f134948c;
            if (kVar.isEmpty()) {
                int i17 = d.f98298a[aVar.ordinal()];
                if (i17 == 1) {
                    oe2.f.o(fVar2, "BEGIN DEFERRED TRANSACTION");
                } else if (i17 == 2) {
                    oe2.f.o(fVar2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i17 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oe2.f.o(fVar2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                oe2.f.o(fVar2, "SAVEPOINT '" + i16 + CoreConstants.SINGLE_QUOTE_CHAR);
            }
            kVar.addLast(new c(i16, false));
            Unit unit = Unit.INSTANCE;
            fVar.e(null);
            return unit;
        } catch (Throwable th3) {
            fVar.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(boolean z14, v13.c cVar) {
        t tVar;
        f fVar;
        p13.k<c> kVar = this.f98290d;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f98308e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f98308e = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.f98306c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f98308e;
        f fVar2 = this.f98288b;
        if (i15 == 0) {
            o13.r.b(obj);
            tVar.f98305b = fVar2;
            tVar.f98304a = z14;
            tVar.f98308e = 1;
            if (fVar2.f98216b.c(tVar) == aVar) {
                return aVar;
            }
            fVar = fVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = tVar.f98304a;
            fVar = tVar.f98305b;
            o13.r.b(obj);
        }
        try {
            if (kVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            c cVar2 = (c) d0.F(kVar);
            if (!z14 || cVar2.f98297b) {
                if (kVar.isEmpty()) {
                    oe2.f.o(fVar2, "ROLLBACK TRANSACTION");
                } else {
                    oe2.f.o(fVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + cVar2.f98296a + CoreConstants.SINGLE_QUOTE_CHAR);
                }
            } else if (kVar.isEmpty()) {
                oe2.f.o(fVar2, "END TRANSACTION");
            } else {
                oe2.f.o(fVar2, "RELEASE SAVEPOINT '" + cVar2.f98296a + CoreConstants.SINGLE_QUOTE_CHAR);
            }
            Unit unit = Unit.INSTANCE;
            fVar.e(null);
            return unit;
        } catch (Throwable th3) {
            fVar.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
    
        if (f(false, r0) == r1) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(u0.a aVar, e23.p pVar, v13.c cVar) throws Throwable {
        u uVar;
        Throwable th3;
        int i14;
        boolean z14;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i15 = uVar.f98314f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                uVar.f98314f = i15 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objInvoke = uVar.f98312d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = uVar.f98314f;
        jd.c.a aVar2 = null;
        try {
            if (i16 == 0) {
                o13.r.b(objInvoke);
                if (aVar == null) {
                    aVar = u0.a.DEFERRED;
                }
                uVar.f98309a = pVar;
                uVar.f98314f = 1;
                if (e(aVar, uVar) != obj) {
                }
                return obj;
            }
            if (i16 == 1) {
                pVar = (e23.p) uVar.f98309a;
                o13.r.b(objInvoke);
            } else {
                if (i16 != 2) {
                    if (i16 == 3) {
                        Object obj2 = uVar.f98309a;
                        o13.r.b(objInvoke);
                        return obj2;
                    }
                    if (i16 == 4) {
                        Object obj3 = uVar.f98309a;
                        o13.r.b(objInvoke);
                        return obj3;
                    }
                    if (i16 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = uVar.f98310b;
                    th3 = (Throwable) uVar.f98309a;
                    try {
                        o13.r.b(objInvoke);
                    } catch (SQLException e4) {
                        e = e4;
                        if (th3 != null) {
                            throw e;
                        }
                        o13.g.a(th3, e);
                    }
                    throw th;
                }
                i14 = uVar.f98311c;
                o13.r.b(objInvoke);
            }
            z14 = i14 != 0;
            uVar.f98309a = objInvoke;
            uVar.f98314f = 3;
            if (f(z14, uVar) != obj) {
                return obj;
            }
            return objInvoke;
            b bVar = new b();
            uVar.f98309a = null;
            uVar.f98311c = 1;
            uVar.f98314f = 2;
            objInvoke = pVar.invoke(bVar, uVar);
            if (objInvoke != obj) {
                i14 = 1;
                if (i14 != 0) {
                }
                uVar.f98309a = objInvoke;
                uVar.f98314f = 3;
                if (f(z14, uVar) != obj) {
                    return objInvoke;
                }
            }
        } catch (Throwable th4) {
            try {
                try {
                    if (th4 instanceof jd.c.a) {
                        Object obj4 = th4.f98188a;
                        uVar.f98309a = obj4;
                        uVar.f98314f = 4;
                        if (f(false, uVar) == obj) {
                            return obj;
                        }
                        return obj4;
                    }
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        aVar2 = th4;
                        th = th5;
                        uVar.f98309a = aVar2;
                        uVar.f98310b = th;
                        uVar.f98314f = 5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
                uVar.f98309a = aVar2;
                uVar.f98310b = th;
                uVar.f98314f = 5;
            } catch (SQLException e14) {
                e = e14;
                th3 = aVar2;
                if (th3 != null) {
                    throw e;
                }
                o13.g.a(th3, e);
            }
        }
        return obj;
    }
}
