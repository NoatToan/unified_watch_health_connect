package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import defpackage.i9f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();
    public static final String NUMBER_FORMAT = "%d";
    public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i9f f8940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i9f f8941b;
    public final int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public class a implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return c(resources, charSequence, ZERO_LEADING_NUMBER_FORMAT);
    }

    public static String c(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public static int g(int i) {
        return i >= 12 ? 1 : 0;
    }

    public int d() {
        if (this.c == 1) {
            return this.d % 24;
        }
        int i = this.d;
        if (i % 12 == 0) {
            return 12;
        }
        return this.g == 1 ? i - 12 : i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public i9f e() {
        return this.f8941b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.d == timeModel.d && this.e == timeModel.e && this.c == timeModel.c && this.f == timeModel.f;
    }

    public i9f f() {
        return this.f8940a;
    }

    public void h(int i) {
        if (this.c == 1) {
            this.d = i;
        } else {
            this.d = (i % 12) + (this.g != 1 ? 0 : 12);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public void i(@IntRange(from = 0, to = 59) int i) {
        this.e = i % 60;
    }

    public void j(int i) {
        if (i != this.g) {
            this.g = i;
            int i2 = this.d;
            if (i2 < 12 && i == 1) {
                this.d = i2 + 12;
            } else {
                if (i2 < 12 || i != 0) {
                    return;
                }
                this.d = i2 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.c);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.c = i4;
        this.g = g(i);
        this.f8940a = new i9f(59);
        this.f8941b = new i9f(i4 == 1 ? 24 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
