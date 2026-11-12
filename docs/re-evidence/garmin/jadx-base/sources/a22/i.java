package a22;

import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.r;
import o53.b0;
import o53.i0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.c2;
import r53.i1;
import r53.l0;
import r53.m0;
import r53.p0;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La22/i;", "Lcom/garmin/android/apps/connectmobile/f0;", "Leo1/a;", "socialProfileAPI", "<init>", "(Leo1/a;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f537b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo1.a f538a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.repo.UserProfileRepo", f = "UserProfileRepo.kt", l = {46}, m = "getMultipleSimplePublicSocialProfileMap", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LinkedHashMap f539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f540b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f542d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f540b = obj;
            this.f542d |= Integer.MIN_VALUE;
            return i.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "userIds", "Lr53/i;", "", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "<anonymous>", "(Ljava/util/List;)Lr53/i;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.repo.UserProfileRepo$getMultipleSimplePublicSocialProfileMap$2", f = "UserProfileRepo.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<List<? extends String>, t13.d<? super r53.i<? extends Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f543a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f545c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.repo.UserProfileRepo$getMultipleSimplePublicSocialProfileMap$2$1", f = "UserProfileRepo.kt", l = {33, 42}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<r53.j<? super Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f546a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f547b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f548c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List<String> f549d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f550e;

            /* JADX INFO: renamed from: a22.i$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.repo.UserProfileRepo$getMultipleSimplePublicSocialProfileMap$2$1$result$1", f = "UserProfileRepo.kt", l = {33}, m = "invokeSuspend", v = 2)
            public static final class C0004a extends v13.i implements p<b0, t13.d<? super v2<? extends Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>>>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f551a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f552b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List<String> f553c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f554d;

                /* JADX INFO: renamed from: a22.i$c$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc83/a0;", "", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
                @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.repo.UserProfileRepo$getMultipleSimplePublicSocialProfileMap$2$1$result$1$1", f = "UserProfileRepo.kt", l = {33}, m = "invokeSuspend", v = 2)
                public static final class C0005a extends v13.i implements e23.l<t13.d<? super a0<Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>>>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f555a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i f556b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ List<String> f557c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f558d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0005a(i iVar, List<String> list, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list2, t13.d<? super C0005a> dVar) {
                        super(1, dVar);
                        this.f556b = iVar;
                        this.f557c = list;
                        this.f558d = list2;
                    }

                    @Override // v13.a
                    public final t13.d<Unit> create(t13.d<?> dVar) {
                        return new C0005a(this.f556b, this.f557c, this.f558d, dVar);
                    }

                    @Override // e23.l
                    public final Object invoke(t13.d<? super a0<Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>>> dVar) {
                        return ((C0005a) create(dVar)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                        int i14 = this.f555a;
                        if (i14 != 0) {
                            if (i14 == 1) {
                                r.b(obj);
                                return obj;
                            }
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                        eo1.a aVar2 = this.f556b.f538a;
                        List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f558d;
                        ArrayList arrayList = new ArrayList(y.r(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) it.next()).name());
                        }
                        i0<a0<Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l>>> i0VarC = aVar2.c(this.f557c, arrayList);
                        this.f555a = 1;
                        Object objAwait = i0VarC.await(this);
                        return objAwait == aVar ? aVar : objAwait;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0004a(i iVar, List<String> list, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list2, t13.d<? super C0004a> dVar) {
                    super(2, dVar);
                    this.f552b = iVar;
                    this.f553c = list;
                    this.f554d = list2;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C0004a(this.f552b, this.f553c, this.f554d, dVar);
                }

                @Override // e23.p
                public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>>> dVar) {
                    return ((C0004a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f551a;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            r.b(obj);
                            return obj;
                        }
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                    List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f554d;
                    i iVar = this.f552b;
                    C0005a c0005a = new C0005a(iVar, this.f553c, list, null);
                    this.f551a = 1;
                    iVar.getClass();
                    Object objJ = f0.J(iVar, c0005a, this);
                    return objJ == aVar ? aVar : objJ;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i iVar, List<String> list, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list2, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f548c = iVar;
                this.f549d = list;
                this.f550e = list2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f548c, this.f549d, this.f550e, dVar);
                aVar.f547b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(r53.j<? super Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>> jVar, t13.d<? super Unit> dVar) {
                return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
            
                if (r0.emit(r10, r9) == r1) goto L20;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                r53.j jVar = (r53.j) this.f547b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f546a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                C0004a c0004a = new C0004a(this.f548c, this.f549d, this.f550e, null);
                this.f547b = jVar;
                this.f546a = 1;
                obj = ge1.b.e0(bVar, c0004a, this);
                if (obj != aVar) {
                }
                return aVar;
                v2 v2Var = (v2) obj;
                if (v2Var instanceof v2.a) {
                    v2.a aVar2 = (v2.a) v2Var;
                    Integer num = aVar2.f47384b;
                    String str = aVar2.f47385c;
                    Exception exc = aVar2.f47383a;
                    StringBuilder sbF = l2.f("get profileInfos failed, response code=[", num, "], error=[", str, ", exception=[");
                    sbF.append(exc);
                    sbF.append("]");
                    String string = sbF.toString();
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var, "UserProfileRepo", string);
                } else {
                    if (!(v2Var instanceof v2.b)) {
                        u0.r();
                        return null;
                    }
                    T t7 = ((v2.b) v2Var).f47386a;
                    this.f547b = null;
                    this.f546a = 2;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f545c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = i.this.new c(this.f545c, dVar);
            cVar.f543a = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(List<? extends String> list, t13.d<? super r53.i<? extends Map<Integer, ? extends com.garmin.android.apps.connectmobile.userprofile.model.l>>> dVar) {
            return ((c) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f543a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return new c2(new a(i.this, list, this.f545c, null));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> f559a;

        public d(Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map) {
            this.f559a = map;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            this.f559a.putAll((Map) obj);
            return Unit.INSTANCE;
        }
    }

    public i(eo1.a aVar) {
        aVar.getClass();
        this.f538a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(List<String> list, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list2, t13.d<? super Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l>> dVar) {
        b bVar;
        r53.i gVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f542d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f542d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f540b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f542d;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            LinkedHashMap linkedHashMap = bVar.f539a;
            r.b(obj);
            return linkedHashMap;
        }
        r.b(obj);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        i1 i1Var = new i1(new r53.k(list), 50);
        c cVar = new c(list2, null);
        int i16 = p0.f150790a;
        l0 l0Var = new l0(i1Var, cVar);
        if (i16 <= 0) {
            vb.h.x(am.j.h(i16, "Expected positive concurrency level, but had "));
            return null;
        }
        if (i16 == 1) {
            gVar = new m0(l0Var);
        } else {
            gVar = new s53.g(l0Var, i16, null, 0, null, 28, null);
        }
        d dVar2 = new d(linkedHashMap2);
        bVar.f539a = linkedHashMap2;
        bVar.f542d = 1;
        return gVar.collect(dVar2, bVar) == aVar ? aVar : linkedHashMap2;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La22/i$a;", "", "<init>", "()V", "", "PROFILE_USERS_SIZE_LIMIT_PER_REQUEST", "I", "", "TAG", "Ljava/lang/String;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static i a() {
            return (i) KoinJavaComponent.get$default(i.class, null, null, 6, null);
        }

        private a() {
        }
    }
}
