package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.r0;
import e23.l;
import fw.m;
import fw.p;
import gb1.r;
import gb1.s;
import java.util.List;
import o13.h;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import z10.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/PregnancyListActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "Lgb1/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyListActivity extends r0 implements gb1.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f40524f = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f40525e = new w1(s0.f105811a.b(s.class), new e(this), new d(this), new f(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40526a;

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
            f40526a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40527a;

        public c(l lVar) {
            lVar.getClass();
            this.f40527a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f40527a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40527a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f40528a;

        public d(g gVar) {
            this.f40528a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40528a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f40529a;

        public e(g gVar) {
            this.f40529a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40529a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f40531b;

        public f(e23.a aVar, g gVar) {
            this.f40530a = aVar;
            this.f40531b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40530a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40531b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        if (isTopNavigation()) {
            return "PREGNANCY";
        }
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.HEALTH_STATS;
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            String string = (String) (extras != null ? extras.get("GCM_deviceSettingsTitle") : null);
            if (string == null || string.length() <= 0) {
                string = getString(R.string.pregnancy_title);
                string.getClass();
            }
            initActionBar(string, 2);
        }
        w1 w1Var = this.f40525e;
        ((androidx.lifecycle.s0) ((s) w1Var.getValue()).f76708d.getValue()).f(this, new c(new g12.f(this, 11)));
        s sVar = (s) w1Var.getValue();
        m<List<db1.m>> mVarD = sVar.y4().d();
        if ((mVarD != null ? mVarD.f73769b : null) != p.LOADING) {
            sVar.y4().m(m.a.f(m.f73767e, null, null, 3));
            ge1.b.T(v1.a(sVar), null, null, new r(sVar, null), 3);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        finish();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (isTopNavigation()) {
            ca("PREGNANCY");
        }
    }

    @Override // gb1.c
    public final void u(db1.m mVar) {
        mVar.getClass();
        LocalDate endDate = mVar.getEndDate();
        if (endDate == null && (endDate = mVar.getDeliveryDate()) == null) {
            endDate = new LocalDate();
        }
        PregnancyDetailsActivity.a aVar = PregnancyDetailsActivity.f40489x;
        boolean zIsTopNavigation = isTopNavigation();
        DateTime dateTimeAtStartOfDay = endDate.toDateTimeAtStartOfDay();
        LocalDate endDate2 = mVar.getEndDate();
        if (endDate2 == null) {
            endDate2 = mVar.getDeliveryDate();
        }
        boolean z14 = endDate2 != null;
        aVar.getClass();
        startActivity(PregnancyDetailsActivity.a.a(this, false, zIsTopNavigation, dateTimeAtStartOfDay, z14, mVar, false));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/base/PregnancyListActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Activity activity, boolean z14, String str) {
            Intent intent = new Intent(activity, (Class<?>) PregnancyListActivity.class);
            intent.putExtra("GCM_extra_top_navigation", z14);
            intent.putExtra("GCM_deviceSettingsTitle", str);
            if (z14) {
                intent.addFlags(335544320);
            }
            if (activity != null) {
                activity.startActivity(intent);
            }
        }

        public static /* synthetic */ void b(a aVar, Activity activity, boolean z14) {
            aVar.getClass();
            a(activity, z14, null);
        }

        private a() {
        }
    }
}
