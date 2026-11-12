package hz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes9.dex */
public final class x {
    public static final void a(Context context) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context, 0);
        aVar.setTitle(context.getString(R.string.lbl_feature_not_supported));
        aVar.setMessage(context.getString(R.string.msg_friends_not_supported));
        aVar.setCancelable(false);
        aVar.setPositiveButton(context.getString(R.string.lbl_ok), new f20.i(19));
        aVar.create().show();
    }
}
