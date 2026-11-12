package z01;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import s5.x0;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz01/a;", "", "Lg6/f;", "width", "", "text", "Ls5/x0;", "textStyle", "<init>", "(FLjava/lang/String;Ls5/x0;Lkotlin/jvm/internal/j;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f200727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f200729c;

    private a(float f14, String str, x0 x0Var) {
        str.getClass();
        x0Var.getClass();
        this.f200727a = f14;
        this.f200728b = str;
        this.f200729c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g6.f.c(this.f200727a, aVar.f200727a) && s.g(this.f200728b, aVar.f200728b) && s.g(this.f200729c, aVar.f200729c);
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return this.f200729c.hashCode() + g.j(Float.hashCode(this.f200727a) * 31, 31, this.f200728b);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("EndLabelData(width=", g6.f.d(this.f200727a), ", text=", this.f200728b, ", textStyle=");
        sbI.append(this.f200729c);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ a(float f14, String str, x0 x0Var, j jVar) {
        this(f14, str, x0Var);
    }
}
