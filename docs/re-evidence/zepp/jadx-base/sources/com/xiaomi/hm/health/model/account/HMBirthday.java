package com.xiaomi.hm.health.model.account;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;

/* JADX INFO: loaded from: classes21.dex */
public class HMBirthday {
    private static final String TAG = "Birthday";
    private int year = -1;
    private int month = -1;
    private int day = -1;

    public static HMBirthday fromStr(String str) {
        HMBirthday hMBirthday = new HMBirthday();
        if (TextUtils.isEmpty(str)) {
            return hMBirthday;
        }
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        try {
            if (strArrSplit.length > 0) {
                hMBirthday.setYear(Integer.valueOf(strArrSplit[0]).intValue());
            }
            if (strArrSplit.length > 1) {
                hMBirthday.setMonth(Integer.valueOf(strArrSplit[1]).intValue());
            }
            if (strArrSplit.length > 2) {
                hMBirthday.setDay(Integer.valueOf(strArrSplit[2]).intValue());
            }
        } catch (Exception e) {
            HMLog.d("Birthday", e.toString(), new Object[0]);
        }
        return hMBirthday;
    }

    public int getAge() {
        if (this.year == -1) {
            return -1;
        }
        return Calendar.getInstance().get(1) - this.year;
    }

    public int getAgeInMonths() {
        int year = getYear();
        int month = getMonth();
        int i = Calendar.getInstance().get(1);
        int i2 = Calendar.getInstance().get(2) + 1;
        HMLog.d("Birthday", "year " + year + " month " + month + " current_year " + i + " current_month " + i2, new Object[0]);
        int i3 = i >= year ? (((i - year) * 12) + i2) - month : 0;
        HMLog.d("Birthday", "months " + i3, new Object[0]);
        if (i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isValid() {
        return this.year > 0 && this.month > 0;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public String toString() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.month - 1, 1);
        return DateUtils.formatDateTime(DeviceXFunctionsKt.getContext(), calendar.getTimeInMillis(), 52);
    }

    public String toStringData() {
        return this.year + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.month;
    }
}
