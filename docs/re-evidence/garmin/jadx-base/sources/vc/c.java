package vc;

import e23.p;
import f4.u;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p1.o0;
import p13.h0;
import p3.p0;
import r53.j;
import s1.s1;
import s1.t1;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1", f = "NavDisplay.kt", l = {577}, m = "invokeSuspend", v = 1)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f176939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1<uc.c<Object>> f176940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u<o13.p<k23.d<?>, Object>, uc.c<Object>> f176941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0<o13.p<k23.d<?>, Object>> f176942d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t1<uc.c<T>> f176943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u<o13.p<k23.d<?>, Object>, uc.c<T>> f176944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o0<o13.p<k23.d<?>, Object>> f176945c;

        public a(t1<uc.c<T>> t1Var, u<o13.p<k23.d<?>, Object>, uc.c<T>> uVar, o0<o13.p<k23.d<?>, Object>> o0Var) {
            this.f176943a = t1Var;
            this.f176944b = uVar;
            this.f176945c = o0Var;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0096 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x0098 A[LOOP:1: B:11:0x0055->B:23:0x0098, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:32:0x009b A[EDGE_INSN: B:32:0x009b->B:24:0x009b BREAK  A[LOOP:1: B:11:0x0055->B:23:0x0098], SYNTHETIC] */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            ((Boolean) obj).getClass();
            t1<uc.c<T>> t1Var = this.f176943a;
            o13.p pVar = new o13.p(s0.f105811a.b(t1Var.f155747d.getF182175a().getClass()), ((uc.c) t1Var.f155747d.getF182175a()).getF169931a());
            u<o13.p<k23.d<?>, Object>, uc.c<T>> uVar = this.f176944b;
            for (o13.p pVar2 : h0.b1(uVar.f68809c)) {
                if (!s.g(pVar2, pVar)) {
                    uVar.remove(pVar2);
                }
            }
            o0<o13.p<k23.d<?>, Object>> o0Var = this.f176945c;
            long[] jArr = o0Var.f134862a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j8 = jArr[i14];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i14 != length) {
                            break;
                            break;
                        }
                        i14++;
                    } else {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((255 & j8) < 128) {
                                int i17 = (i14 << 3) + i16;
                                Object obj2 = o0Var.f134863b[i17];
                                float f14 = o0Var.f134864c[i17];
                                if (!s.g((o13.p) obj2, pVar)) {
                                    o0Var.e(i17);
                                }
                            }
                            j8 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        }
                        if (i14 != length) {
                            break;
                        }
                        i14++;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f176946a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f176947a;

            /* JADX INFO: renamed from: vc.c$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @v13.e(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$12$1$invokeSuspend$$inlined$filter$1$2", f = "NavDisplay.kt", l = {50}, m = "emit", v = 1)
            public static final class C3310a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f176948a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f176949b;

                public C3310a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f176948a = obj;
                    this.f176949b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar) {
                this.f176947a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3310a c3310a;
                if (dVar instanceof C3310a) {
                    c3310a = (C3310a) dVar;
                    int i14 = c3310a.f176949b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3310a.f176949b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3310a = new C3310a(dVar);
                    }
                } else {
                    c3310a = new C3310a(dVar);
                }
                Object obj2 = c3310a.f176948a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3310a.f176949b;
                if (i15 == 0) {
                    r.b(obj2);
                    if (!((Boolean) obj).booleanValue()) {
                        c3310a.f176949b = 1;
                        if (this.f176947a.emit(obj, c3310a) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public b(r53.i iVar) {
            this.f176946a = iVar;
        }

        @Override // r53.i
        public final Object collect(j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f176946a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t1<uc.c<Object>> t1Var, u<o13.p<k23.d<?>, Object>, uc.c<Object>> uVar, o0<o13.p<k23.d<?>, Object>> o0Var, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f176940b = t1Var;
        this.f176941c = uVar;
        this.f176942d = o0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f176940b, this.f176941c, this.f176942d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176939a;
        if (i14 == 0) {
            r.b(obj);
            t1<uc.c<Object>> t1Var = this.f176940b;
            b bVar = new b(p0.s(new s1(t1Var, 2)));
            a aVar2 = new a(t1Var, this.f176941c, this.f176942d);
            this.f176939a = 1;
            if (bVar.collect(aVar2, this) == aVar) {
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
