package com.garmin.android.apps.connectmobile.incidentdetection;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import cq0.g;
import cq0.j;
import cq0.o;
import e23.l;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import lc.u0;
import o13.h;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/IncidentDetectionTermsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IncidentDetectionTermsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f36839e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pair<String, Boolean> f36841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f36842c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f36840a = new w1(s0.f105811a.b(o.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f36843d = m.b(new g(this, 1));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36844a;

        public b(l lVar) {
            lVar.getClass();
            this.f36844a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f36844a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36844a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36845a;

        public c(b.g gVar) {
            this.f36845a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f36845a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f36846a;

        public d(b.g gVar) {
            this.f36846a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f36846a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f36847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f36848b;

        public e(e23.a aVar, b.g gVar) {
            this.f36847a = aVar;
            this.f36848b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f36847a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f36848b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final hl.a ca() {
        return (hl.a) this.f36843d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ae  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z14 = false;
        if (getIntent().getExtras() != null) {
            if (getIntent().getBooleanExtra("GCM_OpenAssistanceTypeScreen", false)) {
                this.f36841b = new Pair<>("GCM_OpenAssistanceTypeScreen", Boolean.TRUE);
            } else if (getIntent().getBooleanExtra("GCM_open_myinfo_Screen", false)) {
                this.f36841b = new Pair<>("GCM_open_myinfo_Screen", Boolean.TRUE);
            } else if (getIntent().getBooleanExtra("GCM_open_existing_assistance", false)) {
                this.f36841b = new Pair<>("GCM_open_existing_assistance", Boolean.TRUE);
            }
            this.f36842c = getIntent().getBundleExtra("GCM_extra_activity_extras");
        }
        hl.a aVarCa = ca();
        if (s.g(aVarCa, hl.a.c.f84256b)) {
            eq0.a.f65038b.a().getClass();
            Set<String> stringSet = eq0.a.P().getStringSet(eq0.a.O(R.string.key_incident_detection_config_first_time), null);
            if (stringSet == null || stringSet.isEmpty()) {
                z14 = true;
            } else {
                Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                obj.getClass();
                String userDisplayName = ((f12.b) obj).getUserDisplayName();
                Locale locale = Locale.getDefault();
                locale.getClass();
                String lowerCase = userDisplayName.toLowerCase(locale);
                lowerCase.getClass();
                if (!stringSet.contains(lowerCase)) {
                    z14 = true;
                }
            }
        } else {
            if (!(aVarCa instanceof hl.a.b)) {
                u0.r();
                return;
            }
            eq0.a aVarA = eq0.a.f65038b.a();
            hl.a aVarCa2 = ca();
            aVarCa2.getClass();
            long j8 = ((hl.a.b) aVarCa2).f84252b;
            hl.a aVarCa3 = ca();
            aVarCa3.getClass();
            String str = ((hl.a.b) aVarCa3).f84253c;
            if (str == null) {
                str = "";
            }
            aVarA.getClass();
            SharedPreferences sharedPreferencesP = eq0.a.P();
            String string = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a().getString(R.string.key_child_incident_detection_config_first_time, Arrays.copyOf(new Object[]{Long.valueOf(j8)}, 1));
            string.getClass();
            Set<String> stringSet2 = sharedPreferencesP.getStringSet(string, null);
            if (stringSet2 == null || stringSet2.isEmpty()) {
                z14 = true;
            } else {
                Locale locale2 = Locale.getDefault();
                locale2.getClass();
                String lowerCase2 = str.toLowerCase(locale2);
                lowerCase2.getClass();
                if (!stringSet2.contains(lowerCase2)) {
                    z14 = true;
                }
            }
        }
        boolean z15 = ca() instanceof hl.a.b;
        w1 w1Var = this.f36840a;
        if (z15) {
            o oVar = (o) w1Var.getValue();
            hl.a aVarCa4 = ca();
            aVarCa4.getClass();
            ge1.b.T(v1.a(oVar), null, null, new cq0.m(((hl.a.b) aVarCa4).f84252b, null), 3);
        }
        if (!z14) {
            ((j) KoinJavaComponent.get$default(j.class, null, null, 6, null)).i(this, this.f36841b, this.f36842c, ca());
            finish();
        } else {
            setContentView(R.layout.gcm_incident_detection_terms_of_use);
            initActionBar(true, getString(R.string.incident_detection_notice));
            showProgressOverlay();
            androidx.lifecycle.m.a(v1.a((o) w1Var.getValue()).f183565a, new cq0.n(null), 2).f(this, new b(new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 7)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/IncidentDetectionTermsActivity$a;", "", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
