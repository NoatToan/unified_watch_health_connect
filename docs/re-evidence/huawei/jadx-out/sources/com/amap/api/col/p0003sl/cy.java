package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.amap.mapcore.FileUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class cy extends mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private cx f2338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private de f2339c;
    private a d;

    public interface a {
        void a(String str, de deVar);
    }

    public cy(Context context) {
        this.f2337a = context;
        if (this.f2338b == null) {
            this.f2338b = new cx(context, "");
        }
    }

    public final void a(String str) {
        cx cxVar = this.f2338b;
        if (cxVar != null) {
            cxVar.b(str);
        }
    }

    @Override // com.amap.api.col.p0003sl.mb
    public final void runTask() {
        String str;
        try {
            if (MapsInitializer.getNetWorkEnable()) {
                cx cxVar = this.f2338b;
                if (cxVar != null) {
                    cx.a aVarD = cxVar.d();
                    if (aVarD == null || aVarD.f2335a == null) {
                        str = null;
                    } else {
                        str = a(this.f2337a) + "/custom_texture_data";
                        a(str, aVarD.f2335a);
                    }
                    a aVar = this.d;
                    if (aVar != null) {
                        aVar.a(str, this.f2339c);
                    }
                }
                jv.a(this.f2337a, eb.a());
            }
        } catch (Throwable th) {
            jv.c(th, "CustomStyleTask", "download customStyle");
            th.printStackTrace();
        }
    }

    private static void a(String str, byte[] bArr) throws Throwable {
        FileUtil.writeDatasToFile(str, bArr);
    }

    private static String a(Context context) {
        return FileUtil.getMapBaseStorage(context);
    }

    public final void a() {
        this.f2337a = null;
        if (this.f2338b != null) {
            this.f2338b = null;
        }
    }

    public final void b() {
        dz.a().a(this);
    }

    public final void a(a aVar) {
        this.d = aVar;
    }

    public final void a(de deVar) {
        this.f2339c = deVar;
    }
}
