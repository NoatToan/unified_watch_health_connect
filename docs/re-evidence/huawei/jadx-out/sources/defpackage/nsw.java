package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.login.ui.login.LoginInit;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes39.dex */
public class nsw {
    public static void d(final int i, final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: nsw.4
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList(5);
                SmartMsgDbObject smartMsgDbObjectC = nta.c(BaseApplication.getContext()).c(nsv.e(BaseApplication.getContext()).a(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), i), i, 0);
                if (smartMsgDbObjectC != null) {
                    LogUtil.a("SMART_SmarterData", "Smart card msg = ", Integer.valueOf(smartMsgDbObjectC.getId()));
                    arrayList.add(smartMsgDbObjectC);
                }
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, arrayList);
                }
            }
        });
    }
}
