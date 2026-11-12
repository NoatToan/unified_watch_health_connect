package ty1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public final class l1 {
    public static final void a(Context context) {
        ht.a.f85464a.getClass();
        ht.a.a(null, "ChildEventPrivacyTapped");
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context, 0);
        aVar.setTitle(context.getString(R.string.lbl_feature_not_supported));
        aVar.setMessage(context.getString(R.string.msg_public_event_not_supported));
        aVar.setCancelable(false);
        aVar.setPositiveButton(context.getString(R.string.lbl_ok), new o(4));
        aVar.create().show();
    }
}
