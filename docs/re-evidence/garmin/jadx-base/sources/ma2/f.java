package ma2;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public interface f {

    public interface a {
        f create(Context context, da2.e eVar, pj2.k kVar);
    }

    default boolean delayStartUntilAfterHandshake() {
        return false;
    }

    boolean initialize(UUID uuid, UUID[] uuidArr);

    void onDeviceDisconnect();
}
