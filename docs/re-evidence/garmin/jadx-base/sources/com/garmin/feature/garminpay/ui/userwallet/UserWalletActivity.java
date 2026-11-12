package com.garmin.feature.garminpay.ui.userwallet;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardRefundFailedException;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import lc.u0;
import ms2.g;
import o13.r;
import o53.b0;
import o53.f0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.j0;
import ps2.w;
import tr2.t;
import tr2.z;
import v13.i;
import vb.h;
import vr2.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/UserWalletActivity;", "Lhn2/c;", "", "Ltr2/z;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UserWalletActivity extends hn2.c implements z {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f52217q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Logger f52218r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public vr2.e f52219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Fragment f52220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public xr2.b f52221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fr2.d f52222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f52223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f52224l = s3.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SwipeRefreshLayout f52225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j22.e f52226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f.c<Intent> f52227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.garmin.feature.garminpay.ui.addcard.a f52228p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity$onCreate$9", f = "UserWalletActivity.kt", l = {175}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52229a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return UserWalletActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f52229a;
            UserWalletActivity userWalletActivity = UserWalletActivity.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    vr2.e eVar = userWalletActivity.f52219g;
                    if (eVar == null) {
                        s.m("viewModel");
                        throw null;
                    }
                    this.f52229a = 1;
                    if (eVar.m(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Throwable th3) {
                if (th3 instanceof CardRefundFailedException) {
                    CardRefundFailedException cardRefundFailedException = th3;
                    br2.c.f19585a.n(userWalletActivity, cardRefundFailedException.getCardName(), new tb0.d(6, userWalletActivity, cardRefundFailedException));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f52231a;

        public c(l lVar) {
            lVar.getClass();
            this.f52231a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f52231a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52231a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/userwallet/UserWalletActivity$d", "", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public d() {
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f52218r = gt2.b.f79005a.h("PAY#UserWalletActivity");
    }

    public UserWalletActivity() {
        j22.e.a aVar = j22.e.f96744g;
        String name = f52218r.getName();
        name.getClass();
        t tVar = new t(this, 1);
        t tVar2 = new t(this, 2);
        aVar.getClass();
        this.f52226n = j22.e.a.a(name, tVar, tVar2, null);
        this.f52227o = registerForActivityResult(new g.h(), new jp.a(this, 29));
        this.f52228p = new com.garmin.feature.garminpay.ui.addcard.a(this);
    }

    @Override // tr2.z
    public final void N4(q qVar) {
        qVar.getClass();
        is2.b bVar = qVar.f179660g;
        g gVarA = bVar != null ? w.f140538a.a(bVar) : null;
        this.f52223k = gVarA;
        if (gVarA == null || !gVarA.i(qVar.f179658e)) {
            return;
        }
        f52218r.debug("showUserForRemoveCardDialog");
        String str = qVar.f179654a;
        br2.c cVar = br2.c.f19585a;
        String string = getString(R.string.wallet_remove_card);
        string.getClass();
        x0 x0Var = x0.f105818a;
        String string2 = getString(R.string.this_will_remove_your_card);
        string2.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(cVar, this, string, String.format(string2, Arrays.copyOf(new Object[]{str}, 1)), new o13.p(getString(R.string.lbl_remove), new t21.l(16, this, qVar)), new o13.p(getString(R.string.lbl_cancel), new tr2.e(4)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void ca(boolean z14) {
        fa(!z14);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    public final void da(Boolean bool, Boolean bool2) {
        boolean z14;
        SwipeRefreshLayout swipeRefreshLayout = this.f52225m;
        if (swipeRefreshLayout == null) {
            s.m("userWalletSwipeRefreshView");
            throw null;
        }
        if (!(bool != null ? bool.booleanValue() : false)) {
            z14 = bool2 != null ? bool2.booleanValue() : false;
        }
        swipeRefreshLayout.setRefreshing(z14);
    }

    public final void ea(Fragment fragment) {
        Fragment fragment2 = this.f52220h;
        if (fragment2 == null || !s.g(fragment2.getTag(), fragment.getTag())) {
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
            aVarB.l(R.id.user_wallet_container, fragment, fragment.getClass().getCanonicalName());
            aVarB.e();
            this.f52220h = fragment;
        }
    }

    public final void fa(boolean z14) {
        n0 n0Var = this.f52220h;
        cr2.b bVar = n0Var instanceof cr2.b ? (cr2.b) n0Var : null;
        if (bVar != null) {
            bVar.t1(z14);
        }
    }

    public final void ga(List<q> list, List<? extends fs2.a> list2) {
        if (this.f52224l && list.isEmpty()) {
            f.f52315a.getClass();
            ea(new f());
            return;
        }
        if (list.isEmpty()) {
            com.garmin.feature.garminpay.ui.userwallet.b.a aVar = com.garmin.feature.garminpay.ui.userwallet.b.f52252e;
            d dVar = new d();
            aVar.getClass();
            com.garmin.feature.garminpay.ui.userwallet.b bVar = new com.garmin.feature.garminpay.ui.userwallet.b();
            bVar.f52254b = dVar;
            ea(bVar);
            xr2.a.f192031a.getClass();
            fa(!xr2.a.a());
            return;
        }
        Fragment fragment = this.f52220h;
        e eVar = fragment instanceof e ? (e) fragment : null;
        if (eVar != null) {
            list2.getClass();
            eVar.f52305a = list;
            eVar.f52306b = list2;
            eVar.v6(false);
            xr2.a.f192031a.getClass();
            fa(!xr2.a.a());
            return;
        }
        e.f52303k.getClass();
        list2.getClass();
        Fragment eVar2 = new e();
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("CardListBundleKey", (Parcelable[]) list.toArray(new q[0]));
        bundle.putParcelableArray("DeviceWalletItemBundleKey", (Parcelable[]) list2.toArray(new fs2.a[0]));
        eVar2.setArguments(bundle);
        ea(eVar2);
        xr2.a.f192031a.getClass();
        fa(!xr2.a.a());
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger logger = f52218r;
        logger.debug("onCreate");
        String string = getString(R.string.common_conjunct_ampersand_2, getString(R.string.wallet_concept), getString(R.string.wallet_garmin_pay));
        string.getClass();
        R9(R.layout.activity_user_wallet, hn2.c.a.BACK, string);
        if (this.f52224l) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildGarminPay");
        }
        View viewFindViewById = findViewById(R.id.layout_user_wallet_swipe_refresh);
        viewFindViewById.getClass();
        this.f52225m = (SwipeRefreshLayout) viewFindViewById;
        this.f52222j = (fr2.d) new ry2.d(this, new x1(this)).f155186a.a(fr2.d.class, fr2.e.class);
        vr2.e eVar = (vr2.e) new ry2.d(this, new x1(this)).f155186a.a(vr2.e.class, vr2.r.class);
        this.f52219g = eVar;
        if (eVar == null) {
            s.m("viewModel");
            throw null;
        }
        final int i14 = 0;
        eVar.getData().f(this, new c(new l(this) { // from class: tr2.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserWalletActivity f166171b;

            {
                this.f166171b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                UserWalletActivity userWalletActivity = this.f166171b;
                switch (i15) {
                    case 0:
                        List<vr2.q> list = (List) obj;
                        UserWalletActivity.a aVar = UserWalletActivity.f52217q;
                        list.getClass();
                        vr2.e eVar2 = userWalletActivity.f52219g;
                        if (eVar2 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        List<fs2.a> listD = eVar2.X3().d();
                        if (listD == null) {
                            listD = j0.f134944a;
                        }
                        userWalletActivity.ga(list, listD);
                        return Unit.INSTANCE;
                    case 1:
                        List<? extends fs2.a> list2 = (List) obj;
                        vr2.e eVar3 = userWalletActivity.f52219g;
                        if (eVar3 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        List<vr2.q> listD2 = eVar3.getData().d();
                        if (listD2 == null) {
                            listD2 = j0.f134944a;
                        }
                        list2.getClass();
                        userWalletActivity.ga(listD2, list2);
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        fr2.d dVar = userWalletActivity.f52222j;
                        if (dVar == null) {
                            p005kotlin.jvm.internal.s.m("watchesVm");
                            throw null;
                        }
                        userWalletActivity.da(bool, dVar.d1().d());
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 3:
                        Boolean bool2 = (Boolean) obj;
                        vr2.e eVar4 = userWalletActivity.f52219g;
                        if (eVar4 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        userWalletActivity.da(eVar4.H().d(), bool2);
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 4:
                        UserWalletActivity.a aVar2 = UserWalletActivity.f52217q;
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 5:
                        UserWalletActivity.a aVar3 = UserWalletActivity.f52217q;
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    default:
                        wr2.f fVar = (wr2.f) obj;
                        UserWalletActivity.a aVar4 = UserWalletActivity.f52217q;
                        wr2.g gVar = wr2.g.f186857a;
                        SwipeRefreshLayout swipeRefreshLayout = userWalletActivity.f52225m;
                        if (swipeRefreshLayout == null) {
                            p005kotlin.jvm.internal.s.m("userWalletSwipeRefreshView");
                            throw null;
                        }
                        fVar.getClass();
                        gVar.getClass();
                        wr2.g.b(swipeRefreshLayout, fVar);
                        return Unit.INSTANCE;
                }
            }
        }));
        vr2.e eVar2 = this.f52219g;
        if (eVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i15 = 1;
        eVar2.X3().f(this, new c(new l(this) { // from class: tr2.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserWalletActivity f166171b;

            {
                this.f166171b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                UserWalletActivity userWalletActivity = this.f166171b;
                switch (i16) {
                    case 0:
                        List<vr2.q> list = (List) obj;
                        UserWalletActivity.a aVar = UserWalletActivity.f52217q;
                        list.getClass();
                        vr2.e eVar3 = userWalletActivity.f52219g;
                        if (eVar3 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        List<fs2.a> listD = eVar3.X3().d();
                        if (listD == null) {
                            listD = j0.f134944a;
                        }
                        userWalletActivity.ga(list, listD);
                        return Unit.INSTANCE;
                    case 1:
                        List<? extends fs2.a> list2 = (List) obj;
                        vr2.e eVar4 = userWalletActivity.f52219g;
                        if (eVar4 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        List<vr2.q> listD2 = eVar4.getData().d();
                        if (listD2 == null) {
                            listD2 = j0.f134944a;
                        }
                        list2.getClass();
                        userWalletActivity.ga(listD2, list2);
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        fr2.d dVar = userWalletActivity.f52222j;
                        if (dVar == null) {
                            p005kotlin.jvm.internal.s.m("watchesVm");
                            throw null;
                        }
                        userWalletActivity.da(bool, dVar.d1().d());
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 3:
                        Boolean bool2 = (Boolean) obj;
                        vr2.e eVar5 = userWalletActivity.f52219g;
                        if (eVar5 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        userWalletActivity.da(eVar5.H().d(), bool2);
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 4:
                        UserWalletActivity.a aVar2 = UserWalletActivity.f52217q;
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 5:
                        UserWalletActivity.a aVar3 = UserWalletActivity.f52217q;
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    default:
                        wr2.f fVar = (wr2.f) obj;
                        UserWalletActivity.a aVar4 = UserWalletActivity.f52217q;
                        wr2.g gVar = wr2.g.f186857a;
                        SwipeRefreshLayout swipeRefreshLayout = userWalletActivity.f52225m;
                        if (swipeRefreshLayout == null) {
                            p005kotlin.jvm.internal.s.m("userWalletSwipeRefreshView");
                            throw null;
                        }
                        fVar.getClass();
                        gVar.getClass();
                        wr2.g.b(swipeRefreshLayout, fVar);
                        return Unit.INSTANCE;
                }
            }
        }));
        vr2.e eVar3 = this.f52219g;
        if (eVar3 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i16 = 2;
        eVar3.H().f(this, new c(new l(this) { // from class: tr2.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserWalletActivity f166171b;

            {
                this.f166171b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                UserWalletActivity userWalletActivity = this.f166171b;
                switch (i17) {
                    case 0:
                        List<vr2.q> list = (List) obj;
                        UserWalletActivity.a aVar = UserWalletActivity.f52217q;
                        list.getClass();
                        vr2.e eVar4 = userWalletActivity.f52219g;
                        if (eVar4 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        List<fs2.a> listD = eVar4.X3().d();
                        if (listD == null) {
                            listD = j0.f134944a;
                        }
                        userWalletActivity.ga(list, listD);
                        return Unit.INSTANCE;
                    case 1:
                        List<? extends fs2.a> list2 = (List) obj;
                        vr2.e eVar5 = userWalletActivity.f52219g;
                        if (eVar5 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        List<vr2.q> listD2 = eVar5.getData().d();
                        if (listD2 == null) {
                            listD2 = j0.f134944a;
                        }
                        list2.getClass();
                        userWalletActivity.ga(listD2, list2);
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        fr2.d dVar = userWalletActivity.f52222j;
                        if (dVar == null) {
                            p005kotlin.jvm.internal.s.m("watchesVm");
                            throw null;
                        }
                        userWalletActivity.da(bool, dVar.d1().d());
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 3:
                        Boolean bool2 = (Boolean) obj;
                        vr2.e eVar6 = userWalletActivity.f52219g;
                        if (eVar6 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        userWalletActivity.da(eVar6.H().d(), bool2);
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 4:
                        UserWalletActivity.a aVar2 = UserWalletActivity.f52217q;
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 5:
                        UserWalletActivity.a aVar3 = UserWalletActivity.f52217q;
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    default:
                        wr2.f fVar = (wr2.f) obj;
                        UserWalletActivity.a aVar4 = UserWalletActivity.f52217q;
                        wr2.g gVar = wr2.g.f186857a;
                        SwipeRefreshLayout swipeRefreshLayout = userWalletActivity.f52225m;
                        if (swipeRefreshLayout == null) {
                            p005kotlin.jvm.internal.s.m("userWalletSwipeRefreshView");
                            throw null;
                        }
                        fVar.getClass();
                        gVar.getClass();
                        wr2.g.b(swipeRefreshLayout, fVar);
                        return Unit.INSTANCE;
                }
            }
        }));
        fr2.d dVar = this.f52222j;
        if (dVar == null) {
            s.m("watchesVm");
            throw null;
        }
        final int i17 = 3;
        dVar.d1().f(this, new c(new l(this) { // from class: tr2.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserWalletActivity f166171b;

            {
                this.f166171b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                UserWalletActivity userWalletActivity = this.f166171b;
                switch (i18) {
                    case 0:
                        List<vr2.q> list = (List) obj;
                        UserWalletActivity.a aVar = UserWalletActivity.f52217q;
                        list.getClass();
                        vr2.e eVar4 = userWalletActivity.f52219g;
                        if (eVar4 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        List<fs2.a> listD = eVar4.X3().d();
                        if (listD == null) {
                            listD = j0.f134944a;
                        }
                        userWalletActivity.ga(list, listD);
                        return Unit.INSTANCE;
                    case 1:
                        List<? extends fs2.a> list2 = (List) obj;
                        vr2.e eVar5 = userWalletActivity.f52219g;
                        if (eVar5 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        List<vr2.q> listD2 = eVar5.getData().d();
                        if (listD2 == null) {
                            listD2 = j0.f134944a;
                        }
                        list2.getClass();
                        userWalletActivity.ga(listD2, list2);
                        return Unit.INSTANCE;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        fr2.d dVar2 = userWalletActivity.f52222j;
                        if (dVar2 == null) {
                            p005kotlin.jvm.internal.s.m("watchesVm");
                            throw null;
                        }
                        userWalletActivity.da(bool, dVar2.d1().d());
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 3:
                        Boolean bool2 = (Boolean) obj;
                        vr2.e eVar6 = userWalletActivity.f52219g;
                        if (eVar6 == null) {
                            p005kotlin.jvm.internal.s.m("viewModel");
                            throw null;
                        }
                        userWalletActivity.da(eVar6.H().d(), bool2);
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 4:
                        UserWalletActivity.a aVar2 = UserWalletActivity.f52217q;
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    case 5:
                        UserWalletActivity.a aVar3 = UserWalletActivity.f52217q;
                        userWalletActivity.invalidateOptionsMenu();
                        return Unit.INSTANCE;
                    default:
                        wr2.f fVar = (wr2.f) obj;
                        UserWalletActivity.a aVar4 = UserWalletActivity.f52217q;
                        wr2.g gVar = wr2.g.f186857a;
                        SwipeRefreshLayout swipeRefreshLayout = userWalletActivity.f52225m;
                        if (swipeRefreshLayout == null) {
                            p005kotlin.jvm.internal.s.m("userWalletSwipeRefreshView");
                            throw null;
                        }
                        fVar.getClass();
                        gVar.getClass();
                        wr2.g.b(swipeRefreshLayout, fVar);
                        return Unit.INSTANCE;
                }
            }
        }));
        try {
            fr2.d dVar2 = this.f52222j;
            if (dVar2 == null) {
                s.m("watchesVm");
                throw null;
            }
            final int i18 = 4;
            dVar2.E().f(this, new c(new l(this) { // from class: tr2.s

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserWalletActivity f166171b;

                {
                    this.f166171b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i19 = i18;
                    UserWalletActivity userWalletActivity = this.f166171b;
                    switch (i19) {
                        case 0:
                            List<vr2.q> list = (List) obj;
                            UserWalletActivity.a aVar = UserWalletActivity.f52217q;
                            list.getClass();
                            vr2.e eVar4 = userWalletActivity.f52219g;
                            if (eVar4 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            List<fs2.a> listD = eVar4.X3().d();
                            if (listD == null) {
                                listD = j0.f134944a;
                            }
                            userWalletActivity.ga(list, listD);
                            return Unit.INSTANCE;
                        case 1:
                            List<? extends fs2.a> list2 = (List) obj;
                            vr2.e eVar5 = userWalletActivity.f52219g;
                            if (eVar5 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            List<vr2.q> listD2 = eVar5.getData().d();
                            if (listD2 == null) {
                                listD2 = j0.f134944a;
                            }
                            list2.getClass();
                            userWalletActivity.ga(listD2, list2);
                            return Unit.INSTANCE;
                        case 2:
                            Boolean bool = (Boolean) obj;
                            fr2.d dVar3 = userWalletActivity.f52222j;
                            if (dVar3 == null) {
                                p005kotlin.jvm.internal.s.m("watchesVm");
                                throw null;
                            }
                            userWalletActivity.da(bool, dVar3.d1().d());
                            userWalletActivity.invalidateOptionsMenu();
                            return Unit.INSTANCE;
                        case 3:
                            Boolean bool2 = (Boolean) obj;
                            vr2.e eVar6 = userWalletActivity.f52219g;
                            if (eVar6 == null) {
                                p005kotlin.jvm.internal.s.m("viewModel");
                                throw null;
                            }
                            userWalletActivity.da(eVar6.H().d(), bool2);
                            userWalletActivity.invalidateOptionsMenu();
                            return Unit.INSTANCE;
                        case 4:
                            UserWalletActivity.a aVar2 = UserWalletActivity.f52217q;
                            userWalletActivity.invalidateOptionsMenu();
                            return Unit.INSTANCE;
                        case 5:
                            UserWalletActivity.a aVar3 = UserWalletActivity.f52217q;
                            userWalletActivity.invalidateOptionsMenu();
                            return Unit.INSTANCE;
                        default:
                            wr2.f fVar = (wr2.f) obj;
                            UserWalletActivity.a aVar4 = UserWalletActivity.f52217q;
                            wr2.g gVar = wr2.g.f186857a;
                            SwipeRefreshLayout swipeRefreshLayout = userWalletActivity.f52225m;
                            if (swipeRefreshLayout == null) {
                                p005kotlin.jvm.internal.s.m("userWalletSwipeRefreshView");
                                throw null;
                            }
                            fVar.getClass();
                            gVar.getClass();
                            wr2.g.b(swipeRefreshLayout, fVar);
                            return Unit.INSTANCE;
                    }
                }
            }));
            try {
                fr2.d dVar3 = this.f52222j;
                if (dVar3 == null) {
                    s.m("watchesVm");
                    throw null;
                }
                final int i19 = 5;
                dVar3.s1().f(this, new c(new l(this) { // from class: tr2.s

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UserWalletActivity f166171b;

                    {
                        this.f166171b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i110 = i19;
                        UserWalletActivity userWalletActivity = this.f166171b;
                        switch (i110) {
                            case 0:
                                List<vr2.q> list = (List) obj;
                                UserWalletActivity.a aVar = UserWalletActivity.f52217q;
                                list.getClass();
                                vr2.e eVar4 = userWalletActivity.f52219g;
                                if (eVar4 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                List<fs2.a> listD = eVar4.X3().d();
                                if (listD == null) {
                                    listD = j0.f134944a;
                                }
                                userWalletActivity.ga(list, listD);
                                return Unit.INSTANCE;
                            case 1:
                                List<? extends fs2.a> list2 = (List) obj;
                                vr2.e eVar5 = userWalletActivity.f52219g;
                                if (eVar5 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                List<vr2.q> listD2 = eVar5.getData().d();
                                if (listD2 == null) {
                                    listD2 = j0.f134944a;
                                }
                                list2.getClass();
                                userWalletActivity.ga(listD2, list2);
                                return Unit.INSTANCE;
                            case 2:
                                Boolean bool = (Boolean) obj;
                                fr2.d dVar4 = userWalletActivity.f52222j;
                                if (dVar4 == null) {
                                    p005kotlin.jvm.internal.s.m("watchesVm");
                                    throw null;
                                }
                                userWalletActivity.da(bool, dVar4.d1().d());
                                userWalletActivity.invalidateOptionsMenu();
                                return Unit.INSTANCE;
                            case 3:
                                Boolean bool2 = (Boolean) obj;
                                vr2.e eVar6 = userWalletActivity.f52219g;
                                if (eVar6 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                userWalletActivity.da(eVar6.H().d(), bool2);
                                userWalletActivity.invalidateOptionsMenu();
                                return Unit.INSTANCE;
                            case 4:
                                UserWalletActivity.a aVar2 = UserWalletActivity.f52217q;
                                userWalletActivity.invalidateOptionsMenu();
                                return Unit.INSTANCE;
                            case 5:
                                UserWalletActivity.a aVar3 = UserWalletActivity.f52217q;
                                userWalletActivity.invalidateOptionsMenu();
                                return Unit.INSTANCE;
                            default:
                                wr2.f fVar = (wr2.f) obj;
                                UserWalletActivity.a aVar4 = UserWalletActivity.f52217q;
                                wr2.g gVar = wr2.g.f186857a;
                                SwipeRefreshLayout swipeRefreshLayout = userWalletActivity.f52225m;
                                if (swipeRefreshLayout == null) {
                                    p005kotlin.jvm.internal.s.m("userWalletSwipeRefreshView");
                                    throw null;
                                }
                                fVar.getClass();
                                gVar.getClass();
                                wr2.g.b(swipeRefreshLayout, fVar);
                                return Unit.INSTANCE;
                        }
                    }
                }));
                vr2.e eVar4 = this.f52219g;
                if (eVar4 == null) {
                    s.m("viewModel");
                    throw null;
                }
                final int i24 = 6;
                eVar4.n().f(this, new c(new l(this) { // from class: tr2.s

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ UserWalletActivity f166171b;

                    {
                        this.f166171b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i110 = i24;
                        UserWalletActivity userWalletActivity = this.f166171b;
                        switch (i110) {
                            case 0:
                                List<vr2.q> list = (List) obj;
                                UserWalletActivity.a aVar = UserWalletActivity.f52217q;
                                list.getClass();
                                vr2.e eVar5 = userWalletActivity.f52219g;
                                if (eVar5 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                List<fs2.a> listD = eVar5.X3().d();
                                if (listD == null) {
                                    listD = j0.f134944a;
                                }
                                userWalletActivity.ga(list, listD);
                                return Unit.INSTANCE;
                            case 1:
                                List<? extends fs2.a> list2 = (List) obj;
                                vr2.e eVar6 = userWalletActivity.f52219g;
                                if (eVar6 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                List<vr2.q> listD2 = eVar6.getData().d();
                                if (listD2 == null) {
                                    listD2 = j0.f134944a;
                                }
                                list2.getClass();
                                userWalletActivity.ga(listD2, list2);
                                return Unit.INSTANCE;
                            case 2:
                                Boolean bool = (Boolean) obj;
                                fr2.d dVar4 = userWalletActivity.f52222j;
                                if (dVar4 == null) {
                                    p005kotlin.jvm.internal.s.m("watchesVm");
                                    throw null;
                                }
                                userWalletActivity.da(bool, dVar4.d1().d());
                                userWalletActivity.invalidateOptionsMenu();
                                return Unit.INSTANCE;
                            case 3:
                                Boolean bool2 = (Boolean) obj;
                                vr2.e eVar7 = userWalletActivity.f52219g;
                                if (eVar7 == null) {
                                    p005kotlin.jvm.internal.s.m("viewModel");
                                    throw null;
                                }
                                userWalletActivity.da(eVar7.H().d(), bool2);
                                userWalletActivity.invalidateOptionsMenu();
                                return Unit.INSTANCE;
                            case 4:
                                UserWalletActivity.a aVar2 = UserWalletActivity.f52217q;
                                userWalletActivity.invalidateOptionsMenu();
                                return Unit.INSTANCE;
                            case 5:
                                UserWalletActivity.a aVar3 = UserWalletActivity.f52217q;
                                userWalletActivity.invalidateOptionsMenu();
                                return Unit.INSTANCE;
                            default:
                                wr2.f fVar = (wr2.f) obj;
                                UserWalletActivity.a aVar4 = UserWalletActivity.f52217q;
                                wr2.g gVar = wr2.g.f186857a;
                                SwipeRefreshLayout swipeRefreshLayout = userWalletActivity.f52225m;
                                if (swipeRefreshLayout == null) {
                                    p005kotlin.jvm.internal.s.m("userWalletSwipeRefreshView");
                                    throw null;
                                }
                                fVar.getClass();
                                gVar.getClass();
                                wr2.g.b(swipeRefreshLayout, fVar);
                                return Unit.INSTANCE;
                        }
                    }
                }));
                SwipeRefreshLayout swipeRefreshLayout = this.f52225m;
                if (swipeRefreshLayout == null) {
                    s.m("userWalletSwipeRefreshView");
                    throw null;
                }
                swipeRefreshLayout.setOnRefreshListener(new tr2.b(this, 5));
                vr2.e eVar5 = this.f52219g;
                if (eVar5 == null) {
                    s.m("viewModel");
                    throw null;
                }
                eVar5.U2();
                setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
                Bundle extras = getIntent().getExtras();
                Object obj = extras != null ? extras.get("cardVerification.status") : null;
                if (!(obj instanceof Boolean)) {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    or2.b bVar = or2.b.f133424a;
                    SwipeRefreshLayout swipeRefreshLayout2 = this.f52225m;
                    if (swipeRefreshLayout2 == null) {
                        s.m("userWalletSwipeRefreshView");
                        throw null;
                    }
                    bVar.getClass();
                    or2.b.b(swipeRefreshLayout2, zBooleanValue);
                }
                Bundle extras2 = getIntent().getExtras();
                Object obj2 = extras2 != null ? extras2.get("a2a.app.not.installed") : null;
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str = (String) obj2;
                if (str != null) {
                    br2.c.j(br2.c.f19585a, this, new tb0.d(5, this, str));
                }
                gl.b.I(f0.w(this), null, new b(null), 3);
            } catch (Exception e4) {
                logger.error("can't observe availableDevices " + e4);
            }
        } catch (Exception e14) {
            logger.error("can't observe operatorsByDevice " + e14);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        if (this.f52224l) {
            return true;
        }
        getMenuInflater().inflate(R.menu.menu_user_wallet_card_list, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        j22.e eVar = this.f52226n;
        if (itemId == R.id.menu_item_user_wallet_add_card) {
            eVar.a();
            return true;
        }
        if (itemId == R.id.menu_item_supported_cards) {
            or2.b.f133424a.getClass();
            startActivity(or2.b.a());
            return true;
        }
        if (itemId != R.id.menu_icon_user_wallet_add_card) {
            return super.onOptionsItemSelected(menuItem);
        }
        eVar.a();
        return true;
    }

    @Override // hn2.c, android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        MenuItem menuItemFindItem2;
        MenuItem menuItemFindItem3;
        MenuItem menuItemFindItem4;
        MenuItem menuItemFindItem5;
        MenuItem menuItemFindItem6;
        Object next;
        boolean z14 = true;
        if (this.f52224l) {
            return true;
        }
        fr2.d dVar = this.f52222j;
        if (dVar == null) {
            s.m("watchesVm");
            throw null;
        }
        List list = (List) dVar.N0().d();
        if (list != null) {
            fr2.d dVar2 = this.f52222j;
            if (dVar2 == null) {
                s.m("watchesVm");
                throw null;
            }
            List list2 = (List) dVar2.s1().d();
            if (list2 != null) {
                fr2.d dVar3 = this.f52222j;
                if (dVar3 == null) {
                    s.m("watchesVm");
                    throw null;
                }
                Map<Long, ns2.a<ms2.e>> mapD = dVar3.E().d();
                if (mapD != null) {
                    fr2.d dVar4 = this.f52222j;
                    if (dVar4 == null) {
                        s.m("watchesVm");
                        throw null;
                    }
                    if (s.g(dVar4.d1().d(), Boolean.FALSE)) {
                        ArrayList arrayList = new ArrayList();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        m0 m0Var = new m0();
                        Iterator it = list2.iterator();
                        boolean z15 = false;
                        while (true) {
                            boolean z16 = z15;
                            while (true) {
                                if (!it.hasNext()) {
                                    if (menu != null && (menuItemFindItem6 = menu.findItem(R.id.menu_item_supported_cards)) != null) {
                                        menuItemFindItem6.setVisible(z15);
                                    }
                                    if (((com.garmin.android.apps.connectmobile.l) zf.b.r()).m()) {
                                        if (menu != null && (menuItemFindItem5 = menu.findItem(R.id.menu_item_user_wallet_add_card)) != null) {
                                            menuItemFindItem5.setVisible(false);
                                        }
                                        if (menu != null && (menuItemFindItem4 = menu.findItem(R.id.menu_item_supported_cards)) != null) {
                                            menuItemFindItem4.setVisible(false);
                                        }
                                        if (menu != null && (menuItemFindItem3 = menu.findItem(R.id.menu_icon_user_wallet_add_card)) != null) {
                                            if (!m0Var.f105804a || (!z16 && z15)) {
                                                z14 = false;
                                            }
                                            menuItemFindItem3.setVisible(z14);
                                            return z16;
                                        }
                                    } else {
                                        if (menu != null && (menuItemFindItem2 = menu.findItem(R.id.menu_item_supported_cards)) != null) {
                                            menuItemFindItem2.setVisible(z15);
                                        }
                                        if (menu != null && (menuItemFindItem = menu.findItem(R.id.menu_icon_user_wallet_add_card)) != null) {
                                            menuItemFindItem.setVisible(false);
                                        }
                                    }
                                    return z16;
                                }
                                br2.f fVar = (br2.f) it.next();
                                long j8 = fVar.f19599a;
                                arrayList.add(Long.valueOf(j8));
                                ns2.a<ms2.e> aVar = mapD.get(Long.valueOf(j8));
                                if (aVar == null) {
                                    f52218r.warn("Cannot find card selection items in " + mapD + " for " + fVar + ", skip it.");
                                } else {
                                    linkedHashSet.addAll(g8.i.m(aVar));
                                    boolean z17 = aVar.f127816b;
                                    if (!z17) {
                                        break;
                                    }
                                    if (!z17) {
                                        u0.r();
                                        return false;
                                    }
                                    Iterator it3 = list.iterator();
                                    do {
                                        if (!it3.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it3.next();
                                    } while (((sd2.f) next).getUnitID() != j8);
                                    m0Var.f105804a = next != null;
                                    z16 = z16 || !g8.i.c0(aVar).f127815a.isEmpty();
                                    z15 = z15 || !g8.i.c0(aVar).f127815a.isEmpty();
                                }
                            }
                            z15 = true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        fr2.d dVar = this.f52222j;
        if (dVar == null) {
            s.m("watchesVm");
            throw null;
        }
        dVar.h();
        vr2.e eVar = this.f52219g;
        if (eVar == null) {
            s.m("viewModel");
            throw null;
        }
        eVar.d0();
        vr2.e eVar2 = this.f52219g;
        if (eVar2 != null) {
            eVar2.l();
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // hn2.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        xr2.b bVar = new xr2.b();
        this.f52221i = bVar;
        bVar.f192032a = this;
        registerReceiver(bVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    @Override // hn2.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        xr2.b bVar = this.f52221i;
        if (bVar == null) {
            s.m("bluetoothStateReceiver");
            throw null;
        }
        bVar.f192032a = null;
        unregisterReceiver(bVar);
        super.onStop();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/UserWalletActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) UserWalletActivity.class);
            intent.addFlags(0);
            return intent;
        }

        private a() {
        }
    }
}
