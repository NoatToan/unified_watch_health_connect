package vk0;

import m63.f0;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvk0/f;", "Key", "Type", "Li63/c;", "Li53/d;", "keySerializer", "valueSerializer", "<init>", "(Li63/c;Li63/c;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f<Key, Type> implements i63.c<i53.d<Key, ? extends Type>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<Key> f178570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i63.c<Type> f178571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f178572c;

    public f(i63.c<Key> cVar, i63.c<Type> cVar2) {
        cVar.getClass();
        cVar2.getClass();
        this.f178570a = cVar;
        this.f178571b = cVar2;
        k63.e f158591b = cVar.getF158591b();
        k63.e f158591b2 = cVar2.getF158591b();
        f158591b.getClass();
        f158591b2.getClass();
        this.f178572c = new f0(f158591b, f158591b2);
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        return i53.a.g(j63.a.c(this.f178570a, this.f178571b).deserialize(eVar));
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return this.f178572c;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        i53.d dVar = (i53.d) obj;
        dVar.getClass();
        j63.a.c(this.f178570a, this.f178571b).serialize(fVar, u0.m(dVar));
    }
}
