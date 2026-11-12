package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.e0;
import androidx.lifecycle.i0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity;
import e23.l;
import e23.p;
import java.util.Iterator;
import o13.h;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import r22.p0;
import v13.i;
import z10.p3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/SafetyFeaturesActivity;", "Lz10/p3;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SafetyFeaturesActivity extends p3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f43691f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f43692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f43693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43694e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.SafetyFeaturesActivity$onCreate$1$1", f = "SafetyFeaturesActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SafetyFeaturesActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = SafetyFeaturesActivity.f43691f;
            SafetyFeaturesActivity safetyFeaturesActivity = SafetyFeaturesActivity.this;
            safetyFeaturesActivity.getClass();
            p0 p0Var = new p0();
            p0Var.showNow(safetyFeaturesActivity.getSupportFragmentManager(), null);
            p0Var.y6(R.string.safety_features_wizard_setup_complete, R.string.safety_features_wizard_setup_complete_message);
            Dialog dialog = p0Var.getDialog();
            if (dialog != null) {
                dialog.setOnDismissListener(new af2.b(p0Var, 3));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43696a;

        public c(l lVar) {
            lVar.getClass();
            this.f43696a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43696a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43696a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43697a;

        public d(g gVar) {
            this.f43697a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43697a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f43699b;

        public e(e23.a aVar, g gVar) {
            this.f43698a = aVar;
            this.f43699b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43698a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43699b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public SafetyFeaturesActivity() {
        final int i14 = 0;
        this.f43692c = m.b(new e23.a(this) { // from class: uj1.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafetyFeaturesActivity f171568b;

            {
                this.f171568b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i15 = i14;
                SafetyFeaturesActivity safetyFeaturesActivity = this.f171568b;
                switch (i15) {
                    case 0:
                        SafetyFeaturesActivity.a aVar = SafetyFeaturesActivity.f43691f;
                        Bundle extras = safetyFeaturesActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                if (!(parcelable2 instanceof hl.a)) {
                                    parcelable2 = null;
                                }
                                parcelable = (hl.a) parcelable2;
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        SafetyFeaturesActivity.a aVar3 = SafetyFeaturesActivity.f43691f;
                        return new pj1.y(new yj1.m(false, null, null, 7, null), (hl.a) safetyFeaturesActivity.f43692c.getValue());
                }
            }
        });
        final int i15 = 1;
        this.f43693d = new w1(s0.f105811a.b(pj1.s.class), new d(this), new e23.a(this) { // from class: uj1.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafetyFeaturesActivity f171568b;

            {
                this.f171568b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i16 = i15;
                SafetyFeaturesActivity safetyFeaturesActivity = this.f171568b;
                switch (i16) {
                    case 0:
                        SafetyFeaturesActivity.a aVar = SafetyFeaturesActivity.f43691f;
                        Bundle extras = safetyFeaturesActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                if (!(parcelable2 instanceof hl.a)) {
                                    parcelable2 = null;
                                }
                                parcelable = (hl.a) parcelable2;
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        SafetyFeaturesActivity.a aVar3 = SafetyFeaturesActivity.f43691f;
                        return new pj1.y(new yj1.m(false, null, null, 7, null), (hl.a) safetyFeaturesActivity.f43692c.getValue());
                }
            }
        }, new e(null, this));
    }

    @Override // z10.p3
    public final Fragment ca() {
        f.f43837h.getClass();
        return new f();
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.device_settings_safety_features);
        string.getClass();
        return string;
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    @o13.e
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Iterator<Fragment> it = getSupportFragmentManager().f7372c.f().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i14, i15, intent);
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    @o13.e
    public final void onBackPressed() {
        setResult(-1);
        if (!isTaskRoot() || getSupportFragmentManager().M() != 0) {
            getOnBackPressedDispatcher().d();
        } else {
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            com.garmin.android.apps.connectmobile.navigation.b.a.c(this, null, 268468224);
        }
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        String str;
        super.onCreate(bundle);
        hl.a aVar = (hl.a) this.f43692c.getValue();
        hl.a.b bVar = aVar instanceof hl.a.b ? (hl.a.b) aVar : null;
        if (bVar != null && (str = bVar.f84253c) != null) {
            ComposeView composeView = (ComposeView) findViewById(R.id.managed_account_notice);
            composeView.getClass();
            composeView.setVisibility(0);
            composeView.setContent(new z3.e(1790146456, true, new f20.g(bVar, str, 4)));
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("EXTRA_SHOW_SETUP_COMPLETE", false)) {
            i0 i0VarW = f0.w(this);
            ge1.b.T(i0VarW, null, null, new e0(i0VarW, new b(null), null), 3);
        }
        Bundle extras2 = getIntent().getExtras();
        w1 w1Var = this.f43693d;
        if (extras2 != null && extras2.getBoolean("EXTRA_LAUNCH_EMERGENCY_CONTACTS", false)) {
            this.f43694e = true;
            ((pj1.s) w1Var.getValue()).X4();
            if (getIntent().hasExtra("EXTRA_NOTIFICATION_CONTACT_ID") && getIntent().hasExtra("EXTRA_NOTIFICATION_CONTACT_INFO_PK") && getIntent().hasExtra("EXTRA_NOTIFICATION_CHANGE")) {
                pj1.s sVar = (pj1.s) w1Var.getValue();
                String stringExtra = getIntent().getStringExtra("EXTRA_NOTIFICATION_CONTACT_ID");
                long longExtra = getIntent().getLongExtra("EXTRA_NOTIFICATION_CONTACT_INFO_PK", -1L);
                Intent intent = getIntent();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializableExtra = intent != null ? intent.getSerializableExtra("EXTRA_NOTIFICATION_CHANGE", pj1.l.class) : null;
                } else {
                    Object serializableExtra2 = intent != null ? intent.getSerializableExtra("EXTRA_NOTIFICATION_CHANGE") : null;
                    if (!(serializableExtra2 instanceof pj1.l)) {
                        serializableExtra2 = null;
                    }
                    serializableExtra = (pj1.l) serializableExtra2;
                }
                pj1.l lVar = (pj1.l) serializableExtra;
                if (lVar == null) {
                    lVar = pj1.l.NONE;
                }
                lVar.getClass();
                if (stringExtra != null && longExtra != -1 && lVar != pj1.l.NONE) {
                    sVar.E.n(sVar.C4(), new pj1.s.d(new bn0.h(stringExtra, sVar, longExtra, lVar)));
                }
            }
        }
        getSupportFragmentManager().b(new dv.i(this, 5));
        ((pj1.s) w1Var.getValue()).K0.f(this, new c(new tn2.t(this, 29)));
        if (s3.b()) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildSafetyFeatures");
        }
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/SafetyFeaturesActivity$a;", "", "<init>", "()V", "", "EXTRA_SHOW_SETUP_COMPLETE", "Ljava/lang/String;", "EXTRA_LAUNCH_EMERGENCY_CONTACTS", "EXTRA_NOTIFICATION_CONTACT_ID", "EXTRA_NOTIFICATION_CONTACT_INFO_PK", "EXTRA_NOTIFICATION_CHANGE", "EXTRA_STARTED_AFTER_CONTACTS_MIGRATION", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context) {
            hl.a.c cVar = hl.a.c.f84256b;
            aVar.getClass();
            context.getClass();
            cVar.getClass();
            Intent intent = new Intent(context, (Class<?>) SafetyFeaturesActivity.class);
            intent.putExtra("EXTRA_LAUNCH_EMERGENCY_CONTACTS", true);
            intent.putExtra("GCM_extra_screen_access_role", cVar);
            return intent;
        }

        public static Intent b(Context context, boolean z14, hl.a aVar) {
            context.getClass();
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) SafetyFeaturesActivity.class);
            intent.putExtra("EXTRA_SHOW_SETUP_COMPLETE", z14);
            intent.putExtra("GCM_extra_screen_access_role", aVar);
            return intent;
        }

        public final Intent c(Context context, String str, long j8, pj1.l lVar, hl.a aVar) {
            context.getClass();
            str.getClass();
            lVar.getClass();
            aVar.getClass();
            Intent intentA = a(this, context);
            intentA.putExtra("EXTRA_NOTIFICATION_CONTACT_ID", str);
            intentA.putExtra("EXTRA_NOTIFICATION_CONTACT_INFO_PK", j8);
            intentA.putExtra("EXTRA_NOTIFICATION_CHANGE", lVar);
            intentA.putExtra("GCM_extra_screen_access_role", aVar);
            return intentA;
        }

        private a() {
        }
    }
}
