package eh2;

import android.content.Context;
import ml2.l;

/* JADX INFO: loaded from: classes11.dex */
public interface e {

    public interface a {
        e a(Context context, l lVar);
    }

    void b(int i14);

    default boolean delayStartUntilAfterHandshake() {
        return false;
    }

    void onDeviceDisconnect();
}
