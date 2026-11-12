package ww1;

import android.os.Parcel;
import android.os.Parcelable;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lww1/v;", "Landroid/os/Parcelable;", "Lorg/joda/time/DateTime;", "locDateAndTime", "Lfg0/r;", "locTimeLocal", "", "locString", "Lfg0/y;", "locGeoPoint", "", "isInPersonEvent", "<init>", "(Lorg/joda/time/DateTime;Lfg0/r;Ljava/lang/String;Lfg0/y;Z)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f187877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg0.r f187878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f187879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg0.y f187880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f187881e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            parcel.getClass();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            fg0.r rVarCreateFromParcel = parcel.readInt() == 0 ? null : fg0.r.CREATOR.createFromParcel(parcel);
            fg0.y yVarCreateFromParcel = null;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                yVarCreateFromParcel = fg0.y.CREATOR.createFromParcel(parcel);
            }
            return new v(dateTime, rVarCreateFromParcel, string, yVarCreateFromParcel, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i14) {
            return new v[i14];
        }
    }

    public /* synthetic */ v(DateTime dateTime, fg0.r rVar, String str, fg0.y yVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dateTime, rVar, str, yVar, (i14 & 16) != 0 ? false : z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f187877a, vVar.f187877a) && p005kotlin.jvm.internal.s.g(this.f187878b, vVar.f187878b) && p005kotlin.jvm.internal.s.g(this.f187879c, vVar.f187879c) && p005kotlin.jvm.internal.s.g(this.f187880d, vVar.f187880d) && this.f187881e == vVar.f187881e;
    }

    public final int hashCode() {
        DateTime dateTime = this.f187877a;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        fg0.r rVar = this.f187878b;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str = this.f187879c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        fg0.y yVar = this.f187880d;
        return Boolean.hashCode(this.f187881e) + ((iHashCode3 + (yVar != null ? yVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTLocationAndTimeDTO(locDateAndTime=");
        sb3.append(this.f187877a);
        sb3.append(", locTimeLocal=");
        sb3.append(this.f187878b);
        sb3.append(", locString=");
        sb3.append(this.f187879c);
        sb3.append(", locGeoPoint=");
        sb3.append(this.f187880d);
        sb3.append(", isInPersonEvent=");
        return hb.a.k(sb3, this.f187881e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.f187877a);
        fg0.r rVar = this.f187878b;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f187879c);
        fg0.y yVar = this.f187880d;
        if (yVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.f187881e ? 1 : 0);
    }

    public v(DateTime dateTime, fg0.r rVar, String str, fg0.y yVar, boolean z14) {
        this.f187877a = dateTime;
        this.f187878b = rVar;
        this.f187879c = str;
        this.f187880d = yVar;
        this.f187881e = z14;
    }
}
