package defpackage;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.bloodpressure.remind.BloodPressurePoint;
import com.xiaomi.fitness.health.bloodpressure.remind.BloodPressureRemindUtils;
import com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository;
import com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository;
import dagger.hilt.android.EntryPointAccessors;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import services.reminder.RemindCallback;
import services.reminder.RemindEvent;
import services.reminder.ReminderHelper;
import services.reminder.notification.NotificationAdapter;

/* JADX INFO: loaded from: classes9.dex */
public class j03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f22274a = TimeUnit.HOURS.toMillis(2);

    public static class a extends NotificationAdapter {
        public a() {
            super(null);
        }

        @Override // services.reminder.notification.NotificationAdapter, services.reminder.notification.INotificationAdapter
        public String getContent(Context context) {
            return new String[]{context.getString(c0j.d2), context.getString(c0j.e2)}[new Random().nextInt(2)];
        }

        @Override // services.reminder.notification.NotificationAdapter, services.reminder.notification.INotificationAdapter
        public String getTitle(Context context) {
            return new String[]{context.getString(c0j.f2), context.getString(c0j.g2)}[new Random().nextInt(2)];
        }
    }

    public static class b implements RemindCallback {
        @Override // services.reminder.RemindCallback
        public boolean needCancelEventNotice(@NotNull String str) {
            return false;
        }

        @Override // services.reminder.RemindCallback
        public bjk onPreRemind(Context context, String str, RemindEvent remindEvent) {
            IBloodPressurePreRepository bloodPressurePrefRepo;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if ((wearableDeviceModel != null && wearableDeviceModel.getProduct().getFeatures() != null && wearableDeviceModel.getProduct().getFeatures().contains("blood_pressure")) || !str.startsWith("remind:bp_measure:") || (bloodPressurePrefRepo = ((BloodPressurePoint) EntryPointAccessors.fromApplication(context.getApplicationContext(), BloodPressurePoint.class)).getBloodPressurePrefRepo()) == null) {
                return null;
            }
            boolean zBooleanValue = ((Boolean) bloodPressurePrefRepo.getPrefValue(BloodPressurePreRepository.KEY_MEASURE_REMIND_ENABLE, Boolean.FALSE)).booleanValue();
            tz2 measureRemindData = bloodPressurePrefRepo.getMeasureRemindData(BloodPressurePreRepository.KEY_REMIND_DATA);
            Logger.i("MeasureRemindCallback", "onPreRemind enable:" + zBooleanValue + ",remind data :" + i4b.a().toJson(measureRemindData));
            if (zBooleanValue && measureRemindData != null && !measureRemindData.equals(tz2.a())) {
                int[] repeatDays = BloodPressureRemindUtils.getRepeatDays(measureRemindData.d());
                int i = Calendar.getInstance().get(7);
                for (int i2 : repeatDays) {
                    if (i == BloodPressureRemindUtils.INSTANCE.formatWeekIndex(i2)) {
                        return new bjk("notice_bp:measure", 600, j03.f22274a);
                    }
                }
            }
            return null;
        }
    }

    public static void b(Context context, List<String> list, Map<String, Integer> map) {
        ReminderHelper.INSTANCE.deleteAndReRegisterTimedReminder(context, list, map, b.class);
    }

    public static void c(Context context, boolean z) {
        Context safeContext = UIUtils.getSafeContext(context);
        if (!z) {
            ReminderHelper.INSTANCE.unregisterNotice(safeContext, "notice_bp:measure");
            return;
        }
        owg.b bVar = new owg.b();
        bVar.a("channel:blood_pressure");
        bVar.b(safeContext.getString(c0j.v1));
        owg owgVar = new owg();
        owgVar.f29762b = "notice_bp:measure";
        owgVar.d = 600;
        owgVar.c = bVar;
        owgVar.l = pni.W1;
        owgVar.r(new Intent(context.getPackageName() + ".action.HOME"));
        owgVar.s(a.class.getName());
        ReminderHelper.INSTANCE.registerOrReplaceNotice(safeContext, owgVar);
    }
}
