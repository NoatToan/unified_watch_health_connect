package l20;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.contacts.model.ContactInfoConfirmationStatusTypeAdapter$ContactInfoConfirmationStatusAdapter;
import com.garmin.android.apps.connectmobile.contacts.model.ContactInfoDeclineReasonTypeAdapter$ContactInfoDeclineReasonAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Ll20/b;", "Landroid/os/Parcelable;", "Ll20/l;", "featureName", "Lcom/garmin/android/apps/connectmobile/contacts/model/a;", "featureConfirmationStatus", "", "featureConfirmationDate", "Lcom/garmin/android/apps/connectmobile/contacts/model/b;", "declineReason", "createDate", "updateDate", "<init>", "(Ll20/l;Lcom/garmin/android/apps/connectmobile/contacts/model/a;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/contacts/model/b;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ll20/l;", "d", "()Ll20/l;", "b", "Lcom/garmin/android/apps/connectmobile/contacts/model/a;", "()Lcom/garmin/android/apps/connectmobile/contacts/model/a;", "c", "Ljava/lang/String;", "Lcom/garmin/android/apps/connectmobile/contacts/model/b;", "getDeclineReason", "()Lcom/garmin/android/apps/connectmobile/contacts/model/b;", JWKParameterNames.RSA_EXPONENT, "f", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("featureName")
    private final l featureName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("featureConfirmationStatus")
    @JsonAdapter(ContactInfoConfirmationStatusTypeAdapter$ContactInfoConfirmationStatusAdapter.class)
    private final com.garmin.android.apps.connectmobile.contacts.model.a featureConfirmationStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("featureConfirmationDate")
    private final String featureConfirmationDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("featureDeclineReason")
    @JsonAdapter(ContactInfoDeclineReasonTypeAdapter$ContactInfoDeclineReasonAdapter.class)
    private final com.garmin.android.apps.connectmobile.contacts.model.b declineReason;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createDate")
    private final String createDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updateDate")
    private final String updateDate;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt() == 0 ? null : l.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : com.garmin.android.apps.connectmobile.contacts.model.a.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? com.garmin.android.apps.connectmobile.contacts.model.b.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(l lVar, com.garmin.android.apps.connectmobile.contacts.model.a aVar, String str, com.garmin.android.apps.connectmobile.contacts.model.b bVar, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : lVar, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : bVar, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.garmin.android.apps.connectmobile.contacts.model.a getFeatureConfirmationStatus() {
        return this.featureConfirmationStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l getFeatureName() {
        return this.featureName;
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
        return this.featureName == bVar.featureName && this.featureConfirmationStatus == bVar.featureConfirmationStatus && s.g(this.featureConfirmationDate, bVar.featureConfirmationDate) && this.declineReason == bVar.declineReason && s.g(this.createDate, bVar.createDate) && s.g(this.updateDate, bVar.updateDate);
    }

    public final int hashCode() {
        l lVar = this.featureName;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        com.garmin.android.apps.connectmobile.contacts.model.a aVar = this.featureConfirmationStatus;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.featureConfirmationDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.contacts.model.b bVar = this.declineReason;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.createDate;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updateDate;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        l lVar = this.featureName;
        com.garmin.android.apps.connectmobile.contacts.model.a aVar = this.featureConfirmationStatus;
        String str = this.featureConfirmationDate;
        com.garmin.android.apps.connectmobile.contacts.model.b bVar = this.declineReason;
        String str2 = this.createDate;
        String str3 = this.updateDate;
        StringBuilder sb3 = new StringBuilder("ContactFeatureInfo(featureName=");
        sb3.append(lVar);
        sb3.append(", featureConfirmationStatus=");
        sb3.append(aVar);
        sb3.append(", featureConfirmationDate=");
        sb3.append(str);
        sb3.append(", declineReason=");
        sb3.append(bVar);
        sb3.append(", createDate=");
        return e5.h(sb3, str2, ", updateDate=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        l lVar = this.featureName;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(lVar.name());
        }
        com.garmin.android.apps.connectmobile.contacts.model.a aVar = this.featureConfirmationStatus;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeString(this.featureConfirmationDate);
        com.garmin.android.apps.connectmobile.contacts.model.b bVar = this.declineReason;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        parcel.writeString(this.createDate);
        parcel.writeString(this.updateDate);
    }

    public b(l lVar, com.garmin.android.apps.connectmobile.contacts.model.a aVar, String str, com.garmin.android.apps.connectmobile.contacts.model.b bVar, String str2, String str3) {
        this.featureName = lVar;
        this.featureConfirmationStatus = aVar;
        this.featureConfirmationDate = str;
        this.declineReason = bVar;
        this.createDate = str2;
        this.updateDate = str3;
    }

    public b() {
        this(null, null, null, null, null, null, 63, null);
    }
}
