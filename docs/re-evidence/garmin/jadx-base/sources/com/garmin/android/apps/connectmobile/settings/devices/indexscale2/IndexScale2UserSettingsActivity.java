package com.garmin.android.apps.connectmobile.settings.devices.indexscale2;

import am.j;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import ch1.a1;
import ch1.e6;
import ch1.g6;
import ch1.o1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import lc.u0;
import ng1.l0;
import o13.h;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import xk0.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/indexscale2/IndexScale2UserSettingsActivity;", "Lng1/l0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IndexScale2UserSettingsActivity extends l0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public zk0.e f43100t = new zk0.e(0, 0, null, null, null, null, null, 0.0d, null, null, 0, null, 4095, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w1 f43101v = new w1(s0.f105811a.b(g.class), new e(this), new d(this), new f(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43102a;

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
            f43102a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43103a;

        public c(l lVar) {
            lVar.getClass();
            this.f43103a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43103a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43103a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f43104a;

        public d(b.g gVar) {
            this.f43104a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43104a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f43105a;

        public e(b.g gVar) {
            this.f43105a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43105a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f43107b;

        public f(e23.a aVar, b.g gVar) {
            this.f43106a = aVar;
            this.f43107b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43106a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43107b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit fa(IndexScale2UserSettingsActivity indexScale2UserSettingsActivity, UserSettingsDTO userSettingsDTO, g3 g3Var) {
        zk0.e eVar;
        List<zk0.e> listB;
        int i14 = b.f43102a[g3Var.f35300a.ordinal()];
        if (i14 == 1) {
            indexScale2UserSettingsActivity.showProgressOverlay();
        } else if (i14 == 2) {
            indexScale2UserSettingsActivity.hideProgressOverlay();
            zk0.g gVar = (zk0.g) g3Var.f35301b;
            if (gVar == null || (listB = gVar.b()) == null || (eVar = (zk0.e) h0.d0(listB)) == null) {
                eVar = new zk0.e(0L, 0L, null, null, null, null, null, 0.0d, null, null, 0L, null, 4095, null);
            }
            indexScale2UserSettingsActivity.f43100t = eVar;
            if (userSettingsDTO != null) {
                super.ca(userSettingsDTO);
            }
        } else {
            if (i14 != 3) {
                u0.r();
                return null;
            }
            indexScale2UserSettingsActivity.hideProgressOverlay();
            indexScale2UserSettingsActivity.displayFailedMessage();
            String strM = j.m("Error fetching user weight goal from GC [", g3Var.f35302c, "].");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "IndexScale2UserSettingsActivity", strM);
        }
        return Unit.INSTANCE;
    }

    @Override // ng1.l0, ng1.q
    public final void ca(UserSettingsDTO userSettingsDTO) {
        userSettingsDTO.getClass();
        if (this.f43100t.j()) {
            super.ca(userSettingsDTO);
        } else {
            ga(userSettingsDTO);
        }
    }

    @Override // ng1.l0
    public final void da() {
        ArrayList arrayList = this.f125961r;
        arrayList.clear();
        g6 g6Var = new g6(this);
        g6Var.g(this, this.f43100t);
        g6Var.addObserver(this);
        arrayList.add(new ig1.h0(this));
        arrayList.add(new o1(this));
        arrayList.add(new e6(this));
        arrayList.add(new ig1.s(this));
        arrayList.add(new a1(this));
        arrayList.add(new ig1.b(this, false, 2, null));
        if (bo1.a.a().c().v0()) {
            arrayList.add(new ch1.c(this));
        }
        l0.ea(this, arrayList, this.f125995i, this);
        arrayList.add(3, g6Var);
    }

    public final void ga(UserSettingsDTO userSettingsDTO) {
        yk0.b bVar = ((g) this.f43101v.getValue()).f191209a;
        bVar.getClass();
        y0 y0Var = new y0();
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new yk0.a(y0Var, bVar, null), 3);
        y0Var.f(this, new c(new ph1.d(0, this, userSettingsDTO)));
    }

    @Override // ng1.l0, ng1.q, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.devices_settings_user_settings);
        ga(null);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == R.id.menu_item_help) {
            HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.INDEX_DEVICES_USER_SETTINGS, null, null, 12);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // ng1.l0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj != null) {
            if (observable instanceof g6) {
                g.x4((g) this.f43101v.getValue(), "weight-grams", new zk0.h("WEIGHT_GRAMS", (int) (((Double) obj).doubleValue() * ((double) 1000))));
            }
            if (observable instanceof ch1.c) {
                Intent intent = new Intent(this, (Class<?>) IndexScale2AdjustBodyCompositionActivity.class);
                intent.putExtra("extra_device_unit_id", this.f125992f);
                startActivity(intent);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/indexscale2/IndexScale2UserSettingsActivity$a;", "", "<init>", "()V", "", "WEIGHT_GOAL_POSITION_IN_LIST", "I", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
