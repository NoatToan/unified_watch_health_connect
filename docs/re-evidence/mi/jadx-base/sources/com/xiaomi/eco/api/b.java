package com.xiaomi.eco.api;

import com.xiaomi.fitness.common.log.Logger;
import defpackage.u7r;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f11242b;
    public final int c;
    public final u7r d;
    public final byte[] e;
    public final boolean f;
    public final p.a g;
    public final int h;
    public final int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f11243k;
    public volatile boolean l;

    public b(int i, p pVar, int i2, u7r u7rVar, byte[] bArr, boolean z, p.a aVar, int i3, int i4) {
        this.j = 0;
        this.f11241a = i;
        this.f11242b = pVar;
        this.c = i2;
        this.d = u7rVar;
        this.e = bArr;
        this.f = z;
        this.g = aVar;
        this.i = i4;
        this.h = i3;
        if (u7rVar != null && bArr != null) {
            throw new IllegalArgumentException("either packet or data, only one is needed");
        }
    }

    public synchronized void a() {
        if (!this.l && !this.f11243k) {
            this.f11243k = true;
            this.f11242b.cancel(this);
        }
    }

    public byte[] b() {
        return this.e;
    }

    public int c() {
        return this.f11241a;
    }

    public u7r d() {
        return this.d;
    }

    public int e() {
        return this.i;
    }

    public int f() {
        return this.h;
    }

    public int g() {
        return this.c;
    }

    public synchronized boolean h() {
        return this.f11243k;
    }

    public boolean i() {
        return this.f;
    }

    public void j() {
        n(-3, null, null);
    }

    public void k(int i, u7r u7rVar) {
        this.f11242b.onReceiveResponse(this);
        n(i, u7rVar, null);
    }

    public void l(byte[] bArr) {
        this.f11242b.onReceiveResponse(this);
        n(0, null, bArr);
    }

    public void m() {
        this.f11242b.onResponseTimeout(this);
        n(-1, null, null);
    }

    public final void n(int i, u7r u7rVar, byte[] bArr) {
        if (this.l) {
            Logger.i("EcoApiTask", "onResult  code=" + i + "   has resulted " + this);
            return;
        }
        this.l = true;
        if (this.g == null) {
            Logger.e("EcoApiTask", "onResult  no callback  " + this);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onResult  has packet=");
        sb.append(u7rVar != null);
        sb.append(", has data=");
        sb.append(bArr != null);
        sb.append("  ");
        sb.append(this);
        Logger.i("EcoApiTask", sb.toString());
        this.g.onCallback(new EcoApiResult(i, u7rVar, bArr));
    }

    public void o(int i) {
        Logger.i("EcoApiTask", "onSendResult  code=" + i + "  " + this);
        if (i == 0) {
            this.f11242b.onSendSuccess(this);
            if (i()) {
                return;
            }
        } else {
            this.f11242b.onSendFailed(this, i == -1);
        }
        n(i, null, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EcoApiTask(hasCode:");
        sb.append(hashCode());
        sb.append("， id=");
        sb.append(this.f11241a);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", timeout=");
        sb.append(this.h);
        sb.append(", packet type:");
        u7r u7rVar = this.d;
        sb.append(u7rVar != null ? u7rVar.e : -1);
        sb.append(", packet id:");
        u7r u7rVar2 = this.d;
        sb.append(u7rVar2 != null ? u7rVar2.f : -1);
        sb.append(")");
        return sb.toString();
    }

    public b(int i, p pVar, int i2, u7r u7rVar, byte[] bArr, boolean z, p.a aVar, int i3, int i4, int i5) {
        this(i, pVar, i2, u7rVar, bArr, z, aVar, i3, i4);
        this.j = i5;
    }
}
