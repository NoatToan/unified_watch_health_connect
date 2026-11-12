package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.l4h;
import defpackage.mlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f8632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Month f8633b;
    public final DateValidator c;
    public Month d;
    public final int e;
    public final int f;

    public interface DateValidator extends Parcelable {
        boolean n(long j);
    }

    public class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public static final class b {
        public static final long e = mlq.a(Month.c(1900, 0).f);
        public static final long f = mlq.a(Month.c(2100, 11).f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f8634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f8635b;
        public Long c;
        public DateValidator d;

        public b(CalendarConstraints calendarConstraints) {
            this.f8634a = e;
            this.f8635b = f;
            this.d = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f8634a = calendarConstraints.f8632a.f;
            this.f8635b = calendarConstraints.f8633b.f;
            this.c = Long.valueOf(calendarConstraints.d.f);
            this.d = calendarConstraints.c;
        }

        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.d);
            Month monthD = Month.d(this.f8634a);
            Month monthD2 = Month.d(this.f8635b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.c;
            return new CalendarConstraints(monthD, monthD2, dateValidator, l == null ? null : Month.d(l.longValue()), null);
        }

        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, a aVar) {
        this(month, month2, dateValidator, month3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f8632a.equals(calendarConstraints.f8632a) && this.f8633b.equals(calendarConstraints.f8633b) && l4h.a(this.d, calendarConstraints.d) && this.c.equals(calendarConstraints.c);
    }

    public Month f(Month month) {
        if (month.compareTo(this.f8632a) < 0) {
            return this.f8632a;
        }
        return month.compareTo(this.f8633b) > 0 ? this.f8633b : month;
    }

    public DateValidator g() {
        return this.c;
    }

    public Month h() {
        return this.f8633b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8632a, this.f8633b, this.d, this.c});
    }

    public int i() {
        return this.f;
    }

    public Month j() {
        return this.d;
    }

    public Month k() {
        return this.f8632a;
    }

    public int l() {
        return this.e;
    }

    public boolean m(long j) {
        if (this.f8632a.i(1) <= j) {
            Month month = this.f8633b;
            if (j <= month.i(month.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8632a, 0);
        parcel.writeParcelable(this.f8633b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.f8632a = month;
        this.f8633b = month2;
        this.d = month3;
        this.c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f = month.r(month2) + 1;
        this.e = (month2.c - month.c) + 1;
    }
}
