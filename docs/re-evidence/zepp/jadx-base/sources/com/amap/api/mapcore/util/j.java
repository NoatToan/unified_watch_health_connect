package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.tools.GLFileUtil;
import com.facebook.appevents.UserDataStore;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends Thread {
    public WeakReference<IAMapDelegate> a;
    private Context b;

    public j(Context context, IAMapDelegate iAMapDelegate) {
        this.a = null;
        this.b = context;
        this.a = new WeakReference<>(iAMapDelegate);
    }

    @Override // java.lang.Thread
    public final void interrupt() {
        super.interrupt();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x027d  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e9 A[Catch: all -> 0x02f1, TRY_LEAVE, TryCatch #0 {all -> 0x02f1, blocks: (B:130:0x02cd, B:132:0x02d1, B:134:0x02d5, B:136:0x02db, B:138:0x02e9), top: B:181:0x02cd }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0349  */
    /* JADX WARN: Code duplicated, block: B:158:0x034b  */
    /* JADX WARN: Code duplicated, block: B:181:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0198 A[Catch: all -> 0x01d7, TryCatch #5 {all -> 0x01d7, blocks: (B:58:0x0170, B:60:0x0174, B:62:0x017c, B:64:0x0182, B:66:0x018d, B:68:0x0198, B:69:0x01a2, B:71:0x01c1, B:73:0x01c5, B:75:0x01cb), top: B:191:0x0170, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x020b  */
    /* JADX WARN: Code duplicated, block: B:93:0x020d  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        Object obj;
        JSONObject jSONObjectOptJSONObject;
        WeakReference<IAMapDelegate> weakReference;
        WeakReference<IAMapDelegate> weakReference2;
        IAMapDelegate iAMapDelegate;
        WeakReference<IAMapDelegate> weakReference3;
        Object obj2;
        JSONObject jSONObject;
        Object obj3;
        JSONObject jSONObject2;
        boolean zA;
        boolean z;
        Object obj4;
        JSONObject jSONObject3;
        Object obj5;
        JSONObject jSONObjectOptJSONObject2;
        Object obj6;
        JSONObject jSONObjectOptJSONObject3;
        Object obj7;
        JSONObject jSONObjectOptJSONObject4;
        boolean zA2;
        WeakReference<IAMapDelegate> weakReference4;
        boolean z2;
        gk.a.C0107a c0107a;
        int iOptInt;
        gt gtVarF;
        Object obj8;
        JSONObject jSONObjectOptJSONObject5;
        try {
            if (MapsInitializer.getNetWorkEnable()) {
                gp.a().a(this.b);
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
                try {
                    WeakReference<IAMapDelegate> weakReference5 = this.a;
                    if (weakReference5 != null && weakReference5.get() != null) {
                        IAMapDelegate iAMapDelegate2 = this.a.get();
                        if (iAMapDelegate2.getAMapExtraInterfaceManager() != null) {
                            String strG = iAMapDelegate2.getAMapExtraInterfaceManager().g();
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
                Pair<JSONObject, gk.a.C0107a> pairA = a(sb);
                if (pairA != null && (obj8 = pairA.first) != null && (jSONObjectOptJSONObject5 = ((JSONObject) obj8).optJSONObject("154")) != null) {
                    str = "17E";
                    if (gk.a(jSONObjectOptJSONObject5.getString("able"), true)) {
                        String strOptString = jSONObjectOptJSONObject5.optString("mc");
                        String strOptString2 = jSONObjectOptJSONObject5.optString("si");
                        str2 = "17W";
                        if (!TextUtils.isEmpty(strOptString)) {
                            eh.a(this.b, "approval_number", "mc", (Object) strOptString);
                        }
                        if (!TextUtils.isEmpty(strOptString2)) {
                            eh.a(this.b, "approval_number", "si", (Object) strOptString2);
                        }
                    }
                    if (pairA != null && pairA.second != null && (gtVarF = er.f()) != null) {
                        gtVarF.a(((gk.a.C0107a) pairA.second).a);
                    }
                    if (pairA != null && (c0107a = (gk.a.C0107a) pairA.second) != null) {
                        try {
                            eo.a(this.b, "maploc", "ue", Boolean.valueOf(c0107a.a));
                            JSONObject jSONObject4 = c0107a.c;
                            int iOptInt2 = jSONObject4.optInt(UserDataStore.FIRST_NAME, 1000);
                            iOptInt = jSONObject4.optInt("mpn", 0);
                            if (iOptInt > 500) {
                                iOptInt = 500;
                            }
                            if (iOptInt < 30) {
                                iOptInt = 30;
                            }
                            iy.a(iOptInt2, gk.a(jSONObject4.optString("igu"), false));
                            eo.a(this.b, "maploc", "opn", Integer.valueOf(iOptInt));
                        } catch (Throwable th) {
                            hn.c(th, "AuthUtil", "loadConfigDataUploadException");
                        }
                    }
                    if (pairA != null) {
                        try {
                            obj = pairA.first;
                            if (obj != null && (jSONObjectOptJSONObject = ((JSONObject) obj).optJSONObject("14M")) != null && jSONObjectOptJSONObject.has("able") && gk.a(jSONObjectOptJSONObject.getString("able"), true)) {
                                if (System.currentTimeMillis() - eh.a(this.b, "Map3DCache", "time", (Long) 0L).longValue() > (jSONObjectOptJSONObject.has("time") ? Math.max(60, jSONObjectOptJSONObject.getInt("time")) : 2592000) * 1000 && (weakReference = this.a) != null && weakReference.get() != null) {
                                    this.a.get().clearTileCache();
                                }
                            }
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    if (pairA != null && (obj7 = pairA.first) != null) {
                        try {
                            jSONObjectOptJSONObject4 = ((JSONObject) obj7).optJSONObject("14L");
                            if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("able")) {
                                zA2 = gk.a(jSONObjectOptJSONObject4.getString("able"), false);
                                weakReference4 = this.a;
                                if (weakReference4 != null && weakReference4.get() != null) {
                                    IAMapDelegate iAMapDelegate3 = this.a.get();
                                    if (zA2) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    iAMapDelegate3.setHideLogoEnble(z2);
                                }
                            }
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                    if (pairA != null && (obj6 = pairA.first) != null && (jSONObjectOptJSONObject3 = ((JSONObject) obj6).optJSONObject("156")) != null) {
                        eb.a(gk.a(jSONObjectOptJSONObject3.optString("able"), false));
                    }
                    if (pairA == null && pairA.first != null) {
                        Context context = this.b;
                        gt gtVarF2 = er.f();
                        JSONObject jSONObject5 = (JSONObject) pairA.first;
                        if (jSONObject5 != null) {
                            try {
                                JSONObject jSONObjectOptJSONObject6 = jSONObject5.optJSONObject("16V");
                                boolean zA3 = gk.a(jSONObjectOptJSONObject6.optString("di", ""), false);
                                String strOptString3 = jSONObjectOptJSONObject6.optString("dis", "");
                                boolean zA4 = gk.a(jSONObjectOptJSONObject6.optString("able", ""), false);
                                try {
                                    boolean zA5 = gk.a(jSONObjectOptJSONObject6.optString("isFilter", ""), true);
                                    if (!zA3 || gu.f(strOptString3)) {
                                        hv.a(gtVarF2).a(context, zA4, zA5);
                                    }
                                } catch (Throwable unused2) {
                                }
                            } catch (Throwable unused3) {
                            }
                        }
                    }
                    if (pairA == null && (obj5 = pairA.first) != null && (jSONObjectOptJSONObject2 = ((JSONObject) obj5).optJSONObject("15C")) != null) {
                        final boolean zA6 = gk.a(jSONObjectOptJSONObject2.optString("able"), false);
                        final String strOptString4 = jSONObjectOptJSONObject2.optString("logo_day_url");
                        final String strOptString5 = jSONObjectOptJSONObject2.optString("logo_day_md5");
                        final String strOptString6 = jSONObjectOptJSONObject2.optString("logo_night_url");
                        final String strOptString7 = jSONObjectOptJSONObject2.optString("logo_night_md5");
                        final String strOptString8 = jSONObjectOptJSONObject2.optString("logo_day_ipv6_url");
                        final String strOptString9 = jSONObjectOptJSONObject2.optString("logo_night_ipv6_url");
                        eq.a().a(new Runnable() { // from class: com.amap.api.mapcore.util.j.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (!TextUtils.isEmpty(strOptString5) && !TextUtils.isEmpty(strOptString4)) {
                                    boolean z3 = zA6;
                                    String str3 = AMapEngineUtils.LOGO_CUSTOM_ICON_DAY_NAME;
                                    String str4 = strOptString4;
                                    String str5 = strOptString5;
                                    String str6 = strOptString8;
                                    if (z3) {
                                        k.d dVar = new k.d(str4, str5, str6, str3);
                                        dVar.a("amap_web_logo", "md5_day");
                                        Context context2 = j.this.b;
                                        er.f();
                                        new k(context2, dVar).a();
                                    }
                                    WeakReference<IAMapDelegate> weakReference6 = j.this.a;
                                    if (weakReference6 != null && weakReference6.get() != null) {
                                        j.this.a.get().changeLogoIconStyle(str3, z3, 0);
                                    }
                                }
                                if (TextUtils.isEmpty(strOptString7) || TextUtils.isEmpty(strOptString6)) {
                                    return;
                                }
                                boolean z4 = zA6;
                                String str7 = AMapEngineUtils.LOGO_CUSTOM_ICON_NIGHT_NAME;
                                String str8 = strOptString6;
                                String str9 = strOptString7;
                                String str10 = strOptString9;
                                if (z4) {
                                    k.d dVar2 = new k.d(str8, str9, str10, str7);
                                    dVar2.a("amap_web_logo", "md5_night");
                                    Context context3 = j.this.b;
                                    er.f();
                                    new k(context3, dVar2).a();
                                }
                                WeakReference<IAMapDelegate> weakReference7 = j.this.a;
                                if (weakReference7 == null || weakReference7.get() == null) {
                                    return;
                                }
                                j.this.a.get().changeLogoIconStyle(str7, z4, 1);
                            }
                        });
                    }
                    if (pairA != null) {
                        try {
                            if (pairA.first != null && (weakReference2 = this.a) != null && weakReference2.get() != null) {
                                iAMapDelegate = this.a.get();
                                if (iAMapDelegate.getAMapExtraInterfaceManager() != null) {
                                    iAMapDelegate.getAMapExtraInterfaceManager().h();
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                    }
                    if (pairA != null && (obj4 = pairA.first) != null && (jSONObject3 = (JSONObject) obj4) != null) {
                        try {
                            JSONObject jSONObjectOptJSONObject7 = jSONObject3.optJSONObject("16G");
                            boolean zA7 = gk.a(jSONObjectOptJSONObject7.optString("able", ""), false);
                            boolean zA8 = gk.a(jSONObjectOptJSONObject7.optString("removeCache", ""), false);
                            boolean zA9 = gk.a(jSONObjectOptJSONObject7.optString("uploadInfo", ""), false);
                            ei.a(zA7);
                            ei.b(zA8);
                            ei.c(zA9);
                        } catch (Throwable unused5) {
                        }
                    }
                    if (pairA != null && (obj3 = pairA.first) != null && (jSONObject2 = (JSONObject) obj3) != null) {
                        try {
                            zA = gk.a(jSONObject2.optJSONObject(str2).optString(r1, ""), false);
                            Context context2 = this.b;
                            if (zA) {
                                z = false;
                            } else {
                                z = true;
                            }
                            eh.a(context2, "amap_param", "overlay_use_old_type", (Object) Boolean.valueOf(z));
                        } catch (Throwable unused6) {
                        }
                    }
                    if (pairA != null && (obj2 = pairA.first) != null && (jSONObject = (JSONObject) obj2) != null) {
                        try {
                            ex.a(jSONObject.optJSONObject(str));
                        } catch (Throwable unused7) {
                        }
                    }
                    hn.a(this.b, er.f());
                    interrupt();
                    weakReference3 = this.a;
                    if (weakReference3 != null || weakReference3.get() == null) {
                    }
                    this.a.get().setRunLowFrame(false);
                    return;
                }
                str = "17E";
                str2 = "17W";
                if (pairA != null) {
                    gtVarF.a(((gk.a.C0107a) pairA.second).a);
                }
                if (pairA != null) {
                    eo.a(this.b, "maploc", "ue", Boolean.valueOf(c0107a.a));
                    JSONObject jSONObject6 = c0107a.c;
                    int iOptInt3 = jSONObject6.optInt(UserDataStore.FIRST_NAME, 1000);
                    iOptInt = jSONObject6.optInt("mpn", 0);
                    if (iOptInt > 500) {
                        iOptInt = 500;
                    }
                    if (iOptInt < 30) {
                        iOptInt = 30;
                    }
                    iy.a(iOptInt3, gk.a(jSONObject6.optString("igu"), false));
                    eo.a(this.b, "maploc", "opn", Integer.valueOf(iOptInt));
                }
                if (pairA != null) {
                    obj = pairA.first;
                    if (obj != null) {
                        if (System.currentTimeMillis() - eh.a(this.b, "Map3DCache", "time", (Long) 0L).longValue() > (jSONObjectOptJSONObject.has("time") ? Math.max(60, jSONObjectOptJSONObject.getInt("time")) : 2592000) * 1000) {
                            this.a.get().clearTileCache();
                        }
                    }
                }
                if (pairA != null) {
                    jSONObjectOptJSONObject4 = ((JSONObject) obj7).optJSONObject("14L");
                    if (jSONObjectOptJSONObject4 != null) {
                        zA2 = gk.a(jSONObjectOptJSONObject4.getString("able"), false);
                        weakReference4 = this.a;
                        if (weakReference4 != null) {
                            IAMapDelegate iAMapDelegate4 = this.a.get();
                            if (zA2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            iAMapDelegate4.setHideLogoEnble(z2);
                        }
                    }
                }
                if (pairA != null) {
                    eb.a(gk.a(jSONObjectOptJSONObject3.optString("able"), false));
                }
                if (pairA == null) {
                }
                if (pairA == null) {
                }
                if (pairA != null) {
                    if (pairA.first != null) {
                        iAMapDelegate = this.a.get();
                        if (iAMapDelegate.getAMapExtraInterfaceManager() != null) {
                            iAMapDelegate.getAMapExtraInterfaceManager().h();
                        }
                    }
                }
                if (pairA != null) {
                    JSONObject jSONObjectOptJSONObject8 = jSONObject3.optJSONObject("16G");
                    boolean zA10 = gk.a(jSONObjectOptJSONObject8.optString("able", ""), false);
                    boolean zA11 = gk.a(jSONObjectOptJSONObject8.optString("removeCache", ""), false);
                    boolean zA12 = gk.a(jSONObjectOptJSONObject8.optString("uploadInfo", ""), false);
                    ei.a(zA10);
                    ei.b(zA11);
                    ei.c(zA12);
                }
                if (pairA != null) {
                    zA = gk.a(jSONObject2.optJSONObject(str2).optString(r1, ""), false);
                    Context context3 = this.b;
                    if (zA) {
                        z = true;
                    } else {
                        z = false;
                    }
                    eh.a(context3, "amap_param", "overlay_use_old_type", (Object) Boolean.valueOf(z));
                }
                if (pairA != null) {
                    ex.a(jSONObject.optJSONObject(str));
                }
                hn.a(this.b, er.f());
                interrupt();
                weakReference3 = this.a;
                if (weakReference3 != null) {
                }
            }
        } catch (Throwable th4) {
            interrupt();
            hn.c(th4, "AMapDelegateImpGLSurfaceView", "mVerfy");
            th4.printStackTrace();
            ex.b(ew.e, "auth exception " + th4.getMessage());
        }
    }

    private Pair<JSONObject, gk.a.C0107a> a(StringBuilder sb) {
        String string;
        JSONObject jSONObject;
        gk.a.C0107a c0107a;
        WeakReference<IAMapDelegate> weakReference;
        try {
            long jLongValue = eh.a(this.b, "cloud_config_pull", "cloud_config_pull_timestamp", (Long) 0L).longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - jLongValue) >= 86400000) {
                string = sb.toString();
                string.replaceAll(";;", ";");
                eh.a(this.b, "cloud_config_pull", "cloud_config_pull_timestamp", (Object) new Long(jCurrentTimeMillis));
            } else {
                string = "";
            }
            gk.a aVarA = gk.a(this.b, er.f(), string, (Map<String, String>) null);
            if (gk.a != 1 && string != "" && aVarA != null && (weakReference = this.a) != null && weakReference.get() != null) {
                Message messageObtainMessage = this.a.get().getMainHandler().obtainMessage();
                messageObtainMessage.what = 2;
                String str = aVarA.c;
                if (str != null) {
                    messageObtainMessage.obj = str;
                }
                this.a.get().getMainHandler().sendMessage(messageObtainMessage);
            }
            String str2 = GLFileUtil.getCacheDir(this.b).getAbsolutePath() + "/authCustomConfigName";
            if (TextUtils.isEmpty(string) || aVarA == null || (jSONObject = aVarA.f) == null) {
                jSONObject = new JSONObject(new String(GLFileUtil.readFileContents(str2)));
            } else {
                GLFileUtil.writeDatasToFile(str2, jSONObject.toString().getBytes());
            }
            String str3 = GLFileUtil.getCacheDir(this.b).getAbsolutePath() + "/authLogConfigName";
            if (TextUtils.isEmpty(string) || aVarA == null || aVarA.g == null) {
                byte[] fileContents = GLFileUtil.readFileContents(str3);
                gk.a.C0107a c0107a2 = new gk.a.C0107a();
                JSONObject jSONObject2 = new JSONObject(new String(fileContents));
                c0107a2.a = jSONObject2.getBoolean("IsExceptionUpdate");
                if (jSONObject2.has("mOfflineLoc")) {
                    c0107a2.c = jSONObject2.getJSONObject("mOfflineLoc");
                }
                c0107a = c0107a2;
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("IsExceptionUpdate", aVarA.g.a);
                jSONObject3.put("mOfflineLoc", aVarA.g.c);
                GLFileUtil.writeDatasToFile(str3, jSONObject3.toString().getBytes());
                c0107a = aVarA.g;
            }
            return new Pair<>(jSONObject, c0107a);
        } catch (Throwable unused) {
            return null;
        }
    }
}
