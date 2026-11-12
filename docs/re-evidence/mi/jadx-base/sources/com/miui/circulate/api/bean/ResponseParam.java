package com.miui.circulate.api.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ResponseParam implements Parcelable {
    public static final Parcelable.Creator<ResponseParam> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10289b;

    public class a implements Parcelable.Creator<ResponseParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResponseParam createFromParcel(Parcel parcel) {
            return new ResponseParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResponseParam[] newArray(int i) {
            return new ResponseParam[i];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10291b;

        public b(int i, String str) {
            this.f10290a = i;
            this.f10291b = str;
        }

        public ResponseParam a() {
            return new ResponseParam(this.f10290a, this.f10291b, null);
        }
    }

    public /* synthetic */ ResponseParam(int i, String str, a aVar) {
        this(i, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10288a);
        parcel.writeString(this.f10289b);
    }

    public ResponseParam(int i, String str) {
        this.f10288a = i;
        this.f10289b = str;
    }

    public ResponseParam(Parcel parcel) {
        this.f10288a = parcel.readInt();
        this.f10289b = parcel.readString();
    }
}
