package nr;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnr/e0;", "", "", "duration", "totalReps", "", "Lnr/b0;", "exercises", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b0> f127034c;

    public e0(String str, String str2, List<b0> list) {
        str.getClass();
        str2.getClass();
        this.f127032a = str;
        this.f127033b = str2;
        this.f127034c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127032a, e0Var.f127032a) && p005kotlin.jvm.internal.s.g(this.f127033b, e0Var.f127033b) && p005kotlin.jvm.internal.s.g(this.f127034c, e0Var.f127034c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f127032a.hashCode() * 31, 31, this.f127033b);
        List<b0> list = this.f127034c;
        return iJ + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return u62.z.c(p6.b.i("ExerciseRound(duration=", this.f127032a, ", totalReps=", this.f127033b, ", exercises="), this.f127034c, ")");
    }

    public /* synthetic */ e0(String str, String str2, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : list);
    }
}
