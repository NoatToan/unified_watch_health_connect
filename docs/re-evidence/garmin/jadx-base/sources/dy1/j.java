package dy1;

import com.google.firebase.perf.util.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldy1/j;", "", "Lmx1/a;", "benchmarkType", "", "isChecked", Constants.ENABLE_DISABLE, "<init>", "(Lmx1/a;ZZ)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx1.a f61569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f61570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61571c;

    public j(mx1.a aVar, boolean z14, boolean z15) {
        aVar.getClass();
        this.f61569a = aVar;
        this.f61570b = z14;
        this.f61571c = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f61569a == jVar.f61569a && this.f61570b == jVar.f61570b && this.f61571c == jVar.f61571c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61571c) + q6.f.g(this.f61569a.hashCode() * 31, 31, this.f61570b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PrimaryLiftScreenState(benchmarkType=");
        sb3.append(this.f61569a);
        sb3.append(", isChecked=");
        sb3.append(this.f61570b);
        sb3.append(", isEnabled=");
        return hb.a.k(sb3, this.f61571c, ")");
    }
}
