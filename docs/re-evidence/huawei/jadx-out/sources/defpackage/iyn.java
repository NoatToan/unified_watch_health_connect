package defpackage;

import android.os.IBinder;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class iyn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IBaseResponseCallback f38214c;
    private static IBinder e;

    public static void b(IBinder iBinder, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Track_TrackDeveloperUtils", "enter setBinderAndRegisterCallback");
        if (e == null) {
            LogUtil.a("Track_TrackDeveloperUtils", "mProxy is null, set value");
            e = iBinder;
        }
        f38214c = iBaseResponseCallback;
    }

    public static void b(IBinder iBinder) {
        LogUtil.a("Track_TrackDeveloperUtils", "enter setBinderAndStartService");
        if (e == null) {
            e = iBinder;
        }
        e();
    }

    public static void e() {
        LogUtil.a("Track_TrackDeveloperUtils", "enter pourInterfaceToKitSportApi");
        if (e == null) {
            LogUtil.j("Track_TrackDeveloperUtils", "mProxy == null, request new binder");
            IBaseResponseCallback iBaseResponseCallback = f38214c;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, "");
                return;
            }
            return;
        }
        b();
    }

    public static void d() {
        if (e == null) {
            LogUtil.j("Track_TrackDeveloperUtils", "onKillProxy mProxy == null ");
            return;
        }
        LogUtil.a("Track_TrackDeveloperUtils", "recycle proxy");
        e = null;
        b();
    }

    private static void b() {
        LogUtil.a("Track_TrackDeveloperUtils", "set binder: ", e);
        HiHealthNativeApi.a(BaseApplication.getContext()).setBinder("TrackDeveloperService", e, new HiCommonListener() { // from class: iyn.4
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a("Track_TrackDeveloperUtils", "setBinder onSuccess = ", Integer.valueOf(i));
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j("Track_TrackDeveloperUtils", "setBinder onFailure = ", Integer.valueOf(i));
            }
        });
    }
}
