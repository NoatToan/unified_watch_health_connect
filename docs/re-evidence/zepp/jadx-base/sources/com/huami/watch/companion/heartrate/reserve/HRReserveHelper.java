package com.huami.watch.companion.heartrate.reserve;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.watch.companion.heartrate.reserve.bean.HeartRateReserveInfo;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;

/* JADX INFO: loaded from: classes16.dex */
public class HRReserveHelper {
    private static HRReserveHelper b;
    private HeartRateReserveInfo a;

    private HRReserveHelper(Context context) {
        a(context);
    }

    private void a(Context context) {
        String str = UserSettings.get(context.getContentResolver(), UserSettingsKeys.KEY_RESERVE_HEARTRATE);
        if (TextUtils.isEmpty(str)) {
            this.a = new HeartRateReserveInfo();
        } else {
            this.a = (HeartRateReserveInfo) new Gson().fromJson(str, HeartRateReserveInfo.class);
        }
    }

    public static HRReserveHelper getInstance(Context context) {
        if (b == null) {
            b = new HRReserveHelper(context);
        }
        return b;
    }

    public void clean() {
        this.a = null;
        b = null;
    }

    public HeartRateReserveInfo getInfo() {
        return this.a;
    }

    public boolean isReserveType() {
        HeartRateReserveInfo heartRateReserveInfo = this.a;
        return heartRateReserveInfo != null && heartRateReserveInfo.getHeartRateType() == 0;
    }
}
