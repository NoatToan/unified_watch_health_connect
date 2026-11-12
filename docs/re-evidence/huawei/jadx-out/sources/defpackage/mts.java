package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.Settings;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EmuiBuild;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mts {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f42407b;

    static {
        if (CommonUtil.av()) {
            f42407b = new String[]{"hiCall_enable", "hiCall_registered", "hiCall_nick_name", "hiCall_registed_phonenum", "hicall_registering_background", "hicall_enable_manually", "hicall_phone_number_country_iso", "hicall_enable_message"};
            return;
        }
        if (CommonUtil.ax()) {
            f42407b = new String[]{"hiCall_enable", "hiCall_registered", "hiCall_nick_name", "hiCall_registed_phonenum", "hicall_registering_background", "hicall_enable_manually", "hicall_phone_number_country_iso"};
        } else if (CommonUtil.bb()) {
            f42407b = new String[]{"hiCall_enable", "hiCall_registered", "hiCall_nick_name", "hiCall_registed_phonenum", "hicall_registering_background", "hicall_enable_manually"};
        } else {
            f42407b = new String[0];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (r11 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (context == null) {
            LogUtil.j("ContactSync", 1, "HiCallUtils", "buildHiCallStatus: context is null");
            return jSONObject;
        }
        Uri uriB = b();
        if (uriB == Uri.EMPTY) {
            LogUtil.a("ContactSync", 1, "HiCallUtils", "buildHiCallStatus: uri is empty. ");
            return jSONObject;
        }
        if (e(context)) {
            try {
                Cursor cursorQuery = context.getContentResolver().query(uriB, f42407b, null, null, null);
                try {
                    if (cursorQuery == null) {
                        LogUtil.j("ContactSync", 1, "HiCallUtils", "buildHiCallStatus: cursor is null");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                            return jSONObject;
                        }
                    } else {
                        while (cursorQuery.moveToNext()) {
                            jSONObject.put("hiCall_enable", cursorQuery.getInt(0));
                            jSONObject.put("hiCall_registered", cursorQuery.getInt(1));
                            jSONObject.put("hiCall_nick_name", cursorQuery.getString(2));
                            jSONObject.put("hiCall_registed_phonenum", cursorQuery.getString(3));
                            jSONObject.put("hicall_registering_background", cursorQuery.getInt(4));
                            jSONObject.put("hicall_enable_manually", cursorQuery.getInt(5));
                            if (CommonUtil.ax()) {
                                jSONObject.put("hicall_phone_number_country_iso", cursorQuery.getString(6));
                            }
                            if (CommonUtil.av()) {
                                jSONObject.put("hicall_enable_message", cursorQuery.getInt(7));
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (SQLiteException | IllegalArgumentException | SecurityException | JSONException e) {
                LogUtil.e("", "ContactSync", 1, "HiCallUtils", ExceptionUtils.c(e));
            }
        }
        return jSONObject;
    }

    private static boolean e(Context context) {
        if (context == null) {
            LogUtil.a("ContactSync", 1, "HiCallUtils", "isMeetingEnable: context is empty. ");
            return false;
        }
        try {
            int i = Settings.Secure.getInt(context.getContentResolver(), "hiCall_enable", -1);
            LogUtil.a("ContactSync", 1, "HiCallUtils", "isMeetingEnable: enable is ", Integer.valueOf(i));
            return i != 0;
        } catch (Exception e) {
            LogUtil.e("", "ContactSync", 1, "HiCallUtils", ExceptionUtils.c(e));
        }
    }

    public static String a(mtu mtuVar) {
        if (mtuVar == null) {
            LogUtil.j("ContactSync", 1, "HiCallUtils", "getHiCallModelString invalid parameter");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_phone_number", mtuVar.p());
            jSONObject.put("device_com_id", mtuVar.d());
            jSONObject.put(DeviceCategoryFragment.DEVICE_TYPE, mtuVar.i());
            jSONObject.put("device_is_private", mtuVar.s());
            jSONObject.put("device_profile", mtuVar.h());
            jSONObject.put("is_same_vibration", mtuVar.q());
            jSONObject.put("device_ordinal", mtuVar.l());
            jSONObject.put("device_normalized_number", mtuVar.m());
            jSONObject.put("device_nick_name", mtuVar.c());
            jSONObject.put("device_display_name", mtuVar.a());
            jSONObject.put("device_id", mtuVar.j());
            jSONObject.put("message_profile", mtuVar.n());
            jSONObject.put("latest_login_time", mtuVar.k());
            jSONObject.put("insert_time", mtuVar.o());
            jSONObject.put("device_model", mtuVar.b());
            jSONObject.put("hi_call_user_name", mtuVar.f());
            jSONObject.put("device_status", mtuVar.g());
            jSONObject.put("hi_call_account_id", mtuVar.e());
        } catch (JSONException unused) {
            LogUtil.e("", "ContactSync", 1, "HiCallUtils", "getHiCallModelString JSONException");
        }
        return jSONObject.toString();
    }

    private static boolean a() {
        return e() >= 19;
    }

    private static int e() {
        return EmuiBuild.e;
    }

    private static int c() {
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("ContactSync", 1, "HiCallUtils", "getHiCallVersion: context is null.");
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.huawei.hwvoipservice", 128);
            if (applicationInfo.metaData == null) {
                LogUtil.j("ContactSync", 1, "HiCallUtils", "getHiCallVersion: appInfo.metaData is null.");
                return 0;
            }
            return applicationInfo.metaData.getInt("com.huawei.hwvoipservice.arch.version");
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("", "ContactSync", 1, "getHiCallVersion: the parameters are null");
            return 0;
        }
    }

    public static Uri b() {
        if (!CommonUtil.bg() || !a()) {
            LogUtil.a("ContactSync", 1, "HiCallUtils", "buildHiCallStatus: not support.");
            return Uri.EMPTY;
        }
        return Uri.parse("content://" + (c() == 20 ? "com.huawei.meetime.hicall" : "com.huawei.hwvoipservice.hicall") + "/caas_hicall_status");
    }

    public static String d() {
        return c() == 20 ? "com.huawei.meetime.account" : "com.huawei.hwvoipservice.account";
    }
}
