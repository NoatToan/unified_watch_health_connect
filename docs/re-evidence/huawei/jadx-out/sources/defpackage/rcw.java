package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.datatype.DataDeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class rcw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static rcw f47161c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47162a = -1;
    private Context d;

    rcw(Context context) {
        this.d = context;
    }

    public int b() {
        return this.f47162a;
    }

    public void d(int i) {
        this.f47162a = i;
    }

    public String d() {
        return nvd.f(this.d);
    }

    public void f(String str) {
        nvd.f(str, this.d);
    }

    public String e() {
        return nvd.j(this.d);
    }

    public void j(String str) {
        nvd.n(str, this.d);
    }

    public void h(String str) {
        nvd.o(str, this.d);
    }

    public static rcw b(Context context) {
        rcw rcwVar;
        synchronized (e) {
            LogUtil.a("UpdateInteractors", "getmInstance,mInstance", f47161c);
            if (f47161c == null) {
                LogUtil.a("UpdateInteractors", "new UpdateInteractors()");
                f47161c = new rcw(BaseApplication.getContext());
            }
            rcwVar = f47161c;
        }
        return rcwVar;
    }

    public void a(String str) {
        Intent intent = new Intent(this.d, (Class<?>) HwUpdateService.class);
        intent.putExtra("extra_band_imei", str);
        intent.setAction("action_band_manual_update_new_version");
        this.d.startService(intent);
    }

    public void e(String str) {
        LogUtil.a("UpdateInteractors", "doDownloadAppFile ");
        if (this.d != null) {
            Intent intent = new Intent(this.d, (Class<?>) HwUpdateService.class);
            intent.putExtra("extra_band_imei", str);
            intent.setAction("action_band_download_new_version");
            try {
                this.d.startService(intent);
            } catch (IllegalStateException unused) {
                LogUtil.e("doDownloadAppFile IllegalStateException", new Object[0]);
            }
        }
    }

    public void c(String str) {
        maq.b().d(str);
    }

    public String b(String str) {
        LogUtil.a("UpdateInteractors", "enter getBandCheckNewVersion");
        Context context = this.d;
        if (context != null) {
            return HwVersionManager.b(context).j(str);
        }
        return "";
    }

    public String d(String str) {
        LogUtil.a("UpdateInteractors", "enter getBandStorePath");
        Context context = this.d;
        if (context != null) {
            return HwVersionManager.b(context).g(str);
        }
        return "";
    }

    public boolean a() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = this.d.getSystemService("connectivity") instanceof ConnectivityManager ? (ConnectivityManager) this.d.getSystemService("connectivity") : null;
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 0) ? false : true;
    }

    public String m(String str) {
        Context context = this.d;
        if (context != null) {
            return HwVersionManager.b(context).t(str);
        }
        return "";
    }

    public boolean i(String str) {
        LogUtil.a("UpdateInteractors", "isOtaFileExist(): path = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("UpdateInteractors", "isOtaFileExist() error, file path is empty...");
            return false;
        }
        boolean zExists = new File(str).exists();
        LogUtil.a("UpdateInteractors", "isOtaFileExist: bExist = ", Boolean.valueOf(zExists));
        return zExists;
    }

    public void g(String str) {
        LogUtil.a("UpdateInteractors", "initUpdateInteractors ");
        maq.b().b(str);
    }

    public void b(DeviceInfo deviceInfo) {
        if (this.d == null) {
            LogUtil.a("UpdateInteractors", "deleteChangeLog mContext is null");
            return;
        }
        String str = this.d.getFilesDir() + File.separator + "changeLog" + File.separator + deviceInfo.getDeviceUdid();
        LogUtil.a("UpdateInteractors", "deleteChangeLog changeLogPath=", str);
        File file = new File(str);
        if (file.isDirectory() && file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    LogUtil.d("UpdateInteractors", "deleteChangeLog file=", file2.getName());
                    LogUtil.d("UpdateInteractors", "deleteUnUseVersionChangeLog isDelete=", Boolean.valueOf(file2.delete()));
                }
            }
            LogUtil.a("UpdateInteractors", "deleteUnUseVersionChangeLog isDeleteFileDir=", Boolean.valueOf(file.delete()));
        }
    }

    public void c() {
        LogUtil.a("UpdateInteractors", "activateDevice enter");
        Map<String, String> mapE = SharedPreferenceManager.e(this.d, String.valueOf(1017));
        if (mapE == null) {
            LogUtil.e("UpdateInteractors", "activateDevice.getAllSharedPreferencesById() is null!!");
            return;
        }
        DataDeviceInfo dataDeviceInfoD = d(mapE);
        if (dataDeviceInfoD != null) {
            Intent intent = new Intent(this.d, (Class<?>) HwUpdateService.class);
            intent.setAction("action_band_check_new_version_to_activate");
            intent.putExtra("extra_band_type", dataDeviceInfoD.getDeviceType());
            intent.putExtra("extra_band_version", dataDeviceInfoD.getDeviceSoftVersion());
            intent.putExtra("extra_band_imei", dataDeviceInfoD.getDeviceBtMac());
            try {
                this.d.startService(intent);
            } catch (IllegalStateException unused) {
                LogUtil.e("activateDevice IllegalStateException", new Object[0]);
            }
        }
    }

    private DataDeviceInfo d(Map<String, String> map) {
        DataDeviceInfo dataDeviceInfo = null;
        if (map.size() > 9) {
            HashMap map2 = new HashMap(20);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                DataDeviceInfo dataDeviceInfo2 = (DataDeviceInfo) new Gson().fromJson(entry.getValue(), DataDeviceInfo.class);
                if (dataDeviceInfo2 != null && "false".equalsIgnoreCase(dataDeviceInfo2.getDeviceEmmcId())) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
            SharedPreferenceManager.i(this.d, String.valueOf(1017));
            for (Map.Entry entry2 : map2.entrySet()) {
                dataDeviceInfo = (DataDeviceInfo) new Gson().fromJson((String) entry2.getValue(), DataDeviceInfo.class);
                SharedPreferenceManager.e(this.d, Integer.toString(1017), (String) entry2.getKey(), (String) entry2.getValue(), new StorageParams());
            }
            return dataDeviceInfo;
        }
        for (Map.Entry<String, String> entry3 : map.entrySet()) {
            DataDeviceInfo dataDeviceInfo3 = (DataDeviceInfo) new Gson().fromJson(entry3.getValue(), DataDeviceInfo.class);
            if (dataDeviceInfo3 != null && "false".equalsIgnoreCase(dataDeviceInfo3.getDeviceEmmcId())) {
                LogUtil.a("UpdateInteractors", "getActivatedDevice device=", BTDeviceMgrUtil.c().e(dataDeviceInfo3.getDeviceBtMac()));
                dataDeviceInfo = (DataDeviceInfo) new Gson().fromJson(entry3.getValue(), DataDeviceInfo.class);
            }
        }
        return dataDeviceInfo;
    }

    public void a(String str, boolean z) {
        mbc.b().a(str, z);
    }
}
