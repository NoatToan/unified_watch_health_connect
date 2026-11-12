package y8;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ly8/m0;", "", "", "repetitions", "", "Ly8/o0;", "steps", "", "description", "<init>", "(ILjava/util/List;Ljava/lang/String;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f194894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o0> f194895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194896c;

    public m0(int i14, List<o0> list, String str) {
        list.getClass();
        this.f194894a = i14;
        this.f194895b = list;
        this.f194896c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f194894a == m0Var.f194894a && p005kotlin.jvm.internal.s.g(this.f194896c, m0Var.f194896c) && p005kotlin.jvm.internal.s.g(this.f194895b, m0Var.f194895b);
    }

    public final int hashCode() {
        int i14 = this.f194894a * 31;
        String str = this.f194896c;
        return this.f194895b.hashCode() + ((i14 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PlannedExerciseBlock(repetitions=");
        sb3.append(this.f194894a);
        sb3.append(", description=");
        sb3.append(this.f194896c);
        sb3.append(", steps=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f194895b, sb3);
    }

    public /* synthetic */ m0(int i14, List list, String str, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, list, (i15 & 4) != 0 ? null : str);
    }
}
