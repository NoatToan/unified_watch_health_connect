package u1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lu1/p;", "", "Lo4/v0;", "imageBitmap", "Lo4/y;", "canvas", "Lq4/a;", "canvasDrawScope", "Lo4/f1;", "borderPath", "<init>", "(Lo4/v0;Lo4/y;Lq4/a;Lo4/f1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o4.v0 f167650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o4.y f167651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q4.a f167652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o4.f1 f167653d;

    public /* synthetic */ p(o4.v0 v0Var, o4.y yVar, q4.a aVar, o4.f1 f1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : v0Var, (i14 & 2) != 0 ? null : yVar, (i14 & 4) != 0 ? null : aVar, (i14 & 8) != 0 ? null : f1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.f167650a, pVar.f167650a) && p005kotlin.jvm.internal.s.g(this.f167651b, pVar.f167651b) && p005kotlin.jvm.internal.s.g(this.f167652c, pVar.f167652c) && p005kotlin.jvm.internal.s.g(this.f167653d, pVar.f167653d);
    }

    public final int hashCode() {
        o4.v0 v0Var = this.f167650a;
        int iHashCode = (v0Var == null ? 0 : v0Var.hashCode()) * 31;
        o4.y yVar = this.f167651b;
        int iHashCode2 = (iHashCode + (yVar == null ? 0 : yVar.hashCode())) * 31;
        q4.a aVar = this.f167652c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        o4.f1 f1Var = this.f167653d;
        return iHashCode3 + (f1Var != null ? f1Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f167650a + ", canvas=" + this.f167651b + ", canvasDrawScope=" + this.f167652c + ", borderPath=" + this.f167653d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public p(o4.v0 v0Var, o4.y yVar, q4.a aVar, o4.f1 f1Var) {
        this.f167650a = v0Var;
        this.f167651b = yVar;
        this.f167652c = aVar;
        this.f167653d = f1Var;
    }

    public p() {
        this(null, null, null, null, 15, null);
    }
}
