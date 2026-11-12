package km0;

import android.util.Log;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import d53.w;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lc.u0;
import o13.r;
import o53.b0;
import o53.m0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.c1;
import p13.h0;
import p13.j0;
import p13.l0;
import p13.y;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.v;
import yc.h3;
import yc.m1;
import yc.o;
import yc.t2;
import yc.u2;
import yc.w2;
import ym0.i0;
import ym0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkm0/i;", "Landroidx/lifecycle/u1;", "Lmv0/e;", "locationProvider", "Lym0/a;", "groupRepo", "<init>", "(Lmv0/e;Lym0/a;)V", "b", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mv0.e f105334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym0.a f105335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f105337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f105338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f105339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f105340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f105341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f105342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f105343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f105344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r53.u1 f105345l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$1", f = "GroupCreationViewModel.kt", l = {119, 120, 121}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f105346a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0054  */
        /* JADX WARN: Code duplicated, block: B:24:0x0064  */
        /* JADX WARN: Code duplicated, block: B:26:0x0068  */
        /* JADX WARN: Code duplicated, block: B:29:0x007a  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        
            if (p005kotlin.Unit.INSTANCE == r0) goto L23;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105346a;
            i iVar = i.this;
            if (i14 == 0) {
                r.b(obj);
                ym0.a aVar2 = iVar.f105335b;
                this.f105346a = 1;
                aVar2.getClass();
                if (aVar2.C(new t(aVar2, null), this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else if (i14 == 2) {
                r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    p2 p2Var = iVar.f105341h;
                    T t7 = ((v2.b) v2Var).f47386a;
                    this.f105346a = 3;
                    p2Var.setValue(t7);
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    o72.t.k(Log.e("GroupCreationViewModel", "Error fetching group member suggestion", ((v2.a) v2Var).f47383a));
                }
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            ym0.a aVar3 = iVar.f105335b;
            this.f105346a = 2;
            aVar3.getClass();
            obj = f0.J(aVar3, new i0(aVar3, null), this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    p2 p2Var2 = iVar.f105341h;
                    T t14 = ((v2.b) v2Var).f47386a;
                    this.f105346a = 3;
                    p2Var2.setValue(t14);
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    o72.t.k(Log.e("GroupCreationViewModel", "Error fetching group member suggestion", ((v2.a) v2Var).f47383a));
                }
                return Unit.INSTANCE;
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lhi0/l;", "suggestions", "", "", "invited", "Lkm0/m;", "<anonymous>", "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$initialGroupMemberSuggestions$1", f = "GroupCreationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements q<List<? extends hi0.l>, Set<? extends Long>, t13.d<? super List<? extends m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ List f105348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Set f105349b;

        public c(t13.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(List<? extends hi0.l> list, Set<? extends Long> set, t13.d<? super List<? extends m>> dVar) {
            c cVar = new c(dVar);
            cVar.f105348a = list;
            cVar.f105349b = set;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<hi0.l> list = this.f105348a;
            Set set = this.f105349b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (hi0.l lVar : list) {
                arrayList.add(new m(lVar, h0.R(set, lVar.getUserId()) ? wm0.b.INVITED : null));
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lyc/v2;", "Lhi0/l;", "list", "", "", "invited", "Lkm0/m;", "<anonymous>", "(Lyc/v2;Ljava/util/Set;)Lyc/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$searchedGroupMemberFlow$1", f = "GroupCreationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements q<yc.v2<hi0.l>, Set<? extends Long>, t13.d<? super yc.v2<m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ yc.v2 f105350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Set f105351b;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhi0/l;", "it", "", "<anonymous>", "(Lhi0/l;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$searchedGroupMemberFlow$1$1", f = "GroupCreationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<hi0.l, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f105353a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f105354b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f105354b = iVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f105354b, dVar);
                aVar.f105353a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(hi0.l lVar, t13.d<? super Boolean> dVar) {
                return ((a) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                hi0.l lVar = (hi0.l) this.f105353a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return Boolean.valueOf(!s.g(lVar.getDisplayName(), this.f105354b.f105336c));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhi0/l;", "it", "", "<anonymous>", "(Lhi0/l;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$searchedGroupMemberFlow$1$2", f = "GroupCreationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<hi0.l, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f105355a;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                b bVar = new b(dVar);
                bVar.f105355a = obj;
                return bVar;
            }

            @Override // e23.p
            public final Object invoke(hi0.l lVar, t13.d<? super Boolean> dVar) {
                return ((b) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                hi0.l lVar = (hi0.l) this.f105355a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                hi0.e followStatus = lVar.getFollowStatus();
                return Boolean.valueOf(!(followStatus != null ? s.g(followStatus.getBlocking(), Boolean.TRUE) : false));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhi0/l;", "item", "Lkm0/m;", "<anonymous>", "(Lhi0/l;)Lkm0/m;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$searchedGroupMemberFlow$1$3", f = "GroupCreationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class c extends v13.i implements p<hi0.l, t13.d<? super m>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f105356a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Set<Long> f105357b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Set<Long> set, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f105357b = set;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                c cVar = new c(this.f105357b, dVar);
                cVar.f105356a = obj;
                return cVar;
            }

            @Override // e23.p
            public final Object invoke(hi0.l lVar, t13.d<? super m> dVar) {
                return ((c) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                hi0.l lVar = (hi0.l) this.f105356a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                return new m(lVar, h0.R(this.f105357b, lVar.getUserId()) ? wm0.b.INVITED : null);
            }
        }

        public d(t13.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(yc.v2<hi0.l> v2Var, Set<? extends Long> set, t13.d<? super yc.v2<m>> dVar) {
            d dVar2 = i.this.new d(dVar);
            dVar2.f105350a = v2Var;
            dVar2.f105351b = set;
            return dVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            yc.v2 v2Var = this.f105350a;
            Set set = this.f105351b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return yc.i0.e(yc.i0.b(yc.i0.b(v2Var, new a(i.this, null)), new b(null)), new c(set, null));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<h3<Integer, hi0.l>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f105358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f105359b;

        public e(String str, i iVar) {
            this.f105358a = str;
            this.f105359b = iVar;
        }

        @Override // e23.a
        public final h3<Integer, hi0.l> invoke() {
            return new zm0.c(this.f105358a, this.f105359b.f105335b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lyc/v2;", "Lhi0/l;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$searchedGroupMemberPager$3$2", f = "GroupCreationViewModel.kt", l = {103}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements p<r53.j<? super yc.v2<hi0.l>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f105360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f105361b;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f105361b = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super yc.v2<hi0.l>> jVar, t13.d<? super Unit> dVar) {
            return ((f) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            r53.j jVar = (r53.j) this.f105361b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105360a;
            if (i14 == 0) {
                r.b(obj);
                yc.v2.f196535e.getClass();
                yc.v2 v2Var = new yc.v2(new r53.m(new m1.d(j0.f134944a, null, null)), yc.v2.f196536f, yc.v2.f196537g, w2.f196571a);
                this.f105361b = null;
                this.f105360a = 1;
                if (jVar.emit(v2Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f105362a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f105363a;

            /* JADX INFO: renamed from: km0.i$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$special$$inlined$filter$1$2", f = "GroupCreationViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2029a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f105364a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f105365b;

                public C2029a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f105364a = obj;
                    this.f105365b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f105363a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2029a c2029a;
                if (dVar instanceof C2029a) {
                    c2029a = (C2029a) dVar;
                    int i14 = c2029a.f105365b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2029a.f105365b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2029a = new C2029a(dVar);
                    }
                } else {
                    c2029a = new C2029a(dVar);
                }
                Object obj2 = c2029a.f105364a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2029a.f105365b;
                if (i15 == 0) {
                    r.b(obj2);
                    if (((String) obj).length() >= 2) {
                        c2029a.f105365b = 1;
                        if (this.f105363a.emit(obj, c2029a) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public g(r53.i iVar) {
            this.f105362a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f105362a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$special$$inlined$flatMapLatest$1", f = "GroupCreationViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements q<r53.j<? super yc.v2<hi0.l>>, String, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f105367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f105368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f105369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f105370d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(t13.d dVar, i iVar) {
            super(3, dVar);
            this.f105370d = iVar;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super yc.v2<hi0.l>> jVar, String str, t13.d<? super Unit> dVar) {
            h hVar = new h(dVar, this.f105370d);
            hVar.f105368b = jVar;
            hVar.f105369c = str;
            return hVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105367a;
            if (i14 == 0) {
                r.b(obj);
                r53.j jVar = this.f105368b;
                String str = (String) this.f105369c;
                u2 u2Var = new u2(20, 0, false, 0, 0, 0, 62, null);
                i iVar = this.f105370d;
                v vVar = new v(new f(null), o.a(new t2(u2Var, null, new e(str, iVar), 2, null).f196485a, v1.a(iVar)));
                this.f105368b = null;
                this.f105369c = null;
                this.f105367a = 1;
                if (r53.s.v(jVar, vVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: km0.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2030i implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f105371a;

        /* JADX INFO: renamed from: km0.i$i$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f105372a;

            /* JADX INFO: renamed from: km0.i$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$special$$inlined$map$1$2", f = "GroupCreationViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2031a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f105373a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f105374b;

                public C2031a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f105373a = obj;
                    this.f105374b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f105372a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2031a c2031a;
                if (dVar instanceof C2031a) {
                    c2031a = (C2031a) dVar;
                    int i14 = c2031a.f105374b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2031a.f105374b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2031a = new C2031a(dVar);
                    }
                } else {
                    c2031a = new C2031a(dVar);
                }
                Object obj2 = c2031a.f105373a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2031a.f105374b;
                if (i15 == 0) {
                    r.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                    c2031a.f105374b = 1;
                    if (this.f105372a.emit(boolValueOf, c2031a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public C2030i(r53.i iVar) {
            this.f105371a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f105371a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j implements r53.i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f105376a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f105377a;

            /* JADX INFO: renamed from: km0.i$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.group.create.GroupCreationViewModel$special$$inlined$map$2$2", f = "GroupCreationViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2032a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f105378a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f105379b;

                public C2032a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f105378a = obj;
                    this.f105379b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f105377a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2032a c2032a;
                if (dVar instanceof C2032a) {
                    c2032a = (C2032a) dVar;
                    int i14 = c2032a.f105379b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2032a.f105379b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2032a = new C2032a(dVar);
                    }
                } else {
                    c2032a = new C2032a(dVar);
                }
                Object obj2 = c2032a.f105378a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2032a.f105379b;
                if (i15 == 0) {
                    r.b(obj2);
                    String string = w.i0((String) obj).toString();
                    c2032a.f105379b = 1;
                    if (this.f105377a.emit(string, c2032a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public j(r53.i iVar) {
            this.f105376a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super String> jVar, t13.d dVar) {
            Object objCollect = this.f105376a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public i(mv0.e eVar, ym0.a aVar) {
        eVar.getClass();
        aVar.getClass();
        this.f105334a = eVar;
        this.f105335b = aVar;
        this.f105336c = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        p2 p2VarA = q2.a(new km0.b(null, null, null, null, null, null, null, null, null, null, null, 2047, null));
        this.f105337d = p2VarA;
        this.f105338e = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(0);
        this.f105339f = p2VarA2;
        C2030i c2030i = new C2030i(p2VarA2);
        w9.a aVarA = v1.a(this);
        k2.a aVar2 = k2.f150703a;
        this.f105340g = r53.s.K(c2030i, aVarA, k2.a.a(aVar2, 3), Boolean.FALSE);
        j0 j0Var = j0.f134944a;
        p2 p2VarA3 = q2.a(j0Var);
        this.f105341h = p2VarA3;
        p2 p2VarA4 = q2.a(l0.f134950a);
        this.f105342i = p2VarA4;
        this.f105343j = r53.s.K(new r53.u1(p2VarA3, p2VarA4, new c(null)), v1.a(this), k2.a.a(aVar2, 3), j0Var);
        p2 p2VarA5 = q2.a("");
        this.f105344k = p2VarA5;
        g gVar = new g(new j(p2VarA5));
        e53.c.a aVar3 = e53.c.f63094b;
        this.f105345l = new r53.u1(r53.s.N(r53.s.s(r53.s.q(gVar, m0.e(e53.e.f(500L, e53.f.MILLISECONDS)))), new h(null, this)), p2VarA4, new d(null));
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }

    public final void x4(com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar) {
        p2 p2Var;
        Object value;
        km0.b bVar;
        eVar.getClass();
        do {
            p2Var = this.f105337d;
            value = p2Var.getValue();
            bVar = (km0.b) value;
        } while (!p2Var.b(value, km0.b.a(bVar, null, null, null, null, null, null, null, null, null, c1.i(bVar.f105306j, eVar), null, 1535)));
    }

    public final void y4(com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar) {
        p2 p2Var;
        Object value;
        km0.b bVar;
        eVar.getClass();
        do {
            p2Var = this.f105337d;
            value = p2Var.getValue();
            bVar = (km0.b) value;
        } while (!p2Var.b(value, km0.b.a(bVar, null, null, null, null, null, null, null, null, null, c1.f(bVar.f105306j, eVar), null, 1535)));
    }

    public final void z4(GroupDTO.d dVar) {
        p2 p2Var;
        Object value;
        dVar.getClass();
        do {
            p2Var = this.f105337d;
            value = p2Var.getValue();
        } while (!p2Var.b(value, km0.b.a((km0.b) value, null, null, null, null, null, null, null, null, dVar, null, null, 1791)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkm0/i$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(mv0.e eVar, ym0.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        eVar = (i14 & 1) != 0 ? (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null) : eVar;
        if ((i14 & 2) != 0) {
            ym0.a.f197886f.getClass();
            aVar = ym0.a.C3709a.a();
        }
        this(eVar, aVar);
    }
}
