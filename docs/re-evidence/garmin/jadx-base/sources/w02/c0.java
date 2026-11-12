package w02;

import ch.qos.logback.core.joran.action.Action;
import lc.u0;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.e3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lw02/c0;", "", "Ly1/e3;", "scrollableState", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function0;", "", "pixelPerSecondProvider", "<init>", "(Ly1/e3;Lo53/b0;Le23/a;)V", "a", "b", "c", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f181064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.b0 f181065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Float> f181066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f181067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q53.b f181068e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw02/c0$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        BACKWARD,
        FORWARD;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f181072a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.BACKWARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.FORWARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f181072a = iArr;
            }
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181079a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.BACKWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FORWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f181079a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.reorderable.Scroller$start$3", f = "ReorderableLazyListState.kt", l = {96}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f181080a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c0.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f181080a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f181080a = 1;
                if (c0.a(c0.this, this) == aVar) {
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

    static {
        new a(null);
    }

    public c0(e3 e3Var, o53.b0 b0Var, e23.a<Float> aVar) {
        e3Var.getClass();
        b0Var.getClass();
        aVar.getClass();
        this.f181064a = e3Var;
        this.f181065b = b0Var;
        this.f181066c = aVar;
        this.f181068e = q53.l.a(-1, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d A[PHI: r1
      0x005d: PHI (r1v4 w02.c0$c) = (r1v2 w02.c0$c), (r1v3 w02.c0$c), (r1v7 w02.c0$c), (r1v9 w02.c0$c) binds: [B:19:0x0059, B:37:0x00d6, B:48:0x011a, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d6 -> B:20:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0117 -> B:48:0x011a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(w02.c0 r20, v13.c r21) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w02.c0.a(w02.c0, v13.c):java.lang.Object");
    }

    public final boolean b(b bVar) {
        int i14 = d.f181079a[bVar.ordinal()];
        e3 e3Var = this.f181064a;
        if (i14 == 1) {
            return e3Var.e();
        }
        if (i14 == 2) {
            return e3Var.c();
        }
        u0.r();
        return false;
    }

    public final boolean c(b bVar, float f14, e23.a<Float> aVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar) {
        bVar.getClass();
        if (!b(bVar)) {
            return false;
        }
        if (this.f181067d == null) {
            this.f181067d = ge1.b.T(this.f181065b, null, null, new e(null), 3);
        }
        this.f181068e.i(new c(bVar, f14, aVar, lVar));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (g8.i.r(r6, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(v13.c cVar) {
        e0 e0Var;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f181101c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f181101c = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object obj = e0Var.f181099a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f181101c;
        if (i15 == 0) {
            o13.r.b(obj);
            c.f181073e.getClass();
            c cVar2 = c.f181074f;
            e0Var.f181101c = 1;
            if (this.f181068e.h(cVar2, e0Var) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        this.f181067d = null;
        return Unit.INSTANCE;
        c2 c2Var = this.f181067d;
        if (c2Var != null) {
            e0Var.f181101c = 2;
        }
        this.f181067d = null;
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u000eBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lw02/c0$c;", "", "Lw02/c0$b;", "direction", "", "speedMultiplier", "Lkotlin/Function0;", "maxScrollDistanceProvider", "Lkotlin/Function1;", "Lt13/d;", "", "onScroll", "<init>", "(Lw02/c0$b;FLe23/a;Le23/l;)V", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f181073e = new b(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f181074f = new c(b.FORWARD, 0.0f, new vv0.u(24), new a(null));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f181075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f181076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<Float> f181077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.l<t13.d<? super Unit>, Object> f181078d;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.ui.reorderable.Scroller$ScrollInfo$Companion$Null$2", f = "ReorderableLazyListState.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {
            public a(t13.d<? super a> dVar) {
                super(1, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super Unit> dVar) {
                return new a(dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(b bVar, float f14, e23.a<Float> aVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar) {
            bVar.getClass();
            aVar.getClass();
            lVar.getClass();
            this.f181075a = bVar;
            this.f181076b = f14;
            this.f181077c = aVar;
            this.f181078d = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f181075a == cVar.f181075a && Float.compare(this.f181076b, cVar.f181076b) == 0 && this.f181077c.equals(cVar.f181077c) && this.f181078d.equals(cVar.f181078d);
        }

        public final int hashCode() {
            return this.f181078d.hashCode() + q6.f.f(q6.f.d(this.f181076b, this.f181075a.hashCode() * 31, 31), 31, this.f181077c);
        }

        public final String toString() {
            return "ScrollInfo(direction=" + this.f181075a + ", speedMultiplier=" + this.f181076b + ", maxScrollDistanceProvider=" + this.f181077c + ", onScroll=" + this.f181078d + ")";
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw02/c0$c$b;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private b() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lw02/c0$a;", "", "<init>", "()V", "", "MAX_SCROLL_DURATION", "J", "ZERO_SCROLL_WAIT_DURATION", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
