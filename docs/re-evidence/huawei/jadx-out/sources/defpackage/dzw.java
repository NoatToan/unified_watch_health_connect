package defpackage;

import android.content.SharedPreferences;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dzw {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(String str, T t) {
        LogUtil.a("PluginDevice_ScaleSharedPreferenceHelper", "enter putDataByKey spFieldName: ", str, " spFieldValue: ", CommonUtil.n(t.toString()));
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("scaleSp", 0).edit();
        if (t instanceof Integer) {
            editorEdit.putInt(str, ((Integer) t).intValue());
        } else if (!(t instanceof String)) {
            LogUtil.j("PluginDevice_ScaleSharedPreferenceHelper", "putDataByKey else");
        } else {
            editorEdit.putString(str, (String) t);
        }
        editorEdit.commit();
    }

    public static <T> T c(String str, T t) {
        LogUtil.a("PluginDevice_ScaleSharedPreferenceHelper", "enter getDataByKey spFieldName: ", str, " dataType: ", CommonUtil.n(t.toString()));
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("scaleSp", 0);
        if (t instanceof Integer) {
            return (T) Integer.valueOf(sharedPreferences.getInt(str, 0));
        }
        if (t instanceof String) {
            return (T) sharedPreferences.getString(str, "");
        }
        return (T) sharedPreferences.getString(str, "");
    }
}
