package jq2;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljq2/d;", "", "Ljq2/a;", "iconType", "", "name", "", "Ljq2/b;", "locationList", "<init>", "(Ljq2/a;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljq2/a;", "()Ljq2/a;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("iconType")
    private final a iconType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locationList")
    private final List<b> locationList;

    public /* synthetic */ d(a aVar, String str, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? a.None : aVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getIconType() {
        return this.iconType;
    }

    public final List<b> b() {
        return this.locationList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.iconType == dVar.iconType && s.g(this.name, dVar.name) && s.g(this.locationList, dVar.locationList);
    }

    public final int hashCode() {
        int iHashCode = this.iconType.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<b> list = this.locationList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        a aVar = this.iconType;
        String str = this.name;
        List<b> list = this.locationList;
        StringBuilder sb3 = new StringBuilder("TransactionSystem(iconType=");
        sb3.append(aVar);
        sb3.append(", name=");
        sb3.append(str);
        sb3.append(", locationList=");
        return z.c(sb3, list, ")");
    }

    public d(a aVar, String str, List<b> list) {
        aVar.getClass();
        this.iconType = aVar;
        this.name = str;
        this.locationList = list;
    }

    public d() {
        this(null, null, null, 7, null);
    }
}
