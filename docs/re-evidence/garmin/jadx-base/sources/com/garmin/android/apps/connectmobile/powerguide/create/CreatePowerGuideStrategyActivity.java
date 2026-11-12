package com.garmin.android.apps.connectmobile.powerguide.create;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import d53.t;
import dv.i;
import e23.l;
import fw.p;
import lc.u0;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import ua1.j;
import va1.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/create/CreatePowerGuideStrategyActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CreatePowerGuideStrategyActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40374b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ua1.c f40375a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f40377b;

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
            f40376a = iArr;
            int[] iArr2 = new int[o.values().length];
            try {
                iArr2[o.ADD_RIDER_WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[o.SELECT_BIKE_WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[o.CONFIRM_FTP.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[o.SELECT_ABILITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[o.SELECT_GENDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[o.SELECT_RIDING_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f40377b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40378a;

        public c(l lVar) {
            lVar.getClass();
            this.f40378a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f40378a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40378a.invoke(obj);
        }
    }

    public final void ca(va1.b bVar, String str) {
        if (isFinishing()) {
            return;
        }
        Fragment fragmentF = getSupportFragmentManager().F(R.id.content);
        if (fragmentF != null && (fragmentF instanceof va1.b) && ((va1.b) fragmentF).b5().equals(str)) {
            return;
        }
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.content, bVar, str);
        aVar.d(str);
        aVar.s(true, true);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().M() <= 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        Bundle extras4;
        Bundle extras5;
        String string;
        Long lJ;
        super.onCreate(bundle);
        setContentView(R.layout.create_power_guide_strategy_activity);
        initActionBar(true);
        Intent intent = getIntent();
        long j8 = -1;
        final long jLongValue = (intent == null || (extras5 = intent.getExtras()) == null || (string = extras5.getString("GCM_extra_course_id")) == null || (lJ = t.j(string)) == null) ? -1L : lJ.longValue();
        if (jLongValue < 1) {
            finish();
            return;
        }
        Intent intent2 = getIntent();
        final boolean z14 = (intent2 == null || (extras4 = intent2.getExtras()) == null) ? false : extras4.getBoolean("GCM_extra_navigate_from_course_details");
        Intent intent3 = getIntent();
        if (intent3 != null && (extras3 = intent3.getExtras()) != null) {
            j8 = extras3.getLong("GCM_extra_power_guide_id_to_replace", -1L);
        }
        final long j14 = j8;
        Intent intent4 = getIntent();
        String string2 = (intent4 == null || (extras2 = intent4.getExtras()) == null) ? null : extras2.getString("GCM_extra_event_name");
        Intent intent5 = getIntent();
        double d14 = Double.NaN;
        if (intent5 != null && (extras = intent5.getExtras()) != null) {
            d14 = extras.getDouble("GCM_extra_event_distance", Double.NaN);
        }
        final double d15 = d14;
        ua1.c cVar = (ua1.c) new x1(this, new j(jLongValue, string2)).b(s0.f105811a.b(ua1.c.class));
        this.f40375a = cVar;
        final int i14 = 0;
        cVar.f169617m.f(this, new c(new l(this) { // from class: ua1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePowerGuideStrategyActivity f169599b;

            {
                this.f169599b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                String str = "RiderWeightFrag";
                CreatePowerGuideStrategyActivity createPowerGuideStrategyActivity = this.f169599b;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        CreatePowerGuideStrategyActivity.a aVar = CreatePowerGuideStrategyActivity.f40374b;
                        if (g3Var != null) {
                            int i16 = CreatePowerGuideStrategyActivity.b.f40376a[g3Var.f35300a.ordinal()];
                            if (i16 == 1) {
                                createPowerGuideStrategyActivity.showProgressOverlay();
                            } else if (i16 == 2) {
                                createPowerGuideStrategyActivity.hideProgressOverlay();
                            } else {
                                if (i16 != 3) {
                                    u0.r();
                                    return null;
                                }
                                createPowerGuideStrategyActivity.hideProgressOverlay();
                                createPowerGuideStrategyActivity.displayFailedMessage();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        o oVar = (o) obj;
                        CreatePowerGuideStrategyActivity.a aVar2 = CreatePowerGuideStrategyActivity.f40374b;
                        if (oVar != null) {
                            switch (CreatePowerGuideStrategyActivity.b.f40377b[oVar.ordinal()]) {
                                case 1:
                                    createPowerGuideStrategyActivity.ca(new va1.a(), "RiderWeightFrag");
                                    break;
                                case 2:
                                    createPowerGuideStrategyActivity.ca(new va1.j(), "SelectBikeWeightFrag");
                                    break;
                                case 3:
                                    createPowerGuideStrategyActivity.ca(new va1.e(), "ConfirmFTPFrag");
                                    break;
                                case 4:
                                    createPowerGuideStrategyActivity.ca(new va1.h(), "SelectAbilityFrag");
                                    break;
                                case 5:
                                    createPowerGuideStrategyActivity.ca(new va1.l(), "SelectGenderFrag");
                                    break;
                                case 6:
                                    createPowerGuideStrategyActivity.ca(new va1.n(), "SelectRidingPos");
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        o oVar2 = (o) obj;
                        CreatePowerGuideStrategyActivity.a aVar3 = CreatePowerGuideStrategyActivity.f40374b;
                        if (oVar2 != null) {
                            switch (CreatePowerGuideStrategyActivity.b.f40377b[oVar2.ordinal()]) {
                                case 1:
                                    break;
                                case 2:
                                    str = "SelectBikeWeightFrag";
                                    break;
                                case 3:
                                    str = "ConfirmFTPFrag";
                                    break;
                                case 4:
                                    str = "SelectAbilityFrag";
                                    break;
                                case 5:
                                    str = "SelectGenderFrag";
                                    break;
                                case 6:
                                    str = "SelectRidingPos";
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                            createPowerGuideStrategyActivity.getSupportFragmentManager().c0(-1, 0, str);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ua1.c cVar2 = this.f40375a;
        if (cVar2 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i15 = 1;
        cVar2.f169610f.f(this, new c(new l(this) { // from class: ua1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePowerGuideStrategyActivity f169599b;

            {
                this.f169599b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                String str = "RiderWeightFrag";
                CreatePowerGuideStrategyActivity createPowerGuideStrategyActivity = this.f169599b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        CreatePowerGuideStrategyActivity.a aVar = CreatePowerGuideStrategyActivity.f40374b;
                        if (g3Var != null) {
                            int i17 = CreatePowerGuideStrategyActivity.b.f40376a[g3Var.f35300a.ordinal()];
                            if (i17 == 1) {
                                createPowerGuideStrategyActivity.showProgressOverlay();
                            } else if (i17 == 2) {
                                createPowerGuideStrategyActivity.hideProgressOverlay();
                            } else {
                                if (i17 != 3) {
                                    u0.r();
                                    return null;
                                }
                                createPowerGuideStrategyActivity.hideProgressOverlay();
                                createPowerGuideStrategyActivity.displayFailedMessage();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        o oVar = (o) obj;
                        CreatePowerGuideStrategyActivity.a aVar2 = CreatePowerGuideStrategyActivity.f40374b;
                        if (oVar != null) {
                            switch (CreatePowerGuideStrategyActivity.b.f40377b[oVar.ordinal()]) {
                                case 1:
                                    createPowerGuideStrategyActivity.ca(new va1.a(), "RiderWeightFrag");
                                    break;
                                case 2:
                                    createPowerGuideStrategyActivity.ca(new va1.j(), "SelectBikeWeightFrag");
                                    break;
                                case 3:
                                    createPowerGuideStrategyActivity.ca(new va1.e(), "ConfirmFTPFrag");
                                    break;
                                case 4:
                                    createPowerGuideStrategyActivity.ca(new va1.h(), "SelectAbilityFrag");
                                    break;
                                case 5:
                                    createPowerGuideStrategyActivity.ca(new va1.l(), "SelectGenderFrag");
                                    break;
                                case 6:
                                    createPowerGuideStrategyActivity.ca(new va1.n(), "SelectRidingPos");
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        o oVar2 = (o) obj;
                        CreatePowerGuideStrategyActivity.a aVar3 = CreatePowerGuideStrategyActivity.f40374b;
                        if (oVar2 != null) {
                            switch (CreatePowerGuideStrategyActivity.b.f40377b[oVar2.ordinal()]) {
                                case 1:
                                    break;
                                case 2:
                                    str = "SelectBikeWeightFrag";
                                    break;
                                case 3:
                                    str = "ConfirmFTPFrag";
                                    break;
                                case 4:
                                    str = "SelectAbilityFrag";
                                    break;
                                case 5:
                                    str = "SelectGenderFrag";
                                    break;
                                case 6:
                                    str = "SelectRidingPos";
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                            createPowerGuideStrategyActivity.getSupportFragmentManager().c0(-1, 0, str);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ua1.c cVar3 = this.f40375a;
        if (cVar3 == null) {
            s.m("viewModel");
            throw null;
        }
        final int i16 = 2;
        cVar3.f169611g.f(this, new c(new l(this) { // from class: ua1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePowerGuideStrategyActivity f169599b;

            {
                this.f169599b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                String str = "RiderWeightFrag";
                CreatePowerGuideStrategyActivity createPowerGuideStrategyActivity = this.f169599b;
                switch (i17) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        CreatePowerGuideStrategyActivity.a aVar = CreatePowerGuideStrategyActivity.f40374b;
                        if (g3Var != null) {
                            int i18 = CreatePowerGuideStrategyActivity.b.f40376a[g3Var.f35300a.ordinal()];
                            if (i18 == 1) {
                                createPowerGuideStrategyActivity.showProgressOverlay();
                            } else if (i18 == 2) {
                                createPowerGuideStrategyActivity.hideProgressOverlay();
                            } else {
                                if (i18 != 3) {
                                    u0.r();
                                    return null;
                                }
                                createPowerGuideStrategyActivity.hideProgressOverlay();
                                createPowerGuideStrategyActivity.displayFailedMessage();
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        o oVar = (o) obj;
                        CreatePowerGuideStrategyActivity.a aVar2 = CreatePowerGuideStrategyActivity.f40374b;
                        if (oVar != null) {
                            switch (CreatePowerGuideStrategyActivity.b.f40377b[oVar.ordinal()]) {
                                case 1:
                                    createPowerGuideStrategyActivity.ca(new va1.a(), "RiderWeightFrag");
                                    break;
                                case 2:
                                    createPowerGuideStrategyActivity.ca(new va1.j(), "SelectBikeWeightFrag");
                                    break;
                                case 3:
                                    createPowerGuideStrategyActivity.ca(new va1.e(), "ConfirmFTPFrag");
                                    break;
                                case 4:
                                    createPowerGuideStrategyActivity.ca(new va1.h(), "SelectAbilityFrag");
                                    break;
                                case 5:
                                    createPowerGuideStrategyActivity.ca(new va1.l(), "SelectGenderFrag");
                                    break;
                                case 6:
                                    createPowerGuideStrategyActivity.ca(new va1.n(), "SelectRidingPos");
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                        }
                        return Unit.INSTANCE;
                    default:
                        o oVar2 = (o) obj;
                        CreatePowerGuideStrategyActivity.a aVar3 = CreatePowerGuideStrategyActivity.f40374b;
                        if (oVar2 != null) {
                            switch (CreatePowerGuideStrategyActivity.b.f40377b[oVar2.ordinal()]) {
                                case 1:
                                    break;
                                case 2:
                                    str = "SelectBikeWeightFrag";
                                    break;
                                case 3:
                                    str = "ConfirmFTPFrag";
                                    break;
                                case 4:
                                    str = "SelectAbilityFrag";
                                    break;
                                case 5:
                                    str = "SelectGenderFrag";
                                    break;
                                case 6:
                                    str = "SelectRidingPos";
                                    break;
                                default:
                                    u0.r();
                                    return null;
                            }
                            createPowerGuideStrategyActivity.getSupportFragmentManager().c0(-1, 0, str);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ua1.c cVar4 = this.f40375a;
        if (cVar4 == null) {
            s.m("viewModel");
            throw null;
        }
        cVar4.f169618n.f(this, new c(new l() { // from class: ua1.b
            @Override // e23.l
            public final Object invoke(Object obj) {
                ab1.g gVar = (ab1.g) obj;
                CreatePowerGuideStrategyActivity.a aVar = CreatePowerGuideStrategyActivity.f40374b;
                if (gVar != null) {
                    EditPowerGuideStrategyActivity.a aVar2 = EditPowerGuideStrategyActivity.f40384t;
                    String strValueOf = String.valueOf(jLongValue);
                    Double dValueOf = Double.valueOf(d15);
                    aVar2.getClass();
                    strValueOf.getClass();
                    CreatePowerGuideStrategyActivity createPowerGuideStrategyActivity = this.f169600a;
                    Intent intent6 = new Intent(createPowerGuideStrategyActivity, (Class<?>) EditPowerGuideStrategyActivity.class);
                    intent6.putExtra("POWER_GUIDE_SUMMARY", gVar);
                    intent6.putExtra("GCM_extra_navigate_from_course_details", z14);
                    intent6.putExtra("POWER_GUIDE_COURSE_ID", strValueOf);
                    intent6.putExtra("GCM_extra_power_guide_id_to_replace", j14);
                    intent6.putExtra("GCM_extra_event_distance", dValueOf);
                    createPowerGuideStrategyActivity.startActivity(intent6);
                    createPowerGuideStrategyActivity.finish();
                }
                return Unit.INSTANCE;
            }
        }));
        Fragment fragmentF = getSupportFragmentManager().F(R.id.content);
        if (fragmentF != null && (fragmentF instanceof va1.b)) {
            setTitle(((va1.b) fragmentF).V5());
        }
        getSupportFragmentManager().b(new i(this, 4));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/create/CreatePowerGuideStrategyActivity$a;", "", "<init>", "()V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Context context, String str, Double d14, String str2) {
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) CreatePowerGuideStrategyActivity.class);
            intent.putExtra("GCM_extra_course_id", str);
            intent.putExtra("GCM_extra_event_distance", d14);
            intent.putExtra("GCM_extra_event_name", str2);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
