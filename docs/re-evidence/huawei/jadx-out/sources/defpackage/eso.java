package defpackage;

import com.huawei.ecologydevice.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes7.dex */
public class eso {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f33419b = false;

    public static void b(String str) {
        LogUtil.a("DeviceVoiceUtils", "init and start service");
        if (UnitUtil.f()) {
            LogUtil.a("DeviceVoiceUtils", "unexpected imperial unit status, not init voice service");
        } else {
            jau.c().j(str);
            f33419b = true;
        }
    }

    public static void a(String str) {
        LogUtil.a("DeviceVoiceUtils", "Destroy and stop service");
        if (f33419b) {
            jau.c().h(str);
            f33419b = false;
        }
    }

    public static void c() {
        LogUtil.d("DeviceVoiceUtils", "playConnectSuccessVoice");
        if (etn.b(BaseApplication.getContext())) {
            jau.c().a(R.raw.connect_success);
        } else {
            LogUtil.j("DeviceVoiceUtils", "will play voice but language not chinese");
        }
    }
}
