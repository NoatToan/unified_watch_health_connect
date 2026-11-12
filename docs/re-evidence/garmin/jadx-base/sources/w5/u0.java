package w5;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lw5/u0;", "", "Lw5/q;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Lw5/f0;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Lw5/b0;", TtmlNode.ATTR_TTS_FONT_STYLE, "Lw5/c0;", "fontSynthesis", "resourceLoaderCacheKey", "<init>", "(Lw5/q;Lw5/f0;IILjava/lang/Object;Lkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f182166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f182167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f182168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f182169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f182170e;

    private u0(q qVar, f0 f0Var, int i14, int i15, Object obj) {
        this.f182166a = qVar;
        this.f182167b = f0Var;
        this.f182168c = i14;
        this.f182169d = i15;
        this.f182170e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!p005kotlin.jvm.internal.s.g(this.f182166a, u0Var.f182166a) || !p005kotlin.jvm.internal.s.g(this.f182167b, u0Var.f182167b)) {
            return false;
        }
        int i14 = u0Var.f182168c;
        b0.a aVar = b0.f182070b;
        if (this.f182168c == i14) {
            int i15 = u0Var.f182169d;
            c0.a aVar2 = c0.f182075b;
            return this.f182169d == i15 && p005kotlin.jvm.internal.s.g(this.f182170e, u0Var.f182170e);
        }
        return false;
    }

    public final int hashCode() {
        q qVar = this.f182166a;
        int iHashCode = (((qVar == null ? 0 : qVar.hashCode()) * 31) + this.f182167b.f182107a) * 31;
        b0.a aVar = b0.f182070b;
        int iD = q2.d(this.f182168c, iHashCode, 31);
        c0.a aVar2 = c0.f182075b;
        int iD2 = q2.d(this.f182169d, iD, 31);
        Object obj = this.f182170e;
        return iD2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb3.append(this.f182166a);
        sb3.append(", fontWeight=");
        sb3.append(this.f182167b);
        sb3.append(", fontStyle=");
        int i14 = this.f182168c;
        if (i14 == 0) {
            b0.a aVar = b0.f182070b;
            str = "Normal";
        } else {
            str = i14 == b0.f182071c ? "Italic" : "Invalid";
        }
        sb3.append((Object) str);
        sb3.append(", fontSynthesis=");
        sb3.append((Object) c0.b(this.f182169d));
        sb3.append(", resourceLoaderCacheKey=");
        return wr.g.p(sb3, this.f182170e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ u0(q qVar, f0 f0Var, int i14, int i15, Object obj, p005kotlin.jvm.internal.j jVar) {
        this(qVar, f0Var, i14, i15, obj);
    }
}
