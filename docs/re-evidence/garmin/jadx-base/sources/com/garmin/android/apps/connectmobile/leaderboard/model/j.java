package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Date;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/j;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z[] f38214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Date f38216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f38219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b12.b f38220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f38209l = new b(null);
    public static final Parcelable.Creator<j> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/model/j$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/j;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(Parcel parcel) {
        parcel.getClass();
        this.f38220k = b12.b.f14386g;
        ClassLoader classLoader = j.class.getClassLoader();
        this.f38210a = parcel.readString();
        this.f38211b = parcel.readString();
        this.f38212c = parcel.readString();
        this.f38213d = parcel.readString();
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        if (parcelableArray != null) {
            this.f38214e = (z[]) Arrays.copyOf(parcelableArray, parcelableArray.length, z[].class);
        }
        this.f38215f = parcel.readInt();
        long j8 = parcel.readLong();
        if (j8 > 0) {
            this.f38216g = new Date(j8);
        }
        this.f38217h = parcel.readInt();
        this.f38218i = parcel.readInt() == 1;
        this.f38219j = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.f38210a;
        String str2 = this.f38211b;
        String str3 = this.f38212c;
        String string = Arrays.toString(this.f38214e);
        int i14 = this.f38215f;
        Date date = this.f38216g;
        int i15 = this.f38217h;
        boolean z14 = this.f38218i;
        boolean z15 = this.f38219j;
        StringBuilder sbI = p6.b.i("AutoChallengePlayerDTO [userProfileId=", str, ", playerName=", str2, ", playerNameURL=");
        sn.a.t(sbI, str3, ", dailyStepCounts=", string, ", totalSteps=");
        sbI.append(i14);
        sbI.append(", lastSyncTime=");
        sbI.append(date);
        sbI.append(", currentRanking=");
        fb1.c.x(sbI, i15, ", isWinner=", z14, ", isNewMember=");
        return hb.a.k(sbI, z15, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        long time;
        parcel.getClass();
        parcel.writeString(this.f38210a);
        parcel.writeString(this.f38211b);
        parcel.writeString(this.f38212c);
        parcel.writeString(this.f38213d);
        parcel.writeParcelableArray(this.f38214e, 0);
        parcel.writeInt(this.f38215f);
        Date date = this.f38216g;
        if (date != null) {
            date.getClass();
            time = date.getTime();
        } else {
            time = -1;
        }
        parcel.writeLong(time);
        parcel.writeInt(this.f38217h);
        parcel.writeInt(this.f38218i ? 1 : 0);
        parcel.writeInt(this.f38219j ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/j$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/j;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "USER_PROFILE_ID", "Ljava/lang/String;", "PLAYER_NAME", "PLAYER_NAME_URL", "PLAYER_FULL_NAME", "DAILY_STEP_COUNTS", "TOTAL_STEPS", "LAST_SYNC_TIME", "CURRENT_RANKING", "IS_WINNER", "IS_NEW_MEMBER", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public j() {
        this.f38220k = b12.b.f14386g;
    }
}
