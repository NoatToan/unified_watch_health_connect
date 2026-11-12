package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Date;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/f;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f38137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f38138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f38139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f38140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Date f38141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Date f38142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Date f38143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f38144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j[] f38145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f38135l = new b(null);
    public static final Parcelable.Creator<f> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/model/f$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/f;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(Parcel parcel) {
        parcel.getClass();
        ClassLoader classLoader = f.class.getClassLoader();
        this.f38136a = parcel.readString();
        this.f38137b = (l) parcel.readParcelable(classLoader);
        this.f38138c = (m) parcel.readParcelable(classLoader);
        this.f38139d = (h) parcel.readParcelable(classLoader);
        this.f38140e = (g) parcel.readParcelable(classLoader);
        this.f38141f = new Date(parcel.readLong());
        this.f38142g = new Date(parcel.readLong());
        this.f38143h = new Date(parcel.readLong());
        this.f38144i = (k) parcel.readParcelable(classLoader);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        if (parcelableArray != null) {
            this.f38145j = (j[]) Arrays.copyOf(parcelableArray, parcelableArray.length, j[].class);
        }
        this.f38146k = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.f38136a;
        l lVar = this.f38137b;
        m mVar = this.f38138c;
        h hVar = this.f38139d;
        g gVar = this.f38140e;
        Date date = this.f38141f;
        Date date2 = this.f38142g;
        Date date3 = this.f38143h;
        k kVar = this.f38144i;
        String string = Arrays.toString(this.f38145j);
        string.getClass();
        return "AutoChallengeDTO [challengeId=" + str + ", challengeTimezoneDTO=" + lVar + ", challengeTypeDTO=" + mVar + ", challengeLevelDTO=" + hVar + ", formatLocaleDTO=" + gVar + ", startTimeInTimezone=" + date + ", endTimeInTimezone=" + date2 + ", evalTimeInTimezone=" + date3 + ", challengeStatusDTO=" + kVar + ", players=" + string + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f38136a);
        parcel.writeParcelable(this.f38137b, 0);
        parcel.writeParcelable(this.f38138c, 0);
        parcel.writeParcelable(this.f38139d, 0);
        parcel.writeParcelable(this.f38140e, 0);
        Date date = this.f38141f;
        date.getClass();
        parcel.writeLong(date.getTime());
        Date date2 = this.f38142g;
        date2.getClass();
        parcel.writeLong(date2.getTime());
        Date date3 = this.f38143h;
        date3.getClass();
        parcel.writeLong(date3.getTime());
        parcel.writeParcelable(this.f38144i, 0);
        parcel.writeParcelableArray(this.f38145j, 0);
        parcel.writeInt(this.f38146k);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/f$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/f;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "CHALLENGE_ID", "Ljava/lang/String;", "CHALLENGE_TIMEZONE_DTO", "CHALLENGE_TYPE_DTO", "CHALLENGE_LEVEL_DTO", "FORMAT_LOCALE_DTO", "START_TIME_IN_TIMEZONE", "END_TIME_IN_TIMEZONE", "EVAL_TIME_IN_TIMEZONE", "CHALLENGE_STATUS_DTO", "PLAYERS", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public f() {
    }
}
