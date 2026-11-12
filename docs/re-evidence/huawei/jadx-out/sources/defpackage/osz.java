package defpackage;

import android.text.TextUtils;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class osz {
    public static String c(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            str2 = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + "achievemedal" + File.separator + str;
        } catch (IOException e) {
            LogUtil.e("PLGACHIEVE_TexturePathManager", "FileNotFoundException:", e.getMessage());
            str2 = "";
        }
        StringBuilder sb = new StringBuilder(str2);
        sb.append(File.separator);
        String string = sb.toString();
        sb.append("texture.jpg");
        return pax.c(sb.toString()) ? string : "";
    }

    public static boolean e(String str, String str2, String str3) {
        if (a(str2)) {
            return false;
        }
        if (pax.k(str3) && !TextUtils.isEmpty(str)) {
            try {
                return c(str2, new JSONObject(str)) != 0;
            } catch (JSONException unused) {
                LogUtil.e("PLGACHIEVE_TexturePathManager", "parseJsonData Exception");
            }
        }
        return true;
    }

    public static boolean a(String str) {
        return "66".equals(str);
    }

    public static boolean b(String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_TexturePathManager", "createFileDir: untrusted -> " + str);
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        boolean zMkdirs = file.mkdirs();
        LogUtil.a("PLGACHIEVE_TexturePathManager", "create dir:", zMkdirs ? "sucess" : ParamConstants.CallbackMethod.ON_FAIL);
        return zMkdirs;
    }

    public static String c(String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.contains("_")) {
            return "";
        }
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length < 2) {
            return "";
        }
        if (z) {
            return strArrSplit[0];
        }
        return strArrSplit[1];
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            iLastIndexOf = 0;
        }
        return str.substring(iLastIndexOf, str.length());
    }

    public static int c(String str, JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return 0;
        }
        try {
            return jSONObject.getInt(str);
        } catch (JSONException unused) {
            LogUtil.e("PLGACHIEVE_TexturePathManager", "judgeValidKey Exception");
            return 0;
        }
    }
}
