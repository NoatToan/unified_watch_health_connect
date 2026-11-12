package v2;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.m2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lv2/v;", "Lh5/x0;", "Lv2/y;", "Lx5/q0;", "transformedText", "Lx5/l0;", "value", "Ll2/b2;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "readOnly", "enabled", "isPassword", "Lx5/c0;", "offsetMapping", "Lz2/h2;", "manager", "Lx5/q;", "imeOptions", "Lm4/b0;", "focusRequester", "<init>", "(Lx5/q0;Lx5/l0;Ll2/b2;ZZZLx5/c0;Lz2/h2;Lx5/q;Lm4/b0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class v extends h5.x0<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5.q0 f175173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x5.l0 f175174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p006l2.b2 f175175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f175176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f175177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f175178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x5.c0 f175179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z2.h2 f175180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x5.q f175181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m4.b0 f175182j;

    public v(x5.q0 q0Var, x5.l0 l0Var, p006l2.b2 b2Var, boolean z14, boolean z15, boolean z16, x5.c0 c0Var, z2.h2 h2Var, x5.q qVar, m4.b0 b0Var) {
        this.f175173a = q0Var;
        this.f175174b = l0Var;
        this.f175175c = b2Var;
        this.f175176d = z14;
        this.f175177e = z15;
        this.f175178f = z16;
        this.f175179g = c0Var;
        this.f175180h = h2Var;
        this.f175181i = qVar;
        this.f175182j = b0Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new y(this.f175173a, this.f175174b, this.f175175c, this.f175176d, this.f175177e, this.f175178f, this.f175179g, this.f175180h, this.f175181i, this.f175182j);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f175173a, vVar.f175173a) && p005kotlin.jvm.internal.s.g(this.f175174b, vVar.f175174b) && p005kotlin.jvm.internal.s.g(this.f175175c, vVar.f175175c) && this.f175176d == vVar.f175176d && this.f175177e == vVar.f175177e && this.f175178f == vVar.f175178f && p005kotlin.jvm.internal.s.g(this.f175179g, vVar.f175179g) && p005kotlin.jvm.internal.s.g(this.f175180h, vVar.f175180h) && p005kotlin.jvm.internal.s.g(this.f175181i, vVar.f175181i) && p005kotlin.jvm.internal.s.g(this.f175182j, vVar.f175182j);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f175182j.hashCode() + ((this.f175181i.hashCode() + ((this.f175180h.hashCode() + ((this.f175179g.hashCode() + q6.f.g(q6.f.g(q6.f.g((this.f175175c.hashCode() + ((this.f175174b.hashCode() + (this.f175173a.hashCode() * 31)) * 31)) * 31, 31, this.f175176d), 31, this.f175177e), 31, this.f175178f)) * 31)) * 31)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f175173a + ", value=" + this.f175174b + ", state=" + this.f175175c + ", readOnly=" + this.f175176d + ", enabled=" + this.f175177e + ", isPassword=" + this.f175178f + ", offsetMapping=" + this.f175179g + ", manager=" + this.f175180h + ", imeOptions=" + this.f175181i + ", focusRequester=" + this.f175182j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        y yVar = (y) cVar;
        boolean z14 = yVar.f175258g;
        boolean z15 = false;
        boolean z16 = z14 && !yVar.f175257f;
        boolean z17 = yVar.f175259h;
        x5.q qVar = yVar.f175262k;
        z2.h2 h2Var = yVar.f175261j;
        boolean z18 = this.f175176d;
        boolean z19 = this.f175177e;
        if (z19 && !z18) {
            z15 = true;
        }
        yVar.f175254c = this.f175173a;
        x5.l0 l0Var = this.f175174b;
        yVar.f175255d = l0Var;
        yVar.f175256e = this.f175175c;
        yVar.f175257f = z18;
        yVar.f175258g = z19;
        yVar.f175260i = this.f175179g;
        z2.h2 h2Var2 = this.f175180h;
        yVar.f175261j = h2Var2;
        x5.q qVar2 = this.f175181i;
        yVar.f175262k = qVar2;
        yVar.f175263l = this.f175182j;
        if (z19 != z14 || z15 != z16 || !p005kotlin.jvm.internal.s.g(qVar2, qVar) || this.f175178f != z17 || !s5.w0.e(l0Var.f188879b)) {
            h5.k.g(yVar).U();
        }
        if (p005kotlin.jvm.internal.s.g(h2Var2, h2Var)) {
            return;
        }
        h2Var2.f201610g = new w(yVar, 0);
    }
}
