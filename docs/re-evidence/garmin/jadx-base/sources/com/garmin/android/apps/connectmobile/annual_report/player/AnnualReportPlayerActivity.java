package com.garmin.android.apps.connectmobile.annual_report.player;

import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import au.f;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import yt.h;
import yt.n;
import yt.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/annual_report/player/AnnualReportPlayerActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AnnualReportPlayerActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30170b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f30171a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/annual_report/player/AnnualReportPlayerActivity$b", "Lyt/s;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements s {
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30172a;

        public c(g gVar) {
            this.f30172a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f30172a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30173a;

        public d(g gVar) {
            this.f30173a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f30173a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f30174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f30175b;

        public e(e23.a aVar, g gVar) {
            this.f30174a = aVar;
            this.f30175b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f30174a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f30175b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public AnnualReportPlayerActivity() {
        new w1(s0.f105811a.b(n.class), new d(this), new c(this), new e(null, this));
        this.f30171a = new b();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_annual_report_player);
        getWindow().addFlags(128);
        setToolbarVisibility(4);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f7250r = true;
        aVar.l(R.id.annual_report_player_fragment_container_view, new h(), null);
        aVar.e();
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        f.f12845a.getClass();
        f.f12846b = null;
        super.onPause();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        Window window;
        super.onResume();
        f.f12845a.getClass();
        b bVar = this.f30171a;
        bVar.getClass();
        f.f12846b = bVar;
        if (((mt.a) KoinJavaComponent.get$default(mt.a.class, null, null, 6, null)).c() || (window = getWindow()) == null) {
            return;
        }
        window.setFlags(8192, 8192);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(8192);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/annual_report/player/AnnualReportPlayerActivity$a;", "", "<init>", "()V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
