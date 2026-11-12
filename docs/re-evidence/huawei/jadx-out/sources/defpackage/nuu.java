package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.utils.service.ScaleUpdateService;

/* JADX INFO: loaded from: classes11.dex */
public class nuu extends HwBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f43775a;

    private nuu(Context context) {
        super(context);
        this.f43775a = context;
    }

    public static nuu a() {
        return b.d;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 1003;
    }

    public void b(String str, String str2, String str3, Boolean bool, String str4) {
        LogUtil.a("Scale_HwScaleVersionManager", "checkBandNewVersionService isAuto" + bool);
        Intent intent = new Intent(this.f43775a, (Class<?>) ScaleUpdateService.class);
        if (bool != null && bool.booleanValue()) {
            intent.setAction("action_scale_auto_check_new_version");
        } else {
            intent.setAction("action_scale_check_new_version");
        }
        intent.putExtra("scale_name", str);
        intent.putExtra("scale_mac_address", str3);
        intent.putExtra("extra_band_version", str2);
        intent.putExtra("extra_band_unique_id", str4);
        this.f43775a.startService(intent);
    }

    public void e(String str) {
        nva.b(this.f43775a, str);
    }

    public String b(String str) {
        LogUtil.d("Scale_HwScaleVersionManager", "enter getCheckNewBandVersion ");
        return nva.c(this.f43775a, str);
    }

    public String g(String str) {
        return nva.d(this.f43775a, str);
    }

    public void b(String str, String str2) {
        nva.i(str, this.f43775a, str2);
    }

    public void c(String str, String str2) {
        nva.e(str, this.f43775a, str2);
    }

    public void d(Boolean bool) {
        LogUtil.a("Scale_HwScaleVersionManager", "reportStatus isApp isSuccess =  ", bool);
        Intent intent = new Intent(this.f43775a, (Class<?>) ScaleUpdateService.class);
        if (bool.booleanValue()) {
            intent.setAction("action_band_update_success");
        } else {
            intent.setAction("action_band_update_failed");
        }
        try {
            this.f43775a.startService(intent);
        } catch (IllegalStateException e) {
            LogUtil.e("Scale_HwScaleVersionManager", "reportStatus Exception", e.getMessage());
        }
    }

    public void d(String str, String str2) {
        LogUtil.d("Scale_HwScaleVersionManager", "resetBandUpdate");
        e(str);
        nva.e(this.f43775a, str, str2);
    }

    public void a(String str) {
        LogUtil.d("Scale_HwScaleVersionManager", "downloadPackage");
        Intent intent = new Intent(this.f43775a, (Class<?>) ScaleUpdateService.class);
        intent.setAction("action_scale_download_new_version");
        intent.putExtra("scale_name", str);
        this.f43775a.startService(intent);
    }

    public void c(String str) {
        LogUtil.d("Scale_HwScaleVersionManager", "cancelDownload");
        Intent intent = new Intent(this.f43775a, (Class<?>) ScaleUpdateService.class);
        intent.setAction("action_cancel_download_app");
        intent.putExtra("scale_name", str);
        this.f43775a.startService(intent);
    }

    public void d(String str) {
        nva.b(this.f43775a, str);
    }

    static class b {
        private static final nuu d = new nuu(BaseApplication.getContext());
    }
}
