package r02;

import b5.a0;
import b5.h0;
import o53.b0;
import o53.d0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.h1;
import p008y1.k3;
import qw0.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo53/l1;", "<anonymous>", "(Lo53/b0;)Lo53/l1;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$detectZoomableGestures$2", f = "ZoomableLayout.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super l1>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f148857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f148858c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$detectZoomableGestures$2$1", f = "ZoomableLayout.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f148860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h0 f148861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f148862d;

        /* JADX INFO: renamed from: r02.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$detectZoomableGestures$2$1$1$1", f = "ZoomableLayout.kt", l = {112}, m = "invokeSuspend", v = 2)
        public static final class C2807a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148863a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f148864b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n4.c f148865c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2807a(m mVar, n4.c cVar, t13.d<? super C2807a> dVar) {
                super(2, dVar);
                this.f148864b = mVar;
                this.f148865c = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2807a(this.f148864b, this.f148865c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2807a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                float fMax;
                long jK;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148863a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    m mVar = this.f148864b;
                    boolean zH = mVar.h();
                    if (zH) {
                        float f14 = mVar.f148905m;
                        r02.b bVar = (r02.b) mVar.f148907o.getF182175a();
                        fMax = Math.max(f14, bVar != null ? bVar.f148829a : 0.0f);
                    } else {
                        fMax = mVar.f148908p;
                    }
                    float f15 = fMax;
                    m mVar2 = this.f148864b;
                    if (zH) {
                        n4.c.f123541b.getClass();
                        jK = 0;
                    } else {
                        jK = n4.c.k(f15, mVar2.b(this.f148865c.f123544a));
                    }
                    this.f148863a = 1;
                    if (m.a(mVar2, f15, jK, this, 4) == aVar) {
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
        public a(h0 h0Var, m mVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f148861c = h0Var;
            this.f148862d = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f148861c, this.f148862d, dVar);
            aVar.f148860b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f148860b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148859a;
            if (i14 == 0) {
                o13.r.b(obj);
                ph1.d dVar = new ph1.d(22, b0Var, this.f148862d);
                this.f148860b = null;
                this.f148859a = 1;
                if (k3.f(this.f148861c, dVar, null, null, this, 14) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$detectZoomableGestures$2$2", f = "ZoomableLayout.kt", l = {126}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f148867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h0 f148868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f148869d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$detectZoomableGestures$2$2$3$1", f = "ZoomableLayout.kt", l = {131}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148870a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f148871b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n4.c f148872c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ n4.c f148873d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ float f148874e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, n4.c cVar, n4.c cVar2, float f14, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f148871b = mVar;
                this.f148872c = cVar;
                this.f148873d = cVar2;
                this.f148874e = f14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f148871b, this.f148872c, this.f148873d, this.f148874e, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148870a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    long j8 = this.f148872c.f123544a;
                    long j14 = this.f148873d.f123544a;
                    this.f148870a = 1;
                    if (this.f148871b.k(j8, j14, this.f148874e, this) == aVar) {
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
        public b(h0 h0Var, m mVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f148868c = h0Var;
            this.f148869d = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f148868c, this.f148869d, dVar);
            bVar.f148867b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f148867b;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148866a;
            if (i14 == 0) {
                o13.r.b(obj);
                m mVar = this.f148869d;
                j jVar = new j(mVar, 0);
                j jVar2 = new j(mVar, 1);
                o72.b bVar = new o72.b(18, mVar, b0Var);
                this.f148867b = null;
                this.f148866a = 1;
                Object objC = h1.c(this.f148868c, new h(jVar, bVar, jVar2, null), this);
                if (objC != obj2) {
                    objC = Unit.INSTANCE;
                }
                if (objC == obj2) {
                    return obj2;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$detectZoomableGestures$2$3", f = "ZoomableLayout.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f148875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f148876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h0 f148877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f148878d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$detectZoomableGestures$2$3$3$1", f = "ZoomableLayout.kt", l = {168, 171}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148879a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f148880b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f148880b = mVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f148880b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
            
                if (r9 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
            
                if (r9.i(r8) == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
            
                return r0;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148879a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    m mVar = this.f148880b;
                    if (mVar.h()) {
                        this.f148879a = 1;
                        c5.e eVar = mVar.f148894b;
                        eVar.getClass();
                        long jA = eVar.a(xy2.b.h(Float.MAX_VALUE, Float.MAX_VALUE));
                        c5.b bVar = eVar.f24464a;
                        c5.d dVar = bVar.f24447a;
                        c5.a[] aVarArr = dVar.f24455d;
                        p13.s.m(0, aVarArr.length, null, aVarArr);
                        dVar.f24456e = 0;
                        c5.d dVar2 = bVar.f24448b;
                        c5.a[] aVarArr2 = dVar2.f24455d;
                        p13.s.m(0, aVarArr2.length, null, aVarArr2);
                        dVar2.f24456e = 0;
                        bVar.f24449c = 0L;
                        Object objC = mVar.c(jA, this);
                        if (objC != aVar) {
                            objC = Unit.INSTANCE;
                        }
                    } else if (Math.abs(mVar.f148902j.getFloatValue()) <= ((int) (mVar.g() & 4294967295L)) * 0.25f) {
                        this.f148879a = 2;
                    }
                } else {
                    if (i14 != 1 && i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$detectZoomableGestures$2$3$4$1", f = "ZoomableLayout.kt", l = {161}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148881a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f148882b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(m mVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f148882b = mVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f148882b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148881a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    this.f148881a = 1;
                    if (this.f148882b.i(this) == aVar) {
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

        /* JADX INFO: renamed from: r02.i$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$detectZoomableGestures$2$3$5$1", f = "ZoomableLayout.kt", l = {149}, m = "invokeSuspend", v = 2)
        public static final class C2808c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f148883a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f148884b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n4.c f148885c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a0 f148886d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2808c(m mVar, n4.c cVar, a0 a0Var, t13.d<? super C2808c> dVar) {
                super(2, dVar);
                this.f148884b = mVar;
                this.f148885c = cVar;
                this.f148886d = a0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2808c(this.f148884b, this.f148885c, this.f148886d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2808c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f148883a;
                m mVar = this.f148884b;
                if (i14 == 0) {
                    o13.r.b(obj);
                    long j8 = this.f148885c.f123544a;
                    this.f148883a = 1;
                    if (mVar.j(j8, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                a0 a0Var = this.f148886d;
                mVar.f148894b.f24464a.a(a0Var.f15749b, a0Var.f15750c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h0 h0Var, m mVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f148877c = h0Var;
            this.f148878d = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = new c(this.f148877c, this.f148878d, dVar);
            cVar.f148876b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f148876b;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148875a;
            if (i14 == 0) {
                o13.r.b(obj);
                m mVar = this.f148878d;
                j jVar = new j(mVar, 2);
                y yVar = new y(mVar, 2);
                k kVar = new k(b0Var, mVar);
                k kVar2 = new k(mVar, b0Var);
                q72.f fVar = new q72.f(mVar, b0Var);
                this.f148876b = null;
                this.f148875a = 1;
                Object objC = h1.c(this.f148877c, new g(mVar, jVar, yVar, fVar, kVar2, kVar, null), this);
                if (objC != obj2) {
                    objC = Unit.INSTANCE;
                }
                if (objC == obj2) {
                    return obj2;
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
    public i(h0 h0Var, m mVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f148857b = h0Var;
        this.f148858c = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f148857b, this.f148858c, dVar);
        iVar.f148856a = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super l1> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f148856a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        d0 d0Var = d0.UNDISPATCHED;
        h0 h0Var = this.f148857b;
        m mVar = this.f148858c;
        ge1.b.T(b0Var, null, d0Var, new a(h0Var, mVar, null), 1);
        ge1.b.T(b0Var, null, d0Var, new b(h0Var, mVar, null), 1);
        return ge1.b.T(b0Var, null, d0Var, new c(h0Var, mVar, null), 1);
    }
}
