package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class nnu extends nns {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nnu f43338b;

    private nnu(Context context, String str) {
        super(context, str);
    }

    public static nnu a(Context context) {
        nnu nnuVar;
        synchronized (nnu.class) {
            if (f43338b == null) {
                f43338b = new nnu(context, "com.huawei.hwid.site_list_info");
            }
            nnuVar = f43338b;
        }
        return nnuVar;
    }
}
