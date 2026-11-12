package yc;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u000f\u0010\u0011B[\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lyc/n1;", "", "Key", "Value", "Lkotlin/Function1;", "Lt13/d;", "Lyc/h3;", "pagingSourceFactory", "initialKey", "Lyc/u2;", "config", "Lyc/n3;", "remoteMediator", "<init>", "(Le23/l;Ljava/lang/Object;Lyc/u2;Lyc/n3;)V", "a", "b", "c", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n1<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<t13.d<? super h3<Key, Value>>, Object> f196243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Key f196244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2 f196245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u<Boolean> f196246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u<Unit> f196247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r53.i<v2<Value>> f196248f;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyc/n1$a;", "", "Key", "Value", "Lyc/s1;", "snapshot", "Lyc/i3;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lo53/l1;", "job", "<init>", "(Lyc/s1;Lyc/i3;Lo53/l1;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1<Key, Value> f196249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i3<Key, Value> f196250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o53.l1 f196251c;

        public a(s1<Key, Value> s1Var, i3<Key, Value> i3Var, o53.l1 l1Var) {
            s1Var.getClass();
            l1Var.getClass();
            this.f196249a = s1Var;
            this.f196250b = i3Var;
            this.f196251c = l1Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyc/n1$b;", "", "Key", "Value", "Lyc/n0;", "Lyc/s1;", "pageFetcherSnapshot", "<init>", "(Lyc/n1;Lyc/s1;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b<Key, Value> implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1<Key, Value> f196252a;

        public b(n1 n1Var, s1<Key, Value> s1Var) {
            s1Var.getClass();
            this.f196252a = s1Var;
        }

        @Override // yc.n0
        public final void a(t4 t4Var) {
            k0 k0Var = this.f196252a.f196410h;
            k0Var.getClass();
            k0Var.f196105a.a(t4Var instanceof t4.a ? (t4.a) t4Var : null, new m0(t4Var));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyc/n1$c;", "Lyc/q4;", "Lyc/u;", "", "retryEventBus", "<init>", "(Lyc/n1;Lyc/u;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class c implements q4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u<Unit> f196253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1<Key, Value> f196254b;

        public c(n1 n1Var, u<Unit> uVar) {
            uVar.getClass();
            this.f196254b = n1Var;
            this.f196253a = uVar;
        }

        @Override // yc.q4
        public final void a() {
            this.f196254b.f196246d.a(Boolean.TRUE);
        }

        @Override // yc.q4
        public final void retry() {
            this.f196253a.a(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/e4;", "Lyc/v2;", "", "<anonymous>", "(Lyc/e4;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<e4<v2<Value>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f196255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f196256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n3<Key, Value> f196257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n1<Key, Value> f196258d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {63, 63}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<r53.j<? super Boolean>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f196259a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f196260b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ t3<Key, Value> f196261c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t3<Key, Value> t3Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f196261c = t3Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f196261c, dVar);
                aVar.f196260b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(r53.j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
                return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0040  */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
            
                if (r7 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
            
                if (r1.emit(r7, r6) == r0) goto L23;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                r53.j jVar;
                n3.a aVar;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f196259a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        jVar = (r53.j) this.f196260b;
                        o13.r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                jVar = (r53.j) this.f196260b;
                t3<Key, Value> t3Var = this.f196261c;
                if (t3Var != null) {
                    this.f196260b = jVar;
                    this.f196259a = 1;
                    obj = t3Var.d(this);
                } else {
                    aVar = null;
                    Boolean boolValueOf = Boolean.valueOf(aVar == n3.a.LAUNCH_INITIAL_REFRESH);
                    this.f196260b = null;
                    this.f196259a = 2;
                }
                return aVar2;
                aVar = (n3.a) obj;
                Boolean boolValueOf2 = Boolean.valueOf(aVar == n3.a.LAUNCH_INITIAL_REFRESH);
                this.f196260b = null;
                this.f196259a = 2;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Key", "Value", "Lyc/n1$a;", "previousGeneration", "", "triggerRemoteRefresh", "<anonymous>", "(Lyc/n1$a;Z)Lyc/n1$a;"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {73, 77}, m = "invokeSuspend")
        public static final class b extends v13.i implements e23.q<a<Key, Value>, Boolean, t13.d<? super a<Key, Value>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public h3 f196262a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f196263b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ a f196264c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ boolean f196265d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t3<Key, Value> f196266e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ n1<Key, Value> f196267f;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
                public a(Object obj) {
                    super(0, obj, n1.class, "refresh", "refresh()V", 0);
                }

                @Override // e23.a
                public final Unit invoke() {
                    ((n1) this.receiver).f196246d.a(Boolean.TRUE);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t3<Key, Value> t3Var, n1<Key, Value> n1Var, t13.d<? super b> dVar) {
                super(3, dVar);
                this.f196266e = t3Var;
                this.f196267f = n1Var;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Boolean bool, Object obj2) {
                boolean zBooleanValue = bool.booleanValue();
                b bVar = new b(this.f196266e, this.f196267f, (t13.d) obj2);
                bVar.f196264c = (a) obj;
                bVar.f196265d = zBooleanValue;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0065  */
            /* JADX WARN: Code duplicated, block: B:31:0x0068  */
            /* JADX WARN: Code duplicated, block: B:42:0x0083  */
            /* JADX WARN: Code duplicated, block: B:43:0x0086  */
            /* JADX WARN: Code duplicated, block: B:45:0x0089  */
            /* JADX WARN: Code duplicated, block: B:49:0x0092  */
            /* JADX WARN: Code duplicated, block: B:51:0x0095  */
            /* JADX WARN: Code duplicated, block: B:54:0x009a  */
            /* JADX WARN: Code duplicated, block: B:56:0x009e  */
            /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
            /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                a aVar;
                Object objA;
                t3<Key, Value> t3Var;
                i3<Key, Value> i3Var;
                h3 h3Var;
                Object objE;
                h3 h3Var2;
                List<h3.b.c<Key, Value>> list;
                i3<Key, Value> i3Var2;
                Integer num;
                i3<Key, Value> i3Var3;
                Object objC;
                Integer num2;
                i3<Key, Value> i3Var4;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f196263b;
                n1<Key, Value> n1Var = this.f196267f;
                if (i14 == 0) {
                    o13.r.b(obj);
                    aVar = this.f196264c;
                    if (this.f196265d && (t3Var = this.f196266e) != null) {
                        t3Var.c();
                    }
                    h3<Key, Value> h3Var3 = aVar != null ? aVar.f196249a.f196404b : null;
                    this.f196264c = aVar;
                    this.f196263b = 1;
                    objA = n1.a(n1Var, h3Var3, this);
                    if (objA != aVar2) {
                    }
                    return aVar2;
                }
                if (i14 == 1) {
                    aVar = this.f196264c;
                    o13.r.b(obj);
                    objA = obj;
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h3Var2 = this.f196262a;
                    aVar = this.f196264c;
                    o13.r.b(obj);
                    objE = obj;
                }
                i3Var = (i3) objE;
                h3Var = h3Var2;
                if (i3Var != null) {
                    list = i3Var.f196061a;
                } else {
                    list = null;
                }
                if ((list != null || list.isEmpty()) && aVar != null && (i3Var2 = aVar.f196250b) != null && (!i3Var2.f196061a.isEmpty())) {
                }
                if (i3Var != null) {
                    num = i3Var.f196062b;
                } else {
                    num = null;
                }
                if (num == null) {
                    if (aVar != null || (i3Var4 = aVar.f196250b) == null) {
                        num2 = null;
                    } else {
                        num2 = i3Var4.f196062b;
                    }
                    if (num2 != null) {
                        i3Var = aVar.f196250b;
                    }
                }
                i3Var3 = i3Var;
                if (i3Var3 == null) {
                    objC = n1Var.f196244b;
                } else {
                    objC = h3Var.c(i3Var3);
                    g3.f195987a.getClass();
                    if (g3.a(3)) {
                        Objects.toString(objC);
                        h3Var.toString();
                    }
                }
                Object obj2 = objC;
                if (aVar != null) {
                    aVar.f196249a.f196414l.c(null);
                }
                if (aVar != null) {
                    aVar.f196251c.c(null);
                }
                return new a(new s1(obj2, h3Var, n1Var.f196245c, n1Var.f196247e.f196495b, this.f196266e, i3Var3, new a(n1Var)), i3Var3, g8.i.c());
                h3 h3Var4 = (h3) objA;
                if (aVar != null) {
                    s1<Key, Value> s1Var = aVar.f196249a;
                    this.f196264c = aVar;
                    this.f196262a = h3Var4;
                    this.f196263b = 2;
                    objE = s1Var.e(this);
                    if (objE != aVar2) {
                        h3Var2 = h3Var4;
                        i3Var = (i3) objE;
                        h3Var = h3Var2;
                    }
                    return aVar2;
                }
                i3Var = null;
                h3Var = h3Var4;
                if (i3Var != null) {
                    list = i3Var.f196061a;
                } else {
                    list = null;
                }
                i3Var = list != null ? i3Var2 : i3Var2;
                if (i3Var != null) {
                    num = i3Var.f196062b;
                } else {
                    num = null;
                }
                if (num == null) {
                    if (aVar != null) {
                        num2 = null;
                    } else {
                        num2 = null;
                    }
                    if (num2 != null) {
                        i3Var = aVar.f196250b;
                    }
                }
                i3Var3 = i3Var;
                if (i3Var3 == null) {
                    objC = n1Var.f196244b;
                } else {
                    objC = h3Var.c(i3Var3);
                    g3.f195987a.getClass();
                    if (g3.a(3)) {
                        Objects.toString(objC);
                        h3Var.toString();
                    }
                }
                Object obj3 = objC;
                if (aVar != null) {
                    aVar.f196249a.f196414l.c(null);
                }
                if (aVar != null) {
                    aVar.f196251c.c(null);
                }
                return new a(new s1(obj3, h3Var, n1Var.f196245c, n1Var.f196247e.f196495b, this.f196266e, i3Var3, new a(n1Var)), i3Var3, g8.i.c());
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/m1;", "it", "", "<anonymous>", "(Lyc/m1;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", l = {}, m = "invokeSuspend")
        public static final class c extends v13.i implements e23.p<m1<Value>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f196268a;

            public c(t13.d<? super c> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                c cVar = new c(dVar);
                cVar.f196268a = obj;
                return cVar;
            }

            @Override // e23.p
            public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
                return ((c) create((m1) obj, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                m1 m1Var = (m1) this.f196268a;
                g3.f195987a.getClass();
                if (g3.a(2)) {
                    Objects.toString(m1Var);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: yc.n1$d$d, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C3666d implements r53.j, p005kotlin.jvm.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e4<v2<Value>> f196269a;

            public C3666d(e4<v2<Value>> e4Var) {
                this.f196269a = e4Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Object objH = this.f196269a.h((v2) obj, dVar);
                return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof r53.j) && (obj instanceof p005kotlin.jvm.internal.n)) {
                    return getFunctionDelegate().equals(((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // p005kotlin.jvm.internal.n
            public final o13.h<?> getFunctionDelegate() {
                return new p005kotlin.jvm.internal.q(2, this.f196269a, e4.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {105}, m = "invokeSuspend")
        public static final class e extends v13.i implements e23.q<r53.j<? super v2<Value>>, a<Key, Value>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f196270a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ r53.j f196271b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f196272c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ n1 f196273d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ t3 f196274e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(t13.d dVar, n1 n1Var, t3 t3Var) {
                super(3, dVar);
                this.f196273d = n1Var;
                this.f196274e = t3Var;
            }

            @Override // e23.q
            public final Object invoke(Object obj, Object obj2, t13.d<? super Unit> dVar) {
                e eVar = new e(dVar, this.f196273d, this.f196274e);
                eVar.f196271b = (r53.j) obj;
                eVar.f196272c = obj2;
                return eVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f196270a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    r53.j jVar = this.f196271b;
                    a aVar2 = (a) this.f196272c;
                    s1<Key, Value> s1Var = aVar2.f196249a;
                    o53.l1 l1Var = aVar2.f196251c;
                    n1 n1Var = this.f196273d;
                    n1Var.getClass();
                    t3 t3Var = this.f196274e;
                    v2 v2Var = new v2(new r53.m1(t3Var == null ? s1Var.f196415m : d4.a(new p(l1Var, new r1(t3Var, s1Var, new k1(), null), null)), new c(null)), new c(n1Var, n1Var.f196247e), new b(n1Var, aVar2.f196249a), null, 8, null);
                    this.f196270a = 1;
                    if (jVar.emit(v2Var, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n3<Key, Value> n3Var, n1<Key, Value> n1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f196257c = n3Var;
            this.f196258d = n1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f196257c, this.f196258d, dVar);
            dVar2.f196256b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((d) create((e4) obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o3 o3Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f196255a;
            if (i14 == 0) {
                o13.r.b(obj);
                e4 e4Var = (e4) this.f196256b;
                n3<Key, Value> n3Var = this.f196257c;
                if (n3Var != null) {
                    e4Var.getClass();
                    o3Var = new o3(e4Var, n3Var);
                } else {
                    o3Var = null;
                }
                n1<Key, Value> n1Var = this.f196258d;
                r53.i iVarA = d4.a(new h0(new r53.l1(new r53.c2(new g0(null, new r53.v(new a(o3Var, null), n1Var.f196246d.f196495b), new b(o3Var, n1Var, null), null))), new e(null, n1Var, o3Var), null));
                C3666d c3666d = new C3666d(e4Var);
                this.f196255a = 1;
                if (iVarA.collect(c3666d, this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public n1(e23.l<? super t13.d<? super h3<Key, Value>>, ? extends Object> lVar, Key key, u2 u2Var, n3<Key, Value> n3Var) {
        lVar.getClass();
        u2Var.getClass();
        this.f196243a = lVar;
        this.f196244b = key;
        this.f196245c = u2Var;
        this.f196246d = new u<>(null, 1, null);
        this.f196247e = new u<>(null, 1, null);
        this.f196248f = d4.a(new d(n3Var, this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(n1 n1Var, h3 h3Var, v13.c cVar) {
        o1 o1Var;
        n1Var.getClass();
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i14 = o1Var.f196286e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o1Var.f196286e = i14 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(n1Var, cVar);
            }
        } else {
            o1Var = new o1(n1Var, cVar);
        }
        Object objInvoke = o1Var.f196284c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o1Var.f196286e;
        if (i15 == 0) {
            o13.r.b(objInvoke);
            e23.l<t13.d<? super h3<Key, Value>>, Object> lVar = n1Var.f196243a;
            o1Var.f196282a = n1Var;
            o1Var.f196283b = h3Var;
            o1Var.f196286e = 1;
            objInvoke = lVar.invoke(o1Var);
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h3Var = o1Var.f196283b;
            n1Var = o1Var.f196282a;
            o13.r.b(objInvoke);
        }
        h3 h3Var2 = (h3) objInvoke;
        if (h3Var2 instanceof t) {
            ((t) h3Var2).a(n1Var.f196245c.f196510a);
        }
        if (h3Var2 == h3Var) {
            vb.h.z("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
            return null;
        }
        p1 p1Var = new p1(n1Var);
        h3Var2.getClass();
        h3Var2.f196005a.b(p1Var);
        if (h3Var != null) {
            h3Var.f196005a.c(new q1(n1Var));
        }
        if (h3Var != null) {
            h3Var.d();
        }
        g3.f195987a.getClass();
        if (g3.a(3)) {
            h3Var2.toString();
        }
        return h3Var2;
    }

    public /* synthetic */ n1(e23.l lVar, Object obj, u2 u2Var, n3 n3Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(lVar, obj, u2Var, (i14 & 8) != 0 ? null : n3Var);
    }
}
