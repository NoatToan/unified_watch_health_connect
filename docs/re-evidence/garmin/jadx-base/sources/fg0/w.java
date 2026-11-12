package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"Lfg0/w;", "Landroid/os/Parcelable;", "", "eventImageUUID", "Lea1/a;", "reason", "note", "<init>", "(Ljava/lang/String;Lea1/a;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getEventImageUUID", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "Lea1/a;", "getReason", "()Lea1/a;", "f", "(Lea1/a;)V", "c", "getNote", "d", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventImageUUID")
    private String eventImageUUID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reason")
    private ea1.a reason;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("note")
    private String note;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new w(parcel.readString(), parcel.readInt() == 0 ? null : ea1.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    }

    public /* synthetic */ w(String str, ea1.a aVar, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : str2);
    }

    public final void b(String str) {
        this.eventImageUUID = str;
    }

    public final void d(String str) {
        this.note = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return p005kotlin.jvm.internal.s.g(this.eventImageUUID, wVar.eventImageUUID) && this.reason == wVar.reason && p005kotlin.jvm.internal.s.g(this.note, wVar.note);
    }

    public final void f(ea1.a aVar) {
        this.reason = aVar;
    }

    public final int hashCode() {
        String str = this.eventImageUUID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ea1.a aVar = this.reason;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.note;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.eventImageUUID;
        ea1.a aVar = this.reason;
        String str2 = this.note;
        StringBuilder sb3 = new StringBuilder("FlagEventImageDTO(eventImageUUID=");
        sb3.append(str);
        sb3.append(", reason=");
        sb3.append(aVar);
        sb3.append(", note=");
        return am.j.o(str2, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.eventImageUUID);
        ea1.a aVar = this.reason;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeString(this.note);
    }

    public w(String str, ea1.a aVar, String str2) {
        this.eventImageUUID = str;
        this.reason = aVar;
        this.note = str2;
    }

    public w() {
        this(null, null, null, 7, null);
    }
}
