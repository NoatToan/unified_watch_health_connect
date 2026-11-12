package h5;

import kotlin.a4;
import kotlin.h4;
import kotlin.m3;
import kotlin.q3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface o1 extends b5.n0 {
    public static final a W = a.f81929a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/o1$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f81929a = new a();

        private a() {
        }
    }

    public interface b {
        void h();
    }

    default void A(int i14, e0 e0Var) {
    }

    void B(e0 e0Var, boolean z14, boolean z15);

    void C(e23.a<Unit> aVar);

    void D();

    void E(c.b bVar);

    void F(e0 e0Var);

    default void G(int i14, e0 e0Var) {
    }

    default void I() {
    }

    void J(e0 e0Var);

    void K(e0 e0Var, boolean z14);

    void L(e0 e0Var);

    void c(boolean z14);

    void d(e0 e0Var);

    void e(e0 e0Var);

    kotlin.h getAccessibilityManager();

    i4.i getAutofill();

    i4.n getAutofillManager();

    i4.p getAutofillTree();

    kotlin.o1 getClipboard();

    kotlin.p1 getClipboardManager();

    t13.g getCoroutineContext();

    g6.c getDensity();

    k4.d getDragAndDropManager();

    m4.u getFocusOwner();

    w5.q.b getFontFamilyResolver();

    w5.p.b getFontLoader();

    o4.q0 getGraphicsContext();

    w4.a getHapticFeedBack();

    x4.c getInputModeManager();

    g6.o getLayoutDirection();

    z5.c getLocaleList();

    g5.e getModifierLocalManager();

    default m1 getOutOfFrameExecutor() {
        return null;
    }

    default f5.v1.a getPlacementScope() {
        f5.w1.a aVar = f5.w1.f69151a;
        return new f5.r1(this);
    }

    b5.x getPointerIconService();

    q5.e getRectManager();

    b4.f getRetainedValuesStore();

    e0 getRoot();

    p5.b0 getSemanticsOwner();

    h0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    r1 getSnapshotObserver();

    m3 getSoftwareKeyboardController();

    x5.m0 getTextInputService();

    q3 getTextToolbar();

    a4 getViewConfiguration();

    h4 getWindowInfo();

    default void h() {
    }

    n1 j(e23.p pVar, c1.g gVar, r4.c cVar);

    void k(e0 e0Var, boolean z14, boolean z15, boolean z16);

    void l(e0 e0Var);

    long m(long j8);

    void p();

    void q(e0 e0Var, long j8);

    void r();

    u13.a s(e23.p pVar, v13.c cVar);

    void setShowLayoutBounds(boolean z14);

    default void t() {
    }

    long u(long j8);

    void w(e0 e0Var);

    default void y() {
    }

    default void z(float f14) {
    }
}
