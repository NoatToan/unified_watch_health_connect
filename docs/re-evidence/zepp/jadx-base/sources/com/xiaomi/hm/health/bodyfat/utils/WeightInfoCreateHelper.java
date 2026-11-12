package com.xiaomi.hm.health.bodyfat.utils;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/utils/WeightInfoCreateHelper;", "", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "userInfo", "", "time", "", "weight", "", ParamKey.impedance, "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "createWeightInfo", "data", "", "saveHeartOfScale", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightInfoCreateHelper {

    @NotNull
    public static final WeightInfoCreateHelper INSTANCE = new WeightInfoCreateHelper();

    private WeightInfoCreateHelper() {
    }

    @Nullable
    public final WeightInfos createWeightInfo(@Nullable UserInfos userInfo, long time, float weight, int impedance) {
        if (userInfo == null) {
            return null;
        }
        WeightInfos weightInfos = new WeightInfos();
        weightInfos.setDevice_id(BFCallback.getHMDeviceManager().getBoundDeviceId(HMDeviceType.WEIGHT));
        weightInfos.setSync(0);
        weightInfos.setSync_qqhealth(0);
        if (ExtentionUtilsKt.millsToSecond(time, true) > System.currentTimeMillis()) {
            HMLog.i("createWeightInfo", Intrinsics.stringPlus("time时间大于当前时间--", Long.valueOf(time)), new Object[0]);
            weightInfos.setTimestamp(Long.valueOf(System.currentTimeMillis()));
        } else {
            weightInfos.setTimestamp(Long.valueOf(ExtentionUtilsKt.millsToSecond(time, true)));
        }
        weightInfos.setWeight(Float.valueOf(weight));
        weightInfos.setType(0);
        weightInfos.setSource(Integer.valueOf(BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue()));
        long j = Long.parseLong(userInfo.getUserId());
        if (j == Long.parseLong(BFCallback.getHMPersonInfo().getUserid())) {
            j = -1;
        }
        weightInfos.setUserId(Long.valueOf(j));
        weightInfos.setBmi(Float.valueOf(HMWeightUtils.calcuBMI(userInfo.getHeight().intValue(), weightInfos.getWeight().floatValue())));
        weightInfos.setHeight(userInfo.getHeight());
        weightInfos.setSbw(Float.valueOf(BodyParamsUtils.calculateIdealWeight(userInfo.getHeight().intValue(), userInfo.getGender().intValue(), BodyParamsUtils.getWeightAge(ExtentionUtilsKt.millsToSecond(time, true), userInfo.getBirthday()), weight)));
        weightInfos.setSource(Integer.valueOf(BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue()));
        weightInfos.setImpedance(Integer.valueOf(impedance));
        if (HMWeightUtils.isValidImpedance(weightInfos.getImpedance().intValue())) {
            BodyParamsUtils.addBodyParams(weightInfos, userInfo);
        }
        return weightInfos;
    }

    public final void saveHeartOfScale(@NotNull WeightInfos data) {
        HeartRate heartRate = new HeartRate();
        heartRate.setType(2);
        heartRate.setState(1);
        heartRate.setHr(Integer.valueOf(data.getHeartRate()));
        heartRate.setTime(Long.valueOf(ExtentionUtilsKt.millsToSecond$default(data.getTimestamp().longValue(), false, 1, null)));
        heartRate.setTime_zone(Integer.valueOf(TimeZone.getDefault().getRawOffset()));
        heartRate.setDevice_id(data.getDevice_id());
        heartRate.setDevice_type(Integer.valueOf(HMDeviceType.WEIGHT.getValue()));
        heartRate.setDevice_source(Integer.valueOf(HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue()));
        HMDaoManager.getInstance().getHeartRateDao().insertOrReplace(heartRate);
    }
}
