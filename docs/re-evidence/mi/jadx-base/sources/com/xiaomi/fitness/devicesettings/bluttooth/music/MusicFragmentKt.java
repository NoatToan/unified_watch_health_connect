package com.xiaomi.fitness.devicesettings.bluttooth.music;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicFragmentKt;
import com.xiaomi.fitness.notify.export.NotificationManagerExportInter;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"notificationManagerImpl", "Lcom/xiaomi/fitness/notify/export/NotificationManagerExportInter;", "getNotificationManagerImpl", "()Lcom/xiaomi/fitness/notify/export/NotificationManagerExportInter;", "notificationManagerImpl$delegate", "Lkotlin/Lazy;", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MusicFragmentKt {

    @NotNull
    private static final Lazy notificationManagerImpl$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ebg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MusicFragmentKt.notificationManagerImpl_delegate$lambda$0();
        }
    });

    @NotNull
    public static final NotificationManagerExportInter getNotificationManagerImpl() {
        return (NotificationManagerExportInter) notificationManagerImpl$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationManagerExportInter notificationManagerImpl_delegate$lambda$0() {
        return ((NotificationManagerExportPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), NotificationManagerExportPoint.class)).getNotificationManagerExportInter();
    }
}
