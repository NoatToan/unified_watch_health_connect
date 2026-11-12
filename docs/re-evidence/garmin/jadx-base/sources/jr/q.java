package jr;

import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljr/q;", "", "", "_type", "_label", "", "_badges", "Ljr/r;", "stats", "", "showPolyline", "showExternalLinkIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZ)V", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "d", "g", "()Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "Z", "f", "()Z", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String _type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String _label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badges")
    private final List<String> _badges;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stats")
    private final List<r> stats;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showPolyline")
    private final boolean showPolyline;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showExternalLinkIcon")
    private final boolean showExternalLinkIcon;

    public q(String str, String str2, List<String> list, List<r> list2, boolean z14, boolean z15) {
        str.getClass();
        list2.getClass();
        this._type = str;
        this._label = str2;
        this._badges = list;
        this.stats = list2;
        this.showPolyline = z14;
        this.showExternalLinkIcon = z15;
    }

    public static q a(q qVar, boolean z14) {
        String str = qVar._type;
        String str2 = qVar._label;
        List<String> list = qVar._badges;
        List<r> list2 = qVar.stats;
        boolean z15 = qVar.showPolyline;
        str.getClass();
        list2.getClass();
        return new q(str, str2, list, list2, z15, z14);
    }

    public final ArrayList b() {
        e eVar;
        List<String> list = this._badges;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            e.f100052b.getClass();
            str.getClass();
            e[] eVarArrValues = e.values();
            int length = eVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    eVar = null;
                    break;
                }
                eVar = eVarArrValues[i14];
                if (p005kotlin.jvm.internal.s.g(eVar.f100055a, str)) {
                    break;
                }
                i14++;
            }
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public final l c() {
        l lVar;
        String str = this._label;
        if (str != null) {
            l.f100191b.getClass();
            l[] lVarArrValues = l.values();
            int length = lVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    lVar = null;
                    break;
                }
                lVar = lVarArrValues[i14];
                if (p005kotlin.jvm.internal.s.g(lVar.f100195a, str)) {
                    break;
                }
                i14++;
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return l.ActivityName;
    }

    public final s d() {
        s.a aVar = s.f100448b;
        String str = this._type;
        aVar.getClass();
        str.getClass();
        for (s sVar : s.values()) {
            if (p005kotlin.jvm.internal.s.g(sVar.f100453a, str)) {
                return sVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowExternalLinkIcon() {
        return this.showExternalLinkIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this._type, qVar._type) && p005kotlin.jvm.internal.s.g(this._label, qVar._label) && p005kotlin.jvm.internal.s.g(this._badges, qVar._badges) && p005kotlin.jvm.internal.s.g(this.stats, qVar.stats) && this.showPolyline == qVar.showPolyline && this.showExternalLinkIcon == qVar.showExternalLinkIcon;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowPolyline() {
        return this.showPolyline;
    }

    public final List<r> g() {
        return this.stats;
    }

    public final int hashCode() {
        int iHashCode = this._type.hashCode() * 31;
        String str = this._label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this._badges;
        return Boolean.hashCode(this.showExternalLinkIcon) + q6.f.g(u0.b((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.stats), 31, this.showPolyline);
    }

    public final String toString() {
        String str = this._type;
        String str2 = this._label;
        List<String> list = this._badges;
        List<r> list2 = this.stats;
        boolean z14 = this.showPolyline;
        boolean z15 = this.showExternalLinkIcon;
        StringBuilder sbI = p6.b.i("SectionConfig(_type=", str, ", _label=", str2, ", _badges=");
        n23.j.z(sbI, list, ", stats=", list2, ", showPolyline=");
        return com.airbnb.lottie.animation.keyframe.a.f(", showExternalLinkIcon=", ")", sbI, z14, z15);
    }
}
