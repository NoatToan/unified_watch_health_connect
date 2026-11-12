package vo0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lvo0/e;", "Landroid/os/Parcelable;", "", "title", TtmlNode.ATTR_ID, "resultType", "localityType", "Lvo0/a;", "address", "Lvo0/c;", ModelSourceWrapper.POSITION, "Lvo0/d;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "", "Lvo0/b;", "categories", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo0/a;Lvo0/c;Lvo0/d;Ljava/util/List;)V", "a", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "b", "getId", "c", "h", "d", "f", JWKParameterNames.RSA_EXPONENT, "Lvo0/a;", "()Lvo0/a;", "Lvo0/c;", "g", "()Lvo0/c;", "Lvo0/d;", IntegerTokenConverter.CONVERTER_KEY, "()Lvo0/d;", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultType")
    private final String resultType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("localityType")
    private final String localityType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("address")
    private final vo0.a address;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ModelSourceWrapper.POSITION)
    private final c position;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.TIME_ZONE)
    private final d timeZone;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("categories")
    private final List<b> categories;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            vo0.a aVarCreateFromParcel = parcel.readInt() == 0 ? null : vo0.a.CREATOR.createFromParcel(parcel);
            c cVarCreateFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            d dVarCreateFromParcel = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(b.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new e(string, string2, string3, string4, aVarCreateFromParcel, cVarCreateFromParcel, dVarCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, vo0.a aVar, c cVar, d dVar, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : aVar, (i14 & 32) != 0 ? null : cVar, (i14 & 64) != 0 ? null : dVar, (i14 & 128) != 0 ? null : list);
    }

    public static e b(e eVar, String str, vo0.a aVar) {
        return new e(str, eVar.id, eVar.resultType, eVar.localityType, aVar, eVar.position, eVar.timeZone, eVar.categories);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final vo0.a getAddress() {
        return this.address;
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
        return s.g(this.title, eVar.title) && s.g(this.id, eVar.id) && s.g(this.resultType, eVar.resultType) && s.g(this.localityType, eVar.localityType) && s.g(this.address, eVar.address) && s.g(this.position, eVar.position) && s.g(this.timeZone, eVar.timeZone) && s.g(this.categories, eVar.categories);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLocalityType() {
        return this.localityType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getPosition() {
        return this.position;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getResultType() {
        return this.resultType;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resultType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.localityType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        vo0.a aVar = this.address;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.position;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.timeZone;
        int iHashCode7 = (iHashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<b> list = this.categories;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.id;
        String str3 = this.resultType;
        String str4 = this.localityType;
        vo0.a aVar = this.address;
        c cVar = this.position;
        d dVar = this.timeZone;
        List<b> list = this.categories;
        StringBuilder sbI = p6.b.i("GeofenceSearchItem(title=", str, ", id=", str2, ", resultType=");
        sn.a.t(sbI, str3, ", localityType=", str4, ", address=");
        sbI.append(aVar);
        sbI.append(", position=");
        sbI.append(cVar);
        sbI.append(", timeZone=");
        sbI.append(dVar);
        sbI.append(", categories=");
        sbI.append(list);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.id);
        parcel.writeString(this.resultType);
        parcel.writeString(this.localityType);
        vo0.a aVar = this.address;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        c cVar = this.position;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        d dVar = this.timeZone;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        List<b> list = this.categories;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((b) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public e(String str, String str2, String str3, String str4, vo0.a aVar, c cVar, d dVar, List<b> list) {
        this.title = str;
        this.id = str2;
        this.resultType = str3;
        this.localityType = str4;
        this.address = aVar;
        this.position = cVar;
        this.timeZone = dVar;
        this.categories = list;
    }

    public e() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
