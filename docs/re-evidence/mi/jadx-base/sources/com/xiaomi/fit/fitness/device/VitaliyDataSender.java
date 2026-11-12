package com.xiaomi.fit.fitness.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.xiaomi.fit.data.common.constant.FitnessTestPref;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.device.VitaliyDataSender;
import com.xiaomi.fit.fitness.device.hm.send.HMVitaliyDataSender;
import com.xiaomi.fit.fitness.device.mi.send.MiVitaliyDataSender;
import com.xiaomi.fit.fitness.export.api.repository.IRainbowRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import defpackage.aje;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u001b\u001a\u00020\u0017H\u0002J,\u0010\u001f\u001a\u00020\u0017\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u00020\u00170#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fit/fitness/device/VitaliyDataSender;", "", "<init>", "()V", "vitaliyDataReceiver", "Lcom/xiaomi/fit/fitness/device/VitaliyDataSender$VitaliyDataReceiver;", "getVitaliyDataReceiver", "()Lcom/xiaomi/fit/fitness/device/VitaliyDataSender$VitaliyDataReceiver;", "vitaliyDataReceiver$delegate", "Lkotlin/Lazy;", "hmVitaliyDataSender", "Lcom/xiaomi/fit/fitness/device/hm/send/HMVitaliyDataSender;", "getHmVitaliyDataSender", "()Lcom/xiaomi/fit/fitness/device/hm/send/HMVitaliyDataSender;", "hmVitaliyDataSender$delegate", "miVitaliyDataSender", "Lcom/xiaomi/fit/fitness/device/mi/send/MiVitaliyDataSender;", "getMiVitaliyDataSender", "()Lcom/xiaomi/fit/fitness/device/mi/send/MiVitaliyDataSender;", "miVitaliyDataSender$delegate", "getCurVitaliyDataSender", "Lcom/xiaomi/fit/fitness/device/BaseVitaliyData;", "registerBroadcast", "", "unRegisterBroadcast", "setVitaliyDataTime", "", "writeVitaliyData", "setVitaliyData", "Lkotlin/Function2;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "observeOnce", "T", "Landroidx/lifecycle/LiveData;", "observer", "Lkotlin/Function1;", "isCanSetVitaliyData", "", "todayZeroTimeSecond", "Companion", "VitaliyDataReceiver", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VitaliyDataSender {

    @NotNull
    public static final String TAG = "VitaliyDataSender";
    private long setVitaliyDataTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<VitaliyDataSender> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r2r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VitaliyDataSender.instance_delegate$lambda$7();
        }
    });

    /* JADX INFO: renamed from: vitaliyDataReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vitaliyDataReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n2r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VitaliyDataSender.vitaliyDataReceiver_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: hmVitaliyDataSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmVitaliyDataSender = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o2r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VitaliyDataSender.hmVitaliyDataSender_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: miVitaliyDataSender$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy miVitaliyDataSender = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p2r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VitaliyDataSender.miVitaliyDataSender_delegate$lambda$2();
        }
    });

    @NotNull
    private final Function2<DailyGoalReport, Long, Unit> setVitaliyData = new Function2() { // from class: q2r
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return VitaliyDataSender.setVitaliyData$lambda$6(this.f31029a, (DailyGoalReport) obj, ((Long) obj2).longValue());
        }
    };

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fit/fitness/device/VitaliyDataSender$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/device/VitaliyDataSender;", "getInstance", "()Lcom/xiaomi/fit/fitness/device/VitaliyDataSender;", "instance$delegate", "Lkotlin/Lazy;", "TAG", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VitaliyDataSender getInstance() {
            return (VitaliyDataSender) VitaliyDataSender.instance$delegate.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/device/VitaliyDataSender$VitaliyDataReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VitaliyDataReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            FitnessLogUtils.i(VitaliyDataSender.TAG, "Vitaliy Data BroadcastReceiver");
            VitaliyDataSender.INSTANCE.getInstance().writeVitaliyData();
        }
    }

    private final BaseVitaliyData getCurVitaliyDataSender() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return DeviceModelExtKt.isHuaMi(wearableDeviceModel) ? getHmVitaliyDataSender() : getMiVitaliyDataSender();
        }
        return null;
    }

    private final HMVitaliyDataSender getHmVitaliyDataSender() {
        return (HMVitaliyDataSender) this.hmVitaliyDataSender.getValue();
    }

    private final MiVitaliyDataSender getMiVitaliyDataSender() {
        return (MiVitaliyDataSender) this.miVitaliyDataSender.getValue();
    }

    private final VitaliyDataReceiver getVitaliyDataReceiver() {
        return (VitaliyDataReceiver) this.vitaliyDataReceiver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HMVitaliyDataSender hmVitaliyDataSender_delegate$lambda$1() {
        return new HMVitaliyDataSender();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VitaliyDataSender instance_delegate$lambda$7() {
        return new VitaliyDataSender();
    }

    private final boolean isCanSetVitaliyData(long todayZeroTimeSecond) {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateNow);
        boolean z = todayZeroTimeSecond == jChangZeroOfTheDay;
        boolean z2 = System.currentTimeMillis() - this.setVitaliyDataTime >= 5000;
        FitnessLogUtils.i(TAG, "isCanSetVitaliyData , todayZeroTimeSecond:" + todayZeroTimeSecond + " ,curTime :" + jChangZeroOfTheDay + ",tiem:" + z2 + " , finishBoolean:" + (z && z2));
        return z && z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiVitaliyDataSender miVitaliyDataSender_delegate$lambda$2() {
        return new MiVitaliyDataSender();
    }

    private final <T> void observeOnce(final LiveData<T> liveData, final Function1<? super T, Unit> function1) {
        liveData.observeForever(new Observer<T>() { // from class: com.xiaomi.fit.fitness.device.VitaliyDataSender.observeOnce.1
            @Override // androidx.lifecycle.Observer
            public void onChanged(T value) {
                liveData.removeObserver(this);
                function1.invoke2(value);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setVitaliyData$lambda$6(VitaliyDataSender vitaliyDataSender, DailyGoalReport dailyGoalReport, long j) {
        FitnessLogUtils.i(TAG, "start send vitaliy data to wear");
        BaseVitaliyData curVitaliyDataSender = vitaliyDataSender.getCurVitaliyDataSender();
        if (curVitaliyDataSender != null) {
            curVitaliyDataSender.sendToWear(dailyGoalReport, j);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VitaliyDataReceiver vitaliyDataReceiver_delegate$lambda$0() {
        return new VitaliyDataReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeVitaliyData() {
        IRainbowRepository rainbowRepository = FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRainbowRepository();
        long tZOffsetInMilli = FitnessDateUtils.getTZOffsetInMilli(System.currentTimeMillis());
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateNow);
        DailyGoalReport allDailyReport = rainbowRepository.getAllDailyReport(jChangZeroOfTheDay, true);
        if (allDailyReport == null) {
            INSTANCE.getInstance().unRegisterBroadcast();
            return;
        }
        FitnessLogUtils.i(TAG, "todayZeroTimeSecond:" + jChangZeroOfTheDay + " ,tzOffsetInMilli:" + (tZOffsetInMilli / ((long) 3600)) + ", get vitaliy data:" + allDailyReport);
        this.setVitaliyData.invoke(allDailyReport, Long.valueOf(jChangZeroOfTheDay));
        INSTANCE.getInstance().unRegisterBroadcast();
    }

    public final void registerBroadcast() {
        if (AppUtil.INSTANCE.isDevChannel() && FitnessTestPref.INSTANCE.getDISABLE_WRITE_BACK_VALIDITY()) {
            FitnessLogUtils.i(TAG, "disable write back validity to wear");
            return;
        }
        FitnessLogUtils.i(TAG, "registerBroadcast");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.VIALIY_DATA)) {
            FitnessLogUtils.i(TAG, "cur device vitaliy feature is false");
        } else {
            FitnessLogUtils.i(TAG, "cur device vitaliy fearute is true");
            aje.b(AppUtil.getApp()).c(getVitaliyDataReceiver(), new IntentFilter("fitness.action.SUMMARY_SYNCED"));
        }
    }

    public final void unRegisterBroadcast() {
        Logger.i(TAG, "unRegisterBroadcast");
        aje.b(AppUtil.getApp()).e(getVitaliyDataReceiver());
    }
}
