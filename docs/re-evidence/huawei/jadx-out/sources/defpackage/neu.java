package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.ThermalCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public final class neu {
    public static void e() {
        ReleaseLogUtil.d("Dfx_Utils", "collectDataCompleteDfxLog enter");
        if (CommonUtil.ap()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ner
                @Override // java.lang.Runnable
                public final void run() {
                    neu.d();
                }
            });
        }
        CommonUtil.c();
        if (!ThermalCallback.getInstance().isTriggerTask()) {
            ReleaseLogUtil.e("Dfx_Utils", "mNonLocalBroadcastReceiver does not have the conditions to trigger the task");
        } else if (CommonUtil.ck()) {
            ReleaseLogUtil.d("Dfx_Utils", "ToDo dfx sync...");
            ThreadPoolManager.c().execute(new Runnable() { // from class: neu.4
                @Override // java.lang.Runnable
                public void run() {
                    neu.c();
                }
            });
        }
    }

    static /* synthetic */ void d() {
        ltr.b().init(BaseApplication.getContext());
        if (Utils.o()) {
            ltr.b().setProductType(20);
        } else {
            ltr.b().setProductType(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        ReleaseLogUtil.d("Dfx_Utils", "getMainWhenSyncSuccess()");
        boolean z = CommonUtil.ap() && Utils.o();
        if (Utils.k() || z) {
            ReleaseLogUtil.d("Dfx_Utils", "not support oversea no cloud version");
        } else {
            mni.e(BaseApplication.getContext()).e(0, new b());
        }
    }

    static class b implements DeviceDfxBaseResponseCallback {
        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onProgress(int i, String str) {
        }

        b() {
            LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "init InnerDeviceDfxBaseResponseCallback");
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onSuccess(int i, String str) {
            ReleaseLogUtil.d("Dfx_Utils", "getMaintenanceFile onSuccess ,suc_code: ", Integer.valueOf(i));
            mfz.d(6, false);
            mni.e(BaseApplication.getContext()).c(str);
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.d("Dfx_Utils", "getMaintenanceFile ,onFailure err_code: ", Integer.valueOf(i));
            mfz.d(6, false);
            mni.e(BaseApplication.getContext()).c(mjh.f(str));
        }
    }

    public static boolean b(int i) {
        return i == 7 || i == 8 || c(i) || i >= 32;
    }

    private static boolean c(int i) {
        return i == 13 || i == 14 || e(i);
    }

    private static boolean e(int i) {
        return i == 15 || i == 16 || d(i);
    }

    private static boolean d(int i) {
        return i == 18 || i == 19 || a(i);
    }

    private static boolean a(int i) {
        return i == 20 || i == 21 || i == 10 || eel.d(i);
    }
}
