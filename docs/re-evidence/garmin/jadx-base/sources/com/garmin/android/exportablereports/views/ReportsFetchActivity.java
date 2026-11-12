package com.garmin.android.exportablereports.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import qa2.e;
import sa2.d;
import sa2.h;
import wa2.b;
import wa2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/exportablereports/views/ReportsFetchActivity;", "Lya2/a;", "Lua2/a;", "<init>", "()V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ReportsFetchActivity extends ya2.a implements ua2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f49843f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f49844g = new b("ReportsActivity", null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f49845d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f49846e = new d();

    @Override // ua2.a
    public final void I3(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f49846e.getClass();
        d.f158326a.getClass();
        ReportsViewActivity.f49847l.getClass();
        ReportsViewActivity.f49848m.getClass();
        Intent intent = new Intent(this, (Class<?>) ReportsViewActivity.class);
        intent.putExtra("REPORT_NAME_KEY", str3);
        intent.putExtra("REPORT_START_DATE_KEY", str);
        intent.putExtra("REPORT_END_DATE_KEY", str2);
        startActivity(intent);
        finish();
    }

    @Override // ua2.a
    public final void h3() {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        this.f49846e.getClass();
        d.a(supportFragmentManager);
    }

    @Override // ua2.a
    public final void l6() {
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        this.f49846e.getClass();
        d.f158326a.getClass();
        xa2.d.f189842f.getClass();
        xa2.d.f189843g.getClass();
        xa2.d dVar = new xa2.d();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.j(R.id.fragment_report_container, dVar, null, 1);
        aVar.d("ReportsDateSelectionActivity_FragmentTag");
        aVar.e();
    }

    @Override // ua2.a
    /* JADX INFO: renamed from: n0, reason: from getter */
    public final e getF49845d() {
        return this.f49845d;
    }

    @Override // b.g, android.app.Activity
    public final void onBackPressed() {
        boolean z14;
        f49844g.getClass();
        int iM = getSupportFragmentManager().M();
        Fragment fragmentF = getSupportFragmentManager().F(R.id.fragment_report_container);
        if (fragmentF == null || (!((z14 = fragmentF instanceof xa2.a)) && iM <= 1)) {
            finish();
            return;
        }
        if (!z14) {
            getSupportFragmentManager().Z();
            return;
        }
        xa2.a.f189830i.getClass();
        h hVar = ((xa2.a) fragmentF).f189831a;
        if (hVar == null) {
            s.m("reportsDownloadPresenter");
            throw null;
        }
        ua2.b bVar = hVar.f158336b;
        h.f158334i.getClass();
        if (!hVar.f158338d) {
            bVar.E1();
        } else {
            Context context = hVar.f158335a;
            bVar.T1(c.a.a(c.f183804a, context, context.getString(R.string.cancel_report_download_dialog_title), context.getString(R.string.cancel_report_download_dialog_message), new p(context.getString(R.string.cancel_cancellation_dialog), new sa2.e(hVar, 0)), new p(context.getString(R.string.confirm_cancellation_dialog), new sa2.e(hVar, 1)), SyslogConstants.LOG_LOCAL4));
        }
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f49844g.getClass();
        super.onCreate(bundle);
        setContentView(R.layout.er_fragment_container);
        String string = getString(R.string.download_report_title);
        string.getClass();
        P9(null, string);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        this.f49846e.getClass();
        e eVar = this.f49845d;
        eVar.getClass();
        d.f158326a.getClass();
        pa2.b.f136781a.getClass();
        if (pa2.b.a.a().f136776h != null && pa2.b.a.a().f136777i != null) {
            eVar.f143901a = pa2.b.a.a().f136776h;
            eVar.f143902b = pa2.b.a.a().f136777i;
            d.a(supportFragmentManager);
            return;
        }
        xa2.e.f189849g.getClass();
        xa2.e.f189850h.getClass();
        xa2.e eVar2 = new xa2.e();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.j(R.id.fragment_report_container, eVar2, null, 1);
        aVar.d("ReportsDateSelectionActivity_FragmentTag");
        aVar.e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/exportablereports/views/ReportsFetchActivity$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "", "FRAGMENT_TAG", "Ljava/lang/String;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
