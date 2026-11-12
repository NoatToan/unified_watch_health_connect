package n72;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln72/q;", "", "Ls5/x0;", TtmlNode.TAG_STYLE, "", "text", "example", "<init>", "(Ls5/x0;Ljava/lang/String;Ljava/lang/String;)V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f124909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124911c;

    public q(x0 x0Var, String str, String str2) {
        x0Var.getClass();
        str.getClass();
        str2.getClass();
        this.f124909a = x0Var;
        this.f124910b = str;
        this.f124911c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f124909a.equals(qVar.f124909a) && this.f124910b.equals(qVar.f124910b) && this.f124911c.equals(qVar.f124911c);
    }

    public final int hashCode() {
        return this.f124911c.hashCode() + wr.g.j(this.f124909a.hashCode() * 31, 31, this.f124910b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TypeExample(style=");
        sb3.append(this.f124909a);
        sb3.append(", text=");
        sb3.append(this.f124910b);
        sb3.append(", example=");
        return am.j.o(this.f124911c, ")", sb3);
    }
}
