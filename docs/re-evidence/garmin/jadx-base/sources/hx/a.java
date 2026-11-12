package hx;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lhx/a;", "Landroid/os/Parcelable;", "", "eventTimestampGmt", "bodyBatteryLevel", "feedbackShortType", "feedbackLongType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getEventTimestampGmt", "()Ljava/lang/String;", "b", "c", "f", "d", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1709a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventTimestampGmt")
    private final String eventTimestampGmt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBatteryLevel")
    private final String bodyBatteryLevel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedbackShortType")
    private final String feedbackShortType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedbackLongType")
    private final String feedbackLongType;

    /* JADX INFO: renamed from: hx.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1709a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBodyBatteryLevel() {
        return this.bodyBatteryLevel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFeedbackLongType() {
        return this.feedbackLongType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.eventTimestampGmt, aVar.eventTimestampGmt) && s.g(this.bodyBatteryLevel, aVar.bodyBatteryLevel) && s.g(this.feedbackShortType, aVar.feedbackShortType) && s.g(this.feedbackLongType, aVar.feedbackLongType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFeedbackShortType() {
        return this.feedbackShortType;
    }

    public final int hashCode() {
        String str = this.eventTimestampGmt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bodyBatteryLevel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feedbackShortType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.feedbackLongType;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.eventTimestampGmt;
        String str2 = this.bodyBatteryLevel;
        return e5.h(p6.b.i("BodyBatteryDynamicFeedbackEventDTO(eventTimestampGmt=", str, ", bodyBatteryLevel=", str2, ", feedbackShortType="), this.feedbackShortType, ", feedbackLongType=", this.feedbackLongType, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.eventTimestampGmt);
        parcel.writeString(this.bodyBatteryLevel);
        parcel.writeString(this.feedbackShortType);
        parcel.writeString(this.feedbackLongType);
    }

    public a(String str, String str2, String str3, String str4) {
        this.eventTimestampGmt = str;
        this.bodyBatteryLevel = str2;
        this.feedbackShortType = str3;
        this.feedbackLongType = str4;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
