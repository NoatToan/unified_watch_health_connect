package gc0;

import android.content.Context;
import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public class r extends androidx.appcompat.app.e.a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f76915a;

    public interface a {
        void a();
    }

    public r(Context context, a aVar) {
        super(context);
        this.f76915a = aVar;
        setCancelable(false);
        setTitle(R.string.txt_bluetooth_disabled);
        setMessage(context.getString(R.string.devices_dashboard_msg_bluetooth_turned_off, context.getString(R.string.os_name_android)));
        setPositiveButton(R.string.lbl_turn_on_bluetooth, this);
        setNegativeButton(R.string.lbl_close, this);
        show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        dialogInterface.dismiss();
        a aVar = this.f76915a;
        if (i14 == -1) {
            aVar.a();
        } else {
            aVar.getClass();
        }
    }
}
