package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.EnvironmentInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mtp {
    public static JSONObject e(Context context) {
        Bundle bundleCall;
        JSONObject jSONObject = new JSONObject();
        if (context == null) {
            LogUtil.j("ContactUtils", "buildContactConfig: context is null");
            return jSONObject;
        }
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = null;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver == null) {
                    ReleaseLogUtil.e("R_ContactUtils", "buildContactConfig: contentResolver is null");
                    return jSONObject;
                }
                if (EnvironmentInfo.g()) {
                    contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient("com.huawei.contacts.app");
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        ReleaseLogUtil.e("R_ContactUtils", "buildContactConfig: contentProviderClient is null");
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                            return jSONObject;
                        }
                    } else {
                        bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("com.huawei.contacts.app", "call_method_query_config", "", new Bundle());
                    }
                    return jSONObject;
                }
                bundleCall = contentResolver.call("com.huawei.contacts.app", "call_method_query_config", "", new Bundle());
                if (bundleCall == null) {
                    LogUtil.j("ContactUtils", "buildContactConfig: result is null");
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                        return jSONObject;
                    }
                } else {
                    String string = bundleCall.getString("contacts.CONTACT_CONFIG");
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject2 = new JSONObject(string);
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        return jSONObject2;
                    }
                    LogUtil.j("ContactUtils", "buildContactConfig: config is null");
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                        return jSONObject;
                    }
                }
                return jSONObject;
            } catch (Exception e) {
                ReleaseLogUtil.a("R_ContactUtils", "buildContactConfig: exception occurred.", ExceptionUtils.c(e));
                if (0 != 0) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            throw th;
        }
    }

    public static String b(String str) {
        String strB = b("_id", str);
        if (TextUtils.isEmpty(strB)) {
            return b() + " AND " + e();
        }
        return strB + " AND " + b() + " AND " + e();
    }

    public static String a(String str) {
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            return e();
        }
        return strE + " AND " + e();
    }

    public static String d(String str) {
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            return e();
        }
        return strE + " AND " + b() + " AND " + e();
    }

    public static String c() {
        return d() + " AND " + a();
    }

    public static String c(String str) {
        String strB = b("raw_contact_id", str);
        if (TextUtils.isEmpty(strB)) {
            return e();
        }
        return strB + " AND " + e();
    }

    private static String e() {
        return "(account_type IS NULL OR account_type NOT IN (" + mtj.c() + "))";
    }

    private static String b() {
        return "deleted=0";
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "contact_id IN (" + str + Constants.RIGHT_BRACKET_ONLY;
    }

    private static String b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        return str + " IN (" + str2 + Constants.RIGHT_BRACKET_ONLY;
    }

    private static String d() {
        return "has_phone_number=1";
    }

    private static String a() {
        return "contact_last_updated_timestamp>=?";
    }
}
