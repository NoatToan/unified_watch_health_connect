package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import java.util.List;
import mt0.i2;
import o53.c2;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/a0;", "Lcom/garmin/android/apps/connectmobile/d0;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends com.garmin.android.apps.connectmobile.d0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f37297w = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37299n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.a f37300o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i2 f37302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f37303r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f37304t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f37305v;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37298m = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f37301p = "";

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37306a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37306a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/a0$c", "Lr22/i0;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends r22.i0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a0 f37307f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.p pVar, a0 a0Var) {
            super(pVar, 100);
            this.f37307f = a0Var;
        }

        @Override // r22.i0
        public final void a(int i14) {
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2.CHALLENGES, "CompletedChallengesFragment", "onLoadComplete: total number = " + i14);
            a aVar2 = a0.f37297w;
            a0 a0Var = this.f37307f;
            a0Var.f33121i.postDelayed(new k32.n(a0Var, 17), 2000L);
        }

        @Override // r22.i0
        public final void b(int i14, int i15) {
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2.CHALLENGES, "CompletedChallengesFragment", "onLoadMore: start = " + i14 + ", limit = " + i15);
            a aVar2 = a0.f37297w;
            this.f37307f.e7(i14, i15, false);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37308a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f37308a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37308a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37308a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37309a;

        public e(Fragment fragment) {
            this.f37309a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f37309a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<pt0.z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37314e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37310a = fragment;
            this.f37311b = qualifier;
            this.f37312c = aVar;
            this.f37313d = aVar2;
            this.f37314e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, pt0.z] */
        @Override // e23.a
        public final pt0.z invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f37312c.invoke()).getF189591b();
            Fragment fragment = this.f37310a;
            e23.a aVar = this.f37313d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.z.class), f189591b, null, defaultViewModelCreationExtras, this.f37311b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37314e, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37315a;

        public g(Fragment fragment) {
            this.f37315a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f37315a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<pt0.e0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37320e;

        public h(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37316a = fragment;
            this.f37317b = qualifier;
            this.f37318c = aVar;
            this.f37319d = aVar2;
            this.f37320e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, pt0.e0] */
        @Override // e23.a
        public final pt0.e0 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f37318c.invoke()).getF189591b();
            Fragment fragment = this.f37316a;
            e23.a aVar = this.f37319d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.e0.class), f189591b, null, defaultViewModelCreationExtras, this.f37317b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37320e, 4, null);
        }
    }

    public a0() {
        e eVar = new e(this);
        o13.n nVar = o13.n.NONE;
        this.f37303r = o13.m.a(nVar, new f(this, null, eVar, null, null));
        this.f37304t = o13.m.a(nVar, new h(this, null, new g(this), null, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public static final void d7(a0 a0Var, List list) {
        pt0.z zVar = (pt0.z) a0Var.f37303r.getValue();
        int i14 = pt0.z.f140793e;
        x53.c cVar = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        zVar.getClass();
        list.getClass();
        bVar.getClass();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(zVar), bVar, null, new pt0.a0(zVar, list, y0Var, null), 2);
        y0Var.f(a0Var.getViewLifecycleOwner(), new d(new ml0.e(3, a0Var, list)));
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        V6();
        i2 i2Var = this.f37302q;
        if (i2Var != null) {
            i2Var.C(false);
        }
        r22.i0 i0Var = this.f33123k;
        e7(i0Var.f149677b, i0Var.f149678c, true);
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final com.garmin.android.apps.connectmobile.d0.a I6() {
        i2 i2Var = new i2(this.f37301p, this.f37305v);
        if (this.f37298m != -1) {
            i2Var.f120658e = this.f37299n;
        }
        this.f37302q = i2Var;
        return i2Var;
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final r22.i0 J6(RecyclerView.p pVar, int i14) {
        pVar.getClass();
        return new c(pVar, this);
    }

    public final c2 e7(int i14, int i15, boolean z14) {
        return ge1.b.T(g22.f.b(this), null, null, new b0(z14, this, i14, i15, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        r22.i0 i0Var = this.f33123k;
        e7(i0Var.f149677b, i0Var.f149678c, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f37298m = arguments.getInt("GCM_extra_badge_id", -1);
            this.f37300o = com.garmin.android.apps.connectmobile.badges.service.model.a.a(arguments.getInt("GCM_extra_badge_associate_type"));
            this.f37299n = arguments.getInt("GCM_extra_badge_earned_count");
            String string = arguments.getString("GCM_userDisplayName", "");
            string.getClass();
            this.f37301p = string;
            if (this.f37298m == -1) {
                this.f37300o = null;
                return;
            }
            com.garmin.android.apps.connectmobile.badges.service.model.a aVar = this.f37300o;
            if (aVar == com.garmin.android.apps.connectmobile.badges.service.model.a.AD_HOC_CHALLENGE || aVar == com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_CHALLENGE || aVar == com.garmin.android.apps.connectmobile.badges.service.model.a.VIVOKID_TEAM_CHALLENGE || aVar == com.garmin.android.apps.connectmobile.badges.service.model.a.GROUP_CHALLENGE) {
                return;
            }
            Toast.makeText(getActivity(), R.string.txt_error_occurred, 0).show();
            requireActivity().finish();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/a0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "CHALLENGES_PAGE_SIZE", "I", "NO_BADGE", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
