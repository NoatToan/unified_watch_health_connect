package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.FileUtil;
import defpackage.f7t;
import defpackage.gms;
import defpackage.m2t;
import defpackage.pms;
import defpackage.zns;
import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends f7t {
    public Context d;
    public IAMapDelegate e;
    public h g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f6079k;
    public int l;

    public interface a {
        void a(byte[] bArr, int i);

        void b(byte[] bArr, int i);
    }

    public i(Context context, a aVar, int i, String str) {
        this.h = null;
        this.i = null;
        this.j = null;
        this.d = context;
        this.f6079k = aVar;
        this.l = i;
        if (this.g == null) {
            this.g = new h(context, "", i != 0);
        }
        this.g.b(str);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(str == null ? "" : str);
        sb.append(".amapstyle");
        this.h = sb.toString();
        this.i = context.getCacheDir().getPath();
    }

    public final void a() {
        this.d = null;
        if (this.g != null) {
            this.g = null;
        }
    }

    public final void b(String str) {
        h hVar = this.g;
        if (hVar != null) {
            hVar.c(str);
        }
        this.j = str;
    }

    public final void c(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        gms.a(this.d, "amap_style_config", "lastModified".concat(str), str2);
    }

    public final void d(String str, byte[] bArr) {
        if (str == null || bArr == null || this.i == null) {
            return;
        }
        FileUtil.saveFileContents(this.i + File.separator + str, bArr);
    }

    public final byte[] e(String str) {
        if (str == null || this.i == null) {
            return null;
        }
        return FileUtil.readFileContents(this.i + File.separator + str);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        Object objB = gms.b(this.d, "amap_style_config", "lastModified".concat(str), "");
        if (!(objB instanceof String) || objB == "") {
            return null;
        }
        return (String) objB;
    }

    @Override // defpackage.f7t
    public final void runTask() {
        byte[] bArr;
        JSONObject jSONObject;
        try {
            if (MapsInitializer.getNetWorkEnable()) {
                if (this.g != null) {
                    String str = this.j + this.h;
                    String strF = f(str);
                    if (strF != null) {
                        this.g.d(strF);
                    }
                    byte[] bArrE = e(str);
                    a aVar = this.f6079k;
                    if (aVar != null && bArrE != null) {
                        aVar.a(bArrE, this.l);
                    }
                    h.a aVarM = this.g.m();
                    if (aVarM != null && (bArr = aVarM.f6067a) != null) {
                        try {
                            jSONObject = new JSONObject(new String(bArr));
                        } catch (JSONException unused) {
                            jSONObject = null;
                        }
                        if (jSONObject == null) {
                            if (this.f6079k == null) {
                                IAMapDelegate iAMapDelegate = this.e;
                                if (iAMapDelegate != null) {
                                    iAMapDelegate.setCustomMapStyle(iAMapDelegate.getMapConfig().isCustomStyleEnable(), aVarM.f6067a);
                                }
                            } else if (!Arrays.equals(aVarM.f6067a, bArrE)) {
                                this.f6079k.b(aVarM.f6067a, this.l);
                            }
                            d(str, aVarM.f6067a);
                            c(str, aVarM.c);
                        }
                    }
                }
                m2t.g(this.d, zns.t());
                IAMapDelegate iAMapDelegate2 = this.e;
                if (iAMapDelegate2 != null) {
                    iAMapDelegate2.setRunLowFrame(false);
                }
            }
        } catch (Throwable th) {
            m2t.r(th, "CustomStyleTask", "download customStyle");
            th.printStackTrace();
        }
    }

    public final void b() {
        pms.a().b(this);
    }

    public i(Context context, IAMapDelegate iAMapDelegate) {
        this.h = null;
        this.i = null;
        this.j = null;
        this.l = 0;
        this.d = context;
        this.e = iAMapDelegate;
        if (this.g == null) {
            this.g = new h(context, "");
        }
    }
}
