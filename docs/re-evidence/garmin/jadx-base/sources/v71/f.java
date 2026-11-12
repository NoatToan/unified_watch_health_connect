package v71;

import b63.o;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv71/f;", "Lv71/a;", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u71.a f176138a = (u71.a) KoinJavaComponent.get$default(u71.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y71.a f176139b = y71.a.f194692a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v71.a
    public final Object J3(o oVar, v13.c cVar) {
        b bVar;
        Object value;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f176126d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f176126d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objC = bVar.f176124b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f176126d;
        if (i15 == 0) {
            r.b(objC);
            c cVar2 = new c(this, oVar, null);
            bVar.f176123a = oVar;
            bVar.f176126d = 1;
            objC = C(cVar2, bVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oVar = bVar.f176123a;
            r.b(objC);
        }
        v2 v2Var = (v2) objC;
        boolean z14 = v2Var instanceof v2.b;
        if (z14) {
            v2.b bVar2 = (v2.b) v2Var;
            if (bVar2.f47386a == 0) {
                return new v2.b(null, bVar2.f47387b, null, null, 12, null);
            }
        }
        if (z14 && g22.l.a(oVar)) {
            this.f176139b.getClass();
            p2 p2Var = y71.a.f194693b;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, (n61.c) ((v2.b) v2Var).f47386a));
        }
        return v2Var;
    }

    @Override // v71.a
    public final Object M0(o oVar, o oVar2, i iVar) {
        return f0.J(this, new d(this, oVar, oVar2, null), iVar);
    }

    @Override // v71.a
    public final Object U0(o oVar, o oVar2, i iVar) {
        return f0.J(this, new e(this, oVar, oVar2, null), iVar);
    }

    @Override // v71.a
    public final n61.c v2() {
        this.f176139b.getClass();
        return (n61.c) y71.a.f194693b.getValue();
    }
}
