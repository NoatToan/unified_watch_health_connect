package defpackage;

import android.os.Looper;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class vyk {
    public static Map<String, String> e() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            LogUtil.j("AdvertisingUtils", "this is main thread, getUserAdvertisingInfo error.");
            throw new IllegalThreadStateException("getUserAdvertisingInfo not allow InMainThread, please use this in new thread!");
        }
        return new HashMap(2);
    }
}
