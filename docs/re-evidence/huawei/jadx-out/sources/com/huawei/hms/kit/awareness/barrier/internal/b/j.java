package com.huawei.hms.kit.awareness.barrier.internal.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class j extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<com.huawei.hms.kit.awareness.barrier.internal.a.c> f13957c;

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public boolean c() {
        return true;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public com.huawei.hms.kit.awareness.barrier.internal.type.f d() {
        return com.huawei.hms.kit.awareness.barrier.internal.type.f.ALARM;
    }

    public List<com.huawei.hms.kit.awareness.barrier.internal.a.c> a() {
        return com.huawei.hms.kit.awareness.barrier.internal.f.c.a((Collection) this.f13957c) ? new ArrayList() : this.f13957c;
    }

    public j(List<com.huawei.hms.kit.awareness.barrier.internal.a.c> list) {
        this.f13957c = list;
    }
}
