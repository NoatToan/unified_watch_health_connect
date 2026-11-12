package fn0;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lfn0/d;", "", "", "Lfn0/e;", "tiles", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tiles")
    private final List<e> tiles;

    public /* synthetic */ d(List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list);
    }

    public final List<e> a() {
        return this.tiles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && s.g(this.tiles, ((d) obj).tiles);
    }

    public final int hashCode() {
        List<e> list = this.tiles;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return k.h("GetHazardsResponseDTO(tiles=", ")", this.tiles);
    }

    public d(List<e> list) {
        this.tiles = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
