package g2;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;
import p3.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B9\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0018\u00010\b\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lg2/n1;", "Ld4/f;", "Ld4/c;", "wrappedRegistry", "wrappedHolder", "<init>", "(Ld4/f;Ld4/c;)V", "parentRegistry", "", "", "", "", "restoredValues", "(Ld4/f;Ljava/util/Map;Ld4/c;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n1 implements d4.f, d4.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f75184d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4.f f75185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4.c f75186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.u0<Object> f75187c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"g2/n1$b", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements p3.h0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f75189b;

        public b(Object obj) {
            this.f75189b = obj;
        }

        @Override // p3.h0
        public final void dispose() {
            n1.this.f75187c.j(this.f75189b);
        }
    }

    public n1(d4.f fVar, Map<String, ? extends List<? extends Object>> map, d4.c cVar) {
        g12.f fVar2 = new g12.f(fVar, 3);
        y3 y3Var = d4.i.f57449a;
        this(new d4.g(map, fVar2), cVar);
    }

    @Override // d4.f
    public final boolean a(Object obj) {
        return this.f75185a.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // d4.f
    public final Map<String, List<Object>> b() {
        p1.u0<Object> u0Var = this.f75187c;
        Object[] objArr = u0Var.f134733b;
        long[] jArr = u0Var.f134732a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j8 = jArr[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i14 != length) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j8) < 128) {
                            this.f75186b.c(objArr[(i14 << 3) + i16]);
                        }
                        j8 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                    if (i14 != length) {
                        break;
                    }
                    i14++;
                }
            }
        }
        return this.f75185a.b();
    }

    @Override // d4.c
    public final void c(Object obj) {
        this.f75186b.c(obj);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    @Override // d4.c
    public final void d(Object obj, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-858296452);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(obj) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            this.f75186b.d(obj, pVar, o0VarE, i15 & 126);
            boolean zR = o0VarE.r(this) | o0VarE.r(obj);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e52.b(29, this, obj);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e52.b(29, this, obj);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.a(obj, (e23.l) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.a0(this, obj, pVar, i14, 19);
        }
    }

    @Override // d4.f
    public final Object e(String str) {
        return this.f75185a.e(str);
    }

    @Override // d4.f
    public final d4.f.a f(String str, e23.a<? extends Object> aVar) {
        return this.f75185a.f(str, aVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg2/n1$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public n1(d4.f fVar, d4.c cVar) {
        this.f75185a = fVar;
        this.f75186b = cVar;
        this.f75187c = p1.i1.a();
    }
}
