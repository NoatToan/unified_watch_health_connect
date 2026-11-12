package jr;

import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u0019"}, d2 = {"Ljr/i;", "", "", "hasHelp", "", "Ljr/o;", "rows", "", "_type", "Ljr/f;", FirebaseAnalytics.Param.ITEMS, "supportsHelpHint", "<init>", "(ZLjava/util/List;Ljava/lang/String;Ljava/util/List;Z)V", "a", "Z", "b", "()Z", "Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "()Ljava/util/List;", "c", "Ljava/lang/String;", "d", "getSupportsHelpHint", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("help")
    private final boolean hasHelp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rows")
    private final List<o> rows;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private String _type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<f> items;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("supportsHelpHint")
    private final boolean supportsHelpHint;

    public /* synthetic */ i(boolean z14, List list, String str, List list2, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, list, str, (i14 & 8) != 0 ? null : list2, (i14 & 16) != 0 ? false : z15);
    }

    public static i a(i iVar, ArrayList arrayList) {
        boolean z14 = iVar.hasHelp;
        String str = iVar._type;
        List<f> list = iVar.items;
        boolean z15 = iVar.supportsHelpHint;
        iVar.getClass();
        return new i(z14, arrayList, str, list, z15);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasHelp() {
        return this.hasHelp;
    }

    public final j c() {
        j.a aVar = j.f100081b;
        String str = this._type;
        aVar.getClass();
        return j.a.a(str);
    }

    public final List<f> d() {
        return this.items;
    }

    public final List<o> e() {
        return this.rows;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.hasHelp == iVar.hasHelp && p005kotlin.jvm.internal.s.g(this.rows, iVar.rows) && p005kotlin.jvm.internal.s.g(this._type, iVar._type) && p005kotlin.jvm.internal.s.g(this.items, iVar.items) && this.supportsHelpHint == iVar.supportsHelpHint;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasHelp) * 31;
        List<o> list = this.rows;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this._type;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<f> list2 = this.items;
        return Boolean.hashCode(this.supportsHelpHint) + ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        boolean z14 = this.hasHelp;
        List<o> list = this.rows;
        String str = this._type;
        List<f> list2 = this.items;
        boolean z15 = this.supportsHelpHint;
        StringBuilder sb3 = new StringBuilder("ItemDetails(hasHelp=");
        sb3.append(z14);
        sb3.append(", rows=");
        sb3.append(list);
        sb3.append(", _type=");
        e0.o(str, ", items=", ", supportsHelpHint=", sb3, list2);
        return hb.a.k(sb3, z15, ")");
    }

    public i(boolean z14, List<o> list, String str, List<f> list2, boolean z15) {
        this.hasHelp = z14;
        this.rows = list;
        this._type = str;
        this.items = list2;
        this.supportsHelpHint = z15;
    }
}
