package com.huami.watch.companion.manager;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes16.dex */
public class UnitManager {
    public static final int DISTANCE_KM = 0;
    public static final int DISTANCE_MI = 1;
    public static final int HEIGHT_CM = 0;
    public static final int HEIGHT_FT_IN = 1;
    public static final int WEIGHT_JIN = 0;
    public static final int WEIGHT_KG = 1;
    public static final int WEIGHT_LBS = 2;
    private static final String e = "UnitManager";
    private static volatile UnitManager f;
    private Context a;
    private int b;
    private int c;
    private int d;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.WEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        DISTANCE,
        HEIGHT,
        WEIGHT
    }

    private UnitManager(Context context) {
        this.a = context;
        init();
    }

    private int a(b bVar) {
        int i = !Config.isLocaleUnitImperial(this.a) ? 1 : 0;
        int i2 = a.a[bVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return i ^ 1;
        }
        if (i2 != 3) {
            return 0;
        }
        return i == 0 ? 2 : 1;
    }

    private void b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        int iOptInt = jSONObject.optInt("distance", -1);
        int iOptInt2 = jSONObject.optInt("height", -1);
        int iOptInt3 = jSONObject.optInt("weight", -1);
        if (iOptInt != -1 && iOptInt2 != -1 && iOptInt3 != -1) {
            this.b = iOptInt;
            this.c = iOptInt2;
            this.d = iOptInt3;
            return;
        }
        JSONObject jSONObjectOptJSONObject = Config.isBuildOversea() ? jSONObject.optJSONObject("US") : jSONObject.optJSONObject("CN");
        if (jSONObjectOptJSONObject != null) {
            this.b = jSONObjectOptJSONObject.optInt("distance", this.b);
            this.c = jSONObjectOptJSONObject.optInt("height", this.c);
            this.d = jSONObjectOptJSONObject.optInt("weight", this.d);
            c();
        }
    }

    private void c() {
        String str = UserSettings.get(this.a.getContentResolver(), UserSettingsKeys.KEY_USER_UNIT);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String string = MessageFormatter.c;
        if (zIsEmpty) {
            str = MessageFormatter.c;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("distance", this.b);
            jSONObject2.put("height", this.c);
            jSONObject2.put("weight", this.d);
            if (Config.isBuildOversea()) {
                jSONObject.put("US", jSONObject2);
            } else {
                jSONObject.put("CN", jSONObject2);
            }
            jSONObject.put("distance", this.b);
            jSONObject.put("height", this.c);
            jSONObject.put("weight", this.d);
            string = jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Log.d(e, "Save User Unit : " + string, new Object[0]);
        UserSettings.put(this.a.getContentResolver(), UserSettingsKeys.KEY_USER_UNIT, string);
    }

    public static UnitManager getInstance(@NonNull Context context) {
        if (f == null) {
            synchronized (UnitManager.class) {
                if (f == null) {
                    f = new UnitManager(context.getApplicationContext());
                }
            }
        }
        return f;
    }

    public static boolean isDistanceKM(@NonNull Context context) {
        return com.xiaomi.hm.health.manager.UnitManager.getInstance().isMetric();
    }

    public int getDistanceUnit() {
        return com.xiaomi.hm.health.manager.UnitManager.getInstance().getLengthUnit();
    }

    public int getHeightUnit() {
        return com.xiaomi.hm.health.manager.UnitManager.getInstance().getLengthUnit();
    }

    public int getWeightUnit() {
        int weightUnit = com.xiaomi.hm.health.manager.UnitManager.getInstance().getWeightUnit();
        if (weightUnit == 0) {
            this.d = 0;
        } else if (weightUnit == 1) {
            this.d = 1;
        } else if (weightUnit == 2) {
            this.d = 2;
        }
        return this.d;
    }

    public void init() {
        this.b = a(b.DISTANCE);
        this.c = a(b.HEIGHT);
        this.d = a(b.WEIGHT);
        String str = UserSettings.get(this.a.getContentResolver(), UserSettingsKeys.KEY_USER_UNIT);
        Log.d(e, "Read User Unit : " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            b(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Log.d(e, "Read User Unit, Distance : " + this.b + " , Height : " + this.c + ", Weight : " + this.d, new Object[0]);
    }

    public void setDistanceUnit(int i) {
        if (i != this.b) {
            this.b = i;
            c();
        }
    }

    public void setHeightUnit(int i) {
        if (i != this.c) {
            this.c = i;
            c();
        }
    }

    public void setWeightUnit(int i) {
        if (i != this.d) {
            this.d = i;
            c();
        }
    }
}
