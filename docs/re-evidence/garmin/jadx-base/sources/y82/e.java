package y82;

import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@o13.e
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly82/e;", "KeyType", "ValueType", "Ly82/b;", "Ly82/c;", "request", "Lo53/z;", "dispatcher", "<init>", "(Ly82/c;Lo53/z;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e<KeyType, ValueType> implements b<KeyType, ValueType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<KeyType, ValueType> f195239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f195240b;

    public e(c<KeyType, ValueType> cVar, z zVar) {
        cVar.getClass();
        zVar.getClass();
        this.f195239a = cVar;
        this.f195240b = zVar;
    }

    @Override // y82.b
    public final Object a(Object obj, u82.b bVar) {
        return ge1.b.e0(this.f195240b, new d(this, obj, null), bVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(c cVar, z zVar, int i14, j jVar) {
        if ((i14 & 2) != 0) {
            x53.c cVar2 = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(cVar, zVar);
    }
}
