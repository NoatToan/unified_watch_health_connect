package com.huawei.hms.common.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ResolveClientBean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AnyClient f13068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13069c;

    public ResolveClientBean(AnyClient anyClient, int i) {
        this.f13068b = anyClient;
        this.f13067a = Objects.hashCode(anyClient);
        this.f13069c = i;
    }

    public void clientReconnect() {
        this.f13068b.connect(this.f13069c, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResolveClientBean)) {
            return false;
        }
        return this.f13068b.equals(((ResolveClientBean) obj).f13068b);
    }

    public AnyClient getClient() {
        return this.f13068b;
    }

    public int hashCode() {
        return this.f13067a;
    }
}
