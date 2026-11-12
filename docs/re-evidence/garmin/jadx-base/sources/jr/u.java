package jr;

import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, d2 = {"Ljr/u;", "", "", "_type", "", "supportsDistance", "supportsTimeInZonesHint", "", "Ljr/i;", "excludedCharts", "Ljr/f;", "components", "<init>", "(Ljava/lang/String;ZZLjava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "getSupportsTimeInZonesHint", "d", "Ljava/util/List;", "()Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String _type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("supportsDistance")
    private final boolean supportsDistance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("supportsTimeInZonesHint")
    private final boolean supportsTimeInZonesHint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("excluded")
    private final List<i> excludedCharts;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("components")
    private final List<f> components;

    public u(String str, boolean z14, boolean z15, List<i> list, List<f> list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this._type = str;
        this.supportsDistance = z14;
        this.supportsTimeInZonesHint = z15;
        this.excludedCharts = list;
        this.components = list2;
    }

    public final List<f> a() {
        return this.components;
    }

    public final List<i> b() {
        return this.excludedCharts;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSupportsDistance() {
        return this.supportsDistance;
    }

    public final v d() {
        Object next;
        v.a aVar = v.f100475b;
        String str = this._type;
        aVar.getClass();
        str.getClass();
        Iterator<T> it = v.f100494w.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p005kotlin.jvm.internal.s.g(((v) next).f100495a, str)) {
                return (v) next;
            }
        }
        next = null;
        return (v) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this._type, uVar._type) && this.supportsDistance == uVar.supportsDistance && this.supportsTimeInZonesHint == uVar.supportsTimeInZonesHint && p005kotlin.jvm.internal.s.g(this.excludedCharts, uVar.excludedCharts) && p005kotlin.jvm.internal.s.g(this.components, uVar.components);
    }

    public final int hashCode() {
        return this.components.hashCode() + u0.b(q6.f.g(q6.f.g(this._type.hashCode() * 31, 31, this.supportsDistance), 31, this.supportsTimeInZonesHint), 31, this.excludedCharts);
    }

    public final String toString() {
        String str = this._type;
        boolean z14 = this.supportsDistance;
        boolean z15 = this.supportsTimeInZonesHint;
        List<i> list = this.excludedCharts;
        List<f> list2 = this.components;
        StringBuilder sbD = zl.a.d("Tab(_type=", str, ", supportsDistance=", z14, ", supportsTimeInZonesHint=");
        sbD.append(z15);
        sbD.append(", excludedCharts=");
        sbD.append(list);
        sbD.append(", components=");
        return z.c(sbD, list2, ")");
    }

    public /* synthetic */ u(String str, boolean z14, boolean z15, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, z14, (i14 & 4) != 0 ? false : z15, list, list2);
    }
}
