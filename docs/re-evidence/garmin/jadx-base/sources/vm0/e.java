package vm0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.connections.model.ConnectionDTO;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvm0/e;", "Landroid/os/Parcelable;", "", "profileImageUrl", "userName", "", "userLevel", FirebaseAnalytics.Param.LOCATION, "Lcom/garmin/android/apps/connectmobile/connections/model/ConnectionDTO;", "connectionDTO", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;", "groupConnectionDTO", "Lwm0/a;", "groupInviteDTO", "Lwm0/c;", "groupMemberRequestDTO", "", "groupId", "userId", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/garmin/android/apps/connectmobile/connections/model/ConnectionDTO;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/b;Lwm0/a;Lwm0/c;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f178747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f178748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConnectionDTO f178749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.connections.groups.services.model.b f178750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wm0.a f178751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wm0.c f178752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f178753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f178754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f178755k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), (ConnectionDTO) parcel.readParcelable(e.class.getClassLoader()), (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) parcel.readParcelable(e.class.getClassLoader()), parcel.readInt() == 0 ? null : wm0.a.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : wm0.c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(String str, String str2, int i14, String str3, ConnectionDTO connectionDTO, com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, wm0.a aVar, wm0.c cVar, Long l14, Long l15, String str4) {
        connectionDTO.getClass();
        this.f178745a = str;
        this.f178746b = str2;
        this.f178747c = i14;
        this.f178748d = str3;
        this.f178749e = connectionDTO;
        this.f178750f = bVar;
        this.f178751g = aVar;
        this.f178752h = cVar;
        this.f178753i = l14;
        this.f178754j = l15;
        this.f178755k = str4;
    }

    public static e b(e eVar, com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar, wm0.a aVar, int i14) {
        String str = eVar.f178745a;
        String str2 = eVar.f178746b;
        int i15 = eVar.f178747c;
        String str3 = eVar.f178748d;
        ConnectionDTO connectionDTO = eVar.f178749e;
        if ((i14 & 32) != 0) {
            bVar = eVar.f178750f;
        }
        com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar2 = bVar;
        if ((i14 & 64) != 0) {
            aVar = eVar.f178751g;
        }
        wm0.c cVar = eVar.f178752h;
        Long l14 = eVar.f178753i;
        Long l15 = eVar.f178754j;
        String str4 = eVar.f178755k;
        eVar.getClass();
        return new e(str, str2, i15, str3, connectionDTO, bVar2, aVar, cVar, l14, l15, str4);
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
        return p005kotlin.jvm.internal.s.g(this.f178745a, eVar.f178745a) && p005kotlin.jvm.internal.s.g(this.f178746b, eVar.f178746b) && this.f178747c == eVar.f178747c && p005kotlin.jvm.internal.s.g(this.f178748d, eVar.f178748d) && this.f178749e.equals(eVar.f178749e) && p005kotlin.jvm.internal.s.g(this.f178750f, eVar.f178750f) && p005kotlin.jvm.internal.s.g(this.f178751g, eVar.f178751g) && p005kotlin.jvm.internal.s.g(this.f178752h, eVar.f178752h) && p005kotlin.jvm.internal.s.g(this.f178753i, eVar.f178753i) && p005kotlin.jvm.internal.s.g(this.f178754j, eVar.f178754j) && p005kotlin.jvm.internal.s.g(this.f178755k, eVar.f178755k);
    }

    public final int hashCode() {
        String str = this.f178745a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f178746b;
        int iD = q2.d(this.f178747c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f178748d;
        int iHashCode2 = (this.f178749e.hashCode() + ((iD + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = this.f178750f;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        wm0.a aVar = this.f178751g;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        wm0.c cVar = this.f178752h;
        int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Long l14 = this.f178753i;
        int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f178754j;
        int iHashCode7 = (iHashCode6 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str4 = this.f178755k;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("GroupInviteItem(profileImageUrl=", this.f178745a, ", userName=", this.f178746b, ", userLevel=");
        wr.g.t(this.f178747c, ", location=", this.f178748d, ", connectionDTO=", sbI);
        sbI.append(this.f178749e);
        sbI.append(", groupConnectionDTO=");
        sbI.append(this.f178750f);
        sbI.append(", groupInviteDTO=");
        sbI.append(this.f178751g);
        sbI.append(", groupMemberRequestDTO=");
        sbI.append(this.f178752h);
        sbI.append(", groupId=");
        kg.f.s(sbI, this.f178753i, ", userId=", this.f178754j, ", displayName=");
        return am.j.o(this.f178755k, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f178745a);
        parcel.writeString(this.f178746b);
        parcel.writeInt(this.f178747c);
        parcel.writeString(this.f178748d);
        parcel.writeParcelable(this.f178749e, i14);
        parcel.writeParcelable(this.f178750f, i14);
        wm0.a aVar = this.f178751g;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        wm0.c cVar = this.f178752h;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        Long l14 = this.f178753i;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.f178754j;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.f178755k);
    }
}
