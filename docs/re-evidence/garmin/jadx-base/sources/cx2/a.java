package cx2;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcx2/a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static boolean a(Context context) {
        ArrayList arrayList = new ArrayList();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 31) {
            arrayList.add("android.permission.BLUETOOTH_SCAN");
            arrayList.add("android.permission.BLUETOOTH_CONNECT");
        }
        if (i14 < 31 || arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (a7.b.checkSelfPermission(context, (String) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }
}
