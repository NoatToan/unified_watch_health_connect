package mt0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0010\u0011\u0012\u0013B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lmt0/b1;", "Ls51/c;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/p;", "Lo53/b0;", "coroutineScope", "Lyt0/r0;", "challengesRepo", "Lmt0/b1$d;", "challengeSubset", "Lmt0/b1$c;", "dataFilter", "", "cachedChallenges", "<init>", "(Lo53/b0;Lyt0/r0;Lmt0/b1$d;Lmt0/b1$c;Ljava/util/List;)V", "b", "d", "c", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b1 extends s51.c<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.p> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o53.b0 f120519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yt0.r0 f120520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f120521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f120522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.leaderboard.model.p> f120523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Logger f120524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kk1.a f120525k;

    public interface c {
        List<com.garmin.android.apps.connectmobile.leaderboard.model.p> a(List<com.garmin.android.apps.connectmobile.leaderboard.model.p> list);

        Object b(List<com.garmin.android.apps.connectmobile.leaderboard.model.p> list, t13.d<? super Unit> dVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt0/b1$d;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum d {
        GENERAL,
        ADVENTURE
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AvailableBadgeChallengesDataSource$loadInitial$1", f = "AvailableBadgeChallengesDataSource.kt", l = {43, 62}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f120534a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ yc.h2.c<Integer> f120536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ yc.h2.b<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.p> f120537d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/p;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AvailableBadgeChallengesDataSource$loadInitial$1$result$1", f = "AvailableBadgeChallengesDataSource.kt", l = {46, 47, 50}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends com.garmin.android.apps.connectmobile.leaderboard.model.p>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f120538a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f120539b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ yc.h2.c<Integer> f120540c;

            /* JADX INFO: renamed from: mt0.b1$e$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C2289a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f120541a;

                static {
                    int[] iArr = new int[d.values().length];
                    try {
                        iArr[d.GENERAL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[d.ADVENTURE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f120541a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b1 b1Var, yc.h2.c<Integer> cVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f120539b = b1Var;
                this.f120540c = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f120539b, this.f120540c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends com.garmin.android.apps.connectmobile.leaderboard.model.p>>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
            
                if (r8 == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
            
                if (r8 == r0) goto L27;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f120538a;
                yc.h2.c<Integer> cVar = this.f120540c;
                b1 b1Var = this.f120539b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        this.f120538a = 2;
                        obj = b1Var.f120520f.b(1, cVar.f196002a, !(((c80.p) obj) instanceof c80.p.c), this);
                    } else {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                o13.r.b(obj);
                                return (com.garmin.android.apps.connectmobile.v2) obj;
                            }
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return (com.garmin.android.apps.connectmobile.v2) obj;
                }
                o13.r.b(obj);
                int i15 = C2289a.f120541a[b1Var.f120521g.ordinal()];
                if (i15 == 1) {
                    zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
                    c80.q qVar = c80.q.SOCIAL;
                    this.f120538a = 1;
                    obj = j1Var.j(qVar, this);
                    if (obj != aVar) {
                        this.f120538a = 2;
                        obj = b1Var.f120520f.b(1, cVar.f196002a, !(((c80.p) obj) instanceof c80.p.c), this);
                    }
                } else {
                    if (i15 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    yt0.r0 r0Var = b1Var.f120520f;
                    int i16 = cVar.f196002a;
                    this.f120538a = 3;
                    obj = r0Var.d(1, i16, this);
                }
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(yc.h2.c<Integer> cVar, yc.h2.b<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.p> bVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f120536c = cVar;
            this.f120537d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b1.this.new e(this.f120536c, this.f120537d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        
            if (r1.b(r11, r10) == r0) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120534a;
            yc.h2.b<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.p> bVar = this.f120537d;
            yc.h2.c<Integer> cVar = this.f120536c;
            b1 b1Var = b1.this;
            if (i14 == 0) {
                o13.r.b(obj);
                com.airbnb.lottie.animation.keyframe.a.r("AvailableBadgeChallengesDataSource - loadInitial() -> startIndex=[0] , pageSize=[", cVar.f196002a, "]", b1Var.f120524j);
                x53.c cVar2 = o53.s0.f129406a;
                x53.b bVar2 = x53.b.f189152a;
                a aVar2 = new a(b1Var, cVar, null);
                this.f120534a = 1;
                obj = ge1.b.e0(bVar2, aVar2, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            List<com.garmin.android.apps.connectmobile.leaderboard.model.p> listA = b1Var.f120522h.a(b1Var.f120523i);
            ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(com.garmin.android.apps.connectmobile.leaderboard.model.p.b((com.garmin.android.apps.connectmobile.leaderboard.model.p) it.next(), null, -1));
            }
            bVar.a(null, arrayList);
            b1Var.f157380d.j(s51.e.LOADED);
            return Unit.INSTANCE;
            com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
                List<com.garmin.android.apps.connectmobile.leaderboard.model.p> list = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
                com.airbnb.lottie.animation.keyframe.a.r("AvailableBadgeChallengesDataSource - loadInitial() -> result=[Success], size=[", list.size(), "]", b1Var.f120524j);
                b1Var.f120523i.addAll(list);
                c cVar3 = b1Var.f120522h;
                this.f120534a = 2;
            } else {
                if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                    lc.u0.r();
                    return null;
                }
                b1Var.f120524j.debug("AvailableBadgeChallengesDataSource - loadInitial() -> result=[Error], exception=[" + ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47383a + "]");
                b1Var.f120525k = new kk1.a(b1Var, 19, cVar, bVar);
                b1Var.f157380d.j(s51.e.FAILED);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public b1(o53.b0 b0Var, yt0.r0 r0Var, d dVar, c cVar, List<com.garmin.android.apps.connectmobile.leaderboard.model.p> list) {
        b0Var.getClass();
        r0Var.getClass();
        dVar.getClass();
        cVar.getClass();
        list.getClass();
        this.f120519e = b0Var;
        this.f120520f = r0Var;
        this.f120521g = dVar;
        this.f120522h = cVar;
        this.f120523i = list;
        this.f120524j = gt2.c.b(com.garmin.android.apps.connectmobile.a2.CHALLENGES.f28756a);
    }

    @Override // yc.h2
    public final void d(yc.h2.d<Integer> dVar, yc.h2.a<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.p> aVar) {
    }

    @Override // yc.h2
    public final void e(yc.h2.d dVar, yc.i2 i2Var) {
    }

    @Override // yc.h2
    public final void f(yc.h2.c<Integer> cVar, yc.h2.b<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.p> bVar) {
        cVar.getClass();
        bVar.getClass();
        List<com.garmin.android.apps.connectmobile.leaderboard.model.p> list = this.f120523i;
        if (list.size() == 0) {
            this.f157380d.j(s51.e.LOADING);
            ge1.b.T(this.f120519e, null, null, new e(cVar, bVar, null), 3);
            return;
        }
        com.airbnb.lottie.animation.keyframe.a.r("AvailableBadgeChallengesDataSource - loadInitial() -> result=[Cached], size=[", list.size(), "]", this.f120524j);
        List<com.garmin.android.apps.connectmobile.leaderboard.model.p> listA = this.f120522h.a(list);
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(com.garmin.android.apps.connectmobile.leaderboard.model.p.b((com.garmin.android.apps.connectmobile.leaderboard.model.p) it.next(), null, -1));
        }
        bVar.a(null, arrayList);
    }

    @Override // s51.c
    public final void g() {
        this.f120524j.debug("AvailableBadgeChallengesDataSource - refresh()");
        this.f120523i.clear();
        b();
    }

    @Override // s51.c
    public final void h(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar) {
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar2 = pVar;
        this.f120524j.debug("AvailableBadgeChallengesDataSource - removeItem() -> item=[" + pVar2 + "]");
        this.f120523i.remove(pVar2);
        b();
    }

    @Override // s51.c
    public final void i() {
        kk1.a aVar = this.f120525k;
        if (aVar != null) {
            this.f120525k = null;
            this.f120524j.debug("AvailableBadgeChallengesDataSource - retry()");
            aVar.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmt0/b1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lmt0/b1$b;", "Ls51/c$a;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/p;", "Lo53/b0;", "coroutineScope", "Lyt0/r0;", "challengeRepo", "Lmt0/b1$d;", "challengeSubset", "Lmt0/b1$c;", "dataFilter", "", "cachedChallenges", "<init>", "(Lo53/b0;Lyt0/r0;Lmt0/b1$d;Lmt0/b1$c;Ljava/util/List;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s51.c.a<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.p> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o53.b0 f120526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yt0.r0 f120527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f120528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f120529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.leaderboard.model.p> f120530f;

        public b(o53.b0 b0Var, yt0.r0 r0Var, d dVar, c cVar, List<com.garmin.android.apps.connectmobile.leaderboard.model.p> list) {
            b0Var.getClass();
            r0Var.getClass();
            dVar.getClass();
            cVar.getClass();
            list.getClass();
            this.f120526b = b0Var;
            this.f120527c = r0Var;
            this.f120528d = dVar;
            this.f120529e = cVar;
            this.f120530f = list;
        }

        @Override // s51.c.a
        public final s51.c<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.p> b() {
            return new b1(this.f120526b, this.f120527c, this.f120528d, this.f120529e, this.f120530f);
        }

        public /* synthetic */ b(o53.b0 b0Var, yt0.r0 r0Var, d dVar, c cVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this(b0Var, r0Var, dVar, cVar, (i14 & 16) != 0 ? new ArrayList() : list);
        }
    }
}
