package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lp3/w2;", "N", "Lp3/c;", "root", "<init>", "(Ljava/lang/Object;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w2<N> implements c<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.h0 f135370a = new p1.h0(0, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.q0<Object> f135371b = new p1.q0<>(0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N f135372c;

    static {
        new a(null);
    }

    public w2(N n14) {
        this.f135372c = n14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(c<N> cVar, z3.l lVar) {
        Exception exc;
        int i14;
        p1.h0 h0Var = this.f135370a;
        int i15 = h0Var.f134763b;
        p1.q0 q0Var = new p1.q0(0, 1, null);
        cVar.onBeginChanges();
        int i16 = 0;
        int i17 = 0;
        while (true) {
            p1.q0<Object> q0Var2 = this.f135371b;
            if (i16 >= i15) {
                if (i17 != q0Var2.f134668b) {
                    n.a("Applier operation size mismatch");
                }
                q0Var2.j();
                h0Var.f134763b = 0;
                cVar.onEndChanges();
                return;
            }
            int i18 = i16 + 1;
            try {
                try {
                    switch (h0Var.a(i16)) {
                        case 0:
                            cVar.up();
                            i16 = i18;
                            break;
                        case 1:
                            int i19 = i17 + 1;
                            cVar.down(q0Var2.b(i17));
                            i17 = i19;
                            i16 = i18;
                            break;
                        case 2:
                            int i24 = i16 + 2;
                            i16 += 3;
                            cVar.remove(h0Var.a(i18), h0Var.a(i24));
                            break;
                        case 3:
                            int i25 = i16 + 2;
                            try {
                                int i26 = i16 + 3;
                                try {
                                    i16 += 4;
                                    cVar.move(h0Var.a(i18), h0Var.a(i25), h0Var.a(i26));
                                } catch (Exception e4) {
                                    exc = e4;
                                    i16 = i26;
                                }
                            } catch (Exception e14) {
                                exc = e14;
                                i16 = i25;
                            }
                            break;
                        case 4:
                            cVar.clear();
                            i16 = i18;
                            break;
                        case 5:
                            i16 += 2;
                            i14 = i17 + 1;
                            cVar.insertBottomUp(h0Var.a(i18), q0Var2.b(i17));
                            i17 = i14;
                            break;
                        case 6:
                            i16 += 2;
                            try {
                                i14 = i17 + 1;
                                cVar.insertTopDown(h0Var.a(i18), q0Var2.b(i17));
                                i17 = i14;
                            } catch (Exception e15) {
                                exc = e15;
                            }
                            break;
                        case 7:
                            int i27 = i17 + 1;
                            Object objB = q0Var2.b(i17);
                            objB.getClass();
                            p005kotlin.jvm.internal.y0.e(2, objB);
                            i17 += 2;
                            cVar.apply((e23.p) objB, q0Var2.b(i27));
                            i16 = i18;
                            break;
                        case 8:
                            Object current = cVar.getCurrent();
                            if (current instanceof i) {
                                i iVar = (i) current;
                                if (lVar.f202111f.j(iVar)) {
                                    iVar.k();
                                }
                            }
                            q0Var.g(current);
                            cVar.reuse();
                            i16 = i18;
                            break;
                        default:
                            i16 = i18;
                            break;
                    }
                } catch (Exception e16) {
                    exc = e16;
                    i16 = i18;
                }
            } catch (Throwable th3) {
                cVar.onEndChanges();
                throw th3;
            }
            exc = e15;
            throw new k(q0Var2, q0Var, h0Var, i16 - 1, exc);
        }
    }

    @Override // p3.c
    public final void apply(e23.p<? super N, Object, Unit> pVar, Object obj) {
        this.f135370a.d(7);
        p1.q0<Object> q0Var = this.f135371b;
        q0Var.g(pVar);
        q0Var.g(obj);
    }

    @Override // p3.c
    public final void clear() {
        this.f135370a.d(4);
    }

    @Override // p3.c
    public final void down(N n14) {
        this.f135370a.d(1);
        this.f135371b.g(n14);
    }

    @Override // p3.c
    public final N getCurrent() {
        return this.f135372c;
    }

    @Override // p3.c
    public final void insertBottomUp(int i14, N n14) {
        p1.h0 h0Var = this.f135370a;
        h0Var.d(5);
        h0Var.d(i14);
        this.f135371b.g(n14);
    }

    @Override // p3.c
    public final void insertTopDown(int i14, N n14) {
        p1.h0 h0Var = this.f135370a;
        h0Var.d(6);
        h0Var.d(i14);
        this.f135371b.g(n14);
    }

    @Override // p3.c
    public final void move(int i14, int i15, int i16) {
        p1.h0 h0Var = this.f135370a;
        h0Var.d(3);
        h0Var.d(i14);
        h0Var.d(i15);
        h0Var.d(i16);
    }

    @Override // p3.c
    public final void remove(int i14, int i15) {
        p1.h0 h0Var = this.f135370a;
        h0Var.d(2);
        h0Var.d(i14);
        h0Var.d(i15);
    }

    @Override // p3.c
    public final void reuse() {
        this.f135370a.d(8);
    }

    @Override // p3.c
    public final void up() {
        this.f135370a.d(0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lp3/w2$a;", "", "<init>", "()V", "", "UP", "I", "DOWN", "REMOVE", "MOVE", "CLEAR", "INSERT_BOTTOM_UP", "INSERT_TOP_DOWN", "APPLY", "REUSE", "RECOMPOSE_PENDING", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
