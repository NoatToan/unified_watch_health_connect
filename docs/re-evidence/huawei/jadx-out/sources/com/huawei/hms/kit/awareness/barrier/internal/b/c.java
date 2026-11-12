package com.huawei.hms.kit.awareness.barrier.internal.b;

import android.util.ArraySet;
import java.util.Collection;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes34.dex */
public class c extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<com.huawei.hms.kit.awareness.barrier.internal.a.a.a> f13948c = new ArraySet();

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public boolean c() {
        return true;
    }

    public boolean e() {
        return com.huawei.hms.kit.awareness.barrier.internal.f.c.a((Collection) this.f13948c);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public com.huawei.hms.kit.awareness.barrier.internal.type.f d() {
        return com.huawei.hms.kit.awareness.barrier.internal.type.f.BEACON;
    }

    public void b() {
        this.f13948c.forEach(new Consumer() { // from class: com.huawei.hms.kit.awareness.barrier.internal.b.c$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((com.huawei.hms.kit.awareness.barrier.internal.a.a.a) obj).x();
            }
        });
    }

    public void a(Collection<com.huawei.hms.kit.awareness.barrier.internal.a.a.a> collection) {
        this.f13948c.addAll(collection);
    }

    public void a(com.huawei.hms.kit.awareness.barrier.internal.a.a.a aVar) {
        this.f13948c.add(aVar);
    }

    public Set<com.huawei.hms.kit.awareness.barrier.internal.a.a.a> a() {
        return this.f13948c;
    }
}
