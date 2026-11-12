package p008y1;

import b5.a0;
import b5.h0;
import b5.s;
import e23.l;
import e23.p;
import e23.q;
import lc.u0;
import n4.c;
import o13.r;
import o53.b0;
import o53.c2;
import o53.d0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u1.g0;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend", v = 1)
public final class o3 extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f193471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f193472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q<c2, c, d<? super Unit>, Object> f193473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l<c, Unit> f193474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l<c, Unit> f193475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l<c, Unit> f193476g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.h implements p<b5.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f193477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f193478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a0 f193479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f193480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f193481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b0 f193482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q<c2, n4.c, t13.d<? super Unit>, Object> f193483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ l<n4.c, Unit> f193484h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ l<n4.c, Unit> f193485i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ l<n4.c, Unit> f193486j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ f2 f193487k;

        /* JADX INFO: renamed from: y1.o3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {110}, m = "invokeSuspend", v = 1)
        public static final class C3613a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f193488a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q<c2, n4.c, t13.d<? super Unit>, Object> f193489b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f2 f193490c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a0 f193491d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3613a(q<? super c2, ? super n4.c, ? super t13.d<? super Unit>, ? extends Object> qVar, f2 f2Var, a0 a0Var, t13.d<? super C3613a> dVar) {
                super(2, dVar);
                this.f193489b = qVar;
                this.f193490c = f2Var;
                this.f193491d = a0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3613a(this.f193489b, this.f193490c, this.f193491d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3613a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193488a;
                if (i14 == 0) {
                    r.b(obj);
                    n4.c cVarA = n4.c.a(this.f193491d.f15750c);
                    this.f193488a = 1;
                    if (this.f193489b.invoke(this.f193490c, cVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f2 f193492a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f2 f2Var, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f193492a = f2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f193492a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f193492a.f();
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f2 f193493a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(f2 f2Var, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f193493a = f2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f193493a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f193493a.e();
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f2 f193494a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(f2 f2Var, t13.d<? super d> dVar) {
                super(2, dVar);
                this.f193494a = f2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new d(this.f193494a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f193494a.f();
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {157, 158}, m = "invokeSuspend", v = 1)
        public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f193495a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l1 f193496b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f2 f193497c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(l1 l1Var, f2 f2Var, t13.d<? super e> dVar) {
                super(2, dVar);
                this.f193496b = l1Var;
                this.f193497c = f2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new e(this.f193496b, this.f193497c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
            
                if (r4.f193497c.o(r4) == r0) goto L15;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193495a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f193495a = 1;
                    if (this.f193496b.P(this) != aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
                this.f193495a = 2;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {161}, m = "invokeSuspend", v = 1)
        public static final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f193498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q<c2, n4.c, t13.d<? super Unit>, Object> f193499b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f2 f193500c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a0 f193501d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(q<? super c2, ? super n4.c, ? super t13.d<? super Unit>, ? extends Object> qVar, f2 f2Var, a0 a0Var, t13.d<? super f> dVar) {
                super(2, dVar);
                this.f193499b = qVar;
                this.f193500c = f2Var;
                this.f193501d = a0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new f(this.f193499b, this.f193500c, this.f193501d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193498a;
                if (i14 == 0) {
                    r.b(obj);
                    n4.c cVarA = n4.c.a(this.f193501d.f15750c);
                    this.f193498a = 1;
                    if (this.f193499b.invoke(this.f193500c, cVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f2 f193502a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(f2 f2Var, t13.d<? super g> dVar) {
                super(2, dVar);
                this.f193502a = f2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new g(this.f193502a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f193502a.f();
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f2 f193503a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(f2 f2Var, t13.d<? super h> dVar) {
                super(2, dVar);
                this.f193503a = f2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new h(this.f193503a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f193503a.e();
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {108}, m = "invokeSuspend", v = 1)
        public static final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f193504a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f2 f193505b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(f2 f2Var, t13.d<? super i> dVar) {
                super(2, dVar);
                this.f193505b = f2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new i(this.f193505b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193504a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f193504a = 1;
                    if (this.f193505b.o(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f2 f193506a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(f2 f2Var, t13.d<? super j> dVar) {
                super(2, dVar);
                this.f193506a = f2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new j(this.f193506a, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f193506a.f();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(b0 b0Var, q<? super c2, ? super n4.c, ? super t13.d<? super Unit>, ? extends Object> qVar, l<? super n4.c, Unit> lVar, l<? super n4.c, Unit> lVar2, l<? super n4.c, Unit> lVar3, f2 f2Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f193482f = b0Var;
            this.f193483g = qVar;
            this.f193484h = lVar;
            this.f193485i = lVar2;
            this.f193486j = lVar3;
            this.f193487k = f2Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f193482f, this.f193483g, this.f193484h, this.f193485i, this.f193486j, this.f193487k, dVar);
            aVar.f193481e = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0256  */
        /* JADX WARN: Code duplicated, block: B:19:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:20:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:23:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:28:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:33:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:36:0x0108  */
        /* JADX WARN: Code duplicated, block: B:39:0x0122  */
        /* JADX WARN: Code duplicated, block: B:42:0x012e  */
        /* JADX WARN: Code duplicated, block: B:44:0x0132  */
        /* JADX WARN: Code duplicated, block: B:45:0x0137  */
        /* JADX WARN: Code duplicated, block: B:47:0x013b  */
        /* JADX WARN: Code duplicated, block: B:50:0x013f  */
        /* JADX WARN: Code duplicated, block: B:51:0x0149  */
        /* JADX WARN: Code duplicated, block: B:53:0x0157 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:54:0x0159 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:55:0x015b  */
        /* JADX WARN: Code duplicated, block: B:56:0x0166  */
        /* JADX WARN: Code duplicated, block: B:59:0x0184 A[PHI: r2 r3 r12 r13
          0x0184: PHI (r2v19 o53.l1) = (r2v13 o53.l1), (r2v22 o53.l1) binds: [B:57:0x0180, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
          0x0184: PHI (r3v25 b5.a0) = (r3v11 b5.a0), (r3v27 b5.a0) binds: [B:57:0x0180, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
          0x0184: PHI (r12v14 b5.c) = (r12v7 b5.c), (r12v16 b5.c) binds: [B:57:0x0180, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]
          0x0184: PHI (r13v15 java.lang.Object) = (r13v11 java.lang.Object), (r13v17 java.lang.Object) binds: [B:57:0x0180, B:9:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:61:0x0188 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:62:0x018a  */
        /* JADX WARN: Code duplicated, block: B:63:0x0195  */
        /* JADX WARN: Code duplicated, block: B:65:0x019b  */
        /* JADX WARN: Code duplicated, block: B:66:0x019e  */
        /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:71:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:74:0x01c9  */
        /* JADX WARN: Code duplicated, block: B:76:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:79:0x01e1  */
        /* JADX WARN: Code duplicated, block: B:82:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:85:0x0208  */
        /* JADX WARN: Code duplicated, block: B:88:0x0214  */
        /* JADX WARN: Code duplicated, block: B:90:0x0218  */
        /* JADX WARN: Code duplicated, block: B:91:0x021e  */
        /* JADX WARN: Code duplicated, block: B:93:0x0222  */
        /* JADX WARN: Code duplicated, block: B:95:0x0226  */
        /* JADX WARN: Code duplicated, block: B:96:0x023b  */
        /* JADX WARN: Code duplicated, block: B:98:0x0245  */
        /* JADX WARN: Code duplicated, block: B:99:0x024f  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b5.c cVar;
            Object objC;
            a0 a0Var;
            d0 d0Var;
            c2 c2VarT;
            Object objI;
            b5.c cVar2;
            l1 l1Var;
            Object objJ;
            b5.c cVar3;
            a0 a0Var2;
            l1 l1VarH;
            Object objT0;
            l1 l1Var2;
            l1 l1Var3;
            a0 a0Var3;
            d0 d0Var2;
            l1 l1VarT;
            Object objI2;
            b5.c cVar4;
            Object objJ2;
            a0 a0Var4;
            a0 a0Var5;
            l1 l1Var4;
            l1 l1Var5;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193480d;
            b0 b0Var = this.f193482f;
            l<n4.c, Unit> lVar = this.f193485i;
            q<c2, n4.c, t13.d<? super Unit>, Object> qVar = this.f193483g;
            l<n4.c, Unit> lVar2 = this.f193486j;
            l<n4.c, Unit> lVar3 = this.f193484h;
            f2 f2Var = this.f193487k;
            switch (i14) {
                case 0:
                    r.b(obj);
                    cVar = (b5.c) this.f193481e;
                    this.f193481e = cVar;
                    this.f193480d = 1;
                    objC = k3.c(cVar, null, this, 3);
                    if (objC != aVar) {
                        a0Var = (a0) objC;
                        a0Var.a();
                        k3.a aVar2 = k3.f193358a;
                        if (g0.f167494a) {
                            d0Var = d0.UNDISPATCHED;
                        } else {
                            d0Var = d0.DEFAULT;
                        }
                        c2VarT = ge1.b.T(b0Var, null, d0Var, new i(f2Var, null), 1);
                        if (qVar != k3.f193358a) {
                            k3.h(b0Var, c2VarT, new C3613a(qVar, f2Var, a0Var, null));
                        }
                        if (lVar3 == null) {
                            this.f193481e = cVar;
                            this.f193477a = c2VarT;
                            this.f193480d = 2;
                            objJ = k3.j(cVar, s.Main, this);
                            if (objJ != aVar) {
                                cVar3 = cVar;
                                l1Var = c2VarT;
                                a0Var2 = (a0) objJ;
                                if (a0Var2 == null) {
                                    l1VarH = k3.h(b0Var, l1Var, new c(f2Var, null));
                                } else {
                                    a0Var2.a();
                                    l1VarH = k3.h(b0Var, l1Var, new d(f2Var, null));
                                }
                                if (a0Var2 != null) {
                                    if (lVar == null) {
                                        this.f193481e = cVar3;
                                        this.f193477a = a0Var2;
                                        this.f193478b = l1VarH;
                                        this.f193480d = 5;
                                        objT0 = cVar3.t0(cVar3.getViewConfiguration().b(), new m3(a0Var2, null), this);
                                        if (objT0 != aVar) {
                                            a0Var3 = (a0) objT0;
                                            if (a0Var3 != null) {
                                                k3.a aVar3 = k3.f193358a;
                                                if (g0.f167494a) {
                                                    d0Var2 = d0.UNDISPATCHED;
                                                } else {
                                                    d0Var2 = d0.DEFAULT;
                                                }
                                                l1VarT = ge1.b.T(b0Var, null, d0Var2, new e(l1VarH, f2Var, null), 1);
                                                if (qVar != k3.f193358a) {
                                                    k3.h(b0Var, l1VarT, new f(qVar, f2Var, a0Var3, null));
                                                }
                                                if (lVar3 == null) {
                                                    this.f193481e = l1VarT;
                                                    this.f193477a = a0Var2;
                                                    this.f193478b = null;
                                                    this.f193480d = 6;
                                                    objJ2 = k3.j(cVar3, s.Main, this);
                                                    if (objJ2 != aVar) {
                                                        a0Var4 = a0Var2;
                                                        a0Var5 = (a0) objJ2;
                                                        if (a0Var5 != null) {
                                                            a0Var5.a();
                                                            k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                            lVar.invoke(n4.c.a(a0Var5.f15750c));
                                                        } else {
                                                            k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                            if (lVar2 != null) {
                                                                lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    this.f193481e = cVar3;
                                                    this.f193477a = l1VarT;
                                                    this.f193478b = a0Var2;
                                                    this.f193479c = a0Var3;
                                                    this.f193480d = 7;
                                                    objI2 = k3.i(cVar3, s.Main, this);
                                                    if (objI2 != aVar) {
                                                        cVar4 = cVar3;
                                                        l1Var4 = (l1) objI2;
                                                        if (p005kotlin.jvm.internal.s.g(l1Var4, l1.c.f193407a)) {
                                                            lVar3.invoke(n4.c.a(a0Var3.f15750c));
                                                            this.f193481e = l1VarT;
                                                            this.f193477a = null;
                                                            this.f193478b = null;
                                                            this.f193479c = null;
                                                            this.f193480d = 8;
                                                            if (k3.a(cVar4, this) != aVar) {
                                                                l1Var5 = l1VarT;
                                                                k3.h(b0Var, l1Var5, new j(f2Var, null));
                                                                return Unit.INSTANCE;
                                                            }
                                                        } else {
                                                            if (l1Var4 instanceof l1.b) {
                                                                a0Var5 = ((l1.b) l1Var4).f193406a;
                                                                a0Var4 = a0Var2;
                                                            } else {
                                                                if (l1Var4 instanceof l1.a) {
                                                                    u0.r();
                                                                    return null;
                                                                }
                                                                a0Var4 = a0Var2;
                                                                a0Var5 = null;
                                                            }
                                                            if (a0Var5 != null) {
                                                                a0Var5.a();
                                                                k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                                lVar.invoke(n4.c.a(a0Var5.f15750c));
                                                            } else {
                                                                k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                                if (lVar2 != null) {
                                                                    lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (lVar2 != null) {
                                                lVar2.invoke(n4.c.a(a0Var2.f15750c));
                                            }
                                        }
                                    } else if (lVar2 != null) {
                                        lVar2.invoke(n4.c.a(a0Var2.f15750c));
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            this.f193481e = cVar;
                            this.f193477a = a0Var;
                            this.f193478b = c2VarT;
                            this.f193480d = 3;
                            objI = k3.i(cVar, s.Main, this);
                            if (objI != aVar) {
                                cVar2 = cVar;
                                l1Var = c2VarT;
                                l1Var2 = (l1) objI;
                                if (!p005kotlin.jvm.internal.s.g(l1Var2, l1.c.f193407a)) {
                                    if (l1Var2 instanceof l1.b) {
                                        a0Var2 = ((l1.b) l1Var2).f193406a;
                                    } else {
                                        if (!(l1Var2 instanceof l1.a)) {
                                            u0.r();
                                            return null;
                                        }
                                        a0Var2 = null;
                                    }
                                    cVar3 = cVar2;
                                    if (a0Var2 == null) {
                                        l1VarH = k3.h(b0Var, l1Var, new c(f2Var, null));
                                    } else {
                                        a0Var2.a();
                                        l1VarH = k3.h(b0Var, l1Var, new d(f2Var, null));
                                    }
                                    if (a0Var2 != null) {
                                        if (lVar == null) {
                                            this.f193481e = cVar3;
                                            this.f193477a = a0Var2;
                                            this.f193478b = l1VarH;
                                            this.f193480d = 5;
                                            objT0 = cVar3.t0(cVar3.getViewConfiguration().b(), new m3(a0Var2, null), this);
                                            if (objT0 != aVar) {
                                                a0Var3 = (a0) objT0;
                                                if (a0Var3 != null) {
                                                    k3.a aVar4 = k3.f193358a;
                                                    if (g0.f167494a) {
                                                        d0Var2 = d0.UNDISPATCHED;
                                                    } else {
                                                        d0Var2 = d0.DEFAULT;
                                                    }
                                                    l1VarT = ge1.b.T(b0Var, null, d0Var2, new e(l1VarH, f2Var, null), 1);
                                                    if (qVar != k3.f193358a) {
                                                        k3.h(b0Var, l1VarT, new f(qVar, f2Var, a0Var3, null));
                                                    }
                                                    if (lVar3 == null) {
                                                        this.f193481e = l1VarT;
                                                        this.f193477a = a0Var2;
                                                        this.f193478b = null;
                                                        this.f193480d = 6;
                                                        objJ2 = k3.j(cVar3, s.Main, this);
                                                        if (objJ2 != aVar) {
                                                            a0Var4 = a0Var2;
                                                            a0Var5 = (a0) objJ2;
                                                            if (a0Var5 != null) {
                                                                a0Var5.a();
                                                                k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                                lVar.invoke(n4.c.a(a0Var5.f15750c));
                                                            } else {
                                                                k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                                if (lVar2 != null) {
                                                                    lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        this.f193481e = cVar3;
                                                        this.f193477a = l1VarT;
                                                        this.f193478b = a0Var2;
                                                        this.f193479c = a0Var3;
                                                        this.f193480d = 7;
                                                        objI2 = k3.i(cVar3, s.Main, this);
                                                        if (objI2 != aVar) {
                                                            cVar4 = cVar3;
                                                            l1Var4 = (l1) objI2;
                                                            if (p005kotlin.jvm.internal.s.g(l1Var4, l1.c.f193407a)) {
                                                                lVar3.invoke(n4.c.a(a0Var3.f15750c));
                                                                this.f193481e = l1VarT;
                                                                this.f193477a = null;
                                                                this.f193478b = null;
                                                                this.f193479c = null;
                                                                this.f193480d = 8;
                                                                if (k3.a(cVar4, this) != aVar) {
                                                                    l1Var5 = l1VarT;
                                                                    k3.h(b0Var, l1Var5, new j(f2Var, null));
                                                                    return Unit.INSTANCE;
                                                                }
                                                            } else {
                                                                if (l1Var4 instanceof l1.b) {
                                                                    a0Var5 = ((l1.b) l1Var4).f193406a;
                                                                    a0Var4 = a0Var2;
                                                                } else {
                                                                    if (l1Var4 instanceof l1.a) {
                                                                        u0.r();
                                                                        return null;
                                                                    }
                                                                    a0Var4 = a0Var2;
                                                                    a0Var5 = null;
                                                                }
                                                                if (a0Var5 != null) {
                                                                    a0Var5.a();
                                                                    k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                                    lVar.invoke(n4.c.a(a0Var5.f15750c));
                                                                } else {
                                                                    k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                                    if (lVar2 != null) {
                                                                        lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (lVar2 != null) {
                                                    lVar2.invoke(n4.c.a(a0Var2.f15750c));
                                                }
                                            }
                                        } else if (lVar2 != null) {
                                            lVar2.invoke(n4.c.a(a0Var2.f15750c));
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                                lVar3.invoke(n4.c.a(a0Var.f15750c));
                                this.f193481e = l1Var;
                                this.f193477a = null;
                                this.f193478b = null;
                                this.f193480d = 4;
                                if (k3.a(cVar2, this) != aVar) {
                                    l1Var3 = l1Var;
                                    k3.h(b0Var, l1Var3, new b(f2Var, null));
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    return aVar;
                case 1:
                    cVar = (b5.c) this.f193481e;
                    r.b(obj);
                    objC = obj;
                    a0Var = (a0) objC;
                    a0Var.a();
                    k3.a aVar5 = k3.f193358a;
                    if (g0.f167494a) {
                        d0Var = d0.UNDISPATCHED;
                    } else {
                        d0Var = d0.DEFAULT;
                    }
                    c2VarT = ge1.b.T(b0Var, null, d0Var, new i(f2Var, null), 1);
                    if (qVar != k3.f193358a) {
                        k3.h(b0Var, c2VarT, new C3613a(qVar, f2Var, a0Var, null));
                    }
                    if (lVar3 == null) {
                        this.f193481e = cVar;
                        this.f193477a = c2VarT;
                        this.f193480d = 2;
                        objJ = k3.j(cVar, s.Main, this);
                        if (objJ != aVar) {
                            cVar3 = cVar;
                            l1Var = c2VarT;
                            a0Var2 = (a0) objJ;
                            if (a0Var2 == null) {
                                l1VarH = k3.h(b0Var, l1Var, new c(f2Var, null));
                            } else {
                                a0Var2.a();
                                l1VarH = k3.h(b0Var, l1Var, new d(f2Var, null));
                            }
                            if (a0Var2 != null) {
                                if (lVar == null) {
                                    this.f193481e = cVar3;
                                    this.f193477a = a0Var2;
                                    this.f193478b = l1VarH;
                                    this.f193480d = 5;
                                    objT0 = cVar3.t0(cVar3.getViewConfiguration().b(), new m3(a0Var2, null), this);
                                    if (objT0 != aVar) {
                                        a0Var3 = (a0) objT0;
                                        if (a0Var3 != null) {
                                            k3.a aVar6 = k3.f193358a;
                                            if (g0.f167494a) {
                                                d0Var2 = d0.UNDISPATCHED;
                                            } else {
                                                d0Var2 = d0.DEFAULT;
                                            }
                                            l1VarT = ge1.b.T(b0Var, null, d0Var2, new e(l1VarH, f2Var, null), 1);
                                            if (qVar != k3.f193358a) {
                                                k3.h(b0Var, l1VarT, new f(qVar, f2Var, a0Var3, null));
                                            }
                                            if (lVar3 == null) {
                                                this.f193481e = l1VarT;
                                                this.f193477a = a0Var2;
                                                this.f193478b = null;
                                                this.f193480d = 6;
                                                objJ2 = k3.j(cVar3, s.Main, this);
                                                if (objJ2 != aVar) {
                                                    a0Var4 = a0Var2;
                                                    a0Var5 = (a0) objJ2;
                                                    if (a0Var5 != null) {
                                                        a0Var5.a();
                                                        k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                        lVar.invoke(n4.c.a(a0Var5.f15750c));
                                                    } else {
                                                        k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                        if (lVar2 != null) {
                                                            lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                        }
                                                    }
                                                }
                                            } else {
                                                this.f193481e = cVar3;
                                                this.f193477a = l1VarT;
                                                this.f193478b = a0Var2;
                                                this.f193479c = a0Var3;
                                                this.f193480d = 7;
                                                objI2 = k3.i(cVar3, s.Main, this);
                                                if (objI2 != aVar) {
                                                    cVar4 = cVar3;
                                                    l1Var4 = (l1) objI2;
                                                    if (p005kotlin.jvm.internal.s.g(l1Var4, l1.c.f193407a)) {
                                                        lVar3.invoke(n4.c.a(a0Var3.f15750c));
                                                        this.f193481e = l1VarT;
                                                        this.f193477a = null;
                                                        this.f193478b = null;
                                                        this.f193479c = null;
                                                        this.f193480d = 8;
                                                        if (k3.a(cVar4, this) != aVar) {
                                                            l1Var5 = l1VarT;
                                                            k3.h(b0Var, l1Var5, new j(f2Var, null));
                                                            return Unit.INSTANCE;
                                                        }
                                                    } else {
                                                        if (l1Var4 instanceof l1.b) {
                                                            a0Var5 = ((l1.b) l1Var4).f193406a;
                                                            a0Var4 = a0Var2;
                                                        } else {
                                                            if (l1Var4 instanceof l1.a) {
                                                                u0.r();
                                                                return null;
                                                            }
                                                            a0Var4 = a0Var2;
                                                            a0Var5 = null;
                                                        }
                                                        if (a0Var5 != null) {
                                                            a0Var5.a();
                                                            k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                            lVar.invoke(n4.c.a(a0Var5.f15750c));
                                                        } else {
                                                            k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                            if (lVar2 != null) {
                                                                lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (lVar2 != null) {
                                            lVar2.invoke(n4.c.a(a0Var2.f15750c));
                                        }
                                    }
                                } else if (lVar2 != null) {
                                    lVar2.invoke(n4.c.a(a0Var2.f15750c));
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        this.f193481e = cVar;
                        this.f193477a = a0Var;
                        this.f193478b = c2VarT;
                        this.f193480d = 3;
                        objI = k3.i(cVar, s.Main, this);
                        if (objI != aVar) {
                            cVar2 = cVar;
                            l1Var = c2VarT;
                            l1Var2 = (l1) objI;
                            if (!p005kotlin.jvm.internal.s.g(l1Var2, l1.c.f193407a)) {
                                if (l1Var2 instanceof l1.b) {
                                    a0Var2 = ((l1.b) l1Var2).f193406a;
                                } else {
                                    if (!(l1Var2 instanceof l1.a)) {
                                        u0.r();
                                        return null;
                                    }
                                    a0Var2 = null;
                                }
                                cVar3 = cVar2;
                                if (a0Var2 == null) {
                                    l1VarH = k3.h(b0Var, l1Var, new c(f2Var, null));
                                } else {
                                    a0Var2.a();
                                    l1VarH = k3.h(b0Var, l1Var, new d(f2Var, null));
                                }
                                if (a0Var2 != null) {
                                    if (lVar == null) {
                                        this.f193481e = cVar3;
                                        this.f193477a = a0Var2;
                                        this.f193478b = l1VarH;
                                        this.f193480d = 5;
                                        objT0 = cVar3.t0(cVar3.getViewConfiguration().b(), new m3(a0Var2, null), this);
                                        if (objT0 != aVar) {
                                            a0Var3 = (a0) objT0;
                                            if (a0Var3 != null) {
                                                k3.a aVar7 = k3.f193358a;
                                                if (g0.f167494a) {
                                                    d0Var2 = d0.UNDISPATCHED;
                                                } else {
                                                    d0Var2 = d0.DEFAULT;
                                                }
                                                l1VarT = ge1.b.T(b0Var, null, d0Var2, new e(l1VarH, f2Var, null), 1);
                                                if (qVar != k3.f193358a) {
                                                    k3.h(b0Var, l1VarT, new f(qVar, f2Var, a0Var3, null));
                                                }
                                                if (lVar3 == null) {
                                                    this.f193481e = l1VarT;
                                                    this.f193477a = a0Var2;
                                                    this.f193478b = null;
                                                    this.f193480d = 6;
                                                    objJ2 = k3.j(cVar3, s.Main, this);
                                                    if (objJ2 != aVar) {
                                                        a0Var4 = a0Var2;
                                                        a0Var5 = (a0) objJ2;
                                                        if (a0Var5 != null) {
                                                            a0Var5.a();
                                                            k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                            lVar.invoke(n4.c.a(a0Var5.f15750c));
                                                        } else {
                                                            k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                            if (lVar2 != null) {
                                                                lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    this.f193481e = cVar3;
                                                    this.f193477a = l1VarT;
                                                    this.f193478b = a0Var2;
                                                    this.f193479c = a0Var3;
                                                    this.f193480d = 7;
                                                    objI2 = k3.i(cVar3, s.Main, this);
                                                    if (objI2 != aVar) {
                                                        cVar4 = cVar3;
                                                        l1Var4 = (l1) objI2;
                                                        if (p005kotlin.jvm.internal.s.g(l1Var4, l1.c.f193407a)) {
                                                            lVar3.invoke(n4.c.a(a0Var3.f15750c));
                                                            this.f193481e = l1VarT;
                                                            this.f193477a = null;
                                                            this.f193478b = null;
                                                            this.f193479c = null;
                                                            this.f193480d = 8;
                                                            if (k3.a(cVar4, this) != aVar) {
                                                                l1Var5 = l1VarT;
                                                                k3.h(b0Var, l1Var5, new j(f2Var, null));
                                                                return Unit.INSTANCE;
                                                            }
                                                        } else {
                                                            if (l1Var4 instanceof l1.b) {
                                                                a0Var5 = ((l1.b) l1Var4).f193406a;
                                                                a0Var4 = a0Var2;
                                                            } else {
                                                                if (l1Var4 instanceof l1.a) {
                                                                    u0.r();
                                                                    return null;
                                                                }
                                                                a0Var4 = a0Var2;
                                                                a0Var5 = null;
                                                            }
                                                            if (a0Var5 != null) {
                                                                a0Var5.a();
                                                                k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                                lVar.invoke(n4.c.a(a0Var5.f15750c));
                                                            } else {
                                                                k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                                if (lVar2 != null) {
                                                                    lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (lVar2 != null) {
                                                lVar2.invoke(n4.c.a(a0Var2.f15750c));
                                            }
                                        }
                                    } else if (lVar2 != null) {
                                        lVar2.invoke(n4.c.a(a0Var2.f15750c));
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            lVar3.invoke(n4.c.a(a0Var.f15750c));
                            this.f193481e = l1Var;
                            this.f193477a = null;
                            this.f193478b = null;
                            this.f193480d = 4;
                            if (k3.a(cVar2, this) != aVar) {
                                l1Var3 = l1Var;
                                k3.h(b0Var, l1Var3, new b(f2Var, null));
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return aVar;
                case 2:
                    l1Var = (l1) this.f193477a;
                    b5.c cVar5 = (b5.c) this.f193481e;
                    r.b(obj);
                    cVar3 = cVar5;
                    objJ = obj;
                    a0Var2 = (a0) objJ;
                    if (a0Var2 == null) {
                        l1VarH = k3.h(b0Var, l1Var, new c(f2Var, null));
                    } else {
                        a0Var2.a();
                        l1VarH = k3.h(b0Var, l1Var, new d(f2Var, null));
                    }
                    if (a0Var2 != null) {
                        if (lVar == null) {
                            this.f193481e = cVar3;
                            this.f193477a = a0Var2;
                            this.f193478b = l1VarH;
                            this.f193480d = 5;
                            objT0 = cVar3.t0(cVar3.getViewConfiguration().b(), new m3(a0Var2, null), this);
                            if (objT0 != aVar) {
                                a0Var3 = (a0) objT0;
                                if (a0Var3 != null) {
                                    k3.a aVar8 = k3.f193358a;
                                    if (g0.f167494a) {
                                        d0Var2 = d0.UNDISPATCHED;
                                    } else {
                                        d0Var2 = d0.DEFAULT;
                                    }
                                    l1VarT = ge1.b.T(b0Var, null, d0Var2, new e(l1VarH, f2Var, null), 1);
                                    if (qVar != k3.f193358a) {
                                        k3.h(b0Var, l1VarT, new f(qVar, f2Var, a0Var3, null));
                                    }
                                    if (lVar3 == null) {
                                        this.f193481e = l1VarT;
                                        this.f193477a = a0Var2;
                                        this.f193478b = null;
                                        this.f193480d = 6;
                                        objJ2 = k3.j(cVar3, s.Main, this);
                                        if (objJ2 != aVar) {
                                            a0Var4 = a0Var2;
                                            a0Var5 = (a0) objJ2;
                                            if (a0Var5 != null) {
                                                a0Var5.a();
                                                k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                lVar.invoke(n4.c.a(a0Var5.f15750c));
                                            } else {
                                                k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                if (lVar2 != null) {
                                                    lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                }
                                            }
                                        }
                                    } else {
                                        this.f193481e = cVar3;
                                        this.f193477a = l1VarT;
                                        this.f193478b = a0Var2;
                                        this.f193479c = a0Var3;
                                        this.f193480d = 7;
                                        objI2 = k3.i(cVar3, s.Main, this);
                                        if (objI2 != aVar) {
                                            cVar4 = cVar3;
                                            l1Var4 = (l1) objI2;
                                            if (p005kotlin.jvm.internal.s.g(l1Var4, l1.c.f193407a)) {
                                                lVar3.invoke(n4.c.a(a0Var3.f15750c));
                                                this.f193481e = l1VarT;
                                                this.f193477a = null;
                                                this.f193478b = null;
                                                this.f193479c = null;
                                                this.f193480d = 8;
                                                if (k3.a(cVar4, this) != aVar) {
                                                    l1Var5 = l1VarT;
                                                    k3.h(b0Var, l1Var5, new j(f2Var, null));
                                                    return Unit.INSTANCE;
                                                }
                                            } else {
                                                if (l1Var4 instanceof l1.b) {
                                                    a0Var5 = ((l1.b) l1Var4).f193406a;
                                                    a0Var4 = a0Var2;
                                                } else {
                                                    if (l1Var4 instanceof l1.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    a0Var4 = a0Var2;
                                                    a0Var5 = null;
                                                }
                                                if (a0Var5 != null) {
                                                    a0Var5.a();
                                                    k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                    lVar.invoke(n4.c.a(a0Var5.f15750c));
                                                } else {
                                                    k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                    if (lVar2 != null) {
                                                        lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (lVar2 != null) {
                                    lVar2.invoke(n4.c.a(a0Var2.f15750c));
                                }
                            }
                            return aVar;
                        }
                        if (lVar2 != null) {
                            lVar2.invoke(n4.c.a(a0Var2.f15750c));
                        }
                    }
                    return Unit.INSTANCE;
                case 3:
                    l1Var = (l1) this.f193478b;
                    a0 a0Var6 = (a0) this.f193477a;
                    b5.c cVar6 = (b5.c) this.f193481e;
                    r.b(obj);
                    cVar2 = cVar6;
                    a0Var = a0Var6;
                    objI = obj;
                    l1Var2 = (l1) objI;
                    if (!p005kotlin.jvm.internal.s.g(l1Var2, l1.c.f193407a)) {
                        if (l1Var2 instanceof l1.b) {
                            a0Var2 = ((l1.b) l1Var2).f193406a;
                        } else {
                            if (!(l1Var2 instanceof l1.a)) {
                                u0.r();
                                return null;
                            }
                            a0Var2 = null;
                        }
                        cVar3 = cVar2;
                        if (a0Var2 == null) {
                            l1VarH = k3.h(b0Var, l1Var, new c(f2Var, null));
                        } else {
                            a0Var2.a();
                            l1VarH = k3.h(b0Var, l1Var, new d(f2Var, null));
                        }
                        if (a0Var2 != null) {
                            if (lVar == null) {
                                this.f193481e = cVar3;
                                this.f193477a = a0Var2;
                                this.f193478b = l1VarH;
                                this.f193480d = 5;
                                objT0 = cVar3.t0(cVar3.getViewConfiguration().b(), new m3(a0Var2, null), this);
                                if (objT0 != aVar) {
                                    a0Var3 = (a0) objT0;
                                    if (a0Var3 != null) {
                                        k3.a aVar9 = k3.f193358a;
                                        if (g0.f167494a) {
                                            d0Var2 = d0.UNDISPATCHED;
                                        } else {
                                            d0Var2 = d0.DEFAULT;
                                        }
                                        l1VarT = ge1.b.T(b0Var, null, d0Var2, new e(l1VarH, f2Var, null), 1);
                                        if (qVar != k3.f193358a) {
                                            k3.h(b0Var, l1VarT, new f(qVar, f2Var, a0Var3, null));
                                        }
                                        if (lVar3 == null) {
                                            this.f193481e = l1VarT;
                                            this.f193477a = a0Var2;
                                            this.f193478b = null;
                                            this.f193480d = 6;
                                            objJ2 = k3.j(cVar3, s.Main, this);
                                            if (objJ2 != aVar) {
                                                a0Var4 = a0Var2;
                                                a0Var5 = (a0) objJ2;
                                                if (a0Var5 != null) {
                                                    a0Var5.a();
                                                    k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                    lVar.invoke(n4.c.a(a0Var5.f15750c));
                                                } else {
                                                    k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                    if (lVar2 != null) {
                                                        lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f193481e = cVar3;
                                            this.f193477a = l1VarT;
                                            this.f193478b = a0Var2;
                                            this.f193479c = a0Var3;
                                            this.f193480d = 7;
                                            objI2 = k3.i(cVar3, s.Main, this);
                                            if (objI2 != aVar) {
                                                cVar4 = cVar3;
                                                l1Var4 = (l1) objI2;
                                                if (p005kotlin.jvm.internal.s.g(l1Var4, l1.c.f193407a)) {
                                                    lVar3.invoke(n4.c.a(a0Var3.f15750c));
                                                    this.f193481e = l1VarT;
                                                    this.f193477a = null;
                                                    this.f193478b = null;
                                                    this.f193479c = null;
                                                    this.f193480d = 8;
                                                    if (k3.a(cVar4, this) != aVar) {
                                                        l1Var5 = l1VarT;
                                                        k3.h(b0Var, l1Var5, new j(f2Var, null));
                                                        return Unit.INSTANCE;
                                                    }
                                                } else {
                                                    if (l1Var4 instanceof l1.b) {
                                                        a0Var5 = ((l1.b) l1Var4).f193406a;
                                                        a0Var4 = a0Var2;
                                                    } else {
                                                        if (l1Var4 instanceof l1.a) {
                                                            u0.r();
                                                            return null;
                                                        }
                                                        a0Var4 = a0Var2;
                                                        a0Var5 = null;
                                                    }
                                                    if (a0Var5 != null) {
                                                        a0Var5.a();
                                                        k3.h(b0Var, l1VarT, new g(f2Var, null));
                                                        lVar.invoke(n4.c.a(a0Var5.f15750c));
                                                    } else {
                                                        k3.h(b0Var, l1VarT, new h(f2Var, null));
                                                        if (lVar2 != null) {
                                                            lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (lVar2 != null) {
                                        lVar2.invoke(n4.c.a(a0Var2.f15750c));
                                    }
                                }
                            } else if (lVar2 != null) {
                                lVar2.invoke(n4.c.a(a0Var2.f15750c));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    lVar3.invoke(n4.c.a(a0Var.f15750c));
                    this.f193481e = l1Var;
                    this.f193477a = null;
                    this.f193478b = null;
                    this.f193480d = 4;
                    if (k3.a(cVar2, this) != aVar) {
                        l1Var3 = l1Var;
                        k3.h(b0Var, l1Var3, new b(f2Var, null));
                        return Unit.INSTANCE;
                    }
                    return aVar;
                case 4:
                    l1Var3 = (l1) this.f193481e;
                    r.b(obj);
                    k3.h(b0Var, l1Var3, new b(f2Var, null));
                    return Unit.INSTANCE;
                case 5:
                    l1VarH = (l1) this.f193478b;
                    a0Var2 = (a0) this.f193477a;
                    cVar3 = (b5.c) this.f193481e;
                    r.b(obj);
                    objT0 = obj;
                    a0Var3 = (a0) objT0;
                    if (a0Var3 != null) {
                        k3.a aVar10 = k3.f193358a;
                        if (g0.f167494a) {
                            d0Var2 = d0.UNDISPATCHED;
                        } else {
                            d0Var2 = d0.DEFAULT;
                        }
                        l1VarT = ge1.b.T(b0Var, null, d0Var2, new e(l1VarH, f2Var, null), 1);
                        if (qVar != k3.f193358a) {
                            k3.h(b0Var, l1VarT, new f(qVar, f2Var, a0Var3, null));
                        }
                        if (lVar3 == null) {
                            this.f193481e = l1VarT;
                            this.f193477a = a0Var2;
                            this.f193478b = null;
                            this.f193480d = 6;
                            objJ2 = k3.j(cVar3, s.Main, this);
                            if (objJ2 != aVar) {
                                a0Var4 = a0Var2;
                                a0Var5 = (a0) objJ2;
                                if (a0Var5 != null) {
                                    a0Var5.a();
                                    k3.h(b0Var, l1VarT, new g(f2Var, null));
                                    lVar.invoke(n4.c.a(a0Var5.f15750c));
                                } else {
                                    k3.h(b0Var, l1VarT, new h(f2Var, null));
                                    if (lVar2 != null) {
                                        lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                    }
                                }
                            }
                        } else {
                            this.f193481e = cVar3;
                            this.f193477a = l1VarT;
                            this.f193478b = a0Var2;
                            this.f193479c = a0Var3;
                            this.f193480d = 7;
                            objI2 = k3.i(cVar3, s.Main, this);
                            if (objI2 != aVar) {
                                cVar4 = cVar3;
                                l1Var4 = (l1) objI2;
                                if (p005kotlin.jvm.internal.s.g(l1Var4, l1.c.f193407a)) {
                                    lVar3.invoke(n4.c.a(a0Var3.f15750c));
                                    this.f193481e = l1VarT;
                                    this.f193477a = null;
                                    this.f193478b = null;
                                    this.f193479c = null;
                                    this.f193480d = 8;
                                    if (k3.a(cVar4, this) != aVar) {
                                        l1Var5 = l1VarT;
                                        k3.h(b0Var, l1Var5, new j(f2Var, null));
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (l1Var4 instanceof l1.b) {
                                        a0Var5 = ((l1.b) l1Var4).f193406a;
                                        a0Var4 = a0Var2;
                                    } else {
                                        if (l1Var4 instanceof l1.a) {
                                            u0.r();
                                            return null;
                                        }
                                        a0Var4 = a0Var2;
                                        a0Var5 = null;
                                    }
                                    if (a0Var5 != null) {
                                        a0Var5.a();
                                        k3.h(b0Var, l1VarT, new g(f2Var, null));
                                        lVar.invoke(n4.c.a(a0Var5.f15750c));
                                    } else {
                                        k3.h(b0Var, l1VarT, new h(f2Var, null));
                                        if (lVar2 != null) {
                                            lVar2.invoke(n4.c.a(a0Var4.f15750c));
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    }
                    if (lVar2 != null) {
                        lVar2.invoke(n4.c.a(a0Var2.f15750c));
                    }
                    return Unit.INSTANCE;
                case 6:
                    a0Var4 = (a0) this.f193477a;
                    l1VarT = (l1) this.f193481e;
                    r.b(obj);
                    objJ2 = obj;
                    a0Var5 = (a0) objJ2;
                    if (a0Var5 != null) {
                        a0Var5.a();
                        k3.h(b0Var, l1VarT, new g(f2Var, null));
                        lVar.invoke(n4.c.a(a0Var5.f15750c));
                    } else {
                        k3.h(b0Var, l1VarT, new h(f2Var, null));
                        if (lVar2 != null) {
                            lVar2.invoke(n4.c.a(a0Var4.f15750c));
                        }
                    }
                    return Unit.INSTANCE;
                case 7:
                    a0 a0Var7 = this.f193479c;
                    a0Var2 = (a0) this.f193478b;
                    l1 l1Var6 = (l1) this.f193477a;
                    cVar4 = (b5.c) this.f193481e;
                    r.b(obj);
                    a0Var3 = a0Var7;
                    l1VarT = l1Var6;
                    objI2 = obj;
                    l1Var4 = (l1) objI2;
                    if (p005kotlin.jvm.internal.s.g(l1Var4, l1.c.f193407a)) {
                        lVar3.invoke(n4.c.a(a0Var3.f15750c));
                        this.f193481e = l1VarT;
                        this.f193477a = null;
                        this.f193478b = null;
                        this.f193479c = null;
                        this.f193480d = 8;
                        if (k3.a(cVar4, this) != aVar) {
                            l1Var5 = l1VarT;
                            k3.h(b0Var, l1Var5, new j(f2Var, null));
                            return Unit.INSTANCE;
                        }
                        return aVar;
                    }
                    if (l1Var4 instanceof l1.b) {
                        a0Var5 = ((l1.b) l1Var4).f193406a;
                        a0Var4 = a0Var2;
                    } else {
                        if (l1Var4 instanceof l1.a) {
                            u0.r();
                            return null;
                        }
                        a0Var4 = a0Var2;
                        a0Var5 = null;
                    }
                    if (a0Var5 != null) {
                        a0Var5.a();
                        k3.h(b0Var, l1VarT, new g(f2Var, null));
                        lVar.invoke(n4.c.a(a0Var5.f15750c));
                    } else {
                        k3.h(b0Var, l1VarT, new h(f2Var, null));
                        if (lVar2 != null) {
                            lVar2.invoke(n4.c.a(a0Var4.f15750c));
                        }
                    }
                    return Unit.INSTANCE;
                case 8:
                    l1Var5 = (l1) this.f193481e;
                    r.b(obj);
                    k3.h(b0Var, l1Var5, new j(f2Var, null));
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o3(h0 h0Var, q<? super c2, ? super c, ? super d<? super Unit>, ? extends Object> qVar, l<? super c, Unit> lVar, l<? super c, Unit> lVar2, l<? super c, Unit> lVar3, d<? super o3> dVar) {
        super(2, dVar);
        this.f193472c = h0Var;
        this.f193473d = qVar;
        this.f193474e = lVar;
        this.f193475f = lVar2;
        this.f193476g = lVar3;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        o3 o3Var = new o3(this.f193472c, this.f193473d, this.f193474e, this.f193475f, this.f193476g, dVar);
        o3Var.f193471b = obj;
        return o3Var;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((o3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193470a;
        if (i14 == 0) {
            r.b(obj);
            b0 b0Var = (b0) this.f193471b;
            h0 h0Var = this.f193472c;
            f2 f2Var = new f2(h0Var);
            a aVar2 = new a(b0Var, this.f193473d, this.f193474e, this.f193475f, this.f193476g, f2Var, null);
            this.f193470a = 1;
            if (h1.c(h0Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
