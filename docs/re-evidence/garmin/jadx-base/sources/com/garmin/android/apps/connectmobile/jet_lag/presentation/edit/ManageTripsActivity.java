package com.garmin.android.apps.connectmobile.jet_lag.presentation.edit;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.JetLagActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.ManageTripsActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripSetupActivity;
import e23.l;
import fw.p;
import g.h;
import g22.k;
import is0.i;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import js0.g;
import lc.u0;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.w;
import yr0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/ManageTripsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ManageTripsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f36985h = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public js0.e f36987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public js0.c f36988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public js0.c f36989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public js0.c f36990e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f36986a = new w1(s0.f105811a.b(i.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<Intent> f36991f = registerForActivityResult(new h(), new a61.i(this, 27));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f36992g = m.b(new is0.f(this, 1));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f36994b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36993a = iArr;
            int[] iArr2 = new int[g.values().length];
            try {
                iArr2[g.PAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[g.UPCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[g.FUTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f36994b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36995a;

        public c(l lVar) {
            lVar.getClass();
            this.f36995a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f36995a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36995a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36996a;

        public d(b.g gVar) {
            this.f36996a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36996a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36997a;

        public e(b.g gVar) {
            this.f36997a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36997a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f36999b;

        public f(e23.a aVar, b.g gVar) {
            this.f36998a = aVar;
            this.f36999b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36998a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36999b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final ArrayList ca() {
        RandomAccess randomAccess;
        RandomAccess randomAccess2;
        RandomAccess randomAccess3;
        ArrayList arrayList = new ArrayList();
        js0.c cVar = this.f36988c;
        if (cVar == null || (randomAccess = cVar.f100618e) == null) {
            randomAccess = j0.f134944a;
        }
        arrayList.addAll(randomAccess);
        js0.c cVar2 = this.f36989d;
        if (cVar2 == null || (randomAccess2 = cVar2.f100618e) == null) {
            randomAccess2 = j0.f134944a;
        }
        arrayList.addAll(randomAccess2);
        js0.c cVar3 = this.f36990e;
        if (cVar3 == null || (randomAccess3 = cVar3.f100618e) == null) {
            randomAccess3 = j0.f134944a;
        }
        arrayList.addAll(randomAccess3);
        return arrayList;
    }

    public final void da() {
        JetLagActivity.a aVar = JetLagActivity.f36950d;
        Bundle extras = getIntent().getExtras();
        boolean z14 = false;
        if (extras != null && extras.getBoolean("GCM_extra_top_navigation")) {
            z14 = true;
        }
        aVar.getClass();
        startActivity(JetLagActivity.a.a(this, z14));
        finish();
    }

    public final void ea() {
        js0.c cVar = this.f36988c;
        int size = cVar != null ? cVar.f100618e.size() : 0;
        js0.c cVar2 = this.f36988c;
        int size2 = cVar2 != null ? cVar2.f100618e.size() : 0;
        js0.c cVar3 = this.f36988c;
        int size3 = size + size2 + (cVar3 != null ? cVar3.f100618e.size() : 0);
        ns0.c.f127813a.getClass();
        if (size3 >= 25) {
            String string = getString(R.string.lbl_maximum_limit_reached);
            string.getClass();
            String string2 = getString(R.string.msg_jet_lag_maximum_limit_reached, "25");
            string2.getClass();
            String string3 = getString(R.string.lbl_ok);
            string3.getClass();
            c22.f.d(c22.f.f23050a, this, string, string2, new o13.p(string3, new in2.e((byte) 0, 2)), null, null, true, 48).show();
            return;
        }
        TripSetupActivity.a aVar = TripSetupActivity.f37081g;
        ArrayList arrayListCa = ca();
        boolean zBooleanValue = ((Boolean) this.f36992g.getValue()).booleanValue();
        Bundle extras = getIntent().getExtras();
        this.f36991f.a(TripSetupActivity.a.a(aVar, this, null, arrayListCa, zBooleanValue, extras != null && extras.getBoolean("GCM_extra_top_navigation"), 2), null);
        if (s.g(getIntent().getAction(), "ACTION_ADD_TRIP")) {
            finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public final void fa(o oVar) {
        boolean z14;
        yr0.f fVar;
        List<yr0.l> listO;
        if (oVar != null) {
            ns0.b.f127812a.getClass();
            LocalDate localDateD = oVar.d();
            LocalDate localDateMinusDays = localDateD != null ? localDateD.minusDays(2) : null;
            if (localDateMinusDays != null ? localDateMinusDays.isAfter(LocalDate.now()) : false) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        boolean z15 = ((oVar == null || (fVar = oVar.f199041f) == null || (listO = fVar.o()) == null) ? 0 : listO.size()) > 0;
        f.c<Intent> cVar = this.f36991f;
        if (z15 || !z14) {
            cVar.a(JetLagSummaryActivity.a.b(JetLagSummaryActivity.f36977o, this, false, oVar != null ? oVar.f199036a : null, 8), null);
            return;
        }
        if (oVar != null) {
            TripDetailsActivity.a aVar = TripDetailsActivity.f37000i;
            ArrayList arrayListY0 = h0.y0(ca(), oVar);
            aVar.getClass();
            Intent intent = new Intent(this, (Class<?>) TripDetailsActivity.class);
            intent.putExtra("EXTRA_SELECTED_TRIP", oVar);
            intent.putParcelableArrayListExtra("EXTRA_TRIPS", new ArrayList<>(arrayListY0));
            cVar.a(intent, null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void ga(List<o> list) {
        boolean zQ;
        if (list == null || list.isEmpty()) {
            js0.e eVar = this.f36987b;
            if (eVar != null) {
                eVar.b();
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            o oVar = (o) obj;
            LocalDate localDateW = k.w(oVar.f199039d, "yyyy-MM-dd");
            if (localDateW == null || !localDateW.isBefore(DateTime.now().toLocalDate())) {
                ns0.b.f127812a.getClass();
                if (ns0.b.m(oVar)) {
                }
            }
            arrayList2.add(obj);
        }
        js0.e eVar2 = this.f36987b;
        if (eVar2 != null) {
            v22.e.v(eVar2.f100628h, !arrayList2.isEmpty());
        }
        js0.c cVar = this.f36988c;
        if (cVar != null) {
            cVar.B(arrayList2);
        }
        arrayList.removeAll(arrayList2);
        boolean z14 = false;
        if (arrayList.isEmpty()) {
            js0.e eVar3 = this.f36987b;
            if (eVar3 != null) {
                v22.e.v(eVar3.f100629i, false);
                v22.e.v(eVar3.f100630j, false);
            }
            js0.e eVar4 = this.f36987b;
            if (eVar4 != null) {
                v22.e.v(eVar4.f100631k, false);
                v22.e.v(eVar4.f100632l, false);
                return;
            }
            return;
        }
        List<o> listC = w.c(h0.b0(arrayList));
        js0.e eVar5 = this.f36987b;
        if (eVar5 != null) {
            boolean zIsEmpty = listC.isEmpty();
            boolean z15 = !zIsEmpty;
            o oVar2 = (o) h0.d0(listC);
            if (oVar2 != null) {
                ns0.b.f127812a.getClass();
                zQ = ns0.b.q(oVar2);
            } else {
                zQ = false;
            }
            TextView textView = eVar5.f100629i;
            if (!zIsEmpty && !zQ) {
                z14 = true;
            }
            v22.e.v(textView, z14);
            v22.e.v(eVar5.f100630j, z15);
        }
        js0.c cVar2 = this.f36989d;
        if (cVar2 != null) {
            cVar2.B(listC);
        }
        arrayList.removeAll(listC);
        js0.e eVar6 = this.f36987b;
        if (eVar6 != null) {
            boolean z16 = !arrayList.isEmpty();
            v22.e.v(eVar6.f100631k, z16);
            v22.e.v(eVar6.f100632l, z16);
        }
        js0.c cVar3 = this.f36990e;
        if (cVar3 != null) {
            cVar3.B(arrayList);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        super.onCreate(bundle);
        setContentView(R.layout.manage_trips_activity);
        final int i14 = 1;
        initActionBar(true, R.string.lbl_jet_lag_advisor);
        g gVar = g.PAST;
        this.f36988c = new js0.c(gVar, new l(this) { // from class: is0.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageTripsActivity f94924b;

            {
                this.f94924b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                ManageTripsActivity manageTripsActivity = this.f94924b;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        ManageTripsActivity.a aVar = ManageTripsActivity.f36985h;
                        int i16 = ManageTripsActivity.b.f36993a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            manageTripsActivity.hideProgressOverlay();
                            o13.p pVar = (o13.p) g3Var.f35301b;
                            Long l14 = pVar != null ? (Long) pVar.f128595b : null;
                            js0.g gVar2 = pVar != null ? (js0.g) pVar.f128594a : null;
                            int i17 = gVar2 == null ? -1 : ManageTripsActivity.b.f36994b[gVar2.ordinal()];
                            if (i17 == 1) {
                                js0.c cVar = manageTripsActivity.f36988c;
                                if (cVar != null) {
                                    cVar.A(l14);
                                }
                            } else if (i17 == 2) {
                                js0.c cVar2 = manageTripsActivity.f36989d;
                                if (cVar2 != null) {
                                    cVar2.A(l14);
                                }
                                manageTripsActivity.ga(manageTripsActivity.ca());
                            } else if (i17 == 3) {
                                js0.c cVar3 = manageTripsActivity.f36990e;
                                if (cVar3 != null) {
                                    cVar3.A(l14);
                                }
                                manageTripsActivity.ga(manageTripsActivity.ca());
                            }
                            if (manageTripsActivity.ca().isEmpty()) {
                                manageTripsActivity.da();
                            }
                        } else if (i16 == 2) {
                            manageTripsActivity.hideProgressOverlay();
                            manageTripsActivity.displayFailedMessage();
                        } else {
                            if (i16 != 3) {
                                u0.r();
                                return null;
                            }
                            manageTripsActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        js0.c cVar4 = manageTripsActivity.f36988c;
                        manageTripsActivity.fa(cVar4 != null ? (o) cVar4.f100618e.get(iIntValue) : null);
                        return Unit.INSTANCE;
                    case 2:
                        int iIntValue2 = ((Integer) obj).intValue();
                        js0.c cVar5 = manageTripsActivity.f36989d;
                        manageTripsActivity.fa(cVar5 != null ? (o) cVar5.f100618e.get(iIntValue2) : null);
                        return Unit.INSTANCE;
                    case 3:
                        int iIntValue3 = ((Integer) obj).intValue();
                        js0.c cVar6 = manageTripsActivity.f36990e;
                        manageTripsActivity.fa(cVar6 != null ? (o) cVar6.f100618e.get(iIntValue3) : null);
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var2 = (g3) obj;
                        ManageTripsActivity.a aVar2 = ManageTripsActivity.f36985h;
                        int i18 = ManageTripsActivity.b.f36993a[g3Var2.f35300a.ordinal()];
                        if (i18 == 1) {
                            manageTripsActivity.hideProgressOverlay();
                            List<o> list = (List) g3Var2.f35301b;
                            manageTripsActivity.ga(list);
                            if (s.g(manageTripsActivity.getIntent().getAction(), "ACTION_ADD_TRIP")) {
                                manageTripsActivity.ea();
                            } else if (list != null && list.size() == 0) {
                                manageTripsActivity.da();
                            }
                        } else if (i18 == 2) {
                            manageTripsActivity.hideProgressOverlay();
                            manageTripsActivity.displayFailedMessage();
                            js0.e eVar = manageTripsActivity.f36987b;
                            if (eVar != null) {
                                eVar.b();
                            }
                        } else {
                            if (i18 != 3) {
                                u0.r();
                                return null;
                            }
                            manageTripsActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        g gVar2 = g.UPCOMING;
        final int i15 = 2;
        this.f36989d = new js0.c(gVar2, new l(this) { // from class: is0.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageTripsActivity f94924b;

            {
                this.f94924b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                ManageTripsActivity manageTripsActivity = this.f94924b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        ManageTripsActivity.a aVar = ManageTripsActivity.f36985h;
                        int i17 = ManageTripsActivity.b.f36993a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            manageTripsActivity.hideProgressOverlay();
                            o13.p pVar = (o13.p) g3Var.f35301b;
                            Long l14 = pVar != null ? (Long) pVar.f128595b : null;
                            js0.g gVar3 = pVar != null ? (js0.g) pVar.f128594a : null;
                            int i18 = gVar3 == null ? -1 : ManageTripsActivity.b.f36994b[gVar3.ordinal()];
                            if (i18 == 1) {
                                js0.c cVar = manageTripsActivity.f36988c;
                                if (cVar != null) {
                                    cVar.A(l14);
                                }
                            } else if (i18 == 2) {
                                js0.c cVar2 = manageTripsActivity.f36989d;
                                if (cVar2 != null) {
                                    cVar2.A(l14);
                                }
                                manageTripsActivity.ga(manageTripsActivity.ca());
                            } else if (i18 == 3) {
                                js0.c cVar3 = manageTripsActivity.f36990e;
                                if (cVar3 != null) {
                                    cVar3.A(l14);
                                }
                                manageTripsActivity.ga(manageTripsActivity.ca());
                            }
                            if (manageTripsActivity.ca().isEmpty()) {
                                manageTripsActivity.da();
                            }
                        } else if (i17 == 2) {
                            manageTripsActivity.hideProgressOverlay();
                            manageTripsActivity.displayFailedMessage();
                        } else {
                            if (i17 != 3) {
                                u0.r();
                                return null;
                            }
                            manageTripsActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        js0.c cVar4 = manageTripsActivity.f36988c;
                        manageTripsActivity.fa(cVar4 != null ? (o) cVar4.f100618e.get(iIntValue) : null);
                        return Unit.INSTANCE;
                    case 2:
                        int iIntValue2 = ((Integer) obj).intValue();
                        js0.c cVar5 = manageTripsActivity.f36989d;
                        manageTripsActivity.fa(cVar5 != null ? (o) cVar5.f100618e.get(iIntValue2) : null);
                        return Unit.INSTANCE;
                    case 3:
                        int iIntValue3 = ((Integer) obj).intValue();
                        js0.c cVar6 = manageTripsActivity.f36990e;
                        manageTripsActivity.fa(cVar6 != null ? (o) cVar6.f100618e.get(iIntValue3) : null);
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var2 = (g3) obj;
                        ManageTripsActivity.a aVar2 = ManageTripsActivity.f36985h;
                        int i19 = ManageTripsActivity.b.f36993a[g3Var2.f35300a.ordinal()];
                        if (i19 == 1) {
                            manageTripsActivity.hideProgressOverlay();
                            List<o> list = (List) g3Var2.f35301b;
                            manageTripsActivity.ga(list);
                            if (s.g(manageTripsActivity.getIntent().getAction(), "ACTION_ADD_TRIP")) {
                                manageTripsActivity.ea();
                            } else if (list != null && list.size() == 0) {
                                manageTripsActivity.da();
                            }
                        } else if (i19 == 2) {
                            manageTripsActivity.hideProgressOverlay();
                            manageTripsActivity.displayFailedMessage();
                            js0.e eVar = manageTripsActivity.f36987b;
                            if (eVar != null) {
                                eVar.b();
                            }
                        } else {
                            if (i19 != 3) {
                                u0.r();
                                return null;
                            }
                            manageTripsActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        g gVar3 = g.FUTURE;
        final int i16 = 3;
        this.f36990e = new js0.c(gVar3, new l(this) { // from class: is0.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageTripsActivity f94924b;

            {
                this.f94924b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                ManageTripsActivity manageTripsActivity = this.f94924b;
                switch (i17) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        ManageTripsActivity.a aVar = ManageTripsActivity.f36985h;
                        int i18 = ManageTripsActivity.b.f36993a[g3Var.f35300a.ordinal()];
                        if (i18 == 1) {
                            manageTripsActivity.hideProgressOverlay();
                            o13.p pVar = (o13.p) g3Var.f35301b;
                            Long l14 = pVar != null ? (Long) pVar.f128595b : null;
                            js0.g gVar4 = pVar != null ? (js0.g) pVar.f128594a : null;
                            int i19 = gVar4 == null ? -1 : ManageTripsActivity.b.f36994b[gVar4.ordinal()];
                            if (i19 == 1) {
                                js0.c cVar = manageTripsActivity.f36988c;
                                if (cVar != null) {
                                    cVar.A(l14);
                                }
                            } else if (i19 == 2) {
                                js0.c cVar2 = manageTripsActivity.f36989d;
                                if (cVar2 != null) {
                                    cVar2.A(l14);
                                }
                                manageTripsActivity.ga(manageTripsActivity.ca());
                            } else if (i19 == 3) {
                                js0.c cVar3 = manageTripsActivity.f36990e;
                                if (cVar3 != null) {
                                    cVar3.A(l14);
                                }
                                manageTripsActivity.ga(manageTripsActivity.ca());
                            }
                            if (manageTripsActivity.ca().isEmpty()) {
                                manageTripsActivity.da();
                            }
                        } else if (i18 == 2) {
                            manageTripsActivity.hideProgressOverlay();
                            manageTripsActivity.displayFailedMessage();
                        } else {
                            if (i18 != 3) {
                                u0.r();
                                return null;
                            }
                            manageTripsActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        js0.c cVar4 = manageTripsActivity.f36988c;
                        manageTripsActivity.fa(cVar4 != null ? (o) cVar4.f100618e.get(iIntValue) : null);
                        return Unit.INSTANCE;
                    case 2:
                        int iIntValue2 = ((Integer) obj).intValue();
                        js0.c cVar5 = manageTripsActivity.f36989d;
                        manageTripsActivity.fa(cVar5 != null ? (o) cVar5.f100618e.get(iIntValue2) : null);
                        return Unit.INSTANCE;
                    case 3:
                        int iIntValue3 = ((Integer) obj).intValue();
                        js0.c cVar6 = manageTripsActivity.f36990e;
                        manageTripsActivity.fa(cVar6 != null ? (o) cVar6.f100618e.get(iIntValue3) : null);
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var2 = (g3) obj;
                        ManageTripsActivity.a aVar2 = ManageTripsActivity.f36985h;
                        int i110 = ManageTripsActivity.b.f36993a[g3Var2.f35300a.ordinal()];
                        if (i110 == 1) {
                            manageTripsActivity.hideProgressOverlay();
                            List<o> list = (List) g3Var2.f35301b;
                            manageTripsActivity.ga(list);
                            if (s.g(manageTripsActivity.getIntent().getAction(), "ACTION_ADD_TRIP")) {
                                manageTripsActivity.ea();
                            } else if (list != null && list.size() == 0) {
                                manageTripsActivity.da();
                            }
                        } else if (i110 == 2) {
                            manageTripsActivity.hideProgressOverlay();
                            manageTripsActivity.displayFailedMessage();
                            js0.e eVar = manageTripsActivity.f36987b;
                            if (eVar != null) {
                                eVar.b();
                            }
                        } else {
                            if (i110 != 3) {
                                u0.r();
                                return null;
                            }
                            manageTripsActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        View viewFindViewById = findViewById(R.id.root_view);
        viewFindViewById.getClass();
        final int i17 = 0;
        js0.e eVar = new js0.e(viewFindViewById, this.f36988c, this.f36989d, this.f36990e, new is0.f(this, 0), new ik1.c(this, i14));
        this.f36987b = eVar;
        View view2 = eVar.f100627g;
        k32.l lVar = new k32.l(view2);
        lVar.a(R.string.lbl_add_a_trip, null);
        k32.l.d(lVar, R.drawable.plus, Integer.valueOf(R.color.gcm_icon_primary_action), 20, 8);
        v22.e.q(view2);
        view2.setOnClickListener(new js0.d(eVar, i17));
        RecyclerView recyclerView = eVar.f100628h;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(eVar.f100621a);
        recyclerView.setVisibility(0);
        eVar.a(gVar).e(recyclerView);
        RecyclerView recyclerView2 = eVar.f100630j;
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        recyclerView2.setAdapter(eVar.f100622b);
        recyclerView2.setVisibility(0);
        eVar.a(gVar2).e(recyclerView2);
        RecyclerView recyclerView3 = eVar.f100632l;
        recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
        recyclerView3.setAdapter(eVar.f100623c);
        recyclerView3.setVisibility(0);
        eVar.a(gVar3).e(recyclerView3);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("EXTRA_TRIPS", o.class) : extras.getParcelableArrayList("EXTRA_TRIPS");
        } else {
            parcelableArrayList = null;
        }
        ga(parcelableArrayList);
        w1 w1Var = this.f36986a;
        if (parcelableArrayList == null) {
            i iVar = (i) w1Var.getValue();
            w9.a aVarA = v1.a(iVar);
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new is0.h(iVar, null), 2);
        }
        final int i18 = 4;
        ((i) w1Var.getValue()).f94934b.f(this, new c(new l(this) { // from class: is0.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageTripsActivity f94924b;

            {
                this.f94924b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i18;
                ManageTripsActivity manageTripsActivity = this.f94924b;
                switch (i19) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        ManageTripsActivity.a aVar = ManageTripsActivity.f36985h;
                        int i110 = ManageTripsActivity.b.f36993a[g3Var.f35300a.ordinal()];
                        if (i110 == 1) {
                            manageTripsActivity.hideProgressOverlay();
                            o13.p pVar = (o13.p) g3Var.f35301b;
                            Long l14 = pVar != null ? (Long) pVar.f128595b : null;
                            js0.g gVar4 = pVar != null ? (js0.g) pVar.f128594a : null;
                            int i111 = gVar4 == null ? -1 : ManageTripsActivity.b.f36994b[gVar4.ordinal()];
                            if (i111 == 1) {
                                js0.c cVar2 = manageTripsActivity.f36988c;
                                if (cVar2 != null) {
                                    cVar2.A(l14);
                                }
                            } else if (i111 == 2) {
                                js0.c cVar3 = manageTripsActivity.f36989d;
                                if (cVar3 != null) {
                                    cVar3.A(l14);
                                }
                                manageTripsActivity.ga(manageTripsActivity.ca());
                            } else if (i111 == 3) {
                                js0.c cVar4 = manageTripsActivity.f36990e;
                                if (cVar4 != null) {
                                    cVar4.A(l14);
                                }
                                manageTripsActivity.ga(manageTripsActivity.ca());
                            }
                            if (manageTripsActivity.ca().isEmpty()) {
                                manageTripsActivity.da();
                            }
                        } else if (i110 == 2) {
                            manageTripsActivity.hideProgressOverlay();
                            manageTripsActivity.displayFailedMessage();
                        } else {
                            if (i110 != 3) {
                                u0.r();
                                return null;
                            }
                            manageTripsActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        js0.c cVar5 = manageTripsActivity.f36988c;
                        manageTripsActivity.fa(cVar5 != null ? (o) cVar5.f100618e.get(iIntValue) : null);
                        return Unit.INSTANCE;
                    case 2:
                        int iIntValue2 = ((Integer) obj).intValue();
                        js0.c cVar6 = manageTripsActivity.f36989d;
                        manageTripsActivity.fa(cVar6 != null ? (o) cVar6.f100618e.get(iIntValue2) : null);
                        return Unit.INSTANCE;
                    case 3:
                        int iIntValue3 = ((Integer) obj).intValue();
                        js0.c cVar7 = manageTripsActivity.f36990e;
                        manageTripsActivity.fa(cVar7 != null ? (o) cVar7.f100618e.get(iIntValue3) : null);
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var2 = (g3) obj;
                        ManageTripsActivity.a aVar2 = ManageTripsActivity.f36985h;
                        int i112 = ManageTripsActivity.b.f36993a[g3Var2.f35300a.ordinal()];
                        if (i112 == 1) {
                            manageTripsActivity.hideProgressOverlay();
                            List<o> list = (List) g3Var2.f35301b;
                            manageTripsActivity.ga(list);
                            if (s.g(manageTripsActivity.getIntent().getAction(), "ACTION_ADD_TRIP")) {
                                manageTripsActivity.ea();
                            } else if (list != null && list.size() == 0) {
                                manageTripsActivity.da();
                            }
                        } else if (i112 == 2) {
                            manageTripsActivity.hideProgressOverlay();
                            manageTripsActivity.displayFailedMessage();
                            js0.e eVar2 = manageTripsActivity.f36987b;
                            if (eVar2 != null) {
                                eVar2.b();
                            }
                        } else {
                            if (i112 != 3) {
                                u0.r();
                                return null;
                            }
                            manageTripsActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ((i) w1Var.getValue()).f94935c.f(this, new c(new l(this) { // from class: is0.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageTripsActivity f94924b;

            {
                this.f94924b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i17;
                ManageTripsActivity manageTripsActivity = this.f94924b;
                switch (i19) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        ManageTripsActivity.a aVar = ManageTripsActivity.f36985h;
                        int i110 = ManageTripsActivity.b.f36993a[g3Var.f35300a.ordinal()];
                        if (i110 == 1) {
                            manageTripsActivity.hideProgressOverlay();
                            o13.p pVar = (o13.p) g3Var.f35301b;
                            Long l14 = pVar != null ? (Long) pVar.f128595b : null;
                            js0.g gVar4 = pVar != null ? (js0.g) pVar.f128594a : null;
                            int i111 = gVar4 == null ? -1 : ManageTripsActivity.b.f36994b[gVar4.ordinal()];
                            if (i111 == 1) {
                                js0.c cVar2 = manageTripsActivity.f36988c;
                                if (cVar2 != null) {
                                    cVar2.A(l14);
                                }
                            } else if (i111 == 2) {
                                js0.c cVar3 = manageTripsActivity.f36989d;
                                if (cVar3 != null) {
                                    cVar3.A(l14);
                                }
                                manageTripsActivity.ga(manageTripsActivity.ca());
                            } else if (i111 == 3) {
                                js0.c cVar4 = manageTripsActivity.f36990e;
                                if (cVar4 != null) {
                                    cVar4.A(l14);
                                }
                                manageTripsActivity.ga(manageTripsActivity.ca());
                            }
                            if (manageTripsActivity.ca().isEmpty()) {
                                manageTripsActivity.da();
                            }
                        } else if (i110 == 2) {
                            manageTripsActivity.hideProgressOverlay();
                            manageTripsActivity.displayFailedMessage();
                        } else {
                            if (i110 != 3) {
                                u0.r();
                                return null;
                            }
                            manageTripsActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        js0.c cVar5 = manageTripsActivity.f36988c;
                        manageTripsActivity.fa(cVar5 != null ? (o) cVar5.f100618e.get(iIntValue) : null);
                        return Unit.INSTANCE;
                    case 2:
                        int iIntValue2 = ((Integer) obj).intValue();
                        js0.c cVar6 = manageTripsActivity.f36989d;
                        manageTripsActivity.fa(cVar6 != null ? (o) cVar6.f100618e.get(iIntValue2) : null);
                        return Unit.INSTANCE;
                    case 3:
                        int iIntValue3 = ((Integer) obj).intValue();
                        js0.c cVar7 = manageTripsActivity.f36990e;
                        manageTripsActivity.fa(cVar7 != null ? (o) cVar7.f100618e.get(iIntValue3) : null);
                        return Unit.INSTANCE;
                    default:
                        g3 g3Var2 = (g3) obj;
                        ManageTripsActivity.a aVar2 = ManageTripsActivity.f36985h;
                        int i112 = ManageTripsActivity.b.f36993a[g3Var2.f35300a.ordinal()];
                        if (i112 == 1) {
                            manageTripsActivity.hideProgressOverlay();
                            List<o> list = (List) g3Var2.f35301b;
                            manageTripsActivity.ga(list);
                            if (s.g(manageTripsActivity.getIntent().getAction(), "ACTION_ADD_TRIP")) {
                                manageTripsActivity.ea();
                            } else if (list != null && list.size() == 0) {
                                manageTripsActivity.da();
                            }
                        } else if (i112 == 2) {
                            manageTripsActivity.hideProgressOverlay();
                            manageTripsActivity.displayFailedMessage();
                            js0.e eVar2 = manageTripsActivity.f36987b;
                            if (eVar2 != null) {
                                eVar2.b();
                            }
                        } else {
                            if (i112 != 3) {
                                u0.r();
                                return null;
                            }
                            manageTripsActivity.showProgressOverlay();
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd;
        if (menu == null || (menuItemAdd = menu.add(0, 100, 0, R.string.lbl_help)) == null) {
            return true;
        }
        menuItemAdd.setShowAsActionFlags(2);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 100) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.JET_LAG, null, null, 12);
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/edit/ManageTripsActivity$a;", "", "<init>", "()V", "", "ACTION_ADD_TRIP", "Ljava/lang/String;", "EXTRA_TRIPS", "EXTRA_FROM_CALENDAR", "", "MENU_ITEM_HELP", "I", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(JetLagActivity jetLagActivity, boolean z14, List list) {
            Intent intent = new Intent(jetLagActivity, (Class<?>) ManageTripsActivity.class);
            intent.putExtra("GCM_extra_top_navigation", z14);
            if (list != null) {
                intent.putParcelableArrayListExtra("EXTRA_TRIPS", new ArrayList<>(list));
            }
            intent.setFlags(335544320);
            return intent;
        }

        private a() {
        }
    }
}
