package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.tools.GLFileUtil;
import com.autonavi.extra.b;
import com.huawei.hms.network.embedded.w9;
import com.tencent.mmkv.MMKV;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WeakReference<IAMapDelegate> f3293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f3294b;

    public v(Context context, IAMapDelegate iAMapDelegate) {
        this.f3293a = null;
        this.f3294b = context;
        this.f3293a = new WeakReference<>(iAMapDelegate);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        JSONObject jSONObjectOptJSONObject;
        WeakReference<IAMapDelegate> weakReference;
        WeakReference<IAMapDelegate> weakReference2;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        ix ixVarA;
        JSONObject jSONObjectOptJSONObject4;
        try {
            if (MapsInitializer.getNetWorkEnable()) {
                ir.a().a(this.f3294b);
                StringBuilder sb = new StringBuilder();
                sb.append("14S");
                sb.append(";");
                sb.append("11K");
                sb.append(";");
                sb.append("001");
                sb.append(";");
                sb.append("14M");
                sb.append(";");
                sb.append("14L");
                sb.append(";");
                sb.append("16V");
                sb.append(";");
                sb.append("14Z");
                sb.append(";");
                sb.append("154");
                sb.append(";");
                sb.append("156");
                sb.append(";");
                sb.append("15C");
                sb.append(";");
                sb.append("16G");
                sb.append(";");
                sb.append("17W");
                sb.append(";");
                sb.append("17E");
                sb.append(";");
                sb.append("1A1");
                sb.append(";");
                sb.append("1A2");
                try {
                    WeakReference<IAMapDelegate> weakReference3 = this.f3293a;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        IAMapDelegate iAMapDelegate = this.f3293a.get();
                        if (iAMapDelegate.getAMapExtraInterfaceManager() != null) {
                            String strG = iAMapDelegate.getAMapExtraInterfaceManager().g();
                            if (!TextUtils.isEmpty(strG)) {
                                if (strG.indexOf(";") == 0) {
                                    sb.append(strG);
                                } else {
                                    sb.append(";");
                                    sb.append(strG);
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
                Pair<JSONObject, im.b.a> pairA = a(sb);
                if (pairA != null && pairA.first != null && (jSONObjectOptJSONObject4 = ((JSONObject) pairA.first).optJSONObject("154")) != null && im.a(jSONObjectOptJSONObject4.getString("able"), true)) {
                    String strOptString = jSONObjectOptJSONObject4.optString("mc");
                    String strOptString2 = jSONObjectOptJSONObject4.optString("si");
                    String strOptString3 = jSONObjectOptJSONObject4.optString(w9.m);
                    if (!TextUtils.isEmpty(strOptString)) {
                        dr.a(this.f3294b, "approval_number", "mc", (Object) strOptString);
                    }
                    if (!TextUtils.isEmpty(strOptString2)) {
                        dr.a(this.f3294b, "approval_number", "si", (Object) strOptString2);
                    }
                    if (!TextUtils.isEmpty(strOptString3)) {
                        dr.a(this.f3294b, "approval_number", w9.m, (Object) strOptString3);
                    }
                }
                if (pairA != null && pairA.second != null && (ixVarA = eb.a()) != null) {
                    ixVarA.a(((im.b.a) pairA.second).f2777a);
                }
                if (pairA != null) {
                    a((im.b.a) pairA.second);
                }
                if (pairA != null) {
                    try {
                        if (pairA.first != null && (jSONObjectOptJSONObject = ((JSONObject) pairA.first).optJSONObject("14M")) != null && jSONObjectOptJSONObject.has("able") && im.a(jSONObjectOptJSONObject.getString("able"), true)) {
                            if (System.currentTimeMillis() - dr.a(this.f3294b, "Map3DCache", "time", (Long) 0L).longValue() > (jSONObjectOptJSONObject.has("time") ? Math.max(60, jSONObjectOptJSONObject.getInt("time")) : MMKV.ExpireInMonth) * 1000 && (weakReference = this.f3293a) != null && weakReference.get() != null) {
                                this.f3293a.get().clearTileCache();
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                if (pairA != null && pairA.first != null) {
                    try {
                        JSONObject jSONObjectOptJSONObject5 = ((JSONObject) pairA.first).optJSONObject("14L");
                        if (jSONObjectOptJSONObject5 != null && jSONObjectOptJSONObject5.has("able")) {
                            boolean zA = im.a(jSONObjectOptJSONObject5.getString("able"), false);
                            WeakReference<IAMapDelegate> weakReference4 = this.f3293a;
                            if (weakReference4 != null && weakReference4.get() != null) {
                                this.f3293a.get().setHideLogoEnble(!zA);
                            }
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                if (pairA != null && pairA.first != null && (jSONObjectOptJSONObject3 = ((JSONObject) pairA.first).optJSONObject("156")) != null) {
                    dp.a(im.a(jSONObjectOptJSONObject3.optString("able"), false));
                }
                if (pairA != null && pairA.first != null) {
                    a(this.f3294b, eb.a(), (JSONObject) pairA.first);
                }
                if (pairA != null && pairA.first != null && (jSONObjectOptJSONObject2 = ((JSONObject) pairA.first).optJSONObject("15C")) != null) {
                    final boolean zA2 = im.a(jSONObjectOptJSONObject2.optString("able"), false);
                    final String strOptString4 = jSONObjectOptJSONObject2.optString("logo_day_url");
                    final String strOptString5 = jSONObjectOptJSONObject2.optString("logo_day_md5");
                    final String strOptString6 = jSONObjectOptJSONObject2.optString("logo_night_url");
                    final String strOptString7 = jSONObjectOptJSONObject2.optString("logo_night_md5");
                    final String strOptString8 = jSONObjectOptJSONObject2.optString("logo_day_ipv6_url");
                    final String strOptString9 = jSONObjectOptJSONObject2.optString("logo_night_ipv6_url");
                    dz.a().a(new mb() { // from class: com.amap.api.col.3sl.v.1
                        @Override // com.amap.api.col.p0003sl.mb
                        public final void runTask() {
                            if (!TextUtils.isEmpty(strOptString5) && !TextUtils.isEmpty(strOptString4)) {
                                boolean z = zA2;
                                String str = AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME;
                                String str2 = strOptString4;
                                String str3 = strOptString5;
                                String str4 = strOptString8;
                                if (z) {
                                    w.d dVar = new w.d(str2, str3, str4, str);
                                    dVar.a("amap_web_logo", "md5_day");
                                    Context context = v.this.f3294b;
                                    eb.a();
                                    new w(context, dVar).a();
                                }
                                if (v.this.f3293a != null && v.this.f3293a.get() != null) {
                                    v.this.f3293a.get().changeLogoIconStyle(str, z, 0);
                                }
                            }
                            if (TextUtils.isEmpty(strOptString7) || TextUtils.isEmpty(strOptString6)) {
                                return;
                            }
                            boolean z2 = zA2;
                            String str5 = AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME;
                            String str6 = strOptString6;
                            String str7 = strOptString7;
                            String str8 = strOptString9;
                            if (z2) {
                                w.d dVar2 = new w.d(str6, str7, str8, str5);
                                dVar2.a("amap_web_logo", "md5_night");
                                Context context2 = v.this.f3294b;
                                eb.a();
                                new w(context2, dVar2).a();
                            }
                            if (v.this.f3293a == null || v.this.f3293a.get() == null) {
                                return;
                            }
                            v.this.f3293a.get().changeLogoIconStyle(str5, z2, 1);
                        }
                    });
                }
                if (pairA != null) {
                    try {
                        if (pairA.first != null && (weakReference2 = this.f3293a) != null && weakReference2.get() != null) {
                            IAMapDelegate iAMapDelegate2 = this.f3293a.get();
                            if (iAMapDelegate2.getAMapExtraInterfaceManager() != null) {
                                b aMapExtraInterfaceManager = iAMapDelegate2.getAMapExtraInterfaceManager();
                                Object obj = pairA.first;
                                aMapExtraInterfaceManager.h();
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (pairA != null && pairA.first != null) {
                    d((JSONObject) pairA.first);
                }
                if (pairA != null && pairA.first != null) {
                    e((JSONObject) pairA.first);
                }
                if (pairA != null && pairA.first != null) {
                    a((JSONObject) pairA.first);
                }
                if (pairA != null && pairA.first != null) {
                    b((JSONObject) pairA.first);
                }
                if (pairA != null && pairA.first != null) {
                    c((JSONObject) pairA.first);
                }
                jv.a(this.f3294b, eb.a());
                interrupt();
                WeakReference<IAMapDelegate> weakReference5 = this.f3293a;
                if (weakReference5 == null || weakReference5.get() == null) {
                    return;
                }
                this.f3293a.get().setRunLowFrame(false);
            }
        } catch (Throwable th3) {
            interrupt();
            jv.c(th3, "AMapDelegateImpGLSurfaceView", "mVerfy");
            th3.printStackTrace();
            ee.b(ed.e, "auth exception " + th3.getMessage());
        }
    }

    private static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            ee.a(jSONObject.optJSONObject("17E"));
        } catch (Throwable unused) {
        }
    }

    private void b(JSONObject jSONObject) {
        IAMapDelegate iAMapDelegate;
        IAMapDelegate iAMapDelegate2;
        IAMapDelegate iAMapDelegate3;
        if (jSONObject == null) {
            return;
        }
        try {
            z.a().a(jSONObject.optJSONObject("1A1"));
            if (!z.a().a("feature_terrain") && MapsInitializer.isTerrainEnable() && (iAMapDelegate3 = this.f3293a.get()) != null) {
                iAMapDelegate3.setTerrainAuth(false);
                eb.a(new AMapException(AMapException.FEATURE_TERRAIN_NOT_SUPPORT));
            }
            if (!z.a().a("feature_gltf") && (iAMapDelegate2 = this.f3293a.get()) != null && iAMapDelegate2.isUseGLTF()) {
                IGlOverlayLayer glOverlayLayer = iAMapDelegate2.getGlOverlayLayer();
                if (glOverlayLayer != null) {
                    glOverlayLayer.clearOverlayByType("GLTFOVERLAY");
                }
                eb.a(new AMapException(AMapException.FEATURE_GLTF_NOT_SUPPORT));
            }
            if (z.a().a("feature_mvt") || (iAMapDelegate = this.f3293a.get()) == null || !iAMapDelegate.isUseMVT()) {
                return;
            }
            IGlOverlayLayer glOverlayLayer2 = iAMapDelegate.getGlOverlayLayer();
            if (glOverlayLayer2 != null) {
                glOverlayLayer2.clearOverlayByType("MVTTILEOVERLAY");
            }
            eb.a(new AMapException(AMapException.FEATURE_MVT_NOT_SUPPORT));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("1A2")) == null) {
            return;
        }
        boolean zA = im.a(jSONObjectOptJSONObject.optString("optrecord"), false);
        IAMapDelegate iAMapDelegate = this.f3293a.get();
        if (iAMapDelegate != null) {
            iAMapDelegate.setMapOptRecordState(zA);
        }
    }

    private static void d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("16G");
            boolean zA = im.a(jSONObjectOptJSONObject.optString("able", ""), false);
            boolean zA2 = im.a(jSONObjectOptJSONObject.optString("removeCache", ""), false);
            boolean zA3 = im.a(jSONObjectOptJSONObject.optString("uploadInfo", ""), false);
            ds.a(zA);
            ds.b(zA2);
            ds.c(zA3);
        } catch (Throwable unused) {
        }
    }

    private static void a(Context context, ix ixVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("16V");
            boolean zA = im.a(jSONObjectOptJSONObject.optString("di", ""), false);
            String strOptString = jSONObjectOptJSONObject.optString("dis", "");
            boolean zA2 = im.a(jSONObjectOptJSONObject.optString("able", ""), false);
            boolean zA3 = im.a(jSONObjectOptJSONObject.optString("isFilter", ""), true);
            if (!zA || iy.e(strOptString)) {
                jx.a(ixVar).a(context, zA2, zA3);
            }
        } catch (Throwable unused) {
        }
    }

    private void e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            dr.a(this.f3294b, "amap_param", "overlay_use_old_type", Boolean.valueOf(!im.a(jSONObject.optJSONObject("17W").optString("able", ""), false)));
        } catch (Throwable unused) {
        }
    }

    private void a(im.b.a aVar) {
        if (aVar != null) {
            try {
                dx.a(this.f3294b, "maploc", "ue", Boolean.valueOf(aVar.f2777a));
                JSONObject jSONObject = aVar.f2779c;
                int iOptInt = jSONObject.optInt("fn", 1000);
                int iOptInt2 = jSONObject.optInt("mpn", 0);
                if (iOptInt2 > 500) {
                    iOptInt2 = 500;
                }
                if (iOptInt2 < 30) {
                    iOptInt2 = 30;
                }
                lh.a(iOptInt, im.a(jSONObject.optString("igu"), false));
                dx.a(this.f3294b, "maploc", "opn", Integer.valueOf(iOptInt2));
            } catch (Throwable th) {
                jv.c(th, "AuthUtil", "loadConfigDataUploadException");
            }
        }
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        super.interrupt();
    }

    private Pair<JSONObject, im.b.a> a(StringBuilder sb) {
        String string;
        JSONObject jSONObject;
        im.b.a aVar;
        WeakReference<IAMapDelegate> weakReference;
        try {
            long jLongValue = dr.a(this.f3294b, "cloud_config_pull", "cloud_config_pull_timestamp", (Long) 0L).longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - jLongValue) >= 86400000) {
                string = sb.toString();
                string.replaceAll(";;", ";");
                dr.a(this.f3294b, "cloud_config_pull", "cloud_config_pull_timestamp", (Object) new Long(jCurrentTimeMillis));
            } else {
                string = "";
            }
            im.b bVarA = im.a(this.f3294b, eb.a(), string, (Map<String, String>) null);
            if (im.f2768a != 1 && string != "" && bVarA != null && (weakReference = this.f3293a) != null && weakReference.get() != null) {
                Message messageObtainMessage = this.f3293a.get().getMainHandler().obtainMessage();
                messageObtainMessage.what = 2;
                if (bVarA.f2776c != null) {
                    messageObtainMessage.obj = bVarA.f2776c;
                }
                this.f3293a.get().getMainHandler().sendMessage(messageObtainMessage);
            }
            String str = GLFileUtil.getCacheDir(this.f3294b).getAbsolutePath() + "/authCustomConfigName";
            if (!TextUtils.isEmpty(string) && bVarA != null && bVarA.f != null) {
                jSONObject = bVarA.f;
                GLFileUtil.writeDatasToFile(str, bVarA.f.toString().getBytes());
            } else {
                jSONObject = new JSONObject(new String(GLFileUtil.readFileContents(str)));
            }
            String str2 = GLFileUtil.getCacheDir(this.f3294b).getAbsolutePath() + "/authLogConfigName";
            if (!TextUtils.isEmpty(string) && bVarA != null && bVarA.g != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("IsExceptionUpdate", bVarA.g.f2777a);
                jSONObject2.put("mOfflineLoc", bVarA.g.f2779c);
                GLFileUtil.writeDatasToFile(str2, jSONObject2.toString().getBytes());
                aVar = bVarA.g;
            } else {
                byte[] fileContents = GLFileUtil.readFileContents(str2);
                im.b.a aVar2 = new im.b.a();
                JSONObject jSONObject3 = new JSONObject(new String(fileContents));
                aVar2.f2777a = jSONObject3.getBoolean("IsExceptionUpdate");
                if (jSONObject3.has("mOfflineLoc")) {
                    aVar2.f2779c = jSONObject3.getJSONObject("mOfflineLoc");
                }
                aVar = aVar2;
            }
            return new Pair<>(jSONObject, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }
}
