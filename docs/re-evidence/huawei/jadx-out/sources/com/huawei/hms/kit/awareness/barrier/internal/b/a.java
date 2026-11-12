package com.huawei.hms.kit.awareness.barrier.internal.b;

import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public class a extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<String> f13945c;
    private final boolean d;

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public boolean c() {
        return true;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public com.huawei.hms.kit.awareness.barrier.internal.type.f d() {
        return com.huawei.hms.kit.awareness.barrier.internal.type.f.BLUETOOTH;
    }

    public boolean b() {
        return this.d;
    }

    public Set<String> a() {
        return this.f13945c;
    }

    public a(Set<String> set, boolean z) {
        this.f13945c = set;
        this.d = z;
    }
}
