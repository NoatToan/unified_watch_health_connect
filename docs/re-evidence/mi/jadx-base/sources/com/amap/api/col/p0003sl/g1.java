package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.MyTrafficStyle;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlay;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileProvider;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.FileUtil;
import com.autonavi.base.amap.mapcore.MapConfig;
import com.autonavi.base.amap.mapcore.tools.GLFileUtil;
import defpackage.aks;
import defpackage.m2t;
import defpackage.mms;
import defpackage.oks;
import defpackage.pjs;
import defpackage.zns;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 implements i.a {
    public boolean B;
    public AMap3DModelTileOverlay D;
    public a F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IAMapDelegate f6064b;
    public CustomMapStyleOptions c;
    public int i;
    public Context j;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6066r;
    public i v;
    public i w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6063a = "__MACOSX";
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f6065k = null;
    public byte[] l = null;
    public byte[] m = null;
    public byte[] n = null;
    public byte[] o = null;
    public byte[] p = null;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public byte[] x = null;
    public byte[] y = null;
    public byte[] z = null;
    public boolean A = false;
    public HashMap<String, byte[]> C = new HashMap<>();
    public MyTrafficStyle E = new MyTrafficStyle();

    public interface a {
        void a();
    }

    public g1(IAMapDelegate iAMapDelegate, Context context, boolean z) {
        this.i = -1;
        this.q = false;
        this.f6066r = false;
        this.B = false;
        this.f6064b = iAMapDelegate;
        this.j = context;
        this.q = false;
        this.f6066r = false;
        this.B = z;
        this.i = iAMapDelegate.getGLMapEngine().getEngineIDWithType(1);
    }

    public static String l(String str) {
        int iIndexOf;
        return (str == null || (iIndexOf = str.indexOf("99999_")) == -1) ? str : str.substring(0, iIndexOf).replace("99999_", "");
    }

    public static byte[] n(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                byte[] bArr2 = new byte[256];
                while (true) {
                    int i = gZIPInputStream.read(bArr2);
                    if (i < 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        GLFileUtil.closeQuietly(byteArrayOutputStream);
                        GLFileUtil.closeQuietly(byteArrayInputStream);
                        GLFileUtil.closeQuietly(gZIPInputStream);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    zns.E(th);
                    th.printStackTrace();
                    return null;
                } finally {
                    GLFileUtil.closeQuietly(byteArrayOutputStream);
                    GLFileUtil.closeQuietly(byteArrayInputStream);
                    GLFileUtil.closeQuietly(gZIPInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            gZIPInputStream = null;
        }
    }

    public final void a() {
        IAMapDelegate iAMapDelegate;
        if (this.c == null || this.f6066r) {
            return;
        }
        try {
            MapConfig mapConfig = this.f6064b.getMapConfig();
            if (mapConfig == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (mapConfig.isHideLogoEnable() && (iAMapDelegate = this.f6064b) != null && iAMapDelegate.getUiSettings() != null) {
                        if (this.f6064b.getUiSettings().isLogoEnable()) {
                            if (!this.c.isEnable()) {
                                this.f6064b.getUiSettings().setLogoEnable(true);
                            } else if (this.t) {
                                this.f6064b.getUiSettings().setLogoEnable(false);
                            }
                        } else if (!this.t) {
                            this.f6064b.getUiSettings().setLogoEnable(true);
                        }
                    }
                    if (this.d) {
                        if (!this.c.isEnable()) {
                            this.f6064b.getGLMapEngine().setNativeMapModeAndStyle(this.i, mapConfig.getMapStyleMode(), mapConfig.getMapStyleTime());
                            this.t = false;
                            if (mapConfig.isCustomStyleEnable()) {
                                if (mapConfig.getMapStyleMode() == 0 && mapConfig.getMapStyleTime() == 0) {
                                    r();
                                }
                                s();
                                if (this.u) {
                                    q();
                                }
                                mapConfig.setCustomStyleEnable(false);
                            }
                            this.d = false;
                            return;
                        }
                        this.f6064b.getGLMapEngine().setNativeMapModeAndStyle(this.i, 0, 0);
                        mapConfig.setCustomStyleEnable(true);
                        this.d = false;
                    }
                    if (this.f) {
                        String styleTexturePath = this.c.getStyleTexturePath();
                        if (this.c.getStyleTextureData() == null && !TextUtils.isEmpty(styleTexturePath)) {
                            this.c.setStyleTextureData(FileUtil.readFileContents(styleTexturePath));
                        }
                        if (this.c.getStyleTextureData() != null) {
                            this.A = true;
                            if (mapConfig.isProFunctionAuthEnable()) {
                                this.s = true;
                                this.f6064b.getGLMapEngine().setCustomStyleTexture(this.i, this.c.getStyleTextureData());
                                mapConfig.setUseProFunction(true);
                            } else {
                                s();
                            }
                        } else {
                            s();
                            this.A = false;
                        }
                        this.f = false;
                    }
                    if (this.e) {
                        String styleDataPath = this.c.getStyleDataPath();
                        if (this.c.getStyleData() == null && !TextUtils.isEmpty(styleDataPath)) {
                            this.c.setStyleData(FileUtil.readFileContents(styleDataPath));
                        }
                        if (this.c.getStyleData() != null || this.x != null) {
                            if (this.o == null) {
                                this.o = n(FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_CUSTOM_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_STYLE_DATA_0_FOR_TEXTURE));
                            }
                            byte[] styleData = this.x;
                            if (styleData == null) {
                                styleData = this.c.getStyleData();
                            }
                            if (k(styleData)) {
                                this.f6064b.getGLMapEngine().setCustomStyleData(this.i, styleData, this.o);
                                this.t = true;
                                IAMapDelegate iAMapDelegate2 = this.f6064b;
                                if (iAMapDelegate2 != null) {
                                    iAMapDelegate2.resetRenderTime();
                                }
                            } else {
                                oks.a();
                            }
                        } else if (this.t) {
                            this.d = true;
                            this.c.setEnable(false);
                        }
                        this.e = false;
                    }
                    if (this.g) {
                        String styleExtraPath = this.c.getStyleExtraPath();
                        if (this.c.getStyleExtraData() == null && !TextUtils.isEmpty(styleExtraPath)) {
                            this.c.setStyleExtraData(FileUtil.readFileContents(styleExtraPath));
                        }
                        if (this.c.getStyleExtraData() != null || this.y != null) {
                            byte[] styleExtraData = this.y;
                            if (styleExtraData == null) {
                                styleExtraData = this.c.getStyleExtraData();
                            }
                            if (styleExtraData != null) {
                                g(styleExtraData);
                                this.u = true;
                            }
                        }
                        this.g = false;
                    }
                    if (this.h) {
                        d(mapConfig);
                        this.h = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            m2t.r(th2, "AMapCustomStyleManager", "updateStyle");
            zns.E(th2);
        }
    }

    @Override // com.amap.api.col.3sl.i.a
    public final void b(byte[] bArr, int i) {
        MapConfig mapConfig;
        a aVar;
        if (this.c != null) {
            synchronized (this) {
                try {
                    IAMapDelegate iAMapDelegate = this.f6064b;
                    if (iAMapDelegate != null && (mapConfig = iAMapDelegate.getMapConfig()) != null && mapConfig.isProFunctionAuthEnable()) {
                        mapConfig.setUseProFunction(true);
                        if (i == 1) {
                            this.x = bArr;
                            this.e = true;
                        } else if (i == 0) {
                            this.y = bArr;
                            this.g = true;
                        } else if (i == 2) {
                            String str = this.c.getStyleId() + "_sdk_1010.data";
                            String str2 = this.c.getStyleId() + "_abroad_sdk.json";
                            Map<String, byte[]> mapUncompressToByteWithKeys = FileUtil.uncompressToByteWithKeys(bArr, new String[]{str, str2});
                            if (mapUncompressToByteWithKeys != null) {
                                byte[] bArr2 = mapUncompressToByteWithKeys.get(str);
                                if (bArr2 != null) {
                                    this.x = bArr2;
                                    this.e = true;
                                }
                                if (mapUncompressToByteWithKeys.get(str2) != null && (aVar = this.F) != null) {
                                    aVar.a();
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(CustomMapStyleOptions customMapStyleOptions) {
        IAMapDelegate iAMapDelegate;
        if (this.c == null || customMapStyleOptions == null) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.q) {
                    this.q = true;
                    if (this.c.isEnable()) {
                        this.d = true;
                    }
                }
                if (this.c.isEnable() != customMapStyleOptions.isEnable()) {
                    this.c.setEnable(customMapStyleOptions.isEnable());
                    this.d = true;
                    mms.k(this.j, customMapStyleOptions.isEnable());
                }
                if (this.c.isEnable()) {
                    if (!TextUtils.equals(this.c.getStyleId(), customMapStyleOptions.getStyleId())) {
                        this.c.setStyleId(customMapStyleOptions.getStyleId());
                        String styleId = this.c.getStyleId();
                        if (!TextUtils.isEmpty(styleId) && (iAMapDelegate = this.f6064b) != null && iAMapDelegate.getMapConfig() != null && this.f6064b.getMapConfig().isProFunctionAuthEnable()) {
                            if (this.v == null) {
                                if (this.B) {
                                    this.v = new i(this.j, this, 2, "abroad_sdk_json_sdk_1010_zip");
                                } else {
                                    this.v = new i(this.j, this, 1, "sdk_1010");
                                }
                            }
                            this.v.b(styleId);
                            this.v.b();
                            if (this.w == null) {
                                this.w = new i(this.j, this, 0, null);
                            }
                            this.w.b(styleId);
                            this.w.b();
                        }
                    }
                    if (!TextUtils.equals(this.c.getStyleDataPath(), customMapStyleOptions.getStyleDataPath())) {
                        this.c.setStyleDataPath(customMapStyleOptions.getStyleDataPath());
                        this.e = true;
                    }
                    if (this.c.getStyleData() != customMapStyleOptions.getStyleData()) {
                        this.c.setStyleData(customMapStyleOptions.getStyleData());
                        this.e = true;
                    }
                    if (!TextUtils.equals(this.c.getStyleTexturePath(), customMapStyleOptions.getStyleTexturePath())) {
                        this.c.setStyleTexturePath(customMapStyleOptions.getStyleTexturePath());
                        this.f = true;
                    }
                    if (this.c.getStyleTextureData() != customMapStyleOptions.getStyleTextureData()) {
                        this.c.setStyleTextureData(customMapStyleOptions.getStyleTextureData());
                        this.f = true;
                    }
                    if (!TextUtils.equals(this.c.getStyleExtraPath(), customMapStyleOptions.getStyleExtraPath())) {
                        this.c.setStyleExtraPath(customMapStyleOptions.getStyleExtraPath());
                        this.g = true;
                    }
                    if (this.c.getStyleExtraData() != customMapStyleOptions.getStyleExtraData()) {
                        this.c.setStyleExtraData(customMapStyleOptions.getStyleExtraData());
                        this.g = true;
                    }
                    if (!TextUtils.equals(this.c.getStyleResDataPath(), customMapStyleOptions.getStyleResDataPath())) {
                        this.c.setStyleResDataPath(customMapStyleOptions.getStyleResDataPath());
                        this.h = true;
                    }
                    if (this.c.getStyleResData() != customMapStyleOptions.getStyleResData()) {
                        this.c.setStyleResData(customMapStyleOptions.getStyleResData());
                        this.h = true;
                    }
                    mms.h(this.j, true);
                } else {
                    t();
                    mms.h(this.j, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(MapConfig mapConfig) {
        byte[] bArr;
        if (!mapConfig.isProFunctionAuthEnable()) {
            this.C.clear();
            return;
        }
        String styleResDataPath = this.c.getStyleResDataPath();
        if (this.c.getStyleResData() == null && !TextUtils.isEmpty(styleResDataPath)) {
            this.c.setStyleResData(FileUtil.readFileContents(styleResDataPath));
        }
        if (this.c.getStyleResData() == null && this.z == null) {
            return;
        }
        byte[] styleResData = this.z;
        if (styleResData == null) {
            styleResData = this.c.getStyleResData();
        }
        if (styleResData != null) {
            mapConfig.setUseProFunction(true);
            this.C.clear();
            Map<String, byte[]> mapUncompressToByteWithKeys = FileUtil.uncompressToByteWithKeys(styleResData, null);
            if (mapUncompressToByteWithKeys != null) {
                for (String str : mapUncompressToByteWithKeys.keySet()) {
                    if (str != null && !str.contains("__MACOSX") && (bArr = mapUncompressToByteWithKeys.get(str)) != null) {
                        if (FileUtil.isGzip(bArr)) {
                            this.C.put(str, bArr);
                        } else {
                            this.C.put(str, FileUtil.compress(bArr));
                        }
                    }
                }
            }
        }
    }

    public final void e(String str, boolean z) {
        boolean z2;
        int iB = !TextUtils.isEmpty(str) ? aks.b(str) : Integer.MIN_VALUE;
        IAMapDelegate iAMapDelegate = this.f6064b;
        if (iAMapDelegate == null || iAMapDelegate.getGLMapEngine() == null) {
            return;
        }
        if (this.m == null) {
            this.m = FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_CUSTOM_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_CUSTOM_BACKGROUND_NAME);
        }
        byte[] bArr = this.m;
        if (bArr != null) {
            if (z) {
                if (iB == Integer.MIN_VALUE) {
                    z2 = true;
                }
                this.f6064b.getGLMapEngine().setBackgroundTexture(this.i, zns.U((byte[]) bArr.clone(), 0, iB, z2));
            }
            iB = 0;
            z2 = false;
            this.f6064b.getGLMapEngine().setBackgroundTexture(this.i, zns.U((byte[]) bArr.clone(), 0, iB, z2));
        }
    }

    public final void f(JSONObject jSONObject) {
        this.f6064b.getGLMapEngine().setCustomThirdLayerStyle(this.i, jSONObject.toString());
    }

    public final void g(byte[] bArr) {
        pjs pjsVarD;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (bArr == null || (pjsVarD = aks.d(bArr)) == null || pjsVarD.a() == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(pjsVarD.a());
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mapStyle");
            String strOptString = null;
            boolean zOptBoolean = true;
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject3.optJSONObject("bg")) != null) {
                zOptBoolean = jSONObjectOptJSONObject2.optBoolean("visible", true);
                strOptString = jSONObjectOptJSONObject2.optString("lineColor", null);
            }
            e(strOptString, zOptBoolean);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("layer");
            if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("traffic")) != null) {
                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject("multiFillColors");
                if (jSONObjectOptJSONObject.optBoolean("visible") && jSONObjectOptJSONObject5 != null) {
                    int iB = aks.b(jSONObjectOptJSONObject5.optString("smooth"));
                    int iB2 = aks.b(jSONObjectOptJSONObject5.optString("slow"));
                    int iB3 = aks.b(jSONObjectOptJSONObject5.optString("congested"));
                    int iB4 = aks.b(jSONObjectOptJSONObject5.optString("seriousCongested"));
                    this.E.setSmoothColor(iB);
                    this.E.setSlowColor(iB2);
                    this.E.setCongestedColor(iB3);
                    this.E.setSeriousCongestedColor(iB4);
                    if (this.p == null) {
                        this.p = FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_TRL_NAME);
                    }
                    this.f6064b.setTrafficStyleWithTexture(this.p, this.E);
                }
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("third_layer");
            if (jSONObjectOptJSONObject6 != null) {
                f(jSONObjectOptJSONObject6);
            }
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("model_layer");
            if (jSONObjectOptJSONObject7 != null) {
                j(jSONObjectOptJSONObject7.optString("id"));
            }
        } catch (Throwable th) {
            m2t.r(th, "AMapCustomStyleManager", "setExtraStyle");
            zns.E(th);
        }
    }

    public final byte[] h(String str) {
        MapConfig mapConfig;
        if (str == null || (mapConfig = this.f6064b.getMapConfig()) == null) {
            return null;
        }
        if (!mapConfig.isProFunctionAuthEnable()) {
            return FileUtil.readFileContentsFromAssetsByPreName(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME, l(str));
        }
        for (String str2 : this.C.keySet()) {
            if (str.contains(str2)) {
                return this.C.get(str2);
            }
        }
        return null;
    }

    public final void i() {
        if (this.c == null) {
            return;
        }
        synchronized (this) {
            try {
                IAMapDelegate iAMapDelegate = this.f6064b;
                if (iAMapDelegate != null && iAMapDelegate.getMapConfig() != null && !this.f6064b.getMapConfig().isProFunctionAuthEnable()) {
                    this.c.setStyleId(null);
                    this.x = null;
                    this.y = null;
                    this.z = null;
                }
                this.f = true;
                this.e = true;
                if (this.u) {
                    this.g = true;
                }
                this.d = true;
                this.h = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(String str) {
        AMap3DModelTileProvider aMap3DModelTileProvider = new AMap3DModelTileProvider();
        aMap3DModelTileProvider.setUrl("https://restapi.amap.com/rest/lbs/geohub/3d/tiles?z=%d&x=%d&y=%d&id=" + str);
        AMap3DModelTileOverlayOptions aMap3DModelTileOverlayOptions = new AMap3DModelTileOverlayOptions();
        aMap3DModelTileOverlayOptions.setTileProvider(aMap3DModelTileProvider);
        try {
            this.D = this.f6064b.add3DModelTileOverlay(aMap3DModelTileOverlayOptions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean k(byte[] bArr) {
        if (bArr == null) {
            return true;
        }
        try {
            return this.f6064b.getGLMapEngine().checkCustomStyleData(this.i, bArr);
        } catch (Throwable th) {
            m2t.r(th, "AMapCustomStyleManager", "checkData");
            zns.E(th);
            return true;
        }
    }

    public final void m() {
        if (this.c == null) {
            this.c = new CustomMapStyleOptions();
        }
    }

    public final boolean o() {
        return this.c != null;
    }

    public final void p() {
        synchronized (this) {
            try {
                CustomMapStyleOptions customMapStyleOptions = this.c;
                if (customMapStyleOptions != null) {
                    customMapStyleOptions.setEnable(false);
                    t();
                    this.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        IAMapDelegate iAMapDelegate = this.f6064b;
        if (iAMapDelegate != null && iAMapDelegate.getGLMapEngine() != null && this.p != null) {
            this.f6064b.getGLMapEngine().setTrafficStyleWithTexture(this.i, this.p, new MyTrafficStyle());
        }
        IAMapDelegate iAMapDelegate2 = this.f6064b;
        if (iAMapDelegate2 != null && iAMapDelegate2.getGLMapEngine() != null && this.m != null) {
            this.f6064b.getGLMapEngine().setBackgroundTexture(this.i, this.m);
        }
        AMap3DModelTileOverlay aMap3DModelTileOverlay = this.D;
        if (aMap3DModelTileOverlay != null) {
            aMap3DModelTileOverlay.remove();
        }
        this.u = false;
    }

    public final void r() {
        if (this.B) {
            if (this.l == null) {
                this.l = n(FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_STYLE_DATA_ABROAD));
            }
        } else if (this.l == null) {
            this.l = n(FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_STYLE_DATA));
        }
        this.f6064b.getGLMapEngine().setCustomStyleData(this.i, this.l, this.f6065k);
        this.t = false;
        this.C.clear();
    }

    public final void s() {
        if (this.s) {
            if (this.n == null) {
                this.n = FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_CUSTOM_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_ICON_5_NAME_FOR_CUSTOM);
            }
            this.s = false;
            this.f6064b.getGLMapEngine().setCustomStyleTexture(this.i, this.n);
        }
    }

    public final void t() {
        CustomMapStyleOptions customMapStyleOptions = this.c;
        if (customMapStyleOptions != null) {
            customMapStyleOptions.setStyleId(null);
            this.c.setStyleDataPath(null);
            this.c.setStyleData(null);
            this.c.setStyleTexturePath(null);
            this.c.setStyleTextureData(null);
            this.c.setStyleExtraData(null);
            this.c.setStyleExtraPath(null);
        }
    }

    public final void b(a aVar) {
        this.F = aVar;
    }

    @Override // com.amap.api.col.3sl.i.a
    public final void a(byte[] bArr, int i) {
        b(bArr, i);
    }
}
