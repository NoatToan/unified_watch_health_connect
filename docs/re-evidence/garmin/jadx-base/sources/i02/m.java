package i02;

import ch.qos.logback.core.joran.action.Action;
import f2.p0;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u007f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Li02/m;", "Li02/p;", "Lf2/m;", "Lf2/p0;", "gridState", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "", "maxScrollPerFrame", "Lkotlin/Function2;", "Li02/f;", "", "onMove", "", "canDragOver", "", "onDragEnd", "Li02/b;", "dragCancelledAnimation", "<init>", "(Lf2/p0;Lo53/b0;FLe23/p;Le23/p;Le23/p;Li02/b;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends p<f2.m> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f86874s;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p0 f86875r;

    static {
        new a(null);
        f86874s = 8;
    }

    public /* synthetic */ m(p0 p0Var, b0 b0Var, float f14, e23.p pVar, e23.p pVar2, e23.p pVar3, b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(p0Var, b0Var, f14, pVar, (i14 & 16) != 0 ? null : pVar2, (i14 & 32) != 0 ? null : pVar3, (i14 & 64) != 0 ? new u(0.0f, 1, null) : bVar);
    }

    @Override // i02.p
    public final int c(f2.m mVar) {
        f2.m mVar2 = mVar;
        mVar2.getClass();
        long f68169v = mVar2.getF68169v();
        g6.k.a aVar = g6.k.f76003b;
        return ((int) (f68169v & 4294967295L)) + ((int) (mVar2.getF68168u() & 4294967295L));
    }

    @Override // i02.p
    public final int i() {
        return this.f86875r.g();
    }

    @Override // i02.p
    public final int j() {
        return this.f86875r.h();
    }

    @Override // i02.p
    public final int k(f2.m mVar) {
        return (int) (mVar.getF68168u() & 4294967295L);
    }

    @Override // i02.p
    public final int l(f2.m mVar) {
        f2.m mVar2 = mVar;
        mVar2.getClass();
        return mVar2.getF62559a();
    }

    @Override // i02.p
    public final Object m(f2.m mVar) {
        f2.m mVar2 = mVar;
        mVar2.getClass();
        return mVar2.getF62570l();
    }

    @Override // i02.p
    public final int n(f2.m mVar) {
        f2.m mVar2 = mVar;
        mVar2.getClass();
        long f68169v = mVar2.getF68169v();
        g6.k.a aVar = g6.k.f76003b;
        return (int) (f68169v >> 32);
    }

    @Override // i02.p
    public final int o(f2.m mVar) {
        f2.m mVar2 = mVar;
        mVar2.getClass();
        long f68169v = mVar2.getF68169v();
        g6.k.a aVar = g6.k.f76003b;
        return ((int) (f68169v >> 32)) + ((int) (mVar2.getF68168u() >> 32));
    }

    @Override // i02.p
    public final int p(f2.m mVar) {
        f2.m mVar2 = mVar;
        mVar2.getClass();
        long f68169v = mVar2.getF68169v();
        g6.k.a aVar = g6.k.f76003b;
        return (int) (f68169v & 4294967295L);
    }

    @Override // i02.p
    public final int q() {
        return this.f86875r.i().getF68338o();
    }

    @Override // i02.p
    public final int r() {
        return this.f86875r.i().getF68337n();
    }

    @Override // i02.p
    public final List<f2.m> s() {
        return this.f86875r.i().e();
    }

    @Override // i02.p
    public final int t(f2.m mVar) {
        return (int) (mVar.getF68168u() >> 32);
    }

    @Override // i02.p
    public final boolean u() {
        return this.f86875r.i().getF68341r() == b2.Vertical;
    }

    @Override // i02.p
    public final Object x(int i14, int i15, v13.i iVar) {
        Object objJ = this.f86875r.j(i14, i15, iVar);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li02/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p0 p0Var, b0 b0Var, float f14, e23.p<? super f, ? super f, Integer> pVar, e23.p<? super f, ? super f, Boolean> pVar2, e23.p<? super Integer, ? super Integer, Unit> pVar3, b bVar) {
        super(b0Var, f14, pVar, pVar2, pVar3, bVar);
        p0Var.getClass();
        b0Var.getClass();
        pVar.getClass();
        bVar.getClass();
        this.f86875r = p0Var;
    }
}
