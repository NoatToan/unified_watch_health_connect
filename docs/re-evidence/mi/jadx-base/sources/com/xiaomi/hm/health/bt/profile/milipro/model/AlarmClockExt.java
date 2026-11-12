package com.xiaomi.hm.health.bt.profile.milipro.model;

import androidx.work.WorkInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class AlarmClockExt implements Serializable {
    public static final byte ALARM_INVALID = 0;
    public static final byte ALARM_ONCE = -128;
    public static final int ALARM_ONCE_FOR_HUAMI_OS = 0;
    public static final byte ALARM_ONCE_OLD = 0;
    public static final int ALL = 127;
    public static final int FRIDAY = 16;
    public static final int MONDAY = 1;
    private static final byte NOT_REMIND_LATER = 0;
    public static final int SATURDAY = 32;
    public static final int SUNDAY = 64;
    public static final int THURSDAY = 8;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 4;
    public static final int WEEKEND = 96;
    public static final int[] WEEK_CODE = {1, 2, 4, 8, 16, 32, 64};
    public static final int WORKDAY = 128;
    public static final int WORK_DAY = 31;
    private static final long serialVersionUID = 1;
    private byte index;
    private Calendar mCalendar;
    private byte source;
    private boolean isLazy = false;
    private boolean enable = false;
    private int repeat = 127;
    private byte mSmartWakeupTime = 0;
    private boolean isVisible = true;
    private boolean isSmart = false;
    private String title = "";

    public AlarmClockExt() {
        this.mCalendar = Calendar.getInstance();
        this.mCalendar = Calendar.getInstance();
    }

    public static ArrayList<AlarmClockExt> fromBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new ArrayList<>();
        }
        if (bArr.length % 4 != 0) {
            return null;
        }
        ArrayList<AlarmClockExt> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > bArr.length) {
                return arrayList;
            }
            AlarmClockExt bytes = parseBytes(new byte[]{bArr[i], bArr[i + 1], bArr[i + 2], bArr[i + 3]});
            if (bytes != null) {
                arrayList.add(bytes);
            }
            i = i2;
        }
    }

    private static AlarmClockExt parseBytes(byte[] bArr) {
        if (bArr == null || bArr.length != 4) {
            return null;
        }
        AlarmClockExt alarmClockExt = new AlarmClockExt();
        alarmClockExt.setIndex((byte) (bArr[0] & 31));
        alarmClockExt.setSmart((bArr[0] & 32) != 0);
        alarmClockExt.enableLazyMode((bArr[0] & 64) == 0);
        alarmClockExt.setEnable((bArr[0] & 128) != 0);
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, bArr[1]);
        calendar.set(12, bArr[2]);
        alarmClockExt.setCalendar(calendar);
        alarmClockExt.setRepeat(bArr[3]);
        return alarmClockExt;
    }

    public void enableLazyMode(boolean z) {
        this.isLazy = z;
    }

    public boolean expired() {
        return getCalendar().getTimeInMillis() < Calendar.getInstance().getTimeInMillis();
    }

    public byte[] getBytes() {
        if (!isVisible()) {
            setRepeat(0);
        } else if (getRepeat() == 0) {
            setRepeat(WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
        }
        if (getRepeat() == 128) {
            setRepeat(31);
        }
        return new byte[]{(byte) ((((byte) (isEnable() ? 128 : 0)) | getIndex() | ((byte) (this.isLazy ? 0 : 64)) | ((byte) (isSmart() ? 32 : 0))) & 255), getHour(), getMinutes(), (byte) getRepeat()};
    }

    public Calendar getCalendar() {
        return this.mCalendar;
    }

    public byte getHour() {
        return (byte) this.mCalendar.get(11);
    }

    public short getIndex() {
        return this.index;
    }

    public byte getMinutes() {
        return (byte) this.mCalendar.get(12);
    }

    public int getRepeat() {
        return this.repeat;
    }

    public byte getSmartWakeTime() {
        return this.mSmartWakeupTime;
    }

    public byte getSource() {
        return this.source;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isLazy() {
        return !this.isLazy;
    }

    public boolean isSmart() {
        return this.isSmart;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void setCalendar(Calendar calendar) {
        this.mCalendar = calendar;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setHourAndMinute(int i, int i2) {
        this.mCalendar.set(11, i);
        this.mCalendar.set(12, i2);
    }

    public void setIndex(byte b2) {
        this.index = b2;
    }

    public void setRepeat(int i) {
        this.repeat = i;
    }

    public void setSmart(boolean z) {
        this.isSmart = z;
    }

    public void setSmartWakeupTime(byte b2) {
        this.mSmartWakeupTime = b2;
    }

    public void setSource(byte b2) {
        this.source = b2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AlarmClockExt{title=");
        String str = this.title;
        Object time = AbstractJsonLexerKt.NULL;
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        sb.append(str);
        sb.append(",index=");
        sb.append((int) this.index);
        sb.append(", isLazy=");
        sb.append(isLazy());
        sb.append(", enable=");
        sb.append(this.enable);
        sb.append(", repeat=");
        sb.append(this.repeat);
        sb.append(", mCalendar=");
        Calendar calendar = this.mCalendar;
        if (calendar != null) {
            time = calendar.getTime();
        }
        sb.append(time);
        sb.append(", mSmartWakeupTime=");
        sb.append((int) this.mSmartWakeupTime);
        sb.append(", isVisible=");
        sb.append(this.isVisible);
        sb.append(", isSmart=");
        sb.append(this.isSmart);
        sb.append(",source=");
        sb.append((int) this.source);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public AlarmClockExt(byte b2) {
        this.mCalendar = Calendar.getInstance();
        this.index = b2;
        this.mCalendar = Calendar.getInstance();
    }
}
