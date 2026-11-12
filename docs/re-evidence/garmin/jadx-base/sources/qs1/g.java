package qs1;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqs1/g;", "", "", "Lqs1/f;", "reorderList", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "getReorderList", "()Ljava/util/List;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updatedImageOrderList")
    private final List<f> reorderList;

    public g(List<f> list) {
        list.getClass();
        this.reorderList = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && p005kotlin.jvm.internal.s.g(this.reorderList, ((g) obj).reorderList);
    }

    public final int hashCode() {
        return this.reorderList.hashCode();
    }

    public final String toString() {
        return tn.k.h("ImageReorderRequestDTO(reorderList=", ")", this.reorderList);
    }
}
