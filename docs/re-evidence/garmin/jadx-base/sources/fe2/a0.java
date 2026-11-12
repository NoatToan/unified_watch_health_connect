package fe2;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0011B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfe2/a0;", "Lfe2/y;", "Ljava/util/Observer;", "Lo53/b0;", "", "deviceUnitId", "Lae2/e0;", "publisher", "Lxd2/a1;", "repository", "Lwd2/l;", "appDelegate", "Lkotlin/Function0;", "", "uploadTaskListener", "<init>", "(JLae2/e0;Lxd2/a1;Lwd2/l;Le23/a;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 implements y, Observer, o53.b0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f70586r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f70587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd2.a1 f70588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f70589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.m1 f70590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f70591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Observable f70592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedList f70593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f70594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f70595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ae2.g f70596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f70597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ae2.r f70598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f70599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DateTime f70600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f70601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f70602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f70603q;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultDataUploader$startUpload$1", f = "DefaultDataUploader.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70604a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a0.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Long l14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70604a;
            a0 a0Var = a0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                xd2.a1 a1Var = a0Var.f70588b;
                long j8 = a0Var.f70587a;
                this.f70604a = 1;
                obj = a1Var.c(j8, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            be2.g gVar = (be2.g) obj;
            a0Var.f70591e.debug("Upload with session info " + gVar);
            ae2.r.a aVar2 = ae2.r.f2989b;
            if (gVar == null || (str = gVar.f17772h) == null) {
                str = "";
            }
            aVar2.getClass();
            ae2.r rVarA = ae2.r.a.a(str);
            a0Var.f70598l = rVarA;
            a0Var.f70602p = rVarA != null;
            if (gVar != null && (l14 = gVar.f17773i) != null) {
                long jLongValue = l14.longValue();
                a0Var.f70591e.debug("Restored activity created time " + new DateTime(jLongValue));
                a0Var.f70600n = new DateTime(jLongValue);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultDataUploader$update$1", f = "DefaultDataUploader.kt", l = {111}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70606a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f70608c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f70608c = obj;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a0.this.new c(this.f70608c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70606a;
            if (i14 == 0) {
                o13.r.b(obj);
                ae2.g gVar = (ae2.g) this.f70608c;
                this.f70606a = 1;
                int i15 = a0.f70586r;
                a0 a0Var = a0.this;
                a0Var.getClass();
                Object objE0 = ge1.b.e0(o53.s0.f129406a, new c0(a0Var, gVar, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
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
    @v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultDataUploader$update$2", f = "DefaultDataUploader.kt", l = {121}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f70610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f70611c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, a0 a0Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f70610b = obj;
            this.f70611c = a0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f70610b, this.f70611c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70609a;
            if (i14 == 0) {
                o13.r.b(obj);
                ae2.t tVar = ((ae2.s) this.f70610b).f2992b;
                if (tVar != null) {
                    this.f70609a = 1;
                    if (a0.b(this.f70611c, tVar, this) == aVar) {
                        return aVar;
                    }
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
    @v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultDataUploader$update$3", f = "DefaultDataUploader.kt", l = {139, 142, 147}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f70613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f70614c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, a0 a0Var, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f70613b = obj;
            this.f70614c = a0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f70613b, this.f70614c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0075  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        
            if (fe2.a0.d(r6, r12, r11) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        
            if (fe2.a0.d(r6, r12, r11) == r0) goto L32;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70612a;
            Object obj2 = this.f70613b;
            a0 a0Var = this.f70614c;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    ae2.r rVar = ((ae2.w) obj2).f3001b;
                    this.f70612a = 2;
                } else {
                    if (i14 != 2 && i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            ae2.w wVar = (ae2.w) obj2;
            ae2.t tVar = wVar.f3002c;
            if (tVar == null) {
                if (a0Var.f70602p && a0Var.f70598l == null) {
                    ae2.r rVar2 = wVar.f3001b;
                    this.f70612a = 3;
                }
                return Unit.INSTANCE;
            }
            if (tVar instanceof ae2.t.a) {
                Logger logger = a0Var.f70591e;
                ae2.r rVar3 = a0Var.f70598l;
                ae2.r rVar4 = wVar.f3001b;
                logger.debug("current activity type " + rVar3 + " sport event type begin " + rVar4 + " activityType!=arg.sportType " + (!p005kotlin.jvm.internal.s.g(rVar3, rVar4)));
                ae2.r rVar5 = a0Var.f70598l;
                if (rVar5 == null || rVar5.equals(wVar.f3001b)) {
                    ae2.r rVar6 = ((ae2.w) obj2).f3001b;
                    this.f70612a = 2;
                } else {
                    ae2.t tVar2 = wVar.f3002c;
                    this.f70612a = 1;
                    if (a0.b(a0Var, tVar2, this) != aVar) {
                        ae2.r rVar7 = ((ae2.w) obj2).f3001b;
                        this.f70612a = 2;
                    }
                }
                return aVar;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.domain.DefaultDataUploader$update$4", f = "DefaultDataUploader.kt", l = {164, 167}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70615a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f70617c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f70617c = obj;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a0.this.new f(this.f70617c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
        
            if (fe2.a0.b(r9, r1, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
        
            if (fe2.a0.c(r1, r9, r8) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ae2.v vVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70615a;
            if (i14 == 0) {
                o13.r.b(obj);
                long j8 = a0.this.f70587a;
                Long l14 = ((ae2.u) this.f70617c).f2995a;
                if (l14 != null && j8 == l14.longValue() && (vVar = ((ae2.u) this.f70617c).f2996b) != null && p005kotlin.jvm.internal.s.g(vVar, ae2.v.b.f2999a)) {
                    p005kotlin.jvm.internal.m0 m0Var = new p005kotlin.jvm.internal.m0();
                    a0 a0Var = a0.this;
                    synchronized (a0Var.f70603q) {
                        try {
                            if (!a0Var.f70602p) {
                                m0Var.f105804a = true;
                            }
                            a0Var.f70602p = true;
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (m0Var.f105804a) {
                        a0 a0Var2 = a0.this;
                        ae2.t.a aVar2 = new ae2.t.a();
                        this.f70615a = 1;
                    }
                } else {
                    long j14 = a0.this.f70587a;
                    Long l15 = ((ae2.u) this.f70617c).f2995a;
                    if (l15 != null && j14 == l15.longValue()) {
                        ae2.u uVar = (ae2.u) this.f70617c;
                        if (uVar.f2996b == null) {
                            a0 a0Var3 = a0.this;
                            if (a0Var3.f70600n == null) {
                                DateTime dateTime = uVar.f2997c;
                                this.f70615a = 2;
                            }
                        }
                    }
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

    static {
        new a(null);
    }

    public a0(long j8, ae2.e0 e0Var, xd2.a1 a1Var, wd2.l lVar, e23.a<Unit> aVar) {
        e0Var.getClass();
        a1Var.getClass();
        lVar.getClass();
        this.f70587a = j8;
        this.f70588b = a1Var;
        this.f70589c = aVar;
        this.f70590d = g8.i.c();
        this.f70591e = i2.a("DefaultDataUploader");
        this.f70593g = new LinkedList();
        this.f70594h = new LinkedList();
        this.f70595i = new e0(j8, e0Var, a1Var, lVar, new z(this, 0));
        this.f70597k = new Object();
        this.f70599m = new Object();
        this.f70601o = new Object();
        this.f70603q = new Object();
    }

    public static final Object b(a0 a0Var, ae2.t tVar, v13.i iVar) throws Throwable {
        a0Var.getClass();
        Object objE0 = ge1.b.e0(o53.s0.f129406a, new b0(a0Var, tVar, null), iVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public static final Object c(a0 a0Var, DateTime dateTime, v13.i iVar) {
        Object objM;
        synchronized (a0Var.f70601o) {
            if (dateTime != null) {
                a0Var.f70600n = dateTime;
                Unit unit = Unit.INSTANCE;
            }
        }
        DateTime dateTime2 = a0Var.f70600n;
        return (dateTime2 == null || (objM = xd2.a1.m(a0Var.f70588b, a0Var.f70587a, new Long(dateTime2.getMillis()), null, null, iVar, 26)) != u13.a.COROUTINE_SUSPENDED) ? Unit.INSTANCE : objM;
    }

    public static final Object d(a0 a0Var, ae2.r rVar, e eVar) {
        synchronized (a0Var.f70599m) {
            a0Var.f70598l = rVar;
            Unit unit = Unit.INSTANCE;
        }
        Object objM = xd2.a1.m(a0Var.f70588b, a0Var.f70587a, null, rVar.f2990a, null, eVar, 22);
        return objM == u13.a.COROUTINE_SUSPENDED ? objM : Unit.INSTANCE;
    }

    @Override // fe2.y
    public final void a(Observable observable) {
        observable.getClass();
        Observable observable2 = this.f70592f;
        Logger logger = this.f70591e;
        if (observable2 != null) {
            logger.warn("StartUpload: already uploading, replacing dataProducer");
            Observable observable3 = this.f70592f;
            if (observable3 != null) {
                observable3.deleteObserver(this);
            }
        }
        logger.debug("Starting upload");
        ge1.b.T(this, null, null, new b(null), 3);
        this.f70592f = observable;
        observable.addObserver(this);
        e0 e0Var = this.f70595i;
        Logger logger2 = e0Var.f70719h;
        LinkedList linkedList = this.f70593g;
        linkedList.getClass();
        o53.c2 c2Var = e0Var.f70718g;
        if (c2Var != null && c2Var.isActive()) {
            logger2.warn("Already running, cannot begin");
            return;
        }
        e0Var.f70720i = linkedList;
        o53.c2 c2VarT = ge1.b.T(e0Var, null, null, new f0(e0Var, null), 3);
        e0Var.f70718g = c2VarT;
        c2VarT.J(new f2.o0(e0Var, 16));
        logger2.debug("Scheduled periodic upload task");
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = o53.s0.f129406a;
        return u53.o.f168762a.plus(this.f70590d);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        Long deviceId;
        Logger logger = this.f70591e;
        logger.debug("update called with arg = " + obj);
        boolean z14 = obj instanceof ae2.g;
        long j8 = this.f70587a;
        if (z14) {
            ae2.f fitnessPointData = ((ae2.g) obj).getFitnessPointData();
            if (fitnessPointData == null || (deviceId = fitnessPointData.getDeviceId()) == null || j8 != deviceId.longValue()) {
                return;
            }
            ge1.b.T(this, null, null, new c(obj, null), 3);
            return;
        }
        if (obj instanceof ae2.s) {
            Long l14 = ((ae2.s) obj).f2991a;
            if (l14 != null && j8 == l14.longValue()) {
                ge1.b.T(this, null, null, new d(obj, this, null), 3);
                return;
            }
            return;
        }
        if (!(obj instanceof ae2.w)) {
            if (obj instanceof ae2.u) {
                ge1.b.T(this, null, null, new f(obj, null), 3);
                return;
            } else {
                ds.e0.v("Unexpected arg data type: ", obj != null ? obj.getClass().getSimpleName() : null, logger);
                return;
            }
        }
        Long l15 = ((ae2.w) obj).f3000a;
        if (l15 != null && j8 == l15.longValue()) {
            ge1.b.T(this, null, null, new e(obj, this, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfe2/a0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
