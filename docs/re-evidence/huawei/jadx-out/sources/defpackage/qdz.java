package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qdz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dataStatistics")
    private qdt f46044c;

    @SerializedName("indexCardTextInfos")
    private List<qdy> e = new ArrayList();

    public List<qdy> d() {
        return this.e;
    }

    public qdt e() {
        return this.f46044c;
    }

    public String toString() {
        return "IndexCard{dataStatistics=" + this.f46044c + ", indexCardTextInfos=" + this.e + '}';
    }
}
