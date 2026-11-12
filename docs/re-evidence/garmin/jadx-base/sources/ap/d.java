package ap;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.h0;
import ps.d1;
import yo.p;
import yo.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lap/d;", "Landroidx/lifecycle/u1;", "", "activityId", "Lzo/k;", "entryPoint", "<init>", "(JLzo/k;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f11588o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zo.k f11590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kr.a f11591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sr.b f11592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yo.e f11593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<Map<Integer, Integer>> f11594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f11595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<Integer> f11596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0 f11597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<Boolean> f11598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f11600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f11601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.h f11602n;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11603a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f11603a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f11604a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f11604a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f11604a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11604a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: ap.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.viewmodel.MultisportEditLegsViewModel$updateLegDistance$1", f = "MultisportEditLegsViewModel.kt", l = {377}, m = "invokeSuspend", v = 2)
    public static final class C0166d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11605a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f11607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ double f11608d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0166d(int i14, double d14, t13.d<? super C0166d> dVar) {
            super(2, dVar);
            this.f11607c = i14;
            this.f11608d = d14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new C0166d(this.f11607c, this.f11608d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0166d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f11605a;
            if (i14 == 0) {
                r.b(obj);
                yo.e eVar = d.this.f11593e;
                this.f11605a = 1;
                if (eVar.j(this.f11607c, this.f11608d, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.viewmodel.MultisportEditLegsViewModel$updateLegDuration$1", f = "MultisportEditLegsViewModel.kt", l = {370}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11609a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f11611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ double f11612d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i14, double d14, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f11611c = i14;
            this.f11612d = d14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new e(this.f11611c, this.f11612d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f11609a;
            if (i14 == 0) {
                r.b(obj);
                yo.e eVar = d.this.f11593e;
                this.f11609a = 1;
                if (eVar.k(this.f11611c, this.f11612d, this) == aVar) {
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

    static {
        new a(null);
    }

    public d(long j8, zo.k kVar) {
        kVar.getClass();
        this.f11589a = j8;
        this.f11590b = kVar;
        this.f11591c = (kr.a) KoinJavaComponent.get$default(kr.a.class, null, null, 6, null);
        this.f11592d = (sr.b) KoinJavaComponent.get$default(sr.b.class, null, null, 6, null);
        yo.e eVar = new yo.e(v1.a(this));
        this.f11593e = eVar;
        this.f11594f = new y0<>();
        this.f11595g = new LinkedHashMap();
        y0<Integer> y0Var = new y0<>(-1);
        this.f11596h = y0Var;
        this.f11597i = y0Var;
        y0<Boolean> y0Var2 = new y0<>(null);
        this.f11598j = y0Var2;
        this.f11600l = y0Var2;
        this.f11601m = eVar.f198242l;
    }

    public final void A4(int i14) {
        List<d1> listD = this.f11593e.f198239i.d();
        if (i14 >= 0) {
            if (i14 < (listD != null ? listD.size() : 0)) {
                this.f11596h.j(Integer.valueOf(i14));
            }
        }
    }

    public final void B4(double d14, int i14) {
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.a(a2.ACTIVITIES, "updating leg " + i14 + " to distance " + d14);
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new C0166d(i14, d14, null), 2);
    }

    public final void C4(double d14, int i14) {
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.a(a2.ACTIVITIES, "updating leg " + i14 + " to duration " + d14);
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new e(i14, d14, null), 2);
    }

    public final y0 x4() {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f11602n;
        if (hVar != null) {
            return this.f11593e.e(v1.a(this), hVar);
        }
        w0 w0Var = new w0();
        cw.a.M().getClass();
        w0Var.n(new dm.n(this.f11589a, true, true).k(), new c(new ap.a(this, w0Var, 2)));
        return w0Var;
    }

    public final wo.a y4(int i14) {
        wo.a aVarB;
        int iIntValue;
        Set<Integer> setKeySet;
        Integer num;
        yo.e eVar = this.f11593e;
        y0<List<d1>> y0Var = eVar.f198239i;
        List<d1> listD = y0Var.d();
        Integer num2 = null;
        d1 d1Var = listD != null ? (d1) h0.e0(i14, listD) : null;
        List<d1> listD2 = y0Var.d();
        d1 d1Var2 = listD2 != null ? (d1) h0.e0(i14 + 1, listD2) : null;
        if (d1Var != null) {
            wo.b bVar = eVar.f198238h;
            if (bVar == null) {
                s.m("chartDataHandler");
                throw null;
            }
            aVarB = bVar.b(d1Var, d1Var2);
        } else {
            aVarB = null;
        }
        Integer numValueOf = Integer.valueOf(i14);
        if (aVarB == null || (num = aVarB.f186397a) == null) {
            if (aVarB != null && (setKeySet = aVarB.f186398b.keySet()) != null) {
                num2 = (Integer) h0.c0(setKeySet);
            }
            iIntValue = num2 != null ? num2.intValue() : 0;
        } else {
            iIntValue = num.intValue();
        }
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        LinkedHashMap linkedHashMap = this.f11595g;
        int iIntValue2 = ((Number) linkedHashMap.getOrDefault(numValueOf, numValueOf2)).intValue();
        if (aVarB != null) {
            aVarB.f186397a = Integer.valueOf(iIntValue2);
        }
        if (!linkedHashMap.containsKey(Integer.valueOf(i14))) {
            linkedHashMap.put(Integer.valueOf(i14), Integer.valueOf(iIntValue2));
            this.f11594f.j(linkedHashMap);
        }
        return aVarB;
    }

    public final void z4() {
        w wVar = this.f11593e.f198237g;
        ArrayList arrayList = wVar.f198314d;
        if (arrayList == null) {
            s.m("intermediateLegs");
            throw null;
        }
        wVar.f198313c = new ArrayList(arrayList);
        wVar.f198318h.j(wVar.e());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lap/d$a;", "", "<init>", "()V", "", "INVALID_LEG_INDEX", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
