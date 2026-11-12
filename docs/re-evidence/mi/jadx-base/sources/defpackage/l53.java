package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class l53 {
    public static Object a(Context context) {
        ComponentCallbacks2 componentCallbacks2A = zi4.a(context.getApplicationContext());
        e6i.a(componentCallbacks2A instanceof sxa, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", componentCallbacks2A.getClass());
        return ((sxa) componentCallbacks2A).generatedComponent();
    }
}
