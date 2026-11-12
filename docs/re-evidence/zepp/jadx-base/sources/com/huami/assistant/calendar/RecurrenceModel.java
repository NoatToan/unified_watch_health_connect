package com.huami.assistant.calendar;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.Time;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class RecurrenceModel implements Parcelable {
    public static final Parcelable.Creator<RecurrenceModel> CREATOR = new a();
    public static final int END_BY_COUNT = 2;
    public static final int END_BY_DATE = 1;
    public static final int END_NEVER = 0;
    public static final int FREQ_DAILY = 0;
    public static final int FREQ_MONTHLY = 2;
    public static final int FREQ_WEEKLY = 1;
    public static final int FREQ_YEARLY = 3;
    public static final int MONTHLY_BY_DATE = 0;
    public static final int MONTHLY_BY_NTH_DAY_OF_WEEK = 1;
    public static final int STATE_NO_RECURRENCE = 0;
    public static final int STATE_RECURRENCE = 1;
    private static final int a = 99;
    private static final int b = 1;
    private static final int c = 730;
    private static final int d = 5;
    public int end;
    public int endCount;
    public Time endDate;
    public int freq;
    public int interval;
    public int monthlyByDayOfWeek;
    public int monthlyByMonthDay;
    public int monthlyByNthDayOfWeek;
    public int monthlyRepeat;
    public int recurrenceState;
    public boolean[] weeklyByDayOfWeek;

    public class a implements Parcelable.Creator<RecurrenceModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecurrenceModel createFromParcel(Parcel in) {
            return new RecurrenceModel(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RecurrenceModel[] newArray(int size) {
            return new RecurrenceModel[size];
        }
    }

    public RecurrenceModel(Parcel in) {
        this.freq = 1;
        this.interval = 1;
        this.endCount = 5;
        this.weeklyByDayOfWeek = new boolean[7];
        this.recurrenceState = in.readInt();
        this.freq = in.readInt();
        this.interval = in.readInt();
        this.end = in.readInt();
        this.endCount = in.readInt();
        this.weeklyByDayOfWeek = in.createBooleanArray();
        this.monthlyRepeat = in.readInt();
        this.monthlyByMonthDay = in.readInt();
        this.monthlyByDayOfWeek = in.readInt();
        this.monthlyByNthDayOfWeek = in.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Model [freq=" + this.freq + ", interval=" + this.interval + ", end=" + this.end + ", endDate=" + this.endDate + ", endCount=" + this.endCount + ", weeklyByDayOfWeek=" + Arrays.toString(this.weeklyByDayOfWeek) + ", monthlyRepeat=" + this.monthlyRepeat + ", monthlyByMonthDay=" + this.monthlyByMonthDay + ", monthlyByDayOfWeek=" + this.monthlyByDayOfWeek + ", monthlyByNthDayOfWeek=" + this.monthlyByNthDayOfWeek + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.freq);
        dest.writeInt(this.interval);
        dest.writeInt(this.end);
        dest.writeInt(this.endDate.year);
        dest.writeInt(this.endDate.month);
        dest.writeInt(this.endDate.monthDay);
        dest.writeInt(this.endCount);
        dest.writeBooleanArray(this.weeklyByDayOfWeek);
        dest.writeInt(this.monthlyRepeat);
        dest.writeInt(this.monthlyByMonthDay);
        dest.writeInt(this.monthlyByDayOfWeek);
        dest.writeInt(this.monthlyByNthDayOfWeek);
        dest.writeInt(this.recurrenceState);
    }

    public RecurrenceModel() {
        this.freq = 1;
        this.interval = 1;
        this.endCount = 5;
        this.weeklyByDayOfWeek = new boolean[7];
    }
}
