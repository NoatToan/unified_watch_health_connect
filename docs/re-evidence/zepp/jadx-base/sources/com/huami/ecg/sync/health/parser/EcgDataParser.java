package com.huami.ecg.sync.health.parser;

import android.util.Pair;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.algo.AlgoUtils;
import com.huami.algo.HealthCompatNative;
import com.huami.algo.HealthNative;
import com.huami.algo.healthcare.HealthCare;
import com.huami.algo.jhmsignal.JhmSignal;
import com.huami.bioid.BioIdWrapper;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.AdditionalInfo;
import com.huami.ecg.core.model.BioIdFeedback;
import com.huami.ecg.core.model.BioIdRecord;
import com.huami.ecg.core.model.EcgHealthRecord;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.ecg.core.util.AppUtil;
import com.huami.ecg.sync.health.model.EcgInput;
import com.huami.ecg.sync.health.model.HwEcgRecord;
import com.huami.ecg.sync.health.model.SimplifyDeviceInfo;
import com.huami.ecg.sync.health.model.UserProfile;
import com.huami.ecg.util.DeviceUtils;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J6\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H\u0002J*\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J(\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u001e\u001a\u00020\u00118\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/ecg/sync/health/parser/EcgDataParser;", "", "Lcom/huami/ecg/core/db/entity/EcgData;", "item", "Lcom/huami/ecg/sync/health/model/EcgInput;", "ecgInput", "Lcom/huami/ecg/sync/health/model/UserProfile;", "userProfile", "", GoogleApiAvailabilityLight.a, "Lcom/huami/ecg/core/model/EcgHealthRecord;", "record", "Lcom/huami/ecg/core/model/AdditionalInfo;", "a", "", "bioIdTimestamp", "b", "", "userId", "Landroid/util/Pair;", "Ljava/io/File;", "bioIdSample", "c", "healthRecord", "Lcom/huami/ecg/sync/health/model/SimplifyDeviceInfo;", "deviceInfo", "createEcgData", "", "normalizedEcgUVData", "getEcgHealthRecord", "TAG", "Ljava/lang/String;", "", "SECOND_UNIT", LogUtil.I, "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgDataParser {
    public static final EcgDataParser INSTANCE = new EcgDataParser();
    public static final int SECOND_UNIT = 1000;

    @NotNull
    public static final String TAG = "EcgDataParser";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ EcgHealthRecord a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EcgHealthRecord ecgHealthRecord) {
            super(0);
            this.a = ecgHealthRecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "use cache record:" + this.a.getCom.huami.ecg.core.model.EcgHealthRecord.z java.lang.String() + "," + this.a.getHr();
        }
    }

    private EcgDataParser() {
    }

    private final AdditionalInfo a(EcgHealthRecord record, EcgInput ecgInput) {
        AdditionalInfo additionalInfo = new AdditionalInfo();
        additionalInfo.setMNoisyPercent(record.getNoisyPercent());
        additionalInfo.setMNoisySection(record.getNoisySection());
        additionalInfo.setRPeaksNum(record.getRrPeaks());
        additionalInfo.setEcgQualityFlag(record.getEcgQualityFlag());
        List<Integer> lodData = ecgInput.getLodData();
        if ((lodData != null ? lodData.size() : 0) > 0) {
            List<Integer> lodData2 = ecgInput.getLodData();
            if (lodData2 == null) {
                Intrinsics.throwNpe();
            }
            int size = lodData2.size();
            additionalInfo.setMLod(new int[size]);
            for (int i = 0; i < size; i++) {
                int[] mLod = additionalInfo.getMLod();
                if (mLod == null) {
                    Intrinsics.throwNpe();
                }
                List<Integer> lodData3 = ecgInput.getLodData();
                if (lodData3 == null) {
                    Intrinsics.throwNpe();
                }
                mLod[i] = lodData3.get(i).intValue();
            }
        }
        if (!DeviceUtils.INSTANCE.isJHSSeries(ecgInput.getDeviceSource()) || ecgInput.getOnline()) {
            additionalInfo.setAFibResult(record.getMAppAFib());
        } else {
            additionalInfo.setAFibResult(record.getMFwAFib());
        }
        AppUtil appUtil = AppUtil.INSTANCE;
        additionalInfo.setMAppVer(appUtil.getVersionName(EcgCore.INSTANCE.getContext()));
        additionalInfo.setMPhoneModel(appUtil.getPhoneModel());
        additionalInfo.setMSysVer(appUtil.getOSVersion());
        if (!ecgInput.getOnline()) {
            return additionalInfo;
        }
        additionalInfo.setLostPackage(ecgInput.getSensorRecord().getLostPackage());
        if (ecgInput.getSensorRecord().getSensorTimeInMills() > 0) {
            additionalInfo.setSensorTimeInMills(ecgInput.getSensorRecord().getSensorTimeInMills());
            additionalInfo.setSensorDataLength(ecgInput.getSensorRecord().getSensorDataLength());
            additionalInfo.setAppDataLength(ecgInput.getSensorRecord().getAppDataLength());
            additionalInfo.setAppTimeInMills(ecgInput.getSensorRecord().getAppTimeInMills());
        }
        return additionalInfo;
    }

    private final void b(EcgInput ecgInput, EcgData item, long bioIdTimestamp) {
        if (ecgInput.isAlgoBioIdMatched() || !item.isOnline()) {
            item.setBioIdFeedback(new BioIdFeedback(bioIdTimestamp, ecgInput.isAlgoBioIdMatched()));
        } else {
            item.setBioIdFeedback(new BioIdFeedback(bioIdTimestamp, ecgInput.getUserAsBioIdMatched()));
        }
        if (!Intrinsics.areEqual(item.getMeasureContentType(), MeasureContentType.BIO_ID) || ecgInput.getBioIdGroupId() <= 0) {
            return;
        }
        item.setBioIdRecord(new BioIdRecord(ecgInput.getBioIdGroupId(), ecgInput.getAsBioId() ? 1 : 0));
    }

    private final void c(EcgData item, EcgInput ecgInput, String userId, Pair<Long, File> bioIdSample) {
        boolean[] zArrVerifyBioId = BioIdWrapper.INSTANCE.verifyBioId(userId, ecgInput.getEcgRawData());
        boolean z = true;
        if (!zArrVerifyBioId[0] && zArrVerifyBioId[1]) {
            z = false;
        }
        ecgInput.setAlgoBioIdMatched(z);
        ecgInput.setBioIdGroupId(z ? ((Number) bioIdSample.first).longValue() : ecgInput.getBioIdGroupId());
        ecgInput.setAsBioId(false);
        b(ecgInput, item, ((Number) bioIdSample.first).longValue());
    }

    private final void d(EcgData item, EcgInput ecgInput, UserProfile userProfile) {
        File file;
        Long l;
        BioIdWrapper bioIdWrapper = BioIdWrapper.INSTANCE;
        if (bioIdWrapper.isBioIdOn(ecgInput.getOnline(), ecgInput.getDeviceSource())) {
            item.setBioIdMatchedType(ecgInput.isAlgoBioIdMatched() || ecgInput.getUserAsBioIdMatched(), ecgInput.getBadECG());
            Pair<Long, File> bioSampleFile = bioIdWrapper.getBioSampleFile(ecgInput.getUserId());
            long jLongValue = (bioSampleFile == null || (l = (Long) bioSampleFile.first) == null) ? -1L : l.longValue();
            if (item.isOnline()) {
                b(ecgInput, item, jLongValue);
                item.setNoneBioIdSelf(ecgInput.getNoneBioIdSelf());
                if (item.isNoneBioIdSelf()) {
                    BioIdWrapper.setBioINoneSelf$default(bioIdWrapper, item.getTimestamp(), null, 2, null);
                    return;
                }
                return;
            }
            if (bioSampleFile == null || (file = (File) bioSampleFile.second) == null || !file.exists()) {
                b(ecgInput, item, jLongValue);
            } else {
                c(item, ecgInput, userProfile.getUserId(), bioSampleFile);
            }
        }
    }

    @Nullable
    public final EcgData createEcgData(@NotNull EcgInput ecgInput, @NotNull EcgHealthRecord healthRecord, @NotNull UserProfile userProfile, @Nullable SimplifyDeviceInfo deviceInfo) {
        EcgData ecgData = new EcgData();
        ecgData.setDeviceSource(ecgInput.getDeviceSource());
        ecgData.setSampleRate(250);
        List<Float> ecgRawData = ecgInput.getEcgRawData();
        ecgData.setMeasureSecond((ecgRawData != null ? ecgRawData.size() : 0) / 250);
        ecgData.setUserAttention(0);
        ecgData.setCalendar(ecgInput.getTimestamp());
        ecgData.setMeasureContentType(ecgInput.getMeasureContentType());
        ecgData.setOnline(ecgInput.getOnline());
        ecgData.setAlgoVersion(AlgoUtils.INSTANCE.getHealthVer());
        ecgData.setWearPosition(userProfile.getWearingWay());
        ecgData.setUserId(userProfile.getUserId());
        ecgData.setLocalUpdatedTime(System.currentTimeMillis());
        if (MeasureContentType.INSTANCE.isProbe(ecgInput.getMeasureContentType())) {
            ecgData.setGroupId(ecgInput.getGroupId());
        }
        ecgData.setHealthRecord(healthRecord);
        ecgData.setAdditionalInfo(a(healthRecord, ecgInput));
        if (deviceInfo != null) {
            AdditionalInfo additionalInfo = ecgData.getAdditionalInfo();
            if (additionalInfo == null) {
                Intrinsics.throwNpe();
            }
            additionalInfo.setMFwVer(deviceInfo.getFirmwareVersionStr());
            ecgData.setDeviceId(deviceInfo.getDeviceID());
            ecgData.setDeviceSn(deviceInfo.getSerialNumber());
        }
        if (ecgInput.getErrorCode() != 0) {
            ecgData.setMErrorCode(ecgInput.getErrorCode());
        }
        d(ecgData, ecgInput, userProfile);
        return ecgData;
    }

    @NotNull
    public final EcgHealthRecord getEcgHealthRecord(@NotNull EcgInput ecgInput, @Nullable EcgHealthRecord healthRecord, @NotNull double[] normalizedEcgUVData, @NotNull UserProfile userProfile) {
        if (ecgInput.getOnline() && healthRecord != null) {
            HMLog.info(TAG, new a(healthRecord));
            return healthRecord;
        }
        if (!DeviceUtils.INSTANCE.isJHSSeries(ecgInput.getDeviceSource())) {
            HealthCompatNative healthCompatNative = HealthCompatNative.INSTANCE;
            HealthCare healthCareCreate = healthCompatNative.create(userProfile);
            EcgHealthRecord health = healthCompatNative.parseHealth(ecgInput.getTimestamp().getTimeInMillis(), healthCareCreate, userProfile, normalizedEcgUVData, 0);
            healthCareCreate.deinitFilter();
            healthCareCreate.dispose();
            return health;
        }
        JhmSignal jhmInstance = HealthNative.INSTANCE.getJhmInstance();
        jhmInstance.initFilter();
        EcgHealthRecord jhmHealth = HealthCompatNative.INSTANCE.parseJhmHealth(ecgInput.getTimestamp().getTimeInMillis(), jhmInstance, userProfile, normalizedEcgUVData, 0);
        HwEcgRecord hwEcgRecord = new HwEcgRecord();
        if (hwEcgRecord.setValue(ecgInput.getExtRawData())) {
            jhmHealth.setMFwAFib(hwEcgRecord.getAfib());
            jhmHealth.setHr(hwEcgRecord.getHr());
        }
        jhmInstance.deinitFilter();
        return jhmHealth;
    }
}
