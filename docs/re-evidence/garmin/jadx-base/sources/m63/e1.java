package m63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm63/e1;", "", "T", "Li63/c;", "serializer", "<init>", "(Li63/c;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1<T> implements i63.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<T> f116937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f116938b;

    public e1(i63.c<T> cVar) {
        cVar.getClass();
        this.f116937a = cVar;
        this.f116938b = new t1(cVar.getF116202c());
    }

    @Override // i63.b
    public final T deserialize(l63.e eVar) {
        eVar.getClass();
        if (eVar.D()) {
            return (T) eVar.h(this.f116937a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e1.class == obj.getClass() && this.f116937a.equals(((e1) obj).f116937a);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return this.f116938b;
    }

    public final int hashCode() {
        return this.f116937a.hashCode();
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, T t7) {
        if (t7 != null) {
            fVar.l(this.f116937a, t7);
        } else {
            fVar.D();
        }
    }
}
