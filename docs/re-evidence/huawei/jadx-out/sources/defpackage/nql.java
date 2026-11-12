package defpackage;

import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwonesdk.process.HiHealthProcess;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nql {
    public static void d(String str, HiHealthProcess hiHealthProcess, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.c("HiHealthProcess_OneSdkFactory", "callback is null in execute");
        } else if (hiHealthProcess == null) {
            LogUtil.a("HiHealthProcess_OneSdkFactory", "hiHealthProcess is null in execute");
            iBaseResponseCallback.onResponse(-1, "");
        } else {
            hiHealthProcess.doAction(str, iBaseResponseCallback);
        }
    }
}
