package com.huawei.hms.kit.awareness.barrier.internal.b;

import android.location.Location;

/* JADX INFO: loaded from: classes34.dex */
public class g extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13952c;
    private final String d;
    private final Location e;
    private final com.huawei.hms.kit.awareness.barrier.internal.type.g f;

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public boolean c() {
        return true;
    }

    public Location f() {
        return this.e;
    }

    public com.huawei.hms.kit.awareness.barrier.internal.type.g e() {
        return this.f;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.b.f
    public com.huawei.hms.kit.awareness.barrier.internal.type.f d() {
        return com.huawei.hms.kit.awareness.barrier.internal.type.f.LOCATION;
    }

    public String b() {
        return this.d;
    }

    public void a(int i) {
        this.f13952c = i;
    }

    public int a() {
        return this.f13952c;
    }

    public g(int i, String str, com.huawei.hms.kit.awareness.barrier.internal.type.g gVar, Location location) {
        this.f13952c = i;
        this.d = str;
        this.f = gVar;
        this.e = location;
    }

    public g(int i, String str, com.huawei.hms.kit.awareness.barrier.internal.type.g gVar) {
        this(i, str, gVar, null);
    }
}
