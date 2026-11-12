package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import defpackage.f7t;
import defpackage.kfs;
import defpackage.sds;
import defpackage.wds;
import defpackage.zns;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends f7t implements f.a {
    public f d;
    public wds e;
    public kfs g;
    public Context h;
    public Bundle i;
    public boolean j;

    public c(kfs kfsVar, Context context) {
        this.i = new Bundle();
        this.j = false;
        this.g = kfsVar;
        this.h = context;
    }

    public final void a() {
        this.j = true;
        f fVar = this.d;
        if (fVar != null) {
            fVar.d();
        } else {
            cancelTask();
        }
        wds wdsVar = this.e;
        if (wdsVar != null) {
            wdsVar.b();
        }
    }

    public final void b() {
        Bundle bundle = this.i;
        if (bundle != null) {
            bundle.clear();
            this.i = null;
        }
    }

    @Override // com.amap.api.col.3sl.f.a
    public final void c() {
        wds wdsVar = this.e;
        if (wdsVar != null) {
            wdsVar.h();
        }
    }

    public final String d() {
        return zns.h0(this.h);
    }

    public final void e() throws IOException {
        f fVar = new f(new sds(this.g.getUrl(), d(), this.g.v(), this.g.h()), this.g.getUrl(), this.h, this.g);
        this.d = fVar;
        fVar.c(this);
        kfs kfsVar = this.g;
        this.e = new wds(kfsVar, kfsVar);
        if (this.j) {
            return;
        }
        this.d.a();
    }

    @Override // defpackage.f7t
    public final void runTask() {
        if (this.g.g()) {
            this.g.k(cc.a.file_io_exception);
            return;
        }
        try {
            e();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public c(kfs kfsVar, Context context, byte b2) {
        this(kfsVar, context);
    }
}
