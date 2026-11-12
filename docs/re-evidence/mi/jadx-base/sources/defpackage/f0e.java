package defpackage;

import androidx.annotation.CheckResult;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class f0e {
    public static final f0e c = new f0e("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f17259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0e f17260b;

    public f0e(String... strArr) {
        this.f17259a = Arrays.asList(strArr);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public f0e a(String str) {
        f0e f0eVar = new f0e(this);
        f0eVar.f17259a.add(str);
        return f0eVar;
    }

    public final boolean b() {
        List<String> list = this.f17259a;
        return list.get(list.size() - 1).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(String str, int i) {
        if (i >= this.f17259a.size()) {
            return false;
        }
        boolean z = i == this.f17259a.size() - 1;
        String str2 = this.f17259a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f17259a.size() + (-2) && b())) && (str2.equals(str) || str2.equals(Marker.ANY_MARKER));
        }
        if (!z && this.f17259a.get(i + 1).equals(str)) {
            return i == this.f17259a.size() + (-2) || (i == this.f17259a.size() + (-3) && b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.f17259a.size() - 1) {
            return false;
        }
        return this.f17259a.get(i2).equals(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public g0e d() {
        return this.f17260b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int e(String str, int i) {
        if (f(str)) {
            return 0;
        }
        if (this.f17259a.get(i).equals("**")) {
            return (i != this.f17259a.size() - 1 && this.f17259a.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f0e f0eVar = (f0e) obj;
        if (!this.f17259a.equals(f0eVar.f17259a)) {
            return false;
        }
        g0e g0eVar = this.f17260b;
        g0e g0eVar2 = f0eVar.f17260b;
        if (g0eVar != null) {
            return g0eVar.equals(g0eVar2);
        }
        return g0eVar2 == null;
    }

    public final boolean f(String str) {
        return "__container".equals(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean g(String str, int i) {
        if (f(str)) {
            return true;
        }
        if (i >= this.f17259a.size()) {
            return false;
        }
        return this.f17259a.get(i).equals(str) || this.f17259a.get(i).equals("**") || this.f17259a.get(i).equals(Marker.ANY_MARKER);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean h(String str, int i) {
        return "__container".equals(str) || i < this.f17259a.size() - 1 || this.f17259a.get(i).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f17259a.hashCode() * 31;
        g0e g0eVar = this.f17260b;
        return iHashCode + (g0eVar != null ? g0eVar.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public f0e i(g0e g0eVar) {
        f0e f0eVar = new f0e(this);
        f0eVar.f17260b = g0eVar;
        return f0eVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f17259a);
        sb.append(",resolved=");
        sb.append(this.f17260b != null);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public f0e(f0e f0eVar) {
        this.f17259a = new ArrayList(f0eVar.f17259a);
        this.f17260b = f0eVar.f17260b;
    }
}
