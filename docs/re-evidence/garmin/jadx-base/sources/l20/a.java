package l20;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.u;
import d53.w;
import f20.e0;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010 \u001a\u0004\b6\u0010\"R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b7\u0010\u001a¨\u00068"}, d2 = {"Ll20/a;", "Landroid/os/Parcelable;", "", "contactId", "firstName", "lastName", "", "isSosDefault", "isLiveTrackDefault", "isLiveEventSharingDefault", "", "Ll20/c;", "emails", "phones", "messengerPhones", "Ll20/g;", "socialProfiles", "", "contactInfoLimit", "isEmsContact", "localId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "b", "s", "c", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "d", "Ljava/lang/Boolean;", "I", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_EXPONENT, "H", "f", "G", "g", "Ljava/util/List;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "()Ljava/util/List;", "h", "z", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "j", "A", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Integer;", "o", "()Ljava/lang/Integer;", "l", "F", "u", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2087a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private final String contactId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstName")
    @JsonAdapter(GsonUtil.StringTrimJsonDeserializer.class)
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastName")
    @JsonAdapter(GsonUtil.StringTrimJsonDeserializer.class)
    private final String lastName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isSosDefault")
    private final Boolean isSosDefault;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isLiveTrackDefault")
    private final Boolean isLiveTrackDefault;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isLiveEventSharingDefault")
    private final Boolean isLiveEventSharingDefault;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("emails")
    private final List<c> emails;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phones")
    private final List<c> phones;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messengerPhones")
    private final List<c> messengerPhones;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("socialProfiles")
    private final List<g> socialProfiles;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactInfoLimit")
    private final Integer contactInfoLimit;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isEmsContact")
    private final Boolean isEmsContact;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private final String localId;

    /* JADX INFO: renamed from: l20.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2087a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Boolean boolValueOf4 = null;
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(c.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                int iA2 = 0;
                while (iA2 != i15) {
                    iA2 = kg.f.a(c.CREATOR, parcel, arrayList2, iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList3 = new ArrayList(i16);
                int iA3 = 0;
                while (iA3 != i16) {
                    iA3 = kg.f.a(c.CREATOR, parcel, arrayList3, iA3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i17);
                int iA4 = 0;
                while (iA4 != i17) {
                    iA4 = kg.f.a(g.CREATOR, parcel, arrayList5, iA4, 1);
                }
                arrayList4 = arrayList5;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new a(string, string2, string3, boolValueOf, boolValueOf2, boolValueOf3, arrayList, arrayList2, arrayList3, arrayList4, numValueOf, boolValueOf4, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, List list, List list2, List list3, List list4, Integer num, Boolean bool4, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) == 0 ? str3 : "", (i14 & 8) != 0 ? Boolean.FALSE : bool, (i14 & 16) != 0 ? Boolean.FALSE : bool2, (i14 & 32) != 0 ? Boolean.FALSE : bool3, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : list2, (i14 & 256) != 0 ? null : list3, (i14 & 512) != 0 ? null : list4, (i14 & 1024) != 0 ? null : num, (i14 & 2048) != 0 ? Boolean.FALSE : bool4, (i14 & 4096) != 0 ? null : str4);
    }

    public static a g(a aVar, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, List list, List list2, Boolean bool4, int i14) {
        String str4 = (i14 & 1) != 0 ? aVar.contactId : str;
        String str5 = (i14 & 2) != 0 ? aVar.firstName : str2;
        String str6 = (i14 & 4) != 0 ? aVar.lastName : str3;
        Boolean bool5 = (i14 & 8) != 0 ? aVar.isSosDefault : bool;
        Boolean bool6 = (i14 & 16) != 0 ? aVar.isLiveTrackDefault : bool2;
        Boolean bool7 = (i14 & 32) != 0 ? aVar.isLiveEventSharingDefault : bool3;
        List list3 = (i14 & 64) != 0 ? aVar.emails : list;
        List list4 = (i14 & 128) != 0 ? aVar.phones : list2;
        List<c> list5 = aVar.messengerPhones;
        List<g> list6 = (i14 & 512) != 0 ? aVar.socialProfiles : null;
        Integer num = (i14 & 1024) != 0 ? aVar.contactInfoLimit : null;
        Boolean bool8 = (i14 & 2048) != 0 ? aVar.isEmsContact : bool4;
        String str7 = aVar.localId;
        aVar.getClass();
        return new a(str4, str5, str6, bool5, bool6, bool7, list3, list4, list5, list6, num, bool8, str7);
    }

    public final List<g> A() {
        return this.socialProfiles;
    }

    public final boolean C(e0 e0Var) {
        e0Var.getClass();
        List<c> list = this.phones;
        if (list != null && !list.isEmpty()) {
            for (c cVar : list) {
                if (s.g(cVar.getIsValid(), Boolean.FALSE) || !gl1.d.K(cVar, e0Var)) {
                    return true;
                }
            }
        }
        List<c> list2 = this.emails;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (!gl1.d.J((c) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean D() {
        ArrayList<c> arrayListS = ge1.b.s(k());
        if (arrayListS.isEmpty()) {
            return false;
        }
        for (c cVar : arrayListS) {
            if (cVar.H() && !cVar.f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Boolean getIsEmsContact() {
        return this.isEmsContact;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Boolean getIsLiveEventSharingDefault() {
        return this.isLiveEventSharingDefault;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Boolean getIsLiveTrackDefault() {
        return this.isLiveTrackDefault;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Boolean getIsSosDefault() {
        return this.isSosDefault;
    }

    public final ArrayList M() {
        List<g> list = this.socialProfiles;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String displayName = ((g) obj).getDisplayName();
            if (displayName != null && displayName.length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean b(e0 e0Var) {
        if (k().isEmpty()) {
            return false;
        }
        List<c> list = this.phones;
        if (list != null) {
            ArrayList<c> arrayListS = ge1.b.s(list);
            if (!arrayListS.isEmpty()) {
                for (c cVar : arrayListS) {
                    if (!cVar.I() && gl1.d.K(cVar, e0Var) && !cVar.M() && !cVar.f()) {
                        return false;
                    }
                }
            }
        }
        List<c> list2 = this.emails;
        if (list2 == null || list2.isEmpty()) {
            return true;
        }
        ArrayList<c> arrayListS2 = ge1.b.s(this.emails);
        if (arrayListS2.isEmpty()) {
            return true;
        }
        for (c cVar2 : arrayListS2) {
            if (!cVar2.I() && !cVar2.M()) {
                return false;
            }
        }
        return true;
    }

    public final boolean d() {
        ArrayList<c> arrayListS = ge1.b.s(k());
        if (arrayListS.isEmpty()) {
            return true;
        }
        for (c cVar : arrayListS) {
            if (!cVar.I() && !cVar.d()) {
                return false;
            }
        }
        return true;
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
        return s.g(this.contactId, aVar.contactId) && s.g(this.firstName, aVar.firstName) && s.g(this.lastName, aVar.lastName) && s.g(this.isSosDefault, aVar.isSosDefault) && s.g(this.isLiveTrackDefault, aVar.isLiveTrackDefault) && s.g(this.isLiveEventSharingDefault, aVar.isLiveEventSharingDefault) && s.g(this.emails, aVar.emails) && s.g(this.phones, aVar.phones) && s.g(this.messengerPhones, aVar.messengerPhones) && s.g(this.socialProfiles, aVar.socialProfiles) && s.g(this.contactInfoLimit, aVar.contactInfoLimit) && s.g(this.isEmsContact, aVar.isEmsContact) && s.g(this.localId, aVar.localId);
    }

    public final boolean f() {
        if (k().isEmpty()) {
            return false;
        }
        List<c> listK = k();
        if (listK != null && listK.isEmpty()) {
            return false;
        }
        for (c cVar : listK) {
            if (cVar.H() || cVar.Z() || cVar.M() || cVar.I()) {
                return true;
            }
        }
        return false;
    }

    public final c h(String str) {
        Object next;
        String content;
        str.getClass();
        List<c> list = this.phones;
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                content = ((c) next).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
            } while (!s.g(content != null ? u.v(content, Marker.ANY_NON_NULL_MARKER, "", false) : null, u.v(str, Marker.ANY_NON_NULL_MARKER, "", false)));
            c cVar = (c) next;
            if (cVar != null) {
                return cVar;
            }
        }
        List<c> list2 = this.emails;
        if (list2 == null) {
            return null;
        }
        for (Object obj2 : list2) {
            if (s.g(((c) obj2).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), str)) {
                obj = obj2;
                break;
            }
        }
        return (c) obj;
    }

    public final int hashCode() {
        String str = this.contactId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isSosDefault;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isLiveTrackDefault;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isLiveEventSharingDefault;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<c> list = this.emails;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<c> list2 = this.phones;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<c> list3 = this.messengerPhones;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<g> list4 = this.socialProfiles;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.contactInfoLimit;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool4 = this.isEmsContact;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str4 = this.localId;
        return iHashCode12 + (str4 != null ? str4.hashCode() : 0);
    }

    public final c i(long j8) {
        Object next;
        List<c> list = this.phones;
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Long contactInfoPk = ((c) next).getContactInfoPk();
                if (contactInfoPk != null && contactInfoPk.longValue() == j8) {
                    break;
                }
            }
            c cVar = (c) next;
            if (cVar != null) {
                return cVar;
            }
        }
        List<c> list2 = this.emails;
        if (list2 == null) {
            return null;
        }
        for (Object obj2 : list2) {
            Long contactInfoPk2 = ((c) obj2).getContactInfoPk();
            if (contactInfoPk2 != null && contactInfoPk2.longValue() == j8) {
                obj = obj2;
                break;
            }
        }
        return (c) obj;
    }

    public final String j() {
        if (g22.n.d(this.firstName) && g22.n.d(this.lastName)) {
            return e5.g(this.firstName, StringUtils.SPACE, this.lastName);
        }
        if (g22.n.d(this.firstName)) {
            return this.firstName;
        }
        return w.i0(g22.n.d(this.lastName) ? this.lastName : "").toString();
    }

    public final List<c> k() {
        List<c> list;
        List<c> list2 = this.phones;
        if (list2 != null && (list = this.emails) != null) {
            return h0.C0(list2, list);
        }
        if (list2 != null) {
            return list2;
        }
        List<c> list3 = this.emails;
        return list3 == null ? j0.f134944a : list3;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getContactId() {
        return this.contactId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getContactInfoLimit() {
        return this.contactInfoLimit;
    }

    public final g q() {
        ArrayList arrayListM = M();
        if (arrayListM != null) {
            return (g) h0.K0(arrayListM);
        }
        return null;
    }

    public final List<c> r() {
        return this.emails;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final String toString() {
        String str = this.contactId;
        String str2 = this.firstName;
        String str3 = this.lastName;
        Boolean bool = this.isSosDefault;
        Boolean bool2 = this.isLiveTrackDefault;
        Boolean bool3 = this.isLiveEventSharingDefault;
        List<c> list = this.emails;
        List<c> list2 = this.phones;
        List<c> list3 = this.messengerPhones;
        List<g> list4 = this.socialProfiles;
        Integer num = this.contactInfoLimit;
        Boolean bool4 = this.isEmsContact;
        String str4 = this.localId;
        StringBuilder sbI = p6.b.i("ContactDTO(contactId=", str, ", firstName=", str2, ", lastName=");
        b71.i.w(sbI, str3, ", isSosDefault=", bool, ", isLiveTrackDefault=");
        b71.i.o(bool2, bool3, ", isLiveEventSharingDefault=", ", emails=", sbI);
        n23.j.z(sbI, list, ", phones=", list2, ", messengerPhones=");
        n23.j.z(sbI, list3, ", socialProfiles=", list4, ", contactInfoLimit=");
        kg.f.r(sbI, num, ", isEmsContact=", bool4, ", localId=");
        return am.j.o(str4, ")", sbI);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getLocalId() {
        return this.localId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.contactId);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        Boolean bool = this.isSosDefault;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.isLiveTrackDefault;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.isLiveEventSharingDefault;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        List<c> list = this.emails;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((c) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<c> list2 = this.phones;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((c) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<c> list3 = this.messengerPhones;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((c) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        List<g> list4 = this.socialProfiles;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO4 = u0.o(parcel, list4, 1);
            while (itO4.hasNext()) {
                ((g) itO4.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num = this.contactInfoLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Boolean bool4 = this.isEmsContact;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        parcel.writeString(this.localId);
    }

    public final List<c> y() {
        return this.messengerPhones;
    }

    public final List<c> z() {
        return this.phones;
    }

    public a(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, List<c> list, List<c> list2, List<c> list3, List<g> list4, Integer num, Boolean bool4, String str4) {
        this.contactId = str;
        this.firstName = str2;
        this.lastName = str3;
        this.isSosDefault = bool;
        this.isLiveTrackDefault = bool2;
        this.isLiveEventSharingDefault = bool3;
        this.emails = list;
        this.phones = list2;
        this.messengerPhones = list3;
        this.socialProfiles = list4;
        this.contactInfoLimit = num;
        this.isEmsContact = bool4;
        this.localId = str4;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
