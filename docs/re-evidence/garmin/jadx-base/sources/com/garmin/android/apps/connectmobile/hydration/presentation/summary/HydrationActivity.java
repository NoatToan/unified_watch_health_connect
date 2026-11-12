package com.garmin.android.apps.connectmobile.hydration.presentation.summary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.viewpager.widget.ViewPager;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import e32.f;
import e32.i;
import e32.j;
import e32.n;
import e32.o;
import o13.m;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.u;
import uj1.y;
import vp0.e;
import yp0.l;
import z10.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/summary/HydrationActivity;", "Le32/n;", "Lyp0/l;", "Le32/f;", "Lvp0/e$b;", "<init>", "()V", "a", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HydrationActivity extends n<l> implements f, e.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f36739o = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f36740n = m.a(o13.n.NONE, new c(this, null, null, null));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/hydration/presentation/summary/HydrationActivity$b", "Landroidx/viewpager/widget/ViewPager$j;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            HydrationActivity.this.invalidateOptionsMenu();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<vp0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f36743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f36744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f36745d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f36742a = gVar;
            this.f36743b = qualifier;
            this.f36744c = aVar;
            this.f36745d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, vp0.a] */
        @Override // e23.a
        public final vp0.a invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f36742a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f36744c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(vp0.a.class), viewModelStore, null, defaultViewModelCreationExtras, this.f36743b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f36745d, 4, null);
        }
    }

    @Override // vp0.e.b
    public final void H5() {
        j jVar = (j) oa();
        if (jVar != null) {
            jVar.b(o.f62807j);
        }
        j jVar2 = (j) oa();
        if (jVar2 != null) {
            jVar2.b(o.f62808k);
        }
        j jVar3 = (j) oa();
        if (jVar3 != null) {
            jVar3.b(o.f62816t);
        }
    }

    @Override // e32.l
    public final void I8(Object obj) {
        ((l) obj).getClass();
    }

    @Override // e32.f
    public final Fragment U6(int i14, long j8, long j14) {
        if (i14 == 1) {
            e.f179337o.getClass();
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putLong("extra.date.time", j8);
            eVar.setArguments(bundle);
            return eVar;
        }
        if (i14 == 13) {
            com.garmin.android.apps.connectmobile.hydration.presentation.summary.b.f36752q.getClass();
            com.garmin.android.apps.connectmobile.hydration.presentation.summary.b bVar = new com.garmin.android.apps.connectmobile.hydration.presentation.summary.b();
            i.f62791o.getClass();
            bVar.setArguments(i.a.a(13, j8, j14));
            return bVar;
        }
        if (i14 == 4 || i14 == 5) {
            com.garmin.android.apps.connectmobile.hydration.presentation.summary.a.f36746q.getClass();
            com.garmin.android.apps.connectmobile.hydration.presentation.summary.a aVar = new com.garmin.android.apps.connectmobile.hydration.presentation.summary.a();
            i.f62791o.getClass();
            aVar.setArguments(i.a.a(i14, j8, j14));
            return aVar;
        }
        e.f179337o.getClass();
        e eVar2 = new e();
        Bundle bundle2 = new Bundle();
        bundle2.putLong("extra.date.time", j8);
        eVar2.setArguments(bundle2);
        return eVar2;
    }

    @Override // vp0.e.b
    public final void X7() {
        j jVar = (j) oa();
        if (jVar != null) {
            jVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // android.app.Activity
    public final void finish() {
        ?? r14 = this.f36740n;
        if (((vp0.a) r14.getValue()).f179323c) {
            if (((vp0.a) r14.getValue()).f179324d) {
                ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
            }
            setResult(-1, new Intent());
        }
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.HEALTH_STATS;
    }

    @Override // e32.n, x22.d, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qa().c(new b());
        yp0.a.f198626a.getClass();
        z3.e eVar = yp0.a.f198628c;
        eVar.getClass();
        ComposeView composeView = this.f188538j;
        if (composeView != null) {
            composeView.setContent(new z3.e(-1734456223, true, new y(eVar, 11)));
        } else {
            s.m("promotionContainer");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        o oVar = o.f62806i;
        oVar.getClass();
        j jVar = (j) oa();
        if (jVar != null && qa().getCurrentItem() == u.M(jVar.f62798j, oVar)) {
            return true;
        }
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.HYDRATION, null, null, 12);
        return true;
    }

    @Override // e32.n
    public final j sa(DateTime dateTime) {
        return new j(this, dateTime, new o[]{o.f62806i, o.f62807j, o.f62808k, o.f62816t}, null, 8, null);
    }

    @Override // e32.n
    public final String ta() {
        String string = getString(R.string.lbl_hydration_title);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/summary/HydrationActivity$a;", "", "<init>", "()V", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, DateTime dateTime, boolean z14) {
            Intent intentD = sn.a.d(context, context, HydrationActivity.class);
            o oVar = z14 ? o.f62807j : o.f62806i;
            n.f62802m.getClass();
            n.a.a(intentD, dateTime, oVar);
            return intentD;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, DateTime dateTime) {
            aVar.getClass();
            return a(context, dateTime, false);
        }

        private a() {
        }
    }
}
