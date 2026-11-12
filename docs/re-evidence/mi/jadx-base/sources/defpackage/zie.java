package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.smarthome.library.MiJiaEnvironment;

/* JADX INFO: loaded from: classes5.dex */
public class zie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile zie f41314a;

    public static zie a() {
        if (f41314a == null) {
            synchronized (zie.class) {
                try {
                    if (f41314a == null) {
                        f41314a = new zie();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f41314a;
    }

    public void b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("did", str);
        bundle.putString("version", str2);
        c("com.xiaomi.wear.native.privacy.confirm.action", bundle);
    }

    public final void c(String str, Bundle bundle) {
        aje.b(MiJiaEnvironment.getAppContext()).d(new Intent().setAction(str).putExtras(bundle));
    }
}
