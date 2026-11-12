package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.CommonUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes19.dex */
public class wve {
    public static void d(Properties properties, Map<Integer, Integer> map) {
        for (Map.Entry entry : properties.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if ((key instanceof String) && (value instanceof String)) {
                map.put(Integer.valueOf(CommonUtil.j((String) key)), Integer.valueOf(qre.e((String) value, "string", R.string.class)));
            } else {
                LogUtil.j("StringUtil", "initAdviceString class type error");
            }
        }
    }

    public static Properties c(String str) {
        Context context = BaseApplication.getContext();
        Properties properties = new Properties();
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                properties.load(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                    return properties;
                }
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.e("StringUtil", "getProperties IOException");
        }
        return properties;
    }
}
