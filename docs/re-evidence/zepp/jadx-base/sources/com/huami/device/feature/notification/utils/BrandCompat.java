package com.huami.device.feature.notification.utils;

import android.app.Notification;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.log.HMLog;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/device/feature/notification/utils/BrandCompat;", "", "Landroid/app/Notification;", SleepHomeActivity.FROM_NOTIFICATION, "", "getMiPushTargetPkg", "a", "Ljava/lang/String;", "logTag", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class BrandCompat {

    @NotNull
    public static final BrandCompat INSTANCE = new BrandCompat();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String logTag = "NotificationLog";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(0);
            this.a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getMipushTargetPkg:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getMipushTargetPkg Exception:", this.a.getMessage());
        }
    }

    private BrandCompat() {
    }

    @Nullable
    public final String getMiPushTargetPkg(@NotNull Notification notification) {
        try {
            Field declaredField = notification.getClass().getDeclaredField("extraNotification");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(notification);
            Field declaredField2 = obj.getClass().getDeclaredField("targetPkg");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            HMLog.info("NotificationLog", new a(obj2));
            if (obj2 != null) {
                return obj2.toString();
            }
            return null;
        } catch (Exception e) {
            HMLog.info("NotificationLog", new b(e));
            return null;
        }
    }
}
