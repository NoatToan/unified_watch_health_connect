package com.garmin.android.apps.connectmobile.bikesensors;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.p2;
import com.garmin.android.gfdi.framework.DeviceManager;
import com.google.common.base.Ascii;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Timer;
import ma2.h;
import ml2.g;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import pj2.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/CalibrationSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/p2;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CalibrationSettingsActivity extends com.garmin.android.apps.connectmobile.c implements p2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f30766m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f30767n = {Ascii.FF};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Button f30768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f30769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f30770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f30771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tv.d f30772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f30774g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Timer f30777j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f30775h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f30776i = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f30778k = new g(this, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final iz1.g f30779l = new iz1.g(this, 21);

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/bikesensors/CalibrationSettingsActivity$b", "Lcom/google/common/util/concurrent/FutureCallback;", "Ljava/lang/Void;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements FutureCallback<Void> {
        public b() {
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th3) {
            th3.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "CalibrationSettingsActivity", "Calibration characteristic could not be written.");
            a aVar2 = CalibrationSettingsActivity.f30766m;
            CalibrationSettingsActivity calibrationSettingsActivity = CalibrationSettingsActivity.this;
            calibrationSettingsActivity.ga();
            calibrationSettingsActivity.runOnUiThread(new tv.a(calibrationSettingsActivity, 3));
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(Void r14) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "CalibrationSettingsActivity", "Calibration characteristic written with success. Waiting for the device to send us back the calibration result.");
        }
    }

    public final void ca() {
        if (!((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).a(this.f30775h)) {
            ea();
            return;
        }
        hideProgressOverlay();
        setTitle(R.string.lbl_calibration_failed);
        TextView textView = this.f30769b;
        if (textView == null) {
            s.m("calibrationStatusTextView");
            throw null;
        }
        textView.setVisibility(0);
        Button button = this.f30768a;
        if (button == null) {
            s.m("calibrateButton");
            throw null;
        }
        button.setVisibility(0);
        TextView textView2 = this.f30771d;
        if (textView2 == null) {
            s.m("torqueLabelTextView");
            throw null;
        }
        textView2.setVisibility(4);
        TextView textView3 = this.f30770c;
        if (textView3 == null) {
            s.m("torqueValueTextView");
            throw null;
        }
        textView3.setVisibility(4);
        TextView textView4 = this.f30769b;
        if (textView4 == null) {
            s.m("calibrationStatusTextView");
            throw null;
        }
        textView4.setText(getString(R.string.lbl_pedal_calibration_failed));
        Button button2 = this.f30768a;
        if (button2 != null) {
            button2.setText(getString(R.string.lbl_retry));
        } else {
            s.m("calibrateButton");
            throw null;
        }
    }

    public final void da() {
        k kVar = (k) DeviceManager.register(this, this.f30776i, 1).getCapability(k.class);
        this.f30774g = kVar;
        if (kVar != null) {
            TextView textView = this.f30769b;
            if (textView == null) {
                s.m("calibrationStatusTextView");
                throw null;
            }
            v22.e.q(textView);
            Button button = this.f30768a;
            if (button == null) {
                s.m("calibrateButton");
                throw null;
            }
            v22.e.q(button);
            Button button2 = this.f30768a;
            if (button2 == null) {
                s.m("calibrateButton");
                throw null;
            }
            button2.setEnabled(true);
            TextView textView2 = this.f30769b;
            if (textView2 != null) {
                textView2.setText(getString(R.string.msg_calibration_instruction));
            } else {
                s.m("calibrationStatusTextView");
                throw null;
            }
        }
    }

    public final void ea() {
        ga();
        hideProgressOverlay();
        TextView textView = this.f30771d;
        if (textView == null) {
            s.m("torqueLabelTextView");
            throw null;
        }
        v22.e.l(textView);
        TextView textView2 = this.f30770c;
        if (textView2 == null) {
            s.m("torqueValueTextView");
            throw null;
        }
        v22.e.l(textView2);
        TextView textView3 = this.f30769b;
        if (textView3 == null) {
            s.m("calibrationStatusTextView");
            throw null;
        }
        v22.e.q(textView3);
        Button button = this.f30768a;
        if (button == null) {
            s.m("calibrateButton");
            throw null;
        }
        v22.e.q(button);
        Button button2 = this.f30768a;
        if (button2 == null) {
            s.m("calibrateButton");
            throw null;
        }
        button2.setEnabled(false);
        TextView textView4 = this.f30769b;
        if (textView4 == null) {
            s.m("calibrationStatusTextView");
            throw null;
        }
        textView4.setText(getString(R.string.msg_pedals_not_connected));
        this.f30773f = false;
    }

    public final void fa() {
        ListenableFuture<Void> listenableFutureS;
        boolean z14 = this.f30773f;
        k kVar = this.f30774g;
        if (z14) {
            ListenableFuture<Void> listenableFutureJ = kVar != null ? kVar.j(h.f117689q, h.f117690r, f30767n) : null;
            if (listenableFutureJ != null) {
                Futures.addCallback(listenableFutureJ, new b(), MoreExecutors.directExecutor());
                return;
            }
            return;
        }
        if (kVar == null || (listenableFutureS = kVar.s(h.f117689q, h.f117690r, true)) == null) {
            return;
        }
        Futures.addCallback(listenableFutureS, new tv.b(this), MoreExecutors.directExecutor());
    }

    public final void ga() {
        Timer timer = this.f30777j;
        if (timer != null) {
            timer.cancel();
        }
        this.f30777j = null;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        Bundle extras;
        Bundle extras2;
        super.onCreate(bundle);
        setContentView(R.layout.calibration_settings_activity);
        initActionBar(true, R.string.lbl_calibrate);
        Intent intent = getIntent();
        this.f30775h = (intent == null || (extras2 = intent.getExtras()) == null) ? this.f30775h : extras2.getLong("GCM_deviceUnitID");
        Intent intent2 = getIntent();
        if (intent2 == null || (extras = intent2.getExtras()) == null || (string = extras.getString("GCM_macAddress")) == null) {
            string = this.f30776i;
        }
        this.f30776i = string;
        String string2 = getString(R.string.title_garmin);
        string2.getClass();
        View viewFindViewById = findViewById(R.id.btn_calibrate);
        ((Button) viewFindViewById).setOnClickListener(new pm0.h(27, this, string2));
        viewFindViewById.getClass();
        this.f30768a = (Button) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_calibration_status);
        ((TextView) viewFindViewById2).setText(getString(R.string.msg_calibration_instruction));
        viewFindViewById2.getClass();
        this.f30769b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_torque_value);
        viewFindViewById3.getClass();
        this.f30770c = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_torque_label);
        viewFindViewById4.getClass();
        this.f30771d = (TextView) viewFindViewById4;
        da();
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        tv.d dVar = this.f30772e;
        if (dVar != null) {
            da2.d.b().f58886a.i(dVar);
        }
        k kVar = this.f30774g;
        if (kVar != null) {
            kVar.w(this.f30778k);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        tv.d dVar = new tv.d(this.f30775h);
        dVar.f166501b.f(this, this.f30779l);
        this.f30772e = dVar;
        da2.d.b().f58886a.b(dVar);
        k kVar = this.f30774g;
        if (kVar != null) {
            kVar.a(this.f30778k, h.f117689q, h.f117690r);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/CalibrationSettingsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "CALIBRATION_TIMEOUT", "J", "", "CPCP_OP_CODE", "B", "CPCP_REQUEST_OP_CODE", "CPCP_RESPONSE_SUCCESS", "", "OFFSET_CALIBRATION_DATA", "[B", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
