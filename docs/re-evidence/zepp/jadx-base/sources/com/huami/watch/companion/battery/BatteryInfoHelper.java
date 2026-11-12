package com.huami.watch.companion.battery;

import android.content.Context;
import com.huami.watch.companion.R;
import com.huami.watch.companion.battery.bean.BatteryInfo;
import com.huami.watch.transport.DataBundle;

/* JADX INFO: loaded from: classes16.dex */
public class BatteryInfoHelper {
    public static final String KEY_BATTERY_LEVEL = "BatteryLevel";
    public static final String KEY_CHARGING_INTERVAL_DAYS = "ChargingIntervalDays";
    public static final String KEY_CHARGING_TIME = "ChargingTime";
    public static final String KEY_IS_CHARGING = "BatteryIsCharging";
    public static final String KEY_SYNC = "Sync";
    public static final String TAG = "BatteryInfoHelper";

    public static String formatBatteryIntervalText(Context context, int i, long j) {
        if (j == Long.MIN_VALUE) {
            if (i == -1) {
                return context.getResources().getString(R.string.battery_charge_no_charge_record);
            }
            if (i < 1) {
                return context.getResources().getString(R.string.battery_charge_less_than_oneday);
            }
            return context.getResources().getString(R.string.battery_charging_since_last_charge, context.getResources().getQuantityString(R.plurals.plural_days, i, Integer.valueOf(i)));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = context.getResources().getString(R.string.battery_charge_no_charge_record);
        if (j >= 0) {
            long j2 = jCurrentTimeMillis - j;
            if (j2 >= 0) {
                long jAbs = Math.abs(j2);
                int i2 = (int) (jAbs / 86400000);
                int i3 = (int) ((jAbs % 86400000) / 3600000);
                if (i2 < 1) {
                    if (i3 < 1) {
                        return context.getResources().getString(R.string.battery_charging_intervalLessHour);
                    }
                    return context.getResources().getString(R.string.battery_charging_since_last_charge, context.getResources().getQuantityString(R.plurals.plural_hours, i3, Integer.valueOf(i3)));
                }
                if (i2 > 60) {
                    return string;
                }
                if (i3 < 1) {
                    return context.getResources().getString(R.string.battery_charging_since_last_charge, context.getResources().getQuantityString(R.plurals.plural_days, i2, Integer.valueOf(i2)));
                }
                String quantityString = context.getResources().getQuantityString(R.plurals.plural_days, i2, Integer.valueOf(i2));
                String quantityString2 = context.getResources().getQuantityString(R.plurals.plural_hours, i3, Integer.valueOf(i3));
                return context.getResources().getString(R.string.battery_charging_since_last_charge, quantityString + " " + quantityString2);
            }
        }
        return string;
    }

    public static BatteryInfo getBatteryInfo(DataBundle dataBundle) {
        BatteryInfo batteryInfo = new BatteryInfo();
        batteryInfo.setBatteryCharging(dataBundle.getBoolean(KEY_IS_CHARGING));
        batteryInfo.setBatteryLevel(dataBundle.getInt(KEY_BATTERY_LEVEL));
        batteryInfo.setBatteryChargingTime(dataBundle.getLong(KEY_CHARGING_TIME, Long.MIN_VALUE));
        batteryInfo.setBatteryIntervalDay(dataBundle.getInt(KEY_CHARGING_INTERVAL_DAYS, -1));
        return batteryInfo;
    }
}
