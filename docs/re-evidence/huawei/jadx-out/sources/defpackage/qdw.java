package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qdw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("coreCardIds")
    private List<Integer> f46038c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("topCardIds")
    private List<Integer> f46037b = new ArrayList();

    @SerializedName("domainTopCardIds")
    private List<qdx> e = new ArrayList();

    @SerializedName("domainCards")
    private List<qdq> d = new ArrayList();

    public List<Integer> b() {
        return this.f46037b;
    }

    public List<qdx> d() {
        return this.e;
    }

    public List<qdq> a() {
        return this.d;
    }

    public String toString() {
        return "Highlights{mCoreCardIdList=" + this.f46038c + ", mTopCardIdList=" + this.f46037b + ", mDomainTopCardIdList=" + this.e + ", mDomainCardList=" + this.d + '}';
    }
}
