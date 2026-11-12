package fh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.common.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import kg.f;
import nh.n;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e {
    public static JSONObject h(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(NotificationConstants.KEY_DATA_MIME_TYPE, str);
        jSONObject2.put(FirebaseAnalytics.Param.METHOD, str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public static boolean i(eh.a.b bVar) {
        List<String> list;
        Map<String, List<String>> map = bVar.f64023a;
        String strJoin = null;
        if (map != null && (list = map.get("msp-gzip")) != null) {
            strJoin = TextUtils.join(",", list);
        }
        return Boolean.valueOf(strJoin).booleanValue();
    }

    public b a(Context context, String str, lh.a aVar) {
        String str2;
        if (fg.b.f71198a == fg.b.a.PRE_SANDBOX) {
            str2 = "https://mobilegw.alipaydev.com/mgw.htm";
        } else if (fg.b.f71198a == fg.b.a.SANDBOX) {
            str2 = "https://mobilegw.dl.alipaydev.com/mgw.htm";
        } else {
            str2 = "https://mobilegw.alipay.com/mgw.htm";
            if (context != null) {
                TextUtils.isEmpty("https://mobilegw.alipay.com/mgw.htm");
            }
        }
        return b(aVar, context, str, str2, true);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x016c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0173  */
    /* JADX WARN: Code duplicated, block: B:95:0x018f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0190 A[Catch: JSONException -> 0x01af, TryCatch #16 {JSONException -> 0x01af, blocks: (B:93:0x017e, B:96:0x0190, B:98:0x01a1), top: B:134:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01a1 A[Catch: JSONException -> 0x01af, TRY_LEAVE, TryCatch #16 {JSONException -> 0x01af, blocks: (B:93:0x017e, B:96:0x0190, B:98:0x01a1), top: B:134:0x017e }] */
    public final b b(lh.a aVar, Context context, String str, String str2, boolean z14) throws Throwable {
        boolean z15;
        byte[] bArrA;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2;
        String str3;
        String str4;
        b bVar;
        String str5;
        JSONObject jSONObject;
        String strOptString;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th3;
        byte[] byteArray;
        c cVar = new c(true);
        b bVar2 = new b(c(aVar), d(aVar, str, g()));
        HashMap mapF = f(str, false);
        String str6 = (String) mapF.get("iSr");
        String str7 = cVar.f71575b;
        byte[] bytes = bVar2.f71572a.getBytes();
        byte[] bytes2 = bVar2.f71573b.getBytes();
        try {
            bytes2 = ch.b.a(bytes2);
            z15 = true;
        } catch (Exception unused) {
            z15 = false;
        }
        if (cVar.f71574a) {
            try {
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(ch.a.c(yg.a.f196899a)));
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(1, publicKeyGeneratePublic);
                byte[] bytes3 = str7.getBytes("UTF-8");
                int blockSize = cipher.getBlockSize();
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                for (int i14 = 0; i14 < bytes3.length; i14 += blockSize) {
                    try {
                        try {
                            byteArrayOutputStream2.write(cipher.doFinal(bytes3, i14, bytes3.length - i14 < blockSize ? bytes3.length - i14 : blockSize));
                        } catch (Exception e4) {
                            e = e4;
                            nh.d.a(e);
                            if (byteArrayOutputStream2 != null) {
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (IOException e14) {
                                    e = e14;
                                    byteArray = null;
                                    nh.d.a(e);
                                }
                            }
                            byteArray = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th3 = th;
                        if (byteArrayOutputStream != null) {
                            throw th3;
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th3;
                        } catch (IOException e15) {
                            nh.d.a(e15);
                            throw th3;
                        }
                    }
                }
                byteArray = byteArrayOutputStream2.toByteArray();
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException e16) {
                    e = e16;
                    nh.d.a(e);
                }
            } catch (Exception e17) {
                e = e17;
                byteArrayOutputStream2 = null;
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream = null;
                th3 = th;
                if (byteArrayOutputStream != null) {
                    throw th3;
                }
                byteArrayOutputStream.close();
                throw th3;
            }
            bArrA = c.a(bytes, byteArray, ch.d.b(str7, str6, bytes2));
        } else {
            bArrA = c.a(bytes, bytes2);
        }
        d dVar = new d(z15, bArrA);
        eh.a.b bVarA = eh.a.a(context, new eh.a.C1357a(str2, f(str, dVar.f71576a), dVar.f71577b));
        if (bVarA == null) {
            f.n("Response is null.");
            return null;
        }
        d dVar2 = new d(i(bVarA), bVarA.f64024b);
        String str8 = (String) mapF.get("iSr");
        try {
            byteArrayInputStream2 = new ByteArrayInputStream(dVar2.f71577b);
            try {
                try {
                    byte[] bArr = new byte[5];
                    byteArrayInputStream2.read(bArr);
                    byte[] bArr2 = new byte[Integer.parseInt(new String(bArr))];
                    byteArrayInputStream2.read(bArr2);
                    str3 = new String(bArr2);
                    try {
                        byte[] bArr3 = new byte[5];
                        byteArrayInputStream2.read(bArr3);
                        int i15 = Integer.parseInt(new String(bArr3));
                        if (i15 > 0) {
                            byte[] bArrB = new byte[i15];
                            byteArrayInputStream2.read(bArrB);
                            if (cVar.f71574a) {
                                bArrB = ch.d.a(cVar.f71575b, str8, bArrB);
                            }
                            if (dVar2.f71576a) {
                                bArrB = ch.b.b(bArrB);
                            }
                            str4 = new String(bArrB);
                        } else {
                            str4 = null;
                        }
                        try {
                            byteArrayInputStream2.close();
                        } catch (Exception unused2) {
                        }
                    } catch (Exception e18) {
                        e = e18;
                        nh.d.a(e);
                        if (byteArrayInputStream2 != null) {
                            try {
                                byteArrayInputStream2.close();
                            } catch (Exception unused3) {
                            }
                        }
                        str4 = null;
                    }
                } catch (Exception e19) {
                    e = e19;
                    str3 = null;
                    nh.d.a(e);
                    if (byteArrayInputStream2 != null) {
                        byteArrayInputStream2.close();
                    }
                    str4 = null;
                    if (str3 == null) {
                        bVar = new b(str3, str4);
                    } else {
                        bVar = new b(str3, str4);
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    str5 = bVar.f71572a;
                    if (TextUtils.isEmpty(str5)) {
                        return bVar;
                    }
                    try {
                        jSONObject = new JSONObject(str5).getJSONObject("data");
                        if (!jSONObject.has("params")) {
                            return bVar;
                        }
                        strOptString = jSONObject.getJSONObject("params").optString("public_key", null);
                        if (!TextUtils.isEmpty(strOptString)) {
                            return bVar;
                        }
                        ah.b.b(strOptString);
                        if (z14) {
                            return b(aVar, context, str, str2, false);
                        }
                        return bVar;
                    } catch (JSONException e24) {
                        nh.d.a(e24);
                        return bVar;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception e25) {
            e = e25;
            byteArrayInputStream2 = null;
        } catch (Throwable th7) {
            th = th7;
            byteArrayInputStream = null;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
            throw th;
        }
        if (str3 == null || str4 != null) {
            bVar = new b(str3, str4);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        str5 = bVar.f71572a;
        if (TextUtils.isEmpty(str5)) {
            return bVar;
        }
        jSONObject = new JSONObject(str5).getJSONObject("data");
        if (!jSONObject.has("params")) {
            return bVar;
        }
        strOptString = jSONObject.getJSONObject("params").optString("public_key", null);
        if (!TextUtils.isEmpty(strOptString)) {
            return bVar;
        }
        ah.b.b(strOptString);
        if (z14) {
            return b(aVar, context, str, str2, false);
        }
        return bVar;
    }

    public String c(lh.a aVar) {
        HashMap<String, String> map = new HashMap<>();
        map.put("device", Build.MODEL);
        map.put("namespace", "com.alipay.mobilecashier");
        map.put("api_name", "com.alipay.mcpay");
        map.put("api_version", j());
        return e(aVar, map, new HashMap<>());
    }

    public String d(lh.a aVar, String str, JSONObject jSONObject) {
        lh.b bVarB = lh.b.b();
        mh.a aVarA = mh.a.a(bVarB.f112390a);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        boolean z14 = false;
        try {
            JSONObject[] jSONObjectArr = {jSONObject2, jSONObject};
            for (int i14 = 0; i14 < 2; i14++) {
                JSONObject jSONObject4 = jSONObjectArr[i14];
                if (jSONObject4 != null) {
                    Iterator<String> itKeys = jSONObject4.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject3.put(next, jSONObject4.get(next));
                    }
                }
            }
        } catch (JSONException e4) {
            nh.d.a(e4);
        }
        try {
            jSONObject3.put("external_info", str);
            jSONObject3.put("tid", aVarA.f118448a);
            jSONObject3.put("user_agent", ah.b.c().a(aVar, aVarA));
            jSONObject3.put("has_alipay", n.j(aVar, bVarB.f112390a, ug.a.f170550d, false));
            try {
                if (bVarB.f112390a.getPackageManager().getPackageInfo("com.alipay.android.app", 128) != null) {
                    z14 = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            jSONObject3.put("has_msp_app", z14);
            jSONObject3.put("app_key", "2014052600006128");
            jSONObject3.put("utdid", bVarB.a());
            jSONObject3.put("new_client_key", aVarA.f118449b);
            jSONObject3.put("pa", ah.b.d(bVarB.f112390a));
        } catch (Throwable th3) {
            wg.a.d(aVar, "biz", "BodyErr", th3);
            nh.d.a(th3);
        }
        return jSONObject3.toString();
    }

    public String e(lh.a aVar, HashMap<String, String> map, HashMap<String, String> map2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        JSONObject jSONObject3 = new JSONObject();
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            jSONObject3.put(entry2.getKey(), entry2.getValue());
        }
        jSONObject2.put("params", jSONObject3);
        jSONObject.put("data", jSONObject2);
        return jSONObject.toString();
    }

    public HashMap f(String str, boolean z14) {
        HashMap map = new HashMap();
        map.put("msp-gzip", String.valueOf(z14));
        map.put("Operation-Type", "alipay.msp.cashier.dispatch.bytes");
        map.put(HttpHeaders.CONTENT_TYPE, "application/octet-stream");
        map.put("Version", "2.0");
        map.put("AppId", "TAOBAO");
        String strM = "";
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("&");
            if (strArrSplit.length != 0) {
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                for (String str2 : strArrSplit) {
                    if (TextUtils.isEmpty(strA)) {
                        strA = !str2.contains("biz_type") ? null : a.a(str2);
                    }
                    if (TextUtils.isEmpty(strA2)) {
                        strA2 = !str2.contains("biz_no") ? null : a.a(str2);
                    }
                    if (TextUtils.isEmpty(strA3)) {
                        strA3 = (!str2.contains("trade_no") || str2.startsWith("out_trade_no")) ? null : a.a(str2);
                    }
                    if (TextUtils.isEmpty(strA4)) {
                        strA4 = !str2.contains("app_userid") ? null : a.a(str2);
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                if (!TextUtils.isEmpty(strA)) {
                    sb3.append("biz_type=" + strA + ";");
                }
                if (!TextUtils.isEmpty(strA2)) {
                    sb3.append("biz_no=" + strA2 + ";");
                }
                if (!TextUtils.isEmpty(strA3)) {
                    sb3.append("trade_no=" + strA3 + ";");
                }
                if (!TextUtils.isEmpty(strA4)) {
                    sb3.append("app_userid=" + strA4 + ";");
                }
                String string = sb3.toString();
                strM = string.endsWith(";") ? fb1.c.m(1, 0, string) : string;
            }
        }
        map.put("Msp-Param", strM);
        map.put("des-mode", "CBC");
        return map;
    }

    public abstract JSONObject g();

    public String j() {
        return "4.9.0";
    }
}
