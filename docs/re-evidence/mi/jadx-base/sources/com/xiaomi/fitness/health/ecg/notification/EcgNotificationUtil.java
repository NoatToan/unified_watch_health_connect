package com.xiaomi.fitness.health.ecg.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.BitmapFactory;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import defpackage.c0j;
import defpackage.fxi;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/notification/EcgNotificationUtil;", "", "<init>", "()V", "TAG", "", "CHANNEL_ID", "CHANNEL_NAME", "notifyNewEcgRecordToUser", "", "ecgReport", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgNotificationUtil {

    @NotNull
    private static final String CHANNEL_ID = "com.mi.health-ecg";

    @NotNull
    private static final String CHANNEL_NAME = "com.mi.health-ecg-channel";

    @NotNull
    public static final EcgNotificationUtil INSTANCE = new EcgNotificationUtil();

    @NotNull
    private static final String TAG = "EcgNotificationUtil";

    private EcgNotificationUtil() {
    }

    public final void notifyNewEcgRecordToUser(@NotNull EcgMedicalItemReport ecgReport) {
        Intrinsics.checkNotNullParameter(ecgReport, "ecgReport");
        FitnessLogUtils.i(TAG, "notifyNewEcgRecordToUser(" + ecgReport + ")");
        Object systemService = ApplicationExtKt.getApplication().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        notificationManager.createNotificationChannel(new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, 3));
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.fitness.health.action.VIEW_ECG_DETAIL");
        intent.setPackage(ApplicationExtKt.getApplication().getPackageName());
        intent.putExtra(EcgConstantsKt.PARAM_REPORT, ecgReport);
        Notification notificationD = new wwg.e(ApplicationExtKt.getApplication(), CHANNEL_ID).k(ApplicationExtKt.getApplication().getString(c0j.f4794a)).j(ApplicationExtKt.getApplication().getString(c0j.wa)).B(System.currentTimeMillis()).u(fxi.f18350a).q(BitmapFactory.decodeResource(ApplicationExtKt.getApplication().getResources(), fxi.f18350a)).i(PendingIntentExtKt.getActivityPendingIntent(ApplicationExtKt.getApplication(), 0, intent, 268435456)).g(true).d();
        Intrinsics.checkNotNullExpressionValue(notificationD, "build(...)");
        notificationManager.notify(c0j.f4794a, notificationD);
    }
}
