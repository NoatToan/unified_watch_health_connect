package er1;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR$\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\fR$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Ler1/a;", "", "", "Ler1/b;", "gestureTutorials", "syncTutorials", "Ler1/c;", "pairTutorials", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gestureTutorials")
    private final List<b> gestureTutorials;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("syncTutorials")
    private final List<b> syncTutorials;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pairTutorials")
    private final List<c> pairTutorials;

    public /* synthetic */ a(List list, List list2, List list3, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2, (i14 & 4) != 0 ? null : list3);
    }

    public final List<b> a() {
        return this.gestureTutorials;
    }

    public final List<c> b() {
        return this.pairTutorials;
    }

    public final List<b> c() {
        return this.syncTutorials;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.gestureTutorials, aVar.gestureTutorials) && s.g(this.syncTutorials, aVar.syncTutorials) && s.g(this.pairTutorials, aVar.pairTutorials);
    }

    public final int hashCode() {
        List<b> list = this.gestureTutorials;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<b> list2 = this.syncTutorials;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<c> list3 = this.pairTutorials;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        List<b> list = this.gestureTutorials;
        List<b> list2 = this.syncTutorials;
        return z.c(f3.k("DeviceTutorialsSetup(gestureTutorials=", ", syncTutorials=", ", pairTutorials=", list, list2), this.pairTutorials, ")");
    }

    public a(List<b> list, List<b> list2, List<c> list3) {
        this.gestureTutorials = list;
        this.syncTutorials = list2;
        this.pairTutorials = list3;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
