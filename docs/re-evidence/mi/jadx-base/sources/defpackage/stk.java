package defpackage;

import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class stk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33978b;
    public boolean c;

    public stk(String str, String str2) {
        this.f33978b = str;
        this.f33977a = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f33978b, ((stk) obj).f33978b);
    }

    public int hashCode() {
        return Objects.hash(this.f33978b, Boolean.valueOf(this.c));
    }

    public String toString() {
        return "ReturnReasonEntry{reasonText='" + this.f33978b + "', isSelected=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
