package s53;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import o53.d0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls53/f;", "T", "Ls53/t;", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lq53/a;", "onBufferOverflow", "<init>", "(Lt13/g;ILq53/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f<T> implements t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f157481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f157482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q53.a f157483c;

    public f(t13.g gVar, int i14, q53.a aVar) {
        this.f157481a = gVar;
        this.f157482b = i14;
        this.f157483c = aVar;
    }

    @Override // r53.i
    public Object collect(r53.j<? super T> jVar, t13.d<? super Unit> dVar) {
        Object objE = o53.c0.e(new d(jVar, this, null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // s53.t
    public final r53.i<T> e(t13.g gVar, int i14, q53.a aVar) {
        t13.g gVar2 = this.f157481a;
        t13.g gVarPlus = gVar.plus(gVar2);
        q53.a aVar2 = q53.a.SUSPEND;
        q53.a aVar3 = this.f157483c;
        int i15 = this.f157482b;
        if (aVar == aVar2) {
            if (i15 != -3) {
                if (i14 == -3) {
                    i14 = i15;
                } else if (i15 != -2) {
                    if (i14 == -2) {
                        i14 = i15;
                    } else {
                        i14 += i15;
                        if (i14 < 0) {
                            i14 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            aVar = aVar3;
        }
        return (p005kotlin.jvm.internal.s.g(gVarPlus, gVar2) && i14 == i15 && aVar == aVar3) ? this : i(gVarPlus, i14, aVar);
    }

    public String g() {
        return null;
    }

    public abstract Object h(q53.t<? super T> tVar, t13.d<? super Unit> dVar);

    public abstract f<T> i(t13.g gVar, int i14, q53.a aVar);

    public r53.i<T> j() {
        return null;
    }

    public q53.v<T> k(o53.b0 b0Var) {
        int i14 = this.f157482b;
        if (i14 == -3) {
            i14 = -2;
        }
        d0 d0Var = d0.ATOMIC;
        e23.p eVar = new e(this, null);
        q53.s sVar = new q53.s(o53.y.b(b0Var, this.f157481a), q53.l.a(i14, 4, this.f157483c));
        sVar.v0(d0Var, sVar, eVar);
        return sVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strG = g();
        if (strG != null) {
            arrayList.add(strG);
        }
        t13.h hVar = t13.h.f161748a;
        t13.g gVar = this.f157481a;
        if (gVar != hVar) {
            arrayList.add("context=" + gVar);
        }
        int i14 = this.f157482b;
        if (i14 != -3) {
            arrayList.add("capacity=" + i14);
        }
        q53.a aVar = q53.a.SUSPEND;
        q53.a aVar2 = this.f157483c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append('[');
        return androidx.room.a0.m(sb3, h0.k0(arrayList, ", ", null, null, null, 62), ']');
    }
}
