package com.garmin.android.apps.connectmobile.repcounting.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/repcounting/model/a;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "exercise", "<init>", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/d;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0778a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f41091a;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.repcounting.model.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0778a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(d dVar) {
        dVar.getClass();
        this.f41091a = dVar;
    }

    public String b(Context context) {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f41091a.writeToParcel(parcel, i14);
    }
}
