package us2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.r;
import o53.l1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import rs2.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lus2/k;", "Lus2/g;", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f172534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f172535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f172536c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.gfdi.core.TransactionIdOutgoingStrategy", f = "TransactionIdOutgoingStrategy.kt", l = {47}, m = "execute")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f172537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f172538b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f172540d;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f172538b = obj;
            this.f172540d |= Integer.MIN_VALUE;
            return k.this.a(null, this);
        }
    }

    public k() {
        rs2.d.f154380a.getClass();
        this.f172534a = LoggerFactory.getLogger(rs2.d.a("TxnIdOutgoingStrategy", -1L, this, null));
        this.f172535b = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // us2.g
    public final Object a(j jVar, t13.d<? super byte[]> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f172540d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f172540d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objY = aVar.f172538b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f172540d;
        try {
            if (i15 == 0) {
                r.b(objY);
                if (jVar.f172523b.f55555a == null) {
                    vb.h.z("Transaction ID must have a value");
                    return null;
                }
                synchronized (this.f172535b) {
                    this.f172535b.put(jVar.f172523b, jVar);
                    Unit unit = Unit.INSTANCE;
                }
                aVar.f172537a = jVar;
                aVar.f172540d = 1;
                objY = ge1.b.Y(new i(jVar, null), aVar);
                if (objY == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jVar = aVar.f172537a;
                r.b(objY);
            }
            synchronized (this.f172535b) {
                try {
                    if (s.g(this.f172535b.get(jVar.f172523b), jVar)) {
                        this.f172535b.remove(jVar.f172523b);
                    }
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return objY;
        } catch (Throwable th4) {
            synchronized (this.f172535b) {
                try {
                    if (s.g(this.f172535b.get(jVar.f172523b), jVar)) {
                        this.f172535b.remove(jVar.f172523b);
                    }
                    Unit unit3 = Unit.INSTANCE;
                    throw th4;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    @Override // us2.g
    public final ct2.h b() {
        ct2.h hVar;
        synchronized (this) {
            hVar = new ct2.h(Integer.valueOf(this.f172536c));
            int i14 = this.f172536c;
            this.f172536c = i14 == 31 ? 0 : i14 + 1;
        }
        return hVar;
    }

    @Override // us2.g
    public final boolean c(ct2.h hVar, int i14, y yVar, byte[] bArr) {
        j jVar;
        yVar.getClass();
        synchronized (this.f172535b) {
            jVar = (j) this.f172535b.get(hVar);
        }
        if (jVar == null) {
            return false;
        }
        jVar.a(yVar, bArr);
        return true;
    }

    @Override // us2.g
    public final void close() {
        List listB1;
        synchronized (this.f172535b) {
            listB1 = h0.b1(this.f172535b.values());
            this.f172535b.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            l1 l1Var = ((j) it.next()).f172531j.get();
            if (l1Var != null) {
                l1Var.c(gl1.d.a("SendMessageTask canceled", null));
            }
        }
    }
}
