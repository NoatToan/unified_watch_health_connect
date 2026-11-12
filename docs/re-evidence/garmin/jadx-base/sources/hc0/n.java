package hc0;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.dashboard.version2.RegisteredUnPairedDeviceActivity;
import com.garmin.android.apps.connectmobile.i2;
import go1.g0;
import zb0.t;

/* JADX INFO: loaded from: classes8.dex */
public class n extends g22.c<Void, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RegisteredUnPairedDeviceActivity f83267c;

    public n(RegisteredUnPairedDeviceActivity registeredUnPairedDeviceActivity) {
        this.f83267c = registeredUnPairedDeviceActivity;
    }

    @Override // g22.c
    public final Boolean b(Void[] voidArr) {
        rd2.j jVar = rd2.f.a().f152045a;
        RegisteredUnPairedDeviceActivity registeredUnPairedDeviceActivity = this.f83267c;
        long j8 = registeredUnPairedDeviceActivity.f33846d;
        String str = registeredUnPairedDeviceActivity.f33847e;
        jVar.getClass();
        sd2.f fVarI = rd2.j.i(j8, str);
        registeredUnPairedDeviceActivity.f33844b = fVarI;
        if (fVarI == null) {
            i2.i("RegisteredUnPairedDeviceActivity", "No database record for unit ID [" + registeredUnPairedDeviceActivity.f33846d + "].");
            return Boolean.FALSE;
        }
        if (fVarI.F2()) {
            registeredUnPairedDeviceActivity.f33845c = zb0.c.NOT_COMPATIBLE;
        } else {
            int iC2 = registeredUnPairedDeviceActivity.f33844b.C2();
            zb0.c.f203436a.getClass();
            registeredUnPairedDeviceActivity.f33845c = zb0.c.a.a(iC2);
        }
        int i14 = RegisteredUnPairedDeviceActivity.a.f33852a[registeredUnPairedDeviceActivity.f33845c.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                registeredUnPairedDeviceActivity.f33851i = false;
            } else {
                registeredUnPairedDeviceActivity.f33851i = true;
            }
        } else if (!registeredUnPairedDeviceActivity.f33844b.isPaired()) {
            registeredUnPairedDeviceActivity.f33851i = true;
        }
        return Boolean.TRUE;
    }

    @Override // g22.c
    public final void d(Boolean bool) {
        RegisteredUnPairedDeviceActivity registeredUnPairedDeviceActivity = this.f83267c;
        ImageView imageView = (ImageView) registeredUnPairedDeviceActivity.findViewById(R.id.device_image);
        TextView textView = (TextView) registeredUnPairedDeviceActivity.findViewById(R.id.text_view_message);
        Button button = (Button) registeredUnPairedDeviceActivity.findViewById(R.id.custom_bttn_add_this_device);
        if (bool.booleanValue()) {
            registeredUnPairedDeviceActivity.initActionBar(true, registeredUnPairedDeviceActivity.f33844b.getProductDisplayName());
            sd2.f fVar = registeredUnPairedDeviceActivity.f33844b;
            imageView.getClass();
            t.c(imageView, fVar);
            if (registeredUnPairedDeviceActivity.f33851i) {
                textView.setText(registeredUnPairedDeviceActivity.getString(R.string.devices_not_paired_message, registeredUnPairedDeviceActivity.getString(R.string.os_name_android)));
                button.setVisibility(0);
                button.setOnClickListener(new g0(this, 6));
                return;
            } else {
                if (registeredUnPairedDeviceActivity.f33850h) {
                    textView.setText(registeredUnPairedDeviceActivity.getString(R.string.lbl_device_not_compatible_message));
                } else {
                    textView.setText(registeredUnPairedDeviceActivity.getString(R.string.devices_not_bluetooth_compatible_message, registeredUnPairedDeviceActivity.getString(R.string.os_name_android)));
                }
                button.setVisibility(8);
                return;
            }
        }
        registeredUnPairedDeviceActivity.initActionBar(true, registeredUnPairedDeviceActivity.f33848f);
        String str = registeredUnPairedDeviceActivity.f33849g;
        imageView.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.p(a2Var, "DeviceImageLoader", "setDeviceImage(URL[" + str + "]) FALLBACK_URL[null])");
        zp0.c.a aVar2 = zp0.c.f206560v;
        Context context = imageView.getContext();
        context.getClass();
        aVar2.getClass();
        zp0.c cVar = new zp0.c(context);
        cVar.f206565e = str;
        cVar.f206566f = null;
        cVar.f206571k = 2131231969;
        cVar.f206575o = null;
        cVar.h(imageView);
        if (registeredUnPairedDeviceActivity.f33850h) {
            textView.setText(registeredUnPairedDeviceActivity.getString(R.string.lbl_device_not_compatible_message));
        } else {
            textView.setText(registeredUnPairedDeviceActivity.getString(R.string.devices_not_bluetooth_compatible_message, registeredUnPairedDeviceActivity.getString(R.string.os_name_android)));
        }
        button.setVisibility(8);
    }
}
