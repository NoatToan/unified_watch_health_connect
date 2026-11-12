package sd;

import p005kotlin.Metadata;
import r53.q2;
import r53.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsd/h;", "T", "Li63/c;", "Lr53/z1;", "valueSerializer", "<init>", "(Li63/c;)V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h<T> implements i63.c<z1<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<T> f158576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k63.e f158577b;

    public h(i63.c<T> cVar) {
        cVar.getClass();
        this.f158576a = cVar;
        k63.l f103234b = cVar.getF158591b().getF103234b();
        this.f158577b = f103234b instanceof k63.d ? k63.k.a("kotlinx.coroutines.flow.MutableStateFlow", (k63.d) f103234b) : k63.k.b("kotlinx.coroutines.flow.MutableStateFlow", cVar.getF158591b());
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return q2.a(eVar.h(this.f158576a));
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public final k63.e getF158591b() {
        return this.f158577b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        z1 z1Var = (z1) obj;
        z1Var.getClass();
        fVar.l(this.f158576a, z1Var.getValue());
    }
}
