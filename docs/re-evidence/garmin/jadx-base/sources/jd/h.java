package jd;

import android.database.SQLException;
import androidx.room.t0;
import androidx.room.u0;
import java.util.concurrent.atomic.AtomicInteger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rBQ\u0012@\u0010\b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\b\u0012\u0002\b\u0003\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ljd/h;", "Landroidx/room/u0;", "Ljd/w;", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lt13/d;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "Lud/a;", "delegate", "<init>", "(Le23/p;Lud/a;)V", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements u0, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.p<e23.l<? super t13.d<Object>, ? extends Object>, t13.d<Object>, Object> f98234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.a f98235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f98236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0.a f98237d;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljd/h$a;", "T", "Landroidx/room/t0;", "Ljd/w;", "<init>", "(Ljd/h;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a<T> implements t0<T>, w {
        public a() {
        }

        @Override // jd.w
        /* JADX INFO: renamed from: a */
        public final ud.a getF98235b() {
            return h.this.f98235b;
        }

        @Override // androidx.room.w
        public final Object c(e23.l lVar, String str, v13.c cVar) {
            return h.this.c(lVar, str, cVar);
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98239a;

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
            f98239a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(e23.p<? super e23.l<? super t13.d<Object>, ? extends Object>, ? super t13.d<Object>, ? extends Object> pVar, ud.a aVar) {
        aVar.getClass();
        this.f98234a = pVar;
        this.f98235b = aVar;
        this.f98236c = new AtomicInteger(0);
    }

    @Override // jd.w
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ud.a getF98235b() {
        return this.f98235b;
    }

    @Override // androidx.room.u0
    public final Object b(u0.a aVar, e23.p pVar, v13.i iVar) {
        e23.p<e23.l<? super t13.d<Object>, ? extends Object>, t13.d<Object>, Object> pVar2 = this.f98234a;
        if (pVar2 == null) {
            return e(aVar, pVar, iVar);
        }
        Object objInvoke = pVar2.invoke(new l(this, aVar, pVar, null), iVar);
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.room.w
    public final Object c(e23.l lVar, String str, v13.c cVar) {
        j jVar;
        e23.p<e23.l<? super t13.d<Object>, ? extends Object>, t13.d<Object>, Object> pVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f98248e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f98248e = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objD = jVar.f98246c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f98248e;
        if (i15 == 0) {
            o13.r.b(objD);
            jVar.f98244a = str;
            jVar.f98245b = lVar;
            jVar.f98248e = 1;
            objD = d(jVar);
            if (objD != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objD);
                return objD;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lVar = jVar.f98245b;
        str = jVar.f98244a;
        o13.r.b(objD);
        if (((Boolean) objD).booleanValue() && (pVar = this.f98234a) != null) {
            k kVar = new k(this, str, lVar, null);
            jVar.f98244a = null;
            jVar.f98245b = null;
            jVar.f98248e = 2;
            Object objInvoke = pVar.invoke(kVar, jVar);
            return objInvoke == obj ? obj : objInvoke;
        }
        ud.c cVarM0 = this.f98235b.M0(str);
        try {
            Object objInvoke2 = lVar.invoke(cVarM0);
            zf.b.h(cVarM0, null);
            return objInvoke2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                zf.b.h(cVarM0, th3);
                throw th4;
            }
        }
    }

    @Override // androidx.room.u0
    public final Boolean d(t13.d dVar) {
        return Boolean.valueOf(this.f98237d != null || this.f98235b.D());
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00af A[Catch: SQLException -> 0x00b2, TryCatch #3 {SQLException -> 0x00b2, blocks: (B:56:0x00a9, B:58:0x00af, B:61:0x00b4), top: B:73:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(u0.a aVar, e23.p pVar, v13.c cVar) {
        i iVar;
        c.a aVar2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f98243d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f98243d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objInvoke = iVar.f98241b;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f98243d;
        AtomicInteger atomicInteger = this.f98236c;
        int i16 = 1;
        ud.a aVar4 = this.f98235b;
        try {
            if (i15 == 0) {
                o13.r.b(objInvoke);
                int i17 = b.f98239a[aVar.ordinal()];
                if (i17 == 1) {
                    oe2.f.o(aVar4, "BEGIN DEFERRED TRANSACTION");
                } else if (i17 == 2) {
                    oe2.f.o(aVar4, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i17 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    oe2.f.o(aVar4, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.f98237d = aVar;
                }
                a aVar5 = new a();
                iVar.f98240a = 1;
                iVar.f98243d = 1;
                objInvoke = pVar.invoke(aVar5, iVar);
                if (objInvoke == aVar3) {
                    return aVar3;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i16 = iVar.f98240a;
                o13.r.b(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.f98237d = null;
            }
            if (i16 != 0) {
                oe2.f.o(aVar4, "END TRANSACTION");
                return objInvoke;
            }
            oe2.f.o(aVar4, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th3) {
            try {
                if (th3 instanceof c.a) {
                    Object obj = th3.f98188a;
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.f98237d = null;
                    }
                    oe2.f.o(aVar4, "ROLLBACK TRANSACTION");
                    return obj;
                }
                try {
                    throw th3;
                } catch (Throwable th4) {
                    aVar2 = th3;
                    th = th4;
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.f98237d = null;
                    }
                    oe2.f.o(aVar4, "ROLLBACK TRANSACTION");
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                aVar2 = null;
            }
            try {
                if (atomicInteger.decrementAndGet() == 0) {
                    this.f98237d = null;
                }
                oe2.f.o(aVar4, "ROLLBACK TRANSACTION");
                throw th;
            } catch (SQLException e4) {
                if (aVar2 == null) {
                    throw e4;
                }
                o13.g.a(aVar2, e4);
                throw th;
            }
        }
    }
}
