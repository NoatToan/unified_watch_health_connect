package j02;

import ch.qos.logback.core.joran.action.Action;
import lc.u0;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.e3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lj02/j0;", "", "Ly1/e3;", "scrollableState", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function0;", "", "pixelPerSecondProvider", "<init>", "(Ly1/e3;Lo53/b0;Le23/a;)V", "b", "c", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f96073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.b0 f96074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Float> f96075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f96076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q53.b f96077e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj02/j0$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        BACKWARD,
        FORWARD;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f96081a;

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
                f96081a = iArr;
            }
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96088a;

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
            f96088a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.Scroller$start$3", f = "Scroller.kt", l = {94}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f96089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f96090b;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = j0.this.new e(dVar);
            eVar.f96090b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f96090b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f96089a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f96090b = null;
                this.f96089a = 1;
                if (j0.a(j0.this, b0Var, this) == aVar) {
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

    public j0(e3 e3Var, o53.b0 b0Var, e23.a<Float> aVar) {
        e3Var.getClass();
        b0Var.getClass();
        aVar.getClass();
        this.f96073a = e3Var;
        this.f96074b = b0Var;
        this.f96075c = aVar;
        this.f96077e = q53.l.a(-1, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [e23.a, j02.j0$b] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ee -> B:20:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x013a -> B:52:0x013c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(j02.j0 r21, o53.b0 r22, v13.c r23) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j02.j0.a(j02.j0, o53.b0, v13.c):java.lang.Object");
    }

    public final boolean b(b bVar) {
        int i14 = d.f96088a[bVar.ordinal()];
        e3 e3Var = this.f96073a;
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
        if (this.f96076d == null) {
            this.f96076d = ge1.b.T(this.f96074b, null, null, new e(null), 3);
        }
        this.f96077e.i(new c(bVar, f14, aVar, lVar));
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
        l0 l0Var;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i14 = l0Var.f96110c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l0Var.f96110c = i14 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar);
            }
        } else {
            l0Var = new l0(this, cVar);
        }
        Object obj = l0Var.f96108a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = l0Var.f96110c;
        if (i15 == 0) {
            o13.r.b(obj);
            c.f96082e.getClass();
            c cVar2 = c.f96083f;
            l0Var.f96110c = 1;
            if (this.f96077e.h(cVar2, l0Var) != aVar) {
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
        this.f96076d = null;
        return Unit.INSTANCE;
        c2 c2Var = this.f96076d;
        if (c2Var != null) {
            l0Var.f96110c = 2;
        }
        this.f96076d = null;
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u000eBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lj02/j0$c;", "", "Lj02/j0$b;", "direction", "", "speedMultiplier", "Lkotlin/Function0;", "maxScrollDistanceProvider", "Lkotlin/Function1;", "Lt13/d;", "", "onScroll", "<init>", "(Lj02/j0$b;FLe23/a;Le23/l;)V", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f96082e = new b(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f96083f = new c(b.FORWARD, 0.0f, new ik2.b(24), new a(null));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f96085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<Float> f96086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e23.l<t13.d<? super Unit>, Object> f96087d;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.list.Scroller$ScrollInfo$Companion$Null$2", f = "Scroller.kt", l = {}, m = "invokeSuspend", v = 2)
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
            this.f96084a = bVar;
            this.f96085b = f14;
            this.f96086c = aVar;
            this.f96087d = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f96084a == cVar.f96084a && Float.compare(this.f96085b, cVar.f96085b) == 0 && this.f96086c.equals(cVar.f96086c) && this.f96087d.equals(cVar.f96087d);
        }

        public final int hashCode() {
            return this.f96087d.hashCode() + q6.f.f(q6.f.d(this.f96085b, this.f96084a.hashCode() * 31, 31), 31, this.f96086c);
        }

        public final String toString() {
            return "ScrollInfo(direction=" + this.f96084a + ", speedMultiplier=" + this.f96085b + ", maxScrollDistanceProvider=" + this.f96086c + ", onScroll=" + this.f96087d + ")";
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj02/j0$c$b;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private b() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lj02/j0$a;", "", "<init>", "()V", "", "MAX_SCROLL_DURATION", "J", "ZERO_SCROLL_WAIT_DURATION", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
