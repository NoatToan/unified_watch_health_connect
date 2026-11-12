package com.xiaomi.hm.health.bodyfat.manager;

import android.util.Base64;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.webapi.WeightInfoApi;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/manager/WeightInfoRemoteRepository;", "", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "weightinfos", "", "uploadWeightInfos", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightInfoRemoteRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile WeightInfoRemoteRepository b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/manager/WeightInfoRemoteRepository$Companion;", "", "Lcom/xiaomi/hm/health/bodyfat/manager/WeightInfoRemoteRepository;", "getInstance", DefaultSettingsSpiCall.n, "Lcom/xiaomi/hm/health/bodyfat/manager/WeightInfoRemoteRepository;", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WeightInfoRemoteRepository getInstance() {
            WeightInfoRemoteRepository weightInfoRemoteRepository = WeightInfoRemoteRepository.b;
            if (weightInfoRemoteRepository == null) {
                synchronized (this) {
                    weightInfoRemoteRepository = WeightInfoRemoteRepository.b;
                    if (weightInfoRemoteRepository == null) {
                        weightInfoRemoteRepository = new WeightInfoRemoteRepository(null);
                        Companion companion = WeightInfoRemoteRepository.INSTANCE;
                        WeightInfoRemoteRepository.b = weightInfoRemoteRepository;
                    }
                }
            }
            return weightInfoRemoteRepository;
        }
    }

    private WeightInfoRemoteRepository() {
        this.TAG = "WeightInfoRemoteRepository";
    }

    public /* synthetic */ WeightInfoRemoteRepository(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean uploadWeightInfos(@NotNull final List<? extends WeightInfos> weightinfos) throws JSONException {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (weightinfos.isEmpty()) {
            return booleanRef.element;
        }
        String userid = BFCallback.getHMPersonInfo().getUserid();
        List<UserInfos> allInfos = UserInfoManager.getManager().getAllInfos();
        JSONArray jSONArray = new JSONArray();
        for (WeightInfos weightInfos : weightinfos) {
            JSONObject jSONObject = new JSONObject();
            if (weightInfos.getTimestamp() != null || weightInfos.getTimestamp().longValue() >= 0) {
                String device_id = weightInfos.getDevice_id();
                if (device_id == null) {
                    device_id = "";
                }
                jSONObject.put("deviceId", device_id);
                Integer source = weightInfos.getSource();
                jSONObject.put("deviceSource", source == null ? HMDeviceSource.WEIGHT.getValue() : source.intValue());
                jSONObject.put(ParamKey.dataSource, HMDeviceType.WEIGHT.getValue());
                Object obj = null;
                jSONObject.put("generatedTime", ExtentionUtilsKt.millsToSecond$default(weightInfos.getTimestamp().longValue(), false, 1, null));
                Integer type = weightInfos.getType();
                jSONObject.put(ParamKey.weightType, type == null ? 0 : type.intValue());
                jSONObject.put("userId", userid);
                jSONObject.put(ParamKey.memberId, HMWeightUtils.isSelf(String.valueOf(weightInfos.getUserId())) ? EcgData.DEFAULT_DIGIT_VALUE : weightInfos.getUserId());
                JSONObject jSONObject2 = new JSONObject();
                for (Object obj2 : allInfos) {
                    if (Intrinsics.areEqual(((UserInfos) obj2).getUserId(), String.valueOf(weightInfos.getUserId()))) {
                        obj = obj2;
                        break;
                    }
                }
                UserInfos userInfos = (UserInfos) obj;
                if (userInfos != null) {
                    jSONObject2.put("age", BodyParamsUtils.getWeightAge(weightInfos.getTimestamp().longValue(), userInfos.getBirthday()));
                }
                Integer height = weightInfos.getHeight();
                if (height != null) {
                    jSONObject2.put("height", height.intValue());
                    Unit unit = Unit.INSTANCE;
                }
                Float bmi = weightInfos.getBmi();
                if (bmi != null) {
                    jSONObject2.put("bmi", Float.valueOf(bmi.floatValue()));
                    Unit unit2 = Unit.INSTANCE;
                }
                Float weight = weightInfos.getWeight();
                if (weight != null) {
                    jSONObject2.put("weight", Float.valueOf(weight.floatValue()));
                    Unit unit3 = Unit.INSTANCE;
                }
                Float ofmt = weightInfos.getOfmt();
                if (ofmt != null) {
                    float fFloatValue = ofmt.floatValue();
                    Integer type2 = weightInfos.getType();
                    if (type2 != null && type2.intValue() == 4) {
                        jSONObject2.put(ParamKey.bodyBalanceScore, (int) fFloatValue);
                    } else {
                        jSONObject2.put(ParamKey.oneFootMeasureTime, Float.valueOf(fFloatValue));
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
                Integer score = weightInfos.getScore();
                if (score != null) {
                    jSONObject2.put(ParamKey.bodyScore, score.intValue());
                    Unit unit5 = Unit.INSTANCE;
                }
                Integer body_shape_type = weightInfos.getBody_shape_type();
                if (body_shape_type != null) {
                    jSONObject2.put(ParamKey.bodyStyle, body_shape_type.intValue());
                    Unit unit6 = Unit.INSTANCE;
                }
                Float moisture = weightInfos.getMoisture();
                if (moisture != null) {
                    jSONObject2.put(ParamKey.bodyWaterRate, Float.valueOf(moisture.floatValue()));
                    Unit unit7 = Unit.INSTANCE;
                }
                Float bone_mass = weightInfos.getBone_mass();
                if (bone_mass != null) {
                    jSONObject2.put(ParamKey.boneMass, Float.valueOf(bone_mass.floatValue()));
                    Unit unit8 = Unit.INSTANCE;
                }
                Float body_fat = weightInfos.getBody_fat();
                if (body_fat != null) {
                    jSONObject2.put(ParamKey.fatRate, Float.valueOf(body_fat.floatValue()));
                    Unit unit9 = Unit.INSTANCE;
                }
                Integer impedance = weightInfos.getImpedance();
                if (impedance != null) {
                    jSONObject2.put(ParamKey.impedance, impedance.intValue());
                    Unit unit10 = Unit.INSTANCE;
                }
                Integer encryptImpedance = weightInfos.getEncryptImpedance();
                if (encryptImpedance != null) {
                    jSONObject2.put("encryptImpedance", encryptImpedance.intValue());
                    Unit unit11 = Unit.INSTANCE;
                }
                Integer basal_metabolism = weightInfos.getBasal_metabolism();
                if (basal_metabolism != null) {
                    jSONObject2.put(ParamKey.metabolism, basal_metabolism.intValue());
                    Unit unit12 = Unit.INSTANCE;
                }
                Integer ma = weightInfos.getMa();
                if (ma != null) {
                    jSONObject2.put(ParamKey.muscleAge, ma.intValue());
                    Unit unit13 = Unit.INSTANCE;
                }
                Float muscle = weightInfos.getMuscle();
                if (muscle != null) {
                    jSONObject2.put(ParamKey.muscleRate, Float.valueOf(muscle.floatValue()));
                    Unit unit14 = Unit.INSTANCE;
                }
                Float pmr = weightInfos.getPmr();
                if (pmr != null) {
                    jSONObject2.put(ParamKey.proteinRatio, Float.valueOf(pmr.floatValue()));
                    Unit unit15 = Unit.INSTANCE;
                }
                Float sbw = weightInfos.getSbw();
                if (sbw != null) {
                    jSONObject2.put(ParamKey.standBodyWeight, Float.valueOf(sbw.floatValue()));
                    Unit unit16 = Unit.INSTANCE;
                }
                Float visceral_fat = weightInfos.getVisceral_fat();
                if (visceral_fat != null) {
                    jSONObject2.put(ParamKey.visceralFat, Float.valueOf(visceral_fat.floatValue()));
                    Unit unit17 = Unit.INSTANCE;
                }
                if (weightInfos.getHeartRate() > 0) {
                    jSONObject2.put(ParamKey.heartRateData, Base64.encodeToString(new byte[]{(byte) weightInfos.getHeartRate()}, 2));
                    jSONObject2.put("timeZone", TimeZone.getDefault().getRawOffset());
                }
                if (weightInfos.getPressure() > 0) {
                    jSONObject2.put(ParamKey.singleStress, weightInfos.getPressure());
                    String boundDeviceAddress = BFCallback.getHMDeviceManager().getBoundDeviceAddress(HMDeviceType.WEIGHT);
                    if (boundDeviceAddress == null) {
                        boundDeviceAddress = "";
                    }
                    jSONObject2.put(ParamKey.deviceMac, boundDeviceAddress);
                    jSONObject2.put(ParamKey.deviceSn, BFKeeper.getValue(ParamKey.deviceSn, ""));
                }
                if (weightInfos.getSkeletalMuscle() > 0.0f) {
                    jSONObject2.put(ParamKey.skeletalMuscle, Float.valueOf(weightInfos.getSkeletalMuscle()));
                }
                if (weightInfos.getSubcutaneousFat() > 0.0f) {
                    jSONObject2.put(ParamKey.subcutaneousFat, Float.valueOf(weightInfos.getSubcutaneousFat()));
                }
                jSONObject2.put("deviceType", HMDeviceType.WEIGHT.getValue());
                jSONObject2.put("source", 1);
                jSONObject.put("summary", jSONObject2);
                jSONArray.put(jSONObject);
            }
        }
        WeightInfoApi.syncWeightInfosToServer(String.valueOf(((WeightInfos) CollectionsKt.first((List) weightinfos)).getUserId()), jSONArray.toString(), new IHMHttpResponseHandler() { // from class: com.xiaomi.hm.health.bodyfat.manager.WeightInfoRemoteRepository.uploadWeightInfos.2
            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type3) {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@Nullable Throwable throwable) {
                if (throwable == null) {
                    return;
                }
                throwable.printStackTrace();
            }

            @Override // com.huami.network.base.handler.IHMHttpResponseHandler
            public void onItem(@Nullable HMHttpResponseData item) {
                boolean z = false;
                if (item != null && item.isSuccess()) {
                    z = true;
                }
                if (z) {
                    booleanRef.element = true;
                    Iterator<T> it2 = weightinfos.iterator();
                    while (it2.hasNext()) {
                        ((WeightInfos) it2.next()).setSync(1);
                    }
                    WeightInfoRepository.INSTANCE.getInstance().updateWeightInfos(weightinfos);
                }
            }
        });
        return booleanRef.element;
    }
}
