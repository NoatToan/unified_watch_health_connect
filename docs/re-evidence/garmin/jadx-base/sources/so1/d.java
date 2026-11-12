package so1;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lso1/d;", "", "Lso1/e;", "stickerType", "", "Lso1/c;", "stickerList", "<init>", "(Lso1/e;Ljava/util/List;)V", "a", "Lso1/e;", "b", "()Lso1/e;", "setStickerType", "(Lso1/e;)V", "Ljava/util/List;", "()Ljava/util/List;", "setStickerList", "(Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stickerType")
    private e stickerType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stickerList")
    private List<c> stickerList;

    public d(e eVar, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : eVar, (i14 & 2) != 0 ? j0.f134944a : list);
    }

    public final List<c> a() {
        return this.stickerList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getStickerType() {
        return this.stickerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.stickerType == dVar.stickerType && s.g(this.stickerList, dVar.stickerList);
    }

    public final int hashCode() {
        e eVar = this.stickerType;
        return this.stickerList.hashCode() + ((eVar == null ? 0 : eVar.hashCode()) * 31);
    }

    public final String toString() {
        return "StickerGroupDTO(stickerType=" + this.stickerType + ", stickerList=" + this.stickerList + ")";
    }

    public d(e eVar, List<c> list) {
        list.getClass();
        this.stickerType = eVar;
        this.stickerList = list;
    }

    public d() {
        this(null, null, 3, null);
    }
}
