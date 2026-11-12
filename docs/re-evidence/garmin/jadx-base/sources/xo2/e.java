package xo2;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.MapboxMap;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fo2.p;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u0018"}, d2 = {"Lxo2/e;", "", "", MapboxMap.QFE_LIMIT, MapboxMap.QFE_OFFSET, "Lfo2/p;", "nextPage", "", "Lxo2/g;", "deviceCommits", "", "isEncryptedDataSkipped", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lfo2/p;Ljava/util/List;Z)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "d", "(Ljava/lang/Long;)V", "c", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "()Ljava/util/List;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(MapboxMap.QFE_LIMIT)
    private Long limit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(MapboxMap.QFE_OFFSET)
    private Long offset;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f191801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("results")
    private final List<g> deviceCommits;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f191803e;

    public /* synthetic */ e(Long l14, Long l15, p pVar, List list, boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : pVar, (i14 & 8) != 0 ? new ArrayList() : list, (i14 & 16) != 0 ? false : z14);
    }

    public final List<g> a() {
        return this.deviceCommits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getOffset() {
        return this.offset;
    }

    public final void d(Long l14) {
        this.limit = l14;
    }

    public final void e(Long l14) {
        this.offset = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.limit, eVar.limit) && s.g(this.offset, eVar.offset) && s.g(this.f191801c, eVar.f191801c) && s.g(this.deviceCommits, eVar.deviceCommits) && this.f191803e == eVar.f191803e;
    }

    public final int hashCode() {
        Long l14 = this.limit;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.offset;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        p pVar = this.f191801c;
        return Boolean.hashCode(this.f191803e) + u0.b((iHashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31, 31, this.deviceCommits);
    }

    public final String toString() {
        Long l14 = this.limit;
        Long l15 = this.offset;
        p pVar = this.f191801c;
        List<g> list = this.deviceCommits;
        StringBuilder sbJ = f3.j(l14, l15, "Commits(limit=", ", offset=", ", nextPage=");
        sbJ.append(pVar);
        sbJ.append(", deviceCommits=");
        sbJ.append(list);
        sbJ.append(", isEncryptedDataSkipped=");
        return hb.a.k(sbJ, this.f191803e, ")");
    }

    public e(Long l14, Long l15, p pVar, List<g> list, boolean z14) {
        list.getClass();
        this.limit = l14;
        this.offset = l15;
        this.f191801c = pVar;
        this.deviceCommits = list;
        this.f191803e = z14;
    }

    public e() {
        this(null, null, null, null, false, 31, null);
    }
}
