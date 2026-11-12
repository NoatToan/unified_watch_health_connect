package cn.com.smartdevices.bracelet.rom;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.text.TextUtils;
import cn.com.smartdevices.bracelet.rom.ROMHelper;
import cn.com.smartdevices.bracelet.rom.helper.ColorOSHelper;
import cn.com.smartdevices.bracelet.rom.helper.FlymeHelper;
import cn.com.smartdevices.bracelet.rom.helper.MIUIHelper;
import cn.com.smartdevices.bracelet.rom.helper.SmartisanOSHelper;
import cn.com.smartdevices.bracelet.rom.model.OneSetting;
import com.huami.message.utils.Rom;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public enum ROM {
    MIUI(Rom.ROM_MIUI, AndroidManufacturerUtils.MANUFACTURE_XIAOMI, new MIUIHelper()),
    EMUI(Rom.ROM_EMUI, "Huawei", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.EMUIHelper
        private static final String e = "ro.build.version.emui";
        private static final String f = "ro.build.hw_emui_api_level";
        private static final String g = "ro.confg.hw_systemversion";
        private static final String h = "EmotionUI_([\\d.]+)";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.huawei.systemmanager/.startupmgr.ui.StartupNormalAppListActivity"), new OneSetting("huawei.intent.action.HSM_BOOTAPP_MANAGER", OneSetting.TYPE.ACTION)};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            if (!properties.containsKey("ro.build.version.emui")) {
                return properties.containsKey(f) || properties.containsKey(g);
            }
            updateData(properties.getProperty("ro.build.version.emui"), h);
            return true;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.huawei.systemmanager/.optimize.process.ProtectActivity")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            String value = getValue(cls, method, "ro.build.version.emui");
            if (TextUtils.isEmpty(value)) {
                return (TextUtils.isEmpty(getValue(cls, method, f)) && TextUtils.isEmpty(getValue(cls, method, g))) ? false : true;
            }
            updateData(value, h);
            return true;
        }
    }),
    ColorOS("ColorOS", "OPPO", new ColorOSHelper()),
    FuntouchOS("FuntouchOS", "VIVO", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.FuntouchOSHelper
        private static final String e = "ro.vivo.board.version";
        private static final String f = "ro.vivo.os.name";
        private static final String g = "ro.vivo.os.version";
        private static final String h = "ro.vivo.os.build.display.id";
        private static final String i = "ro.vivo.rom.version";
        private static final String j = "android-vivo";
        private static final String k = "[\\d.]+";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.vivo.permissionmanager/.activity.BgStartUpManagerActivity"), new OneSetting("com.iqoo.secure/.ui.phoneoptimize.BgStartUpManager")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            if (properties.containsKey(g)) {
                updateData(properties.getProperty(g), k);
                return true;
            }
            if (!properties.containsKey(h)) {
                return j.equals(properties.getProperty(this.KEY_CLIENT_ID_BASE)) || properties.containsKey(f);
            }
            setVersionName(properties.getProperty(h));
            return true;
        }

        public OneSetting[] ohterSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.iqoo.secure/.ui.phoneoptimize.AddWhiteListActivity")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.vivo.abe/com.vivo.applicationbehaviorengine.ui.ExcessivePowerManagerActivity")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            String value = getValue(cls, method, g);
            if (!TextUtils.isEmpty(value)) {
                updateData(value, k);
                return true;
            }
            String value2 = getValue(cls, method, h);
            if (TextUtils.isEmpty(value2)) {
                return !TextUtils.isEmpty(getValue(cls, method, f)) || j.equals(getValue(cls, method, this.KEY_CLIENT_ID_BASE));
            }
            setVersionName(value2);
            return true;
        }
    }),
    Flyme("Flyme", "MEIZU", new FlymeHelper()),
    AmigoOS("AmigoOS", "GIONEE", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.AmigoOSHelper
        private static final String e = "ro.gn.gnromvernumber";
        private static final String f = "ro.gn.amigo.systemui.support";
        private static final String g = "amigo";
        private static final String h = "android-gionee";
        private static final String i = "amigo([\\d.]+)[a-zA-Z]*";

        private boolean e(String str) {
            if (updateData(str, i)) {
                return true;
            }
            if (!str.contains(g)) {
                return false;
            }
            setVersionName(str);
            return true;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.gionee.softmanager/.MainActivity")};
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            if (properties.containsKey(this.KEY_DISPLAY_ID)) {
                String property = properties.getProperty(this.KEY_DISPLAY_ID);
                if (TextUtils.isEmpty(property) || !e(property)) {
                    if (properties.containsKey(e) && !properties.containsKey(f) && !h.equals(properties.getProperty(this.KEY_CLIENT_ID_BASE))) {
                        return false;
                    }
                }
            } else if (properties.containsKey(e)) {
            }
            return true;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            String value = getValue(cls, method, this.KEY_DISPLAY_ID);
            return (!TextUtils.isEmpty(value) && e(value)) || !TextUtils.isEmpty(getValue(cls, method, e)) || !TextUtils.isEmpty(getValue(cls, method, f)) || h.equals(getValue(cls, method, this.KEY_CLIENT_ID_BASE));
        }
    }),
    CoolUI("CoolUI", "coolpad", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.CoolUIHelper
        private static final String e = "ro.yulong.version.release";
        private static final String f = "ro.yulong.version.tag";
        private static final String g = "android-coolpad";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.yulong.android.security/com.yulong.android.seccenter.tabbarmain")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            if (!properties.containsKey(e)) {
                return properties.containsKey(f) || g.equals(properties.getProperty(this.KEY_CLIENT_ID_BASE));
            }
            setVersionName(properties.getProperty(e));
            return true;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            String value = getValue(cls, method, e);
            if (TextUtils.isEmpty(value)) {
                return !TextUtils.isEmpty(getValue(cls, method, f)) || g.equals(getValue(cls, method, this.KEY_CLIENT_ID_BASE));
            }
            setVersionName(value);
            return true;
        }
    }),
    EUI("EUI", "LETV", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.EUIHelper
        private static final String e = "ro.letv.release.version";
        private static final String f = "ro.letv.release.version_date";
        private static final String g = "ro.product.letv_name";
        private static final String h = "ro.product.letv_model";
        private static final String i = "([\\d.]+)[^\\d]*";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.letv.android.letvsafe/.AutobootManageActivity")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            if (!properties.containsKey(e)) {
                return properties.containsKey(g) || properties.containsKey(h);
            }
            updateData(properties.getProperty(e), i);
            return true;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.letv.android.letvsafe/.BackgroundAppManageActivity")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            String value = getValue(cls, method, e);
            if (TextUtils.isEmpty(value)) {
                return (TextUtils.isEmpty(getValue(cls, method, g)) && TextUtils.isEmpty(getValue(cls, method, h))) ? false : true;
            }
            updateData(value, i);
            return true;
        }
    }),
    Lenovo("Lenovo", "Lenovo", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.LenovoHelper
        private static final String e = "ro.lenovo.device";
        private static final String f = "ro.lenovo.platform";
        private static final String g = "ro.lenovo.adb";
        private static final String h = "android-lenovo";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.lenovo.security/.purebackground.PureBackgroundActivity")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            return properties.containsKey(g) || properties.containsKey(e) || properties.containsKey(f) || h.equals(properties.getProperty(this.KEY_CLIENT_ID_BASE));
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.lenovo.powersetting/.ui.Settings$HighPowerApplicationsActivity")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            return (TextUtils.isEmpty(getValue(cls, method, g)) && TextUtils.isEmpty(getValue(cls, method, e)) && TextUtils.isEmpty(getValue(cls, method, f)) && !h.equals(getValue(cls, method, this.KEY_CLIENT_ID_BASE))) ? false : true;
        }
    }),
    LG("LG", "LG", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.LGHelper
        private static final String e = "ro.lge.swversion";
        private static final String f = "ro.lge.swversion_short";
        private static final String g = "ro.lge.factoryversion";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            String property = properties.getProperty(f);
            if (TextUtils.isEmpty(property)) {
                property = properties.getProperty(e);
                if (TextUtils.isEmpty(property)) {
                    property = properties.getProperty(g);
                    if (TextUtils.isEmpty(property)) {
                        return false;
                    }
                }
            }
            setVersionName(property);
            return true;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            String value = getValue(cls, method, f);
            if (TextUtils.isEmpty(value)) {
                value = getValue(cls, method, e);
                if (TextUtils.isEmpty(value)) {
                    value = getValue(cls, method, g);
                    if (TextUtils.isEmpty(value)) {
                        return false;
                    }
                }
            }
            setVersionName(value);
            return true;
        }
    }),
    NubiaUI("NubiaUI", "Nubia", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.NubiaHelper
        private static final String e = "ro.build.user";
        private static final String f = "nubia";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            String property = properties.getProperty(e);
            if (TextUtils.isEmpty(property) || !property.contains(f)) {
                return false;
            }
            setVersionName(property);
            return true;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            String value = getValue(cls, method, e);
            if (TextUtils.isEmpty(value) || !value.contains(f)) {
                return false;
            }
            setVersionName(value);
            return true;
        }
    }),
    MiFavorUI("MiFavor", "ZTE", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.MiFavorUIHelper
        private static final String e = "ro.build.user";
        private static final String f = "zte";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.zte.heartyservice/.autorun.AppAutoRunManager")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            String property = properties.getProperty(this.KEY_VERSION_INCREMENTAL);
            if (TextUtils.isEmpty(property) || !property.contains(f)) {
                String property2 = properties.getProperty(e);
                return !TextUtils.isEmpty(property2) && property2.contains(f);
            }
            setVersionName(property);
            return true;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.zte.heartyservice/.setting.ClearAppSettingsActivity")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            String value = getValue(cls, method, this.KEY_VERSION_INCREMENTAL);
            if (!TextUtils.isEmpty(value) && value.contains(f)) {
                setVersionName(value);
                return true;
            }
            String value2 = getValue(cls, method, e);
            return !TextUtils.isEmpty(value2) && value2.contains(f);
        }
    }),
    Sense("Sense", "HTC", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.SenseHelper
        private static final String e = "htc.build.stage";
        private static final String f = "ro.htc.bluetooth.sap";
        private static final String g = "android-htc-rev";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            return properties.containsKey(e) || properties.containsKey(f) || g.equals(properties.getProperty(this.KEY_CLIENT_ID_BASE));
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            return (TextUtils.isEmpty(getValue(cls, method, e)) && TextUtils.isEmpty(getValue(cls, method, f)) && !g.equals(getValue(cls, method, this.KEY_CLIENT_ID_BASE))) ? false : true;
        }
    }),
    SmartisanOS("SmartisanOS", "Smartisan", new SmartisanOSHelper()),
    Sony("Sony", "Sony", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.SonyHelper
        private static final String e = "ro.sony.irremote.protocol_type";
        private static final String f = "ro.sony.fota.encrypteddata";
        private static final String g = "android-sonyericsson";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            return properties.containsKey(e) || properties.containsKey(f) || g.equals(properties.getProperty(this.KEY_CLIENT_ID_BASE));
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            return (TextUtils.isEmpty(getValue(cls, method, e)) && TextUtils.isEmpty(getValue(cls, method, f)) && !g.equals(getValue(cls, method, this.KEY_CLIENT_ID_BASE))) ? false : true;
        }
    }),
    TouchWiz("TouchWiz", "Samsung", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.TouchWizHelper
        private static final String e = "samsung";
        private static final String f = "android-samsung";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.samsung.android.sm_cn/com.samsung.android.sm.ui.ram.AutoRunActivity"), new OneSetting("com.samsung.android.sm", OneSetting.TYPE.PACKAGE)};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            String property = properties.getProperty(this.KEY_BASE_OS_VERSION);
            if (TextUtils.isEmpty(property) || !property.contains(e)) {
                String property2 = properties.getProperty(this.KEY_CLIENT_ID_BASE);
                return !TextUtils.isEmpty(property2) && property2.contains(f);
            }
            setVersionName(property);
            return true;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return new OneSetting[]{new OneSetting("com.samsung.android.sm_cn/com.samsung.android.sm.ui.battery.BatteryActivity")};
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            String value = getValue(cls, method, this.KEY_BASE_OS_VERSION);
            if (!TextUtils.isEmpty(value) && value.contains(e)) {
                setVersionName(value);
                return true;
            }
            String value2 = getValue(cls, method, this.KEY_CLIENT_ID_BASE);
            return !TextUtils.isEmpty(value2) && value2.contains(f);
        }
    }),
    YunOS("YunOS", "YunOS", new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.YunOSHelper
        private static final String e = "ro.yunos.version";

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return null;
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
            return null;
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
    }),
    Other(StatEvent.OTHER, StatEvent.OTHER, new ROMHelper() { // from class: cn.com.smartdevices.bracelet.rom.helper.OtherHelper
        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] autoStartSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean goPowerManager(Context context) {
            return Build.VERSION.SDK_INT >= 23 && supportDoze(context) && ROMHelper.jump(context, new OneSetting("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", OneSetting.TYPE.ACTION));
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Class cls, Method method) {
            return true;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean judgeROM(Properties properties) {
            return true;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public OneSetting[] powerManagerSetting(Context context) {
            return null;
        }

        @Override // cn.com.smartdevices.bracelet.rom.ROMHelper
        public boolean supportPowerManager(Context context) {
            PowerManager powerManager;
            return Build.VERSION.SDK_INT >= 23 && supportDoze(context) && (powerManager = (PowerManager) context.getSystemService("power")) != null && !powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
        }
    });

    private static final String TAG = "ROM";
    private String comName;
    private ROMHelper helper;
    private String romName;

    ROM(String str, String str2, ROMHelper rOMHelper) {
        this.romName = str;
        this.comName = str2;
        this.helper = rOMHelper;
    }

    public static ROM a(Context context) throws Throwable {
        ROM romB = b();
        if (romB != null) {
            return romB;
        }
        ROM romC = c(context);
        return romC != null ? romC : Other;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static ROM b() throws Throwable {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            try {
                try {
                    properties.load(fileInputStream);
                    for (ROM rom : values()) {
                        if (rom.getHelper().judgeROM(properties) && rom != Other) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused) {
                            }
                            return rom;
                        }
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                    return Other;
                } catch (Exception e) {
                    e = e;
                    HMLog.i(TAG, e.toString(), new Object[0]);
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    private static ROM c(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            Method method = clsLoadClass.getMethod("get", String.class);
            for (ROM rom : values()) {
                if (rom.getHelper().judgeROM(clsLoadClass, method)) {
                    return rom;
                }
            }
            return Other;
        } catch (Exception e) {
            HMLog.i(TAG, e.toString(), new Object[0]);
            return null;
        }
    }

    public String getComName() {
        return this.comName;
    }

    public <T extends ROMHelper> T getHelper() {
        return (T) this.helper;
    }

    public String getRomName() {
        return this.romName;
    }
}
