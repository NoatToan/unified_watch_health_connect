package hj1;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.e;
import bi2.k;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import g22.n;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(Context context, String str, String str2, boolean z14, lj1.c cVar, l<? super Boolean, Unit> lVar) {
        if (context != null) {
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null || !activity.isFinishing()) {
                e.a aVar = new e.a(context);
                if (n.d(str)) {
                    aVar.setTitle(str);
                }
                if (n.d(str2)) {
                    aVar.setMessage(str2);
                }
                aVar.setNegativeButton(R.string.lbl_ok, new com.garmin.android.apps.connectmobile.gfdi.protobuf.e(lVar, 2));
                if (z14) {
                    aVar.setPositiveButton(R.string.manage_device_priority, new k(lVar, cVar, context, aVar));
                }
                e eVarCreate = aVar.create();
                eVarCreate.setCancelable(false);
                eVarCreate.setCanceledOnTouchOutside(false);
                eVarCreate.show();
            }
        }
    }
}
