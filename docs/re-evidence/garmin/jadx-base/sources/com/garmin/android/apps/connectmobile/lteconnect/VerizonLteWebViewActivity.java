package com.garmin.android.apps.connectmobile.lteconnect;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDILTEExtension;
import com.garmin.proto.generated.GDILTEProto;
import com.garmin.proto.generated.GDISmartProto;
import f03.d;
import f03.f;
import f03.g;
import f03.h;
import hk0.p;
import ng1.c1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lteconnect/VerizonLteWebViewActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VerizonLteWebViewActivity extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f38708h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f38709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f38710b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f38713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38714f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f38711c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38715g = 1;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/lteconnect/VerizonLteWebViewActivity$b", "Lcom/garmin/android/apps/connectmobile/lteconnect/a$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.apps.connectmobile.lteconnect.a.b {
        public b() {
        }

        @Override // com.garmin.android.apps.connectmobile.lteconnect.a.b
        public final void a() {
            int i14 = VerizonLteWebViewActivity.f38708h;
            VerizonLteWebViewActivity verizonLteWebViewActivity = VerizonLteWebViewActivity.this;
            verizonLteWebViewActivity.hideProgressOverlay();
            verizonLteWebViewActivity.getWindow().clearFlags(16);
            VerizonLteWebViewActivity.ca(verizonLteWebViewActivity);
        }

        @Override // com.garmin.android.apps.connectmobile.lteconnect.a.b
        public final void b(String str, String str2, boolean z14) {
            VerizonLteWebViewActivity verizonLteWebViewActivity = VerizonLteWebViewActivity.this;
            if (!z14) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* wakeUpDeviceModem() Retry.");
                if (verizonLteWebViewActivity.f38715g <= 8) {
                    new Handler().postDelayed(new po.g(verizonLteWebViewActivity, 2), 5000L);
                    return;
                }
                i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* wakeUpDeviceModem() Failure.");
                verizonLteWebViewActivity.hideProgressOverlay();
                verizonLteWebViewActivity.getWindow().clearFlags(16);
                VerizonLteWebViewActivity.ca(verizonLteWebViewActivity);
                return;
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "VerizonLteWebViewActivity", "*LTE* wakeUpDeviceModem() Success.");
            int i14 = VerizonLteWebViewActivity.f38708h;
            verizonLteWebViewActivity.hideProgressOverlay();
            verizonLteWebViewActivity.getWindow().clearFlags(16);
            verizonLteWebViewActivity.f38714f = true;
            WebView webView = verizonLteWebViewActivity.f38709a;
            webView.getClass();
            webView.setVisibility(0);
            f fVar = verizonLteWebViewActivity.f38710b;
            fVar.getClass();
            WebView webView2 = verizonLteWebViewActivity.f38709a;
            webView2.getClass();
            d dVar = new d(webView2, null, null, new pw0.d(verizonLteWebViewActivity));
            fVar.f67767a = dVar;
            WebView webView3 = dVar.f67757a;
            webView3.getSettings().setJavaScriptEnabled(true);
            webView3.addJavascriptInterface(new f03.b(dVar.f67761e), "orderStatus");
            webView3.setWebViewClient(new f03.c(dVar));
            h hVar = h.CREATED;
            dVar.f67760d = hVar;
            f03.a aVar3 = dVar.f67761e;
            if (aVar3 != null) {
                aVar3.c(hVar);
            }
        }
    }

    static {
        new a(null);
    }

    public static final void ca(VerizonLteWebViewActivity verizonLteWebViewActivity) {
        verizonLteWebViewActivity.getClass();
        e.a aVar = new e.a(verizonLteWebViewActivity);
        aVar.setTitle(verizonLteWebViewActivity.getString(R.string.lte_no_connection));
        aVar.setMessage(verizonLteWebViewActivity.getString(R.string.lte_no_connection_msg, verizonLteWebViewActivity.getString(R.string.lbl_verizon)));
        aVar.setPositiveButton(verizonLteWebViewActivity.getString(R.string.lbl_ok), new c1(verizonLteWebViewActivity, 16));
        aVar.show();
    }

    public final void da(GDILTEProto.LTEServiceActivationNotification.ActivationStatus activationStatus) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* sendActivationStatusToDevice() Sending activation status to device. Status: " + activationStatus);
        GDILTEProto.LTEServiceActivationNotification.Builder status = GDILTEProto.LTEServiceActivationNotification.newBuilder().setStatus(activationStatus);
        if (this.f38712d) {
            status.setServiceProvider(GDILTEProto.LTEServiceProvider.VERIZON);
        }
        GDILTEProto.LTEService.Builder lteServiceActivationNotification = GDILTEProto.LTEService.newBuilder().setLteServiceActivationNotification(status);
        lteServiceActivationNotification.getClass();
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.getClass();
        builderNewBuilder.setExtension(GDILTEExtension.lteService, lteServiceActivationNotification.build());
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = builderNewBuilder.build();
        smartBuild.getClass();
        protobufRequestManager.initiateNotification(smartBuild, this.f38711c);
    }

    public final void ea() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* sendProtoResponse() Sending the Proto with sim provider to device.");
        GDILTEProto.LTEService.Builder lteServiceActivationNotification = GDILTEProto.LTEService.newBuilder().setLteServiceActivationNotification(GDILTEProto.LTEServiceActivationNotification.newBuilder().setServiceProvider(GDILTEProto.LTEServiceProvider.VERIZON));
        lteServiceActivationNotification.getClass();
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.getClass();
        builderNewBuilder.setExtension(GDILTEExtension.lteService, lteServiceActivationNotification.build());
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = builderNewBuilder.build();
        smartBuild.getClass();
        protobufRequestManager.initiateNotification(smartBuild, this.f38711c);
    }

    public final void fa() {
        com.garmin.android.apps.connectmobile.lteconnect.a.f38717b.getClass();
        if (com.garmin.android.apps.connectmobile.lteconnect.a.f38718c == null) {
            com.garmin.android.apps.connectmobile.lteconnect.a.f38718c = new com.garmin.android.apps.connectmobile.lteconnect.a(null);
        }
        com.garmin.android.apps.connectmobile.lteconnect.a aVar = com.garmin.android.apps.connectmobile.lteconnect.a.f38718c;
        aVar.getClass();
        if (p.k(this.f38711c)) {
            aVar.a(this.f38711c, new b());
            return;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* finish() Device not connected.");
        Toast.makeText(this, getString(R.string.find_my_watch_device_not_connected_msg), 0).show();
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f38712d) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* finish() Success.");
            da(GDILTEProto.LTEServiceActivationNotification.ActivationStatus.SUCCESS);
            setResult(-1);
        } else {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "VerizonLteWebViewActivity", "*LTE* finish() Cancelled.");
            da(GDILTEProto.LTEServiceActivationNotification.ActivationStatus.CANCELLED);
            setResult(0);
        }
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_verizon_lte_web_view);
        super.initActionBar(true, getString(R.string.lte_connect_with, getString(R.string.lbl_verizon)));
        this.f38709a = (WebView) findViewById(R.id.wvContent);
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extraIccId");
            String stringExtra2 = intent.getStringExtra("extraImei");
            this.f38711c = intent.getLongExtra("GCM_deviceUnitID", -1L);
            this.f38713e = new g(stringExtra, stringExtra2);
            this.f38710b = new f();
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "VerizonLteWebViewActivity", "*LTE* finish() Activity create error. No intent data.");
        Toast.makeText(this, getString(R.string.txt_something_went_wrong_try_again), 0).show();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        showProgressOverlay();
        getWindow().setFlags(16, 16);
        da(GDILTEProto.LTEServiceActivationNotification.ActivationStatus.STARTED);
        fa();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        f fVar = this.f38710b;
        if (fVar != null && this.f38714f) {
            d dVar = fVar.f67767a;
            dVar.getClass();
            h hVar = h.CLOSED;
            dVar.f67760d = hVar;
            f03.a aVar = dVar.f67761e;
            if (aVar != null) {
                aVar.c(hVar);
            }
            dVar.f67761e = null;
            h.CREATED.equals(dVar.f67760d);
            fVar.f67767a = null;
        }
        super.onStop();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/lteconnect/VerizonLteWebViewActivity$a;", "", "<init>", "()V", "", "EXTRA_ICCID", "Ljava/lang/String;", "EXTRA_IMEI", "TAG", "", "MAX_RETRY_ATTEMPTS", "I", "", "POLL_TIMER_MILLISECONDS", "J", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
