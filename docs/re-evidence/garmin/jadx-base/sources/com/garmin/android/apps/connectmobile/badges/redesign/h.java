package com.garmin.android.apps.connectmobile.badges.redesign;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d0;
import com.garmin.android.apps.connectmobile.i2;
import fw.p;
import o13.m;
import o53.c2;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r22.i0;
import uu.q;
import uu.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/h;", "Lcom/garmin/android/apps/connectmobile/d0;", "<init>", "()V", "a", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends d0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f30486r = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.redesign.f f30489o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a22.i f30490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f30491q;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30492a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30492a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/badges/redesign/h$c", "Lr22/i0;", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends i0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ h f30493f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.p pVar, int i14, h hVar) {
            super(pVar, i14);
            this.f30493f = hVar;
        }

        @Override // r22.i0
        public final void a(int i14) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.BADGES, "ConnectionsWithBadgesFragment", "onLoadComplete: total number = " + i14);
            this.f30493f.T6(false);
        }

        @Override // r22.i0
        public final void b(int i14, int i15) {
            i2.a aVar = i2.f36769a;
            aVar.getClass();
            i2.a.b(a2.BADGES, "ConnectionsWithBadgesFragment", "onLoadMore: start = " + i14 + ", limit = " + i15);
            a aVar2 = h.f30486r;
            this.f30493f.d7(i14, i15);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f30494a;

        public d(e23.l lVar) {
            lVar.getClass();
            this.f30494a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f30494a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30494a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30495a;

        public e(Fragment fragment) {
            this.f30495a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f30495a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30500e;

        public f(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30496a = fragment;
            this.f30497b = qualifier;
            this.f30498c = aVar;
            this.f30499d = aVar2;
            this.f30500e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, uu.q] */
        @Override // e23.a
        public final q invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f30498c.invoke()).getF189591b();
            Fragment fragment = this.f30496a;
            e23.a aVar = this.f30499d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(q.class), f189591b, null, defaultViewModelCreationExtras, this.f30497b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30500e, 4, null);
        }
    }

    public h() {
        a22.i.f537b.getClass();
        this.f30490p = a22.i.a.a();
        this.f30491q = m.a(o13.n.NONE, new f(this, null, new e(this), null, null));
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final d0.a I6() {
        com.garmin.android.apps.connectmobile.badges.redesign.f fVar = new com.garmin.android.apps.connectmobile.badges.redesign.f();
        this.f30489o = fVar;
        fVar.f30464c.f172687d = this.f30488n;
        return fVar;
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final i0 J6(RecyclerView.p pVar, int i14) {
        pVar.getClass();
        return new c(pVar, i14, this);
    }

    @Override // com.garmin.android.apps.connectmobile.d0
    public final int S6() {
        return 50;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final void d7(int i14, int i15) {
        ?? r14 = this.f30491q;
        c2 c2Var = ((q) r14.getValue()).f172748m;
        if (c2Var == null || !c2Var.isActive()) {
            q qVar = (q) r14.getValue();
            int i16 = this.f30487m;
            qVar.getClass();
            y0 y0Var = new y0();
            w9.a aVarA = v1.a(qVar);
            x53.c cVar = o53.s0.f129406a;
            qVar.f172748m = ge1.b.T(aVarA, x53.b.f189152a, null, new w(y0Var, qVar, i16, i14, i15, false, null), 2);
            y0Var.f(getViewLifecycleOwner(), new d(new uo1.a(this, 4)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f30487m = arguments.getInt("GCM_extra_badge_id", -1);
            this.f30488n = arguments.getInt("GCM_extra_badge_connection_count", 0);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        F6(false);
        i0 i0Var = this.f33123k;
        d7(i0Var.f149677b, i0Var.f149678c);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/badges/redesign/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INVALID_BADGE_ID", "I", "CONNECTIONS_PAGE_SIZE", "gcm-badges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
