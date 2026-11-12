package com.xiaomi.hm.health.ui.information;

import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;

/* JADX INFO: loaded from: classes22.dex */
public class StatUtils {
    public static final int TYPE_DAY = 0;
    public static final int TYPE_MONTH = 2;
    public static final int TYPE_WEEK = 1;
    private static final String a = "StatUtils";

    public static String getLabelStr(Calendar cal, int mode) {
        String[] stringArray = BraceletApp.getContext().getResources().getStringArray(R.array.month_list);
        if (mode == 0) {
            return TimeUtils.formatDate_no_y(BraceletApp.getContext(), cal.getTime(), true);
        }
        if (mode != 1) {
            return mode == 2 ? stringArray[cal.get(2)] : "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(cal.getTimeInMillis());
        calendar.set(7, 7);
        calendar.add(5, 1);
        if (calendar.after(Calendar.getInstance())) {
            calendar = Calendar.getInstance();
        }
        return TimeUtils.formatDate_no_y(BraceletApp.getContext(), cal.getTime(), true) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + TimeUtils.formatDate_no_y(BraceletApp.getContext(), calendar.getTime(), true);
    }
}
