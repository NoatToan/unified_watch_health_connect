package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cq5;
import defpackage.mlq;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes5.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f8675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8676b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    public class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarE = mlq.e(calendar);
        this.f8675a = calendarE;
        this.f8676b = calendarE.get(2);
        this.c = calendarE.get(1);
        this.d = calendarE.getMaximum(7);
        this.e = calendarE.getActualMaximum(5);
        this.f = calendarE.getTimeInMillis();
    }

    public static Month c(int i, int i2) {
        Calendar calendarL = mlq.l();
        calendarL.set(1, i);
        calendarL.set(2, i2);
        return new Month(calendarL);
    }

    public static Month d(long j) {
        Calendar calendarL = mlq.l();
        calendarL.setTimeInMillis(j);
        return new Month(calendarL);
    }

    public static Month e() {
        return new Month(mlq.j());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f8675a.compareTo(month.f8675a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f8676b == month.f8676b && this.c == month.c;
    }

    public int h() {
        int firstDayOfWeek = this.f8675a.get(7) - this.f8675a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.d : firstDayOfWeek;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8676b), Integer.valueOf(this.c)});
    }

    public long i(int i) {
        Calendar calendarE = mlq.e(this.f8675a);
        calendarE.set(5, i);
        return calendarE.getTimeInMillis();
    }

    public int k(long j) {
        Calendar calendarE = mlq.e(this.f8675a);
        calendarE.setTimeInMillis(j);
        return calendarE.get(5);
    }

    public String l() {
        if (this.g == null) {
            this.g = cq5.i(this.f8675a.getTimeInMillis());
        }
        return this.g;
    }

    public long m() {
        return this.f8675a.getTimeInMillis();
    }

    public Month o(int i) {
        Calendar calendarE = mlq.e(this.f8675a);
        calendarE.add(2, i);
        return new Month(calendarE);
    }

    public int r(Month month) {
        if (this.f8675a instanceof GregorianCalendar) {
            return ((month.c - this.c) * 12) + (month.f8676b - this.f8676b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.f8676b);
    }
}
