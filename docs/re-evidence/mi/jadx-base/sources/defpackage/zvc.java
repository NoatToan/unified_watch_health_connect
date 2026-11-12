package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes5.dex */
public interface zvc {

    public interface a {
        void onDenied();

        void onGranted();
    }

    void checkBluetoothPermission(Activity activity, a aVar);
}
