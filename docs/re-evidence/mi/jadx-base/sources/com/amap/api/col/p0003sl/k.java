package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.amap.mapcore.FileUtil;
import defpackage.dks;
import defpackage.f7t;
import defpackage.m2t;
import defpackage.pms;
import defpackage.zns;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends f7t {
    public Context d;
    public j e;
    public dks g;
    public a h;

    public interface a {
        void a(String str, dks dksVar);
    }

    public k(Context context) {
        this.d = context;
        if (this.e == null) {
            this.e = new j(context, "");
        }
    }

    public static String a(Context context) {
        return FileUtil.getMapBaseStorage(context);
    }

    private static void e(String str, byte[] bArr) throws Throwable {
        FileUtil.writeDatasToFile(str, bArr);
    }

    public final void b() {
        pms.a().b(this);
    }

    public final void c(dks dksVar) {
        this.g = dksVar;
    }

    public final void d(String str) {
        j jVar = this.e;
        if (jVar != null) {
            jVar.b(str);
        }
    }

    @Override // defpackage.f7t
    public final void runTask() {
        String str;
        try {
            if (MapsInitializer.getNetWorkEnable()) {
                j jVar = this.e;
                if (jVar != null) {
                    j.a aVarM = jVar.m();
                    if (aVarM == null || aVarM.f6168a == null) {
                        str = null;
                    } else {
                        str = a(this.d) + "/custom_texture_data";
                        e(str, aVarM.f6168a);
                    }
                    a aVar = this.h;
                    if (aVar != null) {
                        aVar.a(str, this.g);
                    }
                }
                m2t.g(this.d, zns.t());
            }
        } catch (Throwable th) {
            m2t.r(th, "CustomStyleTask", "download customStyle");
            th.printStackTrace();
        }
    }

    public final void a() {
        this.d = null;
        if (this.e != null) {
            this.e = null;
        }
    }

    public final void b(a aVar) {
        this.h = aVar;
    }
}
