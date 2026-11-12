package androidx.room;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0001\u000e¨\u0006\u000f"}, d2 = {"Landroidx/room/n0;", "T", "Landroidx/lifecycle/s0;", "Landroidx/room/b0;", "database", "Landroidx/room/k;", TtmlNode.RUBY_CONTAINER, "", "inTransaction", "", "", "tableNames", "<init>", "(Landroidx/room/b0;Landroidx/room/k;Z[Ljava/lang/String;)V", "Landroidx/room/g0;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n0<T> extends androidx.lifecycle.s0<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0 f10900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k f10901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f10902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f10903o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f10904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f10905q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f10906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t13.g f10907s;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/n0$a", "Landroidx/room/m$b;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends m.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n0<T> f10908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String[] strArr, n0<T> n0Var) {
            super(strArr);
            this.f10908b = n0Var;
        }

        @Override // androidx.room.m.b
        public final void a(Set<String> set) {
            set.getClass();
            n.a aVarA = n.a.a();
            a0.c cVar = new a0.c(this.f10908b, 15);
            if (aVarA.f122013a.a()) {
                cVar.run();
            } else {
                aVarA.b(cVar);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.room.RoomTrackingLiveData$onActive$1", f = "RoomTrackingLiveData.android.kt", l = {123}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n0<T> f10910b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n0<T> n0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f10910b = n0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f10910b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f10909a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f10909a = 1;
                if (n0.n(this.f10910b, this) == aVar) {
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

    private n0(b0 b0Var, k kVar, boolean z14, String[] strArr) {
        this.f10900l = b0Var;
        this.f10901m = kVar;
        this.f10902n = z14;
        this.f10903o = new a(strArr, this);
        this.f10904p = new AtomicBoolean(true);
        this.f10905q = new AtomicBoolean(false);
        this.f10906r = new AtomicBoolean(false);
        this.f10907s = b0Var.inCompatibilityMode() ? z14 ? b0Var.getTransactionContext$room_runtime() : b0Var.getQueryContext() : t13.h.f161748a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: all -> 0x0032, Exception -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0034, blocks: (B:12:0x002b, B:30:0x0077), top: B:48:0x002b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[LOOP:0: B:28:0x0071->B:33:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x008f A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002b, B:28:0x0071, B:30:0x0077, B:37:0x008f, B:34:0x0085, B:35:0x008c), top: B:47:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006f -> B:28:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x009a -> B:42:0x009b). Please report as a decompilation issue!!! */
    public static final Object n(n0 n0Var, v13.c cVar) {
        o0 o0Var;
        int i14;
        Object obj;
        Object objO;
        AtomicBoolean atomicBoolean = n0Var.f10904p;
        AtomicBoolean atomicBoolean2 = n0Var.f10905q;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i15 = o0Var.f10914d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                o0Var.f10914d = i15 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(n0Var, cVar);
            }
        } else {
            o0Var = new o0(n0Var, cVar);
        }
        Object obj2 = o0Var.f10912b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = o0Var.f10914d;
        try {
            if (i16 == 0) {
                o13.r.b(obj2);
                if (n0Var.f10906r.compareAndSet(false, true)) {
                    m invalidationTracker = n0Var.f10900l.getInvalidationTracker();
                    a aVar2 = n0Var.f10903o;
                    invalidationTracker.getClass();
                    aVar2.getClass();
                    if (invalidationTracker.a(new g1(invalidationTracker, aVar2))) {
                        jd.x.a(new n(invalidationTracker, null));
                    }
                }
                if (atomicBoolean2.compareAndSet(false, true)) {
                    obj = null;
                    i14 = 0;
                    while (atomicBoolean.compareAndSet(true, false)) {
                        o0Var.f10911a = 1;
                        o0Var.f10914d = 1;
                        objO = n0Var.o(o0Var);
                        if (objO == aVar) {
                            return aVar;
                        }
                        obj = objO;
                        i14 = 1;
                    }
                    if (i14 != 0) {
                        n0Var.j(obj);
                    }
                    atomicBoolean2.set(false);
                } else {
                    i14 = 0;
                }
                if (i14 != 0) {
                }
                return Unit.INSTANCE;
            }
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = o0Var.f10911a;
            try {
                o13.r.b(obj2);
                obj = obj2;
                i14 = i17;
                while (atomicBoolean.compareAndSet(true, false)) {
                    o0Var.f10911a = 1;
                    o0Var.f10914d = 1;
                    objO = n0Var.o(o0Var);
                    if (objO == aVar) {
                        return aVar;
                    }
                    obj = objO;
                    i14 = 1;
                }
                if (i14 != 0) {
                    n0Var.j(obj);
                }
                atomicBoolean2.set(false);
                if (i14 != 0 || !atomicBoolean.get()) {
                    return Unit.INSTANCE;
                }
                if (atomicBoolean2.compareAndSet(false, true)) {
                    obj = null;
                    i14 = 0;
                    while (atomicBoolean.compareAndSet(true, false)) {
                        o0Var.f10911a = 1;
                        o0Var.f10914d = 1;
                        objO = n0Var.o(o0Var);
                        if (objO == aVar) {
                            return aVar;
                        }
                        obj = objO;
                        i14 = 1;
                    }
                    if (i14 != 0) {
                        n0Var.j(obj);
                    }
                    atomicBoolean2.set(false);
                } else {
                    i14 = 0;
                }
                if (i14 != 0) {
                }
                return Unit.INSTANCE;
            } catch (Exception e4) {
                throw new RuntimeException("Exception while computing database live data.", e4);
            }
        } catch (Throwable th3) {
            atomicBoolean2.set(false);
            throw th3;
        }
    }

    @Override // androidx.lifecycle.s0
    public final void h() {
        k kVar = this.f10901m;
        kVar.getClass();
        kVar.f10858b.add(this);
        ge1.b.T(this.f10900l.getCoroutineScope(), this.f10907s, null, new b(this, null), 2);
    }

    @Override // androidx.lifecycle.s0
    public final void i() {
        k kVar = this.f10901m;
        kVar.getClass();
        kVar.f10858b.remove(this);
    }

    public abstract Object o(o0 o0Var);

    public /* synthetic */ n0(b0 b0Var, k kVar, boolean z14, String[] strArr, p005kotlin.jvm.internal.j jVar) {
        this(b0Var, kVar, z14, strArr);
    }
}
