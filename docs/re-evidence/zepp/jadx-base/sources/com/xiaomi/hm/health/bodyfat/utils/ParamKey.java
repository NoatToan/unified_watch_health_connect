package com.xiaomi.hm.health.bodyfat.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b2\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004R\u0016\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0016\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0004R\u0016\u0010,\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0004R\u0016\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0004R\u0016\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0004R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0004R\u0016\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0004R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0004¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/utils/ParamKey;", "", "", "type", "Ljava/lang/String;", "items", ParamKey.createTime, "summary", ParamKey.heartRateData, ParamKey.impedance, "encryptImpedance", ParamKey.singleStress, "weight", ParamKey.weightId, "UID", "deviceSource", "deviceId", "age", ParamKey.fatRate, ParamKey.muscleRate, ParamKey.boneMass, ParamKey.metabolism, ParamKey.muscleAge, ParamKey.proteinRatio, ParamKey.standBodyWeight, ParamKey.visceralFat, ParamKey.bodyWaterRate, "bmi", "height", ParamKey.bodyScore, ParamKey.bodyStyle, ParamKey.oneFootMeasureTime, ParamKey.subcutaneousFat, ParamKey.skeletalMuscle, ParamKey.weightType, "userId", ParamKey.memberId, "generatedTime", ParamKey.dataSource, ParamKey.scale_avatar_id, ParamKey.measure_mode, ParamKey.weightData, "deviceType", ParamKey.deviceMac, ParamKey.deviceSn, "timeZone", "source", "startTime", ParamKey.uploadWorker, ParamKey.bodyBalanceScore, "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class ParamKey {

    @NotNull
    public static final ParamKey INSTANCE = new ParamKey();

    @NotNull
    public static final String UID = "UID";

    @NotNull
    public static final String age = "age";

    @NotNull
    public static final String bmi = "bmi";

    @NotNull
    public static final String bodyBalanceScore = "bodyBalanceScore";

    @NotNull
    public static final String bodyScore = "bodyScore";

    @NotNull
    public static final String bodyStyle = "bodyStyle";

    @NotNull
    public static final String bodyWaterRate = "bodyWaterRate";

    @NotNull
    public static final String boneMass = "boneMass";

    @NotNull
    public static final String createTime = "createTime";

    @NotNull
    public static final String dataSource = "dataSource";

    @NotNull
    public static final String deviceId = "deviceId";

    @NotNull
    public static final String deviceMac = "deviceMac";

    @NotNull
    public static final String deviceSn = "deviceSn";

    @NotNull
    public static final String deviceSource = "deviceSource";

    @NotNull
    public static final String deviceType = "deviceType";

    @NotNull
    public static final String encryptImpedance = "encryptImpedance";

    @NotNull
    public static final String fatRate = "fatRate";

    @NotNull
    public static final String generatedTime = "generatedTime";

    @NotNull
    public static final String heartRateData = "heartRateData";

    @NotNull
    public static final String height = "height";

    @NotNull
    public static final String impedance = "impedance";

    @NotNull
    public static final String items = "items";

    @NotNull
    public static final String measure_mode = "measure_mode";

    @NotNull
    public static final String memberId = "memberId";

    @NotNull
    public static final String metabolism = "metabolism";

    @NotNull
    public static final String muscleAge = "muscleAge";

    @NotNull
    public static final String muscleRate = "muscleRate";

    @NotNull
    public static final String oneFootMeasureTime = "oneFootMeasureTime";

    @NotNull
    public static final String proteinRatio = "proteinRatio";

    @NotNull
    public static final String scale_avatar_id = "scale_avatar_id";

    @NotNull
    public static final String singleStress = "singleStress";

    @NotNull
    public static final String skeletalMuscle = "skeletalMuscle";

    @NotNull
    public static final String source = "source";

    @NotNull
    public static final String standBodyWeight = "standBodyWeight";

    @NotNull
    public static final String startTime = "startTime";

    @NotNull
    public static final String subcutaneousFat = "subcutaneousFat";

    @NotNull
    public static final String summary = "summary";

    @NotNull
    public static final String timeZone = "timeZone";

    @NotNull
    public static final String type = "type";

    @NotNull
    public static final String uploadWorker = "uploadWorker";

    @NotNull
    public static final String userId = "userId";

    @NotNull
    public static final String visceralFat = "visceralFat";

    @NotNull
    public static final String weight = "weight";

    @NotNull
    public static final String weightData = "weightData";

    @NotNull
    public static final String weightId = "weightId";

    @NotNull
    public static final String weightType = "weightType";

    private ParamKey() {
    }
}
