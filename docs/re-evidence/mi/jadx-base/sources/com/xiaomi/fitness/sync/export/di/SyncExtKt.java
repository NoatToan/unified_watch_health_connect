package com.xiaomi.fitness.sync.export.di;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"instance", "Lcom/xiaomi/fitness/sync/export/di/SyncExportManager;", "Lcom/xiaomi/fitness/sync/export/di/SyncExportManager$Companion;", "getInstance", "(Lcom/xiaomi/fitness/sync/export/di/SyncExportManager$Companion;)Lcom/xiaomi/fitness/sync/export/di/SyncExportManager;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager;", "Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager$Companion;", "(Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager$Companion;)Lcom/xiaomi/fitness/sync/export/di/WeatherSyncManager;", "instance$delegate$1", "sync-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SyncExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gto
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyncExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hto
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SyncExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    public static final SyncExportManager getInstance(@NotNull SyncExportManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (SyncExportManager) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SyncExportManager instance_delegate$lambda$0() {
        return ((SyncExportManagerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SyncExportManagerPoint.class)).getSyncExportManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WeatherSyncManager instance_delegate$lambda$1() {
        return ((SyncExportManagerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), SyncExportManagerPoint.class)).getWeatherSyncManager();
    }

    @NotNull
    public static final WeatherSyncManager getInstance(@NotNull WeatherSyncManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (WeatherSyncManager) instance$delegate$1.getValue();
    }
}
