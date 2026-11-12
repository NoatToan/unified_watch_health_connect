package r53;

import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.google.android.gms.wallet.WalletConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lr53/p2;", "T", "Ls53/a;", "Lr53/r2;", "Lr53/z1;", "Lr53/c;", "Ls53/t;", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lh53/b;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p2<T> extends s53.a<r2> implements z1<T>, c<T>, s53.t<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f150792f = AtomicReferenceFieldUpdater.newUpdater(p2.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f150793e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "collect")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p2 f150794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f150795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r2 f150796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public o53.l1 f150797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f150798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f150799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p2<T> f150800g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f150801h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p2<T> p2Var, t13.d<? super a> dVar) {
            super(dVar);
            this.f150800g = p2Var;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150799f = obj;
            this.f150801h |= Integer.MIN_VALUE;
            return this.f150800g.collect(null, this);
        }
    }

    public p2(Object obj) {
        this._state$volatile = obj;
    }

    @Override // r53.d2
    public final List<T> a() {
        return p13.w.c(getValue());
    }

    @Override // r53.z1
    public final boolean b(T t7, T t14) {
        if (t7 == null) {
            t7 = (T) s53.w.f157598a;
        }
        if (t14 == null) {
            t14 = (T) s53.w.f157598a;
        }
        return k(t7, t14);
    }

    @Override // r53.y1
    public final void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00f7 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:36:0x008f, B:38:0x0097, B:41:0x009e, B:42:0x00a2, B:44:0x00a5, B:54:0x00c6, B:57:0x00d6, B:58:0x00f0, B:64:0x0104, B:67:0x010d, B:61:0x00f7, B:63:0x00fd, B:46:0x00ab, B:50:0x00b2, B:21:0x004b, B:24:0x0056, B:35:0x0080), top: B:72:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:0: B:58:0x00f0->B:79:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00d5 -> B:36:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // r53.i
    public final java.lang.Object collect(r53.j<? super T> r14, t13.d<?> r15) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.p2.collect(r53.j, t13.d):java.lang.Object");
    }

    @Override // r53.y1
    public final boolean d(T t7) {
        setValue(t7);
        return true;
    }

    @Override // s53.t
    public final i<T> e(t13.g gVar, int i14, q53.a aVar) {
        u53.x xVar = q2.f150809a;
        return (((i14 < 0 || i14 >= 2) && i14 != -2) || aVar != q53.a.DROP_OLDEST) ? g2.d(this, gVar, i14, aVar) : this;
    }

    @Override // r53.y1, r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) {
        setValue(t7);
        return Unit.INSTANCE;
    }

    @Override // r53.z1
    public final T getValue() {
        u53.x xVar = s53.w.f157598a;
        T t7 = (T) f150792f.get(this);
        if (t7 == xVar) {
            return null;
        }
        return t7;
    }

    @Override // s53.a
    public final s53.c h() {
        return new r2();
    }

    @Override // s53.a
    public final s53.c[] i() {
        return new r2[2];
    }

    public final boolean k(Object obj, Object obj2) {
        int i14;
        Object obj3;
        u53.x xVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f150792f;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !p005kotlin.jvm.internal.s.g(obj4, obj)) {
                return false;
            }
            if (p005kotlin.jvm.internal.s.g(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i15 = this.f150793e;
            if ((i15 & 1) != 0) {
                this.f150793e = i15 + 2;
                return true;
            }
            int i16 = i15 + 1;
            this.f150793e = i16;
            Object obj5 = this.f157461a;
            Unit unit = Unit.INSTANCE;
            while (true) {
                r2[] r2VarArr = (r2[]) obj5;
                if (r2VarArr != null) {
                    for (r2 r2Var : r2VarArr) {
                        if (r2Var != null) {
                            AtomicReference<Object> atomicReference = r2Var.f150846a;
                            while (true) {
                                Object obj6 = atomicReference.get();
                                if (obj6 == null || obj6 == (xVar = q2.f150810b)) {
                                    break;
                                }
                                u53.x xVar2 = q2.f150809a;
                                if (obj6 != xVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj6, xVar2)) {
                                            int i17 = o13.q.f128596b;
                                            ((o53.k) obj6).resumeWith(Unit.INSTANCE);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj6);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj6, xVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj6);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i14 = this.f150793e;
                    if (i14 == i16) {
                        this.f150793e = i16 + 1;
                        return true;
                    }
                    obj3 = this.f157461a;
                    Unit unit2 = Unit.INSTANCE;
                }
                obj5 = obj3;
                i16 = i14;
            }
        }
    }

    @Override // r53.z1
    public final void setValue(T t7) {
        if (t7 == null) {
            t7 = (T) s53.w.f157598a;
        }
        k(null, t7);
    }
}
