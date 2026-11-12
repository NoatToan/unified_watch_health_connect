package pd;

import f4.s;
import i63.c;
import java.util.List;
import k63.k;
import k63.n;
import l63.f;
import m63.e;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpd/a;", "T", "Li63/c;", "Lf4/s;", "elementSerializer", "<init>", "(Li63/c;)V", "savedstate-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a<T> implements c<s<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<T> f137364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f137365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f137366c;

    public a(c<T> cVar) {
        cVar.getClass();
        this.f137364a = cVar;
        e eVar = new e(cVar);
        this.f137365b = eVar;
        this.f137366c = k.b("androidx.compose.runtime.SnapshotStateList", eVar.f116936b);
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        List list = (List) eVar.h(this.f137365b);
        s sVar = new s();
        sVar.addAll(h0.b1(list));
        return sVar;
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return this.f137366c;
    }

    @Override // i63.i
    public final void serialize(f fVar, Object obj) {
        s sVar = (s) obj;
        sVar.getClass();
        fVar.l(this.f137365b, sVar);
    }
}
