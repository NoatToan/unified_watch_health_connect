package com.huami.ecg.core.model;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b,\u0018\u0000 \u008a\u00012\u00020\u0001:\u0002\u008a\u0001B\t¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bJ\b\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R*\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R*\u0010&\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010*\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R*\u0010.\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R*\u00102\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R*\u00106\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010!\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R*\u0010:\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010!\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R*\u0010B\u001a\u00020;2\u0006\u0010\u001b\u001a\u00020;8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010F\u001a\u00020;2\u0006\u0010\u001b\u001a\u00020;8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010J\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0011\u001a\u0004\bH\u0010\u0013\"\u0004\bI\u0010\u0015R*\u0010N\u001a\u00020;2\u0006\u0010\u001b\u001a\u00020;8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR*\u0010R\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0011\u001a\u0004\bP\u0010\u0013\"\u0004\bQ\u0010\u0015R*\u0010V\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010\u0011\u001a\u0004\bT\u0010\u0013\"\u0004\bU\u0010\u0015R.\u0010^\u001a\u0004\u0018\u00010W2\b\u0010\u001b\u001a\u0004\u0018\u00010W8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R.\u0010f\u001a\u0004\u0018\u00010_2\b\u0010\u001b\u001a\u0004\u0018\u00010_8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR.\u0010j\u001a\u0004\u0018\u00010W2\b\u0010\u001b\u001a\u0004\u0018\u00010W8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bg\u0010Y\u001a\u0004\bh\u0010[\"\u0004\bi\u0010]R\u0016\u0010m\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\"\u0010q\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010\u0011\u001a\u0004\bo\u0010\u0013\"\u0004\bp\u0010\u0015R\"\u0010u\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010\u0011\u001a\u0004\bs\u0010\u0013\"\u0004\bt\u0010\u0015R\"\u0010y\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010\u0011\u001a\u0004\bw\u0010\u0013\"\u0004\bx\u0010\u0015R\"\u0010}\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010\u0011\u001a\u0004\b{\u0010\u0013\"\u0004\b|\u0010\u0015R$\u0010\u0081\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010\u0011\u001a\u0004\b\u007f\u0010\u0013\"\u0005\b\u0080\u0001\u0010\u0015R&\u0010\u0085\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010\u0011\u001a\u0005\b\u0083\u0001\u0010\u0013\"\u0005\b\u0084\u0001\u0010\u0015R\u0016\u0010\u0086\u0001\u001a\u00020\u000b8F@\u0006¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/huami/ecg/core/model/EcgHealthRecord;", "", "", "deltabpdias", "", "addDeltaBpdias", "datbpsys", "addDeltaBpsys", "", "getNoisyResult", "result", "", "setNoisyResult", "", "toString", "", "a", LogUtil.I, "getHrScore", "()I", "setHrScore", "(I)V", "hrScore", "b", "getHr", "setHr", Constants.DATA_KEY_HR, "value", "c", "getHeartAgeRev", "setHeartAgeRev", "heartAgeRev", GoogleApiAvailabilityLight.a, LogUtil.D, "getCardiacStrength", "()D", "setCardiacStrength", "(D)V", EcgHealthRecord.D, "e", "getCardiacRisk", "setCardiacRisk", EcgHealthRecord.E, "f", "getAnsType", "setAnsType", EcgHealthRecord.F, "g", "getFf", "setFf", "ff", "h", "getHf", "setHf", EcgHealthRecord.H, "i", "getTp", "setTp", "tp", "", z.j, "F", "getCvdRiskRev", "()F", "setCvdRiskRev", "(F)V", EcgHealthRecord.J, hl.k, "getStdCvdRisk", "setStdCvdRisk", EcgHealthRecord.K, "l", "getStress", "setStress", "stress", "m", "getFatigue", "setFatigue", EcgHealthRecord.z, GoogleApiAvailabilityLight.b, "getBpsys", "setBpsys", EcgHealthRecord.M, "o", "getBpdias", "setBpdias", EcgHealthRecord.N, "", com.google.android.exoplayer2.text.ttml.b.r, "[I", "getHrvScale", "()[I", "setHrvScale", "([I)V", "hrvScale", "", DTransferConstants.SEARCH_KEY, "[F", "getCardiacStrenthScale", "()[F", "setCardiacStrenthScale", "([F)V", "cardiacStrenthScale", "r", "getCardiacRiskScale", "setCardiacRiskScale", EcgHealthRecord.O, SOAP.XMLNS, "[J", "mNoisyResult", "t", "getNoisyPercent", "setNoisyPercent", "noisyPercent", "u", "getNoisySection", "setNoisySection", "noisySection", "v", "getRrPeaks", "setRrPeaks", "rrPeaks", "w", "getEcgQualityFlag", "setEcgQualityFlag", "ecgQualityFlag", "x", "getMAppAFib", "setMAppAFib", "mAppAFib", "y", "getMFwAFib", "setMFwAFib", "mFwAFib", "isGoodECGQuality", "()Z", "<init>", "()V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgHealthRecord {
    private static final String A = "heartScore";
    private static final String B = "heartRate";
    private static final String C = "heartAge";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String D = "cardiacStrength";
    private static final String E = "cardiacRisk";
    private static final String F = "ansType";
    private static final String G = "lf";
    private static final String H = "hf";
    private static final String I = "tp";
    private static final String J = "cvdRiskRev";
    private static final String K = "stdCvdRisk";
    private static final String L = "stress";
    private static final String M = "bpsys";
    public static final int MAX_HRV = 149;
    public static final int MIN_HRV = 1;
    private static final String N = "bpdias";
    private static final String O = "cardiacRiskScale";
    private static final String P = "cardiacStrengthScale";
    private static final String Q = "fatigueScale";
    private static final int R = 0;
    private static final int S = 300;
    private static final String z = "fatigue";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName(D)
    private double cardiacStrength;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName(G)
    private double ff;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName(H)
    private double hf;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("tp")
    private double tp;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @SerializedName(M)
    private int bpsys;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @SerializedName(N)
    private int bpdias;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @SerializedName(P)
    @Nullable
    private float[] cardiacStrenthScale;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @SerializedName(O)
    @Nullable
    private int[] cardiacRiskScale;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int noisyPercent;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private int noisySection;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private int rrPeaks;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(A)
    private int hrScore = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("heartRate")
    private int hr = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(C)
    private int heartAgeRev = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName(E)
    private int cardiacRisk = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName(F)
    private int ansType = -1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName(J)
    private float cvdRiskRev = -1.0f;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @SerializedName(K)
    private float stdCvdRisk = -1.0f;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @SerializedName("stress")
    private int stress = -1;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @SerializedName(z)
    private float fatigue = -1.0f;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @SerializedName(Q)
    @Nullable
    private int[] hrvScale = new int[0];

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private long[] mNoisyResult = {-1, -1};

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int ecgQualityFlag = 1;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int mAppAFib = -1;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int mFwAFib = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\bR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\bR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\b¨\u0006\""}, d2 = {"Lcom/huami/ecg/core/model/EcgHealthRecord$Companion;", "", "", EcgHealthRecord.z, "", "invalidFatigue", "", "ANS_TYPE", "Ljava/lang/String;", "BPDIAS", "BPSYS", "CARDIAC_RISCK_SCALE", "CARDIAC_RISK", "CARDIAC_STRENGTH", "CARDIAC_STRENGTH_SCALE", "CVD_RISK_REV", "FATIGUE", "FATIGUE_SCALE", "HEART_AGE", "HF", "HR", "HR_SCORE", "LF", "", "MAX_BP", LogUtil.I, "MAX_HRV", "MIN_BP", "MIN_HRV", "STD_CVD_RISK_REV", "STRESS", "TP", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public final boolean invalidFatigue(float fatigue) {
            return fatigue < ((float) 1) || fatigue > ((float) 149);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ double b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(double d) {
            super(0);
            this.b = d;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "bpdias is nan:" + this.b + ",origin:" + EcgHealthRecord.this.getBpdias();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ double a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(double d) {
            super(0);
            this.a = d;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "setDeltaBpsys is nan:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "bad ansType:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "setBpdias absBpdias:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "setBpsys absBpsys:" + this.b + ",origin:" + EcgHealthRecord.this.getBpsys();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "bad cardiacRisk:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "setCardiacRiskScale array is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ double a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(double d) {
            super(0);
            this.a = d;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "bad cardiacStrength:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "setCardiacStrengthScale array is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f) {
            super(0);
            this.a = f;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "cvdRiskRev is nan:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f) {
            super(0);
            this.a = f;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "fatigue is nan:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ double a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(double d) {
            super(0);
            this.a = d;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "bad lf:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "heartAgeRev is nan or max int:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ double a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(double d) {
            super(0);
            this.a = d;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "bad hf:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class o extends Lambda implements Function0<String> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "setHRVScale array is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class p extends Lambda implements Function0<String> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "EcgQuality: " + EcgHealthRecord.this.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ long[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(long[] jArr) {
            super(0);
            this.a = jArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "setNoisyResult result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ float a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(float f) {
            super(0);
            this.a = f;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "stdCvdRisk is nan:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ double a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(double d) {
            super(0);
            this.a = d;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "bad tp:" + this.a;
        }
    }

    public EcgHealthRecord() {
        double d2 = -1;
        this.cardiacStrength = d2;
        this.ff = d2;
        this.hf = d2;
        this.tp = d2;
    }

    public final void addDeltaBpdias(double deltabpdias) {
        if (Double.isNaN(deltabpdias)) {
            HMLog.warn$default("Health", null, new a(deltabpdias), 2, null);
        } else {
            setBpdias((int) (deltabpdias + ((double) this.bpdias)));
        }
    }

    public final void addDeltaBpsys(double datbpsys) {
        if (Double.isNaN(datbpsys)) {
            HMLog.warn$default("Health", null, new b(datbpsys), 2, null);
        } else {
            setBpsys((int) (datbpsys + ((double) this.bpsys)));
        }
    }

    public final int getAnsType() {
        return this.ansType;
    }

    public final int getBpdias() {
        return this.bpdias;
    }

    public final int getBpsys() {
        return this.bpsys;
    }

    public final int getCardiacRisk() {
        return this.cardiacRisk;
    }

    @Nullable
    public final int[] getCardiacRiskScale() {
        return this.cardiacRiskScale;
    }

    public final double getCardiacStrength() {
        return this.cardiacStrength;
    }

    @Nullable
    public final float[] getCardiacStrenthScale() {
        return this.cardiacStrenthScale;
    }

    public final float getCvdRiskRev() {
        return this.cvdRiskRev;
    }

    public final int getEcgQualityFlag() {
        return this.ecgQualityFlag;
    }

    public final float getFatigue() {
        return this.fatigue;
    }

    public final double getFf() {
        return this.ff;
    }

    public final int getHeartAgeRev() {
        return this.heartAgeRev;
    }

    public final double getHf() {
        return this.hf;
    }

    public final int getHr() {
        return this.hr;
    }

    public final int getHrScore() {
        return this.hrScore;
    }

    @Nullable
    public final int[] getHrvScale() {
        return this.hrvScale;
    }

    public final int getMAppAFib() {
        return this.mAppAFib;
    }

    public final int getMFwAFib() {
        return this.mFwAFib;
    }

    public final int getNoisyPercent() {
        return this.noisyPercent;
    }

    @NotNull
    /* JADX INFO: renamed from: getNoisyResult, reason: from getter */
    public final long[] getMNoisyResult() {
        return this.mNoisyResult;
    }

    public final int getNoisySection() {
        return this.noisySection;
    }

    public final int getRrPeaks() {
        return this.rrPeaks;
    }

    public final float getStdCvdRisk() {
        return this.stdCvdRisk;
    }

    public final int getStress() {
        return this.stress;
    }

    public final double getTp() {
        return this.tp;
    }

    public final boolean isGoodECGQuality() {
        boolean z2 = this.ecgQualityFlag == 1;
        if (!z2) {
            HMLog.info("EcgQuality", new p());
        }
        return z2;
    }

    public final void setAnsType(int i2) {
        if (i2 < 1 || i2 > 5) {
            HMLog.warn$default("Health", null, new c(i2), 2, null);
        }
        this.ansType = i2;
    }

    public final void setBpdias(int i2) {
        if (i2 < 0 || i2 > 300) {
            HMLog.warn$default("Health", null, new d(i2), 2, null);
        } else {
            this.bpdias = i2;
        }
    }

    public final void setBpsys(int i2) {
        if (i2 < 0 || i2 > 300) {
            HMLog.warn$default("Health", null, new e(i2), 2, null);
        } else {
            this.bpsys = i2;
        }
    }

    public final void setCardiacRisk(int i2) {
        if (i2 < 1 || i2 > 9) {
            HMLog.warn$default("Health", null, new f(i2), 2, null);
        }
        this.cardiacRisk = i2;
    }

    public final void setCardiacRiskScale(@Nullable int[] iArr) {
        if (iArr != null) {
            if (!(iArr.length == 0)) {
                this.cardiacRiskScale = iArr;
                return;
            }
        }
        HMLog.warn$default("Health", null, g.a, 2, null);
    }

    public final void setCardiacStrength(double d2) {
        if (Double.isNaN(d2) || d2 < 1 || d2 > 99) {
            HMLog.warn$default("Health", null, new h(d2), 2, null);
        } else {
            this.cardiacStrength = d2;
        }
    }

    public final void setCardiacStrenthScale(@Nullable float[] fArr) {
        if (fArr != null) {
            if (!(fArr.length == 0)) {
                this.cardiacStrenthScale = fArr;
                return;
            }
        }
        HMLog.warn$default("Health", null, i.a, 2, null);
    }

    public final void setCvdRiskRev(float f2) {
        if (Float.isNaN(f2)) {
            HMLog.warn$default("Health", null, new j(f2), 2, null);
        } else {
            this.cvdRiskRev = f2;
        }
    }

    public final void setEcgQualityFlag(int i2) {
        this.ecgQualityFlag = i2;
    }

    public final void setFatigue(float f2) {
        if (Float.isNaN(f2)) {
            HMLog.warn$default("Health", null, new k(f2), 2, null);
        } else {
            this.fatigue = f2;
        }
    }

    public final void setFf(double d2) {
        if (Double.isNaN(d2)) {
            HMLog.warn$default("Health", null, new l(d2), 2, null);
        } else {
            this.ff = d2;
        }
    }

    public final void setHeartAgeRev(int i2) {
        if (Integer.MAX_VALUE <= i2) {
            HMLog.warn$default("Health", null, new m(i2), 2, null);
        } else {
            this.heartAgeRev = i2;
        }
    }

    public final void setHf(double d2) {
        if (Double.isNaN(d2)) {
            HMLog.warn$default("Health", null, new n(d2), 2, null);
        } else {
            this.hf = d2;
        }
    }

    public final void setHr(int i2) {
        this.hr = i2;
    }

    public final void setHrScore(int i2) {
        this.hrScore = i2;
    }

    public final void setHrvScale(@Nullable int[] iArr) {
        if (iArr != null) {
            if (!(iArr.length == 0)) {
                this.hrvScale = iArr;
                return;
            }
        }
        HMLog.warn$default("Health", null, o.a, 2, null);
    }

    public final void setMAppAFib(int i2) {
        this.mAppAFib = i2;
    }

    public final void setMFwAFib(int i2) {
        this.mFwAFib = i2;
    }

    public final void setNoisyPercent(int i2) {
        this.noisyPercent = i2;
    }

    public final boolean setNoisyResult(@NotNull long[] result) {
        if (result.length < 2) {
            HMLog.warn$default("Health", null, new q(result), 2, null);
            return false;
        }
        this.mNoisyResult = result;
        return true;
    }

    public final void setNoisySection(int i2) {
        this.noisySection = i2;
    }

    public final void setRrPeaks(int i2) {
        this.rrPeaks = i2;
    }

    public final void setStdCvdRisk(float f2) {
        if (Float.isNaN(f2)) {
            HMLog.warn$default("Health", null, new r(f2), 2, null);
        } else {
            this.stdCvdRisk = f2;
        }
    }

    public final void setStress(int i2) {
        this.stress = i2;
    }

    public final void setTp(double d2) {
        if (Double.isNaN(d2)) {
            HMLog.warn$default("Health", null, new s(d2), 2, null);
        } else {
            this.tp = d2;
        }
    }

    @NotNull
    public String toString() {
        return "EcgHealthRecord [score:" + this.hrScore + "][HR:" + this.hr + "][heartAgeRev:" + this.heartAgeRev + "][cvdRiskRev:" + this.cvdRiskRev + "][stdCvdRisk:" + this.stdCvdRisk + "][Stress:" + this.stress + "][Fatigue:" + this.fatigue + "][Bpdias:" + this.bpdias + "][Bpsys:" + this.bpsys + "][noisy:" + this.mNoisyResult[0] + "," + this.mNoisyResult[1] + "]NoisyPercent:" + this.noisyPercent + ",NoisySection:" + this.noisySection + ",mRRPeaks:" + this.rrPeaks + ",mEcgQualityFlag:" + this.ecgQualityFlag + "]";
    }
}
