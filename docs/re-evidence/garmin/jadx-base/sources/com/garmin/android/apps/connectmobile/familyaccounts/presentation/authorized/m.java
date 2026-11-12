package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import android.os.Build;
import android.text.TextPaint;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import c22.a0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import ei0.u0;
import f12.u;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.w;
import p13.x;
import p13.y;
import q2.o;
import r53.b2;
import r53.c2;
import r53.k2;
import r53.p2;
import r53.q2;
import rg0.m0;
import rg0.n0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/m;", "Landroidx/lifecycle/u1;", "Lei0/d;", "mRepository", "Lc22/a0;", "mDispatcherProvider", "", "", "Lue0/c;", "mInvites", "<init>", "(Lei0/d;Lc22/a0;Ljava/util/Map;)V", "c", "a", "b", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei0.d f35152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f35153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Long, ue0.c> f35154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f35155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f35156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f35157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f35158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f35159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ReentrantLock f35160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f35161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f35162k;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/m$a;", "", "", "sectionHeader", "", "Lei0/u0$a;", "mFollowings", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<u0.a> f35164b;

        public a(String str, List<u0.a> list) {
            str.getClass();
            list.getClass();
            this.f35163a = str;
            this.f35164b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35163a.equals(aVar.f35163a) && this.f35164b.equals(aVar.f35164b);
        }

        public final int hashCode() {
            return this.f35164b.hashCode() + (this.f35163a.hashCode() * 31);
        }

        public final String toString() {
            return fb1.c.o("FollowingSectionModel(sectionHeader=", this.f35163a, ", mFollowings=", this.f35164b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/m$b;", "", "", "Lhi0/a;", "followingsResource", "", "responseCode", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<hi0.a> f35165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f35166b;

        public b(List<hi0.a> list, Integer num) {
            this.f35165a = list;
            this.f35166b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f35165a, bVar.f35165a) && s.g(this.f35166b, bVar.f35166b);
        }

        public final int hashCode() {
            List<hi0.a> list = this.f35165a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            Integer num = this.f35166b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "FollowingsResponse(followingsResource=" + this.f35165a + ", responseCode=" + this.f35166b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/familyaccounts/presentation/authorized/m$c;", "Landroidx/lifecycle/x1$c;", "", "", "Lue0/c;", "mInvites", "<init>", "(Ljava/util/Map;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Long, ue0.c> f35167a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Map<Long, ? extends ue0.c> map) {
            map.getClass();
            this.f35167a = map;
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            if (!cls.isAssignableFrom(m.class)) {
                vb.h.z("UnKnown ViewModel class");
                return null;
            }
            return new m(null, null, this.f35167a, 3, null);
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35168a;

        static {
            int[] iArr = new int[ue0.c.values().length];
            try {
                iArr[ue0.c.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ue0.c.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f35168a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.InviteAuthorizedUserViewModel$getUserMutualFollowings$1", f = "InviteAuthorizedUserViewModel.kt", l = {95}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35169a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return m.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objE0;
            o13.p pVar;
            String str;
            String str2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f35169a;
            m mVar = m.this;
            if (i14 == 0) {
                r.b(obj);
                ei0.d dVar = mVar.f35152a;
                List listC = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                this.f35169a = 1;
                objE0 = ei0.d.E0(dVar, listC, this, 6);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objE0 = obj;
            }
            v2 v2Var = (v2) objE0;
            if (v2Var instanceof v2.b) {
                Iterable iterable = (Iterable) ((v2.b) v2Var).f47386a;
                ArrayList<hi0.a> arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    hi0.e followStatus = ((hi0.a) obj2).getFollowStatus();
                    if ((followStatus != null ? followStatus.getRelationshipStatus() : null) == hi0.e.b.MUTUAL) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                for (hi0.a aVar2 : arrayList) {
                    hi0.a aVar3 = (hi0.a) mVar.f35156e.getValue();
                    boolean zG = s.g(aVar3 != null ? aVar3.getUserId() : null, aVar2.getUserId());
                    ue0.c cVar = mVar.f35154c.get(aVar2.getUserId());
                    int i15 = cVar == null ? -1 : d.f35168a[cVar.ordinal()];
                    if (i15 == -1) {
                        pVar = new o13.p(u0.a.b.None, Boolean.TRUE);
                    } else if (i15 == 1) {
                        pVar = new o13.p(u0.a.b.RequestSent, Boolean.FALSE);
                    } else {
                        if (i15 != 2) {
                            lc.u0.r();
                            return null;
                        }
                        pVar = new o13.p(u0.a.b.Added, Boolean.FALSE);
                    }
                    u0.a.b bVar = (u0.a.b) pVar.f128594a;
                    boolean zBooleanValue = ((Boolean) pVar.f128595b).booleanValue();
                    Long userId = aVar2.getUserId();
                    if (userId == null) {
                        vb.h.z("User ID cannot be null");
                        return null;
                    }
                    long jLongValue = userId.longValue();
                    com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls = aVar2.getProfileImageUrls();
                    if (profileImageUrls == null || (str = profileImageUrls.f46879h) == null) {
                        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2 = aVar2.getProfileImageUrls();
                        if (profileImageUrls2 != null) {
                            String str3 = profileImageUrls2.f46873b;
                            str = str3;
                        } else {
                            str = null;
                        }
                    } else {
                        str = str3;
                    }
                    String fullName = aVar2.getFullName();
                    String str4 = fullName == null ? "" : fullName;
                    String location = aVar2.getLocation();
                    String str5 = location == null ? "" : location;
                    Long userLevel = aVar2.getUserLevel();
                    int iLongValue = userLevel != null ? (int) userLevel.longValue() : 0;
                    com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls3 = aVar2.getProfileImageUrls();
                    if (profileImageUrls3 == null || (str = profileImageUrls3.f46879h) == null) {
                        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls4 = aVar2.getProfileImageUrls();
                        if (profileImageUrls4 != null) {
                            String str6 = profileImageUrls4.f46873b;
                            str2 = str6;
                        } else {
                            str2 = null;
                        }
                    } else {
                        str2 = str6;
                    }
                    Long userLevel2 = aVar2.getUserLevel();
                    arrayList2.add(new u0.a(jLongValue, str, str4, str5, iLongValue, zBooleanValue, bVar, zG, null, null, null, new b12.b(str2, null, u.a(userLevel2 != null ? (int) userLevel2.longValue() : 0), null, null, 26, null), 1792, null));
                }
                mVar.getClass();
                Collator collator = Collator.getInstance();
                collator.setStrength(1);
                List listN0 = h0.N0(arrayList2, new n0(collator));
                ReentrantLock reentrantLock = mVar.f35160i;
                reentrantLock.lock();
                try {
                    ArrayList arrayList3 = mVar.f35159h;
                    arrayList3.clear();
                    arrayList3.addAll(listN0);
                    mVar.z4(h0.b1(arrayList3));
                    mVar.f35155d.k(null, fw.m.a.g(fw.m.f73767e, new b(arrayList, new Integer(((v2.b) v2Var).f47387b)), 1));
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                p2 p2Var = mVar.f35155d;
                fw.m.a aVar4 = fw.m.f73767e;
                v2.a aVar5 = (v2.a) v2Var;
                Exception exc = aVar5.f47383a;
                b bVar2 = new b(null, aVar5.f47384b);
                aVar4.getClass();
                p2Var.k(null, fw.m.a.a(bVar2, exc));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lr53/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.InviteAuthorizedUserViewModel$special$$inlined$transform$1", f = "InviteAuthorizedUserViewModel.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements p<r53.j<? super Integer>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f35172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.i f35173c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j<Integer> f35174a;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.m$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.InviteAuthorizedUserViewModel$special$$inlined$transform$1$1", f = "InviteAuthorizedUserViewModel.kt", l = {39}, m = "emit", v = 2)
            public static final class C0602a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f35175a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f35176b;

                public C0602a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f35175a = obj;
                    this.f35176b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f35174a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(T t7, t13.d<? super Unit> dVar) {
                C0602a c0602a;
                if (dVar instanceof C0602a) {
                    c0602a = (C0602a) dVar;
                    int i14 = c0602a.f35176b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0602a.f35176b = i14 - Integer.MIN_VALUE;
                    } else {
                        c0602a = new C0602a(dVar);
                    }
                } else {
                    c0602a = new C0602a(dVar);
                }
                Object obj = c0602a.f35175a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0602a.f35176b;
                if (i15 == 0) {
                    r.b(obj);
                    Integer num = new Integer(((String) t7).length());
                    c0602a.f35176b = 1;
                    if (this.f35174a.emit(num, c0602a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r53.i iVar, t13.d dVar) {
            super(2, dVar);
            this.f35173c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = new f(this.f35173c, dVar);
            fVar.f35172b = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super Integer> jVar, t13.d<? super Unit> dVar) {
            return ((f) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f35171a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a((r53.j) this.f35172b);
                this.f35172b = null;
                this.f35171a = 1;
                if (this.f35173c.collect(aVar2, this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public m(ei0.d dVar, a0 a0Var, Map<Long, ? extends ue0.c> map) {
        dVar.getClass();
        a0Var.getClass();
        map.getClass();
        this.f35152a = dVar;
        this.f35153b = a0Var;
        this.f35154c = map;
        this.f35155d = q2.a(null);
        this.f35156e = q2.a(null);
        p2 p2VarA = q2.a(null);
        this.f35157f = p2VarA;
        p2 p2VarA2 = q2.a("");
        this.f35158g = p2VarA2;
        this.f35159h = new ArrayList();
        this.f35160i = new ReentrantLock();
        this.f35161j = p2VarA;
        c2 c2Var = new c2(new f(p2VarA2, null));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f35162k = r53.s.K(c2Var, aVarA, k2.a.f150705b, 0);
    }

    public final void x4() {
        this.f35155d.k(null, fw.m.a.f(fw.m.f73767e, null, null, 3));
        ge1.b.T(v1.a(this), this.f35153b.f22991c, null, new e(null), 2);
    }

    public final Integer y4(long j8, boolean z14) {
        ArrayList arrayList = this.f35159h;
        ReentrantLock reentrantLock = this.f35160i;
        reentrantLock.lock();
        try {
            Iterator it = arrayList.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                }
                if (((u0.a) it.next()).f64330a == j8) {
                    break;
                }
                i14++;
            }
            if (i14 == -1) {
                return null;
            }
            Object obj = arrayList.get(i14);
            u0.a aVar = obj instanceof u0.a ? (u0.a) obj : null;
            if (aVar != null) {
                arrayList.set(i14, u0.a.d(aVar, z14));
            }
            return Integer.valueOf(i14);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void z4(List<u0.a> list) {
        list.getClass();
        m0 m0Var = new m0(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m0Var.f152587a) {
            String strValueOf = ((u0.a) obj).f64332c;
            TextPaint textPaint = new TextPaint();
            strValueOf.getClass();
            if (strValueOf.length() != 0) {
                if (Build.VERSION.SDK_INT >= 34) {
                    o.n();
                    strValueOf = strValueOf.substring(0, fd.i.p(textPaint, strValueOf).nextEndBoundary(0));
                } else {
                    strValueOf = String.valueOf(d53.y.p0(strValueOf));
                }
            }
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object obj2 = linkedHashMap.get(upperCase);
            boolean z14 = obj2 == null && !linkedHashMap.containsKey(upperCase);
            u0.a aVar = (u0.a) obj;
            a aVar2 = (a) obj2;
            if (z14) {
                aVar2 = new a(upperCase, x.m(aVar));
            } else if (aVar2 != null) {
                aVar.getClass();
                aVar2.f35164b.add(aVar);
            }
            linkedHashMap.put(upperCase, aVar2);
        }
        ArrayList<a> arrayListZ = h0.Z(linkedHashMap.values());
        ArrayList arrayList = new ArrayList();
        for (a aVar3 : arrayListZ) {
            arrayList.add(new tg0.c(aVar3.f35163a, null, 2, null));
            arrayList.addAll(h0.b1(aVar3.f35164b));
        }
        this.f35157f.k(null, arrayList);
    }

    public /* synthetic */ m(ei0.d dVar, a0 a0Var, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? (ei0.d) KoinJavaComponent.get$default(ei0.d.class, null, null, 6, null) : dVar, (i14 & 2) != 0 ? new a0(null, null, null, 7, null) : a0Var, map);
    }
}
