package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class wnh {
    public static void e(Context context, int i, String str) throws Throwable {
        if (i != 0) {
            SharedPreferenceManager.e(context, String.valueOf(10000), "airule_v1", "0", new StorageParams());
            return;
        }
        int iB = b(context, str);
        LogUtil.a("UIDV_AiRuleParse", "AiRuleParse resCode = ", Integer.valueOf(iB));
        if (iB != 0) {
            SharedPreferenceManager.e(context, String.valueOf(10000), "airule_v1", "0", new StorageParams());
            SharedPreferenceManager.e(context, String.valueOf(10000), "airule_ver", "0", new StorageParams());
            return;
        }
        LogUtil.a("UIDV_AiRuleParse", "AiRuleParse saveResult = ", Integer.valueOf(iB));
        SharedPreferenceManager.e(context, String.valueOf(10000), "airule_v1", "1", new StorageParams());
        Intent intent = new Intent("com.huawei.bone.action.AIRULE_PARSE_SUCCESS");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        context.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static int b(Context context, String str) throws Throwable {
        LogUtil.a("UIDV_AiRuleParse", "parseResult");
        int iE = -1;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UIDV_AiRuleParse", "filePath is empty");
            return -1;
        }
        String strB = b(str);
        if (!TextUtils.isEmpty(strB)) {
            iE = e(context, strB);
        } else {
            LogUtil.a("UIDV_AiRuleParse", "resp is null ");
        }
        LogUtil.a("UIDV_AiRuleParse", "AIRuleParse finish ");
        return iE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.FileInputStream, java.io.InputStream] */
    private static String b(String str) throws Throwable {
        ?? fileInputStream;
        String str2;
        String str3 = "";
        ?? r3 = 0;
        ?? r4 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    int i = fileInputStream.read(bArr);
                    String str4 = str3;
                    ?? r5 = i;
                    if (i > 0) {
                        String str5 = new String(bArr, "UTF-8");
                        str4 = str5;
                        r5 = str5;
                    }
                    try {
                        fileInputStream.close();
                        str2 = str4;
                        r3 = r5;
                    } catch (IOException unused) {
                        LogUtil.e("UIDV_AiRuleParse", "inputStream.close IOException");
                        str2 = str4;
                        r3 = r5;
                    }
                } catch (IOException unused2) {
                    r4 = fileInputStream;
                    LogUtil.e("UIDV_AiRuleParse", "getStringFile IOException");
                    str2 = str3;
                    r3 = r4;
                    if (r4 != 0) {
                        try {
                            r4.close();
                            str2 = str3;
                            r3 = r4;
                        } catch (IOException unused3) {
                            LogUtil.e("UIDV_AiRuleParse", "inputStream.close IOException");
                            str2 = str3;
                            r3 = r4;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != 0) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused4) {
                            LogUtil.e("UIDV_AiRuleParse", "inputStream.close IOException");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = r3;
            }
        } catch (IOException unused5) {
        }
        return str2;
    }

    private static int e(Context context, String str) {
        LogUtil.a("UIDV_AiRuleParse", "saveParse");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("service");
            boolean z = jSONObject.getBoolean(k.g);
            LogUtil.a("UIDV_AiRuleParse", "service = ", string);
            LogUtil.a("UIDV_AiRuleParse", "enable = ", Boolean.valueOf(z));
            JSONArray jSONArray = new JSONArray(jSONObject.getString("modules"));
            int i = jSONArray.length() > 0 ? 0 : -1;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                String string2 = jSONObject2.getString("module");
                LogUtil.a("UIDV_AiRuleParse", "module = ", string2);
                if (!TextUtils.isEmpty(string2)) {
                    String strValueOf = String.valueOf(c(string2));
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("airules");
                    for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                        String string3 = jSONObject3.getString("airule");
                        LogUtil.d("UIDV_AiRuleParse", "airuleName = ", string3);
                        if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(strValueOf)) {
                            SharedPreferenceManager.e(context, strValueOf, string3, jSONObject3.toString(), new StorageParams());
                        } else {
                            LogUtil.a("UIDV_AiRuleParse", "airuleName or moduleId is null");
                        }
                    }
                }
            }
            return i;
        } catch (JSONException e) {
            LogUtil.e("UIDV_AiRuleParse", "JSONException ", e.getMessage());
            return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    private static int c(String str) {
        byte b2;
        int i;
        str.hashCode();
        switch (str) {
            case "bloodp":
                b2 = 0;
                break;
            case "common":
                b2 = 1;
                break;
            case "weight":
                b2 = 2;
                break;
            case "bloodsg":
                b2 = 3;
                break;
            case "info":
                b2 = 4;
                break;
            case "walk":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            i = 30002;
        } else if (b2 == 1) {
            i = 30005;
        } else if (b2 == 2) {
            i = 30001;
        } else if (b2 == 3) {
            i = 30006;
        } else if (b2 != 4) {
            i = b2 != 5 ? 30004 : 30000;
        } else {
            i = OnRegisterSkinAttrsListener.REGISTER_BY_SCAN;
        }
        LogUtil.a("UIDV_AiRuleParse", "moduleId = ", Integer.valueOf(i));
        return i;
    }
}
