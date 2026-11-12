package com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import az1.k;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.fragments.EventListFragment;
import fw.p;
import g.h;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import tr2.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/ui/dashboard/EventDashBoardActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lzy1/b;", "<init>", "()V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventDashBoardActivity extends com.garmin.android.apps.connectmobile.c implements zy1.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f45898f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zy1.a f45900b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zy1.a f45902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zy1.a f45903e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f45899a = new w1(s0.f105811a.b(zy1.d.class), new c(this), new b(this), new d(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f45901c = registerForActivityResult(new h(), new y(this, 27));

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f45905b;

        static {
            int[] iArr = new int[zy1.c.values().length];
            try {
                iArr[zy1.c.NO_EVENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f45904a = iArr;
            int[] iArr2 = new int[p.values().length];
            try {
                iArr2[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f45905b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45906a;

        public b(g gVar) {
            this.f45906a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45906a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45907a;

        public c(g gVar) {
            this.f45907a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45907a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45909b;

        public d(e23.a aVar, g gVar) {
            this.f45908a = aVar;
            this.f45909b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45908a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45909b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [zy1.a] */
    /* JADX WARN: Type inference failed for: r0v4, types: [zy1.a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [zy1.a] */
    public EventDashBoardActivity() {
        final int i14 = 0;
        this.f45900b = new z0(this) { // from class: zy1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventDashBoardActivity f207462b;

            {
                this.f207462b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                EventDashBoardActivity eventDashBoardActivity = this.f207462b;
                switch (i15) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        int i16 = EventDashBoardActivity.f45898f;
                        if (bool != null) {
                            d dVarCa = eventDashBoardActivity.ca();
                            ge1.b.T(v1.a(dVarCa), null, null, new g(dVarCa, null), 3);
                            eventDashBoardActivity.ca().c5(Boolean.FALSE);
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        int i17 = EventDashBoardActivity.f45898f;
                        str.getClass();
                        switch (str.hashCode()) {
                            case -174634659:
                                if (str.equals("EventsDashBoardGenesisFragment")) {
                                    v supportFragmentManager = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager.getClass();
                                    k.f13778c.getClass();
                                    lz1.e.a(supportFragmentManager, new k(), str, false);
                                    break;
                                }
                                break;
                            case 860448936:
                                if (str.equals("EventListFragment")) {
                                    v supportFragmentManager2 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager2.getClass();
                                    EventListFragment.f45910l.getClass();
                                    EventListFragment eventListFragment = new EventListFragment();
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("GCM_extra_is_past_events", true);
                                    eventListFragment.setArguments(bundle);
                                    lz1.e.a(supportFragmentManager2, eventListFragment, str, true);
                                    break;
                                }
                                break;
                            case 1423827283:
                                if (str.equals("EventChangePriorityConfirmationFragment")) {
                                    v supportFragmentManager3 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager3.getClass();
                                    az1.c.f13708f.getClass();
                                    lz1.e.a(supportFragmentManager3, new az1.c(), str, true);
                                    break;
                                }
                                break;
                            case 1577014540:
                                if (str.equals("EventDashBoardPriorityListFragment")) {
                                    v supportFragmentManager4 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager4.getClass();
                                    az1.h.f13755m.getClass();
                                    lz1.e.a(supportFragmentManager4, new az1.h(), str, true);
                                    break;
                                }
                                break;
                            case 2099793290:
                                if (str.equals("EventDashBoardFragment")) {
                                    v supportFragmentManager5 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager5.getClass();
                                    az1.e.f13722x.getClass();
                                    Bundle bundle2 = new Bundle();
                                    az1.e eVar = new az1.e();
                                    eVar.setArguments(bundle2);
                                    lz1.e.a(supportFragmentManager5, eVar, str, true);
                                    break;
                                }
                                break;
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        int i18 = EventDashBoardActivity.f45898f;
                        g3Var.getClass();
                        int i19 = EventDashBoardActivity.a.f45905b[g3Var.f35300a.ordinal()];
                        if (i19 == 1) {
                            eventDashBoardActivity.showProgressOverlay();
                        } else if (i19 == 2) {
                            eventDashBoardActivity.hideProgressOverlay();
                            bz1.b bVar = (bz1.b) g3Var.f35301b;
                            c cVar = bVar != null ? bVar.f22289a : null;
                            if ((cVar == null ? -1 : EventDashBoardActivity.a.f45904a[cVar.ordinal()]) == 1) {
                                eventDashBoardActivity.ca().a5().m("EventsDashBoardGenesisFragment");
                            } else if (!s.g(eventDashBoardActivity.ca().Y.d(), "EventListFragment")) {
                                d dVarCa2 = eventDashBoardActivity.ca();
                                if (!s.g(dVarCa2.a5().d(), "EventDashBoardFragment")) {
                                    dVarCa2.a5().m("EventDashBoardFragment");
                                }
                            }
                        } else if (i19 != 3) {
                            u0.r();
                        } else {
                            eventDashBoardActivity.hideProgressOverlay();
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f45902d = new z0(this) { // from class: zy1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventDashBoardActivity f207462b;

            {
                this.f207462b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                EventDashBoardActivity eventDashBoardActivity = this.f207462b;
                switch (i16) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        int i17 = EventDashBoardActivity.f45898f;
                        if (bool != null) {
                            d dVarCa = eventDashBoardActivity.ca();
                            ge1.b.T(v1.a(dVarCa), null, null, new g(dVarCa, null), 3);
                            eventDashBoardActivity.ca().c5(Boolean.FALSE);
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        int i18 = EventDashBoardActivity.f45898f;
                        str.getClass();
                        switch (str.hashCode()) {
                            case -174634659:
                                if (str.equals("EventsDashBoardGenesisFragment")) {
                                    v supportFragmentManager = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager.getClass();
                                    k.f13778c.getClass();
                                    lz1.e.a(supportFragmentManager, new k(), str, false);
                                    break;
                                }
                                break;
                            case 860448936:
                                if (str.equals("EventListFragment")) {
                                    v supportFragmentManager2 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager2.getClass();
                                    EventListFragment.f45910l.getClass();
                                    EventListFragment eventListFragment = new EventListFragment();
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("GCM_extra_is_past_events", true);
                                    eventListFragment.setArguments(bundle);
                                    lz1.e.a(supportFragmentManager2, eventListFragment, str, true);
                                    break;
                                }
                                break;
                            case 1423827283:
                                if (str.equals("EventChangePriorityConfirmationFragment")) {
                                    v supportFragmentManager3 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager3.getClass();
                                    az1.c.f13708f.getClass();
                                    lz1.e.a(supportFragmentManager3, new az1.c(), str, true);
                                    break;
                                }
                                break;
                            case 1577014540:
                                if (str.equals("EventDashBoardPriorityListFragment")) {
                                    v supportFragmentManager4 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager4.getClass();
                                    az1.h.f13755m.getClass();
                                    lz1.e.a(supportFragmentManager4, new az1.h(), str, true);
                                    break;
                                }
                                break;
                            case 2099793290:
                                if (str.equals("EventDashBoardFragment")) {
                                    v supportFragmentManager5 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager5.getClass();
                                    az1.e.f13722x.getClass();
                                    Bundle bundle2 = new Bundle();
                                    az1.e eVar = new az1.e();
                                    eVar.setArguments(bundle2);
                                    lz1.e.a(supportFragmentManager5, eVar, str, true);
                                    break;
                                }
                                break;
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        int i19 = EventDashBoardActivity.f45898f;
                        g3Var.getClass();
                        int i110 = EventDashBoardActivity.a.f45905b[g3Var.f35300a.ordinal()];
                        if (i110 == 1) {
                            eventDashBoardActivity.showProgressOverlay();
                        } else if (i110 == 2) {
                            eventDashBoardActivity.hideProgressOverlay();
                            bz1.b bVar = (bz1.b) g3Var.f35301b;
                            c cVar = bVar != null ? bVar.f22289a : null;
                            if ((cVar == null ? -1 : EventDashBoardActivity.a.f45904a[cVar.ordinal()]) == 1) {
                                eventDashBoardActivity.ca().a5().m("EventsDashBoardGenesisFragment");
                            } else if (!s.g(eventDashBoardActivity.ca().Y.d(), "EventListFragment")) {
                                d dVarCa2 = eventDashBoardActivity.ca();
                                if (!s.g(dVarCa2.a5().d(), "EventDashBoardFragment")) {
                                    dVarCa2.a5().m("EventDashBoardFragment");
                                }
                            }
                        } else if (i110 != 3) {
                            u0.r();
                        } else {
                            eventDashBoardActivity.hideProgressOverlay();
                        }
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f45903e = new z0(this) { // from class: zy1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EventDashBoardActivity f207462b;

            {
                this.f207462b = this;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i17 = i16;
                EventDashBoardActivity eventDashBoardActivity = this.f207462b;
                switch (i17) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        int i18 = EventDashBoardActivity.f45898f;
                        if (bool != null) {
                            d dVarCa = eventDashBoardActivity.ca();
                            ge1.b.T(v1.a(dVarCa), null, null, new g(dVarCa, null), 3);
                            eventDashBoardActivity.ca().c5(Boolean.FALSE);
                        }
                        break;
                    case 1:
                        String str = (String) obj;
                        int i19 = EventDashBoardActivity.f45898f;
                        str.getClass();
                        switch (str.hashCode()) {
                            case -174634659:
                                if (str.equals("EventsDashBoardGenesisFragment")) {
                                    v supportFragmentManager = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager.getClass();
                                    k.f13778c.getClass();
                                    lz1.e.a(supportFragmentManager, new k(), str, false);
                                    break;
                                }
                                break;
                            case 860448936:
                                if (str.equals("EventListFragment")) {
                                    v supportFragmentManager2 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager2.getClass();
                                    EventListFragment.f45910l.getClass();
                                    EventListFragment eventListFragment = new EventListFragment();
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("GCM_extra_is_past_events", true);
                                    eventListFragment.setArguments(bundle);
                                    lz1.e.a(supportFragmentManager2, eventListFragment, str, true);
                                    break;
                                }
                                break;
                            case 1423827283:
                                if (str.equals("EventChangePriorityConfirmationFragment")) {
                                    v supportFragmentManager3 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager3.getClass();
                                    az1.c.f13708f.getClass();
                                    lz1.e.a(supportFragmentManager3, new az1.c(), str, true);
                                    break;
                                }
                                break;
                            case 1577014540:
                                if (str.equals("EventDashBoardPriorityListFragment")) {
                                    v supportFragmentManager4 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager4.getClass();
                                    az1.h.f13755m.getClass();
                                    lz1.e.a(supportFragmentManager4, new az1.h(), str, true);
                                    break;
                                }
                                break;
                            case 2099793290:
                                if (str.equals("EventDashBoardFragment")) {
                                    v supportFragmentManager5 = eventDashBoardActivity.getSupportFragmentManager();
                                    supportFragmentManager5.getClass();
                                    az1.e.f13722x.getClass();
                                    Bundle bundle2 = new Bundle();
                                    az1.e eVar = new az1.e();
                                    eVar.setArguments(bundle2);
                                    lz1.e.a(supportFragmentManager5, eVar, str, true);
                                    break;
                                }
                                break;
                        }
                        break;
                    default:
                        g3 g3Var = (g3) obj;
                        int i110 = EventDashBoardActivity.f45898f;
                        g3Var.getClass();
                        int i111 = EventDashBoardActivity.a.f45905b[g3Var.f35300a.ordinal()];
                        if (i111 == 1) {
                            eventDashBoardActivity.showProgressOverlay();
                        } else if (i111 == 2) {
                            eventDashBoardActivity.hideProgressOverlay();
                            bz1.b bVar = (bz1.b) g3Var.f35301b;
                            c cVar = bVar != null ? bVar.f22289a : null;
                            if ((cVar == null ? -1 : EventDashBoardActivity.a.f45904a[cVar.ordinal()]) == 1) {
                                eventDashBoardActivity.ca().a5().m("EventsDashBoardGenesisFragment");
                            } else if (!s.g(eventDashBoardActivity.ca().Y.d(), "EventListFragment")) {
                                d dVarCa2 = eventDashBoardActivity.ca();
                                if (!s.g(dVarCa2.a5().d(), "EventDashBoardFragment")) {
                                    dVarCa2.a5().m("EventDashBoardFragment");
                                }
                            }
                        } else if (i111 != 3) {
                            u0.r();
                        } else {
                            eventDashBoardActivity.hideProgressOverlay();
                        }
                        break;
                }
            }
        };
    }

    @Override // zy1.b
    public final void N7(Intent intent) {
        this.f45901c.a(intent, null);
    }

    public final zy1.d ca() {
        return (zy1.d) this.f45899a.getValue();
    }

    @Override // zy1.b
    public final void g(int i14, String str) {
        updateActionBar(str, 2);
    }

    @Override // zy1.b
    public final void i0(boolean z14) {
        if (z14) {
            showActionBar();
        } else {
            hideActionBar();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        initActionBar(true, getString(R.string.my_events));
        ca().Y.f(this, this.f45902d);
        ca().K0.f(this, this.f45900b);
        ca().f207469k0.f(this, this.f45903e);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }
}
