package vf2;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import u62.z;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lvf2/p;", "", "", "name", "nameHandleHash", "uuid", "", "Lvf2/v;", "steps", "Lvf2/o;", "clusters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "d", "getUuid", "Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "()Ljava/util/List;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nameHandleHash")
    private final String nameHandleHash;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private final String uuid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("steps")
    private final List<v> steps;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clusters")
    private final List<o> clusters;

    public p(String str, String str2, String str3, List<v> list, List<o> list2) {
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.name = str;
        this.nameHandleHash = str2;
        this.uuid = str3;
        this.steps = list;
        this.clusters = list2;
    }

    public static p a(p pVar, List list) {
        String str = pVar.name;
        String str2 = pVar.nameHandleHash;
        String str3 = pVar.uuid;
        List<o> list2 = pVar.clusters;
        pVar.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        return new p(str, str2, str3, list, list2);
    }

    public final List<o> b() {
        return this.clusters;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNameHandleHash() {
        return this.nameHandleHash;
    }

    public final List<v> e() {
        return this.steps;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.name, pVar.name) && p005kotlin.jvm.internal.s.g(this.nameHandleHash, pVar.nameHandleHash) && p005kotlin.jvm.internal.s.g(this.uuid, pVar.uuid) && p005kotlin.jvm.internal.s.g(this.steps, pVar.steps) && p005kotlin.jvm.internal.s.g(this.clusters, pVar.clusters);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameHandleHash;
        return this.clusters.hashCode() + u0.b(wr.g.j((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.uuid), 31, this.steps);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.nameHandleHash;
        String str3 = this.uuid;
        List<v> list = this.steps;
        List<o> list2 = this.clusters;
        StringBuilder sbI = p6.b.i("WorkoutDataDTO(name=", str, ", nameHandleHash=", str2, ", uuid=");
        e0.o(str3, ", steps=", ", clusters=", sbI, list);
        return z.c(sbI, list2, ")");
    }

    public /* synthetic */ p(String str, String str2, String str3, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, str3, list, list2);
    }
}
