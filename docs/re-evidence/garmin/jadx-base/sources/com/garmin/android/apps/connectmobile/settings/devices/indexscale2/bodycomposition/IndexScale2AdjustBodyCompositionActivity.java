package com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition;

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
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import e23.l;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import lc.u0;
import o13.h;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;
import p13.t0;
import qh1.g;
import qh1.i;
import qh1.j;
import qh1.o;
import qh1.p;
import qh1.q;
import r22.c0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/indexscale2/bodycomposition/IndexScale2AdjustBodyCompositionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IndexScale2AdjustBodyCompositionActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f43108h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f43109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f43110b = new w1(s0.f105811a.b(p.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f43111c = m.b(new g(this, 4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f43112d = m.b(new g(this, 0));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f43113e = m.b(new g(this, 1));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f43114f = gt2.c.b(a2.DEVICES.f28756a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f43115g = -1;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43116a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43116a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43117a;

        public c(l lVar) {
            lVar.getClass();
            this.f43117a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43117a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43117a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f43118a;

        public d(b.g gVar) {
            this.f43118a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43118a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f43119a;

        public e(b.g gVar) {
            this.f43119a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43119a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f43121b;

        public f(e23.a aVar, b.g gVar) {
            this.f43120a = aVar;
            this.f43121b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43120a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43121b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
        f43108h = "IndexScale2AdjustBodyCompositionActivity";
    }

    public static void ca(IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity) {
        super.onBackPressed();
    }

    public final p da() {
        return (p) this.f43110b.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        rh1.a aVarD = da().f144769d.d();
        if (!(aVarD != null ? aVarD.b() : false)) {
            super.onBackPressed();
            return;
        }
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
        aVar.setTitle(R.string.title_exit_without_saving);
        aVar.setMessage(R.string.lbl_unsaved_changes_warning);
        aVar.setPositiveButton(R.string.lbl_exit, new i(this, 2));
        aVar.setNegativeButton(R.string.lbl_cancel, new j(1));
        aVar.create().show();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_index_scale_2_adjust_body_composition_activity);
        final int i14 = 2;
        initActionBar(getString(R.string.set_body_composition_title), 2);
        long longExtra = getIntent().getLongExtra("extra_device_unit_id", -1L);
        this.f43115g = longExtra;
        if (longExtra == -1) {
            this.f43114f.error(f43108h + " - Invalid deviceId: " + longExtra + ". Calling finish()");
            finish();
        }
        View viewFindViewById = findViewById(R.id.body_composition_container);
        viewFindViewById.getClass();
        final int i15 = 0;
        l lVar = new l(this) { // from class: qh1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexScale2AdjustBodyCompositionActivity f144732b;

            {
                this.f144732b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity = this.f144732b;
                switch (i16) {
                    case 0:
                        LocalDate localDate = (LocalDate) obj;
                        String str = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        localDate.getClass();
                        DateTime dateTimeNow = DateTime.now();
                        long millis = dateTimeNow.minusDays(30).getMillis();
                        long millis2 = dateTimeNow.getMillis();
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        Calendar calendar = localDate.toDateTimeAtStartOfDay().toCalendar(locale);
                        calendar.getClass();
                        IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity2 = this.f144732b;
                        new c0(indexScale2AdjustBodyCompositionActivity2, millis, millis2, calendar, new ps2.d(indexScale2AdjustBodyCompositionActivity2, 11)).show();
                        return Unit.INSTANCE;
                    case 1:
                        String str2 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        o13.t tVar = indexScale2AdjustBodyCompositionActivity.f43111c;
                        new xg1.d(R.string.lbl_body_fat, (Double) obj, (String) tVar.getValue(), t0.b(new o13.p((String) tVar.getValue(), new xg1.d.a.C3553a(20.0d, 1.0d, 50.0d))), new h(indexScale2AdjustBodyCompositionActivity, 1)).show(indexScale2AdjustBodyCompositionActivity.getSupportFragmentManager(), (String) null);
                        return Unit.INSTANCE;
                    case 2:
                        fw.m mVar = (fw.m) obj;
                        String str3 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        int i17 = IndexScale2AdjustBodyCompositionActivity.b.f43116a[mVar.f73769b.ordinal()];
                        if (i17 == 1) {
                            indexScale2AdjustBodyCompositionActivity.showProgressOverlay();
                        } else if (i17 == 2) {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            Boolean bool = (Boolean) mVar.f73770c;
                            if (bool != null) {
                                if (bool.booleanValue()) {
                                    p pVarDa = indexScale2AdjustBodyCompositionActivity.da();
                                    long j8 = indexScale2AdjustBodyCompositionActivity.f43115g;
                                    pVarDa.y4();
                                    ge1.b.T(v1.a(pVarDa), null, null, new r(pVarDa, j8, null), 3);
                                } else {
                                    o oVar = indexScale2AdjustBodyCompositionActivity.f43109a;
                                    if (oVar == null) {
                                        p005kotlin.jvm.internal.s.m("viewBinder");
                                        throw null;
                                    }
                                    v22.e.q(oVar.f144764n);
                                    oVar.f144759i.setEnabled(false);
                                    oVar.f144760j.setEnabled(false);
                                    oVar.f144761k.setEnabled(false);
                                    v22.e.j(oVar.f144758h);
                                    oVar.f144762l.setEnabled(false);
                                    oVar.f144763m.setEnabled(false);
                                }
                            }
                        } else {
                            if (i17 != 3) {
                                u0.r();
                                return null;
                            }
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            g22.a.a(indexScale2AdjustBodyCompositionActivity, mVar.f73771d);
                        }
                        return Unit.INSTANCE;
                    default:
                        rh1.a aVar = (rh1.a) obj;
                        String str4 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        fw.m<rh1.b> mVar2 = aVar.f152748d;
                        fw.p pVar = mVar2 != null ? mVar2.f73769b : null;
                        int i18 = pVar == null ? -1 : IndexScale2AdjustBodyCompositionActivity.b.f43116a[pVar.ordinal()];
                        if (i18 == 1) {
                            indexScale2AdjustBodyCompositionActivity.showProgressOverlay();
                        } else if (i18 == 2) {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            o oVar2 = indexScale2AdjustBodyCompositionActivity.f43109a;
                            if (oVar2 == null) {
                                p005kotlin.jvm.internal.s.m("viewBinder");
                                throw null;
                            }
                            oVar2.d(aVar);
                        } else if (i18 != 3) {
                            o oVar3 = indexScale2AdjustBodyCompositionActivity.f43109a;
                            if (oVar3 == null) {
                                p005kotlin.jvm.internal.s.m("viewBinder");
                                throw null;
                            }
                            oVar3.d(aVar);
                        } else {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            g22.a.a(indexScale2AdjustBodyCompositionActivity, aVar.f152748d.f73771d);
                        }
                        return Unit.INSTANCE;
                }
            }
        };
        final int i16 = 1;
        final int i17 = 3;
        o oVar = new o(viewFindViewById, lVar, new l(this) { // from class: qh1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexScale2AdjustBodyCompositionActivity f144732b;

            {
                this.f144732b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i16;
                IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity = this.f144732b;
                switch (i18) {
                    case 0:
                        LocalDate localDate = (LocalDate) obj;
                        String str = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        localDate.getClass();
                        DateTime dateTimeNow = DateTime.now();
                        long millis = dateTimeNow.minusDays(30).getMillis();
                        long millis2 = dateTimeNow.getMillis();
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        Calendar calendar = localDate.toDateTimeAtStartOfDay().toCalendar(locale);
                        calendar.getClass();
                        IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity2 = this.f144732b;
                        new c0(indexScale2AdjustBodyCompositionActivity2, millis, millis2, calendar, new ps2.d(indexScale2AdjustBodyCompositionActivity2, 11)).show();
                        return Unit.INSTANCE;
                    case 1:
                        String str2 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        o13.t tVar = indexScale2AdjustBodyCompositionActivity.f43111c;
                        new xg1.d(R.string.lbl_body_fat, (Double) obj, (String) tVar.getValue(), t0.b(new o13.p((String) tVar.getValue(), new xg1.d.a.C3553a(20.0d, 1.0d, 50.0d))), new h(indexScale2AdjustBodyCompositionActivity, 1)).show(indexScale2AdjustBodyCompositionActivity.getSupportFragmentManager(), (String) null);
                        return Unit.INSTANCE;
                    case 2:
                        fw.m mVar = (fw.m) obj;
                        String str3 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        int i19 = IndexScale2AdjustBodyCompositionActivity.b.f43116a[mVar.f73769b.ordinal()];
                        if (i19 == 1) {
                            indexScale2AdjustBodyCompositionActivity.showProgressOverlay();
                        } else if (i19 == 2) {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            Boolean bool = (Boolean) mVar.f73770c;
                            if (bool != null) {
                                if (bool.booleanValue()) {
                                    p pVarDa = indexScale2AdjustBodyCompositionActivity.da();
                                    long j8 = indexScale2AdjustBodyCompositionActivity.f43115g;
                                    pVarDa.y4();
                                    ge1.b.T(v1.a(pVarDa), null, null, new r(pVarDa, j8, null), 3);
                                } else {
                                    o oVar2 = indexScale2AdjustBodyCompositionActivity.f43109a;
                                    if (oVar2 == null) {
                                        p005kotlin.jvm.internal.s.m("viewBinder");
                                        throw null;
                                    }
                                    v22.e.q(oVar2.f144764n);
                                    oVar2.f144759i.setEnabled(false);
                                    oVar2.f144760j.setEnabled(false);
                                    oVar2.f144761k.setEnabled(false);
                                    v22.e.j(oVar2.f144758h);
                                    oVar2.f144762l.setEnabled(false);
                                    oVar2.f144763m.setEnabled(false);
                                }
                            }
                        } else {
                            if (i19 != 3) {
                                u0.r();
                                return null;
                            }
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            g22.a.a(indexScale2AdjustBodyCompositionActivity, mVar.f73771d);
                        }
                        return Unit.INSTANCE;
                    default:
                        rh1.a aVar = (rh1.a) obj;
                        String str4 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        fw.m<rh1.b> mVar2 = aVar.f152748d;
                        fw.p pVar = mVar2 != null ? mVar2.f73769b : null;
                        int i110 = pVar == null ? -1 : IndexScale2AdjustBodyCompositionActivity.b.f43116a[pVar.ordinal()];
                        if (i110 == 1) {
                            indexScale2AdjustBodyCompositionActivity.showProgressOverlay();
                        } else if (i110 == 2) {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            o oVar3 = indexScale2AdjustBodyCompositionActivity.f43109a;
                            if (oVar3 == null) {
                                p005kotlin.jvm.internal.s.m("viewBinder");
                                throw null;
                            }
                            oVar3.d(aVar);
                        } else if (i110 != 3) {
                            o oVar4 = indexScale2AdjustBodyCompositionActivity.f43109a;
                            if (oVar4 == null) {
                                p005kotlin.jvm.internal.s.m("viewBinder");
                                throw null;
                            }
                            oVar4.d(aVar);
                        } else {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            g22.a.a(indexScale2AdjustBodyCompositionActivity, aVar.f152748d.f73771d);
                        }
                        return Unit.INSTANCE;
                }
            }
        }, new qh1.h(this, i14), new g(this, i14), new g(this, i17), null, 64, null);
        oVar.b(null);
        LocalDate localDateNow = LocalDate.now();
        pm0.h hVar = new pm0.h(5, oVar, localDateNow);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = oVar.f144759i;
        gCMComplexTwoLineButton.setOnClickListener(hVar);
        qh1.l lVar2 = oVar.f144757g;
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(lVar2.a(localDateNow));
        lVar2.getClass();
        l22.b bVar = lVar2.f144742a;
        x0 x0Var = x0.f105818a;
        oVar.f144760j.setButtonTopLabel(String.format(lVar2.f144745d, Arrays.copyOf(new Object[]{bVar.getString(R.string.lbl_body_fat), bVar.getString(R.string.percent_sign)}, 2)));
        oVar.a(null);
        oVar.f144761k.setButtonTopLabel(String.format(lVar2.f144744c, Arrays.copyOf(new Object[]{bVar.getString(R.string.lbl_skeletal_muscle_mass), bVar.getString(R.string.lbl_optional)}, 2)));
        oVar.c(null, null);
        this.f43109a = oVar;
        da().f144771f.f(this, new c(new l(this) { // from class: qh1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexScale2AdjustBodyCompositionActivity f144732b;

            {
                this.f144732b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i14;
                IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity = this.f144732b;
                switch (i18) {
                    case 0:
                        LocalDate localDate = (LocalDate) obj;
                        String str = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        localDate.getClass();
                        DateTime dateTimeNow = DateTime.now();
                        long millis = dateTimeNow.minusDays(30).getMillis();
                        long millis2 = dateTimeNow.getMillis();
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        Calendar calendar = localDate.toDateTimeAtStartOfDay().toCalendar(locale);
                        calendar.getClass();
                        IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity2 = this.f144732b;
                        new c0(indexScale2AdjustBodyCompositionActivity2, millis, millis2, calendar, new ps2.d(indexScale2AdjustBodyCompositionActivity2, 11)).show();
                        return Unit.INSTANCE;
                    case 1:
                        String str2 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        o13.t tVar = indexScale2AdjustBodyCompositionActivity.f43111c;
                        new xg1.d(R.string.lbl_body_fat, (Double) obj, (String) tVar.getValue(), t0.b(new o13.p((String) tVar.getValue(), new xg1.d.a.C3553a(20.0d, 1.0d, 50.0d))), new h(indexScale2AdjustBodyCompositionActivity, 1)).show(indexScale2AdjustBodyCompositionActivity.getSupportFragmentManager(), (String) null);
                        return Unit.INSTANCE;
                    case 2:
                        fw.m mVar = (fw.m) obj;
                        String str3 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        int i19 = IndexScale2AdjustBodyCompositionActivity.b.f43116a[mVar.f73769b.ordinal()];
                        if (i19 == 1) {
                            indexScale2AdjustBodyCompositionActivity.showProgressOverlay();
                        } else if (i19 == 2) {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            Boolean bool = (Boolean) mVar.f73770c;
                            if (bool != null) {
                                if (bool.booleanValue()) {
                                    p pVarDa = indexScale2AdjustBodyCompositionActivity.da();
                                    long j8 = indexScale2AdjustBodyCompositionActivity.f43115g;
                                    pVarDa.y4();
                                    ge1.b.T(v1.a(pVarDa), null, null, new r(pVarDa, j8, null), 3);
                                } else {
                                    o oVar2 = indexScale2AdjustBodyCompositionActivity.f43109a;
                                    if (oVar2 == null) {
                                        p005kotlin.jvm.internal.s.m("viewBinder");
                                        throw null;
                                    }
                                    v22.e.q(oVar2.f144764n);
                                    oVar2.f144759i.setEnabled(false);
                                    oVar2.f144760j.setEnabled(false);
                                    oVar2.f144761k.setEnabled(false);
                                    v22.e.j(oVar2.f144758h);
                                    oVar2.f144762l.setEnabled(false);
                                    oVar2.f144763m.setEnabled(false);
                                }
                            }
                        } else {
                            if (i19 != 3) {
                                u0.r();
                                return null;
                            }
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            g22.a.a(indexScale2AdjustBodyCompositionActivity, mVar.f73771d);
                        }
                        return Unit.INSTANCE;
                    default:
                        rh1.a aVar = (rh1.a) obj;
                        String str4 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        fw.m<rh1.b> mVar2 = aVar.f152748d;
                        fw.p pVar = mVar2 != null ? mVar2.f73769b : null;
                        int i110 = pVar == null ? -1 : IndexScale2AdjustBodyCompositionActivity.b.f43116a[pVar.ordinal()];
                        if (i110 == 1) {
                            indexScale2AdjustBodyCompositionActivity.showProgressOverlay();
                        } else if (i110 == 2) {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            o oVar3 = indexScale2AdjustBodyCompositionActivity.f43109a;
                            if (oVar3 == null) {
                                p005kotlin.jvm.internal.s.m("viewBinder");
                                throw null;
                            }
                            oVar3.d(aVar);
                        } else if (i110 != 3) {
                            o oVar4 = indexScale2AdjustBodyCompositionActivity.f43109a;
                            if (oVar4 == null) {
                                p005kotlin.jvm.internal.s.m("viewBinder");
                                throw null;
                            }
                            oVar4.d(aVar);
                        } else {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            g22.a.a(indexScale2AdjustBodyCompositionActivity, aVar.f152748d.f73771d);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        p pVarDa = da();
        ge1.b.T(v1.a(pVarDa), null, null, new q(pVarDa, null), 3);
        da().f144770e.f(this, new c(new l(this) { // from class: qh1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexScale2AdjustBodyCompositionActivity f144732b;

            {
                this.f144732b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity = this.f144732b;
                switch (i18) {
                    case 0:
                        LocalDate localDate = (LocalDate) obj;
                        String str = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        localDate.getClass();
                        DateTime dateTimeNow = DateTime.now();
                        long millis = dateTimeNow.minusDays(30).getMillis();
                        long millis2 = dateTimeNow.getMillis();
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        Calendar calendar = localDate.toDateTimeAtStartOfDay().toCalendar(locale);
                        calendar.getClass();
                        IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity2 = this.f144732b;
                        new c0(indexScale2AdjustBodyCompositionActivity2, millis, millis2, calendar, new ps2.d(indexScale2AdjustBodyCompositionActivity2, 11)).show();
                        return Unit.INSTANCE;
                    case 1:
                        String str2 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        o13.t tVar = indexScale2AdjustBodyCompositionActivity.f43111c;
                        new xg1.d(R.string.lbl_body_fat, (Double) obj, (String) tVar.getValue(), t0.b(new o13.p((String) tVar.getValue(), new xg1.d.a.C3553a(20.0d, 1.0d, 50.0d))), new h(indexScale2AdjustBodyCompositionActivity, 1)).show(indexScale2AdjustBodyCompositionActivity.getSupportFragmentManager(), (String) null);
                        return Unit.INSTANCE;
                    case 2:
                        fw.m mVar = (fw.m) obj;
                        String str3 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        int i19 = IndexScale2AdjustBodyCompositionActivity.b.f43116a[mVar.f73769b.ordinal()];
                        if (i19 == 1) {
                            indexScale2AdjustBodyCompositionActivity.showProgressOverlay();
                        } else if (i19 == 2) {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            Boolean bool = (Boolean) mVar.f73770c;
                            if (bool != null) {
                                if (bool.booleanValue()) {
                                    p pVarDa2 = indexScale2AdjustBodyCompositionActivity.da();
                                    long j8 = indexScale2AdjustBodyCompositionActivity.f43115g;
                                    pVarDa2.y4();
                                    ge1.b.T(v1.a(pVarDa2), null, null, new r(pVarDa2, j8, null), 3);
                                } else {
                                    o oVar2 = indexScale2AdjustBodyCompositionActivity.f43109a;
                                    if (oVar2 == null) {
                                        p005kotlin.jvm.internal.s.m("viewBinder");
                                        throw null;
                                    }
                                    v22.e.q(oVar2.f144764n);
                                    oVar2.f144759i.setEnabled(false);
                                    oVar2.f144760j.setEnabled(false);
                                    oVar2.f144761k.setEnabled(false);
                                    v22.e.j(oVar2.f144758h);
                                    oVar2.f144762l.setEnabled(false);
                                    oVar2.f144763m.setEnabled(false);
                                }
                            }
                        } else {
                            if (i19 != 3) {
                                u0.r();
                                return null;
                            }
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            g22.a.a(indexScale2AdjustBodyCompositionActivity, mVar.f73771d);
                        }
                        return Unit.INSTANCE;
                    default:
                        rh1.a aVar = (rh1.a) obj;
                        String str4 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                        fw.m<rh1.b> mVar2 = aVar.f152748d;
                        fw.p pVar = mVar2 != null ? mVar2.f73769b : null;
                        int i110 = pVar == null ? -1 : IndexScale2AdjustBodyCompositionActivity.b.f43116a[pVar.ordinal()];
                        if (i110 == 1) {
                            indexScale2AdjustBodyCompositionActivity.showProgressOverlay();
                        } else if (i110 == 2) {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            o oVar3 = indexScale2AdjustBodyCompositionActivity.f43109a;
                            if (oVar3 == null) {
                                p005kotlin.jvm.internal.s.m("viewBinder");
                                throw null;
                            }
                            oVar3.d(aVar);
                        } else if (i110 != 3) {
                            o oVar4 = indexScale2AdjustBodyCompositionActivity.f43109a;
                            if (oVar4 == null) {
                                p005kotlin.jvm.internal.s.m("viewBinder");
                                throw null;
                            }
                            oVar4.d(aVar);
                        } else {
                            indexScale2AdjustBodyCompositionActivity.hideProgressOverlay();
                            g22.a.a(indexScale2AdjustBodyCompositionActivity, aVar.f152748d.f73771d);
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        menu.add(0, 1, 0, R.string.lbl_help).setShowAsActionFlags(2);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 1) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.ADVANCED_BODY_METRICS, null, null, 12);
        return true;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/indexscale2/bodycomposition/IndexScale2AdjustBodyCompositionActivity$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "", "INVALID_DEVICE_UNIT_ID", "J", "", "MENU_ITEM_HELP", "I", "MAX_NO_OF_DAYS_BEFORE_TODAY", "", "MIN_BODY_FAT_PERCENTAGE", "D", "MAX_BODY_FAT_PERCENTAGE", "DEFAULT_BODY_FAT_PERCENTAGE", "MIN_SKELETAL_MUSCLE_MASS_KG", "MAX_SKELETAL_MUSCLE_MASS_KG", "DEFAULT_SKELETAL_MUSCLE_MASS_KG", "MIN_SKELETAL_MUSCLE_MASS_LBS", "MAX_SKELETAL_MUSCLE_MASS_LBS", "DEFAULT_SKELETAL_MUSCLE_MASS_LBS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
