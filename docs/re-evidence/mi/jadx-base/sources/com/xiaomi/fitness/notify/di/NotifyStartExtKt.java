package com.xiaomi.fitness.notify.di;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import com.xiaomi.fitness.notify.focus.NotificationFocusInterface;
import com.xiaomi.fitness.notify.notification.NotificationManagerInter;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\b\u0010\t\"\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"notifyStartHelper", "Lcom/xiaomi/fitness/notify/di/NotifyStartInterface;", "getNotifyStartHelper", "()Lcom/xiaomi/fitness/notify/di/NotifyStartInterface;", "notifyStartHelper$delegate", "Lkotlin/Lazy;", "notificationFocusManager", "Lcom/xiaomi/fitness/notify/focus/NotificationFocusInterface;", "getNotificationFocusManager", "()Lcom/xiaomi/fitness/notify/focus/NotificationFocusInterface;", "notificationFocusManager$delegate", "notificationManagerImpl", "Lcom/xiaomi/fitness/notify/notification/NotificationManagerInter;", "getNotificationManagerImpl", "()Lcom/xiaomi/fitness/notify/notification/NotificationManagerInter;", "notificationManagerImpl$delegate", "notify_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NotifyStartExtKt {

    @NotNull
    private static final Lazy notifyStartHelper$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: k1h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NotifyStartExtKt.notifyStartHelper_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy notificationFocusManager$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l1h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NotifyStartExtKt.notificationFocusManager_delegate$lambda$1();
        }
    });

    @NotNull
    private static final Lazy notificationManagerImpl$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: m1h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NotifyStartExtKt.notificationManagerImpl_delegate$lambda$2();
        }
    });

    @NotNull
    public static final NotificationFocusInterface getNotificationFocusManager() {
        return (NotificationFocusInterface) notificationFocusManager$delegate.getValue();
    }

    @NotNull
    public static final NotificationManagerInter getNotificationManagerImpl() {
        return (NotificationManagerInter) notificationManagerImpl$delegate.getValue();
    }

    @NotNull
    public static final NotifyStartInterface getNotifyStartHelper() {
        return (NotifyStartInterface) notifyStartHelper$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationFocusInterface notificationFocusManager_delegate$lambda$1() {
        return ((NotificationFocusManagerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), NotificationFocusManagerPoint.class)).getNotificationFocusManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationManagerInter notificationManagerImpl_delegate$lambda$2() {
        return ((NotificationManagerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), NotificationManagerPoint.class)).getNotificationManagerImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotifyStartInterface notifyStartHelper_delegate$lambda$0() {
        return ((NotifyStartPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), NotifyStartPoint.class)).getNotifyStartHelper();
    }
}
