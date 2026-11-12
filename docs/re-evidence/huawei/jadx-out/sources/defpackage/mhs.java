package defpackage;

import android.os.Process;
import android.text.TextUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mhs implements SwitchSettingInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mhs f41700a;

    private mhs() {
    }

    public static mhs a() {
        mhs mhsVar;
        LogUtil.a("HwSwitchSettingsManager", "HwSwitchSettingsManager singleton");
        synchronized (mhs.class) {
            if (f41700a == null) {
                f41700a = new mhs();
            }
            mhsVar = f41700a;
        }
        return mhsVar;
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public void setSwitchSetting(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        mho.a(str, str2, iBaseResponseCallback);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public void setSwitchSetting(String str, String str2, String str3, IBaseResponseCallback iBaseResponseCallback) {
        mho.d(str, str2, str3, iBaseResponseCallback);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public void getSwitchSetting(String str, IBaseResponseCallback iBaseResponseCallback) {
        mho.a(str, iBaseResponseCallback);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public void getSwitchSetting(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        mho.a(list, iBaseResponseCallback);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public void getSwitchSetting(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        mho.b(str, str2, iBaseResponseCallback);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public void sendSetSwitchSettingCmd(boolean z, String str, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        b();
        mhr.e(z, str, i, i2, iBaseResponseCallback);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public void sendSetSwitchSettingCmd(byte[] bArr, String str, int i, int i2) {
        b();
        mhr.c(bArr, str, i, i2);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public void sendSetSwitchSettingCmd(int i, String str, String str2) {
        b();
        mhr.a(i, str, str2);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public void sendSettingSwitchCommand(String str, String str2, long j, String str3) {
        b();
        mhr.d(str, str2, j, str3);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public void setSwitchSettingToLocal(String str, String str2, int i) {
        b();
        mhq.d(str, str2, i);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public String getSwitchSettingFromLocal(String str, int i) {
        b();
        return mhq.b(str, i);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public void setSwitchSettingToDb(String str, String str2) {
        mhq.e(str, str2);
    }

    @Override // com.huawei.hwdevice.outofprocess.mgr.switchsetting.SwitchSettingInterface
    public String getSwitchSettingFromDb(String str) {
        return mhq.c(str);
    }

    private void b() {
        if (CompileParameterUtil.d("IS_RELEASE_VERSION")) {
            return;
        }
        String strB = CommonUtil.b(Process.myPid());
        if (TextUtils.isEmpty(strB) || BaseApplication.getAppPackage().equals(strB)) {
            return;
        }
        throw new RuntimeException("DeviceConfig must init in main process." + strB);
    }
}
