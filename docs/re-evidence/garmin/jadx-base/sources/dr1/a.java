package dr1;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ldr1/a;", "", "", "pairingMarkerName", "", "Ldr1/b;", "gestureMakers", "", "gestureUnusedGroups", "", "revisitTutorialsAvailable", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pairingMarkerName")
    private final String pairingMarkerName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gestureMakers")
    private final List<b> gestureMakers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gestureUnusedGroups")
    private final List<Integer> gestureUnusedGroups;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("revisitTutorialsAvailable")
    private final Boolean revisitTutorialsAvailable;

    public a(String str, List<b> list, List<Integer> list2, Boolean bool) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.pairingMarkerName = str;
        this.gestureMakers = list;
        this.gestureUnusedGroups = list2;
        this.revisitTutorialsAvailable = bool;
    }

    public final List<b> a() {
        return this.gestureMakers;
    }

    public final List<Integer> b() {
        return this.gestureUnusedGroups;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPairingMarkerName() {
        return this.pairingMarkerName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getRevisitTutorialsAvailable() {
        return this.revisitTutorialsAvailable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.pairingMarkerName, aVar.pairingMarkerName) && s.g(this.gestureMakers, aVar.gestureMakers) && s.g(this.gestureUnusedGroups, aVar.gestureUnusedGroups) && s.g(this.revisitTutorialsAvailable, aVar.revisitTutorialsAvailable);
    }

    public final int hashCode() {
        int iB = u0.b(u0.b(this.pairingMarkerName.hashCode() * 31, 31, this.gestureMakers), 31, this.gestureUnusedGroups);
        Boolean bool = this.revisitTutorialsAvailable;
        return iB + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        String str = this.pairingMarkerName;
        List<b> list = this.gestureMakers;
        List<Integer> list2 = this.gestureUnusedGroups;
        Boolean bool = this.revisitTutorialsAvailable;
        StringBuilder sbG = l2.g("DeviceTutorials(pairingMarkerName=", str, ", gestureMakers=", list, ", gestureUnusedGroups=");
        sbG.append(list2);
        sbG.append(", revisitTutorialsAvailable=");
        sbG.append(bool);
        sbG.append(")");
        return sbG.toString();
    }

    public /* synthetic */ a(String str, List list, List list2, Boolean bool, int i14, j jVar) {
        this(str, list, list2, (i14 & 8) != 0 ? null : bool);
    }
}
