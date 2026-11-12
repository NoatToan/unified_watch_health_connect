package l3;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll3/k0;", "", "", "patternWithDelimiters", "", TtmlNode.RUBY_DELIMITER, "<init>", "(Ljava/lang/String;C)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f109297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109298c;

    public k0(String str, char c14) {
        this.f109296a = str;
        this.f109297b = c14;
        this.f109298c = d53.u.v(str, String.valueOf(c14), "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return p005kotlin.jvm.internal.s.g(this.f109296a, k0Var.f109296a) && this.f109297b == k0Var.f109297b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f109297b) + (this.f109296a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f109296a + ", delimiter=" + this.f109297b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
