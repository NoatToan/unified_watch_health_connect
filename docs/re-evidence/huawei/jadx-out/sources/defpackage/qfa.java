package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes43.dex */
public class qfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("planInfo")
    private Map<String, List<String>> f46091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("domainInfo")
    private Map<String, List<String>> f46092b;

    public Map<String, List<String>> a() {
        return this.f46091a;
    }

    public void e(Map<String, List<String>> map) {
        this.f46091a = map;
    }

    public Map<String, List<String>> b() {
        return this.f46092b;
    }

    public void c(Map<String, List<String>> map) {
        this.f46092b = map;
    }

    public String toString() {
        return "TaskRelation{planInfo=" + this.f46091a + ", domainInfo=" + this.f46092b + '}';
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qfa)) {
            return false;
        }
        qfa qfaVar = (qfa) obj;
        return Objects.equals(a(), qfaVar.a()) && Objects.equals(b(), qfaVar.b());
    }

    public int hashCode() {
        return Objects.hash(a(), b());
    }
}
