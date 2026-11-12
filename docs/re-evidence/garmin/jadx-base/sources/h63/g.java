package h63;

import gl1.y;
import kotlinx.serialization.MissingFieldException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh63/g;", "Li63/c;", "Lb63/i$c;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements i63.c<b63.i.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f82296a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f82297b = o13.m.a(o13.n.PUBLICATION, new go1.j(25));

    private g() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        k63.e f116202c = getF158591b();
        l63.c cVarC = eVar.c(f116202c);
        int i14 = l63.c.f110557a;
        boolean z14 = false;
        int iA = 0;
        while (true) {
            g gVar = f82296a;
            int iE = cVarC.e(gVar.getF158591b());
            if (iE == -1) {
                Unit unit = Unit.INSTANCE;
                cVarC.b(f116202c);
                if (z14) {
                    return new b63.i.c(iA);
                }
                throw new MissingFieldException("days", getF158591b().getF103221c());
            }
            if (iE != 0) {
                y.R(iE);
                throw null;
            }
            iA = cVarC.A(gVar.getF158591b(), 0);
            z14 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return (k63.e) f82297b.getValue();
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        b63.i.c cVar = (b63.i.c) obj;
        cVar.getClass();
        k63.e f116202c = getF158591b();
        l63.d dVarC = fVar.c(f116202c);
        dVarC.v(0, cVar.f16194h, f82296a.getF158591b());
        dVarC.b(f116202c);
    }
}
