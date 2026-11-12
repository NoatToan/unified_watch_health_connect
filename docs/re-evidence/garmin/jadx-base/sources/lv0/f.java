package lv0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final Intent a() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("strava://beacon/settings"));
        return intent;
    }

    public static final void b(Context context) {
        context.getClass();
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(context);
        aVar.setTitle(R.string.lbl_strava_app_required);
        aVar.setMessage(R.string.msg_download_strava_app);
        aVar.setNegativeButton(R.string.lbl_cancel, new jm0.c(22));
        aVar.setPositiveButton(aVar.getContext().getString(R.string.os_app_store_android), new kx0.f(aVar, 4));
        aVar.show();
    }
}
