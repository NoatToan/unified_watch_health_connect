package cn.com.smartdevices.bracelet.rom;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import cn.com.smartdevices.bracelet.rom.model.OneSetting;
import com.huami.tools.log.HMLog;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ROMHelper {
    public static final String TAG = "ROMHelper";
    private OneSetting c;
    private OneSetting d;
    public String KEY_DISPLAY_ID = "ro.build.display.id";
    public String KEY_BASE_OS_VERSION = "ro.build.version.base_os";
    public String KEY_CLIENT_ID_BASE = "ro.com.google.clientidbase";
    public String KEY_VERSION_INCREMENTAL = "ro.build.version.incremental";
    private int a = -1;
    private String b = null;

    private static Intent a(Context context, OneSetting oneSetting) {
        if (oneSetting.isAction()) {
            return new Intent(oneSetting.getSetting());
        }
        if (oneSetting.isActivity()) {
            Intent intent = new Intent();
            intent.setComponent(ComponentName.unflattenFromString(oneSetting.getSetting()));
            return intent;
        }
        if (oneSetting.isPackage()) {
            try {
                return context.getPackageManager().getLaunchIntentForPackage(oneSetting.getSetting());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static ResolveInfo b(Context context, Intent intent) {
        if (intent == null) {
            return null;
        }
        return context.getPackageManager().resolveActivity(intent, 65536);
    }

    private static void c(OneSetting oneSetting, boolean z, boolean z2) {
        if (oneSetting == null) {
            return;
        }
        oneSetting.setExist(z);
        oneSetting.setValid(z2);
    }

    private OneSetting d(Context context, OneSetting[] oneSettingArr) {
        if (oneSettingArr == null || oneSettingArr.length == 0) {
            return OneSetting.NULL;
        }
        for (OneSetting oneSetting : oneSettingArr) {
            judge(context, oneSetting);
            if (oneSetting.isExist()) {
                return oneSetting;
            }
        }
        return OneSetting.NULL;
    }

    public static void judge(Context context, OneSetting oneSetting) {
        if (oneSetting == null) {
            return;
        }
        boolean z = false;
        if (TextUtils.isEmpty(oneSetting.getSetting())) {
            c(oneSetting, false, false);
            return;
        }
        ResolveInfo resolveInfoB = b(context, a(context, oneSetting));
        if (resolveInfoB == null) {
            c(oneSetting, false, false);
            return;
        }
        ActivityInfo activityInfo = resolveInfoB.activityInfo;
        if (activityInfo != null && activityInfo.exported) {
            z = true;
        }
        c(oneSetting, true, z);
    }

    public static boolean jump(Context context, OneSetting oneSetting) {
        Intent intentA;
        if (oneSetting == null || TextUtils.isEmpty(oneSetting.getSetting()) || (intentA = a(context, oneSetting)) == null) {
            return false;
        }
        if (oneSetting.getWrapIntent() != null) {
            oneSetting.getWrapIntent().wrap(intentA);
        }
        try {
            intentA.setFlags(268435456);
            context.startActivity(intentA);
            return true;
        } catch (Exception e) {
            HMLog.i(TAG, e.toString(), new Object[0]);
            return false;
        }
    }

    public abstract OneSetting[] autoStartSetting(Context context);

    public String getValue(Class cls, Method method, String str) {
        try {
            return (String) method.invoke(cls, str);
        } catch (Exception e) {
            HMLog.i(TAG, e.toString(), new Object[0]);
            return null;
        }
    }

    public int getVersionCode() {
        return this.a;
    }

    public String getVersionName() {
        return this.b;
    }

    public boolean goAutoStart(Context context) {
        return jump(context, this.c);
    }

    public boolean goPowerManager(Context context) {
        return jump(context, this.d);
    }

    public boolean hasAutoStart(Context context) {
        if (this.c == null) {
            this.c = d(context, autoStartSetting(context.getApplicationContext()));
        }
        OneSetting oneSetting = this.c;
        return (oneSetting == null || oneSetting == OneSetting.NULL || !oneSetting.isExist()) ? false : true;
    }

    public boolean hasPowerManager(Context context) {
        if (this.d == null) {
            this.d = d(context, powerManagerSetting(context.getApplicationContext()));
        }
        OneSetting oneSetting = this.d;
        return (oneSetting == null || oneSetting == OneSetting.NULL || !oneSetting.isExist()) ? false : true;
    }

    public abstract boolean judgeROM(Class cls, Method method);

    public abstract boolean judgeROM(Properties properties);

    public abstract OneSetting[] powerManagerSetting(Context context);

    public void setVersionCode(int i) {
        this.a = i;
    }

    public void setVersionName(String str) {
        this.b = str;
    }

    public boolean supportAutoStart(Context context) {
        if (this.c == null) {
            this.c = d(context, autoStartSetting(context.getApplicationContext()));
        }
        OneSetting oneSetting = this.c;
        return (oneSetting == null || oneSetting == OneSetting.NULL || !oneSetting.isValid()) ? false : true;
    }

    public boolean supportDoze(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        OneSetting oneSetting = new OneSetting("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", OneSetting.TYPE.ACTION);
        judge(context, oneSetting);
        return oneSetting.isValid();
    }

    public boolean supportPowerManager(Context context) {
        if (this.d == null) {
            this.d = d(context, powerManagerSetting(context.getApplicationContext()));
        }
        OneSetting oneSetting = this.d;
        return (oneSetting == null || oneSetting == OneSetting.NULL || !oneSetting.isValid()) ? false : true;
    }

    public boolean updateData(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            if (matcher.find()) {
                try {
                    String strGroup = matcher.group(1);
                    setVersionName(strGroup);
                    setVersionCode(Integer.parseInt(strGroup.split("\\.")[0]));
                } catch (Exception e) {
                    HMLog.i(TAG, e.toString(), new Object[0]);
                }
                return true;
            }
        }
        return false;
    }
}
