package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class tej {
    public static void a(int i) {
        Context context = BaseApplication.getContext();
        if (i != 0) {
            SharedPreferenceManager.e(context, String.valueOf(10000), "ecg_blocklist", "", null);
            return;
        }
        String strC = c(context);
        if (e(strC)) {
            SharedPreferenceManager.e(context, String.valueOf(10000), "ecg_blocklist", strC, null);
            fks.d().d(new IBaseResponseCallback() { // from class: tej.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.a("EcgBlockListUtil", "sendEcgBlockList errorCode : ", Integer.valueOf(i2));
                }
            }, strC);
        }
    }

    private static String c(Context context) {
        try {
            return d(context.getFilesDir().getCanonicalPath() + File.separator + "lightcloud" + File.separator + "ecgblock" + File.separator + "ecg_block_list.json");
        } catch (IOException unused) {
            LogUtil.e("EcgBlockListUtil", "parseFile getCanonicalPath error");
            return "";
        }
    }

    private static String d(String str) {
        String str2 = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                if (fileInputStream.read(bArr) > 0) {
                    str2 = new String(bArr, "UTF-8");
                }
                fileInputStream.close();
                return str2;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.e("EcgBlockListUtil", "getStringFile IOException ");
            return "";
        }
    }

    private static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("EcgBlockListUtil", "handleJson json is is empty");
            return false;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "ecg_blocklist");
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        try {
            return new JSONObject(str).getInt("versionCode") > new JSONObject(strE).getInt("versionCode");
        } catch (JSONException unused) {
            LogUtil.e("EcgBlockListUtil", "handleJson JSONException");
        }
    }
}
