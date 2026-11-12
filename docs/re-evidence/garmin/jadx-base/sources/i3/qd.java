package i3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class qd implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cb f89436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.j f89437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.j f89438c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {2437}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f89439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f89440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b5.h0 f89441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ cb f89442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ab f89443e;

        /* JADX INFO: renamed from: i3.qd$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {2438, 2450, 2473}, m = "invokeSuspend")
        public static final class C1738a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f89444a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public a2.a.b f89445b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public p005kotlin.jvm.internal.o0 f89446c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public p005kotlin.jvm.internal.m0 f89447d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f89448e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public /* synthetic */ Object f89449f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ cb f89450g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ ab f89451h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f89452i;

            /* JADX INFO: renamed from: i3.qd$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
            @v13.e(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", l = {2493}, m = "invokeSuspend")
            public static final class C1739a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f89453a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ab f89454b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p005kotlin.jvm.internal.m0 f89455c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a2.a f89456d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1739a(ab abVar, p005kotlin.jvm.internal.m0 m0Var, a2.a aVar, t13.d<? super C1739a> dVar) {
                    super(2, dVar);
                    this.f89454b = abVar;
                    this.f89455c = m0Var;
                    this.f89456d = aVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C1739a(this.f89454b, this.f89455c, this.f89456d, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C1739a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f89453a;
                    if (i14 == 0) {
                        o13.r.b(obj);
                        boolean z14 = this.f89455c.f105804a;
                        ab abVar = this.f89454b;
                        a2.j jVar = z14 ? abVar.f87467b : abVar.f87468c;
                        this.f89453a = 1;
                        if (jVar.b(this.f89456d, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1738a(cb cbVar, ab abVar, o53.b0 b0Var, t13.d<? super C1738a> dVar) {
                super(2, dVar);
                this.f89450g = cbVar;
                this.f89451h = abVar;
                this.f89452i = b0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1738a c1738a = new C1738a(this.f89450g, this.f89451h, this.f89452i, dVar);
                c1738a.f89449f = obj;
                return c1738a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((C1738a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
            /* JADX WARN: Code duplicated, block: B:40:0x010a  */
            /* JADX WARN: Code duplicated, block: B:41:0x0112  */
            /* JADX WARN: Code duplicated, block: B:58:0x017b  */
            /* JADX WARN: Code duplicated, block: B:59:0x0182  */
            /* JADX WARN: Code duplicated, block: B:64:0x01b8  */
            /* JADX WARN: Code duplicated, block: B:67:0x01c2 A[Catch: all -> 0x0027, CancellationException -> 0x01d7, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0020, B:65:0x01ba, B:67:0x01c2, B:68:0x01c8, B:71:0x01d7, B:61:0x0195), top: B:78:0x0010 }] */
            /* JADX WARN: Code duplicated, block: B:68:0x01c8 A[Catch: all -> 0x0027, CancellationException -> 0x01d7, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x0020, B:65:0x01ba, B:67:0x01c2, B:68:0x01c8, B:71:0x01d7, B:61:0x0195), top: B:78:0x0010 }] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                b5.c cVar;
                Object objC;
                b5.c cVar2;
                b5.a0 a0Var;
                char c14;
                float fIntBitsToFloat;
                Object objI;
                p005kotlin.jvm.internal.o0 o0Var;
                a2.a.b bVar;
                p005kotlin.jvm.internal.m0 m0Var;
                o13.p pVar;
                boolean z14;
                cb cbVar;
                float floatValue;
                p005kotlin.jvm.internal.m0 m0Var2;
                a2.a.b bVar2;
                Object objJ;
                kotlin.a4 viewConfiguration;
                int i14;
                float fE;
                a2.a c0002a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = this.f89448e;
                o53.b0 b0Var = this.f89452i;
                ab abVar = this.f89451h;
                cb cbVar2 = this.f89450g;
                try {
                    if (i15 == 0) {
                        o13.r.b(obj);
                        cVar = (b5.c) this.f89449f;
                        this.f89449f = cVar;
                        this.f89448e = 1;
                        objC = p008y1.k3.c(cVar, null, this, 2);
                        if (objC != aVar) {
                        }
                        return aVar;
                    }
                    if (i15 == 1) {
                        cVar = (b5.c) this.f89449f;
                        o13.r.b(obj);
                        objC = obj;
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            m0Var2 = (p005kotlin.jvm.internal.m0) this.f89444a;
                            bVar2 = (a2.a.b) this.f89449f;
                            try {
                                o13.r.b(obj);
                                objJ = obj;
                                if (((Boolean) objJ).booleanValue()) {
                                    c0002a = new a2.a.c(bVar2);
                                } else {
                                    c0002a = new a2.a.C0002a(bVar2);
                                }
                            } catch (CancellationException unused) {
                                c0002a = new a2.a.C0002a(bVar2);
                            }
                            cbVar2.f87754o.setValue(Boolean.FALSE);
                            cbVar2.f87756q.invoke(Boolean.valueOf(m0Var2.f105804a));
                            ge1.b.T(b0Var, null, null, new C1739a(abVar, m0Var2, c0002a, null), 3);
                            return Unit.INSTANCE;
                        }
                        m0Var = this.f89447d;
                        p005kotlin.jvm.internal.o0 o0Var2 = this.f89446c;
                        bVar = this.f89445b;
                        a0Var = (b5.a0) this.f89444a;
                        cVar2 = (b5.c) this.f89449f;
                        o13.r.b(obj);
                        o0Var = o0Var2;
                        c14 = ' ';
                        objI = obj;
                        pVar = (o13.p) objI;
                        if (pVar != null) {
                            viewConfiguration = cVar2.getViewConfiguration();
                            i14 = a0Var.f15756i;
                            float f14 = l3.n0.f109366a;
                            b5.m0.f15849b.getClass();
                            if (i14 == b5.m0.f15851d) {
                                fE = viewConfiguration.e() * l3.n0.f109366a;
                            } else {
                                fE = viewConfiguration.e();
                            }
                            if (Math.abs(cbVar2.f87753n.getFloatValue() - o0Var.f105806a) < fE && Math.abs(cbVar2.f87752m.getFloatValue() - o0Var.f105806a) < fE) {
                                float fFloatValue = ((Number) pVar.f128595b).floatValue();
                                m0Var.f105804a = ((Boolean) cbVar2.f87755p.getF182175a()).booleanValue() ? fFloatValue < 0.0f : fFloatValue >= 0.0f;
                                o0Var.f105806a = Float.intBitsToFloat((int) (b5.r.f((b5.a0) pVar.f128594a, false) >> c14)) + o0Var.f105806a;
                            }
                        }
                        z14 = m0Var.f105804a;
                        float f15 = o0Var.f105806a;
                        cbVar = abVar.f87466a;
                        if (z14) {
                            floatValue = cbVar.f87752m.getFloatValue();
                        } else {
                            floatValue = cbVar.f87753n.getFloatValue();
                        }
                        cbVar.e(f15 - floatValue, z14);
                        ge1.b.T(b0Var, null, null, new za(abVar, z14, bVar, null), 3);
                        try {
                            cbVar2.f87754o.setValue(Boolean.TRUE);
                            long j8 = a0Var.f15748a;
                            hy.h hVar = new hy.h(7, cbVar2, m0Var);
                            this.f89449f = bVar;
                            this.f89444a = m0Var;
                            this.f89445b = null;
                            this.f89446c = null;
                            this.f89447d = null;
                            this.f89448e = 3;
                            objJ = p008y1.m0.j(cVar2, j8, hVar, this);
                            if (objJ != aVar) {
                                m0Var2 = m0Var;
                                bVar2 = bVar;
                                if (((Boolean) objJ).booleanValue()) {
                                    c0002a = new a2.a.c(bVar2);
                                } else {
                                    c0002a = new a2.a.C0002a(bVar2);
                                }
                                cbVar2.f87754o.setValue(Boolean.FALSE);
                                cbVar2.f87756q.invoke(Boolean.valueOf(m0Var2.f105804a));
                                ge1.b.T(b0Var, null, null, new C1739a(abVar, m0Var2, c0002a, null), 3);
                                return Unit.INSTANCE;
                            }
                            return aVar;
                        } catch (CancellationException unused2) {
                            m0Var2 = m0Var;
                            bVar2 = bVar;
                            c0002a = new a2.a.C0002a(bVar2);
                        }
                    }
                    cVar2 = cVar;
                    a0Var = (b5.a0) objC;
                    a2.a.b bVar3 = new a2.a.b();
                    p005kotlin.jvm.internal.o0 o0Var3 = new p005kotlin.jvm.internal.o0();
                    if (((Boolean) cbVar2.f87755p.getF182175a()).booleanValue()) {
                        c14 = ' ';
                        fIntBitsToFloat = cbVar2.f87751l.getIntValue() - Float.intBitsToFloat((int) (a0Var.f15750c >> 32));
                    } else {
                        c14 = ' ';
                        fIntBitsToFloat = Float.intBitsToFloat((int) (a0Var.f15750c >> 32));
                    }
                    o0Var3.f105806a = fIntBitsToFloat;
                    cb cbVar3 = abVar.f87466a;
                    int iCompare = Float.compare(Math.abs(cbVar3.f87752m.getFloatValue() - fIntBitsToFloat), Math.abs(cbVar3.f87753n.getFloatValue() - fIntBitsToFloat));
                    p005kotlin.jvm.internal.m0 m0Var3 = new p005kotlin.jvm.internal.m0();
                    m0Var3.f105804a = iCompare == 0 ? cbVar2.f87752m.getFloatValue() > o0Var3.f105806a : iCompare < 0;
                    long j14 = a0Var.f15748a;
                    int i16 = a0Var.f15756i;
                    this.f89449f = cVar2;
                    this.f89444a = a0Var;
                    this.f89445b = bVar3;
                    this.f89446c = o0Var3;
                    this.f89447d = m0Var3;
                    this.f89448e = 2;
                    objI = kd.i(cVar2, j14, i16, this);
                    if (objI != aVar) {
                        o0Var = o0Var3;
                        bVar = bVar3;
                        m0Var = m0Var3;
                        pVar = (o13.p) objI;
                        if (pVar != null) {
                            viewConfiguration = cVar2.getViewConfiguration();
                            i14 = a0Var.f15756i;
                            float f16 = l3.n0.f109366a;
                            b5.m0.f15849b.getClass();
                            if (i14 == b5.m0.f15851d) {
                                fE = viewConfiguration.e() * l3.n0.f109366a;
                            } else {
                                fE = viewConfiguration.e();
                            }
                            if (Math.abs(cbVar2.f87753n.getFloatValue() - o0Var.f105806a) < fE) {
                                float fFloatValue2 = ((Number) pVar.f128595b).floatValue();
                                m0Var.f105804a = ((Boolean) cbVar2.f87755p.getF182175a()).booleanValue() ? fFloatValue2 < 0.0f : fFloatValue2 >= 0.0f;
                                o0Var.f105806a = Float.intBitsToFloat((int) (b5.r.f((b5.a0) pVar.f128594a, false) >> c14)) + o0Var.f105806a;
                            }
                        }
                        z14 = m0Var.f105804a;
                        float f17 = o0Var.f105806a;
                        cbVar = abVar.f87466a;
                        if (z14) {
                            floatValue = cbVar.f87752m.getFloatValue();
                        } else {
                            floatValue = cbVar.f87753n.getFloatValue();
                        }
                        cbVar.e(f17 - floatValue, z14);
                        ge1.b.T(b0Var, null, null, new za(abVar, z14, bVar, null), 3);
                        cbVar2.f87754o.setValue(Boolean.TRUE);
                        long j15 = a0Var.f15748a;
                        hy.h hVar2 = new hy.h(7, cbVar2, m0Var);
                        this.f89449f = bVar;
                        this.f89444a = m0Var;
                        this.f89445b = null;
                        this.f89446c = null;
                        this.f89447d = null;
                        this.f89448e = 3;
                        objJ = p008y1.m0.j(cVar2, j15, hVar2, this);
                        if (objJ != aVar) {
                            m0Var2 = m0Var;
                            bVar2 = bVar;
                            if (((Boolean) objJ).booleanValue()) {
                                c0002a = new a2.a.c(bVar2);
                            } else {
                                c0002a = new a2.a.C0002a(bVar2);
                            }
                            cbVar2.f87754o.setValue(Boolean.FALSE);
                            cbVar2.f87756q.invoke(Boolean.valueOf(m0Var2.f105804a));
                            ge1.b.T(b0Var, null, null, new C1739a(abVar, m0Var2, c0002a, null), 3);
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar;
                } catch (Throwable th3) {
                    cbVar2.f87754o.setValue(Boolean.FALSE);
                    throw th3;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b5.h0 h0Var, cb cbVar, ab abVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f89441c = h0Var;
            this.f89442d = cbVar;
            this.f89443e = abVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f89441c, this.f89442d, this.f89443e, dVar);
            aVar.f89440b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f89439a;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f89440b;
                C1738a c1738a = new C1738a(this.f89442d, this.f89443e, b0Var, null);
                this.f89439a = 1;
                if (p008y1.h1.c(this.f89441c, c1738a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public qd(cb cbVar, a2.j jVar, a2.j jVar2) {
        this.f89436a = cbVar;
        this.f89437b = jVar;
        this.f89438c = jVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        a2.j jVar = this.f89437b;
        a2.j jVar2 = this.f89438c;
        cb cbVar = this.f89436a;
        Object objE = o53.c0.e(new a(h0Var, cbVar, new ab(cbVar, jVar, jVar2), null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }
}
