package qs1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqs1/f;", "", "", "curatedImagePk", "", "displayOrder", "<init>", "(JI)V", "a", "J", "getCuratedImagePk", "()J", "b", "I", "getDisplayOrder", "()I", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("curatedImagePk")
    private final long curatedImagePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayOrder")
    private final int displayOrder;

    public f(long j8, int i14) {
        this.curatedImagePk = j8;
        this.displayOrder = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.curatedImagePk == fVar.curatedImagePk && this.displayOrder == fVar.displayOrder;
    }

    public final int hashCode() {
        return Integer.hashCode(this.displayOrder) + (Long.hashCode(this.curatedImagePk) * 31);
    }

    public final String toString() {
        StringBuilder sbW = v.h.w(this.displayOrder, "ImageReorderDTO(curatedImagePk=", ", displayOrder=", this.curatedImagePk);
        sbW.append(")");
        return sbW.toString();
    }
}
