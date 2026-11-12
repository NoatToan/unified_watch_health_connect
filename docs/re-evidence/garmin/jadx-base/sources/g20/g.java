package g20;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public static final void a(Context context) {
        new androidx.appcompat.app.e.a(context).setTitle(context.getString(R.string.lbl_admin_cannot_be_removed)).setMessage(context.getString(R.string.msg_remove_admin_error)).setPositiveButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.connectiq.i(0)).show();
    }
}
