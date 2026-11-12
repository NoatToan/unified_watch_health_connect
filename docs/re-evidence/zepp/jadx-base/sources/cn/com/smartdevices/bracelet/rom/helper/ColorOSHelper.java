package cn.com.smartdevices.bracelet.rom.helper;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import cn.com.smartdevices.bracelet.rom.IWrapIntent;
import cn.com.smartdevices.bracelet.rom.ROMHelper;
import cn.com.smartdevices.bracelet.rom.helper.ColorOSHelper;
import cn.com.smartdevices.bracelet.rom.model.OneSetting;
import java.lang.reflect.Method;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class ColorOSHelper extends ROMHelper {
    private static final String e = "ro.oppo.theme.version";
    private static final String f = "ro.oppo.version";
    private static final String g = "ro.rom.different.version";
    private static final String h = "OPPO";
    private static final String i = "android-oppo";
    private static final String j = "ColorOS([\\d.]+)";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Context context, Intent intent) {
        intent.putExtra("title", context.getApplicationContext().getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
        intent.putExtra("pkgName", context.getPackageName());
        intent.putExtra("isDotVisible", "false");
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public OneSetting[] autoStartSetting(Context context) {
        return new OneSetting[]{new OneSetting("com.coloros.safecenter/com.coloros.privacypermissionsentry.PermissionTopActivity"), new OneSetting("com.color.safecenter/.permission.startup.StartupAppListActivity"), new OneSetting("com.coloros.safecenter/.permission.startup.StartupAppListActivity"), new OneSetting("com.coloros.safecenter/.startupapp.StartupAppListActivity")};
    }

    public boolean isAtLeastV6() {
        return getVersionCode() >= 6;
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public boolean judgeROM(Properties properties) {
        if (properties.containsKey(g)) {
            updateData(properties.getProperty(g), j);
            return true;
        }
        String property = properties.getProperty(this.KEY_BASE_OS_VERSION);
        if (TextUtils.isEmpty(property) || !property.contains("OPPO")) {
            return properties.containsKey(e) || properties.containsKey(f) || i.equals(properties.getProperty(this.KEY_CLIENT_ID_BASE));
        }
        setVersionName(property);
        return true;
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public OneSetting[] powerManagerSetting(final Context context) {
        return new OneSetting[]{new OneSetting("com.coloros.oppoguardelf/.MonitoredPkgActivity"), new OneSetting("com.coloros.oppoguardelf/com.coloros.powermanager.fuelgaue.PowerAppsBgSetting", OneSetting.TYPE.ACTIVITY, new IWrapIntent() { // from class: zw0
            @Override // cn.com.smartdevices.bracelet.rom.IWrapIntent
            public final void wrap(Intent intent) {
                ColorOSHelper.f(context, intent);
            }
        }), new OneSetting("com.coloros.oppoguardelf/com.coloros.powermanager.fuelgaue.PowerUsageModelActivity"), new OneSetting("com.color.safecenter/com.color.purebackground.PureBackgroundSettingActivity")};
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public boolean judgeROM(Class cls, Method method) {
        String value = getValue(cls, method, g);
        if (!TextUtils.isEmpty(value)) {
            updateData(value, j);
            return true;
        }
        String value2 = getValue(cls, method, this.KEY_BASE_OS_VERSION);
        if (TextUtils.isEmpty(value2) || !value2.contains("OPPO")) {
            return (TextUtils.isEmpty(getValue(cls, method, e)) && TextUtils.isEmpty(getValue(cls, method, f)) && !i.equals(getValue(cls, method, this.KEY_CLIENT_ID_BASE))) ? false : true;
        }
        setVersionName(value2);
        return true;
    }
}
