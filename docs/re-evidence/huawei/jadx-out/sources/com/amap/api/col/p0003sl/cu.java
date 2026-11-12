package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
public final class cu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f2326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f2327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f2328c;

    public static final class a extends ct {
    }

    public static final class b extends ct {
    }

    public final void a() {
        synchronized (this) {
            a aVar = this.f2326a;
            if (aVar != null) {
                aVar.a();
                this.f2326a = null;
            }
            b bVar = this.f2327b;
            if (bVar != null) {
                bVar.a();
                this.f2327b = null;
            }
            b bVar2 = this.f2328c;
            if (bVar2 != null) {
                bVar2.a();
                this.f2328c = null;
            }
        }
    }
}
