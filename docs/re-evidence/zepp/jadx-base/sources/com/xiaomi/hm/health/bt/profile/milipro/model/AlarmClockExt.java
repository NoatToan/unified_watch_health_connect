package com.xiaomi.hm.health.bt.profile.milipro.model;

import androidx.annotation.NonNull;
import com.alipay.sdk.m.n.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes18.dex */
public class AlarmClockExt implements Serializable {
    public static final byte ALARM_INVALID = 0;
    public static final byte ALARM_ONCE = -128;
    public static final int ALARM_ONCE_FOR_HUAMI_OS = 0;
    public static final byte ALARM_ONCE_OLD = 0;
    public static final int ALL = 127;
    public static final int FRIDAY = 16;
    public static final int MONDAY = 1;
    public static final int SATURDAY = 32;
    public static final int SUNDAY = 64;
    public static final int THURSDAY = 8;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 4;
    public static final int WEEKEND = 96;
    public static final int[] WEEK_CODE = {1, 2, 4, 8, 16, 32, 64};
    public static final int WORKDAY = 128;
    public static final int WORK_DAY = 31;
    private static final byte k = 0;
    private static final long serialVersionUID = 1;
    private byte a;
    private Calendar e;
    private byte j;
    private boolean b = false;
    private boolean c = false;
    private int d = 127;
    private byte f = 0;
    private boolean g = true;
    private boolean h = false;

    @NonNull
    private String i = "";

    public AlarmClockExt() {
        this.e = Calendar.getInstance();
        this.e = Calendar.getInstance();
    }

    private static AlarmClockExt a(byte[] value) {
        if (value == null || value.length != 4) {
            return null;
        }
        AlarmClockExt alarmClockExt = new AlarmClockExt();
        alarmClockExt.setIndex((byte) (value[0] & 31));
        alarmClockExt.setSmart((value[0] & 32) != 0);
        alarmClockExt.enableLazyMode((value[0] & 64) == 0);
        alarmClockExt.setEnable((value[0] & 128) != 0);
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, value[1]);
        calendar.set(12, value[2]);
        alarmClockExt.setCalendar(calendar);
        alarmClockExt.setRepeat(value[3]);
        return alarmClockExt;
    }

    public static ArrayList<AlarmClockExt> fromBytes(byte[] value) {
        if (value == null || value.length == 0) {
            return new ArrayList<>();
        }
        if (value.length % 4 != 0) {
            return null;
        }
        ArrayList<AlarmClockExt> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > value.length) {
                return arrayList;
            }
            AlarmClockExt alarmClockExtA = a(new byte[]{value[i], value[i + 1], value[i + 2], value[i + 3]});
            if (alarmClockExtA != null) {
                arrayList.add(alarmClockExtA);
            }
            i = i2;
        }
    }

    public void enableLazyMode(boolean enable) {
        this.b = enable;
    }

    public boolean expired() {
        return getCalendar().getTimeInMillis() < Calendar.getInstance().getTimeInMillis();
    }

    public byte[] getBytes() {
        if (!isVisible()) {
            setRepeat(0);
        } else if (getRepeat() == 0) {
            setRepeat(a.g);
        }
        if (getRepeat() == 128) {
            setRepeat(31);
        }
        return new byte[]{(byte) ((((byte) (isEnable() ? 128 : 0)) | getIndex() | ((byte) (this.b ? 0 : 64)) | ((byte) (isSmart() ? 32 : 0))) & 255), getHour(), getMinutes(), (byte) getRepeat()};
    }

    public Calendar getCalendar() {
        return this.e;
    }

    public byte getHour() {
        return (byte) this.e.get(11);
    }

    public short getIndex() {
        return this.a;
    }

    public byte getMinutes() {
        return (byte) this.e.get(12);
    }

    public int getRepeat() {
        return this.d;
    }

    public byte getSmartWakeTime() {
        return this.f;
    }

    public byte getSource() {
        return this.j;
    }

    @NonNull
    public String getTitle() {
        return this.i;
    }

    public boolean isEnable() {
        return this.c;
    }

    public boolean isLazy() {
        return !this.b;
    }

    public boolean isSmart() {
        return this.h;
    }

    public boolean isVisible() {
        return this.g;
    }

    public void setCalendar(Calendar calendar) {
        this.e = calendar;
    }

    public void setEnable(boolean enable) {
        this.c = enable;
    }

    public void setHourAndMinute(int hour, int minute) {
        this.e.set(11, hour);
        this.e.set(12, minute);
    }

    public void setIndex(byte index) {
        this.a = index;
    }

    public void setRepeat(int repeat) {
        this.d = repeat;
    }

    public void setSmart(boolean isSmart) {
        this.h = isSmart;
    }

    public void setSmartWakeupTime(byte smartWakeupTime) {
        this.f = smartWakeupTime;
    }

    public void setSource(byte source) {
        this.j = source;
    }

    public void setTitle(@NonNull String title) {
        this.i = title;
    }

    public void setVisible(boolean visible) {
        this.g = visible;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AlarmClockExt{title=");
        String str = this.i;
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(",index=");
        sb.append((int) this.a);
        sb.append(", isLazy=");
        sb.append(isLazy());
        sb.append(", enable=");
        sb.append(this.c);
        sb.append(", repeat=");
        sb.append(this.d);
        sb.append(", mCalendar=");
        Calendar calendar = this.e;
        sb.append(calendar != null ? calendar.getTime() : "null");
        sb.append(", mSmartWakeupTime=");
        sb.append((int) this.f);
        sb.append(", isVisible=");
        sb.append(this.g);
        sb.append(", isSmart=");
        sb.append(this.h);
        sb.append(",source=");
        sb.append((int) this.j);
        sb.append('}');
        return sb.toString();
    }

    public AlarmClockExt(byte index) {
        this.e = Calendar.getInstance();
        this.a = index;
        this.e = Calendar.getInstance();
    }
}
