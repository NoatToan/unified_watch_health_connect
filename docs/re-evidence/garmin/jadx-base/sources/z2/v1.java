package z2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lz2/v1;", "Lz2/y0;", "", "isStartHandle", "", "startSlot", "endSlot", "Lz2/b0;", "previousSelection", "Lz2/z;", "info", "<init>", "(ZIILz2/b0;Lz2/z;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v1 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f201819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f201820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f201821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f201822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f201823e;

    static {
        new a(null);
    }

    public v1(boolean z14, int i14, int i15, b0 b0Var, z zVar) {
        this.f201819a = z14;
        this.f201820b = i14;
        this.f201821c = i15;
        this.f201822d = b0Var;
        this.f201823e = zVar;
    }

    @Override // z2.y0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF201819a() {
        return this.f201819a;
    }

    @Override // z2.y0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final z getF201823e() {
        return this.f201823e;
    }

    @Override // z2.y0
    public final g c() {
        int i14 = this.f201820b;
        int i15 = this.f201821c;
        if (i14 < i15) {
            return g.NOT_CROSSED;
        }
        return i14 > i15 ? g.CROSSED : this.f201823e.b();
    }

    @Override // z2.y0
    public final z d() {
        return this.f201823e;
    }

    @Override // z2.y0
    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF201821c() {
        return this.f201821c;
    }

    @Override // z2.y0
    public final void f(e23.l<? super z, Unit> lVar) {
    }

    @Override // z2.y0
    /* JADX INFO: renamed from: g, reason: from getter */
    public final b0 getF201822d() {
        return this.f201822d;
    }

    @Override // z2.y0
    public final int getSize() {
        return 1;
    }

    @Override // z2.y0
    public final z h() {
        return this.f201823e;
    }

    @Override // z2.y0
    public final z i() {
        return this.f201823e;
    }

    @Override // z2.y0
    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getF201820b() {
        return this.f201820b;
    }

    @Override // z2.y0
    public final boolean k(y0 y0Var) {
        if (this.f201822d == null || y0Var == null || !(y0Var instanceof v1)) {
            return true;
        }
        v1 v1Var = (v1) y0Var;
        if (this.f201820b != v1Var.f201820b || this.f201821c != v1Var.f201821c || this.f201819a != v1Var.f201819a) {
            return true;
        }
        z zVar = v1Var.f201823e;
        z zVar2 = this.f201823e;
        return (zVar2.f201848a == zVar.f201848a && zVar2.f201850c == zVar.f201850c && zVar2.f201851d == zVar.f201851d) ? false : true;
    }

    @Override // z2.y0
    public final p1.m0 l(b0 b0Var) {
        boolean z14 = b0Var.f201525c;
        b0.a aVar = b0Var.f201524b;
        b0.a aVar2 = b0Var.f201523a;
        if ((!z14 && aVar2.f201527b > aVar.f201527b) || (z14 && aVar2.f201527b <= aVar.f201527b)) {
            b0Var = b0.a(b0Var, null, null, !z14, 3);
        }
        long j8 = this.f201823e.f201848a;
        p1.m0 m0Var = p1.w.f134861a;
        p1.m0 m0Var2 = new p1.m0(0, 1, null);
        m0Var2.h(j8, b0Var);
        return m0Var2;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f201819a + ", crossed=" + c() + ", info=\n\t" + this.f201823e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz2/v1$a;", "", "<init>", "()V", "", "DEFAULT_SLOT", "I", "", "DEFAULT_SELECTABLE_ID", "J", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
