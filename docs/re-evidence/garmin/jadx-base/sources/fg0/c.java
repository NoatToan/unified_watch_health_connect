package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0007\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lfg0/c;", "Landroid/os/Parcelable;", "Lgg0/a;", Constants.ScionAnalytics.PARAM_LABEL, "", "isPublic", "isShareable", "isDiscoverable", "<init>", "(Lgg0/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Lgg0/a;", "b", "()Lgg0/a;", "g", "(Lgg0/a;)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "h", "(Ljava/lang/Boolean;)V", "c", "d", IntegerTokenConverter.CONVERTER_KEY, "f", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private gg0.a label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isPublic")
    private Boolean isPublic;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isShareable")
    private Boolean isShareable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isDiscoverable")
    private Boolean isDiscoverable;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            Boolean boolValueOf3 = null;
            gg0.a aVarValueOf = parcel.readInt() == 0 ? null : gg0.a.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new c(aVarValueOf, boolValueOf, boolValueOf2, boolValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(gg0.a aVar, Boolean bool, Boolean bool2, Boolean bool3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : aVar, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : bool2, (i14 & 8) != 0 ? null : bool3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final gg0.a getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getIsShareable() {
        return this.isShareable;
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
        return this.label == cVar.label && p005kotlin.jvm.internal.s.g(this.isPublic, cVar.isPublic) && p005kotlin.jvm.internal.s.g(this.isShareable, cVar.isShareable) && p005kotlin.jvm.internal.s.g(this.isDiscoverable, cVar.isDiscoverable);
    }

    public final void f(Boolean bool) {
        this.isDiscoverable = bool;
    }

    public final void g(gg0.a aVar) {
        this.label = aVar;
    }

    public final void h(Boolean bool) {
        this.isPublic = bool;
    }

    public final int hashCode() {
        gg0.a aVar = this.label;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Boolean bool = this.isPublic;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isShareable;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isDiscoverable;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final void i(Boolean bool) {
        this.isShareable = bool;
    }

    public final String toString() {
        return "CalendarEventPrivacyDTO(label=" + this.label + ", isPublic=" + this.isPublic + ", isShareable=" + this.isShareable + ", isDiscoverable=" + this.isDiscoverable + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        gg0.a aVar = this.label;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        Boolean bool = this.isPublic;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.isShareable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.isDiscoverable;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
    }

    public c(gg0.a aVar, Boolean bool, Boolean bool2, Boolean bool3) {
        this.label = aVar;
        this.isPublic = bool;
        this.isShareable = bool2;
        this.isDiscoverable = bool3;
    }

    public c() {
        this(null, null, null, null, 15, null);
    }
}
