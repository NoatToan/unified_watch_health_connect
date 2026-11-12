package os1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"¨\u0006)"}, d2 = {"Los1/a;", "Landroid/os/Parcelable;", "", "minDistanceFilterMeters", "maxDistanceFilterMeters", "minTotalAscentFilterMeters", "maxTotalAscentFilterMeters", "", "includeUnratedTrails", "", "trailRatings", "trailDifficulty", "", "trailTypes", "trailFeatures", "<init>", "(IIIIZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "I", "getMinDistanceFilterMeters", "()I", "b", "getMaxDistanceFilterMeters", "c", "getMinTotalAscentFilterMeters", "d", "getMaxTotalAscentFilterMeters", JWKParameterNames.RSA_EXPONENT, "Z", "getIncludeUnratedTrails", "()Z", "f", "Ljava/util/List;", "getTrailRatings", "()Ljava/util/List;", "g", "getTrailDifficulty", "h", "getTrailTypes", IntegerTokenConverter.CONVERTER_KEY, "getTrailFeatures", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2537a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minDistanceFilterMeters")
    private final int minDistanceFilterMeters;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxDistanceFilterMeters")
    private final int maxDistanceFilterMeters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minTotalAscentFilterMeters")
    private final int minTotalAscentFilterMeters;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxTotalAscentFilterMeters")
    private final int maxTotalAscentFilterMeters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includeUnratedTrails")
    private final boolean includeUnratedTrails;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trailRatings")
    private final List<Integer> trailRatings;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trailDifficulty")
    private final List<Integer> trailDifficulty;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trailTypes")
    private final List<String> trailTypes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trailFeatures")
    private final List<String> trailFeatures;

    /* JADX INFO: renamed from: os1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2537a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            boolean z14 = parcel.readInt() != 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i18 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i18);
                for (int i19 = 0; i19 != i18; i19++) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() != 0) {
                int i24 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i24);
                for (int i25 = 0; i25 != i24; i25++) {
                    arrayList4.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList2 = arrayList4;
            }
            return new a(i14, i15, i16, i17, z14, arrayList, arrayList2, parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(int i14, int i15, int i16, int i17, boolean z14, List list, List list2, List list3, List list4, int i18, j jVar) {
        this(i14, i15, i16, i17, z14, (i18 & 32) != 0 ? null : list, (i18 & 64) != 0 ? null : list2, (i18 & 128) != 0 ? null : list3, (i18 & 256) != 0 ? null : list4);
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
        return this.minDistanceFilterMeters == aVar.minDistanceFilterMeters && this.maxDistanceFilterMeters == aVar.maxDistanceFilterMeters && this.minTotalAscentFilterMeters == aVar.minTotalAscentFilterMeters && this.maxTotalAscentFilterMeters == aVar.maxTotalAscentFilterMeters && this.includeUnratedTrails == aVar.includeUnratedTrails && s.g(this.trailRatings, aVar.trailRatings) && s.g(this.trailDifficulty, aVar.trailDifficulty) && s.g(this.trailTypes, aVar.trailTypes) && s.g(this.trailFeatures, aVar.trailFeatures);
    }

    public final int hashCode() {
        int iG = f.g(q2.d(this.maxTotalAscentFilterMeters, q2.d(this.minTotalAscentFilterMeters, q2.d(this.maxDistanceFilterMeters, Integer.hashCode(this.minDistanceFilterMeters) * 31, 31), 31), 31), 31, this.includeUnratedTrails);
        List<Integer> list = this.trailRatings;
        int iHashCode = (iG + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.trailDifficulty;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.trailTypes;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.trailFeatures;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        int i14 = this.minDistanceFilterMeters;
        int i15 = this.maxDistanceFilterMeters;
        int i16 = this.minTotalAscentFilterMeters;
        int i17 = this.maxTotalAscentFilterMeters;
        boolean z14 = this.includeUnratedTrails;
        List<Integer> list = this.trailRatings;
        List<Integer> list2 = this.trailDifficulty;
        List<String> list3 = this.trailTypes;
        List<String> list4 = this.trailFeatures;
        StringBuilder sbJ = e5.j(i14, i15, "TrailFilterAnalyticsDTO(minDistanceFilterMeters=", ", maxDistanceFilterMeters=", ", minTotalAscentFilterMeters=");
        e0.m(i16, i17, ", maxTotalAscentFilterMeters=", ", includeUnratedTrails=", sbJ);
        sbJ.append(z14);
        sbJ.append(", trailRatings=");
        sbJ.append(list);
        sbJ.append(", trailDifficulty=");
        n23.j.z(sbJ, list2, ", trailTypes=", list3, ", trailFeatures=");
        return z.c(sbJ, list4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.minDistanceFilterMeters);
        parcel.writeInt(this.maxDistanceFilterMeters);
        parcel.writeInt(this.minTotalAscentFilterMeters);
        parcel.writeInt(this.maxTotalAscentFilterMeters);
        parcel.writeInt(this.includeUnratedTrails ? 1 : 0);
        List<Integer> list = this.trailRatings;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeInt(((Number) itO.next()).intValue());
            }
        }
        List<Integer> list2 = this.trailDifficulty;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                parcel.writeInt(((Number) itO2.next()).intValue());
            }
        }
        parcel.writeStringList(this.trailTypes);
        parcel.writeStringList(this.trailFeatures);
    }

    public a(int i14, int i15, int i16, int i17, boolean z14, List<Integer> list, List<Integer> list2, List<String> list3, List<String> list4) {
        this.minDistanceFilterMeters = i14;
        this.maxDistanceFilterMeters = i15;
        this.minTotalAscentFilterMeters = i16;
        this.maxTotalAscentFilterMeters = i17;
        this.includeUnratedTrails = z14;
        this.trailRatings = list;
        this.trailDifficulty = list2;
        this.trailTypes = list3;
        this.trailFeatures = list4;
    }
}
