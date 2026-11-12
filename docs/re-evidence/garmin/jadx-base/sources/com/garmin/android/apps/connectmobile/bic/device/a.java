package com.garmin.android.apps.connectmobile.bic.device;

import am.j;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import bn2.b;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import go1.g0;
import hv.d;
import hv.e;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zp0.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/device/a;", "Landroidx/fragment/app/Fragment;", "Lbn2/b;", "<init>", "()V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment implements b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0488a f30744f = new C0488a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ProgressBar f30745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bn2.a f30746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30749e;

    public a() {
        super(R.layout.gcm3_bic_device_pair_progress);
    }

    @Override // bn2.b
    public final void f6(BluetoothDevice bluetoothDevice, int i14, int i15) {
        String strQ = j.q(androidx.core.view.j.k(i14, "eventBondStateChange ", bluetoothDevice.getAddress(), " bondState[", "] previousBondState["), i15, "]");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "DeviceReconnectActivity", strQ);
        String address = bluetoothDevice.getAddress();
        String str = this.f30747c;
        if (str == null) {
            s.m("deviceMacAddress");
            throw null;
        }
        if (s.g(address, str)) {
            if (i14 != 10) {
                if (i14 != 12) {
                    return;
                }
                ge1.b.T(f0.w(this), null, null, new e(this, null), 3);
            } else {
                Intent intent = requireActivity().getIntent();
                m mVarRequireActivity = requireActivity();
                intent.putExtra("EXTRA_RECONNECT_SUCCESSFUL", false);
                Unit unit = Unit.INSTANCE;
                mVarRequireActivity.setResult(-1, intent);
                requireActivity().finish();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        this.f30746b = new bn2.a(this);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("EXTRA_DEVICE_MAC_ADDRESS")) == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "DeviceReconnectActivity", "Invalid device mac address");
            requireActivity().finish();
            return;
        }
        this.f30747c = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.getLong("EXTRA_DEVICE_UNIT_ID");
        }
        Bundle arguments3 = getArguments();
        this.f30748d = arguments3 != null ? arguments3.getString("EXTRA_DEVICE_NAME") : null;
        Bundle arguments4 = getArguments();
        this.f30749e = arguments4 != null ? arguments4.getString("EXTRA_DEVICE_IMAGE_URL") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        bn2.a aVar = this.f30746b;
        if (aVar == null) {
            s.m("bondingReceiver");
            throw null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.a(contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        bn2.a aVar = this.f30746b;
        if (aVar == null) {
            s.m("bondingReceiver");
            throw null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (aVar.f19081d) {
            contextRequireContext.getApplicationContext().unregisterReceiver(aVar);
            aVar.f19081d = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ImageView imageView = (ImageView) view2.findViewById(R.id.device_setup_image);
        c.f206560v.getClass();
        c cVar = new c(this);
        cVar.f206565e = this.f30749e;
        cVar.f206571k = 2131231969;
        imageView.getClass();
        cVar.h(imageView);
        View viewFindViewById = view2.findViewById(R.id.device_setup_progress_bar);
        viewFindViewById.getClass();
        ProgressBar progressBar = (ProgressBar) viewFindViewById;
        this.f30745a = progressBar;
        progressBar.setMax(10);
        ProgressBar progressBar2 = this.f30745a;
        if (progressBar2 == null) {
            s.m("setupProgressBar");
            throw null;
        }
        progressBar2.setProgress(5);
        ((TextView) view2.findViewById(R.id.complete_setup)).setText(getString(R.string.complete_setup, this.f30748d));
        TextView textView = (TextView) view2.findViewById(R.id.bluetooth_notification_message);
        textView.getClass();
        textView.setVisibility(0);
        ((Button) view2.findViewById(R.id.device_setup_progress_cancel)).setOnClickListener(new g0(this, 9));
        String str = this.f30747c;
        if (str == null) {
            s.m("deviceMacAddress");
            throw null;
        }
        String strConcat = "reconnectDevice mac address ".concat(str);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "DeviceReconnectActivity", strConcat);
        ge1.b.T(f0.w(this), null, null, new d(str, null), 3);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.bic.device.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/device/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_DEVICE_UNIT_ID", "EXTRA_DEVICE_MAC_ADDRESS", "EXTRA_DEVICE_NAME", "EXTRA_DEVICE_IMAGE_URL", "", "PROGRESS_MAX", "I", "PROGRESS_INITIAL", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0488a {
        public /* synthetic */ C0488a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0488a() {
        }
    }
}
