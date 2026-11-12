package defpackage;

import com.huawei.ads.adsrec.IUtilCallback;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;

/* JADX INFO: loaded from: classes4.dex */
public class axy {
    public static boolean a() {
        IUtilCallback iUtilCallbackC = awz.c();
        return iUtilCallbackC != null && "1".equals(iUtilCallbackC.getConfig(ConfigMapKeys.BACK_FLOW_SWITCH));
    }
}
