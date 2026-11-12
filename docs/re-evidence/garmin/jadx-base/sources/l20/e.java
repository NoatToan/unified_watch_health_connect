package l20;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.contacts.model.ContactInfoSMSOptInStatusTypeAdapter$ContactInfoSMSOptInStatusAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Ll20/e;", "Landroid/os/Parcelable;", "Ll20/f;", "emergencyAssistanceFitnessStatus", "liveEventSharingFitnessStatus", "liveTrackStatus", "<init>", "(Ll20/f;Ll20/f;Ll20/f;)V", "a", "Ll20/f;", "b", "()Ll20/f;", "d", "c", "f", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("EMERGENCY_ASSISTANCE_FITNESS")
    @JsonAdapter(ContactInfoSMSOptInStatusTypeAdapter$ContactInfoSMSOptInStatusAdapter.class)
    private final f emergencyAssistanceFitnessStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("LIVE_EVENT_SHARING_FITNESS")
    @JsonAdapter(ContactInfoSMSOptInStatusTypeAdapter$ContactInfoSMSOptInStatusAdapter.class)
    private final f liveEventSharingFitnessStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("LIVETRACK")
    @JsonAdapter(ContactInfoSMSOptInStatusTypeAdapter$ContactInfoSMSOptInStatusAdapter.class)
    private final f liveTrackStatus;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readInt() == 0 ? null : f.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : f.valueOf(parcel.readString()), parcel.readInt() != 0 ? f.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(f fVar, f fVar2, f fVar3) {
        this.emergencyAssistanceFitnessStatus = fVar;
        this.liveEventSharingFitnessStatus = fVar2;
        this.liveTrackStatus = fVar3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getEmergencyAssistanceFitnessStatus() {
        return this.emergencyAssistanceFitnessStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getLiveEventSharingFitnessStatus() {
        return this.liveEventSharingFitnessStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.emergencyAssistanceFitnessStatus == eVar.emergencyAssistanceFitnessStatus && this.liveEventSharingFitnessStatus == eVar.liveEventSharingFitnessStatus && this.liveTrackStatus == eVar.liveTrackStatus;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getLiveTrackStatus() {
        return this.liveTrackStatus;
    }

    public final int hashCode() {
        f fVar = this.emergencyAssistanceFitnessStatus;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        f fVar2 = this.liveEventSharingFitnessStatus;
        int iHashCode2 = (iHashCode + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        f fVar3 = this.liveTrackStatus;
        return iHashCode2 + (fVar3 != null ? fVar3.hashCode() : 0);
    }

    public final String toString() {
        return "ContactInfoSMSOptInStatusDTO(emergencyAssistanceFitnessStatus=" + this.emergencyAssistanceFitnessStatus + ", liveEventSharingFitnessStatus=" + this.liveEventSharingFitnessStatus + ", liveTrackStatus=" + this.liveTrackStatus + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        f fVar = this.emergencyAssistanceFitnessStatus;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar.name());
        }
        f fVar2 = this.liveEventSharingFitnessStatus;
        if (fVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar2.name());
        }
        f fVar3 = this.liveTrackStatus;
        if (fVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(fVar3.name());
        }
    }
}
