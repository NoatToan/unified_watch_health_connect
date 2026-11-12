package o62;

import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo62/j;", "", "Lo62/v0;", "weightData", "Lo62/i;", "editMode", "", "manualInput", "benchmarkPercentageInput", "<init>", "(Lo62/v0;Lo62/i;Ljava/lang/String;Ljava/lang/String;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f129687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f129688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f129689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f129690d;

    public j(v0 v0Var, i iVar, String str, String str2) {
        v0Var.getClass();
        iVar.getClass();
        str.getClass();
        str2.getClass();
        this.f129687a = v0Var;
        this.f129688b = iVar;
        this.f129689c = str;
        this.f129690d = str2;
    }

    public static j a(j jVar, v0 v0Var, i iVar, String str, String str2, int i14) {
        if ((i14 & 1) != 0) {
            v0Var = jVar.f129687a;
        }
        if ((i14 & 2) != 0) {
            iVar = jVar.f129688b;
        }
        if ((i14 & 4) != 0) {
            str = jVar.f129689c;
        }
        if ((i14 & 8) != 0) {
            str2 = jVar.f129690d;
        }
        jVar.getClass();
        v0Var.getClass();
        iVar.getClass();
        str.getClass();
        str2.getClass();
        return new j(v0Var, iVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f129687a, jVar.f129687a) && this.f129688b == jVar.f129688b && p005kotlin.jvm.internal.s.g(this.f129689c, jVar.f129689c) && p005kotlin.jvm.internal.s.g(this.f129690d, jVar.f129690d);
    }

    public final int hashCode() {
        return this.f129690d.hashCode() + wr.g.j((this.f129688b.hashCode() + (this.f129687a.hashCode() * 31)) * 31, 31, this.f129689c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EditWeightUiState(weightData=");
        sb3.append(this.f129687a);
        sb3.append(", editMode=");
        sb3.append(this.f129688b);
        sb3.append(", manualInput=");
        return e5.h(sb3, this.f129689c, ", benchmarkPercentageInput=", this.f129690d, ")");
    }

    public /* synthetic */ j(v0 v0Var, i iVar, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(v0Var, iVar, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? "" : str2);
    }
}
