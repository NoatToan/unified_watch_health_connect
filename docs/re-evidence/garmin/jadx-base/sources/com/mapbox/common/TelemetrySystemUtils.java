package com.mapbox.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import tn.k;

/* JADX INFO: loaded from: classes2.dex */
public class TelemetrySystemUtils {
    private static final String BACKGROUND = "Background";
    private static final String CODE_DIVISION_MULTIPLE_ACCESS = "CDMA";
    private static final int DEFAULT_BATTERY_LEVEL = -1;
    private static final String ENHANCED_DATA_GSM_EVOLUTION = "EDGE";
    private static final String ENHANCED_HIGH_RATE_PACKET_DATA = "EHRPD";
    private static final String EVOLUTION_DATA_OPTIMIZED_0 = "EVDO_0";
    private static final String EVOLUTION_DATA_OPTIMIZED_A = "EVDO_A";
    private static final String EVOLUTION_DATA_OPTIMIZED_B = "EVDO_B";
    private static final String FOREGROUND = "Foreground";
    private static final String GENERAL_PACKET_RADIO_SERVICE = "GPRS";
    private static final String HIGH_SPEED_DOWNLINK_PACKET_ACCESS = "HSDPA";
    private static final String HIGH_SPEED_PACKET_ACCESS = "HSPA";
    private static final String HIGH_SPEED_PACKET_ACCESS_PLUS = "HSPAP";
    private static final String HIGH_SPEED_UNLINK_PACKET_ACCESS = "HSUPA";
    private static final String INTEGRATED_DIGITAL_ENHANCED_NETWORK = "IDEN";
    private static final String LONG_TERM_EVOLUTION = "LTE";
    private static final String MAPBOX_SHARED_PREFERENCES = "MapboxSharedPreferences";
    private static final String MAPBOX_SHARED_PREFERENCE_KEY_VENDOR_ID = "mapboxVendorId";
    private static final String NO_STATE = "";
    private static final int PERCENT_SCALE = 100;
    private static final String SINGLE_CARRIER_RTT = "1xRTT";
    private static final String TAG = "TelemetryUtils";
    private static final int UNAVAILABLE_BATTERY_LEVEL = -1;
    private static final String UNIVERSAL_MOBILE_TELCO_SERVICE = "UMTS";
    private static final String UNKNOWN = "Unknown";
    private static final String DATE_AND_TIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_AND_TIME_PATTERN, Locale.US);
    private static final Map<Integer, String> NETWORKS = new HashMap<Integer, String>() { // from class: com.mapbox.common.TelemetrySystemUtils.1
        {
            put(7, TelemetrySystemUtils.SINGLE_CARRIER_RTT);
            put(4, TelemetrySystemUtils.CODE_DIVISION_MULTIPLE_ACCESS);
            put(2, TelemetrySystemUtils.ENHANCED_DATA_GSM_EVOLUTION);
            put(14, TelemetrySystemUtils.ENHANCED_HIGH_RATE_PACKET_DATA);
            put(5, TelemetrySystemUtils.EVOLUTION_DATA_OPTIMIZED_0);
            put(6, TelemetrySystemUtils.EVOLUTION_DATA_OPTIMIZED_A);
            put(12, TelemetrySystemUtils.EVOLUTION_DATA_OPTIMIZED_B);
            put(1, TelemetrySystemUtils.GENERAL_PACKET_RADIO_SERVICE);
            put(8, TelemetrySystemUtils.HIGH_SPEED_DOWNLINK_PACKET_ACCESS);
            put(10, TelemetrySystemUtils.HIGH_SPEED_PACKET_ACCESS);
            put(15, TelemetrySystemUtils.HIGH_SPEED_PACKET_ACCESS_PLUS);
            put(9, TelemetrySystemUtils.HIGH_SPEED_UNLINK_PACKET_ACCESS);
            put(11, TelemetrySystemUtils.INTEGRATED_DIGITAL_ENHANCED_NETWORK);
            put(13, TelemetrySystemUtils.LONG_TERM_EVOLUTION);
            put(3, TelemetrySystemUtils.UNIVERSAL_MOBILE_TELCO_SERVICE);
            put(0, TelemetrySystemUtils.UNKNOWN);
        }
    };

    public static String generateCreateDateFormatted(Date date) {
        return dateFormat.format(date);
    }

    public static boolean isPluggedIn(Context context) {
        Intent intentRegisterBatteryUpdates = registerBatteryUpdates(context);
        if (intentRegisterBatteryUpdates == null) {
            return false;
        }
        int intExtra = intentRegisterBatteryUpdates.getIntExtra("plugged", -1);
        return (intExtra == 2) || (intExtra == 1);
    }

    public static int obtainBatteryLevel(Context context) {
        Intent intentRegisterBatteryUpdates = registerBatteryUpdates(context);
        if (intentRegisterBatteryUpdates == null) {
            return -1;
        }
        int intExtra = intentRegisterBatteryUpdates.getIntExtra("level", -1);
        int intExtra2 = intentRegisterBatteryUpdates.getIntExtra("scale", -1);
        if (intExtra < 0 || intExtra2 <= 0) {
            return -1;
        }
        return Math.round((intExtra / intExtra2) * 100.0f);
    }

    @SuppressLint({"MissingPermission"})
    public static String obtainCellularNetworkType(Context context) {
        int dataNetworkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                dataNetworkType = telephonyManager.getDataNetworkType();
            } catch (SecurityException e4) {
                Log.debug(e4.toString(), TAG);
                dataNetworkType = 0;
            }
        } else {
            dataNetworkType = telephonyManager.getNetworkType();
        }
        Map<Integer, String> map = NETWORKS;
        return map.containsKey(Integer.valueOf(dataNetworkType)) ? map.get(Integer.valueOf(dataNetworkType)) : UNKNOWN;
    }

    public static String obtainCurrentDate() {
        return dateFormat.format(new Date());
    }

    public static String obtainUniversalUniqueIdentifier() {
        return UUID.randomUUID().toString();
    }

    private static Intent registerBatteryUpdates(Context context) {
        try {
            return context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception e4) {
            Log.error(k.g(e4.toString(), ": Failed receiver registration for ACTION_BATTERY_CHANGED"), TAG);
            return null;
        }
    }
}
