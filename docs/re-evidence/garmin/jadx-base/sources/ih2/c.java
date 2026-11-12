package ih2;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import tn.k;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static final void a(Context context) {
        context.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        if (a7.b.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
            arrayList.add("android.permission.READ_PHONE_STATE");
        }
        if (a7.b.checkSelfPermission(context, "android.permission.CALL_PHONE") != 0) {
            arrayList.add("android.permission.CALL_PHONE");
        }
        if (a7.b.checkSelfPermission(context, "android.permission.READ_CALL_LOG") != 0) {
            arrayList.add("android.permission.READ_CALL_LOG");
        }
        if (a7.b.checkSelfPermission(context, "android.permission.ANSWER_PHONE_CALLS") != 0) {
            arrayList.add("android.permission.ANSWER_PHONE_CALLS");
        }
        if (a7.b.checkSelfPermission(context, "android.permission.SEND_SMS") != 0) {
            arrayList.add("android.permission.SEND_SMS");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Intent intent = new Intent(k.g(context.getApplicationContext().getPackageName(), "/com.garmin.android.gncs.NOTIFICATION_REQUIRES_PERMISSION"));
        intent.putStringArrayListExtra("com.garmin.android.gncs.PERMISSIONS_NEEDED", arrayList);
        context.sendBroadcast(intent);
    }
}
