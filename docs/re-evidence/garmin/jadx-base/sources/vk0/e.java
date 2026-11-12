package vk0;

import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvk0/e;", "T", "Li63/c;", "Li53/c;", "dataSerializer", "<init>", "(Li63/c;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e<T> implements i63.c<i53.c<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<T> f178568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m63.d f178569b;

    public e(i63.c<T> cVar) {
        cVar.getClass();
        this.f178568a = cVar;
        k63.e f116202c = cVar.getF116202c();
        f116202c.getClass();
        this.f178569b = new m63.d(f116202c);
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return i53.a.e((Iterable) new m63.e(this.f178568a).deserialize(eVar));
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return this.f178569b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        i53.c cVar = (i53.c) obj;
        cVar.getClass();
        new m63.e(this.f178568a).serialize(fVar, h0.b1(cVar));
    }
}
