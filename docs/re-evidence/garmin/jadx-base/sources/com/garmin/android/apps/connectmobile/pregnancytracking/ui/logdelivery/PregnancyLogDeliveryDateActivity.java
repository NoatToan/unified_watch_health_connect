package com.garmin.android.apps.connectmobile.pregnancytracking.ui.logdelivery;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import fw.p;
import o13.h;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import rb1.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/logdelivery/PregnancyLogDeliveryDateActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyLogDeliveryDateActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f40875e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f40876a = m.b(new j21.f(15));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f40877b = new w1(s0.f105811a.b(g.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatButton f40878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppCompatButton f40879d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40880a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40880a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40881a;

        public c(l lVar) {
            lVar.getClass();
            this.f40881a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f40881a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40881a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f40882a;

        public d(b.g gVar) {
            this.f40882a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40882a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f40883a;

        public e(b.g gVar) {
            this.f40883a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40883a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f40885b;

        public f(e23.a aVar, b.g gVar) {
            this.f40884a = aVar;
            this.f40885b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40884a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40885b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public PregnancyLogDeliveryDateActivity() {
        eb1.e.a aVar = eb1.e.f63669a;
    }

    public final void ca() {
        ea().debug("configureCalendarWithAnimationPage: ");
        setTitle(getString(R.string.pregnancy_delivery_date));
        AppCompatButton appCompatButton = this.f40878c;
        if (appCompatButton == null) {
            s.m("mNextTextView");
            throw null;
        }
        appCompatButton.setText(getString(R.string.lbl_next));
        appCompatButton.setOnClickListener(new jb1.a(this, 0));
        AppCompatButton appCompatButton2 = this.f40879d;
        if (appCompatButton2 == null) {
            s.m("mExperienceLossTextView");
            throw null;
        }
        appCompatButton2.setText(getString(R.string.pregnancy_experienced_a_loss));
        appCompatButton2.setVisibility(0);
        appCompatButton2.setOnClickListener(new jb1.a(this, 1));
        g gVarFa = fa();
        eb1.d dVar = eb1.d.HAD_BABY;
        dVar.getClass();
        gVarFa.f151621b = dVar;
    }

    public final void da() {
        ea().debug("configureCalendarWithNoAnimationPage: ");
        setTitle(getString(R.string.pregnancy_stop_tracking));
        AppCompatButton appCompatButton = this.f40878c;
        if (appCompatButton == null) {
            s.m("mNextTextView");
            throw null;
        }
        appCompatButton.setText(getString(R.string.lbl_next));
        appCompatButton.setOnClickListener(new jb1.a(this, 2));
        AppCompatButton appCompatButton2 = this.f40879d;
        if (appCompatButton2 == null) {
            s.m("mExperienceLossTextView");
            throw null;
        }
        appCompatButton2.setText(getString(R.string.lbl_skip_button));
        appCompatButton2.setVisibility(0);
        appCompatButton2.setOnClickListener(new jb1.a(this, 3));
        g gVarFa = fa();
        eb1.d dVar = eb1.d.EXPERIENCED_LOSS;
        dVar.getClass();
        gVarFa.f151621b = dVar;
    }

    public final Logger ea() {
        return (Logger) this.f40876a.getValue();
    }

    public final g fa() {
        return (g) this.f40877b.getValue();
    }

    public final void ga(rb1.e eVar, String str) {
        ea().debug("replaceFragment: ");
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.d(str);
        aVar.l(R.id.log_delivery_date_container, eVar, null);
        aVar.e();
    }

    public final void ha(boolean z14) {
        wr.g.y("startCalendarFragment: includeAnimation=", z14, ea());
        ga(new rb1.f(z14 ? new o13.p(0, getString(R.string.pregnancy_baby_born_day)) : new o13.p(8, getString(R.string.pregnancy_approximate_end_date))), "PregnancyStopTrackingCalendarFragment");
    }

    public final void ia() {
        ea().debug("configureNotesPage: ");
        ga(new rb1.a(), "PregnancyNotesFragment");
        AppCompatButton appCompatButton = this.f40878c;
        if (appCompatButton == null) {
            s.m("mNextTextView");
            throw null;
        }
        appCompatButton.setText(getString(R.string.lbl_finish));
        appCompatButton.setOnClickListener(new jb1.a(this, 4));
        AppCompatButton appCompatButton2 = this.f40879d;
        if (appCompatButton2 == null) {
            s.m("mExperienceLossTextView");
            throw null;
        }
        appCompatButton2.setVisibility(8);
        eb1.e.a aVar = eb1.e.f63669a;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        int iM = getSupportFragmentManager().M();
        if (iM == 0) {
            ea().debug("onBackPressed: finishing");
            finish();
        } else if (iM == 1) {
            ca();
        } else {
            if (iM != 2) {
                return;
            }
            da();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pregnancy_log_delivery_date);
        initActionBar(R.string.pregnancy_delivery_date, 2);
        View viewFindViewById = findViewById(R.id.log_delivery_date_next_button);
        viewFindViewById.getClass();
        this.f40878c = (AppCompatButton) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.log_delivery_date_experienced_loss_button);
        viewFindViewById2.getClass();
        this.f40879d = (AppCompatButton) viewFindViewById2;
        if (fa().f151620a == null) {
            ea().debug("Null pregnancySnapshotDTO, starting load");
            fa().A4().f(this, new c(new jb1.b(this, 0)));
            fa().B4();
        } else {
            ea().debug("Non-null pregnancySnapshotDTO, starting fragment");
            ha(true);
            ca();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/logdelivery/PregnancyLogDeliveryDateActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
