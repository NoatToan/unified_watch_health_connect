package androidx.browser.trusted;

import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ITrustedWebActivityCallback f5321a;

    private f(ITrustedWebActivityCallback iTrustedWebActivityCallback) {
        this.f5321a = iTrustedWebActivityCallback;
    }

    public static f a(IBinder iBinder) {
        ITrustedWebActivityCallback iTrustedWebActivityCallbackAsInterface = iBinder == null ? null : ITrustedWebActivityCallback.Stub.asInterface(iBinder);
        if (iTrustedWebActivityCallbackAsInterface == null) {
            return null;
        }
        return new f(iTrustedWebActivityCallbackAsInterface);
    }
}
