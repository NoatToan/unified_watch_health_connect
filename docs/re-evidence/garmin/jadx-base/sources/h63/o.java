package h63;

import gl1.y;
import kotlinx.serialization.MissingFieldException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh63/o;", "Li63/c;", "Lb63/i$e;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements i63.c<b63.i.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f82312a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f82313b = o13.m.a(o13.n.PUBLICATION, new go1.j(27));

    private o() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        k63.e f116202c = getF158591b();
        l63.c cVarC = eVar.c(f116202c);
        int i14 = l63.c.f110557a;
        long jW = 0;
        boolean z14 = false;
        while (true) {
            o oVar = f82312a;
            int iE = cVarC.e(oVar.getF158591b());
            if (iE == -1) {
                Unit unit = Unit.INSTANCE;
                cVarC.b(f116202c);
                if (z14) {
                    return new b63.i.e(jW);
                }
                throw new MissingFieldException("nanoseconds", getF158591b().getF103221c());
            }
            if (iE != 0) {
                y.R(iE);
                throw null;
            }
            jW = cVarC.w(oVar.getF158591b(), 0);
            z14 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return (k63.e) f82313b.getValue();
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        b63.i.e eVar = (b63.i.e) obj;
        eVar.getClass();
        k63.e f116202c = getF158591b();
        l63.d dVarC = fVar.c(f116202c);
        dVarC.z(f82312a.getF158591b(), 0, eVar.f16196h);
        dVarC.b(f116202c);
    }
}
