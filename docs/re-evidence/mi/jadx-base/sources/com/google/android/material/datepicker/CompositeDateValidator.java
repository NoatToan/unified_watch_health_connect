package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.g6i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f8636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<CalendarConstraints.DateValidator> f8637b;
    public static final d c = new a();
    public static final d d = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    public class a implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.n(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 1;
        }
    }

    public class b implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public boolean a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.n(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 2;
        }
    }

    public class c implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i = parcel.readInt();
            d dVar = (i != 2 && i == 1) ? CompositeDateValidator.c : CompositeDateValidator.d;
            return new CompositeDateValidator((List) g6i.g(arrayList), dVar, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    public interface d {
        boolean a(List<CalendarConstraints.DateValidator> list, long j);

        int getId();
    }

    public /* synthetic */ CompositeDateValidator(List list, d dVar, a aVar) {
        this(list, dVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f8637b.equals(compositeDateValidator.f8637b) && this.f8636a.getId() == compositeDateValidator.f8636a.getId();
    }

    public int hashCode() {
        return this.f8637b.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean n(long j) {
        return this.f8636a.a(this.f8637b, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f8637b);
        parcel.writeInt(this.f8636a.getId());
    }

    public CompositeDateValidator(List<CalendarConstraints.DateValidator> list, d dVar) {
        this.f8637b = list;
        this.f8636a = dVar;
    }
}
