package j70;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR,\u0010\u0005\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b¨\u0006\f"}, d2 = {"Lj70/l;", "", "", "", "labels", "data", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("labels")
    private final List<String> labels;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("data")
    private final List<List<Object>> data;

    /* JADX WARN: Multi-variable type inference failed */
    public l(List<String> list, List<? extends List<? extends Object>> list2) {
        this.labels = list;
        this.data = list2;
    }

    public final List<List<Object>> a() {
        return this.data;
    }

    public final List<String> b() {
        return this.labels;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.labels, lVar.labels) && p005kotlin.jvm.internal.s.g(this.data, lVar.data);
    }

    public final int hashCode() {
        List<String> list = this.labels;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<List<Object>> list2 = this.data;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return c22.t.f("EpochChartDTO(labels=", ", data=", ")", this.labels, this.data);
    }
}
