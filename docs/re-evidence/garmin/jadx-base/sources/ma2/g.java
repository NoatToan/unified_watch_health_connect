package ma2;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<UUID, f.a> f117672a = new ConcurrentHashMap<>();

    private g() {
    }

    public static f a(Context context, UUID uuid, da2.e eVar, pj2.k kVar) {
        if (context == null) {
            vb.h.s("context is null");
            return null;
        }
        if (eVar == null) {
            vb.h.s("configuration is null");
            return null;
        }
        if (kVar == null) {
            vb.h.s("gatt is null");
            return null;
        }
        if (uuid == h.f117687o) {
            xm2.g.f191527c.getClass();
            xm2.g.a.b().getClass();
            if (xm2.g.c().isEmpty()) {
                return null;
            }
        }
        f.a aVar = f117672a.get(uuid);
        if (aVar == null) {
            return null;
        }
        return aVar.create(context, eVar, kVar);
    }

    public static void b(UUID uuid, f.a aVar) {
        if (uuid != null) {
            f117672a.put(uuid, aVar);
        } else {
            vb.h.s("uuid is null");
        }
    }
}
