package com.garmin.android.apps.connectmobile.ftp.reports.presentation.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.d;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import r53.p2;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ftp/reports/presentation/activity/FtpActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lyi0/c;", "selectedFtpSport", "Lyi0/b;", "selectedFtpReportType", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FtpActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35281a = new a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<yi0.c, Unit> {
        public b(Object obj) {
            super(1, obj, hj0.a.class, "setSelectedFtpSport", "setSelectedFtpSport(Lcom/garmin/android/apps/connectmobile/ftp/reports/domain/FtpSport;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(yi0.c cVar) {
            Object value;
            yi0.c cVar2 = cVar;
            cVar2.getClass();
            hj0.a aVar = (hj0.a) this.receiver;
            aVar.getClass();
            p2 p2Var = aVar.f83967e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, cVar2));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements l<yi0.b, Unit> {
        public c(Object obj) {
            super(1, obj, hj0.a.class, "setSelectedFtpReportType", "setSelectedFtpReportType(Lcom/garmin/android/apps/connectmobile/ftp/reports/domain/FtpReportType;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(yi0.b bVar) {
            Object value;
            yi0.b bVar2 = bVar;
            bVar2.getClass();
            hj0.a aVar = (hj0.a) this.receiver;
            aVar.getClass();
            p2 p2Var = aVar.f83968f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, bVar2));
            return Unit.INSTANCE;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("EXTRA_SELECTED_FTP_SPORT_KEY") : null;
            parcelable = (yi0.c) (parcelableExtra instanceof yi0.c ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("EXTRA_SELECTED_FTP_SPORT_KEY", yi0.c.class);
        }
        initComposeScreen(new e(46694174, true, new aj0.a(this, (yi0.c) parcelable, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ftp/reports/presentation/activity/FtpActivity$a;", "", "<init>", "()V", "", "EXTRA_SELECTED_FTP_SPORT_KEY", "Ljava/lang/String;", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
