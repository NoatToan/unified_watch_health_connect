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
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import defpackage.e6t;
import defpackage.eht;
import defpackage.f7t;
import defpackage.gls;
import defpackage.gms;
import defpackage.gos;
import defpackage.jos;
import defpackage.k0t;
import defpackage.m2t;
import defpackage.nls;
import defpackage.o0t;
import defpackage.p0t;
import defpackage.pms;
import defpackage.q2t;
import defpackage.qls;
import defpackage.zns;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<IAMapDelegate> f6184b;

    public class a extends f7t {
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f6185k;

        public a(String str, String str2, boolean z, String str3, String str4, String str5, String str6) {
            this.d = str;
            this.e = str2;
            this.g = z;
            this.h = str3;
            this.i = str4;
            this.j = str5;
            this.f6185k = str6;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            if (!TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.e)) {
                boolean z = this.g;
                String str = AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME;
                String str2 = this.e;
                String str3 = this.d;
                String str4 = this.h;
                if (z) {
                    l1.d dVar = new l1.d(str2, str3, str4, str);
                    dVar.g("amap_web_logo", "md5_day");
                    Context context = k1.this.f6183a;
                    zns.t();
                    new l1(context, dVar).a();
                }
                WeakReference<IAMapDelegate> weakReference = k1.this.f6184b;
                if (weakReference != null && weakReference.get() != null) {
                    k1.this.f6184b.get().changeLogoIconStyle(str, z, 0);
                }
            }
            if (TextUtils.isEmpty(this.i) || TextUtils.isEmpty(this.j)) {
                return;
            }
            boolean z2 = this.g;
            String str5 = AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME;
            String str6 = this.j;
            String str7 = this.i;
            String str8 = this.f6185k;
            if (z2) {
                l1.d dVar2 = new l1.d(str6, str7, str8, str5);
                dVar2.g("amap_web_logo", "md5_night");
                Context context2 = k1.this.f6183a;
                zns.t();
                new l1(context2, dVar2).a();
            }
            WeakReference<IAMapDelegate> weakReference2 = k1.this.f6184b;
            if (weakReference2 == null || weakReference2.get() == null) {
                return;
            }
            k1.this.f6184b.get().changeLogoIconStyle(str5, z2, 1);
        }
    }

    public k1(Context context, IAMapDelegate iAMapDelegate) {
        this.f6184b = null;
        this.f6183a = context;
        this.f6184b = new WeakReference<>(iAMapDelegate);
    }

    public static void c(Context context, o0t o0tVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("16V");
            boolean zX = x0.x(jSONObjectOptJSONObject.optString("di", ""), false);
            String strOptString = jSONObjectOptJSONObject.optString(StepsInfo.KEY_DISTANCE, "");
            boolean zX2 = x0.x(jSONObjectOptJSONObject.optString("able", ""), false);
            boolean zX3 = x0.x(jSONObjectOptJSONObject.optString("isFilter", ""), true);
            if (!zX || p0t.A(strOptString)) {
                q2t.a(o0tVar).b(context, zX2, zX3);
            }
        } catch (Throwable unused) {
        }
    }

    public static void e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jos.j(jSONObject.optJSONObject("17E"));
        } catch (Throwable unused) {
        }
    }

    public static void h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("16G");
            boolean zX = x0.x(jSONObjectOptJSONObject.optString("able", ""), false);
            boolean zX2 = x0.x(jSONObjectOptJSONObject.optString("removeCache", ""), false);
            boolean zX3 = x0.x(jSONObjectOptJSONObject.optString("uploadInfo", ""), false);
            qls.a(zX);
            qls.d(zX2);
            qls.f(zX3);
        } catch (Throwable unused) {
        }
    }

    public final Pair<JSONObject, x0.c.a> b(StringBuilder sb) {
        String string;
        JSONObject jSONObject;
        x0.c.a aVar;
        WeakReference<IAMapDelegate> weakReference;
        try {
            long jLongValue = nls.a(this.f6183a, "cloud_config_pull", "cloud_config_pull_timestamp", 0L).longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - jLongValue) >= 86400000) {
                string = sb.toString();
                string.replaceAll(";;", ";");
                nls.c(this.f6183a, "cloud_config_pull", "cloud_config_pull_timestamp", new Long(jCurrentTimeMillis));
            } else {
                string = "";
            }
            x0.c cVarC = x0.c(this.f6183a, zns.t(), string, null);
            if (x0.f6303a != 1 && string != "" && cVarC != null && (weakReference = this.f6184b) != null && weakReference.get() != null) {
                Message messageObtainMessage = this.f6184b.get().getMainHandler().obtainMessage();
                messageObtainMessage.what = 2;
                String str = cVarC.c;
                if (str != null) {
                    messageObtainMessage.obj = str;
                }
                this.f6184b.get().getMainHandler().sendMessage(messageObtainMessage);
            }
            String str2 = GLFileUtil.getCacheDir(this.f6183a).getAbsolutePath() + "/authCustomConfigName";
            if (TextUtils.isEmpty(string) || cVarC == null || (jSONObject = cVarC.f) == null) {
                jSONObject = new JSONObject(new String(GLFileUtil.readFileContents(str2)));
            } else {
                GLFileUtil.writeDatasToFile(str2, jSONObject.toString().getBytes());
            }
            String str3 = GLFileUtil.getCacheDir(this.f6183a).getAbsolutePath() + "/authLogConfigName";
            if (TextUtils.isEmpty(string) || cVarC == null || cVarC.g == null) {
                byte[] fileContents = GLFileUtil.readFileContents(str3);
                x0.c.a aVar2 = new x0.c.a();
                JSONObject jSONObject2 = new JSONObject(new String(fileContents));
                aVar2.f6309a = jSONObject2.getBoolean("IsExceptionUpdate");
                if (jSONObject2.has("mOfflineLoc")) {
                    aVar2.c = jSONObject2.getJSONObject("mOfflineLoc");
                }
                aVar = aVar2;
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("IsExceptionUpdate", cVarC.g.f6309a);
                jSONObject3.put("mOfflineLoc", cVarC.g.c);
                GLFileUtil.writeDatasToFile(str3, jSONObject3.toString().getBytes());
                aVar = cVarC.g;
            }
            return new Pair<>(jSONObject, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void d(x0.c.a aVar) {
        if (aVar != null) {
            try {
                gms.a(this.f6183a, "maploc", "ue", Boolean.valueOf(aVar.f6309a));
                JSONObject jSONObject = aVar.c;
                int iOptInt = jSONObject.optInt("fn", 1000);
                int iOptInt2 = jSONObject.optInt("mpn", 0);
                if (iOptInt2 > 500) {
                    iOptInt2 = 500;
                }
                if (iOptInt2 < 30) {
                    iOptInt2 = 30;
                }
                e6t.b(iOptInt, x0.x(jSONObject.optString("igu"), false));
                gms.a(this.f6183a, "maploc", "opn", Integer.valueOf(iOptInt2));
            } catch (Throwable th) {
                m2t.r(th, "AuthUtil", "loadConfigDataUploadException");
            }
        }
    }

    public final void f(JSONObject jSONObject) {
        IAMapDelegate iAMapDelegate;
        IAMapDelegate iAMapDelegate2;
        IAMapDelegate iAMapDelegate3;
        if (jSONObject == null) {
            return;
        }
        try {
            eht.a().b(jSONObject.optJSONObject("1A1"));
            if (!eht.a().c("feature_terrain") && MapsInitializer.isTerrainEnable() && (iAMapDelegate3 = this.f6184b.get()) != null) {
                iAMapDelegate3.setTerrainAuth(false);
                zns.E(new AMapException(AMapException.FEATURE_TERRAIN_NOT_SUPPORT));
            }
            if (!eht.a().c("feature_gltf") && (iAMapDelegate2 = this.f6184b.get()) != null && iAMapDelegate2.isUseGLTF()) {
                IGlOverlayLayer glOverlayLayer = iAMapDelegate2.getGlOverlayLayer();
                if (glOverlayLayer != null) {
                    glOverlayLayer.clearOverlayByType("GLTFOVERLAY");
                }
                zns.E(new AMapException(AMapException.FEATURE_GLTF_NOT_SUPPORT));
            }
            if (eht.a().c("feature_mvt") || (iAMapDelegate = this.f6184b.get()) == null || !iAMapDelegate.isUseMVT()) {
                return;
            }
            IGlOverlayLayer glOverlayLayer2 = iAMapDelegate.getGlOverlayLayer();
            if (glOverlayLayer2 != null) {
                glOverlayLayer2.clearOverlayByType("MVTTILEOVERLAY");
            }
            zns.E(new AMapException(AMapException.FEATURE_MVT_NOT_SUPPORT));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void g(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("1A2")) == null) {
            return;
        }
        boolean zX = x0.x(jSONObjectOptJSONObject.optString("optrecord"), false);
        IAMapDelegate iAMapDelegate = this.f6184b.get();
        if (iAMapDelegate != null) {
            iAMapDelegate.setMapOptRecordState(zX);
        }
    }

    public final void i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            nls.c(this.f6183a, "amap_param", "overlay_use_old_type", Boolean.valueOf(!x0.x(jSONObject.optJSONObject("17W").optString("able", ""), false)));
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        super.interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        JSONObject jSONObjectOptJSONObject;
        WeakReference<IAMapDelegate> weakReference;
        WeakReference<IAMapDelegate> weakReference2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        JSONObject jSONObjectOptJSONObject2;
        Object obj7;
        JSONObject jSONObjectOptJSONObject3;
        Object obj8;
        o0t o0tVarT;
        Object obj9;
        JSONObject jSONObjectOptJSONObject4;
        try {
            if (MapsInitializer.getNetWorkEnable()) {
                k0t.a().c(this.f6183a);
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
                    WeakReference<IAMapDelegate> weakReference3 = this.f6184b;
                    if (weakReference3 != null && weakReference3.get() != null) {
                        IAMapDelegate iAMapDelegate = this.f6184b.get();
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
                Pair<JSONObject, x0.c.a> pairB = b(sb);
                if (pairB != null && (obj9 = pairB.first) != null && (jSONObjectOptJSONObject4 = ((JSONObject) obj9).optJSONObject("154")) != null && x0.x(jSONObjectOptJSONObject4.getString("able"), true)) {
                    String strOptString = jSONObjectOptJSONObject4.optString("mc");
                    String strOptString2 = jSONObjectOptJSONObject4.optString("si");
                    String strOptString3 = jSONObjectOptJSONObject4.optString("te");
                    if (!TextUtils.isEmpty(strOptString)) {
                        nls.c(this.f6183a, "approval_number", "mc", strOptString);
                    }
                    if (!TextUtils.isEmpty(strOptString2)) {
                        nls.c(this.f6183a, "approval_number", "si", strOptString2);
                    }
                    if (!TextUtils.isEmpty(strOptString3)) {
                        nls.c(this.f6183a, "approval_number", "te", strOptString3);
                    }
                }
                if (pairB != null && pairB.second != null && (o0tVarT = zns.t()) != null) {
                    o0tVarT.c(((x0.c.a) pairB.second).f6309a);
                }
                if (pairB != null) {
                    d((x0.c.a) pairB.second);
                }
                if (pairB != null) {
                    try {
                        Object obj10 = pairB.first;
                        if (obj10 != null && (jSONObjectOptJSONObject = ((JSONObject) obj10).optJSONObject("14M")) != null && jSONObjectOptJSONObject.has("able") && x0.x(jSONObjectOptJSONObject.getString("able"), true)) {
                            if (System.currentTimeMillis() - nls.a(this.f6183a, "Map3DCache", "time", 0L).longValue() > (jSONObjectOptJSONObject.has("time") ? Math.max(60, jSONObjectOptJSONObject.getInt("time")) : 2592000) * 1000 && (weakReference = this.f6184b) != null && weakReference.get() != null) {
                                this.f6184b.get().clearTileCache();
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                if (pairB != null && (obj8 = pairB.first) != null) {
                    try {
                        JSONObject jSONObjectOptJSONObject5 = ((JSONObject) obj8).optJSONObject("14L");
                        if (jSONObjectOptJSONObject5 != null && jSONObjectOptJSONObject5.has("able")) {
                            boolean zX = x0.x(jSONObjectOptJSONObject5.getString("able"), false);
                            WeakReference<IAMapDelegate> weakReference4 = this.f6184b;
                            if (weakReference4 != null && weakReference4.get() != null) {
                                this.f6184b.get().setHideLogoEnble(!zX);
                            }
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                if (pairB != null && (obj7 = pairB.first) != null && (jSONObjectOptJSONObject3 = ((JSONObject) obj7).optJSONObject("156")) != null) {
                    gls.e(x0.x(jSONObjectOptJSONObject3.optString("able"), false));
                }
                if (pairB != null && pairB.first != null) {
                    c(this.f6183a, zns.t(), (JSONObject) pairB.first);
                }
                if (pairB != null && (obj6 = pairB.first) != null && (jSONObjectOptJSONObject2 = ((JSONObject) obj6).optJSONObject("15C")) != null) {
                    boolean zX2 = x0.x(jSONObjectOptJSONObject2.optString("able"), false);
                    pms.a().b(new a(jSONObjectOptJSONObject2.optString("logo_day_md5"), jSONObjectOptJSONObject2.optString("logo_day_url"), zX2, jSONObjectOptJSONObject2.optString("logo_day_ipv6_url"), jSONObjectOptJSONObject2.optString("logo_night_md5"), jSONObjectOptJSONObject2.optString("logo_night_url"), jSONObjectOptJSONObject2.optString("logo_night_ipv6_url")));
                }
                if (pairB != null) {
                    try {
                        if (pairB.first != null && (weakReference2 = this.f6184b) != null && weakReference2.get() != null) {
                            IAMapDelegate iAMapDelegate2 = this.f6184b.get();
                            if (iAMapDelegate2.getAMapExtraInterfaceManager() != null) {
                                iAMapDelegate2.getAMapExtraInterfaceManager().h();
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (pairB != null && (obj5 = pairB.first) != null) {
                    h((JSONObject) obj5);
                }
                if (pairB != null && (obj4 = pairB.first) != null) {
                    i((JSONObject) obj4);
                }
                if (pairB != null && (obj3 = pairB.first) != null) {
                    e((JSONObject) obj3);
                }
                if (pairB != null && (obj2 = pairB.first) != null) {
                    f((JSONObject) obj2);
                }
                if (pairB != null && (obj = pairB.first) != null) {
                    g((JSONObject) obj);
                }
                m2t.g(this.f6183a, zns.t());
                interrupt();
                WeakReference<IAMapDelegate> weakReference5 = this.f6184b;
                if (weakReference5 == null || weakReference5.get() == null) {
                    return;
                }
                this.f6184b.get().setRunLowFrame(false);
            }
        } catch (Throwable th3) {
            interrupt();
            m2t.r(th3, "AMapDelegateImpGLSurfaceView", "mVerfy");
            th3.printStackTrace();
            jos.l(gos.e, "auth exception " + th3.getMessage());
        }
    }
}
