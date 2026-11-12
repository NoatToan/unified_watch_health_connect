package com.xiaomi.fitness.health.bloodglucose.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.BitmapFactory;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.annotation.BloodSugarLevel;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import defpackage.c0j;
import defpackage.fxi;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/notification/GlucoseNotificationUtils;", "", "<init>", "()V", "TAG", "", "CHANNEL_ID", "CHANNEL_NAME", "notifyAbnormalGlucose", "", "item", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "level", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlucoseNotificationUtils {

    @NotNull
    private static final String CHANNEL_ID = "com.mi.health-glucose-channel-id";

    @NotNull
    private static final String CHANNEL_NAME = "com.mi.health-glucose-channel-name";

    @NotNull
    public static final GlucoseNotificationUtils INSTANCE = new GlucoseNotificationUtils();

    @NotNull
    private static final String TAG = "GlucoseNotificationUtils";

    private GlucoseNotificationUtils() {
    }

    public final void notifyAbnormalGlucose(@NotNull BloodSugarItem item, @BloodSugarLevel int level) {
        String string;
        Intrinsics.checkNotNullParameter(item, "item");
        FitnessLogUtils.i(TAG, "notifyAbnormalGlucose, level(" + level + ")");
        if (level == 1) {
            return;
        }
        Object systemService = ApplicationExtKt.getApplication().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        notificationManager.createNotificationChannel(new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, 3));
        if (level != 2) {
            string = level != 3 ? ResourceExtKt.getString(c0j.h1) : ResourceExtKt.getString(c0j.G0, Float.valueOf(item.bloodSugar()));
        } else {
            string = ResourceExtKt.getString(c0j.A0, Float.valueOf(item.bloodSugar()));
        }
        Notification notificationD = new wwg.e(ApplicationExtKt.getApplication(), CHANNEL_ID).k(ResourceExtKt.getString(c0j.f4794a)).j(string).B(System.currentTimeMillis()).u(fxi.f18350a).q(BitmapFactory.decodeResource(ApplicationExtKt.getApplication().getResources(), fxi.f18350a)).i(PendingIntentExtKt.getActivityPendingIntent(ApplicationExtKt.getApplication(), 0, level == 4 ? IHealthPage.DefaultImpls.goBloodGlucoseRecordDetailPage$default(HealthPageExtKt.getInstance(IHealthPage.INSTANCE), null, 1, null) : IHealthPage.DefaultImpls.goBloodGlucosePageIntent$default(HealthPageExtKt.getInstance(IHealthPage.INSTANCE), null, 1, null), 268435456)).g(true).d();
        Intrinsics.checkNotNullExpressionValue(notificationD, "build(...)");
        notificationManager.notify(c0j.f4794a, notificationD);
        FitnessDataPreference.INSTANCE.setNOTIFY_ABNORMAL_GLUCOSE_TIME(System.currentTimeMillis() / ((long) 1000));
    }
}
