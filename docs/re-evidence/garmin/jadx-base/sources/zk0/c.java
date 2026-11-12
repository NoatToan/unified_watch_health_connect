package zk0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lzk0/c;", "Landroid/os/Parcelable;", "", "userGoal", "deviceGoal", "", "syncedToDevice", "", "effective", "userGoalCategory", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "c", "Z", "getSyncedToDevice", "()Z", "Ljava/lang/String;", "getEffective", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGoal")
    private final Integer userGoal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceGoal")
    private final Integer deviceGoal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("syncedToDevice")
    private final boolean syncedToDevice;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("effective")
    private final String effective;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGoalCategory")
    private final String userGoalCategory;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ c(Integer num, Integer num2, boolean z14, String str, String str2, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0 : num, (i14 & 2) != 0 ? 0 : num2, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getDeviceGoal() {
        return this.deviceGoal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getUserGoal() {
        return this.userGoal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.userGoal, cVar.userGoal) && s.g(this.deviceGoal, cVar.deviceGoal) && this.syncedToDevice == cVar.syncedToDevice && s.g(this.effective, cVar.effective) && s.g(this.userGoalCategory, cVar.userGoalCategory);
    }

    public final boolean f() {
        return s.g(this.userGoalCategory, "my-auto");
    }

    public final int hashCode() {
        Integer num = this.userGoal;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.deviceGoal;
        int iG = q6.f.g((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.syncedToDevice);
        String str = this.effective;
        int iHashCode2 = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userGoalCategory;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.userGoal;
        Integer num2 = this.deviceGoal;
        boolean z14 = this.syncedToDevice;
        String str = this.effective;
        String str2 = this.userGoalCategory;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "StepsGoalDTO(userGoal=", ", deviceGoal=", ", syncedToDevice=", num2);
        fb1.c.w(", effective=", str, ", userGoalCategory=", sbL, z14);
        return am.j.o(str2, ")", sbL);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.userGoal;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.deviceGoal;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeInt(this.syncedToDevice ? 1 : 0);
        parcel.writeString(this.effective);
        parcel.writeString(this.userGoalCategory);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lzk0/c$a;", "", "<init>", "()V", "", "PERMANENTLY", "Ljava/lang/String;", "GOAL_CATEGORY_MY_AUTO", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public c(Integer num, Integer num2, boolean z14, String str, String str2) {
        this.userGoal = num;
        this.deviceGoal = num2;
        this.syncedToDevice = z14;
        this.effective = str;
        this.userGoalCategory = str2;
    }

    public c() {
        this(null, null, false, null, null, 31, null);
    }
}
