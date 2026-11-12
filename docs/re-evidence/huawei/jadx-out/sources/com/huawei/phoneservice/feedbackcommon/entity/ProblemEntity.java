package com.huawei.phoneservice.feedbackcommon.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
public class ProblemEntity implements Parcelable {
    public static final Parcelable.Creator<ProblemEntity> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21814a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21814a);
    }

    public void a(String str) {
        this.f21814a = str;
    }

    public String a() {
        return this.f21814a;
    }

    class b implements Parcelable.Creator<ProblemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ProblemEntity[] newArray(int i) {
            return new ProblemEntity[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ProblemEntity createFromParcel(Parcel parcel) {
            return new ProblemEntity(parcel);
        }

        b() {
        }
    }

    public ProblemEntity(String str) {
        this.f21814a = str;
    }

    protected ProblemEntity(Parcel parcel) {
        this.f21814a = parcel.readString();
    }

    public ProblemEntity() {
    }
}
