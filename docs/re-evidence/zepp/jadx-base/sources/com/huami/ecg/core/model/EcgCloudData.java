package com.huami.ecg.core.model;

import com.alipay.sdk.m.u.i;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.core.db.entity.EcgTagValue;
import com.huami.ecg.core.model.constant.BioIdMatchedType;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.ecg.core.model.constant.MeasurePosture;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.loc.z;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\"\u0010\"\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010B\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\b\"\u0004\bA\u0010\nR\"\u0010F\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\b\"\u0004\bE\u0010\nR\"\u0010H\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010\nR\"\u0010M\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0015\u001a\u0004\bK\u0010\u0017\"\u0004\bL\u0010\u0019R\"\u0010Q\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0015\u001a\u0004\bO\u0010\u0017\"\u0004\bP\u0010\u0019R\"\u0010U\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\b\"\u0004\bT\u0010\nR\"\u0010Y\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010\u000e\u001a\u0004\bW\u0010\u0010\"\u0004\bX\u0010\u0012R\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010\u0015\u001a\u0004\bc\u0010\u0017\"\u0004\bd\u0010\u0019R\"\u0010i\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bf\u0010\u000e\u001a\u0004\bg\u0010\u0010\"\u0004\bh\u0010\u0012R$\u0010p\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010\u0015\u001a\u0004\br\u0010\u0017\"\u0004\bs\u0010\u0019R\"\u0010x\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bu\u0010\u0015\u001a\u0004\bv\u0010\u0017\"\u0004\bw\u0010\u0019R\"\u0010|\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\by\u0010\u0015\u001a\u0004\bz\u0010\u0017\"\u0004\b{\u0010\u0019R#\u0010\u0080\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b}\u0010\u0015\u001a\u0004\b~\u0010\u0017\"\u0004\b\u007f\u0010\u0019R(\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010\u0015\u001a\u0005\b\u0082\u0001\u0010\u0017\"\u0005\b\u0083\u0001\u0010\u0019R,\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u0090\u0001\u001a\u00030\u008d\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0017\u0010\u0094\u0001\u001a\u00030\u0091\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001¨\u0006\u0097\u0001"}, d2 = {"Lcom/huami/ecg/core/model/EcgCloudData;", "", "", "toString", "", "a", LogUtil.I, "getDeviceSource", "()I", "setDeviceSource", "(I)V", "deviceSource", "", "b", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "timestamp", "c", "Ljava/lang/String;", "getTimeZone", "()Ljava/lang/String;", "setTimeZone", "(Ljava/lang/String;)V", "timeZone", GoogleApiAvailabilityLight.a, "getMeasureContentType", "setMeasureContentType", "measureContentType", "e", "getGroupId", "setGroupId", EcgData.GROUP_ID, "f", "getBioIdMatchedType", "setBioIdMatchedType", "bioIdMatchedType", "Lcom/huami/ecg/core/model/BioIdFeedback;", "g", "Lcom/huami/ecg/core/model/BioIdFeedback;", "getBioIdFeedback", "()Lcom/huami/ecg/core/model/BioIdFeedback;", "setBioIdFeedback", "(Lcom/huami/ecg/core/model/BioIdFeedback;)V", EcgData.BIOID_FEEDBACK, "Lcom/huami/ecg/core/model/Diagnosis;", "h", "Lcom/huami/ecg/core/model/Diagnosis;", "getDiagnosis", "()Lcom/huami/ecg/core/model/Diagnosis;", "setDiagnosis", "(Lcom/huami/ecg/core/model/Diagnosis;)V", EcgData.DIAGNOSIS, "Lcom/huami/ecg/core/model/MeasureState;", "i", "Lcom/huami/ecg/core/model/MeasureState;", "getMeasureState", "()Lcom/huami/ecg/core/model/MeasureState;", "setMeasureState", "(Lcom/huami/ecg/core/model/MeasureState;)V", EcgData.MEASURE_STATE, z.j, "getMeasureMethodType", "setMeasureMethodType", "measureMethodType", hl.k, "getUserAttention", "setUserAttention", "userAttention", "l", EcgData.IS_CONTAIN_PPG, "setContainPPG", "m", "getMeasurePosture", "setMeasurePosture", "measurePosture", GoogleApiAvailabilityLight.b, "getWearPosition", "setWearPosition", EcgData.WEAR_POSITION, "o", "getSampleRate", "setSampleRate", BehaviorTaggingWebApi.g.s, b.r, "getMeasureSecond", "setMeasureSecond", "measureSecond", "Lcom/huami/ecg/core/model/EcgResultData;", DTransferConstants.SEARCH_KEY, "Lcom/huami/ecg/core/model/EcgResultData;", "getResultData", "()Lcom/huami/ecg/core/model/EcgResultData;", "setResultData", "(Lcom/huami/ecg/core/model/EcgResultData;)V", EcgData.RESULT_DATA, "r", "getServerRawUri", "setServerRawUri", "serverRawUri", SOAP.XMLNS, "getServerUpdatedTime", "setServerUpdatedTime", "serverUpdatedTime", "t", "Ljava/lang/Integer;", "getErrorCode", "()Ljava/lang/Integer;", "setErrorCode", "(Ljava/lang/Integer;)V", "errorCode", "u", "getDiseaseType", "setDiseaseType", EcgData.DISEASE_TYPE, "v", "getUserId", "setUserId", "userId", "w", "getDeviceId", "setDeviceId", "deviceId", "x", "getSn", "setSn", "sn", "y", "getEcgTag", "setEcgTag", "ecgTag", "Lcom/huami/ecg/core/model/EcgExData;", "z", "Lcom/huami/ecg/core/model/EcgExData;", "getExtraStatus", "()Lcom/huami/ecg/core/model/EcgExData;", "setExtraStatus", "(Lcom/huami/ecg/core/model/EcgExData;)V", EcgData.EXTRA_STATUS, "Lcom/huami/ecg/core/db/entity/EcgData;", "getEcg", "()Lcom/huami/ecg/core/db/entity/EcgData;", EcgAnalyticsManagerKt.ECG, "Lcom/huami/ecg/core/db/entity/EcgTag;", "getTag", "()Lcom/huami/ecg/core/db/entity/EcgTag;", "tag", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgCloudData {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("generatedTime")
    private long timestamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.GROUP_ID)
    private long groupId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.BIOID_FEEDBACK)
    @Nullable
    private BioIdFeedback bioIdFeedback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.DIAGNOSIS)
    @Nullable
    private Diagnosis diagnosis;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("online")
    private int measureMethodType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.USER_ATTENTION)
    private int userAttention;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.IS_CONTAIN_PPG)
    private int isContainPPG;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.TIMESTAMP_SERVER_UPDATED)
    private long serverUpdatedTime;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.ERROR_CODE)
    @Nullable
    private Integer errorCode;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.DISEASE_TYPE)
    @Nullable
    private String diseaseType;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
    @SerializedName("tagValue")
    @Nullable
    private String ecgTag;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.EXTRA_STATUS)
    @Nullable
    private EcgExData extraStatus;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("deviceSource")
    private int deviceSource = 4;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("timeZone")
    @NotNull
    private String timeZone = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("type")
    @NotNull
    private String measureContentType = MeasureContentType.HEART;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.BIOID_MATCHED_TYPE)
    @NotNull
    private String bioIdMatchedType = BioIdMatchedType.MATCHED;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.MEASURE_STATE)
    @NotNull
    private MeasureState measureState = new MeasureState();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.MEASURE_POSTURE)
    @NotNull
    private String measurePosture = MeasurePosture.INDOOR_STAND;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.WEAR_POSITION)
    @NotNull
    private String wearPosition = "LEFT_HAND";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.SAMPLE_RATE)
    private int sampleRate = 250;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.MEASURE_SECOND)
    private long measureSecond = 30;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.RESULT_DATA)
    @NotNull
    private EcgResultData resultData = new EcgResultData();

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @SerializedName(EcgData.SERVER_RAW_FILE_PATH)
    @NotNull
    private String serverRawUri = "";

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @SerializedName("userId")
    @NotNull
    private String userId = "";

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @SerializedName("deviceId")
    @NotNull
    private String deviceId = "";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @SerializedName("sn")
    @NotNull
    private String sn = "";

    public EcgCloudData() {
        long j = -1;
        this.timestamp = j;
        this.groupId = j;
        this.serverUpdatedTime = j;
    }

    @Nullable
    public final BioIdFeedback getBioIdFeedback() {
        return this.bioIdFeedback;
    }

    @NotNull
    public final String getBioIdMatchedType() {
        return this.bioIdMatchedType;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    public final Diagnosis getDiagnosis() {
        return this.diagnosis;
    }

    @Nullable
    public final String getDiseaseType() {
        return this.diseaseType;
    }

    @NotNull
    public final EcgData getEcg() {
        EcgData ecgData = new EcgData();
        ecgData.setDeviceSource(this.deviceSource);
        ecgData.setTimestamp(this.timestamp);
        ecgData.setTimeZone(this.timeZone);
        ecgData.setMeasureContentType(this.measureContentType);
        ecgData.setGroupId(this.groupId);
        ecgData.setBioIdMatchedType(this.bioIdMatchedType);
        ecgData.setBioIdFeedback(this.bioIdFeedback);
        ecgData.setDiagnosis(this.diagnosis);
        ecgData.setMeasureState(this.measureState);
        ecgData.setMeasureMethodType(this.measureMethodType);
        ecgData.setUserAttention(this.userAttention);
        ecgData.setMIsContainPPG(this.isContainPPG);
        ecgData.setMeasurePosture(this.measurePosture);
        ecgData.setWearPosition(this.wearPosition);
        ecgData.setSampleRate(this.sampleRate);
        ecgData.setMeasureSecond(this.measureSecond);
        ecgData.setEcgResultData(this.resultData);
        ecgData.setServerRawUri(this.serverRawUri);
        ecgData.setServerUpdatedTime(this.serverUpdatedTime);
        ecgData.setLocalUpdatedTime(this.serverUpdatedTime);
        Integer num = this.errorCode;
        ecgData.setMErrorCode(num != null ? num.intValue() : 0);
        ecgData.setDiseaseType(this.diseaseType);
        ecgData.setUserId(this.userId);
        ecgData.setDeviceId(this.deviceId);
        ecgData.setDeviceSn(this.sn);
        ecgData.setExtraStatus(this.extraStatus);
        return ecgData;
    }

    @Nullable
    public final String getEcgTag() {
        return this.ecgTag;
    }

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final EcgExData getExtraStatus() {
        return this.extraStatus;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final String getMeasureContentType() {
        return this.measureContentType;
    }

    public final int getMeasureMethodType() {
        return this.measureMethodType;
    }

    @NotNull
    public final String getMeasurePosture() {
        return this.measurePosture;
    }

    public final long getMeasureSecond() {
        return this.measureSecond;
    }

    @NotNull
    public final MeasureState getMeasureState() {
        return this.measureState;
    }

    @NotNull
    public final EcgResultData getResultData() {
        return this.resultData;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    @NotNull
    public final String getServerRawUri() {
        return this.serverRawUri;
    }

    public final long getServerUpdatedTime() {
        return this.serverUpdatedTime;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final EcgTag getTag() {
        EcgTag ecgTag = new EcgTag();
        ecgTag.setEcgId(this.timestamp);
        ecgTag.setSynced(1);
        ecgTag.setValue((EcgTagValue) new Gson().fromJson(this.ecgTag, EcgTagValue.class));
        return ecgTag;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getUserAttention() {
        return this.userAttention;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getWearPosition() {
        return this.wearPosition;
    }

    /* JADX INFO: renamed from: isContainPPG, reason: from getter */
    public final int getIsContainPPG() {
        return this.isContainPPG;
    }

    public final void setBioIdFeedback(@Nullable BioIdFeedback bioIdFeedback) {
        this.bioIdFeedback = bioIdFeedback;
    }

    public final void setBioIdMatchedType(@NotNull String str) {
        this.bioIdMatchedType = str;
    }

    public final void setContainPPG(int i) {
        this.isContainPPG = i;
    }

    public final void setDeviceId(@NotNull String str) {
        this.deviceId = str;
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setDiagnosis(@Nullable Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public final void setDiseaseType(@Nullable String str) {
        this.diseaseType = str;
    }

    public final void setEcgTag(@Nullable String str) {
        this.ecgTag = str;
    }

    public final void setErrorCode(@Nullable Integer num) {
        this.errorCode = num;
    }

    public final void setExtraStatus(@Nullable EcgExData ecgExData) {
        this.extraStatus = ecgExData;
    }

    public final void setGroupId(long j) {
        this.groupId = j;
    }

    public final void setMeasureContentType(@NotNull String str) {
        this.measureContentType = str;
    }

    public final void setMeasureMethodType(int i) {
        this.measureMethodType = i;
    }

    public final void setMeasurePosture(@NotNull String str) {
        this.measurePosture = str;
    }

    public final void setMeasureSecond(long j) {
        this.measureSecond = j;
    }

    public final void setMeasureState(@NotNull MeasureState measureState) {
        this.measureState = measureState;
    }

    public final void setResultData(@NotNull EcgResultData ecgResultData) {
        this.resultData = ecgResultData;
    }

    public final void setSampleRate(int i) {
        this.sampleRate = i;
    }

    public final void setServerRawUri(@NotNull String str) {
        this.serverRawUri = str;
    }

    public final void setServerUpdatedTime(long j) {
        this.serverUpdatedTime = j;
    }

    public final void setSn(@NotNull String str) {
        this.sn = str;
    }

    public final void setTimeZone(@NotNull String str) {
        this.timeZone = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setUserAttention(int i) {
        this.userAttention = i;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void setWearPosition(@NotNull String str) {
        this.wearPosition = str;
    }

    @NotNull
    public String toString() {
        return "EcgCloudData{deviceSource=" + this.deviceSource + ", timestamp=" + this.timestamp + ", timeZone='" + this.timeZone + "', measureContentType='" + this.measureContentType + "', groupId=" + this.groupId + ", bioIdMatchedType='" + this.bioIdMatchedType + "', bioIdFeedback=" + this.bioIdFeedback + ", diagnosis=" + this.diagnosis + ", measureState=" + this.measureState + ", measureMethodType=" + this.measureMethodType + ", userAttention=" + this.userAttention + ", isContainPPG=" + this.isContainPPG + ", measurePosture='" + this.measurePosture + "', wearPosition='" + this.wearPosition + "', sampleRate=" + this.sampleRate + ", measureSecond=" + this.measureSecond + ", resultData=" + this.resultData + ", serverRawUri='" + this.serverRawUri + "', serverUpdatedTime=" + this.serverUpdatedTime + ", errorCode=" + this.errorCode + ", diseaseType='" + this.diseaseType + "', ecgTag=" + this.ecgTag + ", extraStatus=" + this.extraStatus + i.d;
    }
}
