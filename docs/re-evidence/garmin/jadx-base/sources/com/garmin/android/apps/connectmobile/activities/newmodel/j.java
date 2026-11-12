package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(FirebaseAnalytics.Param.INDEX)
    private int f29569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("workoutName")
    private String f29570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sport")
    private String f29571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("manufacturer")
    private String f29572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("steps")
    private List<h0> f29573e;

    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public enum b {
        ACTIVE(-1),
        /* JADX INFO: Fake field, exist only in values array */
        REST(R.string.workout_step_type_rest),
        /* JADX INFO: Fake field, exist only in values array */
        WARMUP(R.string.workout_step_type_warmup),
        /* JADX INFO: Fake field, exist only in values array */
        COOLDOWN(R.string.workout_step_type_cooldown),
        /* JADX INFO: Fake field, exist only in values array */
        RECOVERY(R.string.workout_step_type_recover),
        /* JADX INFO: Fake field, exist only in values array */
        INTERVAL(R.string.workout_step_type_interval),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID(-1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29576a;

        b(int i14) {
            this.f29576a = i14;
        }
    }

    public j(Parcel parcel) {
        this.f29573e = null;
        this.f29569a = parcel.readInt();
        this.f29570b = parcel.readString();
        this.f29571c = parcel.readString();
        this.f29572d = parcel.readString();
        this.f29573e = parcel.createTypedArrayList(h0.CREATOR);
    }

    public final String b() {
        return this.f29571c;
    }

    public final List<h0> d() {
        return this.f29573e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f29569a);
        parcel.writeString(this.f29570b);
        parcel.writeString(this.f29571c);
        parcel.writeString(this.f29572d);
        parcel.writeTypedList(this.f29573e);
    }
}
