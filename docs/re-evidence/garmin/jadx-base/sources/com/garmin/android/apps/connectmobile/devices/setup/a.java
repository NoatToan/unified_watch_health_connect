package com.garmin.android.apps.connectmobile.devices.setup;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class a extends e.a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0580a f34455a;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.setup.a$a, reason: collision with other inner class name */
    public interface InterfaceC0580a {
        void a(boolean z14);
    }

    public a(Context context, InterfaceC0580a interfaceC0580a) {
        super(context);
        this.f34455a = interfaceC0580a;
        setCancelable(false);
        setTitle("");
        setMessage(R.string.pairing_exit_flow_msg);
        setPositiveButton(R.string.lbl_yes, this);
        setNegativeButton(R.string.lbl_no, this);
        show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        dialogInterface.dismiss();
        this.f34455a.a(i14 == -1);
    }
}
