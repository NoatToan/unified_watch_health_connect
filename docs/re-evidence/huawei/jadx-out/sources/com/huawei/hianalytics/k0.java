package com.huawei.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hianalytics.core.common.AesGcmKsWrapper;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.config.DeviceAttributeCollector;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.secure.android.common.encrypt.hash.SHA;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements DeviceAttributeCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11567b;

    public k0(String str, String str2) {
        this.f11566a = str;
        this.f11567b = str2;
    }

    public final String a() {
        String str;
        String str2;
        q qVarA = q.a();
        String str3 = this.f11566a;
        String str4 = this.f11567b;
        Context context = qVarA.f11599a;
        y yVarA = o.a(str3, str4);
        if (yVarA == null || (str = yVarA.g) == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            y yVarA2 = o.a(str3, str4);
            return (yVarA2 == null || (str2 = yVarA2.g) == null) ? "" : str2;
        }
        y yVarA3 = o.a(str3, str4);
        if (yVarA3 == null || !yVarA3.d) {
            return "";
        }
        if (TextUtils.isEmpty(k.b().a().e)) {
            k.b().a().e = s.a(context);
        }
        return k.b().a().e;
    }

    public final JSONObject b() {
        x xVarA = g1.a(this.f11566a, this.f11567b);
        String str = xVarA != null ? xVarA.o : "";
        if (TextUtils.isEmpty(str)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            HiLog.e("HADC", "json exception, tag: " + this.f11566a + ", type: " + this.f11567b);
            return new JSONObject();
        }
    }

    public final String c() {
        String strValueOf;
        Object obj;
        x xVarA;
        String strValueOf2 = "";
        if (!h.d.f11542b) {
            x xVarA2 = g1.a(this.f11566a, this.f11567b);
            return (TextUtils.isEmpty(xVarA2 != null ? xVarA2.f : "") || (xVarA = g1.a(this.f11566a, this.f11567b)) == null) ? "" : xVarA.f;
        }
        if (this.f11567b.equals("oper")) {
            strValueOf = String.valueOf(0);
        } else {
            strValueOf = this.f11567b.equals("maint") ? String.valueOf(1) : "";
        }
        String strA = c2.a("global_v2", this.f11566a + "_" + strValueOf + "_oaid");
        String strDecrypt = !TextUtils.isEmpty(strA) ? AesGcmKsWrapper.decrypt("HiAnalytics_Sdk_Public_Sp_Key", strA) : "";
        if (!TextUtils.isEmpty(strDecrypt)) {
            Pair pairA = x0.a(EnvUtils.getAppContext());
            if (!strDecrypt.equals(pairA.first)) {
                String str = (String) pairA.first;
                HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_default_collection");
                if (instanceByTag == null) {
                    obj = "maint";
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("oaid_before", strDecrypt);
                        jSONObject.put("oaid_refresh", str);
                        obj = "maint";
                        try {
                            jSONObject.put("oaid_refresh_time", System.currentTimeMillis());
                            instanceByTag.onEventSync(0, "107", jSONObject);
                            instanceByTag.onReport(0);
                        } catch (JSONException unused) {
                            HiLog.e("HADC", "JSONException occur");
                        }
                    } catch (JSONException unused2) {
                        obj = "maint";
                    }
                }
                if (this.f11567b.equals("oper")) {
                    strValueOf2 = String.valueOf(0);
                } else if (this.f11567b.equals(obj)) {
                    strValueOf2 = String.valueOf(1);
                }
                c2.a("global_v2", this.f11566a + "_" + strValueOf2 + "_oaid", AesGcmKsWrapper.encrypt("HiAnalytics_Sdk_Public_Sp_Key", (String) pairA.first));
                return (String) pairA.first;
            }
        }
        return strDecrypt;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x023d A[Catch: JSONException -> 0x028a, TryCatch #0 {JSONException -> 0x028a, blocks: (B:107:0x01d5, B:109:0x0202, B:111:0x0206, B:118:0x0224, B:120:0x023d, B:122:0x0241, B:129:0x0256, B:131:0x026d, B:132:0x026f, B:136:0x027a, B:135:0x0276, B:125:0x0248, B:127:0x0252, B:114:0x020d, B:116:0x0220), top: B:140:0x01d5 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0240  */
    /* JADX WARN: Code duplicated, block: B:131:0x026d A[Catch: JSONException -> 0x028a, TryCatch #0 {JSONException -> 0x028a, blocks: (B:107:0x01d5, B:109:0x0202, B:111:0x0206, B:118:0x0224, B:120:0x023d, B:122:0x0241, B:129:0x0256, B:131:0x026d, B:132:0x026f, B:136:0x027a, B:135:0x0276, B:125:0x0248, B:127:0x0252, B:114:0x020d, B:116:0x0220), top: B:140:0x01d5 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0275  */
    /* JADX WARN: Code duplicated, block: B:135:0x0276 A[Catch: JSONException -> 0x028a, TryCatch #0 {JSONException -> 0x028a, blocks: (B:107:0x01d5, B:109:0x0202, B:111:0x0206, B:118:0x0224, B:120:0x023d, B:122:0x0241, B:129:0x0256, B:131:0x026d, B:132:0x026f, B:136:0x027a, B:135:0x0276, B:125:0x0248, B:127:0x0252, B:114:0x020d, B:116:0x0220), top: B:140:0x01d5 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd A[PHI: r3
      0x00dd: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v6 java.lang.String) binds: [B:44:0x00ca, B:46:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x015c A[PHI: r2
      0x015c: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v4 java.lang.String), (r2v8 java.lang.String), (r2v8 java.lang.String) binds: [B:61:0x0134, B:63:0x0138, B:65:0x0142, B:67:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0160  */
    /* JADX WARN: Code duplicated, block: B:73:0x016a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0170 A[PHI: r2
      0x0170: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:70:0x015e, B:72:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0173  */
    /* JADX WARN: Code duplicated, block: B:77:0x017e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b3  */
    @Override // com.huawei.hianalytics.framework.config.DeviceAttributeCollector
    public final JSONObject doCollector(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String strB;
        n nVar;
        n nVar2;
        String strA;
        byte b2;
        String str4;
        String str5;
        x xVarA;
        String str6;
        x xVarA2;
        String str7;
        String str8;
        String strA2;
        q qVarA = q.a();
        String str9 = this.f11566a;
        String str10 = this.f11567b;
        qVarA.getClass();
        p pVar = new p(str9, str10);
        Context context = qVarA.f11599a;
        y yVarA = o.a(str9, str10);
        if (yVarA == null || (str = yVarA.f) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            y yVarA2 = o.a(str9, str10);
            if (yVarA2 == null || (str2 = yVarA2.e) == null) {
                str2 = "";
            }
            if (TextUtils.isEmpty(str2)) {
                l0 l0VarA = k.b().a();
                if (TextUtils.isEmpty(l0VarA.f11573a)) {
                    l0VarA.f11573a = t.a("ro.build.version.emui");
                }
                boolean zIsEmpty = TextUtils.isEmpty(l0VarA.f11573a);
                y yVarA3 = o.a(str9, str10);
                if (yVarA3 == null || (str3 = yVarA3.h) == null) {
                    str3 = "";
                }
                if (TextUtils.isEmpty(str3)) {
                    if (zIsEmpty) {
                        HiLog.i("DeviceIdProcessor", "is not emui device");
                        int iA = pVar.a();
                        StringBuilder sb = new StringBuilder("need get udid: ");
                        int i = iA & 4;
                        sb.append(i);
                        HiLog.si("DeviceIdProcessor", sb.toString());
                        if (i != 0) {
                            l0 l0VarA2 = k.b().a();
                            if (TextUtils.isEmpty(l0VarA2.f11575c)) {
                                l0VarA2.f11575c = s.a();
                            }
                            strB = l0VarA2.f11575c;
                            if (!TextUtils.isEmpty(strB)) {
                                nVar = new n("UDID", strB);
                            }
                        } else {
                            strB = "";
                        }
                        if (i != 0 && (iA & 1) != 0) {
                            strB = p.b(context);
                            if (!TextUtils.isEmpty(strB) && !strB.equalsIgnoreCase("unknown")) {
                                nVar2 = new n("UDID", SHA.sha256Encrypt(p.b(context)));
                            } else if ((iA & 1) != 0) {
                                strB = p.b(context);
                                if (!TextUtils.isEmpty(strB)) {
                                    nVar = new n("SN", strB);
                                } else if ((iA & 2) != 0) {
                                    nVar2 = new n("IM_EI", p.a(context));
                                } else {
                                    nVar = new n("EMPTY", strB);
                                }
                            } else if ((iA & 2) != 0) {
                                nVar2 = new n("IM_EI", p.a(context));
                            } else {
                                nVar = new n("EMPTY", strB);
                            }
                            nVar = nVar2;
                        } else if ((iA & 1) != 0) {
                            strB = p.b(context);
                            if (!TextUtils.isEmpty(strB)) {
                                nVar = new n("SN", strB);
                            } else if ((iA & 2) != 0) {
                                nVar2 = new n("IM_EI", p.a(context));
                                nVar = nVar2;
                            } else {
                                nVar = new n("EMPTY", strB);
                            }
                        } else if ((iA & 2) != 0) {
                            nVar2 = new n("IM_EI", p.a(context));
                            nVar = nVar2;
                        } else {
                            nVar = new n("EMPTY", strB);
                        }
                    } else {
                        HiLog.i("DeviceIdProcessor", "is emui device");
                        int iA2 = pVar.a();
                        if (iA2 != 0) {
                            l0 l0VarA3 = k.b().a();
                            if (TextUtils.isEmpty(l0VarA3.f11575c)) {
                                l0VarA3.f11575c = s.a();
                            }
                            strA = l0VarA3.f11575c;
                            if (!TextUtils.isEmpty(strA)) {
                                nVar = new n("UDID", strA);
                            }
                        } else {
                            strA = "";
                        }
                        if ((iA2 & 2) != 0) {
                            strA = p.a(context);
                            if (!TextUtils.isEmpty(strA)) {
                                nVar = new n("IM_EI", strA);
                            } else if ((iA2 & 1) != 0) {
                                nVar2 = new n("SN", p.b(context));
                                nVar = nVar2;
                            } else {
                                nVar = new n("EMPTY", strA);
                            }
                        } else if ((iA2 & 1) != 0) {
                            nVar2 = new n("SN", p.b(context));
                            nVar = nVar2;
                        } else {
                            nVar = new n("EMPTY", strA);
                        }
                    }
                } else if (zIsEmpty) {
                    nVar2 = new n("UDID", SHA.sha256Encrypt(str3));
                    nVar = nVar2;
                } else {
                    nVar = new n("SN", str3);
                }
            } else {
                nVar = new n("IM_EI", str2);
            }
        } else {
            nVar = new n("UDID", str);
        }
        String str11 = nVar.f11585a;
        str11.hashCode();
        int iHashCode = str11.hashCode();
        if (iHashCode != 2651) {
            if (iHashCode != 2599914) {
                if (iHashCode == 69804447 && str11.equals("IM_EI")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str11.equals("UDID")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str11.equals("SN")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        String str12 = null;
        if (b2 == 0) {
            str4 = nVar.f11586b;
            str5 = null;
        } else if (b2 == 1) {
            str5 = nVar.f11586b;
            str4 = null;
        } else if (b2 != 2) {
            str5 = null;
            str4 = null;
        } else {
            str4 = null;
            str12 = nVar.f11586b;
            str5 = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put(OpAnalyticsConstants.ANDROID_ID, a());
            jSONObject.put(CommonUtil.IMEI, str12);
            jSONObject.put("udid", str5);
            jSONObject.put("sn", str4);
            String str13 = this.f11566a;
            k.b().getClass();
            q0 q0Var = (q0) k.f11563b.get(str13);
            if (!TextUtils.isEmpty(q0Var != null ? q0Var.f : "")) {
                String str14 = this.f11566a;
                k.b().getClass();
                q0 q0Var2 = (q0) k.f11563b.get(str14);
                String str15 = q0Var2 != null ? q0Var2.f : "";
                jSONObject.put("upid_brand", str15);
                jSONObject.put("oaid", c());
                xVarA = g1.a(this.f11566a, this.f11567b);
                if (xVarA != null) {
                    str6 = xVarA.h;
                } else {
                    str6 = "";
                }
                jSONObject.put("upid", (TextUtils.isEmpty(str6) || (xVarA2 = g1.a(this.f11566a, this.f11567b)) == null) ? "" : xVarA2.h);
                q qVarA2 = q.a();
                str7 = this.f11566a;
                str8 = this.f11567b;
                qVarA2.getClass();
                x xVarA3 = g1.a(str7, str8);
                strA2 = xVarA3 != null ? xVarA3.n : "";
                if (TextUtils.isEmpty(strA2)) {
                    strA2 = p0.a(str7, str8);
                }
                jSONObject.put("uuid", strA2);
                jSONObject.put("events_global_properties", b());
                return jSONObject;
            }
            jSONObject.put("upid_brand", str15);
            jSONObject.put("oaid", c());
            xVarA = g1.a(this.f11566a, this.f11567b);
            if (xVarA != null) {
                str6 = xVarA.h;
            } else {
                str6 = "";
            }
            if (TextUtils.isEmpty(str6)) {
                jSONObject.put("upid", (TextUtils.isEmpty(str6) || (xVarA2 = g1.a(this.f11566a, this.f11567b)) == null) ? "" : xVarA2.h);
                q qVarA3 = q.a();
                str7 = this.f11566a;
                str8 = this.f11567b;
                qVarA3.getClass();
                x xVarA4 = g1.a(str7, str8);
                if (xVarA4 != null) {
                }
                if (TextUtils.isEmpty(strA2)) {
                    strA2 = p0.a(str7, str8);
                }
                jSONObject.put("uuid", strA2);
                jSONObject.put("events_global_properties", b());
                return jSONObject;
            }
            jSONObject.put("upid", (TextUtils.isEmpty(str6) || (xVarA2 = g1.a(this.f11566a, this.f11567b)) == null) ? "" : xVarA2.h);
            q qVarA4 = q.a();
            str7 = this.f11566a;
            str8 = this.f11567b;
            qVarA4.getClass();
            x xVarA5 = g1.a(str7, str8);
            if (xVarA5 != null) {
            }
            if (TextUtils.isEmpty(strA2)) {
                strA2 = p0.a(str7, str8);
            }
            jSONObject.put("uuid", strA2);
            jSONObject.put("events_global_properties", b());
            return jSONObject;
        } catch (JSONException unused) {
            HiLog.e("HADC", "fail to collect device id, tag: " + this.f11566a + ", type: " + this.f11567b);
            return jSONObject;
        }
    }
}
