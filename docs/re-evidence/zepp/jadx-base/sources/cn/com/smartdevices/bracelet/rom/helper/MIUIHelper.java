package cn.com.smartdevices.bracelet.rom.helper;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import cn.com.smartdevices.bracelet.rom.IWrapIntent;
import cn.com.smartdevices.bracelet.rom.ROMHelper;
import cn.com.smartdevices.bracelet.rom.helper.MIUIHelper;
import cn.com.smartdevices.bracelet.rom.model.OneSetting;
import com.huami.tools.log.HMLog;
import java.lang.reflect.Method;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class MIUIHelper extends ROMHelper {
    private static final String e = "ro.miui.ui.version.name";
    private static final String f = "ro.miui.ui.version.code";
    private static final String g = "android-xiaomi";
    private static final String h = "[Vv]\\d+";
    private static final String i = "[\\d.]+";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Context context, Intent intent) {
        try {
            intent.putExtra("package_label", context.getApplicationContext().getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
            intent.putExtra("package_name", context.getPackageName());
        } catch (Exception e2) {
            HMLog.i(ROMHelper.TAG, e2.toString(), new Object[0]);
        }
    }

    private void g(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.matches(str2)) {
            return;
        }
        setVersionName(str);
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public OneSetting[] autoStartSetting(Context context) {
        return new OneSetting[]{new OneSetting("com.miui.securitycenter/com.miui.permcenter.autostart.AutoStartManagementActivity"), new OneSetting("com.android.settings/com.miui.securitycenter.power.BackgroundApplicationsManager"), new OneSetting("miui.intent.action.OP_AUTO_START", OneSetting.TYPE.ACTION)};
    }

    public boolean isAtLeastV12() {
        return getVersionCode() >= 12;
    }

    public boolean isV5() {
        return getVersionCode() == 5;
    }

    public boolean isV6() {
        return getVersionCode() == 6;
    }

    public boolean isV7() {
        return getVersionCode() == 7;
    }

    public boolean isV8() {
        return getVersionCode() == 8;
    }

    public boolean isV9() {
        return getVersionCode() == 9;
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public boolean judgeROM(Properties properties) {
        if (!properties.containsKey(e) && !properties.containsKey(f)) {
            return g.equals(properties.getProperty(this.KEY_CLIENT_ID_BASE));
        }
        updateData(properties.getProperty(e), h);
        g(properties.getProperty(this.KEY_VERSION_INCREMENTAL), i);
        return true;
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public OneSetting[] powerManagerSetting(final Context context) {
        return new OneSetting[]{new OneSetting("com.miui.powerkeeper/.ui.HiddenAppsConfigActivity", OneSetting.TYPE.ACTIVITY, new IWrapIntent() { // from class: zt4
            @Override // cn.com.smartdevices.bracelet.rom.IWrapIntent
            public final void wrap(Intent intent) {
                MIUIHelper.f(context, intent);
            }
        })};
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public boolean updateData(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.matches(str2)) {
            return false;
        }
        try {
            setVersionCode(Integer.parseInt(str.split("[Vv]")[1]));
        } catch (Exception e2) {
            HMLog.i(ROMHelper.TAG, e2.toString(), new Object[0]);
        }
        return true;
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public boolean judgeROM(Class cls, Method method) {
        String value = getValue(cls, method, e);
        String value2 = getValue(cls, method, f);
        if (TextUtils.isEmpty(value) && TextUtils.isEmpty(value2)) {
            return g.equals(getValue(cls, method, this.KEY_CLIENT_ID_BASE));
        }
        updateData(value, h);
        g(getValue(cls, method, this.KEY_VERSION_INCREMENTAL), i);
        return true;
    }
}
