package to;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018BÁ\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010(\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010\"\u001a\u0004\b@\u0010$\"\u0004\bA\u0010&R$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010C\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR$\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010C\u001a\u0004\bL\u0010E\"\u0004\bM\u0010GR$\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010C\u001a\u0004\bO\u0010E\"\u0004\bP\u0010G¨\u0006Q"}, d2 = {"Lto/e;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "userProfileId", "groupProfileId", "", "", "includePrivacyList", "", "excludedUntitled", "favoritesOnly", "subscribeeIds", "Lnz0/a;", "ownerType", "excludeChildren", "excludeParent", "activityTypeIdList", "endTimeGMT", "startTimeGMT", "cursor", "nextCursor", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lnz0/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "getUserProfileId", "()Ljava/lang/Integer;", "setUserProfileId", "(Ljava/lang/Integer;)V", "b", "getGroupProfileId", "setGroupProfileId", "c", "Ljava/util/List;", "getIncludePrivacyList", "()Ljava/util/List;", "setIncludePrivacyList", "(Ljava/util/List;)V", "d", "Ljava/lang/Boolean;", "getExcludedUntitled", "()Ljava/lang/Boolean;", "setExcludedUntitled", "(Ljava/lang/Boolean;)V", JWKParameterNames.RSA_EXPONENT, "getFavoritesOnly", "setFavoritesOnly", "f", "getSubscribeeIds", "setSubscribeeIds", "g", "Lnz0/a;", "getOwnerType", "()Lnz0/a;", "setOwnerType", "(Lnz0/a;)V", "h", "getExcludeChildren", "setExcludeChildren", IntegerTokenConverter.CONVERTER_KEY, "getExcludeParent", "setExcludeParent", "j", "getActivityTypeIdList", "setActivityTypeIdList", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/String;", "getEndTimeGMT", "()Ljava/lang/String;", "setEndTimeGMT", "(Ljava/lang/String;)V", "l", "getStartTimeGMT", "setStartTimeGMT", "m", "getCursor", "setCursor", JWKParameterNames.RSA_MODULUS, "C", "setNextCursor", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e extends s1 implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private Integer userProfileId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupProfileId")
    private Integer groupProfileId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includePrivacyList")
    private List<String> includePrivacyList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("excludeUntitled")
    private Boolean excludedUntitled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("favoritesOnly")
    private Boolean favoritesOnly;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subscribeeIds")
    private List<Integer> subscribeeIds;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ownerType")
    private nz0.a ownerType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("excludeChildren")
    private Boolean excludeChildren;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("excludeParent")
    private Boolean excludeParent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityTypeIdList")
    private List<Integer> activityTypeIdList;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimeGMT")
    private String endTimeGMT;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeGMT")
    private String startTimeGMT;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cursor")
    private String cursor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nextCursor")
    private String nextCursor;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList3;
            }
            nz0.a aVarValueOf = parcel.readInt() == 0 ? null : nz0.a.valueOf(parcel.readString());
            Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList4.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList2 = arrayList4;
            }
            return new e(numValueOf, numValueOf2, arrayListCreateStringArrayList, boolValueOf, boolValueOf2, arrayList, aVarValueOf, boolValueOf3, boolValueOf4, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ e(Integer num, Integer num2, List list, Boolean bool, Boolean bool2, List list2, nz0.a aVar, Boolean bool3, Boolean bool4, List list3, String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : bool2, (i14 & 32) != 0 ? null : list2, (i14 & 64) != 0 ? null : aVar, (i14 & 128) != 0 ? null : bool3, (i14 & 256) != 0 ? null : bool4, (i14 & 512) != 0 ? null : list3, (i14 & 1024) != 0 ? null : str, (i14 & 2048) != 0 ? null : str2, (i14 & 4096) != 0 ? null : str3, (i14 & 8192) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
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
        return s.g(this.userProfileId, eVar.userProfileId) && s.g(this.groupProfileId, eVar.groupProfileId) && s.g(this.includePrivacyList, eVar.includePrivacyList) && s.g(this.excludedUntitled, eVar.excludedUntitled) && s.g(this.favoritesOnly, eVar.favoritesOnly) && s.g(this.subscribeeIds, eVar.subscribeeIds) && this.ownerType == eVar.ownerType && s.g(this.excludeChildren, eVar.excludeChildren) && s.g(this.excludeParent, eVar.excludeParent) && s.g(this.activityTypeIdList, eVar.activityTypeIdList) && s.g(this.endTimeGMT, eVar.endTimeGMT) && s.g(this.startTimeGMT, eVar.startTimeGMT) && s.g(this.cursor, eVar.cursor) && s.g(this.nextCursor, eVar.nextCursor);
    }

    public final int hashCode() {
        Integer num = this.userProfileId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.groupProfileId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.includePrivacyList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.excludedUntitled;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.favoritesOnly;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Integer> list2 = this.subscribeeIds;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        nz0.a aVar = this.ownerType;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool3 = this.excludeChildren;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.excludeParent;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<Integer> list3 = this.activityTypeIdList;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.endTimeGMT;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startTimeGMT;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cursor;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nextCursor;
        return iHashCode13 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.userProfileId = s1.r(jSONObject, "userProfileId");
        this.groupProfileId = s1.r(jSONObject, "groupProfileId");
        this.includePrivacyList = s1.y(jSONObject, "includePrivacyList");
        this.excludedUntitled = s1.o(jSONObject, "excludeUntitled");
        this.favoritesOnly = s1.o(jSONObject, "favoritesOnly");
        this.subscribeeIds = s1.s(jSONObject, "subscribeeIds");
        String strU = s1.u(jSONObject, "ownerType");
        for (nz0.a aVar : nz0.a.values()) {
            if (s.g(aVar.f128376a, strU)) {
                this.ownerType = aVar;
                this.excludeChildren = s1.o(jSONObject, "excludeChildren");
                this.excludeParent = s1.o(jSONObject, "excludeParent");
                this.activityTypeIdList = s1.s(jSONObject, "activityTypeIdList");
                this.endTimeGMT = s1.u(jSONObject, "endTimeGMT");
                this.startTimeGMT = s1.u(jSONObject, "startTimeGMT");
                this.cursor = s1.u(jSONObject, "cursor");
                this.nextCursor = s1.u(jSONObject, "nextCursor");
            }
        }
        aVar = null;
        this.ownerType = aVar;
        this.excludeChildren = s1.o(jSONObject, "excludeChildren");
        this.excludeParent = s1.o(jSONObject, "excludeParent");
        this.activityTypeIdList = s1.s(jSONObject, "activityTypeIdList");
        this.endTimeGMT = s1.u(jSONObject, "endTimeGMT");
        this.startTimeGMT = s1.u(jSONObject, "startTimeGMT");
        this.cursor = s1.u(jSONObject, "cursor");
        this.nextCursor = s1.u(jSONObject, "nextCursor");
    }

    public final String toString() {
        Integer num = this.userProfileId;
        Integer num2 = this.groupProfileId;
        List<String> list = this.includePrivacyList;
        Boolean bool = this.excludedUntitled;
        Boolean bool2 = this.favoritesOnly;
        List<Integer> list2 = this.subscribeeIds;
        nz0.a aVar = this.ownerType;
        Boolean bool3 = this.excludeChildren;
        Boolean bool4 = this.excludeParent;
        List<Integer> list3 = this.activityTypeIdList;
        String str = this.endTimeGMT;
        String str2 = this.startTimeGMT;
        String str3 = this.cursor;
        String str4 = this.nextCursor;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "FilterItemDTO(userProfileId=", ", groupProfileId=", ", includePrivacyList=", num2);
        sbL.append(list);
        sbL.append(", excludedUntitled=");
        sbL.append(bool);
        sbL.append(", favoritesOnly=");
        sbL.append(bool2);
        sbL.append(", subscribeeIds=");
        sbL.append(list2);
        sbL.append(", ownerType=");
        sbL.append(aVar);
        sbL.append(", excludeChildren=");
        sbL.append(bool3);
        sbL.append(", excludeParent=");
        sbL.append(bool4);
        sbL.append(", activityTypeIdList=");
        sbL.append(list3);
        sbL.append(", endTimeGMT=");
        sn.a.t(sbL, str, ", startTimeGMT=", str2, ", cursor=");
        return e5.h(sbL, str3, ", nextCursor=", str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.userProfileId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.groupProfileId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeStringList(this.includePrivacyList);
        Boolean bool = this.excludedUntitled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.favoritesOnly;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        List<Integer> list = this.subscribeeIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeInt(((Number) itO.next()).intValue());
            }
        }
        nz0.a aVar = this.ownerType;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        Boolean bool3 = this.excludeChildren;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.excludeParent;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        List<Integer> list2 = this.activityTypeIdList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                parcel.writeInt(((Number) itO2.next()).intValue());
            }
        }
        parcel.writeString(this.endTimeGMT);
        parcel.writeString(this.startTimeGMT);
        parcel.writeString(this.cursor);
        parcel.writeString(this.nextCursor);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lto/e$a;", "", "<init>", "()V", "", "USER_PROFILE_ID", "Ljava/lang/String;", "GROUP_PROFILE_ID", "INCLUDE_PRIVACY_LIST", "EXCLUDE_UNTITLED", "FAVORITES_ONLY", "SUBSCRIBEE_IDS", "OWNER_TYPE", "EXCLUDE_CHILDREN", "EXCLUDE_PARENT", "ACTIVITY_TYPE_ID_LIST", "END_TIME_GMT", "START_TIME_GMT", "CURSOR", "NEXT_CURSOR", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public e(Integer num, Integer num2, List<String> list, Boolean bool, Boolean bool2, List<Integer> list2, nz0.a aVar, Boolean bool3, Boolean bool4, List<Integer> list3, String str, String str2, String str3, String str4) {
        this.userProfileId = num;
        this.groupProfileId = num2;
        this.includePrivacyList = list;
        this.excludedUntitled = bool;
        this.favoritesOnly = bool2;
        this.subscribeeIds = list2;
        this.ownerType = aVar;
        this.excludeChildren = bool3;
        this.excludeParent = bool4;
        this.activityTypeIdList = list3;
        this.endTimeGMT = str;
        this.startTimeGMT = str2;
        this.cursor = str3;
        this.nextCursor = str4;
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
