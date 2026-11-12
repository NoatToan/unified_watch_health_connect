package hi0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lhi0/h;", "Landroid/os/Parcelable;", "", "Lhi0/l;", "profileList", "Lhi0/i;", "followingSuggestionRequest", "", "hasMore", "", "nextCursor", "Loz0/e;", "suggestionStatus", "<init>", "(Ljava/util/List;Lhi0/i;Ljava/lang/Boolean;Ljava/lang/String;Loz0/e;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lhi0/i;", "getFollowingSuggestionRequest", "()Lhi0/i;", "c", "Ljava/lang/Boolean;", "getHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "Loz0/e;", "getSuggestionStatus", "()Loz0/e;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileList")
    private final List<l> profileList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("followingSuggestionRequest")
    private final i followingSuggestionRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasMore")
    private final Boolean hasMore;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nextCursor")
    private final String nextCursor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suggestionStatus")
    private final oz0.e suggestionStatus;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(l.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            i iVarCreateFromParcel = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new h(arrayList, iVarCreateFromParcel, boolValueOf, parcel.readString(), parcel.readInt() != 0 ? oz0.e.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(List list, i iVar, Boolean bool, String str, oz0.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : iVar, (i14 & 4) != 0 ? Boolean.FALSE : bool, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : eVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<l> d() {
        return this.profileList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.profileList, hVar.profileList) && s.g(this.followingSuggestionRequest, hVar.followingSuggestionRequest) && s.g(this.hasMore, hVar.hasMore) && s.g(this.nextCursor, hVar.nextCursor) && this.suggestionStatus == hVar.suggestionStatus;
    }

    public final int hashCode() {
        List<l> list = this.profileList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        i iVar = this.followingSuggestionRequest;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Boolean bool = this.hasMore;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.nextCursor;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        oz0.e eVar = this.suggestionStatus;
        return iHashCode4 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        List<l> list = this.profileList;
        i iVar = this.followingSuggestionRequest;
        Boolean bool = this.hasMore;
        String str = this.nextCursor;
        oz0.e eVar = this.suggestionStatus;
        StringBuilder sb3 = new StringBuilder("FollowingSuggestionDTO(profileList=");
        sb3.append(list);
        sb3.append(", followingSuggestionRequest=");
        sb3.append(iVar);
        sb3.append(", hasMore=");
        b71.i.s(sb3, bool, ", nextCursor=", str, ", suggestionStatus=");
        sb3.append(eVar);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<l> list = this.profileList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((l) itO.next()).writeToParcel(parcel, i14);
            }
        }
        i iVar = this.followingSuggestionRequest;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        Boolean bool = this.hasMore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.nextCursor);
        oz0.e eVar = this.suggestionStatus;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eVar.name());
        }
    }

    public h(List<l> list, i iVar, Boolean bool, String str, oz0.e eVar) {
        this.profileList = list;
        this.followingSuggestionRequest = iVar;
        this.hasMore = bool;
        this.nextCursor = str;
        this.suggestionStatus = eVar;
    }

    public h() {
        this(null, null, null, null, null, 31, null);
    }
}
