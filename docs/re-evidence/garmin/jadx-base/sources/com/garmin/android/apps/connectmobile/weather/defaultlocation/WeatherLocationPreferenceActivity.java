package com.garmin.android.apps.connectmobile.weather.defaultlocation;

import android.location.Address;
import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import c22.f;
import c22.t1;
import com.garmin.android.apps.connectmobile.R;
import du2.g;
import e23.p;
import g42.q;
import o13.r;
import o53.b0;
import o53.c0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import u53.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weather/defaultlocation/WeatherLocationPreferenceActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lg42/b;", "Lo53/b0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WeatherLocationPreferenceActivity extends com.garmin.android.apps.connectmobile.c implements g42.b, b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47895d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f47896a = c0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.weather.defaultlocation.b f47897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f47898c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationPreferenceActivity$onCreate$1", f = "WeatherLocationPreferenceActivity.kt", l = {35}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47899a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return WeatherLocationPreferenceActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f47899a;
            WeatherLocationPreferenceActivity weatherLocationPreferenceActivity = WeatherLocationPreferenceActivity.this;
            if (i14 == 0) {
                r.b(obj);
                com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar = weatherLocationPreferenceActivity.f47897b;
                if (bVar == null) {
                    s.m("preferenceViewModel");
                    throw null;
                }
                this.f47899a = 1;
                y0<g.d> y0Var = bVar.f47925a;
                g.f61293g.getClass();
                y0Var.m(g.a.d(weatherLocationPreferenceActivity));
                Object objA4 = bVar.A4(weatherLocationPreferenceActivity, this);
                if (objA4 != aVar) {
                    objA4 = Unit.INSTANCE;
                }
                if (objA4 == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar2 = weatherLocationPreferenceActivity.f47897b;
            if (bVar2 == null) {
                s.m("preferenceViewModel");
                throw null;
            }
            g42.d dVarX4 = bVar2.x4();
            q qVar = weatherLocationPreferenceActivity.f47898c;
            if (qVar == null) {
                s.m("selectionViewModel");
                throw null;
            }
            String str = dVarX4 != null ? dVarX4.f75787d : null;
            String str2 = dVarX4 != null ? dVarX4.f75789f : null;
            qVar.f75822f = str;
            qVar.f75823g = str2;
            return Unit.INSTANCE;
        }
    }

    @Override // g42.b
    public final void F2() {
        f.d(f.f23050a, this, getString(R.string.lbl_unable_to_save), getString(R.string.weather_location_no_internet_error_body), new o13.p(getString(R.string.lbl_ok), new g42.f(this, 0)), null, null, false, 112).show();
    }

    @Override // g42.b
    public final void J1() {
        f.d(f.f23050a, this, getString(R.string.lbl_unable_to_save), getString(R.string.weather_unable_to_save_description), new o13.p(getString(R.string.lbl_ok), new g42.f(this, 4)), null, null, false, 112).show();
    }

    @Override // g42.b
    public final void W3() {
        j22.b.f96736a.getClass();
        String string = j22.b.t() ? getString(R.string.weather_location_permission_needed_alert_body) : getString(R.string.weather_location_permission_needed_alert_body_legacy);
        string.getClass();
        f.d(f.f23050a, this, getString(R.string.weather_location_permission_needed), string, new o13.p(getString(R.string.lbl_settings), new g42.f(this, 1)), null, new o13.p(getString(R.string.lbl_cancel), new g42.f(this, 2)), false, 80).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g42.c
    public final void Z8() {
        if (getSupportFragmentManager().M() <= 0) {
            setResult(-1);
            finish();
            return;
        }
        q qVar = this.f47898c;
        if (qVar == null) {
            s.m("selectionViewModel");
            throw null;
        }
        Address address = (Address) qVar.f75819c.d();
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar = this.f47897b;
        if (bVar == null) {
            s.m("preferenceViewModel");
            throw null;
        }
        bVar.f47932h.m(address);
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar2 = this.f47897b;
        if (bVar2 == null) {
            s.m("preferenceViewModel");
            throw null;
        }
        Logger logger = com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47924k;
        g42.d dVarX4 = bVar2.x4();
        if (dVarX4 != null) {
            dVarX4.f75789f = address != null ? address.getPostalCode() : null;
            dVarX4.f75788e = address != null ? address.getCountryCode() : null;
            dVarX4.f75787d = address != null ? t1.b(address) : null;
            dVarX4.f75785b = address != null ? Double.valueOf(address.getLatitude()) : null;
            dVarX4.f75786c = address != null ? Double.valueOf(address.getLongitude()) : null;
            logger.debug("updateSelectedLocation: successfully updated current settings DTO with address: {}", address);
        } else {
            logger.error("updateSelectedLocation: Could not find weatherLocationDTO in user data");
        }
        getSupportFragmentManager().Z();
    }

    @Override // g42.b
    public final void b6() {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        c.f47939y.getClass();
        aVarB.l(R.id.fragment_container, new c(), null);
        aVarB.d(null);
        aVarB.e();
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF136462d() {
        return this.f47896a.f168725a;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        n0 n0VarF = getSupportFragmentManager().F(R.id.fragment_container);
        if (n0VarF == null) {
            super.onBackPressed();
        } else if (n0VarF instanceof g42.a) {
            ((g42.a) n0VarF).K3();
        } else {
            Z8();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.weather_location_selection_activity);
        initActionBar(true, R.string.weather_location_settings_title);
        x1 x1Var = new x1(this);
        t0 t0Var = s0.f105811a;
        this.f47897b = (com.garmin.android.apps.connectmobile.weather.defaultlocation.b) x1Var.b(t0Var.b(com.garmin.android.apps.connectmobile.weather.defaultlocation.b.class));
        this.f47898c = (q) new x1(this).b(t0Var.b(q.class));
        ge1.b.T(this, null, null, new b(null), 3);
        if (bundle == null) {
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
            com.garmin.android.apps.connectmobile.weather.defaultlocation.a.f47906o.getClass();
            aVarB.l(R.id.fragment_container, new com.garmin.android.apps.connectmobile.weather.defaultlocation.a(), null);
            aVarB.t();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        n0 n0VarF = getSupportFragmentManager().F(R.id.fragment_container);
        if (n0VarF == null) {
            return super.onNavigateUp();
        }
        if (n0VarF instanceof g42.a) {
            ((g42.a) n0VarF).K3();
            return true;
        }
        Z8();
        return true;
    }

    @Override // g42.b
    public final void x5() {
        int i14;
        j22.b.f96736a.getClass();
        j22.f fVarJ = j22.b.j(this);
        if (fVarJ == j22.f.ALLOWED_ALL_TIME || fVarJ == j22.f.ALLOWED_WHILE_USING) {
            i14 = R.string.weather_using_phone_location_body;
        } else {
            i14 = j22.b.t() ? R.string.weather_using_phone_location_alert_body : R.string.weather_using_phone_location_alert_body_older;
        }
        f.d(f.f23050a, this, getString(R.string.weather_using_phone_location), getString(i14), new o13.p(getString(R.string.lbl_ok), new g42.f(this, 3)), null, null, false, 112).show();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weather/defaultlocation/WeatherLocationPreferenceActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
