package yc;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB)\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\f¢\u0006\u0004\b\n\u0010\rB3\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\f\u0012\b\b\u0002\u0010\t\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyc/f;", "", "T", "Landroidx/recyclerview/widget/o$f;", "diffCallback", "Landroidx/recyclerview/widget/y;", "updateCallback", "Lt13/g;", "mainDispatcher", "workerDispatcher", "<init>", "(Landroidx/recyclerview/widget/o$f;Landroidx/recyclerview/widget/y;Lt13/g;Lt13/g;)V", "Lo53/z;", "(Landroidx/recyclerview/widget/o$f;Landroidx/recyclerview/widget/y;Lo53/z;)V", "(Landroidx/recyclerview/widget/o$f;Landroidx/recyclerview/widget/y;Lo53/z;Lo53/z;)V", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.o.f<T> f195903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.y f195904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t13.g f195905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t13.g f195906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r53.p2 f195907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f195908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<k3<T>> f195909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f195910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f195911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r53.i<s> f195912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference<e23.l<s, Unit>> f195913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList<e23.l<s, Unit>> f195914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f195915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o13.t f195916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f195917o;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "T", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<Handler> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f195918a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yc/f$b", "Ljava/lang/Runnable;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference<s> f195919a = new AtomicReference<>(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f<T> f195920b;

        public b(f<T> fVar) {
            this.f195920b = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            s sVar = this.f195919a.get();
            if (sVar != null) {
                Iterator<T> it = this.f195920b.f195914l.iterator();
                while (it.hasNext()) {
                    ((e23.l) it.next()).invoke(sVar);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lyc/s;", "loadState", "", "invoke", "(Lyc/s;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.l<s, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f<T> f195921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f<T> fVar) {
            super(1);
            this.f195921a = fVar;
        }

        @Override // e23.l
        public final Unit invoke(s sVar) {
            s sVar2 = sVar;
            sVar2.getClass();
            f<T> fVar = this.f195921a;
            if (((Boolean) fVar.f195907e.getValue()).booleanValue()) {
                Handler handler = (Handler) fVar.f195916n.getValue();
                b bVar = fVar.f195917o;
                handler.removeCallbacks(bVar);
                bVar.f195919a.set(sVar2);
                handler.post(bVar);
            } else {
                Iterator<e23.l<s, Unit>> it = fVar.f195914l.iterator();
                while (it.hasNext()) {
                    it.next().invoke(sVar2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T", "", "isGettingItem"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @v13.e(c = "androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1", f = "AsyncPagingDataDiffer.kt", l = {}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<Boolean, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f195922a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f195922a = ((Boolean) obj).booleanValue();
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Boolean> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((d) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return Boolean.valueOf(!this.f195922a);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"yc/f$e", "Lyc/a3;", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends a3<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f<T> f195923m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f<T> fVar, t13.g gVar) {
            super(gVar, null, 2, null);
            this.f195923m = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // yc.a3
        public final Object c(z2 z2Var, v13.c cVar) throws Throwable {
            g gVar;
            z2.e eVar;
            f<T> fVar;
            e eVar2;
            if (cVar instanceof g) {
                gVar = (g) cVar;
                int i14 = gVar.f195968f;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    gVar.f195968f = i14 - Integer.MIN_VALUE;
                } else {
                    gVar = new g(this, cVar);
                }
            } else {
                gVar = new g(this, cVar);
            }
            Object objE0 = gVar.f195966d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = gVar.f195968f;
            if (i15 == 0) {
                o13.r.b(objE0);
                boolean z14 = z2Var instanceof z2.e;
                f<T> fVar2 = this.f195923m;
                if (z14) {
                    eVar = (z2.e) z2Var;
                    k3<T> k3Var = eVar.f196698a;
                    k3<T> k3Var2 = eVar.f196699b;
                    if (k3Var2.getSize() == 0) {
                        if (k3Var.getSize() > 0) {
                            fVar2.f195904b.c(0, k3Var.getSize());
                        }
                    } else if (k3Var.getSize() != 0) {
                        fVar2.f195909g.set(k3Var2);
                        try {
                            t13.g gVar2 = fVar2.f195906d;
                            h hVar = new h(eVar, fVar2, null);
                            gVar.f195963a = this;
                            gVar.f195964b = fVar2;
                            gVar.f195965c = eVar;
                            gVar.f195968f = 1;
                            objE0 = ge1.b.e0(gVar2, hVar, gVar);
                            if (objE0 == aVar) {
                                return aVar;
                            }
                            eVar2 = this;
                            fVar = fVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            fVar = fVar2;
                            fVar.f195909g.set(null);
                            throw th;
                        }
                    } else if (k3Var2.getSize() > 0) {
                        fVar2.f195904b.a(0, k3Var2.getSize());
                    }
                } else if (z2Var instanceof z2.d) {
                    z2.d dVar = (z2.d) z2Var;
                    int i16 = dVar.f196697c;
                    int size = dVar.f196695a.size();
                    int iMin = Math.min(i16, size);
                    int i17 = i16 - iMin;
                    int i18 = size - iMin;
                    if (iMin > 0) {
                        fVar2.f195904b.b(i17, iMin, null);
                    }
                    if (i18 > 0) {
                        fVar2.f195904b.c(0, i18);
                    }
                    int i19 = (dVar.f196696b - i16) + iMin;
                    if (i19 > 0) {
                        fVar2.f195904b.c(0, i19);
                    } else if (i19 < 0) {
                        fVar2.f195904b.a(0, -i19);
                    }
                } else if (z2Var instanceof z2.a) {
                    z2.a aVar2 = (z2.a) z2Var;
                    int i24 = aVar2.f196684a;
                    int i25 = aVar2.f196687d;
                    int size2 = aVar2.f196685b.size();
                    int iMin2 = Math.min(i25, size2);
                    int i26 = size2 - iMin2;
                    int i27 = i24 + iMin2;
                    if (iMin2 > 0) {
                        fVar2.f195904b.b(i24, iMin2, null);
                    }
                    if (i26 > 0) {
                        fVar2.f195904b.c(i27, i26);
                    }
                    int i28 = aVar2.f196686c;
                    int i29 = (i28 - i25) + iMin2;
                    int i30 = i24 + size2 + i28;
                    if (i29 > 0) {
                        fVar2.f195904b.c(i30 - i29, i29);
                    } else if (i29 < 0) {
                        fVar2.f195904b.a(i30, -i29);
                    }
                } else if (z2Var instanceof z2.c) {
                    z2.c cVar2 = (z2.c) z2Var;
                    int i34 = cVar2.f196694c;
                    int i35 = cVar2.f196693b;
                    int i36 = (i35 - cVar2.f196692a) - i34;
                    if (i36 > 0) {
                        fVar2.f195904b.c(0, i36);
                    } else if (i36 < 0) {
                        fVar2.f195904b.a(0, -i36);
                    }
                    int iMax = Math.max(0, i34 + i36);
                    int i37 = i35 - iMax;
                    if (i37 > 0) {
                        fVar2.f195904b.b(iMax, i37, null);
                    }
                } else if (z2Var instanceof z2.b) {
                    z2.b bVar = (z2.b) z2Var;
                    int i38 = bVar.f196688a;
                    int i39 = bVar.f196690c;
                    int i44 = bVar.f196691d;
                    int i45 = (i39 - bVar.f196689b) - i44;
                    int i46 = i38 + i39;
                    if (i45 > 0) {
                        fVar2.f195904b.c(i46 - i45, i45);
                    } else if (i45 < 0) {
                        fVar2.f195904b.a(i46, -i45);
                    }
                    int iMin3 = (i39 - i44) + (i45 < 0 ? Math.min(i44, -i45) : 0);
                    if (iMin3 > 0) {
                        fVar2.f195904b.b(i38, iMin3, null);
                    }
                }
                return Unit.INSTANCE;
            }
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = gVar.f195965c;
            fVar = gVar.f195964b;
            eVar2 = gVar.f195963a;
            try {
                o13.r.b(objE0);
            } catch (Throwable th4) {
                th = th4;
                fVar.f195909g.set(null);
                throw th;
            }
            j3 j3Var = (j3) objE0;
            fVar.f195909g.set(null);
            k3<T> k3Var3 = eVar.f196699b;
            k3<T> k3Var4 = eVar.f196698a;
            l3.b(k3Var3, fVar.f195904b, k3Var4, j3Var);
            int iC = l3.c(eVar.f196699b, j3Var, k3Var4, fVar.f195908f);
            fVar.f195908f = iC;
            eVar2.b(iC);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: yc.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lr53/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1", f = "AsyncPagingDataDiffer.kt", l = {40}, m = "invokeSuspend")
    public static final class C3650f extends v13.i implements e23.p<r53.j<? super s>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f195924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f195925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.i f195926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f195927d;

        /* JADX INFO: renamed from: yc.f$f$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j<s> f195928a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f195929b;

            /* JADX INFO: renamed from: yc.f$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @v13.e(c = "androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1$1", f = "AsyncPagingDataDiffer.kt", l = {224, 225, 229}, m = "emit")
            public static final class C3651a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f195930a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f195931b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public Object f195933d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Object f195934e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public r53.j f195935f;

                public C3651a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f195930a = obj;
                    this.f195931b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, f fVar) {
                this.f195929b = fVar;
                this.f195928a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
            
                if (r53.s.z(r10, r5, r0) == r1) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L30;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t7, t13.d<? super Unit> dVar) {
                C3651a c3651a;
                s sVar;
                r53.j<s> jVar;
                s sVar2;
                r53.j<s> jVar2;
                a<T> aVar;
                if (dVar instanceof C3651a) {
                    c3651a = (C3651a) dVar;
                    int i14 = c3651a.f195931b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3651a.f195931b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3651a = new C3651a(dVar);
                    }
                } else {
                    c3651a = new C3651a(dVar);
                }
                Object obj = c3651a.f195930a;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3651a.f195931b;
                if (i15 == 0) {
                    o13.r.b(obj);
                    sVar = (s) t7;
                    boolean zBooleanValue = ((Boolean) this.f195929b.f195907e.getValue()).booleanValue();
                    jVar = this.f195928a;
                    if (zBooleanValue) {
                        c3651a.f195933d = this;
                        c3651a.f195934e = sVar;
                        c3651a.f195935f = jVar;
                        c3651a.f195931b = 1;
                        if (gg.b.U(c3651a) != aVar2) {
                            sVar2 = sVar;
                            jVar2 = jVar;
                            aVar = this;
                        }
                    } else {
                        c3651a.f195933d = null;
                        c3651a.f195934e = null;
                        c3651a.f195931b = 3;
                    }
                    return aVar2;
                }
                if (i15 == 1) {
                    jVar2 = c3651a.f195935f;
                    sVar2 = (s) c3651a.f195934e;
                    aVar = (a) c3651a.f195933d;
                    o13.r.b(obj);
                } else if (i15 == 2) {
                    jVar2 = (r53.j) c3651a.f195934e;
                    sVar2 = (s) c3651a.f195933d;
                    o13.r.b(obj);
                    s sVar3 = sVar2;
                    jVar = jVar2;
                    sVar = sVar3;
                    c3651a.f195933d = null;
                    c3651a.f195934e = null;
                    c3651a.f195931b = 3;
                } else {
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
                r53.p2 p2Var = aVar.f195929b.f195907e;
                d dVar2 = new d(null);
                c3651a.f195933d = sVar2;
                c3651a.f195934e = jVar2;
                c3651a.f195935f = null;
                c3651a.f195931b = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3650f(r53.i iVar, t13.d dVar, f fVar) {
            super(2, dVar);
            this.f195926c = iVar;
            this.f195927d = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C3650f c3650f = new C3650f(this.f195926c, dVar, this.f195927d);
            c3650f.f195925b = obj;
            return c3650f;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super s> jVar, t13.d<? super Unit> dVar) {
            return ((C3650f) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f195924a;
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a((r53.j) this.f195925b, this.f195927d);
                this.f195924a = 1;
                if (this.f195926c.collect(aVar2, this) == aVar) {
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

    public f(androidx.recyclerview.widget.o.f<T> fVar, androidx.recyclerview.widget.y yVar, t13.g gVar, t13.g gVar2) {
        fVar.getClass();
        yVar.getClass();
        gVar.getClass();
        gVar2.getClass();
        this.f195903a = fVar;
        this.f195904b = yVar;
        this.f195905c = gVar;
        this.f195906d = gVar2;
        this.f195907e = r53.q2.a(Boolean.FALSE);
        this.f195909g = new AtomicReference<>(null);
        e eVar = new e(this, gVar);
        this.f195910h = eVar;
        this.f195911i = new AtomicInteger(0);
        r53.c2 c2Var = new r53.c2(new C3650f(r53.s.e(new r53.l1(eVar.f195746k), -1, q53.a.SUSPEND), null, this));
        x53.c cVar = o53.s0.f129406a;
        this.f195912j = r53.s.A(c2Var, u53.o.f168762a);
        r53.s.c(eVar.f195747l);
        this.f195913k = new AtomicReference<>(null);
        this.f195914l = new CopyOnWriteArrayList<>();
        this.f195915m = new c(this);
        this.f195916n = o13.m.b(a.f195918a);
        this.f195917o = new b(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(androidx.recyclerview.widget.o.f<T> fVar, androidx.recyclerview.widget.y yVar, t13.g gVar) {
        this(fVar, yVar, gVar, (t13.g) null, 8, (p005kotlin.jvm.internal.j) null);
        fVar.getClass();
        yVar.getClass();
        gVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public f(androidx.recyclerview.widget.o.f fVar, androidx.recyclerview.widget.y yVar, o53.z zVar) {
        this(fVar, yVar, (t13.g) zVar, (t13.g) o53.s0.f129406a);
        fVar.getClass();
        yVar.getClass();
        zVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(androidx.recyclerview.widget.o.f<T> fVar, androidx.recyclerview.widget.y yVar) {
        this(fVar, yVar, (t13.g) null, (t13.g) null, 12, (p005kotlin.jvm.internal.j) null);
        fVar.getClass();
        yVar.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(androidx.recyclerview.widget.o.f fVar, androidx.recyclerview.widget.y yVar, t13.g gVar, t13.g gVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            x53.c cVar = o53.s0.f129406a;
            gVar = u53.o.f168762a;
        }
        this(fVar, yVar, gVar, (i14 & 8) != 0 ? o53.s0.f129406a : gVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(androidx.recyclerview.widget.o.f fVar, androidx.recyclerview.widget.y yVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar = u53.o.f168762a;
        }
        this(fVar, yVar, zVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(androidx.recyclerview.widget.o.f fVar, androidx.recyclerview.widget.y yVar, o53.z zVar, o53.z zVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar = u53.o.f168762a;
        }
        this(fVar, yVar, zVar, (i14 & 8) != 0 ? o53.s0.f129406a : zVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public /* synthetic */ f(androidx.recyclerview.widget.o.f fVar, androidx.recyclerview.widget.y yVar, o53.z zVar, o53.z zVar2) {
        this(fVar, yVar, (t13.g) zVar, (t13.g) zVar2);
        fVar.getClass();
        yVar.getClass();
        zVar.getClass();
        zVar2.getClass();
    }
}
