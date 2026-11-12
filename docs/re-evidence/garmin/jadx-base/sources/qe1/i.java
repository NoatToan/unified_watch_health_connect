package qe1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lqe1/i;", "", "Lqe1/e;", "male", "Lqe1/c;", "female", "<init>", "(Lqe1/e;Lqe1/c;)V", "a", "Lqe1/e;", "b", "()Lqe1/e;", "Lqe1/c;", "()Lqe1/c;", "gcm-running-economy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("MALE")
    private final e male;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FEMALE")
    private final c female;

    public i(e eVar, c cVar) {
        eVar.getClass();
        cVar.getClass();
        this.male = eVar;
        this.female = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getFemale() {
        return this.female;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getMale() {
        return this.male;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.male, iVar.male) && s.g(this.female, iVar.female);
    }

    public final int hashCode() {
        return this.female.hashCode() + (this.male.hashCode() * 31);
    }

    public final String toString() {
        return "RunningEconomyRangesDTO(male=" + this.male + ", female=" + this.female + ")";
    }
}
