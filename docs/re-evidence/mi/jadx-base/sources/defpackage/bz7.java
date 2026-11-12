package defpackage;

import com.xiaomi.fitness.eco.device.contact.EcoSyncObservers;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncer;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class bz7 {
    public static void a(EcoSyncObservers ecoSyncObservers, Set<EcoDeviceSyncer> set) {
        ecoSyncObservers.injectSyncers = set;
    }
}
