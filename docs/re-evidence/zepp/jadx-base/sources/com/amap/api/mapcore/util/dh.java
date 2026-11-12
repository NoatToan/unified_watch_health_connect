package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.FileUtil;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class dh implements Runnable {
    private Context a;
    private IAMapDelegate b;
    private dg c;
    private String d;
    private String e;
    private String f;
    private a g;
    private int h;

    public interface a {
        void a(byte[] bArr, int i);

        void b(byte[] bArr, int i);
    }

    public dh(Context context, a aVar, int i, String str) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = 0;
        this.a = context;
        this.g = aVar;
        this.h = i;
        if (this.c == null) {
            this.c = new dg(context, "", i != 0);
        }
        this.c.b(str);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(str == null ? "" : str);
        sb.append(".amapstyle");
        this.d = sb.toString();
        this.e = context.getCacheDir().getPath();
    }

    public final void a(String str) {
        dg dgVar = this.c;
        if (dgVar != null) {
            dgVar.c(str);
        }
        this.f = str;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        byte[] bArr;
        Object objValueOf;
        try {
            if (MapsInitializer.getNetWorkEnable()) {
                if (this.c != null) {
                    String str2 = this.f + this.d;
                    byte[] fileContents = null;
                    if (str2 != null) {
                        Context context = this.a;
                        String strConcat = "lastModified".concat(str2);
                        String simpleName = "".getClass().getSimpleName();
                        SharedPreferences sharedPreferences = context.getSharedPreferences("amap_style_config", 0);
                        if ("String".equals(simpleName)) {
                            objValueOf = sharedPreferences.getString(strConcat, "");
                        } else if ("Integer".equals(simpleName)) {
                            objValueOf = Integer.valueOf(sharedPreferences.getInt(strConcat, ((Integer) "").intValue()));
                        } else if ("Boolean".equals(simpleName)) {
                            objValueOf = Boolean.valueOf(sharedPreferences.getBoolean(strConcat, ((Boolean) "").booleanValue()));
                        } else if ("Float".equals(simpleName)) {
                            objValueOf = Float.valueOf(sharedPreferences.getFloat(strConcat, ((Float) "").floatValue()));
                        } else {
                            objValueOf = "Long".equals(simpleName) ? Long.valueOf(sharedPreferences.getLong(strConcat, ((Long) "").longValue())) : null;
                        }
                        if (!(objValueOf instanceof String) || objValueOf == "") {
                            str = null;
                        } else {
                            str = (String) objValueOf;
                        }
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        this.c.d(str);
                    }
                    if (str2 != null && this.e != null) {
                        fileContents = FileUtil.readFileContents(this.e + File.separator + str2);
                    }
                    a aVar = this.g;
                    if (aVar != null && fileContents != null) {
                        aVar.a(fileContents, this.h);
                    }
                    dg.a aVarE = this.c.e();
                    if (aVarE != null && (bArr = aVarE.a) != null) {
                        if (this.g == null) {
                            IAMapDelegate iAMapDelegate = this.b;
                            if (iAMapDelegate != null) {
                                iAMapDelegate.setCustomMapStyle(iAMapDelegate.getMapConfig().isCustomStyleEnable(), aVarE.a);
                            }
                        } else if (!Arrays.equals(bArr, fileContents)) {
                            this.g.b(aVarE.a, this.h);
                        }
                        byte[] bArr2 = aVarE.a;
                        if (str2 != null && bArr2 != null && this.e != null) {
                            FileUtil.saveFileContents(this.e + File.separator + str2, bArr2);
                        }
                        String str3 = aVarE.c;
                        if (str2 != null && str3 != null) {
                            eo.a(this.a, "amap_style_config", "lastModified".concat(str2), str3);
                        }
                    }
                }
                hn.a(this.a, er.f());
                IAMapDelegate iAMapDelegate2 = this.b;
                if (iAMapDelegate2 != null) {
                    iAMapDelegate2.setRunLowFrame(false);
                }
            }
        } catch (Throwable th) {
            hn.c(th, "CustomStyleTask", "download customStyle");
            th.printStackTrace();
        }
    }

    public final void a() {
        this.a = null;
        if (this.c != null) {
            this.c = null;
        }
    }

    public dh(Context context, IAMapDelegate iAMapDelegate) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = 0;
        this.a = context;
        this.b = iAMapDelegate;
        if (this.c == null) {
            this.c = new dg(context, "");
        }
    }
}
