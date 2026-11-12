package com.garmin.android.apps.connectmobile.powerguide;

import ab1.g;
import ab1.k;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.k0;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import fw.p;
import java.util.List;
import lc.u0;
import ng1.c1;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import sa1.j;
import v13.e;
import v13.i;
import vb.h;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/PowerGuideListActivity;", "Lcom/garmin/android/apps/connectmobile/k0;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerGuideListActivity extends k0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f40349k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.powerguide.a f40351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f40352g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<g> f40354i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40350e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f40353h = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f40355j = new c();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40356a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40356a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/powerguide/PowerGuideListActivity$c", "Lcom/garmin/android/apps/connectmobile/powerguide/a$c;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.apps.connectmobile.powerguide.a.c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.powerguide.PowerGuideListActivity$powerGuideActionListener$1$onPGSendToDeviceActionTriggered$1", f = "PowerGuideListActivity.kt", l = {45}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f40358a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f40359b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PowerGuideListActivity f40360c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j8, PowerGuideListActivity powerGuideListActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f40359b = j8;
                this.f40360c = powerGuideListActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f40359b, this.f40360c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f40358a;
                if (i14 == 0) {
                    r.b(obj);
                    d60.b bVarG = u0.g(d60.b.f57806c);
                    this.f40358a = 1;
                    obj = f0.J(bVarG, new d60.j(bVarG, this.f40359b, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                v2 v2Var = (v2) obj;
                PowerGuideListActivity powerGuideListActivity = this.f40360c;
                powerGuideListActivity.hideProgressOverlay();
                if (v2Var instanceof v2.b) {
                    powerGuideListActivity.f40353h.n(powerGuideListActivity, ((com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var).f47386a).z());
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    int i15 = PowerGuideListActivity.f40349k;
                    powerGuideListActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            }
        }

        public c() {
        }

        @Override // com.garmin.android.apps.connectmobile.powerguide.a.c
        public final void a(long j8, long j14) {
            EditPowerGuideStrategyActivity.a aVar = EditPowerGuideStrategyActivity.f40384t;
            String strValueOf = String.valueOf(j14);
            aVar.getClass();
            EditPowerGuideStrategyActivity.a.a(PowerGuideListActivity.this, j8, strValueOf, 345);
        }

        @Override // com.garmin.android.apps.connectmobile.powerguide.a.c
        public final void b(long j8, long j14) {
            PowerGuideListActivity powerGuideListActivity = PowerGuideListActivity.this;
            powerGuideListActivity.f40350e = j8;
            powerGuideListActivity.showProgressOverlay();
            ge1.b.T(o53.f0.w(powerGuideListActivity), null, null, new a(j14, powerGuideListActivity, null), 3);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40361a;

        public d(l lVar) {
            lVar.getClass();
            this.f40361a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40361a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40361a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.k0
    public final void da() {
        fa();
    }

    public final void fa() {
        k kVar = this.f40352g;
        if (kVar != null) {
            xy2.b.K(kVar, new ab1.i(kVar, null)).f(this, new d(new sa1.k(this, 0)));
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 != 123) {
            if (i14 == 234) {
                fa();
                return;
            } else {
                if (i14 == 345 && i15 == -1) {
                    fa();
                    return;
                }
                return;
            }
        }
        long jA = this.f40353h.a();
        if (jA > -1) {
            long j8 = this.f40350e;
            if (j8 > -1) {
                k kVar = this.f40352g;
                if (kVar != null) {
                    xy2.b.K(kVar, new ab1.j(kVar, j8, jA, null)).f(this, new d(new bb2.b(this, jA, 10)));
                } else {
                    s.m("viewModel");
                    throw null;
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.power_guide_activity);
        initActionBar(true, R.string.power_guide_title);
        if (d1.f()) {
            d1.o(this, new c1(this, 29));
            return;
        }
        this.f40353h.e();
        findViewById(R.id.create_strategy_btn).setOnClickListener(new oq.a(this, 22));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setMotionEventSplittingEnabled(false);
        com.garmin.android.apps.connectmobile.powerguide.a aVar = new com.garmin.android.apps.connectmobile.powerguide.a(this.f40355j, false, false, 6, null);
        this.f40351f = aVar;
        recyclerView.setAdapter(aVar);
        this.f40352g = (k) new x1(this).b(s0.f105811a.b(k.class));
        fa();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.POWER_GUIDE_HELP, null, null, 12);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/PowerGuideListActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
