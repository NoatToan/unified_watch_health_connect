package defpackage;

import com.xiaomi.fitness.device.contact.SyncObservers;
import com.xiaomi.fitness.device.contact.export.DeviceSyncer;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class pto {
    public static void a(SyncObservers syncObservers, Set<DeviceSyncer> set) {
        syncObservers.injectSyncers = set;
    }
}
