package com.garmin.android.apps.connectmobile.settings.devices.swim.css;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import fw.p;
import k32.l;
import o13.h;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import q92.x;
import xh1.j;
import xk1.v;
import z10.d1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/swim/css/CriticalSwimSpeedEditActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CriticalSwimSpeedEditActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f43146g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f43147h = "CriticalSwimSpeedEditActivity";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f43149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f43150c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f43153f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f43148a = gt2.c.b(a2.SETTINGS.f28756a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f43151d = new w1(s0.f105811a.b(xh1.c.class), new e(this), new d(this), new f(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43154a;

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
            f43154a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f43155a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f43155a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43155a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43155a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43156a;

        public d(g gVar) {
            this.f43156a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43156a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43157a;

        public e(g gVar) {
            this.f43157a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43157a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f43159b;

        public f(e23.a aVar, g gVar) {
            this.f43158a = aVar;
            this.f43159b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43158a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43159b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final void ca(Double d14) {
        CriticalSwimSpeedEditActivity criticalSwimSpeedEditActivity;
        String string;
        oi0.h hVar = new oi0.h(this);
        l lVar = this.f43150c;
        if (lVar == null) {
            s.m("rowItemViewHolder");
            throw null;
        }
        String string2 = getString(R.string.lbl_pace_per_100_m_capitalized);
        string2.getClass();
        String string3 = getString(R.string.no_duration_value);
        string3.getClass();
        if (d14 == null) {
            criticalSwimSpeedEditActivity = this;
        } else {
            criticalSwimSpeedEditActivity = this;
            string3 = l3.f23124b.J1(criticalSwimSpeedEditActivity, d14.doubleValue(), true, true, false, string3);
        }
        lVar.b(string2, string3);
        if (d14 != null) {
            l3.a aVar = l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            string = hVar.d(l3.a.r(dDoubleValue, true), true);
        } else {
            string = getString(R.string.common_no_data);
            string.getClass();
        }
        l lVar2 = criticalSwimSpeedEditActivity.f43150c;
        if (lVar2 != null) {
            lVar2.f102709d.setContentDescription(string);
        } else {
            s.m("rowItemViewHolder");
            throw null;
        }
    }

    public final xh1.c da() {
        return (xh1.c) this.f43151d.getValue();
    }

    public final void ea() {
        if (this.f43153f == null) {
            Double d14 = da().f191051e;
            this.f43153f = d14 != null ? Long.valueOf((long) (d14.doubleValue() * ((double) 1000))) : null;
        }
        Long l14 = this.f43153f;
        if (l14 != null) {
            da().x4(l14.longValue());
        }
    }

    public final void fa() {
        Integer numValueOf;
        int i14 = this.f43152e ? R.string.lbl_done : R.string.lbl_save;
        Double d14 = da().f191051e;
        if (d14 != null) {
            double dDoubleValue = d14.doubleValue();
            l3.f23124b.getClass();
            numValueOf = Integer.valueOf(l3.a.r(dDoubleValue, true));
        } else {
            numValueOf = null;
        }
        new j(numValueOf, i14, new xh1.b(this, 1)).show(getSupportFragmentManager(), (String) null);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 101) {
            fa();
        } else if (i15 == -1 && i14 == 102) {
            ea();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_critical_swim_speed_activity);
        boolean booleanExtra = getIntent().getBooleanExtra("extra_has_save_menu", false);
        this.f43152e = booleanExtra;
        initActionBar(getString(booleanExtra ? R.string.lbl_add_css_result : R.string.lbl_css_abbreviated), 2);
        View viewFindViewById = findViewById(R.id.css_edit_btn);
        viewFindViewById.getClass();
        this.f43149b = viewFindViewById;
        viewFindViewById.setOnClickListener(new vg1.z0(this, 21));
        View view2 = this.f43149b;
        if (view2 == null) {
            s.m("cssEditBtn");
            throw null;
        }
        l lVar = new l(view2);
        this.f43150c = lVar;
        String string = getString(R.string.lbl_pace_per_100_m_capitalized);
        string.getClass();
        String string2 = getString(R.string.no_duration_value);
        string2.getClass();
        lVar.b(string, string2);
        da().f191050d.f(this, new c(new xh1.b(this, 0)));
        xh1.c cVarDa = da();
        ge1.b.T(v1.a(cVarDa), null, null, new xh1.d(cVarDa, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        if (this.f43152e) {
            MenuItem menuItemAdd = menu.add(0, 200, 0, R.string.lbl_save);
            if (menuItemAdd != null) {
                menuItemAdd.setShowAsActionFlags(1);
            }
        } else {
            MenuItem menuItemAdd2 = menu.add(0, 100, 0, R.string.lbl_help);
            if (menuItemAdd2 != null) {
                menuItemAdd2.setShowAsActionFlags(1);
            }
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 100) {
            return HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.CRITICAL_SWIM_SPEED, null, null, 12);
        }
        if (itemId != 200) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (d1.f()) {
            d1.o(this, new v(12));
        } else if (d1.h(x.DI_CONNECT_UPLOAD, true)) {
            ea();
        } else {
            DataStorageConsentActivity.a.d(DataStorageConsentActivity.f32194t, this, 102);
        }
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/swim/css/CriticalSwimSpeedEditActivity$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "", "MENU_ITEM_ITEM_HELP", "I", "MENU_ITEM_SAVE", "CONSENT_EDIT_CSS_REQUEST_CODE", "CONSENT_SAVE_CSS_REQUEST_CODE", "EXTRA_HAS_SAVE_MENU", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, boolean z14) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) CriticalSwimSpeedEditActivity.class);
            intent.putExtra("extra_has_save_menu", z14);
            return intent;
        }

        private a() {
        }
    }
}
