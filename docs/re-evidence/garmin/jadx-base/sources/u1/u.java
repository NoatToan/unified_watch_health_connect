package u1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu1/u;", "", "Lg6/f;", "width", "Lo4/w;", "brush", "<init>", "(FLo4/w;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f167683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o4.w f167684b;

    private u(float f14, o4.w wVar) {
        this.f167683a = f14;
        this.f167684b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return g6.f.c(this.f167683a, uVar.f167683a) && p005kotlin.jvm.internal.s.g(this.f167684b, uVar.f167684b);
    }

    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return this.f167684b.hashCode() + (Float.hashCode(this.f167683a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BorderStroke(width=");
        tn.k.l(this.f167683a, ", brush=", sb3);
        sb3.append(this.f167684b);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ u(float f14, o4.w wVar, p005kotlin.jvm.internal.j jVar) {
        this(f14, wVar);
    }
}
