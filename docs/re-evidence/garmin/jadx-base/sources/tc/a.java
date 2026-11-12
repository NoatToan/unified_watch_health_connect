package tc;

import f4.s;
import i63.c;
import k63.k;
import k63.n;
import l63.e;
import p005kotlin.Metadata;
import sc.f;
import sc.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltc/a;", "Lsc/j;", "T", "Li63/c;", "Lsc/f;", "elementSerializer", "<init>", "(Li63/c;)V", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a<T extends j> implements c<f<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<T> f163802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd.a<T> f163803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f163804c;

    public a(c<T> cVar) {
        this.f163802a = cVar;
        pd.a<T> aVar = new pd.a<>(cVar);
        this.f163803b = aVar;
        this.f163804c = k.b("androidx.navigation3.runtime.NavBackStack", aVar.f137366c);
    }

    @Override // i63.b
    public final Object deserialize(e eVar) {
        return new f((s) eVar.h(this.f163803b));
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return this.f163804c;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        fVar.l(this.f163803b, ((f) obj).f158448a);
    }
}
