package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class bd extends jr implements bs.a {
    private bs a;
    private bu b;
    private bx c;
    private Context d;
    private Bundle f;
    private boolean g;

    private bd(bx bxVar, Context context) {
        this.f = new Bundle();
        this.g = false;
        this.c = bxVar;
        this.d = context;
    }

    public final void a() {
        this.g = true;
        bs bsVar = this.a;
        if (bsVar != null) {
            bsVar.b();
        } else {
            cancelTask();
        }
        bu buVar = this.b;
        if (buVar != null) {
            buVar.a();
        }
    }

    public final void b() {
        Bundle bundle = this.f;
        if (bundle != null) {
            bundle.clear();
            this.f = null;
        }
    }

    @Override // com.amap.api.mapcore.util.bs.a
    public final void c() {
        bu buVar = this.b;
        if (buVar != null) {
            buVar.b();
        }
    }

    @Override // com.amap.api.mapcore.util.jr
    public final void runTask() {
        this.c.q();
        try {
            bs bsVar = new bs(new bt(this.c.getUrl(), er.c(this.d), this.c.r(), this.c.s()), this.c.getUrl(), this.d, this.c);
            this.a = bsVar;
            bsVar.a(this);
            bx bxVar = this.c;
            this.b = new bu(bxVar, bxVar);
            if (this.g) {
                return;
            }
            this.a.a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public bd(bx bxVar, Context context, byte b) {
        this(bxVar, context);
    }
}
