package com.xiaomi.fitness.devicesettings.base.clock;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.devicesettings.base.clock.AlarmWeekdayHelper;
import com.xiaomi.fitness.devicesettings.base.clock.bean.WeekdayInfo;
import com.xiaomi.fitness.devicesettings.base.clock.bean.WeekdayRequestInfo;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.k14;
import defpackage.m64;
import defpackage.s7r;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/clock/AlarmWeekdayHelper;", "", "<init>", "()V", "TAG", "", "getWeekdayInfo", "", "requestYear", "", "syncWeekdayInfo", "weekdayInfo", "Lcom/xiaomi/fitness/devicesettings/base/clock/bean/WeekdayInfo;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlarmWeekdayHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlarmWeekdayHelper.kt\ncom/xiaomi/fitness/devicesettings/base/clock/AlarmWeekdayHelper\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,52:1\n37#2:53\n36#2,3:54\n37#2:57\n36#2,3:58\n*S KotlinDebug\n*F\n+ 1 AlarmWeekdayHelper.kt\ncom/xiaomi/fitness/devicesettings/base/clock/AlarmWeekdayHelper\n*L\n39#1:53\n39#1:54,3\n40#1:57\n40#1:58,3\n*E\n"})
public final class AlarmWeekdayHelper {

    @NotNull
    public static final AlarmWeekdayHelper INSTANCE = new AlarmWeekdayHelper();

    @NotNull
    private static final String TAG = "AlarmWeekdayHelper";

    private AlarmWeekdayHelper() {
    }

    public static /* synthetic */ void getWeekdayInfo$default(AlarmWeekdayHelper alarmWeekdayHelper, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        alarmWeekdayHelper.getWeekdayInfo(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeekdayInfo$lambda$0(WeekdayInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getWeekdayInfo: " + it);
        INSTANCE.syncWeekdayInfo(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWeekdayInfo$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getWeekdayInfo exception: " + it);
        return Unit.INSTANCE;
    }

    private final void syncWeekdayInfo(WeekdayInfo weekdayInfo) {
        m64 m64Var = new m64();
        m64Var.c = weekdayInfo.getYear();
        m64Var.d = (String[]) weekdayInfo.getFreedayList().toArray(new String[0]);
        m64Var.e = (String[]) weekdayInfo.getWorkdayList().toArray(new String[0]);
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 6;
        k14 k14Var = new k14();
        k14Var.D(m64Var);
        s7rVar.P(k14Var);
        Logger.d(TAG, "syncWeekdayInfo: " + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
    }

    public final void getWeekdayInfo(int requestYear) {
        if (requestYear == 1971) {
            requestYear = Calendar.getInstance().get(1) + 1;
        } else if (requestYear == 1970 || requestYear == 0) {
            requestYear = Calendar.getInstance().get(1);
        }
        new AlarmClockApiRequest().getWeekdayInfo("data=" + new WeekdayRequestInfo(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion(), requestYear).toJson(), new Function1() { // from class: e41
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlarmWeekdayHelper.getWeekdayInfo$lambda$0((WeekdayInfo) obj);
            }
        }, new Function1() { // from class: f41
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AlarmWeekdayHelper.getWeekdayInfo$lambda$1((ApiException) obj);
            }
        });
    }
}
