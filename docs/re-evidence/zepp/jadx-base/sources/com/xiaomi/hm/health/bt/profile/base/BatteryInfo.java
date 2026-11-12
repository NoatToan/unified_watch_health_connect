package com.xiaomi.hm.health.bt.profile.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.bluetooth.profile.data.TimeKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class BatteryInfo {
    public static final int BASE_MILI_YEAR_OFFSET = 2000;
    public static final byte DEVICE_BATTERY_LOW = 1;
    public static final byte DEVICE_BATTERY_NORMAL = 0;
    public static final byte DEVICE_DC_STATUS_OFF = 0;
    private static final String h = "BatteryInfo";
    private static final byte i = 2;
    private static final byte j = 3;
    private static final byte k = 4;
    private static final byte l = 1;
    private int a;
    private int b;
    private Calendar c;
    private Calendar d;
    private int e;
    private int f;
    private int g;

    public BatteryInfo() {
        this(0, null, 0, 0);
    }

    private static int a(byte flag) {
        boolean z = (flag & 1) == 1;
        boolean z2 = ((flag >> 1) & 1) == 1;
        boolean z3 = ((flag >> 2) & 1) == 1;
        boolean z4 = ((flag >> 3) & 1) == 1;
        int i2 = z ? 3 : 2;
        if (z2) {
            i2 += 8;
        }
        if (z3) {
            i2 += 8;
        }
        return z4 ? i2 + 1 : i2;
    }

    @Nullable
    public static BatteryInfo parseBatteryInfo(byte[] value) {
        if (value != null) {
            try {
                byte b = 2;
                if (value.length >= 2) {
                    BatteryInfo batteryInfo = new BatteryInfo();
                    byte b2 = value[0];
                    batteryInfo.setLevel(value[1]);
                    boolean z = (b2 & 1) == 1;
                    boolean z2 = ((b2 >> 1) & 1) == 1;
                    boolean z3 = ((b2 >> 2) & 1) == 1;
                    boolean z4 = ((b2 >> 3) & 1) == 1;
                    if (z) {
                        batteryInfo.setDcStatus(value[2]);
                        b = (byte) 3;
                    }
                    if (z2) {
                        int i2 = b + 8;
                        batteryInfo.setLastChargeFull(TimeKt.toCalendar(Arrays.copyOfRange(value, (int) b, i2)));
                        b = (byte) i2;
                    }
                    if (z3) {
                        int i3 = b + 8;
                        batteryInfo.setLastCharge(TimeKt.toCalendar(Arrays.copyOfRange(value, (int) b, i3)));
                        b = (byte) i3;
                    }
                    if (z4) {
                        batteryInfo.setLastChargeLevel(value[b] & 255);
                    }
                    return batteryInfo;
                }
            } catch (Exception e) {
                Debug.fi(h, "parseBatteryInfo exception: " + e);
            }
        }
        return null;
    }

    @NonNull
    public static List<BatteryInfo> parseBatteryInfoList(@Nullable byte[] value) {
        ArrayList arrayList = new ArrayList();
        if (value != null && value.length != 0) {
            int length = value.length;
            int i2 = 0;
            while (true) {
                int iA = a(value[i2]);
                int i3 = i2 + iA;
                if (iA == 0 || i3 > length) {
                    break;
                }
                arrayList.add(parseBatteryInfo(Arrays.copyOfRange(value, i2, i3)));
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    public int getDcStatus() {
        return this.g;
    }

    public Calendar getLastCharge() {
        return this.c;
    }

    public Calendar getLastChargeFull() {
        return this.d;
    }

    public int getLastChargeLevel() {
        return this.b;
    }

    public int getLevel() {
        return this.a;
    }

    public int getStatus() {
        return this.f;
    }

    public boolean isChargeFull() {
        if (this.f != 3) {
            return this.g == 1 && this.a == 100;
        }
        return true;
    }

    public boolean isChargeOff() {
        return this.f == 4;
    }

    public boolean isCharging() {
        if (this.f != 2) {
            return this.g == 1 && this.a < 100;
        }
        return true;
    }

    public void setDcStatus(int status) {
        this.g = status;
    }

    public void setLastCharge(Calendar calendar) {
        this.c = calendar;
    }

    public void setLastChargeFull(Calendar calendar) {
        this.d = calendar;
    }

    public void setLastChargeLevel(int level) {
        this.b = level;
    }

    public void setLevel(int level) {
        this.a = level;
    }

    public void setStatus(int status) {
        this.f = status;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FirebaseAnalytics.Param.LEVEL, this.a);
            jSONObject.put("lastChargeLevel", this.b);
            jSONObject.put("lastCharge", this.c.getTimeInMillis() / 1000);
            jSONObject.put("lastChargeFull", this.d.getTimeInMillis() / 1000);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toJsonString() {
        return toJson().toString();
    }

    public String toString() {
        return "[[[ " + BatteryInfo.class.getSimpleName() + " ]]]\n           level: " + this.a + "%\n lastChargeLevel: " + this.b + "%\n      lastCharge: " + DateFormat.getDateTimeInstance().format(this.c.getTime()) + "\n  lastChargeFull: " + DateFormat.getDateTimeInstance().format(this.d.getTime()) + "\n         charges: " + this.e + "\n          status: " + Integer.toHexString(this.f) + "\n        dcStatus: " + Integer.toHexString(this.g);
    }

    public void update(int status, int level) {
        this.f = status;
        this.a = level;
    }

    public BatteryInfo(int level) {
        this(level, null, 0, 0);
    }

    public BatteryInfo(int level, Calendar lastCharge, int charges, int status) {
        this.c = null;
        this.d = null;
        this.g = -1;
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1970, 1, 1);
        this.a = level;
        this.c = lastCharge == null ? calendar : lastCharge;
        this.e = charges;
        this.f = status;
        this.d = calendar;
    }
}
