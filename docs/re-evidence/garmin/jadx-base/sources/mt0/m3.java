package mt0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u000e\u000f\u0010\u0011B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lmt0/m3;", "Ls51/c;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "Lo53/b0;", "coroutineScope", "Lyt0/s0;", "challengesRepo", "Lmt0/m3$d;", "challengeSubset", "Lmt0/m3$c;", "dataFilter", "<init>", "(Lo53/b0;Lyt0/s0;Lmt0/m3$d;Lmt0/m3$c;)V", "a", "b", "d", "c", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m3 extends s51.c<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.a0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o53.b0 f120716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yt0.s0 f120717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f120718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f120719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Logger f120720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e23.a<? extends Object> f120721j;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmt0/m3$b;", "Ls51/c$a;", "", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "Lo53/b0;", "coroutineScope", "Lyt0/s0;", "challengeRepo", "Lmt0/m3$d;", "challengeSubset", "Lmt0/m3$c;", "dataFilter", "<init>", "(Lo53/b0;Lyt0/s0;Lmt0/m3$d;Lmt0/m3$c;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s51.c.a<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.a0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o53.b0 f120722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yt0.s0 f120723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f120724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f120725e;

        public b(o53.b0 b0Var, yt0.s0 s0Var, d dVar, c cVar) {
            b0Var.getClass();
            s0Var.getClass();
            dVar.getClass();
            cVar.getClass();
            this.f120722b = b0Var;
            this.f120723c = s0Var;
            this.f120724d = dVar;
            this.f120725e = cVar;
        }

        @Override // s51.c.a
        public final s51.c<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.a0> b() {
            return new m3(this.f120722b, this.f120723c, this.f120724d, this.f120725e);
        }
    }

    public interface c {
        Object a(ArrayList arrayList, v13.c cVar);

        androidx.lifecycle.y0<List<ot0.g>> b();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt0/m3$d;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum d {
        NON_COMPLETED,
        COMPLETED
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.PagedLeaderboardChallengesDataSource$loadAfter$1", f = "PagedLeaderboardChallengesDataSource.kt", l = {102}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f120729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f120730b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f120732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ yc.h2.d<Integer> f120733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ yc.h2.a<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.a0> f120734f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/c0;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/leaderboard/model/c0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.PagedLeaderboardChallengesDataSource$loadAfter$1$leaderboardChallengesResult$1", f = "PagedLeaderboardChallengesDataSource.kt", l = {105, 108}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.leaderboard.model.c0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f120735a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m3 f120736b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f120737c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yc.h2.d<Integer> f120738d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ List<ot0.g> f120739e;

            /* JADX INFO: renamed from: mt0.m3$e$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C2290a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f120740a;

                static {
                    int[] iArr = new int[d.values().length];
                    try {
                        iArr[d.NON_COMPLETED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[d.COMPLETED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f120740a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(m3 m3Var, int i14, yc.h2.d<Integer> dVar, List<? extends ot0.g> list, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f120736b = m3Var;
                this.f120737c = i14;
                this.f120738d = dVar;
                this.f120739e = list;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f120736b, this.f120737c, this.f120738d, this.f120739e, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.leaderboard.model.c0> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
            
                if (r13 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
            
                if (r13 == r0) goto L22;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f120735a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return (com.garmin.android.apps.connectmobile.leaderboard.model.c0) obj;
                    }
                    if (i14 == 2) {
                        o13.r.b(obj);
                        return (com.garmin.android.apps.connectmobile.leaderboard.model.c0) obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                m3 m3Var = this.f120736b;
                int i15 = C2290a.f120740a[m3Var.f120718g.ordinal()];
                yc.h2.d<Integer> dVar = this.f120738d;
                int i16 = this.f120737c;
                if (i15 == 1) {
                    yt0.s0 s0Var = m3Var.f120717f;
                    int i17 = i16 + 1;
                    int i18 = dVar.f196004b;
                    List listC = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL);
                    this.f120735a = 1;
                    obj = s0Var.c(i17, i18, this.f120739e, listC, this);
                } else {
                    if (i15 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    int i19 = dVar.f196004b;
                    List listC2 = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL);
                    this.f120735a = 2;
                    obj = m3Var.f120717f.a(i16 + 1, i19, this.f120739e, listC2, this);
                }
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i14, yc.h2.d<Integer> dVar, yc.h2.a<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.a0> aVar, t13.d<? super e> dVar2) {
            super(2, dVar2);
            this.f120732d = i14;
            this.f120733e = dVar;
            this.f120734f = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            e eVar = m3.this.new e(this.f120732d, this.f120733e, this.f120734f, dVar);
            eVar.f120730b = obj;
            return eVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE0;
            o53.b0 b0Var = (o53.b0) this.f120730b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120729a;
            int i15 = this.f120732d;
            yc.h2.d<Integer> dVar = this.f120733e;
            m3 m3Var = m3.this;
            if (i14 == 0) {
                o13.r.b(obj);
                List<ot0.g> listD = m3Var.f120719h.b().d();
                if (listD == null) {
                    listD = new ArrayList<>();
                }
                List<ot0.g> list = listD;
                m3Var.f120720i.debug(am.j.g(i15, dVar.f196004b, "PagedLeaderboardChallengesDataSource - loadAfter() -> startIndex=[", "] , pageSize=[", "]"));
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(m3.this, this.f120732d, this.f120733e, list, null);
                this.f120730b = b0Var;
                this.f120729a = 1;
                objE0 = ge1.b.e0(bVar, aVar2, this);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objE0 = obj;
            }
            com.garmin.android.apps.connectmobile.leaderboard.model.c0 c0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.c0) objE0;
            yc.h2.a<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.a0> aVar3 = this.f120734f;
            if (c0Var != null) {
                ArrayList arrayList = new ArrayList();
                List listJ = m3.j(m3Var, c0Var, c0Var.b());
                if (listJ != null) {
                    arrayList.addAll(listJ);
                }
                List listJ2 = m3.j(m3Var, c0Var, c0Var.i());
                if (listJ2 != null) {
                    arrayList.addAll(listJ2);
                }
                List listJ3 = m3.j(m3Var, c0Var, c0Var.h());
                if (listJ3 != null) {
                    arrayList.addAll(listJ3);
                }
                m3Var.f120720i.debug("PagedLeaderboardChallengesDataSource - loadAfter() -> result=[Success], size=[" + arrayList.size() + "]");
                int size = arrayList.size();
                int i16 = dVar.f196004b;
                if (size < i16) {
                    aVar3.a(null, arrayList);
                } else {
                    aVar3.a(new Integer(i15 + i16), arrayList);
                }
                m3Var.f157379c.j(s51.e.LOADED);
            } else {
                m3Var.f120721j = new kk1.a(m3Var, 24, dVar, aVar3);
                m3Var.f157379c.j(s51.e.FAILED);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.PagedLeaderboardChallengesDataSource$loadInitial$1", f = "PagedLeaderboardChallengesDataSource.kt", l = {42, 66}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m3 f120741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f120742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f120743c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ yc.h2.c<Integer> f120745e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ yc.h2.b<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.a0> f120746f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/c0;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/leaderboard/model/c0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.PagedLeaderboardChallengesDataSource$loadInitial$1$leaderboardChallengesResult$1", f = "PagedLeaderboardChallengesDataSource.kt", l = {45, 48}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.leaderboard.model.c0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f120747a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m3 f120748b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ yc.h2.c<Integer> f120749c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List<ot0.g> f120750d;

            /* JADX INFO: renamed from: mt0.m3$f$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C2291a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f120751a;

                static {
                    int[] iArr = new int[d.values().length];
                    try {
                        iArr[d.NON_COMPLETED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[d.COMPLETED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f120751a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(m3 m3Var, yc.h2.c<Integer> cVar, List<? extends ot0.g> list, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f120748b = m3Var;
                this.f120749c = cVar;
                this.f120750d = list;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f120748b, this.f120749c, this.f120750d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.leaderboard.model.c0> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
            
                if (r12 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
            
                if (r12 == r0) goto L22;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f120747a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return (com.garmin.android.apps.connectmobile.leaderboard.model.c0) obj;
                    }
                    if (i14 == 2) {
                        o13.r.b(obj);
                        return (com.garmin.android.apps.connectmobile.leaderboard.model.c0) obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                m3 m3Var = this.f120748b;
                int i15 = C2291a.f120751a[m3Var.f120718g.ordinal()];
                yc.h2.c<Integer> cVar = this.f120749c;
                if (i15 == 1) {
                    yt0.s0 s0Var = m3Var.f120717f;
                    int i16 = cVar.f196002a;
                    List listC = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL);
                    this.f120747a = 1;
                    obj = s0Var.c(1, i16, this.f120750d, listC, this);
                } else {
                    if (i15 != 2) {
                        lc.u0.r();
                        return null;
                    }
                    yt0.s0 s0Var2 = m3Var.f120717f;
                    int i17 = cVar.f196002a;
                    List listC2 = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.FRAMED_THUMBNAIL);
                    this.f120747a = 2;
                    obj = s0Var2.a(1, i17, this.f120750d, listC2, this);
                }
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(yc.h2.c<Integer> cVar, yc.h2.b<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.a0> bVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f120745e = cVar;
            this.f120746f = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = m3.this.new f(this.f120745e, this.f120746f, dVar);
            fVar.f120743c = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
        
            if (r2.a(r14, r13) == r1) goto L35;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            o53.b0 b0Var = (o53.b0) this.f120743c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120742b;
            yc.h2.c<Integer> cVar = this.f120745e;
            m3 m3Var = m3.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m3Var = this.f120741a;
                    o13.r.b(obj);
                }
                m3Var.f157380d.j(s51.e.LOADED);
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            List<ot0.g> listD = m3Var.f120719h.b().d();
            if (listD == null) {
                listD = new ArrayList<>();
            }
            m3Var.f120720i.debug("PagedLeaderboardChallengesDataSource - loadInitial() -> startIndex=[0] , pageSize=[" + cVar.f196002a + "], filters=[" + listD + "]");
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(m3Var, cVar, listD, null);
            this.f120743c = b0Var;
            this.f120742b = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj != aVar) {
            }
            return aVar;
            com.garmin.android.apps.connectmobile.leaderboard.model.c0 c0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.c0) obj;
            yc.h2.b<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.a0> bVar2 = this.f120746f;
            if (c0Var != null) {
                ArrayList arrayList = new ArrayList();
                List listJ = m3.j(m3Var, c0Var, c0Var.b());
                if (listJ != null) {
                    arrayList.addAll(listJ);
                }
                List listJ2 = m3.j(m3Var, c0Var, c0Var.i());
                if (listJ2 != null) {
                    arrayList.addAll(listJ2);
                }
                List listJ3 = m3.j(m3Var, c0Var, c0Var.h());
                if (listJ3 != null) {
                    arrayList.addAll(listJ3);
                }
                m3Var.f120720i.debug("PagedLeaderboardChallengesDataSource - loadInitial() -> result=[Success], size=[" + arrayList.size() + "]");
                int size = arrayList.size();
                int i15 = cVar.f196002a;
                if (size < i15) {
                    bVar2.a(null, arrayList);
                } else {
                    bVar2.a(new Integer(i15), arrayList);
                }
                List<ot0.g> listF = c0Var.f();
                if (listF != null) {
                    ArrayList arrayListZ = p13.h0.Z(listF);
                    c cVar3 = m3Var.f120719h;
                    this.f120743c = b0Var;
                    this.f120741a = m3Var;
                    this.f120742b = 2;
                }
                m3Var.f157380d.j(s51.e.LOADED);
            } else {
                m3Var.f120721j = new kk1.a(m3Var, 25, cVar, bVar2);
                m3Var.f157380d.j(s51.e.FAILED);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public m3(o53.b0 b0Var, yt0.s0 s0Var, d dVar, c cVar) {
        b0Var.getClass();
        s0Var.getClass();
        dVar.getClass();
        cVar.getClass();
        this.f120716e = b0Var;
        this.f120717f = s0Var;
        this.f120718g = dVar;
        this.f120719h = cVar;
        this.f120720i = gt2.c.b(com.garmin.android.apps.connectmobile.a2.CHALLENGES.f28756a);
    }

    public static final List j(m3 m3Var, com.garmin.android.apps.connectmobile.leaderboard.model.c0 c0Var, List list) {
        String winnerProfileImageSmall;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        m3Var.getClass();
        if (list == null) {
            return null;
        }
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> mapK = c0Var.k();
        if (mapK != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.a0) it.next();
                String winnerProfileUserId = a0Var.getWinnerProfileUserId();
                com.garmin.android.apps.connectmobile.userprofile.model.l lVar = mapK.get(winnerProfileUserId != null ? Integer.valueOf(Integer.parseInt(winnerProfileUserId)) : null);
                if (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null || (winnerProfileImageSmall = profileImageUrls.f46877f) == null) {
                    winnerProfileImageSmall = a0Var.getWinnerProfileImageSmall();
                }
                a0Var.X = new b12.b(winnerProfileImageSmall, null, null, null, null, 30, null);
            }
        }
        return list;
    }

    @Override // yc.h2
    public final void d(yc.h2.d<Integer> dVar, yc.h2.a<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.a0> aVar) {
        dVar.getClass();
        aVar.getClass();
        int iIntValue = dVar.f196003a.intValue();
        this.f157379c.j(s51.e.LOADING);
        ge1.b.T(this.f120716e, null, null, new e(iIntValue, dVar, aVar, null), 3);
    }

    @Override // yc.h2
    public final void e(yc.h2.d dVar, yc.i2 i2Var) {
    }

    @Override // yc.h2
    public final void f(yc.h2.c<Integer> cVar, yc.h2.b<Integer, com.garmin.android.apps.connectmobile.leaderboard.model.a0> bVar) {
        cVar.getClass();
        bVar.getClass();
        this.f157380d.j(s51.e.LOADING);
        ge1.b.T(this.f120716e, null, null, new f(cVar, bVar, null), 3);
    }

    @Override // s51.c
    public final void g() {
        this.f120720i.debug("PagedLeaderboardChallengesDataSource - refresh()");
        b();
    }

    @Override // s51.c
    public final void h(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var) {
    }

    @Override // s51.c
    public final void i() {
        e23.a<? extends Object> aVar = this.f120721j;
        this.f120721j = null;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmt0/m3$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
