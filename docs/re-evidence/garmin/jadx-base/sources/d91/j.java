package d91;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Ld91/j;", "", "Ld91/q;", "name", "Ld91/r;", "value", "<init>", "(Ld91/q;Ld91/r;)V", "a", "Ld91/q;", "()Ld91/q;", "b", "Ld91/r;", "()Ld91/r;", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final q name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final r value;

    public j(q qVar, r rVar) {
        this.name = qVar;
        this.value = rVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r getValue() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.name == jVar.name && this.value == jVar.value;
    }

    public final int hashCode() {
        q qVar = this.name;
        int iHashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        r rVar = this.value;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        return "MessageLinkParamDTO(name=" + this.name + ", value=" + this.value + ")";
    }
}
