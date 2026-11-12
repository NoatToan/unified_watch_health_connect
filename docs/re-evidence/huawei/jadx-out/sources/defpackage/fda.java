package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class fda {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("ts")
    private long f33870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("greyRules")
    private Map<String, Object> f33871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("configId")
    private String f33872c;

    @SerializedName("matchRules")
    private Map<String, String> d;

    @SerializedName("source")
    private int e;

    public fda(String str, Map<String, String> map) {
        Objects.requireNonNull(str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("RequestBody", "configId is empty.");
            return;
        }
        this.f33870a = System.currentTimeMillis();
        this.e = 1;
        this.f33872c = str;
        this.d = map;
        if (fei.d(str, map)) {
            LogUtil.a("RequestBody", "isNeedAddGrayscale is open.");
            HashMap map2 = new HashMap();
            map2.put("version", "1.0.0");
            map2.put("type", 1);
            if (CommonUtil.cl() && !Utils.o()) {
                map2.put("Device-ID", "10.21.21.104");
            }
            this.f33871b = map2;
        }
    }

    public String b() {
        return this.f33872c;
    }
}
