package b5;

import android.view.MotionEvent;
import h5.c1;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lb5/i0;", "Lb5/g0;", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k0 f15816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f15817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f15819d = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb5/i0$a;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"b5/i0$b", "Lb5/f0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f15824b = a.Unknown;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q f15825c;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "motionEvent", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends p005kotlin.jvm.internal.w implements e23.l<MotionEvent, Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f15828b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i0 i0Var) {
                super(1);
                this.f15828b = i0Var;
            }

            @Override // e23.l
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                int actionMasked = motionEvent2.getActionMasked();
                i0 i0Var = this.f15828b;
                if (actionMasked == 0) {
                    k0 k0Var = i0Var.f15816a;
                    if (k0Var == null) {
                        p005kotlin.jvm.internal.s.m("onTouchEvent");
                        throw null;
                    }
                    b.this.f15824b = ((Boolean) k0Var.invoke(motionEvent2)).booleanValue() ? a.Dispatching : a.NotDispatching;
                } else {
                    k0 k0Var2 = i0Var.f15816a;
                    if (k0Var2 == null) {
                        p005kotlin.jvm.internal.s.m("onTouchEvent");
                        throw null;
                    }
                    k0Var2.invoke(motionEvent2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: b5.i0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "motionEvent", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0223b extends p005kotlin.jvm.internal.w implements e23.l<MotionEvent, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i0 f15829a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0223b(i0 i0Var) {
                super(1);
                this.f15829a = i0Var;
            }

            @Override // e23.l
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                k0 k0Var = this.f15829a.f15816a;
                if (k0Var != null) {
                    k0Var.invoke(motionEvent2);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("onTouchEvent");
                throw null;
            }
        }

        public b() {
        }

        public final void a(q qVar, boolean z14) {
            List<a0> list = qVar.f15870a;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (list.get(i14).b()) {
                    b(qVar);
                    return;
                }
            }
            c1 c1Var = this.f15808a;
            if (c1Var == null) {
                vb.h.z("layoutCoordinates not set");
                return;
            }
            n4.c.f123541b.getClass();
            long jB = c1Var.B(0L);
            i0 i0Var = i0.this;
            t0.b(qVar, jB, new a(i0Var), false);
            if (this.f15824b == a.Dispatching) {
                if (z14) {
                    int size2 = list.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        list.get(i15).a();
                    }
                }
                k kVar = qVar.f15871b;
                if (kVar != null) {
                    kVar.f15834c = !i0Var.f15818c;
                }
            }
        }

        public final void b(q qVar) {
            if (this.f15824b == a.Dispatching) {
                c1 c1Var = this.f15808a;
                if (c1Var == null) {
                    vb.h.z("layoutCoordinates not set");
                    return;
                } else {
                    n4.c.f123541b.getClass();
                    t0.b(qVar, c1Var.B(0L), new C0223b(i0.this), true);
                }
            }
            this.f15824b = a.NotDispatching;
        }
    }

    @Override // b5.g0
    /* JADX INFO: renamed from: O1, reason: from getter */
    public final b getF15819d() {
        return this.f15819d;
    }
}
