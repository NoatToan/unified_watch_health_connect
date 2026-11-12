package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/h;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f38168g = new b(null);
    public static final Parcelable.Creator<h> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/model/h$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/h;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(Parcel parcel) {
        parcel.getClass();
        this.f38169a = parcel.readString();
        this.f38170b = parcel.readString();
        this.f38171c = parcel.readInt();
        this.f38172d = parcel.readInt();
        this.f38173e = parcel.readInt();
        this.f38174f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.f38169a;
        String str2 = this.f38170b;
        int i14 = this.f38171c;
        int i15 = this.f38172d;
        int i16 = this.f38173e;
        int i17 = this.f38174f;
        StringBuilder sbI = p6.b.i("AutoChallengeLevelDTO [id=", str, ", key=", str2, ", expectedStepCount=");
        ds.e0.m(i14, i15, ", minimumStepCount=", ", maximumStepCount=", sbI);
        return androidx.core.view.j.e(i16, i17, ", activityLevel=", "]", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f38169a);
        parcel.writeString(this.f38170b);
        parcel.writeInt(this.f38171c);
        parcel.writeInt(this.f38172d);
        parcel.writeInt(this.f38173e);
        parcel.writeInt(this.f38174f);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/h$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/h;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "ID", "Ljava/lang/String;", "KEY", "EXPECTED_STEP_COUNT", "MINIMUM_STEP_COUNT", "MAXIMUM_STEP_COUNT", "ACTIVITY_LEVEL", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public h() {
    }
}
