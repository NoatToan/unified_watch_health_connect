package com.garmin.android.apps.connectmobile.devices.setup;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class d extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f34458a;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i14) {
            dialogInterface.dismiss();
            d.this.f34458a.b();
        }
    }

    public interface b {
        void b();
    }

    public d(Context context, String str, b bVar) {
        super(context);
        this.f34458a = bVar;
        setCancelable(false);
        setTitle("");
        setMessage(context.getString(R.string.pairing_success_message_1, str, context.getString(R.string.os_name_android)));
        setPositiveButton(R.string.lbl_ok, new a()).show();
    }
}
