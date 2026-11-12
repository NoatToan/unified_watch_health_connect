package da1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lda1/a;", "Landroid/os/Parcelable;", "Lea1/a;", "flagReason", "", "referrerContext", "note", "<init>", "(Lea1/a;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lea1/a;", "getFlagReason", "()Lea1/a;", "setFlagReason", "(Lea1/a;)V", "b", "Ljava/lang/String;", "getReferrerContext", "()Ljava/lang/String;", "setReferrerContext", "(Ljava/lang/String;)V", "c", "getNote", "setNote", "gcm-photo_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1251a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("flagReason")
    private ea1.a flagReason;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("referrerContext")
    private String referrerContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("note")
    private String note;

    /* JADX INFO: renamed from: da1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1251a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : ea1.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(ea1.a aVar, String str, String str2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : aVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2);
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
        return this.flagReason == aVar.flagReason && s.g(this.referrerContext, aVar.referrerContext) && s.g(this.note, aVar.note);
    }

    public final int hashCode() {
        ea1.a aVar = this.flagReason;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.referrerContext;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.note;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        ea1.a aVar = this.flagReason;
        String str = this.referrerContext;
        String str2 = this.note;
        StringBuilder sb3 = new StringBuilder("FlagImageDTO(flagReason=");
        sb3.append(aVar);
        sb3.append(", referrerContext=");
        sb3.append(str);
        sb3.append(", note=");
        return am.j.o(str2, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        ea1.a aVar = this.flagReason;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeString(this.referrerContext);
        parcel.writeString(this.note);
    }

    public a(ea1.a aVar, String str, String str2) {
        this.flagReason = aVar;
        this.referrerContext = str;
        this.note = str2;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
