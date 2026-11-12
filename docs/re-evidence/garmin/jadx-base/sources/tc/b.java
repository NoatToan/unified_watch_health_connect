package tc;

import gl1.y;
import i63.c;
import k63.e;
import k63.f;
import k63.k;
import l63.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import sc.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltc/b;", "Lsc/j;", "T", "Li63/c;", "<init>", "()V", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class b<T extends j> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f163805a = k.c("androidx.navigation.runtime.NavKey", new e[0], new t52.c(18));

    @Override // i63.b
    public final Object deserialize(l63.e eVar) throws ClassNotFoundException {
        f fVar = this.f163805a;
        l63.c cVarC = eVar.c(fVar);
        Object objL = cVarC.l(fVar, cVarC.e(fVar), y.J(s0.f105811a.b(Class.forName(cVarC.r(fVar, cVarC.e(fVar))))), null);
        objL.getClass();
        j jVar = (j) objL;
        cVarC.b(fVar);
        return jVar;
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final e getF158591b() {
        return this.f163805a;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        j jVar = (j) obj;
        f fVar2 = this.f163805a;
        d dVarC = fVar.c(fVar2);
        dVarC.k(fVar2, 0, jVar.getClass().getName());
        dVarC.e(fVar2, 1, y.J(s0.f105811a.b(jVar.getClass())), jVar);
        dVarC.b(fVar2);
    }
}
