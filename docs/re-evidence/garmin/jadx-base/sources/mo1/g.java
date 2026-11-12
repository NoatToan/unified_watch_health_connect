package mo1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lmo1/g;", "Landroid/os/Parcelable;", "", "resourceId", "", "likerDisplayNames", "likerFullNames", "likerProfileImageUrls", "", "likerUserIds", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getResourceId", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getLikerDisplayNames", "()Ljava/util/List;", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resourceId")
    private final String resourceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("likerDisplayNames")
    private final List<String> likerDisplayNames;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("likerFullNames")
    private final List<String> likerFullNames;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("likerProfileImageUrls")
    private final List<String> likerProfileImageUrls;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("likerUserIds")
    private final List<Long> likerUserIds;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new g(string, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(String str, List<String> list, List<String> list2, List<String> list3, List<Long> list4) {
        j.x(str, list, list2, list3, list4);
        this.resourceId = str;
        this.likerDisplayNames = list;
        this.likerFullNames = list2;
        this.likerProfileImageUrls = list3;
        this.likerUserIds = list4;
    }

    public final List<String> b() {
        return this.likerFullNames;
    }

    public final List<String> d() {
        return this.likerProfileImageUrls;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.resourceId, gVar.resourceId) && s.g(this.likerDisplayNames, gVar.likerDisplayNames) && s.g(this.likerFullNames, gVar.likerFullNames) && s.g(this.likerProfileImageUrls, gVar.likerProfileImageUrls) && s.g(this.likerUserIds, gVar.likerUserIds);
    }

    public final List<Long> f() {
        return this.likerUserIds;
    }

    public final int hashCode() {
        return this.likerUserIds.hashCode() + u0.b(u0.b(u0.b(this.resourceId.hashCode() * 31, 31, this.likerDisplayNames), 31, this.likerFullNames), 31, this.likerProfileImageUrls);
    }

    public final String toString() {
        String str = this.resourceId;
        List<String> list = this.likerDisplayNames;
        List<String> list2 = this.likerFullNames;
        List<String> list3 = this.likerProfileImageUrls;
        List<Long> list4 = this.likerUserIds;
        StringBuilder sbG = l2.g("ConversationLikersDTO(resourceId=", str, ", likerDisplayNames=", list, ", likerFullNames=");
        j.z(sbG, list2, ", likerProfileImageUrls=", list3, ", likerUserIds=");
        return z.c(sbG, list4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.resourceId);
        parcel.writeStringList(this.likerDisplayNames);
        parcel.writeStringList(this.likerFullNames);
        parcel.writeStringList(this.likerProfileImageUrls);
        Iterator itE = kg.f.e(this.likerUserIds, parcel);
        while (itE.hasNext()) {
            parcel.writeLong(((Number) itE.next()).longValue());
        }
    }
}
