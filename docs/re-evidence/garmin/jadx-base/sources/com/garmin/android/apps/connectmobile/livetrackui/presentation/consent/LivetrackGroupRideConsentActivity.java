package com.garmin.android.apps.connectmobile.livetrackui.presentation.consent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISmartProto;
import g.h;
import ge1.b;
import gt2.c;
import hk0.q;
import hk0.r;
import kd0.m;
import kd0.t2;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q92.x;
import tr2.y;
import u53.d;
import z10.d2;
import z10.f2;
import zb0.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetrackui/presentation/consent/LivetrackGroupRideConsentActivity;", "Lcom/garmin/android/apps/connectmobile/livetrackui/presentation/consent/a;", "<init>", "()V", "a", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LivetrackGroupRideConsentActivity extends com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f38667k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f38668l = "LivetrackGroupRideConsentActivity";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38671i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f38669g = c.b(a2.GROUPRIDE.f28756a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f38670h = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.c<Intent> f38672j = registerForActivityResult(new h(), new y(this, 10));

    @Override // com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a
    public final int da() {
        return R.string.lbl_data_privacy;
    }

    @Override // com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a
    public final void fa(x xVar) {
        xVar.getClass();
        this.f38675a.j().j(this.f38670h);
    }

    @Override // com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a
    public final void ga() {
        q qVar;
        this.f38669g.debug(f38668l + " - LiveTrack/GroupRide Consent has been granted");
        this.f38672j.a(new Intent(this, (Class<?>) LivetrackGroupRideEnabledActivity.class), null);
        t2 t2VarJ = this.f38675a.j();
        long j8 = this.f38670h;
        t2VarJ.getClass();
        if (j8 == -1 || (qVar = (q) k.b(q.class, j8)) == null) {
            return;
        }
        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDILiveTrackExtension.liveTrackService, GDILiveTrackProto.LiveTrackService.newBuilder().setConsentNotification(GDILiveTrackProto.ConsentNotification.newBuilder().setConsentPageAction(GDILiveTrackProto.ConsentNotification.ConsentPageAction.GRANTED).build()).build()).build();
        smartBuild.getClass();
        d dVar = qVar.f84086d;
        if (dVar != null) {
            b.T(dVar, null, null, new r(qVar, smartBuild, null), 3);
        } else {
            s.m("coroutineScope");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        this.f38669g.debug(f38668l + " - LiveTrack/GroupRide Consent has been cancelled");
        this.f38675a.j().j(this.f38670h);
        if (this.f38671i) {
            finish();
            return;
        }
        bv.b.f21239a.getClass();
        ((m) bv.b.a()).a(this, new Bundle(), 268468224);
    }

    @Override // com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f38670h = intent != null ? intent.getLongExtra("GCM_deviceUnitID", -1L) : -1L;
        Intent intent2 = getIntent();
        this.f38671i = intent2 != null ? intent2.getBooleanExtra("GCM_openedFromOnboarding", false) : false;
        d2 d2VarCa = ca();
        q92.d dVar = q92.d.LIVETRACK_GROUP_RIDE;
        dVar.getClass();
        b.T(v1.a(d2VarCa), null, null, new f2(dVar, d2VarCa, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.a, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/livetrackui/presentation/consent/LivetrackGroupRideConsentActivity$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, boolean z14) {
            Intent intentD = sn.a.d(context, context, LivetrackGroupRideConsentActivity.class);
            intentD.putExtra("GCM_deviceUnitID", j8);
            intentD.putExtra("GCM_openedFromOnboarding", z14);
            if (!z14) {
                intentD.setFlags(268468224);
            }
            return intentD;
        }

        private a() {
        }
    }
}
