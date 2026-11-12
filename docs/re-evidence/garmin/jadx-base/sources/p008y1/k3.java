package p008y1;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import b5.a0;
import b5.h0;
import b5.m0;
import b5.s;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.l;
import e23.p;
import e23.q;
import java.util.List;
import o13.r;
import o53.b0;
import o53.c0;
import o53.c2;
import o53.d0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import t13.d;
import u1.g0;
import v13.e;
import v13.h;
import v13.i;
import wr.g;

/* JADX INFO: loaded from: classes.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f193358a = new a(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly1/c2;", "Ln4/c;", "it", "", "<anonymous>", "(Ly1/c2;Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements q<c2, n4.c, d<? super Unit>, Object> {
        public a(d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(c2 c2Var, n4.c cVar, d<? super Unit> dVar) {
            long j8 = cVar.f123544a;
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {291}, m = "awaitFirstDown", v = 1)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b5.c f193359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s f193360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f193361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f193362d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f193363e;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f193362d = obj;
            this.f193363e |= Integer.MIN_VALUE;
            return k3.b(null, false, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {247}, m = "invokeSuspend", v = 1)
    public static final class c extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h0 f193366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q<c2, n4.c, d<? super Unit>, Object> f193367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l<n4.c, Unit> f193368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f2 f193369f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {251, TsExtractor.TS_STREAM_TYPE_AIT}, m = "invokeSuspend", v = 1)
        public static final class a extends h implements p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public c2 f193370a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f193371b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f193372c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b0 f193373d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ q<c2, n4.c, t13.d<? super Unit>, Object> f193374e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ l<n4.c, Unit> f193375f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ f2 f193376g;

            /* JADX INFO: renamed from: y1.k3$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
            @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend", v = 1)
            public static final class C3611a extends i implements p<b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f193377a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ q<c2, n4.c, t13.d<? super Unit>, Object> f193378b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f2 f193379c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a0 f193380d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3611a(q<? super c2, ? super n4.c, ? super t13.d<? super Unit>, ? extends Object> qVar, f2 f2Var, a0 a0Var, t13.d<? super C3611a> dVar) {
                    super(2, dVar);
                    this.f193378b = qVar;
                    this.f193379c = f2Var;
                    this.f193380d = a0Var;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C3611a(this.f193378b, this.f193379c, this.f193380d, dVar);
                }

                @Override // e23.p
                public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C3611a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f193377a;
                    if (i14 == 0) {
                        r.b(obj);
                        n4.c cVarA = n4.c.a(this.f193380d.f15750c);
                        this.f193377a = 1;
                        if (this.f193378b.invoke(this.f193379c, cVarA, this) == aVar) {
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
            @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ f2 f193381a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(f2 f2Var, t13.d<? super b> dVar) {
                    super(2, dVar);
                    this.f193381a = f2Var;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new b(this.f193381a, dVar);
                }

                @Override // e23.p
                public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    r.b(obj);
                    this.f193381a.e();
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: y1.k3$c$a$c, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
            @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C3612c extends i implements p<b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ f2 f193382a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3612c(f2 f2Var, t13.d<? super C3612c> dVar) {
                    super(2, dVar);
                    this.f193382a = f2Var;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C3612c(this.f193382a, dVar);
                }

                @Override // e23.p
                public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C3612c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    r.b(obj);
                    this.f193382a.f();
                    return Unit.INSTANCE;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
            @e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {249}, m = "invokeSuspend", v = 1)
            public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f193383a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f2 f193384b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(f2 f2Var, t13.d<? super d> dVar) {
                    super(2, dVar);
                    this.f193384b = f2Var;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new d(this.f193384b, dVar);
                }

                @Override // e23.p
                public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f193383a;
                    if (i14 == 0) {
                        r.b(obj);
                        this.f193383a = 1;
                        if (this.f193384b.o(this) == aVar) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b0 b0Var, q<? super c2, ? super n4.c, ? super t13.d<? super Unit>, ? extends Object> qVar, l<? super n4.c, Unit> lVar, f2 f2Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f193373d = b0Var;
                this.f193374e = qVar;
                this.f193375f = lVar;
                this.f193376g = f2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f193373d, this.f193374e, this.f193375f, this.f193376g, dVar);
                aVar.f193372c = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x007c  */
            /* JADX WARN: Code duplicated, block: B:28:0x0085  */
            /* JADX WARN: Code duplicated, block: B:30:0x0094  */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                c2 c2VarT;
                b5.c cVar;
                l1 l1Var;
                a0 a0Var;
                l<n4.c, Unit> lVar;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193371b;
                b0 b0Var = this.f193373d;
                f2 f2Var = this.f193376g;
                if (i14 == 0) {
                    r.b(obj);
                    b5.c cVar2 = (b5.c) this.f193372c;
                    a aVar2 = k3.f193358a;
                    c2VarT = ge1.b.T(b0Var, null, g0.f167494a ? d0.UNDISPATCHED : d0.DEFAULT, new d(f2Var, null), 1);
                    this.f193372c = cVar2;
                    this.f193370a = c2VarT;
                    this.f193371b = 1;
                    Object objC = k3.c(cVar2, null, this, 3);
                    if (objC != aVar) {
                        cVar = cVar2;
                        obj = objC;
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    c2VarT = this.f193370a;
                    cVar = (b5.c) this.f193372c;
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l1Var = (l1) this.f193372c;
                    r.b(obj);
                }
                a0Var = (a0) obj;
                if (a0Var == null) {
                    k3.h(b0Var, l1Var, new b(f2Var, null));
                } else {
                    a0Var.a();
                    k3.h(b0Var, l1Var, new C3612c(f2Var, null));
                    lVar = this.f193375f;
                    if (lVar != null) {
                        lVar.invoke(n4.c.a(a0Var.f15750c));
                    }
                }
                return Unit.INSTANCE;
                a0 a0Var2 = (a0) obj;
                a0Var2.a();
                a aVar3 = k3.f193358a;
                q<c2, n4.c, t13.d<? super Unit>, Object> qVar = this.f193374e;
                if (qVar != aVar3) {
                    k3.h(b0Var, c2VarT, new C3611a(qVar, f2Var, a0Var2, null));
                }
                this.f193372c = c2VarT;
                this.f193370a = null;
                this.f193371b = 2;
                obj = k3.j(cVar, s.Main, this);
                if (obj != aVar) {
                    l1Var = c2VarT;
                    a0Var = (a0) obj;
                    if (a0Var == null) {
                        k3.h(b0Var, l1Var, new b(f2Var, null));
                    } else {
                        a0Var.a();
                        k3.h(b0Var, l1Var, new C3612c(f2Var, null));
                        lVar = this.f193375f;
                        if (lVar != null) {
                            lVar.invoke(n4.c.a(a0Var.f15750c));
                        }
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(h0 h0Var, q<? super c2, ? super n4.c, ? super d<? super Unit>, ? extends Object> qVar, l<? super n4.c, Unit> lVar, f2 f2Var, d<? super c> dVar) {
            super(2, dVar);
            this.f193366c = h0Var;
            this.f193367d = qVar;
            this.f193368e = lVar;
            this.f193369f = f2Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            c cVar = new c(this.f193366c, this.f193367d, this.f193368e, this.f193369f, dVar);
            cVar.f193365b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193364a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a((b0) this.f193365b, this.f193367d, this.f193368e, this.f193369f, null);
                this.f193364a = 1;
                if (h1.c(this.f193366c, aVar2, this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[LOOP:1: B:22:0x005e->B:26:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0060
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(b5.c r8, v13.a r9) {
        /*
            boolean r0 = r9 instanceof p008y1.n3
            if (r0 == 0) goto L13
            r0 = r9
            y1.n3 r0 = (p008y1.n3) r0
            int r1 = r0.f193450c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f193450c = r1
            goto L18
        L13:
            y1.n3 r0 = new y1.n3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f193449b
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f193450c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            b5.c r8 = r0.f193448a
            o13.r.b(r9)
            goto L40
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r8)
            r8 = 0
            return r8
        L30:
            o13.r.b(r9)
        L33:
            r0.f193448a = r8
            r0.f193450c = r3
            b5.s r9 = b5.s.Main
            java.lang.Object r9 = r8.W0(r9, r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            b5.q r9 = (b5.q) r9
            java.util.List<b5.a0> r2 = r9.f15870a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4a:
            if (r6 >= r4) goto L58
            java.lang.Object r7 = r2.get(r6)
            b5.a0 r7 = (b5.a0) r7
            r7.a()
            int r6 = r6 + 1
            goto L4a
        L58:
            java.util.List<b5.a0> r9 = r9.f15870a
            int r2 = r9.size()
        L5e:
            if (r5 >= r2) goto L6e
            java.lang.Object r4 = r9.get(r5)
            b5.a0 r4 = (b5.a0) r4
            boolean r4 = r4.f15751d
            if (r4 == 0) goto L6b
            goto L33
        L6b:
            int r5 = r5 + 1
            goto L5e
        L6e:
            kotlin.Unit r8 = p005kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.k3.a(b5.c, v13.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(b5.c r6, boolean r7, b5.s r8, t13.d<? super b5.a0> r9) {
        /*
            boolean r0 = r9 instanceof y1.k3.b
            if (r0 == 0) goto L13
            r0 = r9
            y1.k3$b r0 = (y1.k3.b) r0
            int r1 = r0.f193363e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f193363e = r1
            goto L18
        L13:
            y1.k3$b r0 = new y1.k3$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f193362d
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f193363e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r6 = r0.f193361c
            b5.s r7 = r0.f193360b
            b5.c r8 = r0.f193359a
            o13.r.b(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4a
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r6)
            r6 = 0
            return r6
        L38:
            o13.r.b(r9)
        L3b:
            r0.f193359a = r6
            r0.f193360b = r8
            r0.f193361c = r7
            r0.f193363e = r3
            java.lang.Object r9 = r6.W0(r8, r0)
            if (r9 != r1) goto L4a
            return r1
        L4a:
            b5.q r9 = (b5.q) r9
            r2 = 0
            boolean r4 = g(r9, r7, r2)
            if (r4 == 0) goto L3b
            java.util.List<b5.a0> r6 = r9.f15870a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.k3.b(b5.c, boolean, b5.s, t13.d):java.lang.Object");
    }

    public static /* synthetic */ Object c(b5.c cVar, s sVar, d dVar, int i14) {
        boolean z14 = (i14 & 1) != 0;
        if ((i14 & 2) != 0) {
            sVar = s.Main;
        }
        return b(cVar, z14, sVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(b5.c r6, b5.s r7, v13.a r8) {
        /*
            boolean r0 = r8 instanceof p008y1.l3
            if (r0 == 0) goto L13
            r0 = r8
            y1.l3 r0 = (p008y1.l3) r0
            int r1 = r0.f193411d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f193411d = r1
            goto L18
        L13:
            y1.l3 r0 = new y1.l3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f193410c
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f193411d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            b5.s r6 = r0.f193409b
            b5.c r7 = r0.f193408a
            o13.r.b(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L45
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r6)
            r6 = 0
            return r6
        L35:
            o13.r.b(r8)
        L38:
            r0.f193408a = r6
            r0.f193409b = r7
            r0.f193411d = r3
            java.lang.Object r8 = r6.W0(r7, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            b5.q r8 = (b5.q) r8
            r2 = 0
            boolean r4 = g(r8, r2, r3)
            if (r4 == 0) goto L38
            java.util.List<b5.a0> r6 = r8.f15870a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.k3.d(b5.c, b5.s, v13.a):java.lang.Object");
    }

    public static final Object e(h0 h0Var, q<? super c2, ? super n4.c, ? super d<? super Unit>, ? extends Object> qVar, l<? super n4.c, Unit> lVar, d<? super Unit> dVar) {
        Object objE = c0.e(new c(h0Var, qVar, lVar, new f2(h0Var), null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    public static Object f(h0 h0Var, ph1.d dVar, q qVar, l lVar, d dVar2, int i14) {
        ph1.d dVar3 = (i14 & 1) != 0 ? null : dVar;
        if ((i14 & 4) != 0) {
            qVar = f193358a;
        }
        Object objE = c0.e(new o3(h0Var, qVar, null, dVar3, (i14 & 8) != 0 ? null : lVar, null), dVar2);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    public static final boolean g(b5.q qVar, boolean z14, boolean z15) {
        if (z15) {
            List<a0> list = qVar.f15870a;
            int size = list.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    if ((qVar.f15873d & 33) != 0) {
                        break;
                    }
                    return false;
                }
                int i15 = list.get(i14).f15756i;
                m0.f15849b.getClass();
                if (i15 != m0.f15851d) {
                    break;
                }
                i14++;
            }
        }
        List<a0> list2 = qVar.f15870a;
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            a0 a0Var = list2.get(i16);
            if (!(z14 ? b5.r.a(a0Var) : b5.r.b(a0Var))) {
                return false;
            }
        }
        return true;
    }

    public static c2 h(b0 b0Var, l1 l1Var, p pVar) {
        return ge1.b.T(b0Var, null, g0.f167494a ? d0.UNDISPATCHED : d0.DEFAULT, new p3(l1Var, pVar, null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, y1.l1$a] */
    public static final Object i(b5.c cVar, s sVar, v13.a aVar) {
        q3 q3Var;
        r0 r0Var;
        if (aVar instanceof q3) {
            q3Var = (q3) aVar;
            int i14 = q3Var.f193577c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q3Var.f193577c = i14 - Integer.MIN_VALUE;
            } else {
                q3Var = new q3(aVar);
            }
        } else {
            q3Var = new q3(aVar);
        }
        Object obj = q3Var.f193576b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = q3Var.f193577c;
        try {
            if (i15 == 0) {
                r0 r0VarS = g.s(obj);
                r0VarS.f105810a = l1.a.f193405a;
                long jC = cVar.getViewConfiguration().c();
                p r3Var = new r3(sVar, r0VarS, null);
                q3Var.f193575a = r0VarS;
                q3Var.f193577c = 1;
                if (cVar.h1(jC, r3Var, q3Var) == obj2) {
                    return obj2;
                }
                r0Var = r0VarS;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0Var = q3Var.f193575a;
                r.b(obj);
            }
            return r0Var.f105810a;
        } catch (PointerEventTimeoutCancellationException unused) {
            return l1.c.f193407a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc A[LOOP:1: B:23:0x005e->B:44:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009d -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object j(b5.c r13, b5.s r14, v13.a r15) {
        /*
            boolean r0 = r15 instanceof p008y1.s3
            if (r0 == 0) goto L13
            r0 = r15
            y1.s3 r0 = (p008y1.s3) r0
            int r1 = r0.f193642d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f193642d = r1
            goto L18
        L13:
            y1.s3 r0 = new y1.s3
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f193641c
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f193642d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r3) goto L33
            b5.s r13 = r0.f193640b
            b5.c r14 = r0.f193639a
            o13.r.b(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La0
        L33:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r13)
            r13 = 0
            return r13
        L3a:
            b5.s r13 = r0.f193640b
            b5.c r14 = r0.f193639a
            o13.r.b(r15)
            goto L55
        L42:
            o13.r.b(r15)
        L45:
            r0.f193639a = r13
            r0.f193640b = r14
            r0.f193642d = r5
            java.lang.Object r15 = r13.W0(r14, r0)
            if (r15 != r1) goto L52
            goto L9f
        L52:
            r12 = r14
            r14 = r13
            r13 = r12
        L55:
            b5.q r15 = (b5.q) r15
            java.util.List<b5.a0> r15 = r15.f15870a
            int r2 = r15.size()
            r6 = r4
        L5e:
            if (r6 >= r2) goto Lbf
            java.lang.Object r7 = r15.get(r6)
            b5.a0 r7 = (b5.a0) r7
            boolean r7 = b5.r.c(r7)
            if (r7 != 0) goto Lbc
            int r2 = r15.size()
            r6 = r4
        L71:
            if (r6 >= r2) goto L91
            java.lang.Object r7 = r15.get(r6)
            b5.a0 r7 = (b5.a0) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lb7
            long r8 = r14.a()
            long r10 = r14.w1()
            boolean r7 = b5.r.e(r7, r8, r10)
            if (r7 == 0) goto L8e
            goto Lb7
        L8e:
            int r6 = r6 + 1
            goto L71
        L91:
            b5.s r15 = b5.s.Final
            r0.f193639a = r14
            r0.f193640b = r13
            r0.f193642d = r3
            java.lang.Object r15 = r14.W0(r15, r0)
            if (r15 != r1) goto L2e
        L9f:
            return r1
        La0:
            b5.q r15 = (b5.q) r15
            java.util.List<b5.a0> r15 = r15.f15870a
            int r2 = r15.size()
            r6 = r4
        La9:
            if (r6 >= r2) goto L45
            java.lang.Object r7 = r15.get(r6)
            b5.a0 r7 = (b5.a0) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lb9
        Lb7:
            r13 = 0
            return r13
        Lb9:
            int r6 = r6 + 1
            goto La9
        Lbc:
            int r6 = r6 + 1
            goto L5e
        Lbf:
            java.lang.Object r13 = r15.get(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.k3.j(b5.c, b5.s, v13.a):java.lang.Object");
    }
}
