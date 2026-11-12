package com.xiaomi.fitness.userinfo;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import defpackage.bxi;
import defpackage.cxg;
import defpackage.o1j;
import defpackage.wwg;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/userinfo/UserInfoNotify;", "", "<init>", "()V", "TAG", "", "USER_INFO_CHANNEL_ID", "USER_INFO_NOTIFY_ID", "", "showNotification", "", "requestIntArray", "", "UserInfoReceiver", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserInfoNotify {

    @NotNull
    public static final UserInfoNotify INSTANCE = new UserInfoNotify();

    @NotNull
    public static final String TAG = "UserInfoNotify";

    @NotNull
    private static final String USER_INFO_CHANNEL_ID = "channel:user_info";
    private static final int USER_INFO_NOTIFY_ID = 101;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/userinfo/UserInfoNotify$UserInfoReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserInfoReceiver extends BroadcastReceiver {

        @NotNull
        public static final String ACTION_JUMP_GUIDE = "jump_guide";

        @NotNull
        public static final String KEY_REQUEST_LIST = "request_list";

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            String action = intent != null ? intent.getAction() : null;
            int[] intArrayExtra = intent != null ? intent.getIntArrayExtra(KEY_REQUEST_LIST) : null;
            String action2 = intent != null ? intent.getAction() : null;
            Logger.i(UserInfoNotify.TAG, "onReceive:" + action2 + ",list " + Arrays.toString(intArrayExtra));
            if (!Intrinsics.areEqual(action, ACTION_JUMP_GUIDE) || intArrayExtra == null) {
                return;
            }
            if (!(intArrayExtra.length == 0)) {
                SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).requestUserInfoGuide(ArraysKt___ArraysKt.toList(intArrayExtra));
            }
        }
    }

    private UserInfoNotify() {
    }

    public final void showNotification(@NotNull int[] requestIntArray) {
        Intrinsics.checkNotNullParameter(requestIntArray, "requestIntArray");
        Application application = ApplicationExtKt.getApplication();
        NotificationChannel notificationChannel = new NotificationChannel(USER_INFO_CHANNEL_ID, "user-info", 3);
        NotificationManager notificationManager = (NotificationManager) application.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent(application, (Class<?>) UserInfoReceiver.class);
        intent.setAction(UserInfoReceiver.ACTION_JUMP_GUIDE);
        intent.putExtra(UserInfoReceiver.KEY_REQUEST_LIST, requestIntArray);
        Notification notificationD = new wwg.e(application, USER_INFO_CHANNEL_ID).u(bxi.f4707a).k(application.getString(o1j.f28644a)).j(ResourceExtKt.getString(o1j.h0)).t(1).g(true).i(PendingIntentExtKt.getBroadcastPendingIntent(application, 0, intent, 134217728)).d();
        Intrinsics.checkNotNullExpressionValue(notificationD, "build(...)");
        cxg.b(application).e(101, notificationD);
    }
}
