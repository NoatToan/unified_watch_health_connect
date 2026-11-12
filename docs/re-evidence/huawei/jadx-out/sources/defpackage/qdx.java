package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qdx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("name")
    private String f46039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cardId")
    private List<Integer> f46040c = new ArrayList();

    public String c() {
        return this.f46039b;
    }

    public List<Integer> a() {
        return this.f46040c;
    }

    public String toString() {
        return "DomainTopCardId{mName=" + this.f46039b + ", mCardIdList=" + this.f46040c + '}';
    }
}
