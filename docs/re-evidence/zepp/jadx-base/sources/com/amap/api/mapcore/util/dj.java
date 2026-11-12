package com.amap.api.mapcore.util;

import android.content.Context;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.amap.mapcore.FileUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class dj implements Runnable {
    private Context a;
    private di b;
    private dp c;
    private a d;

    public interface a {
        void a(String str, dp dpVar);
    }

    public dj(Context context) {
        this.a = context;
        if (this.b == null) {
            this.b = new di(context, "");
        }
    }

    public final void a(String str) {
        di diVar = this.b;
        if (diVar != null) {
            diVar.b(str);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (MapsInitializer.getNetWorkEnable()) {
                di diVar = this.b;
                if (diVar != null) {
                    di.a aVarE = diVar.e();
                    String str = null;
                    if (aVarE != null && aVarE.a != null) {
                        str = FileUtil.getMapBaseStorage(this.a) + "/custom_texture_data";
                        FileUtil.writeDatasToFile(str, aVarE.a);
                    }
                    a aVar = this.d;
                    if (aVar != null) {
                        aVar.a(str, this.c);
                    }
                }
                hn.a(this.a, er.f());
            }
        } catch (Throwable th) {
            hn.c(th, "CustomStyleTask", "download customStyle");
            th.printStackTrace();
        }
    }

    public final void a() {
        this.a = null;
        if (this.b != null) {
            this.b = null;
        }
    }

    public final void a(a aVar) {
        this.d = aVar;
    }

    public final void a(dp dpVar) {
        this.c = dpVar;
    }
}
