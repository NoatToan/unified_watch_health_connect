package com.garmin.android.apps.connectmobile.bic.device;

import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import f12.b;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p92.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/device/DeviceReconnectActivity;", "Lcom/garmin/android/apps/connectmobile/bic/a;", "<init>", "()V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceReconnectActivity extends com.garmin.android.apps.connectmobile.bic.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f30728d = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!((b) KoinJavaComponent.get$default(b.class, null, null, 6, null)).c()) {
            finish();
            return;
        }
        long longExtra = getIntent().getLongExtra("EXTRA_DEVICE_UNIT_ID", -1L);
        String stringExtra = getIntent().getStringExtra("EXTRA_DEVICE_MAC_ADDRESS");
        if (stringExtra == null) {
            y.f136664a.getClass();
            y.a.c("DeviceReconnectActivity", "Invalid input device mac address");
            finish();
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("EXTRA_DEVICE_NAME");
        String stringExtra3 = getIntent().getStringExtra("EXTRA_DEVICE_IMAGE_URL");
        setContentView(R.layout.gcm3_simple_frame_layout);
        initActionBar(false, stringExtra2);
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        com.garmin.android.apps.connectmobile.bic.device.a.C0488a c0488a = com.garmin.android.apps.connectmobile.bic.device.a.f30744f;
        if (stringExtra2 == null) {
            stringExtra2 = getString(R.string.lbl_device);
            stringExtra2.getClass();
        }
        c0488a.getClass();
        com.garmin.android.apps.connectmobile.bic.device.a aVar = new com.garmin.android.apps.connectmobile.bic.device.a();
        Bundle bundle2 = new Bundle();
        bundle2.putLong("EXTRA_DEVICE_UNIT_ID", longExtra);
        bundle2.putString("EXTRA_DEVICE_MAC_ADDRESS", stringExtra);
        bundle2.putString("EXTRA_DEVICE_NAME", stringExtra2);
        bundle2.putString("EXTRA_DEVICE_IMAGE_URL", stringExtra3);
        aVar.setArguments(bundle2);
        aVarB.l(R.id.content_frame_layout, aVar, null);
        aVarB.e();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/device/DeviceReconnectActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_DEVICE_UNIT_ID", "EXTRA_DEVICE_MAC_ADDRESS", "EXTRA_DEVICE_PRODUCT_NUMBER", "EXTRA_DEVICE_NAME", "EXTRA_DEVICE_IMAGE_URL", "EXTRA_RECONNECT_SUCCESSFUL", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
