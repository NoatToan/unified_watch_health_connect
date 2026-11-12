package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mt0.h2;
import mt0.m2;
import mt0.p3;
import o53.t1;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/d0;", "Lmt0/h2;", "", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d0 extends h2 {
    public static final /* synthetic */ int E = 0;
    public final Object A;
    public AdHocChallengeDTO B;
    public boolean C;
    public boolean D;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f37415z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37416a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37416a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.EndlessParticipantsListFragment$handleFetchResult$1", f = "EndlessParticipantsListFragment.kt", l = {94, 104}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<AdHocChallengePlayerDTO> f37418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d0 f37419c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.EndlessParticipantsListFragment$handleFetchResult$1$2", f = "EndlessParticipantsListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d0 f37420a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List<AdHocChallengePlayerDTO> f37421b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d0 d0Var, List<? extends AdHocChallengePlayerDTO> list, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f37420a = d0Var;
                this.f37421b = list;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f37420a, this.f37421b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                d0 d0Var = this.f37420a;
                d0Var.e7().addAll(this.f37421b);
                d0Var.e7().notifyDataSetChanged();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends AdHocChallengePlayerDTO> list, d0 d0Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f37418b = list;
            this.f37419c = d0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f37418b, this.f37419c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
        
            if (ge1.b.e0(r2, r4, r18) == r1) goto L44;
         */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, o13.l] */
        /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
            com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f37417a;
            d0 d0Var = this.f37419c;
            List<AdHocChallengePlayerDTO> list = this.f37418b;
            if (i14 != 0) {
                if (i14 == 1) {
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
            ArrayList arrayListX = v.h.x(obj);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String str = ((AdHocChallengePlayerDTO) it.next()).f38007a;
                Integer num = str != null ? new Integer(Integer.parseInt(str)) : null;
                if (num != null) {
                    arrayListX.add(num);
                }
            }
            List<Integer> listB1 = p13.h0.b1(p13.h0.f1(arrayListX));
            p3 p3Var = (p3) d0Var.A.getValue();
            this.f37417a = 1;
            if (p3Var.x4(listB1, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, this) != aVar) {
            }
            return aVar;
            for (AdHocChallengePlayerDTO adHocChallengePlayerDTO : list) {
                p3 p3Var2 = (p3) d0Var.A.getValue();
                String str2 = adHocChallengePlayerDTO.f38007a;
                com.garmin.android.apps.connectmobile.userprofile.model.l lVar = p3Var2.f120809b.get(str2 != null ? new Integer(Integer.parseInt(str2)) : null);
                adHocChallengePlayerDTO.f38019m = new b12.b((lVar == null || (profileImageUrls2 = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls2.f46879h, null, null, null, null, 30, null);
                adHocChallengePlayerDTO.f38020n = new b12.b((lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls.f46876e, null, null, null, null, 30, null);
            }
            x53.c cVar = o53.s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            a aVar2 = new a(d0Var, list, null);
            this.f37417a = 2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37422a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f37422a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37422a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37422a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37423a;

        public e(Fragment fragment) {
            this.f37423a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37423a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<p3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37428e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37424a = fragment;
            this.f37425b = qualifier;
            this.f37426c = aVar;
            this.f37427d = aVar2;
            this.f37428e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, mt0.p3] */
        @Override // e23.a
        public final p3 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37426c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37424a;
            e23.a aVar = this.f37427d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(p3.class), f189591b, null, defaultViewModelCreationExtras, this.f37425b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37428e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37429a;

        public g(Fragment fragment) {
            this.f37429a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f37429a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<pt0.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37434e;

        public h(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37430a = fragment;
            this.f37431b = qualifier;
            this.f37432c = aVar;
            this.f37433d = aVar2;
            this.f37434e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, pt0.f] */
        @Override // e23.a
        public final pt0.f invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f37432c.invoke()).getF189591b();
            Fragment fragment = this.f37430a;
            e23.a aVar = this.f37433d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.f.class), f189591b, null, defaultViewModelCreationExtras, this.f37431b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37434e, 4, null);
        }
    }

    static {
        new a(null);
    }

    public d0() {
        g gVar = new g(this);
        o13.n nVar = o13.n.NONE;
        this.f37415z = o13.m.a(nVar, new h(this, null, gVar, null, null));
        this.A = o13.m.a(nVar, new f(this, null, new e(this), null, null));
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final int A6() {
        return 50;
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final boolean G6() {
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        S6();
        H6(1, 100);
    }

    @Override // mt0.h2
    public final boolean U6(int i14) {
        int i15;
        u6();
        int headerViewsCount = this.f7311e.getHeaderViewsCount();
        if (i14 >= headerViewsCount && (i15 = i14 - headerViewsCount) < e7().getCount()) {
            AdHocChallengePlayerDTO adHocChallengePlayerDTO = (AdHocChallengePlayerDTO) e7().getItem(i15);
            if (!(adHocChallengePlayerDTO == null ? false : p005kotlin.jvm.internal.s.g(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), adHocChallengePlayerDTO.f38007a))) {
                return true;
            }
        }
        return false;
    }

    @Override // mt0.h2
    public final boolean V6() {
        return (!p005kotlin.jvm.internal.s.g(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), f7().f37992f) || f7().C() == com.garmin.android.apps.connectmobile.leaderboard.model.v.COMPLETED || x.t(f7())) ? false : true;
    }

    @Override // mt0.h2
    public final void X6() {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        u6();
        SparseBooleanArray checkedItemPositions = this.f7311e.getCheckedItemPositions();
        u6();
        int headerViewsCount = this.f7311e.getHeaderViewsCount();
        int size = checkedItemPositions.size();
        for (int i14 = 0; i14 < size; i14++) {
            int iKeyAt = checkedItemPositions.keyAt(i14);
            sparseBooleanArray.put(iKeyAt - headerViewsCount, checkedItemPositions.get(iKeyAt));
        }
        m2 m2VarE7 = e7();
        m2VarE7.f120715a = sparseBooleanArray;
        m2VarE7.notifyDataSetChanged();
    }

    @Override // mt0.h2
    public final void c7() {
        ArrayList arrayList = new ArrayList();
        SparseBooleanArray sparseBooleanArray = e7().f120715a;
        int count = e7().getCount();
        for (int i14 = 0; i14 < count; i14++) {
            sparseBooleanArray.getClass();
            if (sparseBooleanArray.get(i14, false)) {
                AdHocChallengePlayerDTO adHocChallengePlayerDTO = (AdHocChallengePlayerDTO) e7().getItem(i14);
                String str = adHocChallengePlayerDTO != null ? adHocChallengePlayerDTO.f38007a : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        String str2 = f7().f37993g;
        if (str2 == null) {
            return;
        }
        pt0.f fVarD7 = d7();
        fVarD7.getClass();
        xy2.b.K(fVarD7, new pt0.a(fVarD7, str2, arrayList, null)).f(getViewLifecycleOwner(), new d(new ml0.e(4, this, arrayList)));
        this.D = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final pt0.f d7() {
        return (pt0.f) this.f37415z.getValue();
    }

    public abstract m2 e7();

    public final AdHocChallengeDTO f7() {
        AdHocChallengeDTO adHocChallengeDTO = this.B;
        if (adHocChallengeDTO != null) {
            return adHocChallengeDTO;
        }
        p005kotlin.jvm.internal.s.m("mChallenge");
        throw null;
    }

    public final void g7(g3<? extends List<? extends AdHocChallengePlayerDTO>> g3Var, int i14) {
        g3Var.getClass();
        int i15 = b.f37416a[g3Var.f35300a.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                J6(true);
                F6();
                this.C = true;
                return;
            } else if (i15 != 3) {
                lc.u0.r();
                return;
            } else {
                S6();
                this.C = false;
                return;
            }
        }
        List list = (List) g3Var.f35301b;
        if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            if (i14 == 1) {
                e7().clear();
            }
            androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ge1.b.T(o53.f0.w(viewLifecycleOwner), null, null, new c(list, this, null), 3);
        }
        K6(list.size());
        F6();
        this.C = true;
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        l2.f37135b.getClass();
        Bundle bundleC = l2.a.b().c(this);
        AdHocChallengeDTO adHocChallengeDTO = null;
        if (bundleC != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleC.getParcelable("GCM_ad_hoc_challenge", AdHocChallengeDTO.class);
            } else {
                Parcelable parcelable2 = bundleC.getParcelable("GCM_ad_hoc_challenge");
                parcelable = (AdHocChallengeDTO) (parcelable2 instanceof AdHocChallengeDTO ? parcelable2 : null);
            }
            adHocChallengeDTO = (AdHocChallengeDTO) parcelable;
        }
        if (adHocChallengeDTO != null) {
            this.B = adHocChallengeDTO;
        } else {
            i2.a.j(i2.f36769a, "EndlessParticipantsListFragment", "Did not get mChallenge from LargeBundle, to prevent crash, finish current activity");
            requireActivity().finish();
        }
    }

    @Override // mt0.h2, android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        actionMode.getClass();
        super.onDestroyActionMode(actionMode);
        m2 m2VarE7 = e7();
        SparseBooleanArray sparseBooleanArray = m2VarE7.f120715a;
        if (sparseBooleanArray == null) {
            return;
        }
        sparseBooleanArray.clear();
        m2VarE7.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.C) {
            return;
        }
        M7();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/d0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_START_INDEX", "I", "DEFAULT_PAGE_SIZE", "REFRESH_FETCH_SIZE", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
