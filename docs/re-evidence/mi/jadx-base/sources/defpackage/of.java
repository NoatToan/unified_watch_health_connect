package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.entity.health.Health;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.BooleanData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lof;", "Lsi;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class of implements si<Health> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f29095a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lof$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public IPrimaryData a(@NotNull ByteBuffer byteBuffer, boolean z, int i) {
        return si.a.a(this, byteBuffer, z, i);
    }

    @Nullable
    public Health a(@NotNull ByteBuffer byteBuffer, int groupVersion) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Health healthA = Health.Companion.a(Health.INSTANCE, null, null, 3, null);
        if (healthA == null) {
            return null;
        }
        healthA.setGroupVersion(groupVersion);
        boolean zL = z2.l(byteBuffer);
        byte b2 = byteBuffer.get();
        for (int i = 0; i < b2; i++) {
            byte b3 = byteBuffer.get();
            Health.Companion companion = Health.INSTANCE;
            if (b3 == companion.k()) {
                EnumData enumDataA = fs.a(byteBuffer, "hrAllayDetectionFrequency", zL);
                if (enumDataA == null) {
                    return null;
                }
                healthA.setHrAllayDetectionFrequency(enumDataA);
            } else if (b3 == companion.m()) {
                EnumData enumDataA2 = fs.a(byteBuffer, "hrTooHighRemindValue", zL);
                if (enumDataA2 == null) {
                    return null;
                }
                healthA.setHrTooHighRemindValue(enumDataA2);
            } else if (b3 == companion.n()) {
                EnumData enumDataA3 = fs.a(byteBuffer, "allDayPressureSwitch", zL);
                if (enumDataA3 == null) {
                    return null;
                }
                healthA.setHrTooLowRemindValue(enumDataA3);
            } else if (b3 == companion.i()) {
                BooleanData booleanDataA = fs.a(byteBuffer, "hrActivityMonitorSwitch");
                if (booleanDataA == null) {
                    return null;
                }
                healthA.setHrActivityMonitorSwitch(Boolean.valueOf(booleanDataA.getValue()));
            } else if (b3 == companion.j()) {
                BooleanData booleanDataA2 = fs.a(byteBuffer, "hrAdvertisementInActiveSwitch");
                if (booleanDataA2 == null) {
                    return null;
                }
                healthA.setHrAdvertisementInActiveSwitch(Boolean.valueOf(booleanDataA2.getValue()));
            } else if (b3 == companion.l()) {
                IntData intDataE = fs.e(byteBuffer, "hrMaxValue", zL);
                if (intDataE == null) {
                    return null;
                }
                healthA.setHrMaxValue(intDataE);
            } else if (b3 == companion.t()) {
                BooleanData booleanDataA3 = fs.a(byteBuffer, "scientificSleepSwitch");
                if (booleanDataA3 == null) {
                    return null;
                }
                healthA.setScientificSleepSwitch(Boolean.valueOf(booleanDataA3.getValue()));
            } else if (b3 == companion.r()) {
                BooleanData booleanDataA4 = fs.a(byteBuffer, "osaSwitch");
                if (booleanDataA4 == null) {
                    return null;
                }
                healthA.setOsaSwitch(Boolean.valueOf(booleanDataA4.getValue()));
            } else if (b3 == companion.d()) {
                BooleanData booleanDataA5 = fs.a(byteBuffer, "allDayPressureSwitch");
                if (booleanDataA5 == null) {
                    return null;
                }
                healthA.setAllDayPressureSwitch(Boolean.valueOf(booleanDataA5.getValue()));
            } else if (b3 == companion.s()) {
                BooleanData booleanDataA6 = fs.a(byteBuffer, "relievePressureRemindSwitch");
                if (booleanDataA6 == null) {
                    return null;
                }
                healthA.setRelievePressureRemindSwitch(Boolean.valueOf(booleanDataA6.getValue()));
            } else if (b3 == companion.g()) {
                BooleanData booleanDataA7 = fs.a(byteBuffer, "heartHealthyMonitorSwitch");
                if (booleanDataA7 == null) {
                    return null;
                }
                healthA.setHeartHealthyMonitorSwitch(Boolean.valueOf(booleanDataA7.getValue()));
            } else if (b3 == companion.h()) {
                BooleanData booleanDataA8 = fs.a(byteBuffer, "heartHealthyRemindDndInSleepSwitch");
                if (booleanDataA8 == null) {
                    return null;
                }
                healthA.setHeartHealthyRemindDndInSleepSwitch(Boolean.valueOf(booleanDataA8.getValue()));
            } else if (b3 == companion.A()) {
                BooleanData booleanDataA9 = fs.a(byteBuffer, "smartSpo2MonitorSwitch");
                if (booleanDataA9 == null) {
                    return null;
                }
                healthA.setSmartSpo2MonitorSwitch(Boolean.valueOf(booleanDataA9.getValue()));
            } else if (b3 == companion.B()) {
                EnumData enumDataA4 = fs.a(byteBuffer, "spo2LowLevelRemindValue", zL);
                if (enumDataA4 == null) {
                    return null;
                }
                healthA.setSpo2LowLevelRemindValue(enumDataA4);
            } else if (b3 == companion.F()) {
                BooleanData booleanDataA10 = fs.a(byteBuffer, "standUpRemindSwitch");
                if (booleanDataA10 == null) {
                    return null;
                }
                healthA.setStandUpRemindSwitch(Boolean.valueOf(booleanDataA10.getValue()));
            } else if (b3 == companion.D()) {
                Time timeC = fs.c(byteBuffer, "standUpRemindStartTime");
                if (timeC == null) {
                    return null;
                }
                healthA.setStandUpRemindStartTime(timeC);
            } else if (b3 == companion.E()) {
                Time timeC2 = fs.c(byteBuffer, "standUpRemindStopTime");
                if (timeC2 == null) {
                    return null;
                }
                healthA.setStandUpRemindStopTime(timeC2);
            } else if (b3 == companion.o()) {
                BooleanData booleanDataA11 = fs.a(byteBuffer, "middyRestDndSwitch");
                if (booleanDataA11 == null) {
                    return null;
                }
                healthA.setMiddyRestDndSwitch(Boolean.valueOf(booleanDataA11.getValue()));
            } else if (b3 == companion.p()) {
                Time timeC3 = fs.c(byteBuffer, "middyRestStartTime");
                if (timeC3 == null) {
                    return null;
                }
                healthA.setMiddyRestStartTime(timeC3);
            } else if (b3 == companion.q()) {
                Time timeC4 = fs.c(byteBuffer, "middyRestStopTime");
                if (timeC4 == null) {
                    return null;
                }
                healthA.setMiddyRestStopTime(timeC4);
            } else if (b3 == companion.H()) {
                BooleanData booleanDataA12 = fs.a(byteBuffer, "targetAchieveRemindSwitch");
                if (booleanDataA12 == null) {
                    return null;
                }
                healthA.setTargetAchieveRemindSwitch(Boolean.valueOf(booleanDataA12.getValue()));
            } else if (b3 == companion.G()) {
                if (groupVersion >= 2) {
                    Int32Data int32DataC = fs.c(byteBuffer, "stepTarget", zL);
                    if (int32DataC == null) {
                        return null;
                    }
                    healthA.setStepTarget(int32DataC);
                } else {
                    IntData intDataE2 = fs.e(byteBuffer, "stepTarget", zL);
                    if (intDataE2 == null) {
                        return null;
                    }
                    healthA.setStepTarget(intDataE2);
                }
            } else if (b3 == companion.f()) {
                IntData intDataE3 = fs.e(byteBuffer, "calorieTarget", zL);
                if (intDataE3 == null) {
                    return null;
                }
                healthA.setCalorieTarget(intDataE3);
            } else if (b3 == companion.I()) {
                IntData intDataE4 = fs.e(byteBuffer, "weightTarget", zL);
                if (intDataE4 == null) {
                    return null;
                }
                healthA.setWeightTarget(intDataE4);
            } else if (b3 == companion.z()) {
                IntData intDataE5 = fs.e(byteBuffer, "sleepTarget", zL);
                if (intDataE5 == null) {
                    return null;
                }
                healthA.setSleepTarget(intDataE5);
            } else if (b3 == companion.C()) {
                IntData intDataE6 = fs.e(byteBuffer, "standTarget", zL);
                if (intDataE6 == null) {
                    return null;
                }
                healthA.setStandTarget(intDataE6);
            } else if (b3 == companion.c()) {
                IntData intDataE7 = fs.e(byteBuffer, "activityTarget", zL);
                if (intDataE7 == null) {
                    return null;
                }
                healthA.setActivityTarget(intDataE7);
            } else if (b3 == companion.x()) {
                BooleanData booleanDataA13 = fs.a(byteBuffer, "sleepingBloodPressureMonitor");
                if (booleanDataA13 == null) {
                    return null;
                }
                healthA.setBloodPressureMonitorSwitch(Boolean.valueOf(booleanDataA13.getValue()));
            } else if (b3 == companion.b()) {
                EnumData enumDataA5 = fs.a(byteBuffer, "activityMode", zL);
                if (enumDataA5 == null) {
                    return null;
                }
                healthA.setActivityMode(enumDataA5);
            } else if (b3 == companion.v()) {
                BooleanData booleanDataA14 = fs.a(byteBuffer, "sleepAlarmSwitch");
                if (booleanDataA14 == null) {
                    return null;
                }
                healthA.setSleepAlarmSwitch(Boolean.valueOf(booleanDataA14.getValue()));
            } else if (b3 == companion.y()) {
                BooleanData booleanDataA15 = fs.a(byteBuffer, "sleepModeSwitch");
                if (booleanDataA15 == null) {
                    return null;
                }
                healthA.setSleepModeSwitch(Boolean.valueOf(booleanDataA15.getValue()));
            } else if (b3 == companion.u()) {
                BooleanData booleanDataA16 = fs.a(byteBuffer, "sleepAIAlarm");
                if (booleanDataA16 == null) {
                    return null;
                }
                healthA.setSleepAIAlarm(Boolean.valueOf(booleanDataA16.getValue()));
            } else if (b3 == companion.w()) {
                EnumData enumDataA6 = fs.a(byteBuffer, "sleepBeforeDed", zL);
                if (enumDataA6 == null) {
                    return null;
                }
                healthA.setSleepBeforeDed(enumDataA6);
            } else if (b3 == companion.e()) {
                BooleanData booleanDataA17 = fs.a(byteBuffer, "bodyEnergy");
                if (booleanDataA17 == null) {
                    return null;
                }
                healthA.setBodyEnergySwitch(Boolean.valueOf(booleanDataA17.getValue()));
            } else {
                IPrimaryData iPrimaryDataA = a(byteBuffer, zL, b3);
                t5t.d("Health", "[WARNING] parseHealth unknown key: " + ((int) b3) + ", position: " + byteBuffer.position() + ", parsed: " + iPrimaryDataA);
                if (iPrimaryDataA == null) {
                    return null;
                }
            }
        }
        return healthA;
    }
}
