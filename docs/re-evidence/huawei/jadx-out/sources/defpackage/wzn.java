package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class wzn {
    public static wzo b(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            LogUtil.a("AliSportManager", "aliAuth activity = null or authInfo empty");
            return null;
        }
        return new wzo(new AuthTask(activity).authV2(str, true), true);
    }
}
