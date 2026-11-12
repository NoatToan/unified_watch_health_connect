package cn.com.smartdevices.bracelet.rom;

import android.content.Context;
import android.os.Build;
import com.huami.tools.log.HMLog;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes2.dex */
public class AliveUtils {
    private static AliveUtils d;
    private final String a = "AliveUtils";
    private Manufacturer b;
    private ROM c;

    private AliveUtils(Context context) {
        Manufacturer manufacturer = new Manufacturer();
        this.b = manufacturer;
        manufacturer.b(Build.BRAND);
        this.b.setPhoneModel(Build.MODEL);
        this.b.c(Build.DISPLAY);
        this.b.a(Build.MANUFACTURER);
        this.b.d(Build.VERSION.SDK_INT);
        this.c = ROM.a(context);
        HMLog.i("AliveUtils", toString(), new Object[0]);
    }

    public static synchronized AliveUtils getInstance() {
        return d;
    }

    public static synchronized void init(Context context) {
        d = new AliveUtils(context.getApplicationContext());
    }

    public ROM getCurrentROM() {
        return this.c;
    }

    public Manufacturer getManufacturer() {
        return this.b;
    }

    public boolean goAutoStart(Context context, ROM rom) {
        return rom != null && rom.getHelper().goAutoStart(context);
    }

    public boolean goPowerManager(Context context, ROM rom) {
        return rom != null && rom.getHelper().goPowerManager(context);
    }

    public boolean hasAutoStart(Context context, ROM rom) {
        return rom != null && rom.getHelper().hasAutoStart(context);
    }

    public boolean hasPowerManager(Context context, ROM rom) {
        return rom != null && rom.getHelper().hasPowerManager(context);
    }

    public boolean isCurrentROM(ROM rom) {
        return rom == this.c;
    }

    public boolean supportAutoStart(Context context, ROM rom) {
        return rom != null && rom.getHelper().supportAutoStart(context);
    }

    public boolean supportPowerManager(Context context, ROM rom) {
        return rom != null && rom.getHelper().supportPowerManager(context);
    }

    public String toString() {
        return "\n                -- info --\n         romName:\t" + this.c.getRomName() + "\n         comName:" + HTTP.TAB + this.c.getComName() + "\n     versionName:" + HTTP.TAB + this.c.getHelper().getVersionName() + "\n     versionCode:" + HTTP.TAB + this.c.getHelper().getVersionCode() + "\n    manufacturer:" + HTTP.TAB + this.b.getManufacturer() + "\n    phoneDisplay:" + HTTP.TAB + this.b.getPhoneDisplay() + "\n      versionSDK:" + HTTP.TAB + this.b.getVersionSDK() + "\n      phoneBrand:" + HTTP.TAB + this.b.getPhoneBrand() + "\n      phoneModel:" + HTTP.TAB + this.b.getPhoneModel();
    }

    public boolean goAutoStart(Context context) {
        return goAutoStart(context, this.c);
    }

    public boolean goPowerManager(Context context) {
        return goPowerManager(context, this.c);
    }

    public boolean hasAutoStart(Context context) {
        return hasAutoStart(context, this.c);
    }

    public boolean hasPowerManager(Context context) {
        return hasPowerManager(context, this.c);
    }

    public boolean supportAutoStart(Context context) {
        return supportAutoStart(context, this.c);
    }

    public boolean supportPowerManager(Context context) {
        return supportPowerManager(context, this.c);
    }
}
