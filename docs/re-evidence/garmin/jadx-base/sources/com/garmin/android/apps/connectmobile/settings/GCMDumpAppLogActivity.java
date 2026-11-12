package com.garmin.android.apps.connectmobile.settings;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import gg1.o;
import gg1.p;
import j83.l;
import java.io.File;
import ng1.c1;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import pi1.h;
import ro0.u;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/GCMDumpAppLogActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMDumpAppLogActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f41533b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41534a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, GCMDumpAppLogActivity.class, "createLogsZip", "createLogsZip()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            GCMDumpAppLogActivity.ca((GCMDumpAppLogActivity) this.receiver);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f41533b = gt2.b.f79005a.h("GCMDumpAppLogActivity");
    }

    public static final void ca(GCMDumpAppLogActivity gCMDumpAppLogActivity) {
        gCMDumpAppLogActivity.showProgressOverlay();
        u uVar = u.f153887a;
        String str = gCMDumpAppLogActivity.f41534a;
        uVar.getClass();
        File fileA = pi1.b.a(gCMDumpAppLogActivity, "gcm_folder");
        h hVar = new h();
        hVar.f137864a = fileA;
        hVar.f137865b = str;
        l.a(new a73.h(hVar.b(gCMDumpAppLogActivity), 9)).d(Schedulers.io()).b(l83.a.a()).c(new o(gCMDumpAppLogActivity));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView();
        Uri data = getIntent().getData();
        if (data == null) {
            finish();
            return;
        }
        s3.f23252a.getClass();
        if (s3.a("ROLE_MBTESTER")) {
            String string = data.toString();
            string.getClass();
            if (d53.u.y(string, "connect://dump/app-diagnostics", false)) {
                String queryParameter = data.getQueryParameter("filename");
                if (queryParameter == null) {
                    queryParameter = "gcm_log";
                }
                this.f41534a = queryParameter;
                j22.b.f96736a.getClass();
                if (!j22.b.d()) {
                    u.f153887a.getClass();
                    j22.a aVar = j22.a.f96722k;
                    if (j22.b.C(this, aVar)) {
                        new androidx.appcompat.app.e.a(this).setTitle("").setMessage(j22.b.f(aVar)).setCancelable(false).setNeutralButton(R.string.lbl_ok, new c1(this, 24)).show();
                        return;
                    } else {
                        j22.b.x(this, 1, aVar);
                        return;
                    }
                }
                u uVar = u.f153887a;
                p pVar = new p(this);
                uVar.getClass();
                if (u.a(this)) {
                    pVar.invoke();
                    return;
                } else {
                    finish();
                    Unit unit = Unit.INSTANCE;
                    return;
                }
            }
        }
        finish();
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i14, strArr, iArr);
        j22.b.f96736a.getClass();
        if (!j22.b.E(iArr)) {
            Toast.makeText(this, j22.b.f(j22.a.f96722k), 0).show();
            finish();
            return;
        }
        u uVar = u.f153887a;
        b bVar = new b(this);
        uVar.getClass();
        if (u.a(this)) {
            bVar.invoke();
        } else {
            finish();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/GCMDumpAppLogActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "", "DEFAULT_FILENAME", "Ljava/lang/String;", "KEY_FILENAME", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
