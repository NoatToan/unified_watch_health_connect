package com.huami.ecg.core.model;

import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b'\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0007¢\u0006\u0004\b\\\u0010]J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00103\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\"\u00107\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002088\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R\"\u0010G\u001a\u0002088\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010:\u001a\u0004\bE\u0010<\"\u0004\bF\u0010>R\"\u0010K\u001a\u0002088\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010:\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R\"\u0010O\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010\u001e\u001a\u0004\bM\u0010 \"\u0004\bN\u0010\"R\"\u0010S\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010\u001e\u001a\u0004\bQ\u0010 \"\u0004\bR\u0010\"R\"\u0010W\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010\u001e\u001a\u0004\bU\u0010 \"\u0004\bV\u0010\"R\"\u0010[\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010\u001e\u001a\u0004\bY\u0010 \"\u0004\bZ\u0010\"¨\u0006_"}, d2 = {"Lcom/huami/ecg/core/model/ProbeGroupItem;", "Ljava/io/Serializable;", "", "toString", "", "a", "J", "getGroupId", "()J", "setGroupId", "(J)V", EcgData.GROUP_ID, "b", "getMeasureSecond", "setMeasureSecond", "measureSecond", "c", "getEndSecondTime", "setEndSecondTime", "endSecondTime", GoogleApiAvailabilityLight.a, "getNoiseSecond", "setNoiseSecond", "noiseSecond", "e", "getRPeaksNums", "setRPeaksNums", "rPeaksNums", "", "f", LogUtil.I, "getAnsType", "()I", "setAnsType", "(I)V", "ansType", "", "g", LogUtil.D, "getLf", "()D", "setLf", "(D)V", "lf", "h", "getHf", "setHf", "hf", "i", "getTp", "setTp", "tp", z.j, "getHeartAgeRev", "setHeartAgeRev", "heartAgeRev", "", hl.k, "F", "getCardiacRisk", "()F", "setCardiacRisk", "(F)V", "cardiacRisk", "l", "getHr", "setHr", Constants.DATA_KEY_HR, "m", "getCardiacStrength", "setCardiacStrength", "cardiacStrength", GoogleApiAvailabilityLight.b, "getFatigue", "setFatigue", "fatigue", "o", "getCardiacRiskNums", "setCardiacRiskNums", "cardiacRiskNums", b.r, "getHrNums", "setHrNums", "hrNums", DTransferConstants.SEARCH_KEY, "getCardiacStrengthNums", "setCardiacStrengthNums", "cardiacStrengthNums", "r", "getFatigueNums", "setFatigueNums", "fatigueNums", "<init>", "()V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class ProbeGroupItem implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(EcgData.GROUP_ID)
    private long groupId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("measureSecond")
    private long measureSecond;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("endSecondTime")
    private long endSecondTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("noiseSecond")
    private long noiseSecond;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("rPeaksNums")
    private long rPeaksNums = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("ansType")
    private int ansType = -1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("lf")
    private double lf;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("hf")
    private double hf;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("tp")
    private double tp;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName("heartAge")
    private int heartAgeRev;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @SerializedName("cardiacRisk")
    private float cardiacRisk;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @SerializedName(Constants.DATA_KEY_HR)
    private float hr;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @SerializedName("cardiacStrength")
    private float cardiacStrength;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @SerializedName("fatigue")
    private float fatigue;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @SerializedName("cardiacRiskNums")
    private int cardiacRiskNums;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @SerializedName("hrNum")
    private int hrNums;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @SerializedName("cardiacStrengthNums")
    private int cardiacStrengthNums;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @SerializedName("fatigueNums")
    private int fatigueNums;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/ecg/core/model/ProbeGroupItem$Companion;", "", "Lcom/huami/ecg/core/db/entity/EcgData;", EcgAnalyticsManagerKt.ECG, "Lcom/huami/ecg/core/model/ProbeGroupItem;", "valueByEcg", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final ProbeGroupItem valueByEcg(@NotNull EcgData ecg) {
            AdditionalInfo additionalInfo = ecg.getEcgResultData().getCom.huami.ecg.core.model.EcgResultData.j java.lang.String();
            if (additionalInfo == null || TextUtils.isEmpty(additionalInfo.getMProbeGroup())) {
                return null;
            }
            return (ProbeGroupItem) new Gson().fromJson(additionalInfo.getMProbeGroup(), ProbeGroupItem.class);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getAnsType() {
        return this.ansType;
    }

    public final float getCardiacRisk() {
        return this.cardiacRisk;
    }

    public final int getCardiacRiskNums() {
        return this.cardiacRiskNums;
    }

    public final float getCardiacStrength() {
        return this.cardiacStrength;
    }

    public final int getCardiacStrengthNums() {
        return this.cardiacStrengthNums;
    }

    public final long getEndSecondTime() {
        return this.endSecondTime;
    }

    public final float getFatigue() {
        return this.fatigue;
    }

    public final int getFatigueNums() {
        return this.fatigueNums;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final int getHeartAgeRev() {
        return this.heartAgeRev;
    }

    public final double getHf() {
        return this.hf;
    }

    public final float getHr() {
        return this.hr;
    }

    public final int getHrNums() {
        return this.hrNums;
    }

    public final double getLf() {
        return this.lf;
    }

    public final long getMeasureSecond() {
        return this.measureSecond;
    }

    public final long getNoiseSecond() {
        return this.noiseSecond;
    }

    public final long getRPeaksNums() {
        return this.rPeaksNums;
    }

    public final double getTp() {
        return this.tp;
    }

    public final void setAnsType(int i) {
        this.ansType = i;
    }

    public final void setCardiacRisk(float f) {
        this.cardiacRisk = f;
    }

    public final void setCardiacRiskNums(int i) {
        this.cardiacRiskNums = i;
    }

    public final void setCardiacStrength(float f) {
        this.cardiacStrength = f;
    }

    public final void setCardiacStrengthNums(int i) {
        this.cardiacStrengthNums = i;
    }

    public final void setEndSecondTime(long j) {
        this.endSecondTime = j;
    }

    public final void setFatigue(float f) {
        this.fatigue = f;
    }

    public final void setFatigueNums(int i) {
        this.fatigueNums = i;
    }

    public final void setGroupId(long j) {
        this.groupId = j;
    }

    public final void setHeartAgeRev(int i) {
        this.heartAgeRev = i;
    }

    public final void setHf(double d) {
        this.hf = d;
    }

    public final void setHr(float f) {
        this.hr = f;
    }

    public final void setHrNums(int i) {
        this.hrNums = i;
    }

    public final void setLf(double d) {
        this.lf = d;
    }

    public final void setMeasureSecond(long j) {
        this.measureSecond = j;
    }

    public final void setNoiseSecond(long j) {
        this.noiseSecond = j;
    }

    public final void setRPeaksNums(long j) {
        this.rPeaksNums = j;
    }

    public final void setTp(double d) {
        this.tp = d;
    }

    @NotNull
    public String toString() {
        return "<GroupId: " + this.groupId + ", MeasureSecond: " + this.measureSecond + ", EndSecondTime: " + this.endSecondTime + ", NoiseSecond: " + this.noiseSecond + ", RPeaksNums: " + this.rPeaksNums + ", AnsType: " + this.ansType + ", Lf: " + this.lf + ", Hf: " + this.hf + ", Tp: " + this.tp + ", HeartAgeRev: " + this.heartAgeRev + ", CardiacRisk: " + this.cardiacRisk + ", Hr: " + this.hr + ", CardiacStrength: " + this.cardiacStrength + ", Fatigue: " + this.fatigue + ", CardiacRiskNums: " + this.cardiacRiskNums + ", HrNums: " + this.hrNums + ", CardiacStrengthNums: " + this.cardiacStrengthNums + ", FatigueNums: " + this.fatigueNums + SearchCriteria.GT;
    }
}
