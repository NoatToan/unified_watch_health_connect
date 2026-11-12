package com.huami.moving.ui.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class SportUIKeeper {
    private static final String a = "sport_ui_kp";
    private static final String b = "insurance_valid_time";
    private static final String c = "insurance_end_time";
    private static final String d = "show_running_hr_unusual_prompt";
    private static final String e = "select_sport_type";
    private static final String f = "is_tip_no_step_again";
    private static final String g = "has_ever_seen_run_reddot";
    private static final String h = "indoor_run_calibrated_data";
    private static final String i = "is_sport_done_tips_needed";
    private static final String j = "is_sport_unlock_tips_needed";
    private static final String k = "_last_sport_device_all_count";
    private static final String l = "_have_opened_device";
    private static final String m = "_have_opened_first_device_value";
    private static final String n = "_have_opened_second_device_value";
    private static final String o = "last_location_lat_lng";
    private static final String p = "MapMileStoneType";
    private static final String q = "sporting_choose_data_item_tip";
    private static final String r = "map_satellite_type_enable";
    private static SharedPreferences s;

    private static void a() {
        SharedPreferences sharedPreferences = s;
        if (sharedPreferences != null) {
            sharedPreferences.edit().clear().apply();
        }
    }

    private static SharedPreferences b(Context context) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        return s;
    }

    public static void clear(Context context) {
        a();
    }

    public static String getIndoorRunCalibratedData(Context context) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        return s.getString(h, "");
    }

    public static boolean getIsTipNoStepAgain(Context context) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        return s.getBoolean(f, true);
    }

    public static Location getLastLocationLatLng(Context context) {
        if (s == null) {
            if (context == null) {
                return null;
            }
            s = context.getSharedPreferences(a, 0);
        }
        String string = s.getString(o, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] strArrSplit = string.split(",");
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            Location location = new Location("gps");
            location.setLatitude(Double.valueOf(strArrSplit[0]).doubleValue());
            location.setLongitude(Double.valueOf(strArrSplit[1]).doubleValue());
            return location;
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int getMapMileStoneFlag(Context context) {
        if (s == null) {
            init(context);
        }
        return s.getInt(p, 1);
    }

    public static Boolean getMapSatelliteTypeEnable(Context context) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        return Boolean.valueOf(s.getBoolean(r, false));
    }

    public static int getSelectSportType(Context context) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        return s.getInt(e, 1);
    }

    public static int getSpecifiedSportTypeHaveOpenedDeviceFirstDeviceValue(Context context, int i2) {
        if (s == null) {
            if (context == null) {
                return -1;
            }
            s = context.getSharedPreferences(a, 0);
        }
        return s.getInt(i2 + m, -2);
    }

    public static int getSpecifiedSportTypeHaveOpenedDeviceSecondDeviceValue(Context context, int i2) {
        if (s == null) {
            if (context == null) {
                return -1;
            }
            s = context.getSharedPreferences(a, 0);
        }
        return s.getInt(i2 + n, -2);
    }

    public static int getSpecifiedSportTypeLastDeviceCount(Context context, int i2) {
        if (s == null) {
            if (context == null) {
                return -1;
            }
            s = context.getSharedPreferences(a, 0);
        }
        return s.getInt(i2 + k, -1);
    }

    public static Boolean getSportingChooseDataItemTip(Context context) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        return Boolean.valueOf(s.getBoolean(q, true));
    }

    public static void init(Context context) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
    }

    public static boolean isSpecifiedSportTypeHaveOpenedDevice(Context context, int i2) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        return s.getBoolean(i2 + l, false);
    }

    public static void putMapMileStoneFlag(int i2, Context context) {
        if (s == null) {
            init(context);
        }
        SharedPreferences.Editor editorEdit = s.edit();
        editorEdit.putInt(p, i2);
        editorEdit.apply();
    }

    public static void saveLastLocationLatLng(Context context, @Nullable Location location) {
        if (s == null) {
            if (context == null) {
                return;
            } else {
                s = context.getSharedPreferences(a, 0);
            }
        }
        if (location == null) {
            s.edit().remove(o).apply();
            return;
        }
        s.edit().putString(o, location.getLatitude() + "," + location.getLongitude()).apply();
    }

    public static void setIndoorRunCalibratedData(Context context, String str) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        SharedPreferences.Editor editorEdit = s.edit();
        editorEdit.putString(h, str);
        editorEdit.apply();
    }

    public static void setIsTipNoStepAgain(Context context, boolean z) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        SharedPreferences.Editor editorEdit = s.edit();
        editorEdit.putBoolean(f, z);
        editorEdit.apply();
    }

    public static void setMapSatelliteTypeEnable(Context context, boolean z) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        SharedPreferences.Editor editorEdit = s.edit();
        editorEdit.putBoolean(r, z);
        editorEdit.apply();
    }

    public static void setSelectSportType(Context context, int i2) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        SharedPreferences.Editor editorEdit = s.edit();
        editorEdit.putInt(e, i2);
        editorEdit.apply();
    }

    public static void setSpecifiedSportTypeHaveOpenedDevice(Context context, int i2, boolean z) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        SharedPreferences.Editor editorEdit = s.edit();
        editorEdit.putBoolean(i2 + l, z);
        editorEdit.apply();
    }

    public static void setSpecifiedSportTypeHaveOpenedDeviceFirstDeviceValue(Context context, int i2, int i3) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        SharedPreferences.Editor editorEdit = s.edit();
        editorEdit.putInt(i2 + m, i3);
        editorEdit.apply();
    }

    public static void setSpecifiedSportTypeHaveOpenedDeviceSecondDeviceValue(Context context, int i2, int i3) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        SharedPreferences.Editor editorEdit = s.edit();
        editorEdit.putInt(i2 + n, i3);
        editorEdit.apply();
    }

    public static void setSpecifiedSportTypeLastDeviceCount(Context context, int i2, int i3) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        SharedPreferences.Editor editorEdit = s.edit();
        editorEdit.putInt(i2 + k, i3);
        editorEdit.apply();
    }

    public static void setSportingChooseDataItemTip(Context context, boolean z) {
        if (s == null) {
            s = context.getSharedPreferences(a, 0);
        }
        SharedPreferences.Editor editorEdit = s.edit();
        editorEdit.putBoolean(q, z);
        editorEdit.apply();
    }
}
