package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class bh extends mb implements bw.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bw f2267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private by f2268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cb f2269c;
    private Context d;
    private Bundle e;
    private boolean g;

    private bh(cb cbVar, Context context) {
        this.e = new Bundle();
        this.g = false;
        this.f2269c = cbVar;
        this.d = context;
    }

    public bh(cb cbVar, Context context, byte b2) {
        this(cbVar, context);
    }

    @Override // com.amap.api.col.p0003sl.mb
    public final void runTask() {
        if (this.f2269c.u()) {
            this.f2269c.a(cc.a.file_io_exception);
            return;
        }
        try {
            e();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a() {
        this.g = true;
        bw bwVar = this.f2267a;
        if (bwVar != null) {
            bwVar.b();
        } else {
            cancelTask();
        }
        by byVar = this.f2268b;
        if (byVar != null) {
            byVar.a();
        }
    }

    private String d() {
        return eb.c(this.d);
    }

    private void e() throws IOException {
        bw bwVar = new bw(new bx(this.f2269c.getUrl(), d(), this.f2269c.v(), this.f2269c.w()), this.f2269c.getUrl(), this.d, this.f2269c);
        this.f2267a = bwVar;
        bwVar.a(this);
        cb cbVar = this.f2269c;
        this.f2268b = new by(cbVar, cbVar);
        if (this.g) {
            return;
        }
        this.f2267a.a();
    }

    public final void b() {
        Bundle bundle = this.e;
        if (bundle != null) {
            bundle.clear();
            this.e = null;
        }
    }

    @Override // com.amap.api.col.3sl.bw.a
    public final void c() {
        by byVar = this.f2268b;
        if (byVar != null) {
            byVar.b();
        }
    }
}
