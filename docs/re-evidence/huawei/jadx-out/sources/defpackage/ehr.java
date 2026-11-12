package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ehr {
    private final String e;

    public ehr(String str) {
        this.e = str;
    }

    public ehp a() {
        if (TextUtils.isEmpty(this.e)) {
            LogUtil.a("UxConfigParse", "getUxConfigInfo productId is empty");
            return null;
        }
        return c(e());
    }

    private String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(dxc.d);
        sb.append(this.e);
        String strC = CommonUtil.c(sb.toString());
        if (!TextUtils.isEmpty(strC) && new File(strC).exists()) {
            sb.append(File.separator);
        } else {
            sb = new StringBuilder();
            sb.append(dxc.f32475b);
        }
        sb.append(this.e);
        sb.append(File.separator);
        sb.append("UxConfig.json");
        return sb.toString();
    }

    private ehp c(String str) throws Throwable {
        LogUtil.a("UxConfigParse", "loadUxConfigInfo");
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("UxConfigParse", "loadUxConfigInfo validPath is empty");
            return null;
        }
        File file = new File(strC);
        if (!file.exists()) {
            LogUtil.j("UxConfigParse", "loadUxConfigInfo file not exists");
            return null;
        }
        JSONObject jSONObjectC = EzPluginManager.c(file);
        if (jSONObjectC == null) {
            LogUtil.j("UxConfigParse", "loadUxConfigInfo jsonObject is null");
            return null;
        }
        return (ehp) new Gson().fromJson(jSONObjectC.toString(), new TypeToken<ehp>() { // from class: com.huawei.health.ecologydevice.fitness.uxconfig.UxConfigParse$1
        }.getType());
    }
}
