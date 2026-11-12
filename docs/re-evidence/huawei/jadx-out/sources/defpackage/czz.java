package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;

/* JADX INFO: loaded from: classes23.dex */
public class czz {
    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PersonalInfo_HeadImageUtils", "setHeadImage path is null");
            return;
        }
        Context context = BaseApplication.getContext();
        KeyValDbManager.d(context).c("user_profile_head_image_signature" + nio.e(LoginInit.getInstance(context).getAccountInfo(1011)), nio.e(str), null);
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Context context = BaseApplication.getContext();
        String str2 = "user_profile_head_image_signature" + nio.e(LoginInit.getInstance(context).getAccountInfo(1011));
        String strE = nio.e(str);
        String strC = KeyValDbManager.d(context).c(str2);
        if (TextUtils.isEmpty(strC) || !strC.equals(strE)) {
            return false;
        }
        String strA = a();
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        return new File(strA).exists();
    }

    public static void b(String str) {
        if (str == null) {
            LogUtil.j("PersonalInfo_HeadImageUtils", "setHeadImage path is null");
            return;
        }
        Context context = BaseApplication.getContext();
        SharedPreferenceManager.e(context, String.valueOf(PrebakedEffectId.RT_FLY), "user_profile_head_image_local_prefix_" + nio.e(LoginInit.getInstance(context).getAccountInfo(1011)), str, new StorageParams(1));
    }

    public static String a() {
        LogUtil.a("PersonalInfo_HeadImageUtils", "getHeadImageLocalPath.");
        return LoginInit.getInstance(BaseApplication.getContext()).getHeadImagePath();
    }

    public static void b(final Context context, final String str, final BaseResponseCallback<String> baseResponseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: czz.1
            @Override // java.lang.Runnable
            public void run() {
                Bitmap bitmapC = qqf.c(context, str);
                String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
                if (TextUtils.isEmpty(accountInfo)) {
                    LogUtil.j("PersonalInfo_HeadImageUtils", "downloadHeadPicInBackground run userId is empty");
                    BaseResponseCallback baseResponseCallback2 = baseResponseCallback;
                    if (baseResponseCallback2 != null) {
                        baseResponseCallback2.onResponse(-1, null);
                        return;
                    }
                    return;
                }
                String strB = lod.b(context, accountInfo, bitmapC);
                BaseResponseCallback baseResponseCallback3 = baseResponseCallback;
                if (baseResponseCallback3 != null) {
                    baseResponseCallback3.onResponse(0, strB);
                }
            }
        });
    }
}
