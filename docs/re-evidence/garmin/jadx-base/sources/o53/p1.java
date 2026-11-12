package o53;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@o13.e
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\r\u000e\u000fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004R\u0013\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b8\u0002X\u0082\u0004¨\u0006\u0010"}, d2 = {"Lo53/p1;", "Lo53/l1;", "Lo53/q;", "Lo53/y1;", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Z)V", "Lh53/b;", "", "_state", "Lo53/o;", "_parentHandle", "c", "b", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p1 implements l1, q, y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f129381a = AtomicReferenceFieldUpdater.newUpdater(p1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f129382b = AtomicReferenceFieldUpdater.newUpdater(p1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo53/p1$a;", "T", "Lo53/k;", "Lt13/d;", "delegate", "Lo53/p1;", "job", "<init>", "(Lt13/d;Lo53/p1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> extends k<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final p1 f129383i;

        public a(t13.d<? super T> dVar, p1 p1Var) {
            super(dVar, 1);
            this.f129383i = p1Var;
        }

        @Override // o53.k
        public final Throwable n(p1 p1Var) {
            Throwable thC;
            p1 p1Var2 = this.f129383i;
            p1Var2.getClass();
            Object obj = p1.f129381a.get(p1Var2);
            if (!(obj instanceof c) || (thC = ((c) obj).c()) == null) {
                return obj instanceof v ? ((v) obj).f129416a : p1Var.Q();
            }
            return thC;
        }

        @Override // o53.k
        public final String x() {
            return "AwaitContinuation";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo53/p1$b;", "Lo53/o1;", "Lo53/p1;", "parent", "Lo53/p1$c;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lo53/p;", "child", "", "proposedUpdate", "<init>", "(Lo53/p1;Lo53/p1$c;Lo53/p;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends o1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final p1 f129384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c f129385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p f129386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f129387h;

        public b(p1 p1Var, c cVar, p pVar, Object obj) {
            this.f129384e = p1Var;
            this.f129385f = cVar;
            this.f129386g = pVar;
            this.f129387h = obj;
        }

        @Override // o53.o1
        public final boolean i() {
            return false;
        }

        @Override // o53.o1
        public final void j(Throwable th3) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.f129381a;
            p1 p1Var = this.f129384e;
            p1Var.getClass();
            p pVar = this.f129386g;
            p pVarJ0 = p1.j0(pVar);
            c cVar = this.f129385f;
            Object obj = this.f129387h;
            if (pVarJ0 == null || !p1Var.s0(cVar, pVarJ0, obj)) {
                u1 u1Var = cVar.f129391a;
                u1Var.getClass();
                u1Var.c(new u53.j(2), 2);
                p pVarJ1 = p1.j0(pVar);
                if (pVarJ1 == null || !p1Var.s0(cVar, pVarJ1, obj)) {
                    p1Var.t(p1Var.V(cVar, obj));
                }
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004R\u0013\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000e8\u0002X\u0082\u0004R\u0013\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e8\u0002X\u0082\u0004¨\u0006\u0011"}, d2 = {"Lo53/p1$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lo53/g1;", "Lo53/u1;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lo53/u1;ZLjava/lang/Throwable;)V", "Lh53/a;", "_isCompleting", "Lh53/b;", "_rootCause", "_exceptionsHolder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements g1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f129388b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f129389c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f129390d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u1 f129391a;

        public c(u1 u1Var, boolean z14, Throwable th3) {
            this.f129391a = u1Var;
            this._isCompleting$volatile = z14 ? 1 : 0;
            this._rootCause$volatile = th3;
        }

        @Override // o53.g1
        /* JADX INFO: renamed from: a, reason: from getter */
        public final u1 getF129337a() {
            return this.f129391a;
        }

        public final void b(Throwable th3) {
            Throwable thC = c();
            if (thC == null) {
                f129389c.set(this, th3);
                return;
            }
            if (th3 == thC) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129390d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th3);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th3);
                    return;
                } else {
                    ds.e0.t(obj, "State is ");
                    return;
                }
            }
            if (th3 == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th3);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        public final Throwable c() {
            return (Throwable) f129389c.get(this);
        }

        public final boolean d() {
            return c() != null;
        }

        public final ArrayList e(Throwable th3) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129390d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    ds.e0.t(obj, "State is ");
                    return null;
                }
                arrayList = (ArrayList) obj;
            }
            Throwable thC = c();
            if (thC != null) {
                arrayList.add(0, thC);
            }
            if (th3 != null && !th3.equals(thC)) {
                arrayList.add(th3);
            }
            atomicReferenceFieldUpdater.set(this, q1.f129401e);
            return arrayList;
        }

        @Override // o53.g1
        /* JADX INFO: renamed from: isActive */
        public final boolean getF129421a() {
            return c() == null;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Finishing[cancelling=");
            sb3.append(d());
            sb3.append(", completing=");
            sb3.append(f129388b.get(this) == 1);
            sb3.append(", rootCause=");
            sb3.append(c());
            sb3.append(", exceptions=");
            sb3.append(f129390d.get(this));
            sb3.append(", list=");
            sb3.append(this.f129391a);
            sb3.append(']');
            return sb3.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc53/l;", "Lo53/l1;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
    public static final class d extends v13.h implements e23.p<c53.l<? super l1>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u53.k f129392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p f129393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f129394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f129395d;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = p1.this.new d(dVar);
            dVar2.f129395d = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(c53.l<? super l1> lVar, t13.d<? super Unit> dVar) {
            return ((d) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0067  */
        /* JADX WARN: Code duplicated, block: B:24:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0069 -> B:27:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007c -> B:27:0x007f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r6.f129394c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L18
                o53.p r1 = r6.f129393b
                u53.k r3 = r6.f129392a
                java.lang.Object r4 = r6.f129395d
                c53.l r4 = (c53.l) r4
                o13.r.b(r7)
                goto L7f
            L18:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r7)
                r7 = 0
                return r7
            L1f:
                o13.r.b(r7)
                goto L84
            L23:
                o13.r.b(r7)
                java.lang.Object r7 = r6.f129395d
                c53.l r7 = (c53.l) r7
                o53.p1 r1 = o53.p1.this
                r1.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o53.p1.f129381a
                java.lang.Object r1 = r4.get(r1)
                boolean r4 = r1 instanceof o53.p
                if (r4 == 0) goto L46
                o53.p r1 = (o53.p) r1
                o53.q r1 = r1.f129379e
                r6.f129394c = r3
                u13.a r7 = r7.a(r1, r6)
                if (r7 != r0) goto L84
                goto L7e
            L46:
                boolean r3 = r1 instanceof o53.g1
                if (r3 == 0) goto L84
                o53.g1 r1 = (o53.g1) r1
                o53.u1 r1 = r1.getF129337a()
                if (r1 == 0) goto L84
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = u53.l.f168749a
                java.lang.Object r3 = r3.get(r1)
                r3.getClass()
                u53.l r3 = (u53.l) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r7
            L61:
                boolean r7 = r1.equals(r3)
                if (r7 != 0) goto L84
                boolean r7 = r1 instanceof o53.p
                if (r7 == 0) goto L7f
                r7 = r1
                o53.p r7 = (o53.p) r7
                o53.q r5 = r7.f129379e
                r6.f129395d = r4
                r6.f129392a = r3
                r6.f129393b = r7
                r6.f129394c = r2
                u13.a r7 = r4.a(r5, r6)
                if (r7 != r0) goto L7f
            L7e:
                return r0
            L7f:
                u53.l r1 = r1.f()
                goto L61
            L84:
                kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o53.p1.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public p1(boolean z14) {
        this._state$volatile = z14 ? q1.f129403g : q1.f129402f;
    }

    public static p j0(u53.l lVar) {
        while (lVar.g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u53.l.f168750b;
            u53.l lVarD = lVar.d();
            if (lVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (u53.l) obj;
                    if (!lVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = lVarD;
            }
        }
        while (true) {
            lVar = lVar.f();
            if (!lVar.g()) {
                if (lVar instanceof p) {
                    return (p) lVar;
                }
                if (lVar instanceof u1) {
                    return null;
                }
            }
        }
    }

    public static String q0(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof g1) {
                return ((g1) obj).getF129421a() ? "Active" : "New";
            }
            return obj instanceof v ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.d()) {
            return "Cancelling";
        }
        return c.f129388b.get(cVar) == 1 ? "Completing" : "Active";
    }

    public void A(Object obj) {
        t(obj);
    }

    public final Object C(t13.d<Object> dVar) {
        Object obj;
        do {
            obj = f129381a.get(this);
            if (!(obj instanceof g1)) {
                if (obj instanceof v) {
                    throw ((v) obj).f129416a;
                }
                return q1.a(obj);
            }
        } while (p0(obj) < 0);
        a aVar = new a(u13.f.b(dVar), this);
        aVar.q();
        aVar.t(new v0(g8.i.O(this, new z1(aVar))));
        Object objP = aVar.p();
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[PHI: r0
      0x0040: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x000a, B:16:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0050, B:26:0x005d, B:31:0x0065, B:37:0x007c, B:35:0x0072, B:36:0x0076), top: B:81:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[Catch: all -> 0x0063, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0050, B:26:0x005d, B:31:0x0065, B:37:0x007c, B:35:0x0072, B:36:0x0076), top: B:81:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[Catch: all -> 0x0063, TryCatch #0 {, blocks: (B:24:0x0050, B:26:0x005d, B:31:0x0065, B:37:0x007c, B:35:0x0072, B:36:0x0076), top: B:81:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00b4->B:98:?, LOOP_END, SYNTHETIC] */
    public final boolean D(Object obj) {
        Throwable thU;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        Throwable thC;
        u53.x xVar;
        g1 g1Var;
        u1 u1VarA0;
        c cVar;
        Object objR0;
        Object objR1 = q1.f129397a;
        if (Z()) {
            do {
                Object obj3 = f129381a.get(this);
                if (obj3 instanceof g1) {
                    if (obj3 instanceof c) {
                        if (c.f129388b.get((c) obj3) == 1) {
                        }
                    }
                    objR1 = r0(obj3, new v(U(obj), false, 2, null));
                }
                objR1 = q1.f129397a;
                break;
            } while (objR1 == q1.f129399c);
            if (objR1 != q1.f129398b) {
                if (objR1 == q1.f129397a) {
                    thU = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f129381a;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof c) {
                            synchronized (obj2) {
                                if (c.f129390d.get((c) obj2) == q1.f129401e) {
                                    xVar = q1.f129400d;
                                } else {
                                    boolean zD = ((c) obj2).d();
                                    if (obj == null || !zD) {
                                        if (thU == null) {
                                            thU = U(obj);
                                        }
                                        ((c) obj2).b(thU);
                                    }
                                    thC = zD ? null : ((c) obj2).c();
                                    if (thC != null) {
                                        k0(((c) obj2).f129391a, thC);
                                    }
                                    xVar = q1.f129397a;
                                }
                            }
                        } else if (obj2 instanceof g1) {
                            if (thU == null) {
                                thU = U(obj);
                            }
                            g1Var = (g1) obj2;
                            if (g1Var.getF129421a()) {
                                u1VarA0 = a0(g1Var);
                                if (u1VarA0 == null) {
                                    continue;
                                } else {
                                    cVar = new c(u1VarA0, false, thU);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, g1Var, cVar)) {
                                            k0(u1VarA0, thU);
                                            xVar = q1.f129397a;
                                        } else if (atomicReferenceFieldUpdater.get(this) != g1Var) {
                                        }
                                    }
                                }
                            } else {
                                objR0 = r0(obj2, new v(thU, false, 2, null));
                                if (objR0 != q1.f129397a) {
                                    ds.e0.t(obj2, "Cannot happen in ");
                                    return false;
                                }
                                if (objR0 != q1.f129399c) {
                                    objR1 = objR0;
                                    break;
                                }
                            }
                        } else {
                            xVar = q1.f129400d;
                        }
                        objR1 = xVar;
                        break;
                    }
                }
                if (objR1 != q1.f129397a && objR1 != q1.f129398b) {
                    if (objR1 == q1.f129400d) {
                        return false;
                    }
                    t(objR1);
                    return true;
                }
            }
        } else {
            if (objR1 == q1.f129397a) {
                thU = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f129381a;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof c) {
                        synchronized (obj2) {
                            if (c.f129390d.get((c) obj2) == q1.f129401e) {
                                xVar = q1.f129400d;
                            } else {
                                boolean zD2 = ((c) obj2).d();
                                if (obj == null) {
                                    if (thU == null) {
                                        thU = U(obj);
                                    }
                                    ((c) obj2).b(thU);
                                } else {
                                    if (thU == null) {
                                        thU = U(obj);
                                    }
                                    ((c) obj2).b(thU);
                                }
                                if (zD2) {
                                }
                                if (thC != null) {
                                    k0(((c) obj2).f129391a, thC);
                                }
                                xVar = q1.f129397a;
                            }
                        }
                    } else if (obj2 instanceof g1) {
                        if (thU == null) {
                            thU = U(obj);
                        }
                        g1Var = (g1) obj2;
                        if (g1Var.getF129421a()) {
                            u1VarA0 = a0(g1Var);
                            if (u1VarA0 == null) {
                                continue;
                            } else {
                                cVar = new c(u1VarA0, false, thU);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, g1Var, cVar)) {
                                        k0(u1VarA0, thU);
                                        xVar = q1.f129397a;
                                    } else if (atomicReferenceFieldUpdater.get(this) != g1Var) {
                                    }
                                }
                            }
                        } else {
                            objR0 = r0(obj2, new v(thU, false, 2, null));
                            if (objR0 != q1.f129397a) {
                                ds.e0.t(obj2, "Cannot happen in ");
                                return false;
                            }
                            if (objR0 != q1.f129399c) {
                                objR1 = objR0;
                                break;
                            }
                        }
                    } else {
                        xVar = q1.f129400d;
                    }
                    objR1 = xVar;
                    break;
                }
            }
            if (objR1 != q1.f129397a) {
                if (objR1 == q1.f129400d) {
                    return false;
                }
                t(objR1);
                return true;
            }
        }
        return true;
    }

    @Override // o53.l1
    public final o E(p1 p1Var) {
        p pVar = new p(p1Var);
        pVar.f129376d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129381a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof x0) {
                x0 x0Var = (x0) obj;
                if (x0Var.f129421a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                n0(x0Var);
            } else {
                Throwable thC = null;
                if (!(obj instanceof g1)) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    v vVar = obj2 instanceof v ? (v) obj2 : null;
                    pVar.j(vVar != null ? vVar.f129416a : null);
                    return w1.f129420a;
                }
                u1 f129391a = ((g1) obj).getF129337a();
                if (f129391a != null) {
                    if (!f129391a.c(pVar, 7)) {
                        boolean zC = f129391a.c(pVar, 3);
                        Object obj3 = atomicReferenceFieldUpdater.get(this);
                        if (obj3 instanceof c) {
                            thC = ((c) obj3).c();
                        } else {
                            v vVar2 = obj3 instanceof v ? (v) obj3 : null;
                            if (vVar2 != null) {
                                thC = vVar2.f129416a;
                            }
                        }
                        pVar.j(thC);
                        if (zC) {
                            break;
                        }
                        return w1.f129420a;
                    }
                    break;
                }
                o0((o1) obj);
            }
        }
        return pVar;
    }

    public void H(CancellationException cancellationException) {
        D(cancellationException);
    }

    public final boolean I(Throwable th3) {
        if (!f0()) {
            boolean z14 = th3 instanceof CancellationException;
            o oVar = (o) f129382b.get(this);
            if (oVar == null || oVar == w1.f129420a) {
                return z14;
            }
            return oVar.b(th3) || z14;
        }
        return true;
    }

    @Override // o53.l1
    public final u0 J(e23.l<? super Throwable, Unit> lVar) {
        return e0(true, new k1(lVar));
    }

    public String M() {
        return "Job was cancelled";
    }

    public boolean N(Throwable th3) {
        if (th3 instanceof CancellationException) {
            return true;
        }
        return D(th3) && getF129372c();
    }

    @Override // o53.l1
    public final Object P(t13.d<? super Unit> dVar) throws Throwable {
        Object obj;
        do {
            obj = f129381a.get(this);
            if (!(obj instanceof g1)) {
                g8.i.v(dVar.getF157466b());
                return Unit.INSTANCE;
            }
        } while (p0(obj) < 0);
        k kVar = new k(u13.f.b(dVar), 1);
        kVar.q();
        kVar.t(new v0(g8.i.O(this, new a2(kVar))));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objP != aVar) {
            objP = Unit.INSTANCE;
        }
        return objP == aVar ? objP : Unit.INSTANCE;
    }

    @Override // o53.l1
    public final CancellationException Q() {
        CancellationException cancellationException;
        Object obj = f129381a.get(this);
        if (obj instanceof c) {
            Throwable thC = ((c) obj).c();
            if (thC == null) {
                ds.e0.t(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thC, this) : cancellationException;
        }
        if (obj instanceof g1) {
            ds.e0.t(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof v)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th3 = ((v) obj).f129416a;
        cancellationException = th3 instanceof CancellationException ? (CancellationException) th3 : null;
        return cancellationException == null ? new JobCancellationException(M(), th3, this) : cancellationException;
    }

    @Override // o53.y1
    public final CancellationException R() {
        Throwable thC;
        Object obj = f129381a.get(this);
        if (obj instanceof c) {
            thC = ((c) obj).c();
        } else if (obj instanceof v) {
            thC = ((v) obj).f129416a;
        } else {
            if (obj instanceof g1) {
                ds.e0.t(obj, "Cannot be cancelling child in this state: ");
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(q0(obj)), thC, this) : cancellationException;
    }

    public final void T(g1 g1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129382b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.dispose();
            atomicReferenceFieldUpdater.set(this, w1.f129420a);
        }
        CompletionHandlerException completionHandlerException = null;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th3 = vVar != null ? vVar.f129416a : null;
        if (g1Var instanceof o1) {
            try {
                ((o1) g1Var).j(th3);
                return;
            } catch (Throwable th4) {
                c0(new CompletionHandlerException("Exception in completion handler " + g1Var + " for " + this, th4));
                return;
            }
        }
        u1 f129391a = g1Var.getF129337a();
        if (f129391a != null) {
            f129391a.c(new u53.j(1), 1);
            Object obj2 = u53.l.f168749a.get(f129391a);
            obj2.getClass();
            for (u53.l lVarF = (u53.l) obj2; !lVarF.equals(f129391a); lVarF = lVarF.f()) {
                if (lVarF instanceof o1) {
                    try {
                        ((o1) lVarF).j(th3);
                    } catch (Throwable th5) {
                        if (completionHandlerException != null) {
                            o13.g.a(completionHandlerException, th5);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lVarF + " for " + this, th5);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                c0(completionHandlerException);
            }
        }
    }

    public final Throwable U(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th3 = (Throwable) obj;
            return th3 == null ? new JobCancellationException(M(), null, this) : th3;
        }
        obj.getClass();
        return ((y1) obj).R();
    }

    public final Object V(c cVar, Object obj) {
        Throwable thX;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th3 = vVar != null ? vVar.f129416a : null;
        synchronized (cVar) {
            cVar.d();
            ArrayList<Throwable> arrayListE = cVar.e(th3);
            thX = X(cVar, arrayListE);
            if (thX != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th4 : arrayListE) {
                    if (th4 != thX && th4 != thX && !(th4 instanceof CancellationException) && setNewSetFromMap.add(th4)) {
                        o13.g.a(thX, th4);
                    }
                }
            }
        }
        if (thX != null && thX != th3) {
            obj = new v(thX, false, 2, null);
        }
        if (thX != null && (I(thX) || b0(thX))) {
            obj.getClass();
            v.f129415b.compareAndSet((v) obj, 0, 1);
        }
        l0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129381a;
        Object h1Var = obj instanceof g1 ? new h1((g1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, h1Var) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        T(cVar, obj);
        return obj;
    }

    public final Object W() throws Throwable {
        Object obj = f129381a.get(this);
        if (obj instanceof g1) {
            vb.h.z("This job has not completed yet");
            return null;
        }
        if (obj instanceof v) {
            throw ((v) obj).f129416a;
        }
        return q1.a(obj);
    }

    public final Throwable X(c cVar, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (cVar.d()) {
                return new JobCancellationException(M(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th3 = (Throwable) next;
        if (th3 != null) {
            return th3;
        }
        Throwable th4 = (Throwable) arrayList.get(0);
        if (th4 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th5 = (Throwable) obj2;
                if (th5 != th4 && (th5 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th6 = (Throwable) obj;
            if (th6 != null) {
                return th6;
            }
        }
        return th4;
    }

    /* JADX INFO: renamed from: Y */
    public boolean getF129372c() {
        return true;
    }

    public boolean Z() {
        return this instanceof s;
    }

    @Override // o53.l1
    public final c53.j<l1> a() {
        return new c53.m(new d(null));
    }

    public final u1 a0(g1 g1Var) {
        u1 f129391a = g1Var.getF129337a();
        if (f129391a != null) {
            return f129391a;
        }
        if (g1Var instanceof x0) {
            return new u1();
        }
        if (g1Var instanceof o1) {
            o0((o1) g1Var);
            return null;
        }
        ds.e0.t(g1Var, "State should have list: ");
        return null;
    }

    public boolean b0(Throwable th3) {
        return false;
    }

    @Override // o53.l1
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(M(), null, this);
        }
        H(cancellationException);
    }

    public void c0(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void d0(l1 l1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129382b;
        if (l1Var == null) {
            atomicReferenceFieldUpdater.set(this, w1.f129420a);
            return;
        }
        l1Var.start();
        o oVarE = l1Var.E(this);
        atomicReferenceFieldUpdater.set(this, oVarE);
        if (e()) {
            oVarE.dispose();
            atomicReferenceFieldUpdater.set(this, w1.f129420a);
        }
    }

    @Override // o53.l1
    public final boolean e() {
        return !(f129381a.get(this) instanceof g1);
    }

    public final u0 e0(boolean z14, o1 o1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z15;
        boolean zC;
        o1Var.f129376d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f129381a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            z15 = true;
            if (!(obj instanceof x0)) {
                if (!(obj instanceof g1)) {
                    z15 = false;
                    break;
                }
                g1 g1Var = (g1) obj;
                u1 f129391a = g1Var.getF129337a();
                if (f129391a == null) {
                    o0((o1) obj);
                } else {
                    if (o1Var.i()) {
                        c cVar = g1Var instanceof c ? (c) g1Var : null;
                        Throwable thC = cVar != null ? cVar.c() : null;
                        if (thC != null) {
                            if (z14) {
                                o1Var.j(thC);
                            }
                            return w1.f129420a;
                        }
                        zC = f129391a.c(o1Var, 5);
                    } else {
                        zC = f129391a.c(o1Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                x0 x0Var = (x0) obj;
                if (x0Var.f129421a) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, o1Var)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    n0(x0Var);
                }
            }
        }
        if (z15) {
            return o1Var;
        }
        if (z14) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            v vVar = obj2 instanceof v ? (v) obj2 : null;
            o1Var.j(vVar != null ? vVar.f129416a : null);
        }
        return w1.f129420a;
    }

    public Object f() {
        return W();
    }

    public boolean f0() {
        return this instanceof f;
    }

    @Override // t13.g
    public final <R> R fold(R r14, e23.p<? super R, ? super t13.g.a, ? extends R> pVar) {
        return (R) t13.g.a.C3052a.a(this, r14, pVar);
    }

    public final boolean g0(Object obj) {
        Object objR0;
        do {
            objR0 = r0(f129381a.get(this), obj);
            if (objR0 == q1.f129397a) {
                return false;
            }
            if (objR0 == q1.f129398b) {
                return true;
            }
        } while (objR0 == q1.f129399c);
        t(objR0);
        return true;
    }

    @Override // t13.g
    public final <E extends t13.g.a> E get(t13.g.b<E> bVar) {
        return (E) t13.g.a.C3052a.b(this, bVar);
    }

    @Override // t13.g.a
    public final t13.g.b<?> getKey() {
        return l1.f129368i0;
    }

    public final Object h0(Object obj) {
        Object objR0;
        do {
            objR0 = r0(f129381a.get(this), obj);
            if (objR0 == q1.f129397a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                v vVar = obj instanceof v ? (v) obj : null;
                throw new IllegalStateException(str, vVar != null ? vVar.f129416a : null);
            }
        } while (objR0 == q1.f129399c);
        return objR0;
    }

    public String i0() {
        return getClass().getSimpleName();
    }

    @Override // o53.l1
    public boolean isActive() {
        Object obj = f129381a.get(this);
        return (obj instanceof g1) && ((g1) obj).getF129421a();
    }

    @Override // o53.l1
    public final boolean isCancelled() {
        Object obj = f129381a.get(this);
        if (obj instanceof v) {
            return true;
        }
        return (obj instanceof c) && ((c) obj).d();
    }

    public final void k0(u1 u1Var, Throwable th3) {
        u1Var.getClass();
        u1Var.c(new u53.j(4), 4);
        Object obj = u53.l.f168749a.get(u1Var);
        obj.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (u53.l lVarF = (u53.l) obj; !lVarF.equals(u1Var); lVarF = lVarF.f()) {
            if ((lVarF instanceof o1) && ((o1) lVarF).i()) {
                try {
                    ((o1) lVarF).j(th3);
                } catch (Throwable th4) {
                    if (completionHandlerException != null) {
                        o13.g.a(completionHandlerException, th4);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lVarF + " for " + this, th4);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            c0(completionHandlerException);
        }
        I(th3);
    }

    @Override // o53.q
    public final void l(p1 p1Var) {
        D(p1Var);
    }

    public void l0(Object obj) {
    }

    public void m0() {
    }

    @Override // t13.g
    public final t13.g minusKey(t13.g.b<?> bVar) {
        return t13.g.a.C3052a.c(this, bVar);
    }

    public final void n0(x0 x0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u1 u1Var = new u1();
        Object f1Var = u1Var;
        if (!x0Var.f129421a) {
            f1Var = new f1(u1Var);
        }
        do {
            atomicReferenceFieldUpdater = f129381a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, x0Var, f1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == x0Var);
    }

    public final void o0(o1 o1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u1 u1Var = new u1();
        o1Var.getClass();
        u53.l.f168750b.set(u1Var, o1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u53.l.f168749a;
        atomicReferenceFieldUpdater2.set(u1Var, o1Var);
        loop0: while (atomicReferenceFieldUpdater2.get(o1Var) == o1Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(o1Var, o1Var, u1Var)) {
                    u1Var.e(o1Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(o1Var) == o1Var);
        }
        u53.l lVarF = o1Var.f();
        do {
            atomicReferenceFieldUpdater = f129381a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o1Var, lVarF)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o1Var);
    }

    public boolean p(Object obj) {
        return g0(obj);
    }

    public final int p0(Object obj) {
        boolean z14 = obj instanceof x0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129381a;
        if (z14) {
            if (((x0) obj).f129421a) {
                return 0;
            }
            x0 x0Var = q1.f129403g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            m0();
            return 1;
        }
        if (!(obj instanceof f1)) {
            return 0;
        }
        u1 u1Var = ((f1) obj).f129337a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        m0();
        return 1;
    }

    @Override // t13.g
    public final t13.g plus(t13.g gVar) {
        return t13.g.a.C3052a.d(gVar, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final Object r0(Object obj, Object obj2) {
        if (!(obj instanceof g1)) {
            return q1.f129397a;
        }
        if (((obj instanceof x0) || (obj instanceof o1)) && !(obj instanceof p) && !(obj2 instanceof v)) {
            g1 g1Var = (g1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f129381a;
            u53.x xVar = q1.f129397a;
            Object h1Var = obj2 instanceof g1 ? new h1((g1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, g1Var, h1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != g1Var) {
                    return q1.f129399c;
                }
            }
            l0(obj2);
            T(g1Var, obj2);
            return obj2;
        }
        g1 g1Var2 = (g1) obj;
        u1 u1VarA0 = a0(g1Var2);
        if (u1VarA0 == null) {
            return q1.f129399c;
        }
        c cVar = g1Var2 instanceof c ? (c) g1Var2 : null;
        if (cVar == null) {
            cVar = new c(u1VarA0, false, null);
        }
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        synchronized (cVar) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c.f129388b;
            if (atomicIntegerFieldUpdater.get(cVar) == 1) {
                return q1.f129397a;
            }
            atomicIntegerFieldUpdater.set(cVar, 1);
            if (cVar != g1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f129381a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, g1Var2, cVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != g1Var2) {
                        return q1.f129399c;
                    }
                }
            }
            boolean zD = cVar.d();
            v vVar = obj2 instanceof v ? (v) obj2 : null;
            if (vVar != null) {
                cVar.b(vVar.f129416a);
            }
            ?? C = zD ? 0 : cVar.c();
            r0Var.f105810a = C;
            Unit unit = Unit.INSTANCE;
            if (C != 0) {
                k0(u1VarA0, C);
            }
            p pVarJ0 = j0(u1VarA0);
            if (pVarJ0 != null && s0(cVar, pVarJ0, obj2)) {
                return q1.f129398b;
            }
            u1VarA0.c(new u53.j(2), 2);
            p pVarJ1 = j0(u1VarA0);
            return (pVarJ1 == null || !s0(cVar, pVarJ1, obj2)) ? V(cVar, obj2) : q1.f129398b;
        }
    }

    public final boolean s0(c cVar, p pVar, Object obj) {
        do {
            q qVar = pVar.f129379e;
            b bVar = new b(this, cVar, pVar, obj);
            if ((qVar instanceof p1 ? ((p1) qVar).e0(false, bVar) : qVar.w(false, false, new n1(bVar))) != w1.f129420a) {
                return true;
            }
            pVar = j0(pVar);
        } while (pVar != null);
        return false;
    }

    @Override // o53.l1
    public final boolean start() {
        int iP0;
        do {
            iP0 = p0(f129381a.get(this));
            if (iP0 == 0) {
                return false;
            }
        } while (iP0 != 1);
        return true;
    }

    public void t(Object obj) {
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i0() + CoreConstants.CURLY_LEFT + q0(f129381a.get(this)) + CoreConstants.CURLY_RIGHT);
        sb3.append('@');
        sb3.append(f0.u(this));
        return sb3.toString();
    }

    @Override // o53.l1
    public final u0 w(boolean z14, boolean z15, n1 n1Var) {
        return e0(z15, z14 ? new j1(n1Var) : new k1(n1Var));
    }
}
