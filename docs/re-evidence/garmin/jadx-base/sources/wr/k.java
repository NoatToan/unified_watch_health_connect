package wr;

import am.x0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.view.g1;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.h1;
import androidx.lifecycle.n0;
import androidx.lifecycle.t1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.i0;
import com.garmin.android.apps.connectmobile.activities.stats.splits.EditActivityStatsSplitsActivity;
import com.garmin.android.apps.connectmobile.e1;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import nr.t;
import o53.b0;
import o53.f0;
import org.json.JSONObject;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.w;
import p13.y;
import ps.o1;
import ps.r;
import ps.x1;
import qr.o6;
import qs.x;
import r53.p2;
import vn2.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwr/k;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f186755l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f186756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tq.a f186757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f186758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public wq.i f186759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x0 f186760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<x1> f186761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e1 f186762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f186763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f186764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public uq.k f186765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f186766k;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f186768b;

        static {
            int[] iArr = new int[uq.k.values().length];
            try {
                iArr[uq.k.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uq.k.TOP_SPLITS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uq.k.COMPARISON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f186767a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f186768b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"wr/k$c", "Lb/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
        @Override // b.s
        public final void b() {
            k kVar = k.this;
            tq.a aVar = kVar.f186757b;
            if (aVar == null) {
                return;
            }
            List<x1> listD = aVar.f166002j.d();
            if (listD != null) {
                if (aVar.f166001i.size() == listD.size()) {
                    int size = listD.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        if (p005kotlin.jvm.internal.s.g(listD.get(i14), aVar.f166001i.get(i14))) {
                        }
                    }
                }
                q1.b bVar = q1.f41066b;
                String string = kVar.getString(R.string.msg_dialog_saving_message);
                string.getClass();
                t0 t0Var = new t0(kVar, 21);
                bVar.getClass();
                q1 q1VarA = q1.b.a(0, string, R.string.lbl_yes, R.string.lbl_no, t0Var);
                q1VarA.setCancelable(false);
                v childFragmentManager = kVar.getChildFragmentManager();
                childFragmentManager.getClass();
                q1VarA.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
                return;
            }
            kVar.y6();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.laps.ActivityDetailsSplitsFragment$onViewCreated$1", f = "ActivityDetailsSplitsFragment.kt", l = {146}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f186770a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.laps.ActivityDetailsSplitsFragment$onViewCreated$1$1", f = "ActivityDetailsSplitsFragment.kt", l = {147}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f186772a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f186773b;

            /* JADX INFO: renamed from: wr.k$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3479a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ k f186774a;

                public C3479a(k kVar) {
                    this.f186774a = kVar;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    x1 x1Var;
                    ps.q1 summaryDTO;
                    t.e eVar = (t.e) obj;
                    r rVar = eVar.f127331a;
                    ps.p pVar = eVar.f127332b;
                    Long activityId = rVar != null ? rVar.getActivityId() : null;
                    List<ps.x0> listG = pVar != null ? pVar.g() : null;
                    Long userProfileId = rVar != null ? rVar.getUserProfileId() : null;
                    List<o1> listT = rVar != null ? rVar.t() : null;
                    List<x1> listI = pVar != null ? pVar.i() : null;
                    x0 x0VarH = rVar != null ? rVar.h() : null;
                    ps.q1 summaryDTO2 = rVar != null ? rVar.getSummaryDTO() : null;
                    i0 i0Var = new i0();
                    if (summaryDTO2 != null) {
                        i0Var.k(new JSONObject(GsonUtil.a(summaryDTO2)));
                    }
                    long jC5 = (rVar == null || (summaryDTO = rVar.getSummaryDTO()) == null) ? 0L : summaryDTO.c5();
                    if (activityId != null && activityId.longValue() != 0 && x0VarH != null) {
                        k kVar = this.f186774a;
                        if (kVar.f186760e == null) {
                            kVar.f186760e = x0VarH;
                        }
                        if (listI != null) {
                            kVar.f186761f = listI;
                            kVar.u6(activityId.longValue(), userProfileId, i0Var, listT, jC5);
                        } else if (listG != null) {
                            long jLongValue = activityId.longValue();
                            new com.garmin.android.apps.connectmobile.activities.newmodel.g();
                            ArrayList arrayList = new ArrayList();
                            for (ps.x0 x0Var : listG) {
                                int iIndexOf = listG.indexOf(x0Var);
                                x0 x0Var2 = kVar.f186760e;
                                if (x0Var2 == null) {
                                    p005kotlin.jvm.internal.s.m("activityType");
                                    throw null;
                                }
                                String str = x0Var2.f4358a;
                                x0Var.getClass();
                                str.getClass();
                                if (str.equals(x0.A2.f4358a) || str.equals(x0.B2.f4358a) || str.equals(x0.O2.f4358a) || str.equals(x0.P2.f4358a)) {
                                    Double duration = x0Var.getDuration();
                                    Double maxSpeed = x0Var.getMaxSpeed();
                                    x1Var = new x1(null, null, null, x0Var.getAverageSpeed(), null, x0Var.getDistance(), duration, null, x0Var.getMovingDuration(), x0Var.getAverageHR(), x0Var.getMaxHR(), null, null, null, null, Integer.valueOf(iIndexOf), null, null, null, null, null, null, false, null, x0Var.getCalories(), null, null, null, null, null, null, null, x0Var.getMinTemperature(), x0Var.getMaxTemperature(), x0Var.getAverageTemperature(), maxSpeed, x0Var.getNormalizedPower(), x0Var.getAveragePower(), x0Var.getMaxPower(), null, null, null, null, x0Var.getLeftBalance(), x0Var.getRightBalance(), x0Var.getAverageBikeCadence(), x0Var.getMaxBikeCadence(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16811881, -30848, 2097151, null);
                                } else if (str.equals(x0.Y.f4358a) || str.equals(x0.Z.f4358a)) {
                                    Double duration2 = x0Var.getDuration();
                                    Double bottomTime = x0Var.getBottomTime();
                                    if (bottomTime == null) {
                                        bottomTime = x0Var.getDuration();
                                    }
                                    Double maxDepth = x0Var.getMaxDepth();
                                    x1Var = new x1(null, null, null, null, null, null, duration2, null, null, x0Var.getAverageHR(), x0Var.getMaxHR(), null, null, null, null, Integer.valueOf(iIndexOf), x0Var.getStartLatitude(), x0Var.getStartLongitude(), null, x.DIVE.f147220a, null, null, false, null, null, null, null, null, null, null, null, null, x0Var.getMinTemperature(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, bottomTime, x0Var.getSurfaceInterval(), maxDepth, null, null, null, null, null, null, null, null, null, -755265, -2, 2093567, null);
                                } else {
                                    x1Var = null;
                                }
                                if (x1Var != null) {
                                    arrayList.add(x1Var);
                                }
                            }
                            kVar.f186761f = arrayList;
                            kVar.u6(jLongValue, userProfileId, i0Var, null, jC5);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f186773b = kVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f186773b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f186772a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    a aVar2 = k.f186755l;
                    k kVar = this.f186773b;
                    p2 p2Var = kVar.v6().S1;
                    C3479a c3479a = new C3479a(kVar);
                    this.f186772a = 1;
                    if (p2Var.collect(c3479a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                o2.c.f();
                return null;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return k.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f186770a;
            if (i14 == 0) {
                o13.r.b(obj);
                k kVar = k.this;
                n0 viewLifecycleOwner = kVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
                a aVar2 = new a(kVar, null);
                this.f186770a = 1;
                if (h1.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f186775a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f186775a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f186775a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186775a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186776a;

        public f(Fragment fragment) {
            this.f186776a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f186776a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<qr.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f186778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f186779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f186780d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f186781e;

        public g(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f186777a = fragment;
            this.f186778b = qualifier;
            this.f186779c = aVar;
            this.f186780d = aVar2;
            this.f186781e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final qr.t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f186779c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f186777a;
            e23.a aVar = this.f186780d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(qr.t.class), f189591b, null, defaultViewModelCreationExtras, this.f186778b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f186781e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186782a;

        public h(Fragment fragment) {
            this.f186782a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f186782a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<o6> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f186783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f186784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f186785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f186786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f186787e;

        public i(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f186783a = fragment;
            this.f186784b = qualifier;
            this.f186785c = aVar;
            this.f186786d = aVar2;
            this.f186787e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.o6] */
        @Override // e23.a
        public final o6 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f186785c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f186783a;
            e23.a aVar = this.f186786d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(o6.class), f189591b, null, defaultViewModelCreationExtras, this.f186784b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f186787e, 4, null);
        }
    }

    public k() {
        f fVar = new f(this);
        o13.n nVar = o13.n.NONE;
        this.f186756a = o13.m.a(nVar, new g(this, null, fVar, null, null));
        this.f186758c = o13.m.a(nVar, new i(this, null, new h(this), null, null));
        this.f186764i = new c();
        this.f186765j = uq.k.READ_ONLY;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10001) {
            qr.t tVarV6 = v6();
            tVarV6.X4(tVarV6.f146575z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f186762g = context instanceof e1 ? (e1) context : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        this.f186763h = onBackPressedDispatcher;
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.b(this.f186764i, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_activity_stats_splits, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f186766k) {
            ((o6) this.f186758c.getValue()).f146411a.j(Boolean.valueOf(!w6()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        ArrayList parcelableArrayList;
        x0 x0Var;
        i0 i0Var;
        Parcelable parcelable;
        Object serializable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        Long lValueOf = arguments != null ? Long.valueOf(arguments.getLong("GCM_extra_activity_id")) : null;
        Bundle arguments2 = getArguments();
        Long lValueOf2 = arguments2 != null ? Long.valueOf(arguments2.getLong("GCM_userProfileId")) : null;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments3.getParcelableArrayList("GCM_extra_activity_splits", x1.class) : arguments3.getParcelableArrayList("GCM_extra_activity_splits");
        } else {
            parcelableArrayList = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments4.getSerializable("GCM_extra_activity_type", x0.class);
            } else {
                Object serializable2 = arguments4.getSerializable("GCM_extra_activity_type");
                if (!(serializable2 instanceof x0)) {
                    serializable2 = null;
                }
                serializable = (x0) serializable2;
            }
            x0Var = (x0) serializable;
        } else {
            x0Var = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments5.getParcelable("GCM_extra_activity_summary", i0.class);
            } else {
                Parcelable parcelable2 = arguments5.getParcelable("GCM_extra_activity_summary");
                if (!(parcelable2 instanceof i0)) {
                    parcelable2 = null;
                }
                parcelable = (i0) parcelable2;
            }
            i0Var = (i0) parcelable;
        } else {
            i0Var = null;
        }
        Bundle arguments6 = getArguments();
        long j8 = arguments6 != null ? arguments6.getLong("extra_activity_start_time_millis", -1L) : -1L;
        Bundle arguments7 = getArguments();
        this.f186766k = arguments7 != null ? arguments7.getBoolean("supports_orientation_override") : false;
        w13.c cVar = uq.k.f172266g;
        cVar.getClass();
        uq.k[] kVarArr = (uq.k[]) p005kotlin.jvm.internal.i.d(cVar, new uq.k[0]);
        Bundle arguments8 = getArguments();
        uq.k kVar = this.f186765j;
        this.f186765j = kVarArr[arguments8 != null ? arguments8.getInt("extra.view.mode", kVar.ordinal()) : kVar.ordinal()];
        if (x0Var != null) {
            this.f186760e = x0Var;
        }
        if (lValueOf != null && lValueOf.longValue() != 0 && x0Var != null && parcelableArrayList != null && i0Var != null && j8 != -1) {
            this.f186761f = parcelableArrayList;
            u6(lValueOf.longValue(), lValueOf2, i0Var, null, j8);
            return;
        }
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new d(null), 3);
        if (getResources().getConfiguration().orientation == 2) {
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.activity_stats_splits_container);
            wr.g gVar = new wr.g(0);
            WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
            androidx.core.view.s0.d.c(viewGroup, gVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[FALL_THROUGH] */
    public final void u6(final long j8, final Long l14, final i0 i0Var, final List<o1> list, final long j14) {
        boolean z14;
        List<x> listG;
        RecyclerView recyclerView;
        View viewFindViewById;
        if (this.f186757b == null) {
            x0 x0Var = this.f186760e;
            if (x0Var == null) {
                p005kotlin.jvm.internal.s.m("activityType");
                throw null;
            }
            this.f186757b = (tq.a) new androidx.lifecycle.x1(this, new tq.c(j8, x0Var, j14)).b(s0.f105811a.b(tq.a.class));
        }
        tq.a aVar = this.f186757b;
        if (aVar == null) {
            p005kotlin.jvm.internal.s.m("splitsViewModel");
            throw null;
        }
        List<x1> list2 = this.f186761f;
        if (list2 == null) {
            p005kotlin.jvm.internal.s.m("activitySplits");
            throw null;
        }
        aVar.x4(list2, aVar.f165998f);
        aVar.f165997e = list2;
        x0 x0Var2 = this.f186760e;
        if (x0Var2 == null) {
            p005kotlin.jvm.internal.s.m("activityType");
            throw null;
        }
        uq.k kVar = this.f186765j;
        int i14 = tq.k.a.f166034a[x0Var2.ordinal()];
        if (i14 != 1 && i14 != 2 && i14 != 3 && i14 != 4 && i14 != 5) {
            switch (i14) {
                case 21:
                case 22:
                case 23:
                    if (kVar == uq.k.READ_ONLY) {
                        z14 = true;
                        break;
                    }
                default:
                    z14 = false;
                    break;
            }
        } else if (kVar == uq.k.READ_ONLY) {
            z14 = true;
        } else {
            z14 = false;
        }
        View view2 = getView();
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.filter_heading)) != null) {
            viewFindViewById.setVisibility(z14 ? 0 : 8);
        }
        if (kVar == uq.k.COMPARISON) {
            listG = tq.k.g(x0Var2);
        } else {
            List<x> listH = tq.k.h(x0Var2);
            if (listH != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listH) {
                    if (((x) obj) != x.PACE_PRO_SPLIT) {
                        arrayList.add(obj);
                    }
                }
                listG = arrayList;
            } else {
                listG = null;
            }
        }
        if (listG == null) {
            listG = j0.f134944a;
        }
        tq.a aVar2 = this.f186757b;
        if (aVar2 == null) {
            p005kotlin.jvm.internal.s.m("splitsViewModel");
            throw null;
        }
        tq.d dVar = new tq.d(x0Var2, listG, aVar2.f166000h, new wr.i(this, 1));
        View view3 = getView();
        if (view3 != null && (recyclerView = (RecyclerView) view3.findViewById(R.id.filter_chip)) != null) {
            recyclerView.setVisibility(z14 ? 0 : 8);
            if (z14) {
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
                recyclerView.setAdapter(dVar);
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                recyclerView.addItemDecoration(new r22.z0(contextRequireContext, null, null, Integer.valueOf(R.dimen.spacing_small), null));
            }
        }
        tq.a aVar3 = this.f186757b;
        if (aVar3 == null) {
            p005kotlin.jvm.internal.s.m("splitsViewModel");
            throw null;
        }
        ps.i0 value = v6().y5().getValue();
        x0 x0Var3 = aVar3.f165994b;
        x0 x0Var4 = x0.f4296k0;
        androidx.lifecycle.s0 s0VarA = aVar3.f166002j;
        if (x0Var3 == x0Var4) {
            s0VarA = t1.a(s0VarA, new tn2.t(value, 6));
        }
        s0VarA.f(getViewLifecycleOwner(), new z0() { // from class: wr.h
            /* JADX WARN: Code duplicated, block: B:170:0x04d0  */
            /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj2) {
                List listY0;
                List listN0;
                i0 i0Var2;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                List listB1;
                ViewGroup viewGroup;
                List listB2;
                View view4;
                List listB3;
                List listB4;
                List list3 = (List) obj2;
                final k kVar2 = this.f186740a;
                uq.k kVar3 = kVar2.f186765j;
                uq.k kVar4 = uq.k.COMPARISON;
                tq.a aVar4 = kVar2.f186757b;
                if (kVar3 == kVar4) {
                    if (aVar4 == null) {
                        p005kotlin.jvm.internal.s.m("splitsViewModel");
                        throw null;
                    }
                    listY0 = aVar4.f165999g;
                } else {
                    if (aVar4 == null) {
                        p005kotlin.jvm.internal.s.m("splitsViewModel");
                        throw null;
                    }
                    List<? extends x> list4 = aVar4.f165998f;
                    listY0 = list4 != null ? h0.y0(list4, x.PACE_PRO_SPLIT) : null;
                }
                String str = "activityType";
                if (k.b.f186767a[kVar2.f186765j.ordinal()] != 2) {
                    listN0 = list3;
                } else {
                    tq.i iVar = tq.i.f166030a;
                    x0 x0Var5 = kVar2.f186760e;
                    if (x0Var5 == null) {
                        p005kotlin.jvm.internal.s.m("activityType");
                        throw null;
                    }
                    iVar.getClass();
                    int i24 = tq.i.a.f166031a[x0Var5.ordinal()];
                    tq.f fVar = (i24 == 1 || i24 == 2) ? new tq.f(tq.j.TOP, 5, uq.i.SPEED_10S_NAUTICAL, w.c(x.WINDSURF_ACTIVE)) : null;
                    if (fVar != null) {
                        ArrayList arrayListL = androidx.core.view.j.l(list3);
                        for (Object obj3 : list3) {
                            if (h0.R(fVar.f166024d, ((x1) obj3).a2())) {
                                arrayListL.add(obj3);
                            }
                        }
                        double dV3 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).v3();
                        listN0 = fVar.f166021a == tq.j.TOP ? h0.N0(arrayListL, new tq.h(fVar, dV3)) : h0.N0(arrayListL, new tq.g(fVar, dV3));
                        int size = listN0.size();
                        int i25 = fVar.f166022b;
                        if (size > i25) {
                            listN0 = listN0.subList(0, i25);
                        }
                        if (listN0 == null) {
                            listN0 = list3;
                        }
                    } else {
                        listN0 = list3;
                    }
                }
                ArrayList arrayListL2 = androidx.core.view.j.l(listN0);
                for (Object obj4 : listN0) {
                    x1 x1Var = (x1) obj4;
                    if (listY0 == null || listY0.isEmpty() || h0.R(listY0, x1Var.a2())) {
                        arrayListL2.add(obj4);
                    }
                }
                ArrayList arrayListL3 = androidx.core.view.j.l(list3);
                for (Object obj5 : list3) {
                    x1 x1Var2 = (x1) obj5;
                    if (listY0 == null || listY0.isEmpty() || h0.R(listY0, x1Var2.a2())) {
                        arrayListL3.add(obj5);
                    }
                }
                x0 x0Var6 = kVar2.f186760e;
                if (x0Var6 == null) {
                    p005kotlin.jvm.internal.s.m("activityType");
                    throw null;
                }
                boolean z15 = ((t.b) kVar2.v6().W1.getValue()).f127326b;
                String str2 = ((t.b) kVar2.v6().W1.getValue()).f127327c;
                uq.k kVar5 = kVar2.f186765j;
                ps.i0 value2 = kVar2.v6().y5().getValue();
                View view5 = kVar2.getView();
                i0 i0Var3 = i0Var;
                if (view5 == null || (viewGroup = (ViewGroup) view5.findViewById(R.id.container)) == null) {
                    i0Var2 = i0Var3;
                    list3 = list3;
                    str = "activityType";
                    i15 = 0;
                } else {
                    viewGroup.removeAllViews();
                    vy0.e eVar = k.b.f186767a[kVar5.ordinal()] == 1 ? new vy0.e(kVar2, 10) : null;
                    Context context = viewGroup.getContext();
                    context.getClass();
                    i0Var2 = i0Var3;
                    wq.i iVar2 = new wq.i(context, x0Var6, arrayListL2, arrayListL3, i0Var2, list, listY0, kVar5, eVar, kVar2.w6(), value2, z15, str2);
                    kVar2.f186759d = iVar2;
                    boolean zG = iVar2.g();
                    List<x1> list5 = iVar2.f186559c;
                    Context context2 = iVar2.f186557a;
                    x0 x0Var7 = iVar2.f186558b;
                    uq.k kVar6 = iVar2.f186564h;
                    uq.b bVar = iVar2.f186572p;
                    boolean z16 = iVar2.f186566j;
                    if (zG || !z16) {
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(1);
                        LinearLayout linearLayout2 = new LinearLayout(context2);
                        linearLayout2.setOrientation(1);
                        uq.k kVar7 = uq.k.EDIT;
                        e23.p<x1, Integer, Unit> pVar = iVar2.f186565i;
                        boolean z17 = kVar6 == kVar7 && pVar != null;
                        if (kVar6 == kVar7 && pVar != null) {
                            x0Var7.getClass();
                            listB2 = h0.b1(uq.d.b(x0Var7).f172183f);
                        } else if (kVar6 == uq.k.COMPARISON) {
                            x0Var7.getClass();
                            listB2 = h0.b1(uq.d.b(x0Var7).f172185h);
                        } else if (kVar6 == uq.k.ALTERNATE) {
                            x0Var7.getClass();
                            listB2 = h0.b1(uq.d.b(x0Var7).f172179b);
                        } else {
                            x0Var7.getClass();
                            List listB5 = h0.b1(uq.d.b(x0Var7).f172178a);
                            listB5.getClass();
                            list5.getClass();
                            ArrayList arrayList2 = new ArrayList(listB5);
                            if (!am.z0.d0(x0Var7.f4358a) || list5.size() <= 4) {
                                listB2 = arrayList2;
                            } else {
                                uq.h hVar = new uq.h(uq.i.AVG_SPEED, false);
                                ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
                                for (Object obj6 : arrayList2) {
                                    uq.h hVar2 = (uq.h) obj6;
                                    hVar2.getClass();
                                    uq.h hVar3 = hVar;
                                    if (hVar2.f172205a == uq.i.SPEED_10S_NAUTICAL) {
                                        obj6 = hVar3;
                                    }
                                    arrayList3.add(obj6);
                                    hVar = hVar3;
                                }
                                listB2 = arrayList3;
                            }
                        }
                        listB2.getClass();
                        list5.getClass();
                        x0Var7.getClass();
                        ArrayList arrayList4 = new ArrayList(listB2);
                        uq.d.a(arrayList4, list5, x0Var7);
                        linearLayout.addView(wq.i.e(iVar2, bVar.a(arrayList4), z17, null, 4));
                        Iterator it = wq.i.b(iVar2, arrayList4, z17, null, 4).iterator();
                        while (it.hasNext()) {
                            linearLayout2.addView((View) it.next());
                        }
                        LinearLayout linearLayoutD = wq.i.d(iVar2);
                        if (linearLayoutD != null) {
                            linearLayout2.addView(linearLayoutD);
                        }
                        if (iVar2.f186568l) {
                            wd.c cVar = new wd.c(iVar2, 10);
                            i15 = 0;
                            View viewInflate = LayoutInflater.from(context2).inflate(R.layout.composable_container, (ViewGroup) linearLayout2, false);
                            mq.k.a(viewInflate, cVar);
                            linearLayout2.addView(viewInflate);
                        } else {
                            i15 = 0;
                        }
                        if (z16) {
                            LayoutInflater.from(context2).inflate(R.layout.orientation_hint, linearLayout2).findViewById(R.id.orientation_hint_img).setContentDescription(context2.getString(R.string.msg_rotate_phone_for_more_stats));
                        }
                        NestedScrollView nestedScrollView = new NestedScrollView(context2);
                        nestedScrollView.addView(linearLayout2);
                        linearLayout.addView(nestedScrollView);
                        view4 = linearLayout;
                    } else {
                        View viewInflate2 = LayoutInflater.from(context2).inflate(R.layout.activity_stats_laps_landscape_3_0, (ViewGroup) null);
                        viewInflate2.getClass();
                        LinearLayout linearLayout3 = (LinearLayout) viewInflate2.findViewById(R.id.activity_stats_laps_number_container);
                        LinearLayout linearLayout4 = (LinearLayout) viewInflate2.findViewById(R.id.activity_stats_laps_data_container);
                        LinearLayout linearLayout5 = (LinearLayout) viewInflate2.findViewById(R.id.number_container);
                        LinearLayout linearLayout6 = (LinearLayout) viewInflate2.findViewById(R.id.data_container);
                        ScrollView scrollView = (ScrollView) viewInflate2.findViewById(R.id.number_scroll_view);
                        ScrollView scrollView2 = (ScrollView) viewInflate2.findViewById(R.id.data_scroll_view);
                        lq.a aVar5 = new lq.a(scrollView2, 6);
                        lq.a aVar6 = new lq.a(scrollView, 7);
                        scrollView.setOnScrollChangeListener(aVar5);
                        scrollView2.setOnScrollChangeListener(aVar6);
                        f12.l.f68084a.getClass();
                        boolean z18 = !Double.isNaN(f12.l.a.a().v3()) && f12.l.a.a().v3() > 0.0d;
                        int[] iArr = wq.i.a.f186574a;
                        if (iArr[kVar6.ordinal()] == 1) {
                            x0Var7.getClass();
                            listB3 = h0.b1(uq.d.b(x0Var7).f172184g);
                        } else {
                            x0Var7.getClass();
                            listB3 = h0.b1(uq.d.b(x0Var7).f172182e);
                        }
                        int i26 = iArr[kVar6.ordinal()];
                        if (i26 == 1) {
                            x0Var7.getClass();
                            listB4 = h0.b1(uq.d.b(x0Var7).f172186i);
                        } else if (i26 != 2) {
                            x0Var7.getClass();
                            listB4 = h0.b1(uq.d.b(x0Var7).f172180c);
                        } else {
                            x0Var7.getClass();
                            listB4 = h0.b1(uq.d.b(x0Var7).f172181d);
                        }
                        ArrayList arrayListC = uq.d.c(listB4, list5, x0Var7, z18);
                        Iterator it3 = h0.b1(listB3).iterator();
                        int i27 = 0;
                        while (it3.hasNext()) {
                            i27 += iVar2.f(((uq.h) it3.next()).f172205a.f172257b).width;
                        }
                        int i28 = (iVar2.f186571o * 4) + i27;
                        LinearLayout linearLayoutE = wq.i.e(iVar2, bVar.a(listB3), false, null, 6);
                        linearLayout5.addView(linearLayoutE, 0);
                        Iterator it4 = wq.i.b(iVar2, listB3, false, null, 6).iterator();
                        while (it4.hasNext()) {
                            linearLayout3.addView((View) it4.next());
                        }
                        LinearLayout linearLayoutD2 = wq.i.d(iVar2);
                        if (linearLayoutD2 != null) {
                            linearLayout3.addView(linearLayoutD2);
                        }
                        LinearLayout linearLayoutE2 = wq.i.e(iVar2, bVar.a(arrayListC), false, Integer.valueOf(i28), 2);
                        linearLayout6.addView(linearLayoutE2, 0);
                        linearLayoutE2.getViewTreeObserver().addOnGlobalLayoutListener(new com.google.firebase.perf.util.a(2, linearLayoutE2, linearLayoutE));
                        Iterator it5 = wq.i.b(iVar2, arrayListC, false, Integer.valueOf(i28), 2).iterator();
                        while (it5.hasNext()) {
                            linearLayout4.addView((View) it5.next());
                        }
                        LinearLayout linearLayoutD3 = wq.i.d(iVar2);
                        if (linearLayoutD3 != null) {
                            linearLayout4.addView(linearLayoutD3);
                        }
                        view4 = viewInflate2;
                        i15 = 0;
                    }
                    viewGroup.addView(view4);
                }
                final x0 x0Var8 = kVar2.f186760e;
                if (x0Var8 == null) {
                    p005kotlin.jvm.internal.s.m(str);
                    throw null;
                }
                uq.k kVar8 = kVar2.f186765j;
                View view6 = kVar2.getView();
                View viewFindViewById2 = view6 != null ? view6.findViewById(R.id.editButton) : null;
                final Long l15 = l14;
                if (viewFindViewById2 != null) {
                    final long j15 = j8;
                    final long j16 = j14;
                    final i0 i0Var4 = i0Var2;
                    final List list6 = list3;
                    i16 = 6;
                    i17 = 1;
                    v22.e.n(viewFindViewById2, new e23.l() { // from class: wr.j
                        @Override // e23.l
                        public final Object invoke(Object obj7) {
                            k.a aVar7 = k.f186755l;
                            ((View) obj7).getClass();
                            EditActivityStatsSplitsActivity.f29949c.getClass();
                            x0 x0Var9 = x0Var8;
                            x0Var9.getClass();
                            List list7 = list6;
                            list7.getClass();
                            k kVar9 = kVar2;
                            Intent intent = new Intent(kVar9.getContext(), (Class<?>) EditActivityStatsSplitsActivity.class);
                            intent.putExtra("GCM_extra_activity_id", j15);
                            Long l16 = l15;
                            if (l16 != null) {
                                intent.putExtra("GCM_userProfileId", l16.longValue());
                            }
                            intent.putExtra("GCM_extra_activity_type", (Parcelable) x0Var9);
                            intent.putParcelableArrayListExtra("GCM_extra_activity_splits", new ArrayList<>(list7));
                            intent.putExtra("GCM_extra_activity_summary", i0Var4);
                            intent.putExtra("extra_activity_start_time_millis", j16);
                            kVar9.startActivityForResult(intent, 10001);
                            return Unit.INSTANCE;
                        }
                    });
                } else {
                    i16 = 6;
                    i17 = 1;
                }
                if (l15 == null) {
                    i18 = i15;
                } else if (l15.longValue() == ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, i16, null)).getUserProfilePk()) {
                    i18 = i17;
                } else {
                    i18 = i15;
                }
                int i29 = kVar8 != uq.k.EDIT ? i17 : i15;
                boolean zIsEmpty = list3.isEmpty();
                wq.i iVar3 = kVar2.f186759d;
                if (iVar3 == null) {
                    p005kotlin.jvm.internal.s.m("viewBuilder");
                    throw null;
                }
                boolean zG2 = iVar3.g();
                if (kVar8 != uq.k.ALTERNATE) {
                    i17 = i15;
                }
                if (viewFindViewById2 != null) {
                    if (i18 == 0 || ((listB1 = h0.b1(uq.d.b(x0Var8).f172183f)) != null && listB1.isEmpty())) {
                        i19 = 8;
                    } else {
                        Iterator it6 = listB1.iterator();
                        while (it6.hasNext()) {
                            if (((uq.h) it6.next()).f172206b) {
                                if (i17 != 0 || i29 == 0 || zIsEmpty || !zG2) {
                                    break;
                                } else {
                                    i19 = i15;
                                }
                            }
                        }
                        i19 = 8;
                    }
                    viewFindViewById2.setVisibility(i19);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final qr.t v6() {
        return (qr.t) this.f186756a.getValue();
    }

    public final boolean w6() {
        if (this.f186760e != null && this.f186761f != null) {
            f12.l.f68084a.getClass();
            boolean z14 = !Double.isNaN(f12.l.a.a().v3()) && f12.l.a.a().v3() > 0.0d;
            x0 x0Var = this.f186760e;
            if (x0Var == null) {
                p005kotlin.jvm.internal.s.m("activityType");
                throw null;
            }
            List listB1 = h0.b1(uq.d.b(x0Var).f172186i);
            List<x1> list = this.f186761f;
            if (list == null) {
                p005kotlin.jvm.internal.s.m("activitySplits");
                throw null;
            }
            x0 x0Var2 = this.f186760e;
            if (x0Var2 == null) {
                p005kotlin.jvm.internal.s.m("activityType");
                throw null;
            }
            ArrayList arrayListC = uq.d.c(listB1, list, x0Var2, z14);
            int i14 = b.f186767a[this.f186765j.ordinal()];
            if (i14 != 1 && i14 != 2) {
                x0 x0Var3 = this.f186760e;
                if (i14 != 3) {
                    if (x0Var3 == null) {
                        p005kotlin.jvm.internal.s.m("activityType");
                        throw null;
                    }
                    if (h0.b1(uq.d.b(x0Var3).f172182e).isEmpty()) {
                        x0 x0Var4 = this.f186760e;
                        if (x0Var4 == null) {
                            p005kotlin.jvm.internal.s.m("activityType");
                            throw null;
                        }
                        if (!h0.b1(uq.d.b(x0Var4).f172180c).isEmpty()) {
                        }
                    }
                    return true;
                }
                if (x0Var3 == null) {
                    p005kotlin.jvm.internal.s.m("activityType");
                    throw null;
                }
                int size = arrayListC.size() + h0.b1(uq.d.b(x0Var3).f172184g).size();
                x0 x0Var5 = this.f186760e;
                if (x0Var5 == null) {
                    p005kotlin.jvm.internal.s.m("activityType");
                    throw null;
                }
                if (size > h0.b1(uq.d.b(x0Var5).f172185h).size()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void y6() {
        if (this.f186763h != null) {
            this.f186764i.f(false);
            u uVar = this.f186763h;
            if (uVar != null) {
                uVar.d();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lwr/k$a;", "", "<init>", "()V", "", "REQUEST_CODE_EDIT", "I", "", "EXTRA_VIEW_MODE", "Ljava/lang/String;", "EXTRA_SUPPORTS_ORIENTATION_OVERRIDE", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static k a(long j8, uq.k kVar, boolean z14, x0 x0Var) {
            kVar.getClass();
            k kVar2 = new k();
            Bundle bundle = new Bundle(4);
            bundle.putLong("GCM_extra_activity_id", j8);
            bundle.putInt("extra.view.mode", kVar.ordinal());
            bundle.putBoolean("supports_orientation_override", z14);
            bundle.putSerializable("GCM_extra_activity_type", x0Var);
            kVar2.setArguments(bundle);
            return kVar2;
        }

        public static /* synthetic */ k b(a aVar, long j8, uq.k kVar, boolean z14) {
            aVar.getClass();
            return a(j8, kVar, z14, null);
        }

        private a() {
        }
    }
}
