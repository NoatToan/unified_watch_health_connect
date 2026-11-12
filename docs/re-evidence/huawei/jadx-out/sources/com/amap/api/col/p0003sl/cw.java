package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.FileUtil;
import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class cw extends mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAMapDelegate f2333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cv f2334c;
    private String d;
    private String e;
    private String g;
    private a h;
    private int i;

    public interface a {
        void a(byte[] bArr, int i);

        void b(byte[] bArr, int i);
    }

    public cw(Context context, a aVar, int i, String str) {
        this.d = null;
        this.e = null;
        this.g = null;
        this.f2332a = context;
        this.h = aVar;
        this.i = i;
        if (this.f2334c == null) {
            this.f2334c = new cv(context, "", i != 0);
        }
        this.f2334c.b(str);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(str == null ? "" : str);
        sb.append(".amapstyle");
        this.d = sb.toString();
        this.e = context.getCacheDir().getPath();
    }

    public cw(Context context, IAMapDelegate iAMapDelegate) {
        this.d = null;
        this.e = null;
        this.g = null;
        this.i = 0;
        this.f2332a = context;
        this.f2333b = iAMapDelegate;
        if (this.f2334c == null) {
            this.f2334c = new cv(context, "");
        }
    }

    public final void a(String str) {
        cv cvVar = this.f2334c;
        if (cvVar != null) {
            cvVar.c(str);
        }
        this.g = str;
    }

    private byte[] b(String str) {
        if (str == null || this.e == null) {
            return null;
        }
        return FileUtil.readFileContents(this.e + File.separator + str);
    }

    private void a(String str, byte[] bArr) {
        if (str == null || bArr == null || this.e == null) {
            return;
        }
        FileUtil.saveFileContents(this.e + File.separator + str, bArr);
    }

    private String c(String str) {
        if (str == null) {
            return null;
        }
        Object objB = dx.b(this.f2332a, "amap_style_config", "lastModified".concat(String.valueOf(str)), "");
        if (!(objB instanceof String) || objB == "") {
            return null;
        }
        return (String) objB;
    }

    private void a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        dx.a(this.f2332a, "amap_style_config", "lastModified".concat(String.valueOf(str)), str2);
    }

    @Override // com.amap.api.col.p0003sl.mb
    public final void runTask() {
        JSONObject jSONObject;
        try {
            if (MapsInitializer.getNetWorkEnable()) {
                if (this.f2334c != null) {
                    String str = this.g + this.d;
                    String strC = c(str);
                    if (strC != null) {
                        this.f2334c.d(strC);
                    }
                    byte[] bArrB = b(str);
                    a aVar = this.h;
                    if (aVar != null && bArrB != null) {
                        aVar.a(bArrB, this.i);
                    }
                    cv.a aVarD = this.f2334c.d();
                    if (aVarD != null && aVarD.f2329a != null) {
                        try {
                            jSONObject = new JSONObject(new String(aVarD.f2329a));
                        } catch (JSONException unused) {
                            jSONObject = null;
                        }
                        if (jSONObject == null) {
                            if (this.h != null) {
                                if (!Arrays.equals(aVarD.f2329a, bArrB)) {
                                    this.h.b(aVarD.f2329a, this.i);
                                }
                            } else {
                                IAMapDelegate iAMapDelegate = this.f2333b;
                                if (iAMapDelegate != null) {
                                    iAMapDelegate.setCustomMapStyle(iAMapDelegate.getMapConfig().isCustomStyleEnable(), aVarD.f2329a);
                                }
                            }
                            a(str, aVarD.f2329a);
                            a(str, aVarD.f2331c);
                        }
                    }
                }
                jv.a(this.f2332a, eb.a());
                IAMapDelegate iAMapDelegate2 = this.f2333b;
                if (iAMapDelegate2 != null) {
                    iAMapDelegate2.setRunLowFrame(false);
                }
            }
        } catch (Throwable th) {
            jv.c(th, "CustomStyleTask", "download customStyle");
            th.printStackTrace();
        }
    }

    public final void a() {
        this.f2332a = null;
        if (this.f2334c != null) {
            this.f2334c = null;
        }
    }

    public final void b() {
        dz.a().a(this);
    }
}
