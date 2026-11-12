package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.MyTrafficStyle;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.FileUtil;
import com.autonavi.base.amap.mapcore.MapConfig;
import com.autonavi.base.amap.mapcore.tools.GLFileUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements dh.a {
    private boolean A;
    private InterfaceC0102a D;
    private IAMapDelegate b;
    private CustomMapStyleOptions c;
    private Context j;
    private boolean p;
    private boolean q;
    private dh u;
    private dh v;
    private final String a = "__MACOSX";
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private int i = 1;
    private byte[] k = null;
    private byte[] l = null;
    private byte[] m = null;
    private byte[] n = null;
    private byte[] o = null;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private byte[] w = null;
    private byte[] x = null;
    private byte[] y = null;
    private boolean z = false;
    private HashMap<String, byte[]> B = new HashMap<>();
    private MyTrafficStyle C = new MyTrafficStyle();

    /* JADX INFO: renamed from: com.amap.api.mapcore.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC0102a {
        void a();
    }

    public a(IAMapDelegate iAMapDelegate, Context context, boolean z) {
        this.p = false;
        this.q = false;
        this.A = false;
        this.b = iAMapDelegate;
        this.j = context;
        this.p = false;
        this.q = false;
        this.A = z;
    }

    private void f() {
        if (this.r) {
            if (this.n == null) {
                this.n = FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_ICON_5_NAME_FOR_CUSTOM);
            }
            this.r = false;
            this.b.getGLMapEngine().setCustomStyleTexture(this.i, this.n);
        }
    }

    private void g() {
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

    public final void a() {
        boolean zOptBoolean;
        JSONObject jSONObjectOptJSONObject;
        IAMapDelegate iAMapDelegate;
        if (this.c == null || this.q) {
            return;
        }
        try {
            MapConfig mapConfig = this.b.getMapConfig();
            if (mapConfig == null) {
                return;
            }
            synchronized (this) {
                if (mapConfig.isHideLogoEnable() && (iAMapDelegate = this.b) != null && iAMapDelegate.getUiSettings() != null) {
                    if (this.b.getUiSettings().isLogoEnable()) {
                        if (!this.c.isEnable()) {
                            this.b.getUiSettings().setLogoEnable(true);
                        } else if (this.s) {
                            this.b.getUiSettings().setLogoEnable(false);
                        }
                    } else if (!this.s) {
                        this.b.getUiSettings().setLogoEnable(true);
                    }
                }
                if (this.d) {
                    if (!this.c.isEnable()) {
                        this.b.getGLMapEngine().setNativeMapModeAndStyle(this.i, mapConfig.getMapStyleMode(), mapConfig.getMapStyleTime(), mapConfig.getMapStyleState(), false, false, null);
                        this.s = false;
                        if (mapConfig.isCustomStyleEnable()) {
                            if (mapConfig.getMapStyleMode() == 0 && mapConfig.getMapStyleTime() == 0 && mapConfig.getMapStyleState() == 0) {
                                if (this.A) {
                                    if (this.l == null) {
                                        this.l = b(FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_STYLE_DATA_ABROAD));
                                    }
                                } else if (this.l == null) {
                                    this.l = b(FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_STYLE_DATA));
                                }
                                this.b.getGLMapEngine().setCustomStyleData(this.i, this.l, this.k);
                                this.s = false;
                                this.B.clear();
                            }
                            f();
                            if (this.t) {
                                IAMapDelegate iAMapDelegate2 = this.b;
                                if (iAMapDelegate2 != null && iAMapDelegate2.getGLMapEngine() != null && this.m != null) {
                                    this.b.getGLMapEngine().setBackgroundTexture(this.i, this.m);
                                }
                                this.t = false;
                            }
                            mapConfig.setCustomStyleEnable(false);
                        }
                        this.d = false;
                        return;
                    }
                    this.b.getGLMapEngine().setNativeMapModeAndStyle(this.i, 0, 0, 0, false, false, null);
                    mapConfig.setCustomStyleEnable(true);
                    this.d = false;
                }
                if (this.f) {
                    String styleTexturePath = this.c.getStyleTexturePath();
                    if (this.c.getStyleTextureData() == null && !TextUtils.isEmpty(styleTexturePath)) {
                        this.c.setStyleTextureData(FileUtil.readFileContents(styleTexturePath));
                    }
                    if (this.c.getStyleTextureData() != null) {
                        this.z = true;
                        if (mapConfig.isProFunctionAuthEnable()) {
                            this.r = true;
                            this.b.getGLMapEngine().setCustomStyleTexture(this.i, this.c.getStyleTextureData());
                            mapConfig.setUseProFunction(true);
                        } else {
                            f();
                        }
                    } else {
                        f();
                        this.z = false;
                    }
                    this.f = false;
                }
                if (this.e) {
                    String styleDataPath = this.c.getStyleDataPath();
                    if (this.c.getStyleData() == null && !TextUtils.isEmpty(styleDataPath)) {
                        this.c.setStyleData(FileUtil.readFileContents(styleDataPath));
                    }
                    if (this.c.getStyleData() != null || this.w != null) {
                        if (this.o == null) {
                            this.o = b(FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_STYLE_DATA_0_FOR_TEXTURE));
                        }
                        byte[] styleData = this.w;
                        if (styleData == null) {
                            styleData = this.c.getStyleData();
                        }
                        if (a(styleData)) {
                            this.b.getGLMapEngine().setCustomStyleData(this.i, styleData, this.o);
                            this.s = true;
                            IAMapDelegate iAMapDelegate3 = this.b;
                            if (iAMapDelegate3 != null) {
                                iAMapDelegate3.resetRenderTime();
                            }
                        } else {
                            dt.a();
                        }
                    } else if (this.s) {
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
                    if (this.c.getStyleExtraData() != null || this.x != null) {
                        byte[] styleExtraData = this.x;
                        if (styleExtraData == null) {
                            styleExtraData = this.c.getStyleExtraData();
                        }
                        if (styleExtraData != null) {
                            dl dlVarA = Cdo.a(styleExtraData);
                            if (dlVarA != null && dlVarA.a() != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(dlVarA.a());
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("bg");
                                    String strOptString = null;
                                    if (jSONObjectOptJSONObject2 != null) {
                                        zOptBoolean = jSONObjectOptJSONObject2.optBoolean("visible", true);
                                        strOptString = jSONObjectOptJSONObject2.optString("lineColor", null);
                                    } else {
                                        zOptBoolean = true;
                                    }
                                    int iA = !TextUtils.isEmpty(strOptString) ? Cdo.a(strOptString) : Integer.MIN_VALUE;
                                    IAMapDelegate iAMapDelegate4 = this.b;
                                    if (iAMapDelegate4 != null && iAMapDelegate4.getGLMapEngine() != null) {
                                        if (this.m == null) {
                                            this.m = FileUtil.readFileContentsFromAssets(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME + File.separator + AMapEngineUtils.MAP_MAP_ASSETS_BACKGROUND_NAME);
                                        }
                                        byte[] bArr = this.m;
                                        if (bArr != null) {
                                            if (zOptBoolean) {
                                                boolean z = iA == Integer.MIN_VALUE;
                                                this.b.getGLMapEngine().setBackgroundTexture(this.i, er.a((byte[]) bArr.clone(), 0, iA, z));
                                            } else {
                                                iA = 0;
                                            }
                                            this.b.getGLMapEngine().setBackgroundTexture(this.i, er.a((byte[]) bArr.clone(), 0, iA, z));
                                        }
                                    }
                                    JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("traffic");
                                    if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("multiFillColors")) != null) {
                                        int iA2 = Cdo.a(jSONObjectOptJSONObject.optString("smooth"));
                                        int iA3 = Cdo.a(jSONObjectOptJSONObject.optString("slow"));
                                        int iA4 = Cdo.a(jSONObjectOptJSONObject.optString("congested"));
                                        int iA5 = Cdo.a(jSONObjectOptJSONObject.optString("seriousCongested"));
                                        this.C.setSmoothColor(iA2);
                                        this.C.setSlowColor(iA3);
                                        this.C.setCongestedColor(iA4);
                                        this.C.setSeriousCongestedColor(iA5);
                                    }
                                } catch (Throwable th) {
                                    hn.c(th, "AMapCustomStyleManager", "setExtraStyle");
                                    er.a(th);
                                }
                            }
                            this.t = true;
                        }
                    }
                    this.g = false;
                }
                if (this.h) {
                    a(mapConfig);
                    this.h = false;
                }
            }
        } catch (Throwable th2) {
            hn.c(th2, "AMapCustomStyleManager", "updateStyle");
            er.a(th2);
        }
    }

    public final void b() {
        if (this.c == null) {
            return;
        }
        synchronized (this) {
            IAMapDelegate iAMapDelegate = this.b;
            if (iAMapDelegate != null && iAMapDelegate.getMapConfig() != null && !this.b.getMapConfig().isProFunctionAuthEnable()) {
                this.c.setStyleId(null);
                this.w = null;
                this.x = null;
                this.y = null;
            }
            this.f = true;
            this.e = true;
            if (this.t) {
                this.g = true;
            }
            this.d = true;
            this.h = true;
        }
    }

    public final void c() {
        if (this.c == null) {
            this.c = new CustomMapStyleOptions();
        }
    }

    public final boolean d() {
        return this.c != null;
    }

    public final void e() {
        synchronized (this) {
            CustomMapStyleOptions customMapStyleOptions = this.c;
            if (customMapStyleOptions != null) {
                customMapStyleOptions.setEnable(false);
                g();
                this.d = true;
            }
        }
    }

    private static byte[] b(byte[] bArr) {
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
                    if (i >= 0) {
                        byteArrayOutputStream.write(bArr2, 0, i);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        GLFileUtil.closeQuietly(byteArrayOutputStream);
                        GLFileUtil.closeQuietly(byteArrayInputStream);
                        GLFileUtil.closeQuietly(gZIPInputStream);
                        return byteArray;
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    er.a(th);
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

    @Override // com.amap.api.mapcore.util.dh.a
    public final void b(byte[] bArr, int i) {
        MapConfig mapConfig;
        InterfaceC0102a interfaceC0102a;
        if (this.c != null) {
            synchronized (this) {
                IAMapDelegate iAMapDelegate = this.b;
                if (iAMapDelegate != null && (mapConfig = iAMapDelegate.getMapConfig()) != null && mapConfig.isProFunctionAuthEnable()) {
                    mapConfig.setUseProFunction(true);
                    if (i == 1) {
                        this.w = bArr;
                        this.e = true;
                    } else if (i == 0) {
                        this.x = bArr;
                        this.g = true;
                    } else if (i == 2) {
                        String str = this.c.getStyleId() + "_sdk_780.data";
                        String str2 = this.c.getStyleId() + "_abroad_sdk.json";
                        Map<String, byte[]> mapUncompressToByteWithKeys = FileUtil.uncompressToByteWithKeys(bArr, new String[]{str, str2});
                        if (mapUncompressToByteWithKeys != null) {
                            byte[] bArr2 = mapUncompressToByteWithKeys.get(str);
                            if (bArr2 != null) {
                                this.w = bArr2;
                                this.e = true;
                            }
                            if (mapUncompressToByteWithKeys.get(str2) != null && (interfaceC0102a = this.D) != null) {
                                interfaceC0102a.a();
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean a(byte[] bArr) {
        if (bArr == null) {
            return true;
        }
        try {
            if (bArr.length < 8) {
                return false;
            }
            if (((bArr[4] & 255) | ((bArr[7] << 24) & (-16777216)) | ((bArr[6] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr[5] << 8) & 65280)) != 2001) {
                return false;
            }
        } catch (Throwable th) {
            hn.c(th, "AMapCustomStyleManager", "checkData");
            er.a(th);
        }
        return true;
    }

    public final void a(CustomMapStyleOptions customMapStyleOptions) {
        IAMapDelegate iAMapDelegate;
        if (this.c == null || customMapStyleOptions == null) {
            return;
        }
        synchronized (this) {
            if (!this.p) {
                this.p = true;
                if (this.c.isEnable()) {
                    this.d = true;
                }
            }
            if (this.c.isEnable() != customMapStyleOptions.isEnable()) {
                this.c.setEnable(customMapStyleOptions.isEnable());
                this.d = true;
                ep.b(this.j, customMapStyleOptions.isEnable());
            }
            if (this.c.isEnable()) {
                if (!TextUtils.equals(this.c.getStyleId(), customMapStyleOptions.getStyleId())) {
                    this.c.setStyleId(customMapStyleOptions.getStyleId());
                    String styleId = this.c.getStyleId();
                    if (!TextUtils.isEmpty(styleId) && (iAMapDelegate = this.b) != null && iAMapDelegate.getMapConfig() != null && this.b.getMapConfig().isProFunctionAuthEnable()) {
                        if (this.u == null) {
                            if (this.A) {
                                this.u = new dh(this.j, this, 2, "abroad_sdk_json_sdk_780_zip");
                            } else {
                                this.u = new dh(this.j, this, 1, "sdk_780");
                            }
                        }
                        this.u.a(styleId);
                        eq.a().a(this.u);
                        if (this.v == null) {
                            this.v = new dh(this.j, this, 0, null);
                        }
                        this.v.a(styleId);
                        eq.a().a(this.v);
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
                ep.a(this.j, true);
            } else {
                g();
                ep.a(this.j, false);
            }
        }
    }

    @Override // com.amap.api.mapcore.util.dh.a
    public final void a(byte[] bArr, int i) {
        b(bArr, i);
    }

    private void a(MapConfig mapConfig) {
        byte[] bArr;
        if (!mapConfig.isProFunctionAuthEnable()) {
            this.B.clear();
            return;
        }
        String styleResDataPath = this.c.getStyleResDataPath();
        if (this.c.getStyleResData() == null && !TextUtils.isEmpty(styleResDataPath)) {
            this.c.setStyleResData(FileUtil.readFileContents(styleResDataPath));
        }
        if (this.c.getStyleResData() == null && this.y == null) {
            return;
        }
        byte[] styleResData = this.y;
        if (styleResData == null) {
            styleResData = this.c.getStyleResData();
        }
        if (styleResData != null) {
            mapConfig.setUseProFunction(true);
            this.B.clear();
            Map<String, byte[]> mapUncompressToByteWithKeys = FileUtil.uncompressToByteWithKeys(styleResData, null);
            if (mapUncompressToByteWithKeys != null) {
                for (String str : mapUncompressToByteWithKeys.keySet()) {
                    if (str != null && !str.contains("__MACOSX") && (bArr = mapUncompressToByteWithKeys.get(str)) != null) {
                        if (FileUtil.isGzip(bArr)) {
                            this.B.put(str, bArr);
                        } else {
                            this.B.put(str, FileUtil.compress(bArr));
                        }
                    }
                }
            }
        }
    }

    public final byte[] a(String str) {
        MapConfig mapConfig;
        if (str == null || (mapConfig = this.b.getMapConfig()) == null) {
            return null;
        }
        if (!mapConfig.isProFunctionAuthEnable()) {
            int iIndexOf = str.indexOf("99999_");
            if (iIndexOf != -1) {
                str = str.substring(0, iIndexOf).replace("99999_", "");
            }
            return FileUtil.readFileContentsFromAssetsByPreName(this.j, AMapEngineUtils.MAP_MAP_ASSETS_NAME, str);
        }
        for (String str2 : this.B.keySet()) {
            if (str.contains(str2)) {
                return this.B.get(str2);
            }
        }
        return null;
    }

    public final void a(InterfaceC0102a interfaceC0102a) {
        this.D = interfaceC0102a;
    }
}
