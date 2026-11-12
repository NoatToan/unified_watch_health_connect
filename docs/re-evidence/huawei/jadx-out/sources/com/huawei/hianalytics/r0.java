package com.huawei.hianalytics;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hianalytics.core.common.AesGcmKsWrapper;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.transport.TransportHandlerFactory;
import com.huawei.hianalytics.core.transport.net.Response;
import com.huawei.hianalytics.framework.config.CipherType;
import com.huawei.hianalytics.framework.config.IMandatoryParameters;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements IMandatoryParameters {
    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final boolean checkDebugModeEnabled() {
        Context appContext = EnvUtils.getAppContext();
        if (appContext == null) {
            return false;
        }
        return TextUtils.equals(appContext.getPackageName(), System.getProperty("debug.huawei.hianalytics.app"));
    }

    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final List getAllTags() {
        return HiAnalyticsManager.getAllTags();
    }

    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final String getAppVer() {
        return k.b().a().i;
    }

    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final String getDebugModeUrl() {
        String property = System.getProperty("debug.huawei.hianalytics.app.url");
        if (!TextUtils.isEmpty(property)) {
            return property;
        }
        HiLog.i("DeviceUtil", "hianalytics debugMode url is empty");
        return "";
    }

    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final byte[] getLoadWorkKey() {
        a2 a2VarA = a2.a();
        if (a2VarA.f11455c == null) {
            a2VarA.f11455c = HexUtil.hexStr2ByteArray(a2VarA.b());
        }
        return a2VarA.f11455c;
    }

    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final String getModel() {
        return Build.MODEL;
    }

    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final String getProcessName() {
        return x0.b(EnvUtils.getAppContext());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:32:0x0102  */
    /* JADX WARN: Code duplicated, block: B:33:0x0105  */
    /* JADX WARN: Code duplicated, block: B:36:0x010c  */
    /* JADX WARN: Code duplicated, block: B:38:0x011c  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX WARN: Code duplicated, block: B:42:0x012c  */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:48:0x0140  */
    /* JADX WARN: Code duplicated, block: B:50:0x0153  */
    /* JADX WARN: Code duplicated, block: B:58:0x0184  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x0201  */
    /* JADX WARN: Code duplicated, block: B:80:0x0209  */
    /* JADX WARN: Code duplicated, block: B:81:0x0222  */
    /* JADX WARN: Code duplicated, block: B:86:0x028c A[Catch: JSONException -> 0x02ec, TryCatch #0 {JSONException -> 0x02ec, blocks: (B:84:0x022e, B:86:0x028c, B:87:0x02a7, B:89:0x02e1, B:91:0x02e6, B:90:0x02e4), top: B:98:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02e1 A[Catch: JSONException -> 0x02ec, TryCatch #0 {JSONException -> 0x02ec, blocks: (B:84:0x022e, B:86:0x028c, B:87:0x02a7, B:89:0x02e1, B:91:0x02e6, B:90:0x02e4), top: B:98:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02e4 A[Catch: JSONException -> 0x02ec, TryCatch #0 {JSONException -> 0x02ec, blocks: (B:84:0x022e, B:86:0x028c, B:87:0x02a7, B:89:0x02e1, B:91:0x02e6, B:90:0x02e4), top: B:98:0x022e }] */
    /* JADX WARN: Code duplicated, block: B:98:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01bb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x0209, please report this as an issue */
    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final Pair getRsaPublicKeyFromNetWork(String str, String str2) {
        String strDecrypt;
        HashMap map;
        q0 q0Var;
        String str3;
        x xVarA;
        Map map2;
        Context appContext;
        x xVarA2;
        String property;
        x xVarA3;
        int i;
        Response responseExecute;
        String content;
        String strOptString;
        String strOptString2;
        String strOptString3;
        l0 l0VarA;
        String strA = k.b().a().w;
        if (TextUtils.isEmpty(strA)) {
            strA = c2.a("Privacy_MY", "public_key_version");
            k.b().a().w = strA;
        }
        if ("maint".equals(str2)) {
            strDecrypt = k.b().a().s;
            if (TextUtils.isEmpty(strDecrypt)) {
                strDecrypt = AesGcmKsWrapper.decrypt("HiAnalytics_Sdk_Public_Sp_Key", c2.a("Privacy_MY", "public_key_maint"));
                k.b().a().s = strDecrypt;
            }
        } else {
            strDecrypt = k.b().a().r;
            if (TextUtils.isEmpty(strDecrypt)) {
                strDecrypt = AesGcmKsWrapper.decrypt("HiAnalytics_Sdk_Public_Sp_Key", c2.a("Privacy_MY", "public_key_oper"));
                k.b().a().r = strDecrypt;
            }
        }
        if (TextUtils.isEmpty(strDecrypt) || !"2.0".equals(strA)) {
            map = new HashMap();
            k.b().getClass();
            q0Var = (q0) k.f11563b.get(str);
            if (q0Var != null) {
                str3 = q0Var.f11602c;
            } else {
                str3 = "";
            }
            if (TextUtils.isEmpty(str3)) {
                l0VarA = k.b().a();
                if (TextUtils.isEmpty(l0VarA.g)) {
                    str3 = l0VarA.f;
                } else {
                    str3 = l0VarA.g;
                }
            }
            map.put("App-Id", str3);
            xVarA = g1.a(str, str2);
            if (xVarA != null) {
                map2 = xVarA.m;
            } else {
                map2 = null;
            }
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (!"x-hasdk-pkg".equals(entry.getKey()) || "x-hasdk-token".equals(entry.getKey()) || "x-hasdk-clientid".equals(entry.getKey())) {
                        map.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            appContext = EnvUtils.getAppContext();
            if (appContext == null && TextUtils.equals(appContext.getPackageName(), System.getProperty("debug.huawei.hianalytics.app"))) {
                property = System.getProperty("debug.huawei.hianalytics.app.url");
                if (TextUtils.isEmpty(property)) {
                    HiLog.i("DeviceUtil", "hianalytics debugMode url is empty");
                    property = "";
                }
            } else {
                xVarA2 = g1.a(str, str2);
                if (xVarA2 != null) {
                    property = xVarA2.e;
                } else {
                    property = "";
                }
            }
            if (TextUtils.isEmpty(property)) {
                HiLog.w("GetPublicKey", "collectUrl is null, tag: " + str + ", type: " + str2);
                strDecrypt = "";
            } else {
                String strReplace = "{url}/getPublicKey?keytype=4".replace("{url}", property);
                byte[] bArr = new byte[0];
                xVarA3 = g1.a(str, str2);
                if (xVarA3 == null) {
                    i = 1;
                } else {
                    i = xVarA3.s;
                }
                responseExecute = TransportHandlerFactory.create(strReplace, map, bArr, i).execute();
                if (responseExecute == null) {
                    HiLog.sw("GetPublicKey", "get pubKey response is null");
                    strDecrypt = v.f11612a;
                } else if (responseExecute.getHttpCode() != 200) {
                    HiLog.sw("GetPublicKey", "get pubKey fail HttpCode: " + responseExecute.getHttpCode());
                    strDecrypt = v.f11612a;
                } else {
                    content = responseExecute.getContent();
                    if (!TextUtils.isEmpty(content)) {
                        try {
                            JSONObject jSONObject = new JSONObject(content);
                            strOptString = jSONObject.optString("publicKey");
                            strOptString2 = jSONObject.optString("publicKeyOM");
                            String strOptString4 = jSONObject.optString("pubkey_version");
                            String str4 = System.currentTimeMillis() + "";
                            String strOptString5 = jSONObject.optString(HwExerciseConstants.JSON_NAME_TIME_INTERVAL);
                            strOptString3 = jSONObject.optString("serverTime");
                            c2.a("Privacy_MY", "public_key_oper", AesGcmKsWrapper.encrypt("HiAnalytics_Sdk_Public_Sp_Key", strOptString));
                            c2.a("Privacy_MY", "public_key_maint", AesGcmKsWrapper.encrypt("HiAnalytics_Sdk_Public_Sp_Key", strOptString2));
                            c2.a("Privacy_MY", "public_key_time_interval", strOptString5);
                            c2.a("Privacy_MY", "public_key_time_last", str4);
                            c2.a("Privacy_MY", "public_key_version", strOptString4);
                            if (!TextUtils.isEmpty(strOptString3)) {
                                long j = Long.parseLong(strOptString3) - System.currentTimeMillis();
                                c2.b("global_v2", "public_key_abs_time", j);
                                k.b().a().u = j;
                            }
                            k.b().a().r = strOptString;
                            k.b().a().s = strOptString2;
                            k.b().a().w = strOptString4;
                            k.b().a().v = str4;
                            k.b().a().t = strOptString5;
                            if ("maint".equals(str2)) {
                                v.f11612a = strOptString2;
                            } else {
                                v.f11612a = strOptString;
                            }
                            HiLog.si("GetPublicKey", "get pubKey success");
                        } catch (JSONException unused) {
                            HiLog.sw("GetPublicKey", "get pubKey parse json failed");
                        }
                    }
                    strDecrypt = v.f11612a;
                }
            }
        } else {
            String strA2 = k.b().a().t;
            if (TextUtils.isEmpty(strA2)) {
                strA2 = c2.a("Privacy_MY", "public_key_time_interval");
                k.b().a().t = strA2;
            }
            String strA3 = k.b().a().v;
            if (TextUtils.isEmpty(strA3)) {
                strA3 = c2.a("Privacy_MY", "public_key_time_last");
                k.b().a().v = strA3;
            }
            if (TextUtils.isEmpty(strA2) || TextUtils.isEmpty(strA3)) {
                map = new HashMap();
                k.b().getClass();
                q0Var = (q0) k.f11563b.get(str);
                if (q0Var != null) {
                    str3 = q0Var.f11602c;
                } else {
                    str3 = "";
                }
                if (TextUtils.isEmpty(str3)) {
                    l0VarA = k.b().a();
                    if (TextUtils.isEmpty(l0VarA.g)) {
                        str3 = l0VarA.f;
                    } else {
                        str3 = l0VarA.g;
                    }
                }
                map.put("App-Id", str3);
                xVarA = g1.a(str, str2);
                if (xVarA != null) {
                    map2 = xVarA.m;
                } else {
                    map2 = null;
                }
                if (map2 != null) {
                    while (r6.hasNext()) {
                        if (!"x-hasdk-pkg".equals(entry.getKey())) {
                        }
                        map.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                appContext = EnvUtils.getAppContext();
                if (appContext == null) {
                    xVarA2 = g1.a(str, str2);
                    if (xVarA2 != null) {
                        property = xVarA2.e;
                    } else {
                        property = "";
                    }
                } else {
                    property = System.getProperty("debug.huawei.hianalytics.app.url");
                    if (TextUtils.isEmpty(property)) {
                        HiLog.i("DeviceUtil", "hianalytics debugMode url is empty");
                        property = "";
                    }
                }
                if (TextUtils.isEmpty(property)) {
                    HiLog.w("GetPublicKey", "collectUrl is null, tag: " + str + ", type: " + str2);
                    strDecrypt = "";
                } else {
                    String strReplace2 = "{url}/getPublicKey?keytype=4".replace("{url}", property);
                    byte[] bArr2 = new byte[0];
                    xVarA3 = g1.a(str, str2);
                    if (xVarA3 == null) {
                        i = 1;
                    } else {
                        i = xVarA3.s;
                    }
                    responseExecute = TransportHandlerFactory.create(strReplace2, map, bArr2, i).execute();
                    if (responseExecute == null) {
                        HiLog.sw("GetPublicKey", "get pubKey response is null");
                        strDecrypt = v.f11612a;
                    } else if (responseExecute.getHttpCode() != 200) {
                        HiLog.sw("GetPublicKey", "get pubKey fail HttpCode: " + responseExecute.getHttpCode());
                        strDecrypt = v.f11612a;
                    } else {
                        content = responseExecute.getContent();
                        if (!TextUtils.isEmpty(content)) {
                            JSONObject jSONObject2 = new JSONObject(content);
                            strOptString = jSONObject2.optString("publicKey");
                            strOptString2 = jSONObject2.optString("publicKeyOM");
                            String strOptString6 = jSONObject2.optString("pubkey_version");
                            String str5 = System.currentTimeMillis() + "";
                            String strOptString7 = jSONObject2.optString(HwExerciseConstants.JSON_NAME_TIME_INTERVAL);
                            strOptString3 = jSONObject2.optString("serverTime");
                            c2.a("Privacy_MY", "public_key_oper", AesGcmKsWrapper.encrypt("HiAnalytics_Sdk_Public_Sp_Key", strOptString));
                            c2.a("Privacy_MY", "public_key_maint", AesGcmKsWrapper.encrypt("HiAnalytics_Sdk_Public_Sp_Key", strOptString2));
                            c2.a("Privacy_MY", "public_key_time_interval", strOptString7);
                            c2.a("Privacy_MY", "public_key_time_last", str5);
                            c2.a("Privacy_MY", "public_key_version", strOptString6);
                            if (!TextUtils.isEmpty(strOptString3)) {
                                long j2 = Long.parseLong(strOptString3) - System.currentTimeMillis();
                                c2.b("global_v2", "public_key_abs_time", j2);
                                k.b().a().u = j2;
                            }
                            k.b().a().r = strOptString;
                            k.b().a().s = strOptString2;
                            k.b().a().w = strOptString6;
                            k.b().a().v = str5;
                            k.b().a().t = strOptString7;
                            if ("maint".equals(str2)) {
                                v.f11612a = strOptString2;
                            } else {
                                v.f11612a = strOptString;
                            }
                            HiLog.si("GetPublicKey", "get pubKey success");
                        }
                        strDecrypt = v.f11612a;
                    }
                }
            } else {
                try {
                    if (System.currentTimeMillis() - Long.parseLong(strA3) > Integer.parseInt(strA2)) {
                        map = new HashMap();
                        k.b().getClass();
                        q0Var = (q0) k.f11563b.get(str);
                        if (q0Var != null) {
                            str3 = q0Var.f11602c;
                        } else {
                            str3 = "";
                        }
                        if (TextUtils.isEmpty(str3)) {
                            l0VarA = k.b().a();
                            if (TextUtils.isEmpty(l0VarA.g)) {
                                str3 = l0VarA.f;
                            } else {
                                str3 = l0VarA.g;
                            }
                        }
                        map.put("App-Id", str3);
                        xVarA = g1.a(str, str2);
                        if (xVarA != null) {
                            map2 = xVarA.m;
                        } else {
                            map2 = null;
                        }
                        if (map2 != null) {
                            while (r6.hasNext()) {
                                if (!"x-hasdk-pkg".equals(entry.getKey())) {
                                }
                                map.put((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        appContext = EnvUtils.getAppContext();
                        if (appContext == null) {
                            xVarA2 = g1.a(str, str2);
                            if (xVarA2 != null) {
                                property = xVarA2.e;
                            } else {
                                property = "";
                            }
                        } else {
                            property = System.getProperty("debug.huawei.hianalytics.app.url");
                            if (TextUtils.isEmpty(property)) {
                                HiLog.i("DeviceUtil", "hianalytics debugMode url is empty");
                                property = "";
                            }
                        }
                        if (TextUtils.isEmpty(property)) {
                            HiLog.w("GetPublicKey", "collectUrl is null, tag: " + str + ", type: " + str2);
                            strDecrypt = "";
                        } else {
                            String strReplace3 = "{url}/getPublicKey?keytype=4".replace("{url}", property);
                            byte[] bArr3 = new byte[0];
                            xVarA3 = g1.a(str, str2);
                            if (xVarA3 == null) {
                                i = 1;
                            } else {
                                i = xVarA3.s;
                            }
                            responseExecute = TransportHandlerFactory.create(strReplace3, map, bArr3, i).execute();
                            if (responseExecute == null) {
                                HiLog.sw("GetPublicKey", "get pubKey response is null");
                                strDecrypt = v.f11612a;
                            } else if (responseExecute.getHttpCode() != 200) {
                                HiLog.sw("GetPublicKey", "get pubKey fail HttpCode: " + responseExecute.getHttpCode());
                                strDecrypt = v.f11612a;
                            } else {
                                content = responseExecute.getContent();
                                if (!TextUtils.isEmpty(content)) {
                                    JSONObject jSONObject3 = new JSONObject(content);
                                    strOptString = jSONObject3.optString("publicKey");
                                    strOptString2 = jSONObject3.optString("publicKeyOM");
                                    String strOptString8 = jSONObject3.optString("pubkey_version");
                                    String str6 = System.currentTimeMillis() + "";
                                    String strOptString9 = jSONObject3.optString(HwExerciseConstants.JSON_NAME_TIME_INTERVAL);
                                    strOptString3 = jSONObject3.optString("serverTime");
                                    c2.a("Privacy_MY", "public_key_oper", AesGcmKsWrapper.encrypt("HiAnalytics_Sdk_Public_Sp_Key", strOptString));
                                    c2.a("Privacy_MY", "public_key_maint", AesGcmKsWrapper.encrypt("HiAnalytics_Sdk_Public_Sp_Key", strOptString2));
                                    c2.a("Privacy_MY", "public_key_time_interval", strOptString9);
                                    c2.a("Privacy_MY", "public_key_time_last", str6);
                                    c2.a("Privacy_MY", "public_key_version", strOptString8);
                                    if (!TextUtils.isEmpty(strOptString3)) {
                                        long j3 = Long.parseLong(strOptString3) - System.currentTimeMillis();
                                        c2.b("global_v2", "public_key_abs_time", j3);
                                        k.b().a().u = j3;
                                    }
                                    k.b().a().r = strOptString;
                                    k.b().a().s = strOptString2;
                                    k.b().a().w = strOptString8;
                                    k.b().a().v = str6;
                                    k.b().a().t = strOptString9;
                                    if ("maint".equals(str2)) {
                                        v.f11612a = strOptString2;
                                    } else {
                                        v.f11612a = strOptString;
                                    }
                                    HiLog.si("GetPublicKey", "get pubKey success");
                                }
                                strDecrypt = v.f11612a;
                            }
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
            }
        }
        return Pair.create(strDecrypt, k.b().a().w);
    }

    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final boolean isFlashKey() {
        long jA = c2.a("analytics_key", "flashKeyTime", -1L);
        if (jA == -1) {
            jA = c2.a("Privacy_MY", "flashKeyTime", -1L);
        } else {
            c2.a(EnvUtils.getAppContext(), "analytics_key");
        }
        return System.currentTimeMillis() - jA > 1296000000;
    }

    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final void refreshKey(String str, int i) {
        a2 a2VarA = a2.a();
        a2VarA.getClass();
        if (TextUtils.isEmpty(str) || i != 1) {
            return;
        }
        HiLog.si("RootKeyManager", "generate a new local working key");
        a2VarA.f11454b = str;
        String strA = a2VarA.a(str);
        HiLog.si("RootKeyManager", "refresh local key to the sp");
        c2.a("Privacy_MY", "PrivacyData", strA);
        c2.b("Privacy_MY", "flashKeyTime", System.currentTimeMillis());
    }

    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final String rsaEncrypt(String str, String str2, String str3) {
        return b2.a(str, str2, str3);
    }

    @Override // com.huawei.hianalytics.framework.config.IMandatoryParameters
    public final String getCipherType() {
        return CipherType.AES_GCM;
    }
}
