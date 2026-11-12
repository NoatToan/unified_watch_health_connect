package com.garmin.android.apps.connectmobile.devices.setup;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.e;
import bd0.h0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class c extends e.a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f34457a;

    public interface a {
    }

    public c(Context context, a aVar) {
        super(context);
        this.f34457a = aVar;
        setCancelable(false);
        setTitle(R.string.pairing_reset_title);
        setMessage(R.string.pairing_reset_message_1);
        setPositiveButton(R.string.lbl_reset, this);
        setNegativeButton(R.string.lbl_cancel, this);
        show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        dialogInterface.dismiss();
        boolean z14 = i14 == -1;
        cd0.c cVar = BLEDeviceSetupActivity.this.f34394g;
        if (cVar != null) {
            if (!z14) {
                cVar.s(0, true, null, null);
                return;
            }
            i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".resetDevice()");
            h0 h0Var = cVar.f26816d;
            if (h0Var != null) {
                h0Var.R();
            }
            hk0.a.f().h(cVar.c());
        }
    }
}
