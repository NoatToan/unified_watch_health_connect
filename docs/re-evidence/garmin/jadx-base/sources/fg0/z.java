package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.events.model.adapters.EventEnumTypeAdapter$EventTypeAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016¨\u0006\""}, d2 = {"Lfg0/z;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "eventName", "Lgg0/f;", "eventType", "date", "shareableEventUuid", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lgg0/f;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "c", "Lgg0/f;", "d", "()Lgg0/f;", "setEventType", "(Lgg0/f;)V", "getDate", "setDate", JWKParameterNames.RSA_EXPONENT, "g", "setShareableEventUuid", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private Long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventName")
    private String eventName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventType")
    @JsonAdapter(EventEnumTypeAdapter$EventTypeAdapter.class)
    private gg0.f eventType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    private String date;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shareableEventUuid")
    private String shareableEventUuid;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<z> {
        @Override // android.os.Parcelable.Creator
        public final z createFromParcel(Parcel parcel) {
            Long lValueOf;
            gg0.f fVarValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                fVarValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                fVarValueOf = null;
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                fVarValueOf = gg0.f.valueOf(parcel.readString());
            }
            return new z(lValueOf, string, fVarValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final z[] newArray(int i14) {
            return new z[i14];
        }
    }

    public /* synthetic */ z(Long l14, String str, gg0.f fVar, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : fVar, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final gg0.f getEventType() {
        return this.eventType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return p005kotlin.jvm.internal.s.g(this.id, zVar.id) && p005kotlin.jvm.internal.s.g(this.eventName, zVar.eventName) && this.eventType == zVar.eventType && p005kotlin.jvm.internal.s.g(this.date, zVar.date) && p005kotlin.jvm.internal.s.g(this.shareableEventUuid, zVar.shareableEventUuid);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getShareableEventUuid() {
        return this.shareableEventUuid;
    }

    public final int hashCode() {
        Long l14 = this.id;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.eventName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        gg0.f fVar = this.eventType;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str2 = this.date;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shareableEventUuid;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.id;
        String str = this.eventName;
        gg0.f fVar = this.eventType;
        String str2 = this.date;
        String str3 = this.shareableEventUuid;
        StringBuilder sbJ = b71.i.j("PrimaryEventDTO(id=", ", eventName=", str, l14, ", eventType=");
        sbJ.append(fVar);
        sbJ.append(", date=");
        sbJ.append(str2);
        sbJ.append(", shareableEventUuid=");
        return am.j.o(str3, ")", sbJ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.id;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.eventName);
        gg0.f fVar = this.eventType;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar.name());
        }
        parcel.writeString(this.date);
        parcel.writeString(this.shareableEventUuid);
    }

    public z(Long l14, String str, gg0.f fVar, String str2, String str3) {
        this.id = l14;
        this.eventName = str;
        this.eventType = fVar;
        this.date = str2;
        this.shareableEventUuid = str3;
    }

    public z() {
        this(null, null, null, null, null, 31, null);
    }
}
