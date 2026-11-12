package com.xiaomi.hm.health.device.feature.sync.job.mili.data;

import android.os.ConditionVariable;
import androidx.exifinterface.media.ExifInterface;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.dto.MenstruationConfigDto;
import com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationConfig;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u000b\u001a\u00020\tR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/data/MenstruationConfigCallback;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationConfig;", "config", "", "menstruationConfigString", ExifInterface.GPS_DIRECTION_TRUE, "prefix", "createPrintOnFinishHMCallback", "", "onFinish", "waiteForFinished", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "manager", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "tag", "Ljava/lang/String;", "Landroid/os/ConditionVariable;", "conditionVariable", "Landroid/os/ConditionVariable;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MenstruationConfigCallback extends HMCallback<MenstruationConfig> {

    @NotNull
    private final HMMiLiProDevice device;

    @NotNull
    private final MenstruationDataManager manager;

    @NotNull
    private final String tag = "MenstruationConfigCallback";

    @NotNull
    private final ConditionVariable conditionVariable = new ConditionVariable(false);

    public MenstruationConfigCallback(@NotNull HMMiLiProDevice hMMiLiProDevice, @NotNull MenstruationDataManager menstruationDataManager) {
        this.device = hMMiLiProDevice;
        this.manager = menstruationDataManager;
    }

    private final <T> HMCallback<?> createPrintOnFinishHMCallback(final String prefix) {
        return new HMCallback<T>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationConfigCallback.createPrintOnFinishHMCallback.1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(T t) {
                HMLog.i(MenstruationConfigCallback.this.tag, prefix + ": " + t, new Object[0]);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String menstruationConfigString(MenstruationConfig config) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "devNotify=%b menstruationNotify=%b menstruationDays=%d ovulationNotify=%b ovulationDays=%d predict=%b", Arrays.copyOf(new Object[]{config.getDeviceNotify(), config.getMenstruationNotify(), config.getMenstruationNotifyDays(), config.getOvulationNotify(), config.getOvulationDays(), config.getSmartPredict()}, 6));
    }

    public final void waiteForFinished() {
        this.conditionVariable.block(3000L);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(@Nullable final MenstruationConfig config) {
        Boolean menstruationNotify;
        Boolean ovulationNotify;
        Boolean smartPredict;
        Boolean deviceNotify;
        boolean zBooleanValue = false;
        try {
            if (config != null) {
                if (this.manager.getSp().getFirstTime()) {
                    HMLog.info(this.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationConfigCallback.onFinish.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "getMenstruationConfig, config=" + MenstruationConfigCallback.this.menstruationConfigString(config);
                        }
                    });
                    SharedPreferencesUtils sp = this.manager.getSp();
                    Boolean deviceNotify2 = config.getDeviceNotify();
                    sp.setHwNotify(deviceNotify2 == null ? false : deviceNotify2.booleanValue());
                    SharedPreferencesUtils sp2 = this.manager.getSp();
                    Byte menstruationNotifyDays = config.getMenstruationNotifyDays();
                    byte bByteValue = 1;
                    sp2.setHwBeforeMenstruationDay(menstruationNotifyDays == null ? (byte) 1 : menstruationNotifyDays.byteValue());
                    SharedPreferencesUtils sp3 = this.manager.getSp();
                    Boolean smartPredict2 = config.getSmartPredict();
                    if (smartPredict2 != null) {
                        zBooleanValue = smartPredict2.booleanValue();
                    }
                    sp3.setEnablePredict(zBooleanValue);
                    SharedPreferencesUtils sp4 = this.manager.getSp();
                    Byte ovulationDays = config.getOvulationDays();
                    if (ovulationDays != null) {
                        bByteValue = ovulationDays.byteValue();
                    }
                    sp4.setHwBeforeOvulationDay(bByteValue);
                } else {
                    final MenstruationConfigDto localConfFromApp = this.manager.readLocalConfFromApp();
                    if (localConfFromApp == null) {
                        HMLog.e(this.tag, "MenstruationConfigDto is null", new Object[0]);
                    } else {
                        HMLog.info(this.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationConfigCallback.onFinish.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final String getA() {
                                return "getMenstruationConfig, config=" + MenstruationConfigCallback.this.menstruationConfigString(config) + " dto=" + localConfFromApp;
                            }
                        });
                        if (localConfFromApp.getDeviceNotify() != config.getDeviceNotify() && (deviceNotify = localConfFromApp.getDeviceNotify()) != null) {
                            this.device.switchMenstruationDeviceNotify(deviceNotify.booleanValue(), createPrintOnFinishHMCallback("switchMenstruationDeviceNotify"));
                        }
                        if ((localConfFromApp.getMenstruationNotify() != config.getMenstruationNotify() || localConfFromApp.getMenstruationNotifyDays() != config.getMenstruationNotifyDays()) && (menstruationNotify = localConfFromApp.getMenstruationNotify()) != null) {
                            this.device.setMenstruationNotify(menstruationNotify.booleanValue(), localConfFromApp.getMenstruationNotifyDays().byteValue(), createPrintOnFinishHMCallback("setMenstruationNotify"));
                        }
                        if ((localConfFromApp.getOvulationNotify() != config.getOvulationNotify() || localConfFromApp.getOvulationDays() != config.getOvulationDays()) && (ovulationNotify = localConfFromApp.getOvulationNotify()) != null) {
                            this.device.setMenstruationOvulation(ovulationNotify.booleanValue(), localConfFromApp.getOvulationDays().byteValue(), createPrintOnFinishHMCallback("setMenstruationOvulation"));
                        }
                        if (localConfFromApp.getSmartPredict() != config.getSmartPredict() && (smartPredict = localConfFromApp.getSmartPredict()) != null) {
                            this.device.switchSmartPredict(smartPredict.booleanValue(), createPrintOnFinishHMCallback("switchSmartPredict"));
                        }
                    }
                }
                this.conditionVariable.open();
                return;
            }
            HMLog.w(this.tag, "MenstruationConfig config is null", new Object[0]);
            this.conditionVariable.open();
        } catch (Throwable th) {
            this.conditionVariable.open();
            throw th;
        }
    }
}
