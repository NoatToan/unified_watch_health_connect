package com.example.habit.export;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h4b;
import defpackage.t64;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class HabitBean implements Parcelable {
    public static final Parcelable.Creator<HabitBean> CREATOR = new Parcelable.Creator<HabitBean>() { // from class: com.example.habit.export.HabitBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HabitBean createFromParcel(Parcel parcel) {
            return new HabitBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HabitBean[] newArray(int i) {
            return new HabitBean[i];
        }
    };
    public boolean added;
    public String appBref;
    public String bigIcon;
    public transient int clockMode;
    public int continuousPunch;
    public String deviceBref;
    public String icon;
    public String iconPad;
    public transient boolean isSelected;
    public transient boolean isSyncWatch;
    public String middleIcon;
    public String name;
    public ArrayList<HabitTime> punchTime;
    public WeekDayBean repeat;
    public boolean shock;
    public String smallIcon;
    public boolean syncCalendar;
    private transient t64[] times;
    public transient String timesGsons;
    public int totalInsist;
    public int type;
    public long typeId;
    public long updateTime;
    public transient int weekDays;

    public HabitBean() {
        this.shock = true;
        this.syncCalendar = true;
        this.repeat = new WeekDayBean();
        this.punchTime = new ArrayList<>();
    }

    public static HabitBean convert2Bean(Habit habit) {
        HabitBean habitBean = new HabitBean();
        habitBean.type = habit.type;
        habitBean.typeId = habit.typeId;
        habitBean.name = habit.name;
        habitBean.shock = habit.isEnable;
        habitBean.timesGsons = habit.times;
        habitBean.clockMode = habit.clockMode;
        habitBean.weekDays = habit.weekDays;
        habitBean.smallIcon = habit.smallIcon;
        habitBean.middleIcon = habit.middleIcon;
        habitBean.bigIcon = habit.bigIcon;
        habitBean.deviceBref = habit.deviceBref;
        habitBean.appBref = habit.appBref;
        habitBean.updateTime = habit.updateTime;
        habitBean.isSyncWatch = habit.isSyncWatch;
        habitBean.syncCalendar = habit.syncCalendar;
        return habitBean;
    }

    public Habit convert2DB(boolean z) {
        Habit habit = new Habit();
        habit.type = this.type;
        habit.typeId = this.typeId;
        habit.times = h4b.c(getTimes());
        habit.isEnable = this.shock;
        habit.clockMode = this.clockMode;
        habit.weekDays = this.weekDays;
        habit.isSyncWatch = z;
        habit.updateTime = this.updateTime;
        habit.name = this.name;
        habit.smallIcon = this.smallIcon;
        habit.middleIcon = this.middleIcon;
        habit.bigIcon = this.bigIcon;
        habit.deviceBref = this.deviceBref;
        habit.appBref = this.appBref;
        habit.syncCalendar = this.syncCalendar;
        return habit;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public t64[] getTimes() {
        if (this.times == null) {
            String str = this.timesGsons;
            if (str != null) {
                this.times = (t64[]) h4b.d(str, t64[].class);
            } else {
                ArrayList<HabitTime> arrayList = this.punchTime;
                if (arrayList != null) {
                    this.times = new t64[arrayList.size()];
                    for (int i = 0; i < this.punchTime.size(); i++) {
                        HabitTime habitTime = this.punchTime.get(i);
                        t64 t64Var = new t64();
                        this.times[i] = t64Var;
                        t64Var.c = habitTime.getHour();
                        t64Var.d = habitTime.getMinute();
                    }
                }
            }
        }
        return this.times;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public void initLoadFromNet() {
        WeekDayBean weekDayBean = this.repeat;
        if (weekDayBean != null) {
            if (weekDayBean.getRest()) {
                this.clockMode = 3;
                return;
            }
            if (this.repeat.getWork()) {
                this.clockMode = 2;
                return;
            }
            if (this.repeat.getMon() && this.repeat.getTue() && this.repeat.getWeb() && this.repeat.getThu() && this.repeat.getFri() && this.repeat.getSat() && this.repeat.getSun()) {
                this.clockMode = 1;
                return;
            }
            this.clockMode = 5;
            boolean mon = this.repeat.getMon();
            ?? r0 = mon;
            if (this.repeat.getTue()) {
                r0 = (mon ? 1 : 0) | 2;
            }
            ?? r1 = r0;
            if (this.repeat.getWeb()) {
                r1 = (r0 == true ? 1 : 0) | 4;
            }
            ?? r2 = r1;
            if (this.repeat.getThu()) {
                r2 = (r1 == true ? 1 : 0) | 8;
            }
            ?? r3 = r2;
            if (this.repeat.getFri()) {
                r3 = (r2 == true ? 1 : 0) | 16;
            }
            ?? r4 = r3;
            if (this.repeat.getSat()) {
                r4 = (r3 == true ? 1 : 0) | 32;
            }
            int i = r4;
            if (this.repeat.getSun()) {
                i = (r4 == true ? 1 : 0) | 64;
            }
            this.weekDays = i;
        }
    }

    public void setTimes(t64[] t64VarArr) {
        this.times = t64VarArr;
        this.punchTime.clear();
        for (t64 t64Var : t64VarArr) {
            HabitTime habitTime = new HabitTime();
            habitTime.setHour(t64Var.c);
            habitTime.setMinute(t64Var.d);
            this.punchTime.add(habitTime);
        }
    }

    public String toString() {
        return "HabitBean{typeId=" + this.typeId + ", type=" + this.type + ", name='" + this.name + "', shock=" + this.shock + ", times=" + Arrays.toString(this.times) + ", clockMode=" + this.clockMode + ", weekDays=" + this.weekDays + ", isSelected=" + this.isSelected + ", timesGsons='" + this.timesGsons + "', bigIcon='" + this.bigIcon + "', middleIcon='" + this.middleIcon + "', smallIcon='" + this.smallIcon + "', repeat=" + this.repeat + ", punchTime=" + this.punchTime + ", deviceBref='" + this.deviceBref + "', appBref='" + this.appBref + "', updateTime=" + this.updateTime + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.typeId);
        parcel.writeInt(this.type);
        parcel.writeInt(this.weekDays);
        parcel.writeInt(this.clockMode);
        parcel.writeString(this.name);
        parcel.writeByte(this.shock ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.added ? (byte) 1 : (byte) 0);
        parcel.writeString(this.bigIcon);
        parcel.writeString(this.middleIcon);
        parcel.writeString(this.smallIcon);
        parcel.writeString(this.icon);
        parcel.writeString(this.iconPad);
        parcel.writeParcelable(this.repeat, i);
        parcel.writeTypedList(this.punchTime);
        parcel.writeString(this.deviceBref);
        parcel.writeString(this.appBref);
        parcel.writeString(this.timesGsons);
        parcel.writeLong(this.updateTime);
        parcel.writeInt(this.totalInsist);
        parcel.writeInt(this.continuousPunch);
        parcel.writeByte(this.syncCalendar ? (byte) 1 : (byte) 0);
    }

    public HabitBean(Parcel parcel) {
        this.shock = true;
        this.syncCalendar = true;
        this.repeat = new WeekDayBean();
        this.punchTime = new ArrayList<>();
        this.typeId = parcel.readLong();
        this.type = parcel.readInt();
        this.weekDays = parcel.readInt();
        this.clockMode = parcel.readInt();
        this.name = parcel.readString();
        this.shock = parcel.readByte() != 0;
        this.added = parcel.readByte() != 0;
        this.bigIcon = parcel.readString();
        this.middleIcon = parcel.readString();
        this.smallIcon = parcel.readString();
        this.icon = parcel.readString();
        this.iconPad = parcel.readString();
        this.repeat = (WeekDayBean) parcel.readParcelable(WeekDayBean.class.getClassLoader());
        this.punchTime = parcel.createTypedArrayList(HabitTime.INSTANCE);
        this.deviceBref = parcel.readString();
        this.appBref = parcel.readString();
        this.timesGsons = parcel.readString();
        this.updateTime = parcel.readLong();
        this.totalInsist = parcel.readInt();
        this.continuousPunch = parcel.readInt();
        this.syncCalendar = parcel.readByte() != 0;
    }
}
