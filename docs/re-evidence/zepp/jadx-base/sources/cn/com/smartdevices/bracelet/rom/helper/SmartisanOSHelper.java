package cn.com.smartdevices.bracelet.rom.helper;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import cn.com.smartdevices.bracelet.rom.IWrapIntent;
import cn.com.smartdevices.bracelet.rom.ROMHelper;
import cn.com.smartdevices.bracelet.rom.helper.SmartisanOSHelper;
import cn.com.smartdevices.bracelet.rom.model.OneSetting;
import java.lang.reflect.Method;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class SmartisanOSHelper extends ROMHelper {
    private static final String e = "ro.smartisan.version";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Context context, Intent intent) {
        intent.putExtra("packageName", context.getPackageName());
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public OneSetting[] autoStartSetting(final Context context) {
        return new OneSetting[]{new OneSetting("com.smartisanos.security/.invokeHistory.InvokeHistoryActivity", OneSetting.TYPE.ACTIVITY, new IWrapIntent() { // from class: m47
            @Override // cn.com.smartdevices.bracelet.rom.IWrapIntent
            public final void wrap(Intent intent) {
                SmartisanOSHelper.f(context, intent);
            }
        })};
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public boolean judgeROM(Properties properties) {
        if (!properties.containsKey(e)) {
            return false;
        }
        setVersionName(properties.getProperty(e));
        return true;
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public OneSetting[] powerManagerSetting(Context context) {
        return new OneSetting[]{new OneSetting("com.android.settings/.fuelgauge.appBatteryUseOptimization.AppBatteryUseOptimizationActivity")};
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public boolean judgeROM(Class cls, Method method) {
        String value = getValue(cls, method, e);
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        setVersionName(value);
        return true;
    }
}
