package com.garmin.android.apps.connectmobile.devices.setup;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class b extends e.a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f34456a;

    public interface a {
    }

    public b(Context context, String str, boolean z14, a aVar) {
        super(context);
        this.f34456a = aVar;
        setCancelable(false);
        if (z14) {
            setMessage(context.getString(R.string.device_settings_set_as_preferred_activity_tracker_title_question, str == null ? null : str));
            setPositiveButton(R.string.lbl_yes, this);
            setNegativeButton(R.string.lbl_no, this);
        } else {
            setTitle(context.getString(R.string.device_settings_set_as_preferred_activity_tracker_title_question, str == null ? null : str));
            setMessage(R.string.preferred_tracker_conflict_info_1);
            setPositiveButton(R.string.lbl_yes, this);
            setNegativeButton(R.string.preferred_activity_tracker_keep_current_1, this);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        dialogInterface.dismiss();
        boolean z14 = i14 == -1;
        cd0.c cVar = BLEDeviceSetupActivity.this.f34394g;
        if (cVar != null) {
            cVar.H(z14);
        }
    }

    public b(Context context, String str, String str2, a aVar) {
        super(context);
        this.f34456a = aVar;
        setCancelable(false);
        setTitle(R.string.activity_tracking_title);
        setMessage(context.getString(R.string.activity_tracking_choose_device_message_1, str2));
        setPositiveButton(context.getString(R.string.activity_tracking_choose_device_use_x, str), this);
        setNegativeButton(R.string.activity_tracking_use_existing_device, this);
    }
}
