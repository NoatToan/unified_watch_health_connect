package com.garmin.android.apps.connectmobile.weather.defaultlocation;

import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.n0;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import g42.q;
import o13.r;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weather/defaultlocation/WeatherLocationSelectionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lg42/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WeatherLocationSelectionActivity extends com.garmin.android.apps.connectmobile.c implements g42.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47901b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f47902a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationSelectionActivity$navigateBack$1", f = "WeatherLocationSelectionActivity.kt", l = {70}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47903a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Address f47905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Address address, d<? super b> dVar) {
            super(2, dVar);
            this.f47905c = address;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return WeatherLocationSelectionActivity.this.new b(this.f47905c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f47903a;
            Address address = this.f47905c;
            WeatherLocationSelectionActivity weatherLocationSelectionActivity = WeatherLocationSelectionActivity.this;
            if (i14 == 0) {
                r.b(obj);
                q qVar = weatherLocationSelectionActivity.f47902a;
                if (qVar == null) {
                    s.m("selectionViewModel");
                    throw null;
                }
                Double d14 = address != null ? new Double(address.getLatitude()) : null;
                Double d15 = address != null ? new Double(address.getLongitude()) : null;
                this.f47903a = 1;
                obj = qVar.B4(d14, d15, this);
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
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Intent intent = new Intent();
            if (zBooleanValue && address != null) {
                intent.putExtra("extra_result_latitude", address.getLatitude());
                intent.putExtra("extra_result_longitude", address.getLongitude());
            }
            weatherLocationSelectionActivity.setResult(-1, intent);
            weatherLocationSelectionActivity.finish();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g42.c
    public final void Z8() {
        q qVar = this.f47902a;
        if (qVar == null) {
            s.m("selectionViewModel");
            throw null;
        }
        ge1.b.T(f0.w(this), null, null, new b((Address) qVar.f75819c.d(), null), 3);
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
        initActionBar(true, R.string.lbl_location);
        q qVar = (q) new x1(this).b(s0.f105811a.b(q.class));
        this.f47902a = qVar;
        qVar.f75820d = true;
        qVar.f75821e = getIntent().getLongExtra("extra_device_id", -1L);
        if (bundle == null) {
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
            c.f47939y.getClass();
            aVarB.l(R.id.fragment_container, new c(), null);
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/weather/defaultlocation/WeatherLocationSelectionActivity$a;", "", "<init>", "()V", "", "EXTRA_DEVICE_ID", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
