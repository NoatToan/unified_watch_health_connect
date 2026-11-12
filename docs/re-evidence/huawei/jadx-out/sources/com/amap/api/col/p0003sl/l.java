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
import com.huawei.openalliance.ad.constant.UiEngineMethodName;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements cw.a {
    private boolean B;
    private AMap3DModelTileOverlay D;
    private a F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAMapDelegate f3023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomMapStyleOptions f3024c;
    private int i;
    private Context j;
    private boolean q;
    private boolean r;
    private cw v;
    private cw w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3022a = "__MACOSX";
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private byte[] k = null;
    private byte[] l = null;
    private byte[] m = null;
    private byte[] n = null;
    private byte[] o = null;
    private byte[] p = null;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private byte[] x = null;
    private byte[] y = null;
    private byte[] z = null;
    private boolean A = false;
    private HashMap<String, byte[]> C = new HashMap<>();
    private MyTrafficStyle E = new MyTrafficStyle();

    public interface a {
        void a();
    }

    public l(IAMapDelegate iAMapDelegate, Context context, boolean z) {
        this.i = -1;
        this.q = false;
        this.r = false;
        this.B = false;
        this.f3023b = iAMapDelegate;
        this.j = context;
        this.q = false;
        this.r = false;
        this.B = z;
        this.i = iAMapDelegate.getGLMapEngine().getEngineIDWithType(1);
    }

    public final void a() {
        IAMapDelegate iAMapDelegate;
        if (this.f3024c == null || this.r) {
            return;
        }
        try {
            MapConfig mapConfig = this.f3023b.getMapConfig();
            if (mapConfig == null) {
                return;
            }
            synchronized (this) {
                if (mapConfig.isHideLogoEnable() && (iAMapDelegate = this.f3023b) != null && iAMapDelegate.getUiSettings() != null) {
                    if (this.f3023b.getUiSettings().isLogoEnable()) {
                        if (this.f3024c.isEnable()) {
                            if (this.t) {
                                this.f3023b.getUiSettings().setLogoEnable(false);
                            }
                        } else {
                            this.f3023b.getUiSettings().setLogoEnable(true);
                        }
                    } else if (!this.t) {
                        this.f3023b.getUiSettings().setLogoEnable(true);
                    }
                }
                if (this.d) {
                    if (this.f3024c.isEnable()) {
                        this.f3023b.getGLMapEngine().setNativeMapModeAndStyle(this.i, 0, 0);
                        mapConfig.setCustomStyleEnable(true);
                        this.d = false;
                    } else {
                        this.f3023b.getGLMapEngine().setNativeMapModeAndStyle(this.i, mapConfig.getMapStyleMode(), mapConfig.getMapStyleTime());
                        this.t = false;
                        if (mapConfig.isCustomStyleEnable()) {
                            if (mapConfig.getMapStyleMode() == 0 && mapConfig.getMapStyleTime() == 0) {
                                g();
                            }
                            h();
                            if (this.u) {
                                f();
                            }
                            mapConfig.setCustomStyleEnable(false);
                        }
                        this.d = false;
                        return;
                    }
                }
                if (this.f) {
                    String styleTexturePath = this.f3024c.getStyleTexturePath();
                    if (this.f3024c.getStyleTextureData() == null && !TextUtils.isEmpty(styleTexturePath)) {
                        this.f3024c.setStyleTextureData(FileUtil.readFileContents(styleTexturePath));
                    }
                    if (this.f3024c.getStyleTextureData() != null) {
                        this.A = true;
                        if (mapConfig.isProFunctionAuthEnable()) {
                            this.s = true;
                            this.f3023b.getGLMapEngine().setCustomStyleTexture(this.i, this.f3024c.getStyleTextureData());
                            mapConfig.setUseProFunction(true);
                        } else {
                            h();
                        }
                    } else {
                        h();
                        this.A = false;
                    }
                    this.f = false;
                }
                if (this.e) {
                    String styleDataPath = this.f3024c.getStyleDataPath();
                    if (this.f3024c.getStyleData() == null && !TextUtils.isEmpty(styleDataPath)) {
                        this.f3024c.setStyleData(FileUtil.readFileContents(styleDataPath));
                    }
                    if (this.f3024c.getStyleData() != null || this.x != null) {
                        if (this.o == null) {
                            this.o = c(FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_CUSTOM_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_STYLE_DATA_0_FOR_TEXTURE));
                        }
                        byte[] styleData = this.x;
                        if (styleData == null) {
                            styleData = this.f3024c.getStyleData();
                        }
                        if (!b(styleData)) {
                            dh.a();
                        } else {
                            this.f3023b.getGLMapEngine().setCustomStyleData(this.i, styleData, this.o);
                            this.t = true;
                            IAMapDelegate iAMapDelegate2 = this.f3023b;
                            if (iAMapDelegate2 != null) {
                                iAMapDelegate2.resetRenderTime();
                            }
                        }
                    } else if (this.t) {
                        this.d = true;
                        this.f3024c.setEnable(false);
                    }
                    this.e = false;
                }
                if (this.g) {
                    String styleExtraPath = this.f3024c.getStyleExtraPath();
                    if (this.f3024c.getStyleExtraData() == null && !TextUtils.isEmpty(styleExtraPath)) {
                        this.f3024c.setStyleExtraData(FileUtil.readFileContents(styleExtraPath));
                    }
                    if (this.f3024c.getStyleExtraData() != null || this.y != null) {
                        byte[] styleExtraData = this.y;
                        if (styleExtraData == null) {
                            styleExtraData = this.f3024c.getStyleExtraData();
                        }
                        if (styleExtraData != null) {
                            a(styleExtraData);
                            this.u = true;
                        }
                    }
                    this.g = false;
                }
                if (this.h) {
                    a(mapConfig);
                    this.h = false;
                }
            }
        } catch (Throwable th) {
            jv.c(th, "AMapCustomStyleManager", UiEngineMethodName.UPDATE_STYLE);
            eb.a(th);
        }
    }

    private void a(byte[] bArr) {
        da daVarA;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (bArr == null || (daVarA = dd.a(bArr)) == null || daVarA.a() == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(daVarA.a());
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mapStyle");
            boolean zOptBoolean = true;
            String strOptString = null;
            if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject3.optJSONObject("bg")) != null) {
                zOptBoolean = jSONObjectOptJSONObject2.optBoolean("visible", true);
                strOptString = jSONObjectOptJSONObject2.optString("lineColor", null);
            }
            a(strOptString, zOptBoolean);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("layer");
            if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("traffic")) != null) {
                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject("multiFillColors");
                if (jSONObjectOptJSONObject.optBoolean("visible") && jSONObjectOptJSONObject5 != null) {
                    int iA = dd.a(jSONObjectOptJSONObject5.optString("smooth"));
                    int iA2 = dd.a(jSONObjectOptJSONObject5.optString("slow"));
                    int iA3 = dd.a(jSONObjectOptJSONObject5.optString("congested"));
                    int iA4 = dd.a(jSONObjectOptJSONObject5.optString("seriousCongested"));
                    this.E.setSmoothColor(iA);
                    this.E.setSlowColor(iA2);
                    this.E.setCongestedColor(iA3);
                    this.E.setSeriousCongestedColor(iA4);
                    if (this.p == null) {
                        this.p = FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_TRL_NAME);
                    }
                    this.f3023b.setTrafficStyleWithTexture(this.p, this.E);
                }
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("third_layer");
            if (jSONObjectOptJSONObject6 != null) {
                a(jSONObjectOptJSONObject6);
            }
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("model_layer");
            if (jSONObjectOptJSONObject7 != null) {
                b(jSONObjectOptJSONObject7.optString("id"));
            }
        } catch (Throwable th) {
            jv.c(th, "AMapCustomStyleManager", "setExtraStyle");
            eb.a(th);
        }
    }

    private void a(JSONObject jSONObject) {
        this.f3023b.getGLMapEngine().setCustomThirdLayerStyle(this.i, jSONObject.toString());
    }

    private void b(String str) {
        AMap3DModelTileProvider aMap3DModelTileProvider = new AMap3DModelTileProvider();
        aMap3DModelTileProvider.setUrl("https://restapi.amap.com/rest/lbs/geohub/3d/tiles?z=%d&x=%d&y=%d&id=" + str);
        AMap3DModelTileOverlayOptions aMap3DModelTileOverlayOptions = new AMap3DModelTileOverlayOptions();
        aMap3DModelTileOverlayOptions.setTileProvider(aMap3DModelTileProvider);
        try {
            this.D = this.f3023b.add3DModelTileOverlay(aMap3DModelTileOverlayOptions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(String str, boolean z) {
        boolean z2;
        int iA = !TextUtils.isEmpty(str) ? dd.a(str) : Integer.MIN_VALUE;
        IAMapDelegate iAMapDelegate = this.f3023b;
        if (iAMapDelegate == null || iAMapDelegate.getGLMapEngine() == null) {
            return;
        }
        if (this.m == null) {
            this.m = FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_CUSTOM_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_CUSTOM_BACKGROUND_NAME);
        }
        byte[] bArr = this.m;
        if (bArr != null) {
            if (z) {
                if (iA == Integer.MIN_VALUE) {
                    z2 = true;
                }
                this.f3023b.getGLMapEngine().setBackgroundTexture(this.i, eb.a((byte[]) bArr.clone(), 0, iA, z2));
            }
            iA = 0;
            z2 = false;
            this.f3023b.getGLMapEngine().setBackgroundTexture(this.i, eb.a((byte[]) bArr.clone(), 0, iA, z2));
        }
    }

    private void f() {
        IAMapDelegate iAMapDelegate = this.f3023b;
        if (iAMapDelegate != null && iAMapDelegate.getGLMapEngine() != null && this.p != null) {
            this.f3023b.getGLMapEngine().setTrafficStyleWithTexture(this.i, this.p, new MyTrafficStyle());
        }
        IAMapDelegate iAMapDelegate2 = this.f3023b;
        if (iAMapDelegate2 != null && iAMapDelegate2.getGLMapEngine() != null && this.m != null) {
            this.f3023b.getGLMapEngine().setBackgroundTexture(this.i, this.m);
        }
        AMap3DModelTileOverlay aMap3DModelTileOverlay = this.D;
        if (aMap3DModelTileOverlay != null) {
            aMap3DModelTileOverlay.remove();
        }
        this.u = false;
    }

    private boolean b(byte[] bArr) {
        if (bArr == null) {
            return true;
        }
        try {
            return this.f3023b.getGLMapEngine().checkCustomStyleData(this.i, bArr);
        } catch (Throwable th) {
            jv.c(th, "AMapCustomStyleManager", "checkData");
            eb.a(th);
            return true;
        }
    }

    private void g() {
        if (this.B) {
            if (this.l == null) {
                this.l = c(FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_STYLE_DATA_ABROAD));
            }
        } else if (this.l == null) {
            this.l = c(FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_STYLE_DATA));
        }
        this.f3023b.getGLMapEngine().setCustomStyleData(this.i, this.l, this.k);
        this.t = false;
        this.C.clear();
    }

    private void h() {
        if (this.s) {
            if (this.n == null) {
                this.n = FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_CUSTOM_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_ICON_5_NAME_FOR_CUSTOM);
            }
            this.s = false;
            this.f3023b.getGLMapEngine().setCustomStyleTexture(this.i, this.n);
        }
    }

    public final void a(CustomMapStyleOptions customMapStyleOptions) {
        IAMapDelegate iAMapDelegate;
        if (this.f3024c == null || customMapStyleOptions == null) {
            return;
        }
        synchronized (this) {
            if (!this.q) {
                this.q = true;
                if (this.f3024c.isEnable()) {
                    this.d = true;
                }
            }
            if (this.f3024c.isEnable() != customMapStyleOptions.isEnable()) {
                this.f3024c.setEnable(customMapStyleOptions.isEnable());
                this.d = true;
                dy.b(this.j, customMapStyleOptions.isEnable());
            }
            if (this.f3024c.isEnable()) {
                if (!TextUtils.equals(this.f3024c.getStyleId(), customMapStyleOptions.getStyleId())) {
                    this.f3024c.setStyleId(customMapStyleOptions.getStyleId());
                    String styleId = this.f3024c.getStyleId();
                    if (!TextUtils.isEmpty(styleId) && (iAMapDelegate = this.f3023b) != null && iAMapDelegate.getMapConfig() != null && this.f3023b.getMapConfig().isProFunctionAuthEnable()) {
                        if (this.v == null) {
                            if (this.B) {
                                this.v = new cw(this.j, this, 2, "abroad_sdk_json_sdk_1010_zip");
                            } else {
                                this.v = new cw(this.j, this, 1, "sdk_1010");
                            }
                        }
                        this.v.a(styleId);
                        this.v.b();
                        if (this.w == null) {
                            this.w = new cw(this.j, this, 0, null);
                        }
                        this.w.a(styleId);
                        this.w.b();
                    }
                }
                if (!TextUtils.equals(this.f3024c.getStyleDataPath(), customMapStyleOptions.getStyleDataPath())) {
                    this.f3024c.setStyleDataPath(customMapStyleOptions.getStyleDataPath());
                    this.e = true;
                }
                if (this.f3024c.getStyleData() != customMapStyleOptions.getStyleData()) {
                    this.f3024c.setStyleData(customMapStyleOptions.getStyleData());
                    this.e = true;
                }
                if (!TextUtils.equals(this.f3024c.getStyleTexturePath(), customMapStyleOptions.getStyleTexturePath())) {
                    this.f3024c.setStyleTexturePath(customMapStyleOptions.getStyleTexturePath());
                    this.f = true;
                }
                if (this.f3024c.getStyleTextureData() != customMapStyleOptions.getStyleTextureData()) {
                    this.f3024c.setStyleTextureData(customMapStyleOptions.getStyleTextureData());
                    this.f = true;
                }
                if (!TextUtils.equals(this.f3024c.getStyleExtraPath(), customMapStyleOptions.getStyleExtraPath())) {
                    this.f3024c.setStyleExtraPath(customMapStyleOptions.getStyleExtraPath());
                    this.g = true;
                }
                if (this.f3024c.getStyleExtraData() != customMapStyleOptions.getStyleExtraData()) {
                    this.f3024c.setStyleExtraData(customMapStyleOptions.getStyleExtraData());
                    this.g = true;
                }
                if (!TextUtils.equals(this.f3024c.getStyleResDataPath(), customMapStyleOptions.getStyleResDataPath())) {
                    this.f3024c.setStyleResDataPath(customMapStyleOptions.getStyleResDataPath());
                    this.h = true;
                }
                if (this.f3024c.getStyleResData() != customMapStyleOptions.getStyleResData()) {
                    this.f3024c.setStyleResData(customMapStyleOptions.getStyleResData());
                    this.h = true;
                }
                dy.a(this.j, true);
            } else {
                i();
                dy.a(this.j, false);
            }
        }
    }

    public final void b() {
        if (this.f3024c == null) {
            return;
        }
        synchronized (this) {
            IAMapDelegate iAMapDelegate = this.f3023b;
            if (iAMapDelegate != null && iAMapDelegate.getMapConfig() != null && !this.f3023b.getMapConfig().isProFunctionAuthEnable()) {
                this.f3024c.setStyleId(null);
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
        }
    }

    private static byte[] c(byte[] bArr) {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        byte[] byteArray = null;
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
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                th = th2;
                try {
                    eb.a(th);
                    th.printStackTrace();
                } finally {
                    GLFileUtil.closeQuietly(byteArrayOutputStream);
                    GLFileUtil.closeQuietly(byteArrayInputStream);
                    GLFileUtil.closeQuietly(gZIPInputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPInputStream = null;
        }
        return byteArray;
    }

    @Override // com.amap.api.col.3sl.cw.a
    public final void a(byte[] bArr, int i) {
        b(bArr, i);
    }

    @Override // com.amap.api.col.3sl.cw.a
    public final void b(byte[] bArr, int i) {
        MapConfig mapConfig;
        a aVar;
        if (this.f3024c != null) {
            synchronized (this) {
                IAMapDelegate iAMapDelegate = this.f3023b;
                if (iAMapDelegate != null && (mapConfig = iAMapDelegate.getMapConfig()) != null && mapConfig.isProFunctionAuthEnable()) {
                    mapConfig.setUseProFunction(true);
                    if (i == 1) {
                        this.x = bArr;
                        this.e = true;
                    } else if (i == 0) {
                        this.y = bArr;
                        this.g = true;
                    } else if (i == 2) {
                        String str = this.f3024c.getStyleId() + "_sdk_1010.data";
                        String str2 = this.f3024c.getStyleId() + "_abroad_sdk.json";
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
            }
        }
    }

    private static String c(String str) {
        int iIndexOf;
        return (str == null || (iIndexOf = str.indexOf("99999_")) == -1) ? str : str.substring(0, iIndexOf).replace("99999_", "");
    }

    private void a(MapConfig mapConfig) {
        byte[] bArr;
        if (!mapConfig.isProFunctionAuthEnable()) {
            this.C.clear();
            return;
        }
        String styleResDataPath = this.f3024c.getStyleResDataPath();
        if (this.f3024c.getStyleResData() == null && !TextUtils.isEmpty(styleResDataPath)) {
            this.f3024c.setStyleResData(FileUtil.readFileContents(styleResDataPath));
        }
        if (this.f3024c.getStyleResData() == null && this.z == null) {
            return;
        }
        byte[] styleResData = this.z;
        if (styleResData == null) {
            styleResData = this.f3024c.getStyleResData();
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

    public final byte[] a(String str) {
        MapConfig mapConfig;
        if (str == null || (mapConfig = this.f3023b.getMapConfig()) == null) {
            return null;
        }
        if (!mapConfig.isProFunctionAuthEnable()) {
            return FileUtil.readFileContentsFromAssetsByPreName(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME, c(str));
        }
        for (String str2 : this.C.keySet()) {
            if (str.contains(str2)) {
                return this.C.get(str2);
            }
        }
        return null;
    }

    public final void a(a aVar) {
        this.F = aVar;
    }

    public final void c() {
        if (this.f3024c == null) {
            this.f3024c = new CustomMapStyleOptions();
        }
    }

    public final boolean d() {
        return this.f3024c != null;
    }

    public final void e() {
        synchronized (this) {
            CustomMapStyleOptions customMapStyleOptions = this.f3024c;
            if (customMapStyleOptions != null) {
                customMapStyleOptions.setEnable(false);
                i();
                this.d = true;
            }
        }
    }

    private void i() {
        CustomMapStyleOptions customMapStyleOptions = this.f3024c;
        if (customMapStyleOptions != null) {
            customMapStyleOptions.setStyleId(null);
            this.f3024c.setStyleDataPath(null);
            this.f3024c.setStyleData(null);
            this.f3024c.setStyleTexturePath(null);
            this.f3024c.setStyleTextureData(null);
            this.f3024c.setStyleExtraData(null);
            this.f3024c.setStyleExtraPath(null);
        }
    }
}
