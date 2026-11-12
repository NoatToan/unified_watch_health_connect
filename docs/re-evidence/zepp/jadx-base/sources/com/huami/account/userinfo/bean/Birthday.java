package com.huami.account.userinfo.bean;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.huami.account.userinfo.UserinfoExternalsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public class Birthday {
    private static final String d = "Birthday";
    private int a = -1;
    private int b = -1;
    private int c = -1;

    public static Birthday fromStr(String str) {
        Birthday birthday = new Birthday();
        if (TextUtils.isEmpty(str)) {
            return birthday;
        }
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        try {
            if (strArrSplit.length > 0) {
                birthday.setYear(Integer.parseInt(strArrSplit[0]));
            }
            if (strArrSplit.length > 1) {
                birthday.setMonth(Integer.parseInt(strArrSplit[1]));
            }
            if (strArrSplit.length > 2) {
                birthday.setDay(Integer.parseInt(strArrSplit[2]));
            }
        } catch (Exception e) {
            HMLog.d("Birthday", e.toString(), new Object[0]);
        }
        return birthday;
    }

    public int getAge() {
        if (this.a == -1) {
            return -1;
        }
        return Calendar.getInstance().get(1) - this.a;
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
        return this.c;
    }

    public int getMonth() {
        return this.b;
    }

    public int getYear() {
        return this.a;
    }

    public boolean isValid() {
        return this.a > 0 && this.b > 0;
    }

    public void setDay(int i) {
        this.c = i;
    }

    public void setMonth(int i) {
        this.b = i;
    }

    public void setYear(int i) {
        this.a = i;
    }

    public String toString() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.a, this.b - 1, 1);
        return DateUtils.formatDateTime(UserinfoExternalsKt.getAppContext(), calendar.getTimeInMillis(), 52);
    }

    public String toStringData() {
        return this.a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b;
    }
}
