package lm1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Llm1/b;", "Landroid/os/Parcelable;", "", "eventStartGmt", "eventEndGmt", "", "lowSpO2", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "a", "Ljava/lang/String;", "getEventStartGmt", "()Ljava/lang/String;", "setEventStartGmt", "(Ljava/lang/String;)V", "b", "getEventEndGmt", "c", "I", "getLowSpO2", "()I", "d", "getDuration", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepEventStartGMT")
    private String eventStartGmt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepEventEndGMT")
    private final String eventEndGmt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowSPO2")
    private final int lowSpO2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final int duration;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(String str, String str2, int i14, int i15, int i16, j jVar) {
        this((i16 & 1) != 0 ? null : str, (i16 & 2) != 0 ? null : str2, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.eventStartGmt, bVar.eventStartGmt) && s.g(this.eventEndGmt, bVar.eventEndGmt) && this.lowSpO2 == bVar.lowSpO2 && this.duration == bVar.duration;
    }

    public final int hashCode() {
        String str = this.eventStartGmt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventEndGmt;
        return Integer.hashCode(this.duration) + q2.d(this.lowSpO2, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return androidx.core.view.j.e(this.lowSpO2, this.duration, ", duration=", ")", p6.b.i("SpO2EventDTO(eventStartGmt=", this.eventStartGmt, ", eventEndGmt=", this.eventEndGmt, ", lowSpO2="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.eventStartGmt);
        parcel.writeString(this.eventEndGmt);
        parcel.writeInt(this.lowSpO2);
        parcel.writeInt(this.duration);
    }

    public b(String str, String str2, int i14, int i15) {
        this.eventStartGmt = str;
        this.eventEndGmt = str2;
        this.lowSpO2 = i14;
        this.duration = i15;
    }

    public b() {
        this(null, null, 0, 0, 15, null);
    }
}
