package com.xiaomi.fitness.settingitem.settingitem;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.a41;
import defpackage.m14;
import defpackage.t64;
import defpackage.y0j;
import java.io.Serializable;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class AlarmSettingItem implements Serializable, Comparable<AlarmSettingItem>, Cloneable {

    @SerializedName("alarmType")
    @Expose
    private int alarmType;

    @SerializedName("enable")
    @Expose
    private boolean enable;

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("isSmart")
    @Expose
    private boolean isSmart;

    @SerializedName("nextAlarmTime")
    @Expose
    private String nextAlarmTime;

    @SerializedName("time")
    @Expose
    private int time;

    @SerializedName("visible")
    @Expose
    private boolean visible;

    @SerializedName("weekdays")
    @Expose
    private int weekdays;

    private int getNextAlarmDays() {
        int i = this.alarmType;
        if (i == 4) {
            return getNextAlarmDays(31);
        }
        if (i != 5) {
            return 0;
        }
        return getNextAlarmDays(this.weekdays);
    }

    private String getStringHour(int i) {
        if (i > 9) {
            return i + "";
        }
        return "0" + i;
    }

    private String getStringMinute(int i) {
        if (i > 9) {
            return i + "";
        }
        return "0" + i;
    }

    private boolean isWeekdaysTrue(int i) {
        return ((this.weekdays >> i) & 1) == 1;
    }

    public static AlarmSettingItem parse(m14 m14Var) {
        AlarmSettingItem alarmSettingItem = new AlarmSettingItem();
        alarmSettingItem.id = m14Var.c;
        m14.a aVar = m14Var.d;
        alarmSettingItem.alarmType = aVar.d;
        alarmSettingItem.enable = aVar.f;
        alarmSettingItem.isSmart = aVar.h == 1;
        t64 t64Var = aVar.c;
        if (t64Var != null) {
            alarmSettingItem.time = (t64Var.c * 3600) + (t64Var.d * 60) + t64Var.e;
        }
        alarmSettingItem.weekdays = aVar.e;
        return alarmSettingItem;
    }

    public void addRepeatItem(int i) {
        this.weekdays = (1 << i) | this.weekdays;
    }

    public void closeAlarm() {
        if (isEnable() || getAlarmType() != 0) {
            return;
        }
        setNextAlarmTimeLong(0L);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AlarmSettingItem alarmSettingItem = (AlarmSettingItem) obj;
        return (alarmSettingItem.getId() == -1 || getId() == -1 || alarmSettingItem.getId() != getId()) ? false : true;
    }

    public int getAlarmType() {
        return this.alarmType;
    }

    public String getCustomDay(Context context) {
        if (this.weekdays == 0) {
            return context.getString(y0j.d);
        }
        if (a41.f591a == null) {
            a41.c(context);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a41.f591a.length; i++) {
            if (isWeekdaysTrue(i)) {
                sb.append(a41.f591a[i]);
                sb.append(context.getString(y0j.g));
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 2);
        return sb.toString();
    }

    public int getDays() {
        return this.weekdays;
    }

    public boolean[] getDaysState() {
        boolean[] zArr = {false, false, false, false, false, false, false};
        if (this.weekdays == 0) {
            return zArr;
        }
        if (a41.f591a == null) {
            a41.c(AppUtil.getApp());
        }
        for (int i = 0; i < a41.f591a.length; i++) {
            zArr[i] = isWeekdaysTrue(i);
        }
        return zArr;
    }

    public String getHM() {
        int i = this.time;
        int i2 = i / 3600;
        return getStringHour(i2) + ":" + getStringMinute((i - (i2 * 3600)) / 60);
    }

    public int getHour() {
        return this.time / 3600;
    }

    public int getId() {
        return this.id;
    }

    public int getMinute() {
        return (this.time % 3600) / 60;
    }

    public String getNextAlarmTime() {
        return this.nextAlarmTime;
    }

    public long getNextAlarmTimeLong() {
        if (TextUtils.isEmpty(this.nextAlarmTime) || this.nextAlarmTime.length() != 16) {
            return 0L;
        }
        try {
            return TimeDateUtil.INSTANCE.dateToMs(this.nextAlarmTime, "yyyy-MM-dd HH:mm");
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public long getNextString() {
        return (System.currentTimeMillis() / 1000) + ((long) (getTime() - ((Calendar.getInstance().get(11) * 3600) + (Calendar.getInstance().get(12) * 60))));
    }

    public String getStringRepeatType(Context context) {
        int i = this.alarmType;
        if (i == 0) {
            return context.getString(y0j.d);
        }
        if (i == 1) {
            return context.getString(y0j.f39651a);
        }
        if (i == 2) {
            return context.getString(y0j.f);
        }
        if (i == 3) {
            return context.getString(y0j.f39652b);
        }
        if (i != 4) {
            return i != 5 ? "" : getCustomDay(context);
        }
        return context.getString(y0j.c);
    }

    public int getTime() {
        return this.time;
    }

    public String getTimeString(Context context) {
        int i = this.alarmType;
        if (i == 3 || i == 2) {
            return "";
        }
        int i2 = this.time;
        int i3 = i2 / 3600;
        int i4 = (i2 - (i3 * 3600)) / 60;
        int i5 = Calendar.getInstance().get(11);
        int i6 = Calendar.getInstance().get(12);
        if (!this.enable) {
            return context.getString(y0j.h);
        }
        if (isOverDue()) {
            if (i4 < i6) {
                i4 += 60;
                i3--;
            }
            i3 += 24;
        } else if (i4 < i6) {
            i4 += 60;
            i3--;
        }
        return context.getString(y0j.e, TimeDateUtil.INSTANCE.getZNTimeDDHHMM((getNextAlarmDays() * 1440) + ((i3 - i5) * 60) + (i4 - i6)));
    }

    public int getWeekdays() {
        return this.weekdays;
    }

    public int hashCode() {
        String str = this.nextAlarmTime;
        return (((((((((((((((str == null ? 0 : str.hashCode()) + 31) * 31) + this.alarmType) * 31) + (this.visible ? 1 : 0)) * 31) + (this.enable ? 1 : 0)) * 31) + this.weekdays) * 31) + this.time) * 31) + this.id) * 31) + (this.isSmart ? 1 : 0);
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isIsSmart() {
        return this.isSmart;
    }

    public boolean isOpen() {
        return isEnable();
    }

    public boolean isOverDue() {
        return getTime() - ((Calendar.getInstance().get(11) * 3600) + (Calendar.getInstance().get(12) * 60)) <= 0;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void removeRepeatItem(int i) {
        this.weekdays = (~(1 << i)) & this.weekdays;
    }

    public void setAlarmType(int i) {
        this.alarmType = i;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setIsSmart(boolean z) {
        this.isSmart = z;
    }

    public void setNextAlarmTime(String str) {
        this.nextAlarmTime = str;
    }

    public void setNextAlarmTimeIfReOpen() {
        if (isEnable() && getAlarmType() == 0 && System.currentTimeMillis() >= getNextAlarmTimeLong()) {
            setNextAlarmTimeLong(getNextAlarmTime(getTime(), true));
        }
    }

    public void setNextAlarmTimeLong(long j) {
        this.nextAlarmTime = TimeDateUtil.getDateFormated(j, "yyyy-MM-dd HH:mm");
    }

    public void setNextAlarmTimeNow() {
        if (isEnable() && getAlarmType() == 0) {
            setNextAlarmTimeLong(getNextAlarmTime(getTime(), false));
        }
    }

    public void setTime(int i) {
        this.time = i;
    }

    public void setVisible(boolean z) {
        this.visible = z;
    }

    public void setWeekdays(int i) {
        this.weekdays = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AlarmSettingItem.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append("nextAlarmTime");
        sb.append('=');
        String str = this.nextAlarmTime;
        if (str == null) {
            str = "<null>";
        }
        sb.append(str);
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(this.time);
        sb.append(',');
        sb.append("enable");
        sb.append('=');
        sb.append(this.enable);
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("alarmType");
        sb.append('=');
        sb.append(this.alarmType);
        sb.append(',');
        sb.append("weekdays");
        sb.append('=');
        sb.append(this.weekdays);
        sb.append(',');
        sb.append("visible");
        sb.append('=');
        sb.append(this.visible);
        sb.append(',');
        sb.append("isSmart");
        sb.append('=');
        sb.append(this.isSmart);
        sb.append(',');
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.setCharAt(sb.length() - 1, AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    private long getNextAlarmTime(int i, boolean z) {
        Calendar calendar = Calendar.getInstance();
        if (z) {
            calendar.add(5, 1);
        }
        int i2 = i / 3600;
        calendar.set(11, i2);
        calendar.set(12, (i - (i2 * 3600)) / 60);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AlarmSettingItem m556clone() {
        try {
            return (AlarmSettingItem) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            AlarmSettingItem alarmSettingItem = new AlarmSettingItem();
            alarmSettingItem.enable = this.enable;
            alarmSettingItem.alarmType = this.alarmType;
            alarmSettingItem.id = this.id;
            alarmSettingItem.visible = this.visible;
            alarmSettingItem.nextAlarmTime = this.nextAlarmTime;
            alarmSettingItem.time = this.time;
            alarmSettingItem.weekdays = this.weekdays;
            return alarmSettingItem;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(AlarmSettingItem alarmSettingItem) {
        return this.id - alarmSettingItem.getId();
    }

    public void setTime(int i, int i2) {
        this.time = (i * 3600) + (i2 * 60);
    }

    private int getNextAlarmDays(int i) {
        int i2 = Calendar.getInstance().get(7);
        if (i == 0) {
            return 0;
        }
        if (i2 == 1) {
            i2 = 8;
        }
        int i3 = i2 - 2;
        if (isOverDue()) {
            i3 = i2 - 1;
        }
        if (((i >> (i3 % 7)) & 1) == 1) {
            return 0;
        }
        int i4 = 1;
        while (i4 < 7 && ((i >> ((i3 + i4) % 7)) & 1) != 1) {
            i4++;
        }
        return i4;
    }

    public static m14 parse(AlarmSettingItem alarmSettingItem) {
        m14 m14Var = new m14();
        m14Var.c = alarmSettingItem.id;
        m14.a aVar = new m14.a();
        m14Var.d = aVar;
        aVar.d = alarmSettingItem.alarmType;
        aVar.h = alarmSettingItem.isSmart ? 1 : 2;
        aVar.f = alarmSettingItem.enable;
        aVar.e = alarmSettingItem.weekdays;
        aVar.c = new t64();
        t64 t64Var = m14Var.d.c;
        int i = alarmSettingItem.time;
        t64Var.c = i / 3600;
        t64Var.d = (i % 3600) / 60;
        t64Var.e = (i % 3600) % 60;
        return m14Var;
    }
}
