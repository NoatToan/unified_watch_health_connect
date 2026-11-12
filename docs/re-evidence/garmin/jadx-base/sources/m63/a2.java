package m63;

import kotlinx.serialization.SerializationException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lm63/a2;", "A", "B", "C", "Li63/c;", "Lo13/u;", "aSerializer", "bSerializer", "cSerializer", "<init>", "(Li63/c;Li63/c;Li63/c;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a2<A, B, C> implements i63.c<o13.u<? extends A, ? extends B, ? extends C>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<A> f116914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i63.c<B> f116915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i63.c<C> f116916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k63.f f116917d;

    public a2(i63.c<A> cVar, i63.c<B> cVar2, i63.c<C> cVar3) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f116914a = cVar;
        this.f116915b = cVar2;
        this.f116916c = cVar3;
        this.f116917d = k63.k.c("kotlin.Triple", new k63.e[0], new kp2.a(this, 24));
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        k63.f fVar = this.f116917d;
        l63.c cVarC = eVar.c(fVar);
        int i14 = l63.c.f110557a;
        Object obj = k1.f116971c;
        Object objL = obj;
        Object objL2 = objL;
        Object objL3 = objL2;
        while (true) {
            int iE = cVarC.e(fVar);
            if (iE == -1) {
                cVarC.b(fVar);
                if (objL == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objL2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objL3 != obj) {
                    return new o13.u(objL, objL2, objL3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iE == 0) {
                objL = cVarC.l(fVar, 0, this.f116914a, null);
            } else if (iE == 1) {
                objL2 = cVarC.l(fVar, 1, this.f116915b, null);
            } else {
                if (iE != 2) {
                    throw new SerializationException(am.j.h(iE, "Unexpected index "));
                }
                objL3 = cVarC.l(fVar, 2, this.f116916c, null);
            }
        }
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return this.f116917d;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        o13.u uVar = (o13.u) obj;
        uVar.getClass();
        k63.f fVar2 = this.f116917d;
        l63.d dVarC = fVar.c(fVar2);
        dVarC.e(fVar2, 0, this.f116914a, uVar.f128605a);
        dVarC.e(fVar2, 1, this.f116915b, uVar.f128606b);
        dVarC.e(fVar2, 2, this.f116916c, uVar.f128607c);
        dVarC.b(fVar2);
    }
}
