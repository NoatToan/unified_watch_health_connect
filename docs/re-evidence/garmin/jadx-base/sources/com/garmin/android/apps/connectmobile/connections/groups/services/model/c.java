package com.garmin.android.apps.connectmobile.connections.groups.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB9\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/c;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "userProfileId", "connectionRequestId", "connectionRequestorId", "Lcom/garmin/android/apps/connectmobile/connections/model/a;", "connectionStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/connections/model/a;)V", "a", "Ljava/lang/String;", "C", "()Ljava/lang/String;", "setUserProfileId", "(Ljava/lang/String;)V", "b", "getConnectionRequestId", "setConnectionRequestId", "c", "getConnectionRequestorId", "setConnectionRequestorId", "d", "Lcom/garmin/android/apps/connectmobile/connections/model/a;", "getConnectionStatus", "()Lcom/garmin/android/apps/connectmobile/connections/model/a;", "D", "(Lcom/garmin/android/apps/connectmobile/connections/model/a;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c extends s1 implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private String userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequestId")
    private String connectionRequestId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionRequestorId")
    private String connectionRequestorId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("connectionStatus")
    private com.garmin.android.apps.connectmobile.connections.model.a connectionStatus;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : com.garmin.android.apps.connectmobile.connections.model.a.valueOf(parcel.readString()));
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

    public /* synthetic */ c(String str, String str2, String str3, com.garmin.android.apps.connectmobile.connections.model.a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : aVar);
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getUserProfileId() {
        return this.userProfileId;
    }

    public final void D(com.garmin.android.apps.connectmobile.connections.model.a aVar) {
        this.connectionStatus = aVar;
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
        return s.g(this.userProfileId, cVar.userProfileId) && s.g(this.connectionRequestId, cVar.connectionRequestId) && s.g(this.connectionRequestorId, cVar.connectionRequestorId) && this.connectionStatus == cVar.connectionStatus;
    }

    public final int hashCode() {
        String str = this.userProfileId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.connectionRequestId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.connectionRequestorId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.connections.model.a aVar = this.connectionStatus;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.userProfileId = s1.u(jSONObject, "userProfileId");
            this.connectionRequestId = s1.u(jSONObject, "connectionRequestId");
            this.connectionRequestorId = s1.u(jSONObject, "connectionRequestorId");
            this.connectionStatus = com.garmin.android.apps.connectmobile.connections.model.a.a(jSONObject.optInt("connectionStatus"));
        }
    }

    public final String toString() {
        String str = this.userProfileId;
        String str2 = this.connectionRequestId;
        String str3 = this.connectionRequestorId;
        com.garmin.android.apps.connectmobile.connections.model.a aVar = this.connectionStatus;
        StringBuilder sbI = p6.b.i("GroupConnectionStatusDTO(userProfileId=", str, ", connectionRequestId=", str2, ", connectionRequestorId=");
        sbI.append(str3);
        sbI.append(", connectionStatus=");
        sbI.append(aVar);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.userProfileId);
        parcel.writeString(this.connectionRequestId);
        parcel.writeString(this.connectionRequestorId);
        com.garmin.android.apps.connectmobile.connections.model.a aVar = this.connectionStatus;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/c$a;", "", "<init>", "()V", "", "USER_PROFILE_ID", "Ljava/lang/String;", "CONNECTION_REQUEST_ID", "CONNECTION_REQUESTOR_ID", "CONNECTION_STATUS", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public c(String str) {
        this(str, null, null, null, 14, null);
    }

    public c(String str, String str2) {
        this(str, str2, null, null, 12, null);
    }

    public c(String str, String str2, String str3) {
        this(str, str2, str3, null, 8, null);
    }

    public c(String str, String str2, String str3, com.garmin.android.apps.connectmobile.connections.model.a aVar) {
        this.userProfileId = str;
        this.connectionRequestId = str2;
        this.connectionRequestorId = str3;
        this.connectionStatus = aVar;
    }

    public c() {
        this(null, null, null, null, 15, null);
    }
}
