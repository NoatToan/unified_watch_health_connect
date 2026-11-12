package cn.com.smartdevices.bracelet.rom.helper;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import cn.com.smartdevices.bracelet.rom.IWrapIntent;
import cn.com.smartdevices.bracelet.rom.ROMHelper;
import cn.com.smartdevices.bracelet.rom.helper.FlymeHelper;
import cn.com.smartdevices.bracelet.rom.model.OneSetting;
import java.lang.reflect.Method;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class FlymeHelper extends ROMHelper {
    private static final String e = "ro.flyme.published";
    private static final String f = "ro.meizu.setupwizard.flyme";
    private static final String g = "Flyme";
    private static final String h = "Flyme[^\\d]*([\\d.]+)[^\\d]*";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Context context, Intent intent) {
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("packageName", context.getPackageName());
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public OneSetting[] autoStartSetting(final Context context) {
        return new OneSetting[]{new OneSetting("com.meizu.safe.security.SHOW_APPSEC", OneSetting.TYPE.ACTION, new IWrapIntent() { // from class: u92
            @Override // cn.com.smartdevices.bracelet.rom.IWrapIntent
            public final void wrap(Intent intent) {
                FlymeHelper.f(context, intent);
            }
        })};
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public boolean judgeROM(Properties properties) {
        if (properties.containsKey(f) || properties.containsKey(e)) {
            updateData(properties.getProperty(this.KEY_DISPLAY_ID), h);
            return true;
        }
        String property = properties.getProperty(this.KEY_DISPLAY_ID);
        if (TextUtils.isEmpty(property) || !property.contains(g)) {
            return false;
        }
        setVersionName(property);
        return true;
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public OneSetting[] powerManagerSetting(Context context) {
        return new OneSetting[]{new OneSetting("com.meizu.safe/.powerui.PowerAppPermissionActivity")};
    }

    @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
    public boolean judgeROM(Class cls, Method method) {
        if (TextUtils.isEmpty(getValue(cls, method, f)) && TextUtils.isEmpty(getValue(cls, method, e))) {
            String value = getValue(cls, method, this.KEY_DISPLAY_ID);
            if (TextUtils.isEmpty(value) || !value.contains(g)) {
                return false;
            }
            setVersionName(value);
            return true;
        }
        updateData(getValue(cls, method, this.KEY_DISPLAY_ID), h);
        return true;
    }
}
