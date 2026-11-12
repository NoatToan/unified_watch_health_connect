package p008y1;

import a2.j;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.q;
import h4.r;
import h5.x0;
import kotlin.m2;
import kotlin.v3;
import n4.c;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import q6.f;
import t13.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012(\u0010\u0012\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ly1/z0;", "Lh5/x0;", "Ly1/c1;", "Ly1/d1;", RemoteConfigConstants.ResponseFieldKey.STATE, "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "", "enabled", "La2/j;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lo53/b0;", "Ln4/c;", "Lt13/d;", "", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Ly1/d1;Ly1/b2;ZLa2/j;ZLe23/q;Le23/q;Z)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z0 extends x0<c1> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y0 f193757i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f193758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f193759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f193760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f193761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f193762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q<b0, c, d<? super Unit>, Object> f193763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q<b0, Float, d<? super Unit>, Object> f193764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f193765h;

    static {
        new a(null);
        f193757i = new y0(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z0(d1 d1Var, b2 b2Var, boolean z14, j jVar, boolean z15, q<? super b0, ? super c, ? super d<? super Unit>, ? extends Object> qVar, q<? super b0, ? super Float, ? super d<? super Unit>, ? extends Object> qVar2, boolean z16) {
        this.f193758a = d1Var;
        this.f193759b = b2Var;
        this.f193760c = z14;
        this.f193761d = jVar;
        this.f193762e = z15;
        this.f193763f = qVar;
        this.f193764g = qVar2;
        this.f193765h = z16;
    }

    @Override // h5.x0
    public final r.c create() {
        return new c1(this.f193758a, f193757i, this.f193759b, this.f193760c, this.f193761d, this.f193762e, this.f193763f, this.f193764g, this.f193765h);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return s.g(this.f193758a, z0Var.f193758a) && this.f193759b == z0Var.f193759b && this.f193760c == z0Var.f193760c && s.g(this.f193761d, z0Var.f193761d) && this.f193762e == z0Var.f193762e && s.g(this.f193763f, z0Var.f193763f) && s.g(this.f193764g, z0Var.f193764g) && this.f193765h == z0Var.f193765h;
    }

    @Override // h5.x0
    public final int hashCode() {
        int iG = f.g((this.f193759b.hashCode() + (this.f193758a.hashCode() * 31)) * 31, 31, this.f193760c);
        j jVar = this.f193761d;
        return Boolean.hashCode(this.f193765h) + ((this.f193764g.hashCode() + ((this.f193763f.hashCode() + f.g((iG + (jVar != null ? jVar.hashCode() : 0)) * 31, 31, this.f193762e)) * 31)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "draggable";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f193759b, ModelSourceWrapper.ORIENTATION);
        v3Var.c(Boolean.valueOf(this.f193760c), "enabled");
        v3Var.c(Boolean.valueOf(this.f193765h), "reverseDirection");
        v3Var.c(this.f193761d, "interactionSource");
        v3Var.c(Boolean.valueOf(this.f193762e), "startDragImmediately");
        v3Var.c(this.f193763f, "onDragStarted");
        v3Var.c(this.f193764g, "onDragStopped");
        v3Var.c(this.f193758a, RemoteConfigConstants.ResponseFieldKey.STATE);
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        boolean z14;
        boolean z15;
        c1 c1Var = (c1) cVar;
        d1 d1Var = c1Var.f193134x;
        d1 d1Var2 = this.f193758a;
        if (s.g(d1Var, d1Var2)) {
            z14 = false;
        } else {
            c1Var.f193134x = d1Var2;
            z14 = true;
        }
        b2 b2Var = c1Var.f193135y;
        b2 b2Var2 = this.f193759b;
        if (b2Var != b2Var2) {
            c1Var.f193135y = b2Var2;
            z14 = true;
        }
        boolean z16 = c1Var.C;
        boolean z17 = this.f193765h;
        if (z16 != z17) {
            c1Var.C = z17;
            z15 = true;
        } else {
            z15 = z14;
        }
        c1Var.A = this.f193763f;
        c1Var.B = this.f193764g;
        c1Var.f193136z = this.f193762e;
        c1Var.o2(f193757i, this.f193760c, this.f193761d, b2Var2, z15);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly1/z0$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
