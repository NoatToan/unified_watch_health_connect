package com.huami.algo;

import android.util.Pair;
import com.google.android.gms.common.Scopes;
import com.huami.algo.healthcare.HealthCare;
import com.huami.algo.healthcare.SmoothResult;
import com.huami.algo.jhmsignal.JhmSignal;
import com.huami.ecg.core.model.EcgHealthRecord;
import com.huami.ecg.core.model.constant.EcgConst;
import com.huami.ecg.sync.health.model.CardiacMeasure;
import com.huami.ecg.sync.health.model.HealthInfo;
import com.huami.ecg.sync.health.model.UserProfile;
import com.huami.ecg.util.NormalizedTools;
import com.huami.ecg.util.StandardScale;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJH\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0018\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\nJG\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u001e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0013H\u0000¢\u0006\u0004\b\u001f\u0010 J.\u0010#\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0011J.\u0010%\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0011R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/huami/algo/HealthCompatNative;", "", "Lcom/huami/algo/healthcare/HealthCare;", "nativePtr", "Lcom/huami/algo/HealthMeasure;", "getHealthParameter", "", "timestamp", "", "normalizedEcgUvData", "Lcom/huami/ecg/sync/health/model/UserProfile;", "userProfile", "Lcom/huami/ecg/core/model/EcgHealthRecord;", "getHealthRecord", "", "", "data", "", "source", "Landroid/util/Pair;", "coeff", Scopes.PROFILE, "", "setHealthParameter", "create", "", "doNormalize", "getEcgFilters$ecg_core_release", "(Lcom/huami/algo/healthcare/HealthCare;Ljava/util/List;Landroid/util/Pair;Z)Ljava/util/List;", "getEcgFilters", "Lcom/huami/algo/jhmsignal/JhmSignal;", "getJhmFilters$ecg_core_release", "(Lcom/huami/algo/jhmsignal/JhmSignal;Ljava/util/List;Landroid/util/Pair;)Ljava/util/List;", "getJhmFilters", "hwDataType", "parseHealth", "hwAFib", "parseJhmHealth", "", "a", "Ljava/lang/String;", "TAG", "b", "J", "TIMES_1000", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class HealthCompatNative {
    public static final HealthCompatNative INSTANCE = new HealthCompatNative();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "HealthNative";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long TIMES_1000 = 1000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "getHealthRecord after create";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "getHealthRecord exception:" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Pair a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Pair pair) {
            super(0);
            this.a = pair;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "coeff first:" + ((Integer) this.a.first) + " coeff second:" + ((Integer) this.a.second);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ double[] b;
        public final /* synthetic */ int c;
        public final /* synthetic */ float d;
        public final /* synthetic */ int e;
        public final /* synthetic */ EcgHealthRecord f;
        public final /* synthetic */ int g;
        public final /* synthetic */ SmoothResult h;
        public final /* synthetic */ int[] i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, double[] dArr, int i, float f, int i2, EcgHealthRecord ecgHealthRecord, int i3, SmoothResult smoothResult, int[] iArr) {
            super(0);
            this.a = j;
            this.b = dArr;
            this.c = i;
            this.d = f;
            this.e = i2;
            this.f = ecgHealthRecord;
            this.g = i3;
            this.h = smoothResult;
            this.i = iArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            int[] rPeaksPosition;
            StringBuilder sb = new StringBuilder();
            sb.append("ecg:");
            sb.append(this.a);
            sb.append(',');
            sb.append(this.b.length);
            sb.append(",hr:");
            sb.append(this.c);
            sb.append(",algoHrv:");
            sb.append(this.d);
            sb.append(',');
            sb.append("hwDataType:");
            sb.append(this.e);
            sb.append(",appAFib:");
            sb.append(this.f.getMAppAFib());
            sb.append(",noise:");
            sb.append(this.g);
            sb.append(',');
            sb.append("rPeak:");
            SmoothResult smoothResult = this.h;
            sb.append((smoothResult == null || (rPeaksPosition = smoothResult.getRPeaksPosition()) == null) ? null : Integer.valueOf(rPeaksPosition.length));
            sb.append(",pos:");
            int[] iArr = this.i;
            sb.append(iArr != null ? Integer.valueOf(iArr.length) : null);
            sb.append(',');
            sb.append("CardiacMeasure risk: ");
            sb.append(this.f.getCardiacRisk());
            sb.append(",length: ");
            sb.append(this.f.getCardiacStrength());
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ double[] b;
        public final /* synthetic */ int c;
        public final /* synthetic */ float d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ com.huami.algo.jhmsignal.SmoothResult g;
        public final /* synthetic */ int[] h;
        public final /* synthetic */ EcgHealthRecord i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, double[] dArr, int i, float f, int i2, int i3, com.huami.algo.jhmsignal.SmoothResult smoothResult, int[] iArr, EcgHealthRecord ecgHealthRecord) {
            super(0);
            this.a = j;
            this.b = dArr;
            this.c = i;
            this.d = f;
            this.e = i2;
            this.f = i3;
            this.g = smoothResult;
            this.h = iArr;
            this.i = ecgHealthRecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            int[] rPeaksPosition;
            StringBuilder sb = new StringBuilder();
            sb.append("JHM ecg:");
            sb.append(this.a);
            sb.append(',');
            sb.append(this.b.length);
            sb.append(",hr:");
            sb.append(this.c);
            sb.append(",algoHrv:");
            sb.append(this.d);
            sb.append(',');
            sb.append("hwAFib:");
            sb.append(this.e);
            sb.append(",noise:");
            sb.append(this.f);
            sb.append(",rPeak:");
            com.huami.algo.jhmsignal.SmoothResult smoothResult = this.g;
            sb.append((smoothResult == null || (rPeaksPosition = smoothResult.getRPeaksPosition()) == null) ? null : Integer.valueOf(rPeaksPosition.length));
            sb.append(',');
            sb.append("pos:");
            int[] iArr = this.h;
            sb.append(iArr != null ? Integer.valueOf(iArr.length) : null);
            sb.append(",CardiacMeasure risk: ");
            sb.append(this.i.getCardiacRisk());
            sb.append(',');
            sb.append("length: ");
            sb.append(this.i.getCardiacStrength());
            return sb.toString();
        }
    }

    private HealthCompatNative() {
    }

    @NotNull
    public final HealthCare create(@Nullable UserProfile profile) {
        HealthCare healthCare = new HealthCare(250);
        healthCare.initFilter(true);
        healthCare.setSaturatedVoltage(5.07d);
        setHealthParameter(healthCare, profile);
        return healthCare;
    }

    @NotNull
    public final List<Float> getEcgFilters$ecg_core_release(@NotNull HealthCare nativePtr, @NotNull List<Float> data, @NotNull Pair<Integer, Integer> coeff, boolean doNormalize) {
        float[] fArrNormalizedFloatIfNeeded = NormalizedTools.INSTANCE.normalizedFloatIfNeeded(data, coeff, doNormalize);
        double[] dArr = new double[fArrNormalizedFloatIfNeeded.length];
        int length = fArrNormalizedFloatIfNeeded.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            dArr[i2] = fArrNormalizedFloatIfNeeded[i];
            i++;
            i2++;
        }
        double[] dArrSmooth = nativePtr.Smooth(dArr);
        ArrayList arrayList = new ArrayList();
        for (double d2 : dArrSmooth) {
            arrayList.add(Float.valueOf((float) d2));
        }
        return arrayList;
    }

    @NotNull
    public final HealthMeasure getHealthParameter(@Nullable HealthCare nativePtr) {
        if (nativePtr != null) {
            return new HealthMeasure(nativePtr.GetHealthMeasure());
        }
        throw new IllegalArgumentException();
    }

    @NotNull
    public final EcgHealthRecord getHealthRecord(long timestamp, @NotNull double[] normalizedEcgUvData, @NotNull UserProfile userProfile) {
        EcgHealthRecord health = null;
        try {
            HealthCare healthCareCreate = create(userProfile);
            HMLog.info(TAG, a.a);
            health = parseHealth(timestamp, healthCareCreate, userProfile, normalizedEcgUvData, 0);
            healthCareCreate.deinitFilter();
            healthCareCreate.dispose();
        } catch (Exception e2) {
            HMLog.info(TAG, new b(e2));
        }
        return health != null ? health : new EcgHealthRecord();
    }

    @NotNull
    public final List<Float> getJhmFilters$ecg_core_release(@NotNull JhmSignal nativePtr, @NotNull List<Float> data, @NotNull Pair<Integer, Integer> coeff) {
        HMLog.info(TAG, new c(coeff));
        ArrayList arrayList = new ArrayList(data.size());
        Iterator<Float> it2 = data.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(nativePtr.smoothOnline(it2.next().floatValue())));
        }
        return arrayList;
    }

    @NotNull
    public final EcgHealthRecord parseHealth(long timestamp, @NotNull HealthCare nativePtr, @NotNull UserProfile profile, @NotNull double[] normalizedEcgUvData, int hwDataType) {
        EcgHealthRecord ecgHealthRecord = new EcgHealthRecord();
        ArrayList arrayList = new ArrayList(normalizedEcgUvData.length);
        for (double d2 : normalizedEcgUvData) {
            arrayList.add(Float.valueOf((float) d2));
        }
        SmoothResult smoothResultSmoothHisWithRPeaks = nativePtr.smoothHisWithRPeaks(CollectionsKt___CollectionsKt.toFloatArray(arrayList));
        int noisePercent = nativePtr.getNoisePercent();
        int[] noisePosition = nativePtr.getNoisePosition();
        int averageHR = nativePtr.getAverageHR();
        float hRVRmssd = nativePtr.getHRVRmssd();
        ecgHealthRecord.setNoisyPercent(noisePercent);
        ecgHealthRecord.setNoisySection(noisePosition != null ? noisePosition.length : -1);
        if (smoothResultSmoothHisWithRPeaks != null && smoothResultSmoothHisWithRPeaks.getRPeaksPosition() != null) {
            int[] rPeaksPosition = smoothResultSmoothHisWithRPeaks.getRPeaksPosition();
            ecgHealthRecord.setRrPeaks(rPeaksPosition != null ? rPeaksPosition.length : -1);
        }
        ecgHealthRecord.setEcgQualityFlag(nativePtr.getEcgQualityFlag());
        if (smoothResultSmoothHisWithRPeaks != null) {
            ecgHealthRecord.setMAppAFib(smoothResultSmoothHisWithRPeaks.getAfibResult());
        }
        if (normalizedEcgUvData.length >= EcgConst.ECG_CARDIAC_LENGTH) {
            CardiacMeasure cardiacMeasure = new CardiacMeasure(nativePtr.GetCardiacMeasure());
            ecgHealthRecord.setAnsType(cardiacMeasure.getAnsType());
            ecgHealthRecord.setCardiacRisk(cardiacMeasure.getCardiacRisk());
            ecgHealthRecord.setCardiacStrength(cardiacMeasure.getCardiacStrength());
            ecgHealthRecord.setHeartAgeRev((int) cardiacMeasure.getCardiacAge());
            ecgHealthRecord.setFf(cardiacMeasure.getLF());
            ecgHealthRecord.setHf(cardiacMeasure.getHF());
            ecgHealthRecord.setTp(cardiacMeasure.getTP());
            StandardScale standardScale = StandardScale.INSTANCE;
            ecgHealthRecord.setCardiacStrenthScale(standardScale.getCardiacStrength(profile.getGender(), profile.getAge()));
            ecgHealthRecord.setCardiacRiskScale(standardScale.getCardiacRisk(profile.getAge()));
        }
        HMLog.info(TAG, new d(timestamp, normalizedEcgUvData, averageHR, hRVRmssd, hwDataType, ecgHealthRecord, noisePercent, smoothResultSmoothHisWithRPeaks, noisePosition));
        ecgHealthRecord.setFatigue(hRVRmssd);
        ecgHealthRecord.setHr(averageHR);
        ecgHealthRecord.setHrvScale(StandardScale.INSTANCE.getHRV(profile.getGender(), profile.getAge()));
        return ecgHealthRecord;
    }

    @NotNull
    public final EcgHealthRecord parseJhmHealth(long timestamp, @NotNull JhmSignal nativePtr, @NotNull UserProfile profile, @NotNull double[] normalizedEcgUvData, int hwAFib) {
        int[] rPeaksPosition;
        EcgHealthRecord ecgHealthRecord = new EcgHealthRecord();
        ArrayList arrayList = new ArrayList(normalizedEcgUvData.length);
        for (double d2 : normalizedEcgUvData) {
            arrayList.add(Float.valueOf((float) d2));
        }
        float[] floatArray = CollectionsKt___CollectionsKt.toFloatArray(arrayList);
        com.huami.algo.jhmsignal.SmoothResult smoothResultSmoothHisWithRPeaks = nativePtr.smoothHisWithRPeaks(floatArray);
        int noisePercent = nativePtr.getNoisePercent();
        int[] noisePosition = nativePtr.getNoisePosition();
        int averageHR = nativePtr.getAverageHR();
        float hRVRmssd = nativePtr.getHRVRmssd();
        ecgHealthRecord.setNoisyPercent(noisePercent);
        int length = -1;
        ecgHealthRecord.setNoisySection(noisePosition != null ? noisePosition.length : -1);
        if (smoothResultSmoothHisWithRPeaks != null && (rPeaksPosition = smoothResultSmoothHisWithRPeaks.getRPeaksPosition()) != null) {
            length = rPeaksPosition.length;
        }
        ecgHealthRecord.setRrPeaks(length);
        if (smoothResultSmoothHisWithRPeaks != null) {
            ecgHealthRecord.setMAppAFib(nativePtr.getAfJudgeEcg(floatArray));
        }
        if (normalizedEcgUvData.length >= EcgConst.ECG_CARDIAC_LENGTH) {
            HealthCare healthCareCreate = create(profile);
            healthCareCreate.LoadECG(normalizedEcgUvData);
            CardiacMeasure cardiacMeasure = new CardiacMeasure(healthCareCreate.GetCardiacMeasure());
            ecgHealthRecord.setAnsType(cardiacMeasure.getAnsType());
            ecgHealthRecord.setCardiacRisk(cardiacMeasure.getCardiacRisk());
            ecgHealthRecord.setCardiacStrength(cardiacMeasure.getCardiacStrength());
            ecgHealthRecord.setHeartAgeRev((int) cardiacMeasure.getCardiacAge());
            ecgHealthRecord.setFf(cardiacMeasure.getLF());
            ecgHealthRecord.setHf(cardiacMeasure.getHF());
            ecgHealthRecord.setTp(cardiacMeasure.getTP());
            StandardScale standardScale = StandardScale.INSTANCE;
            ecgHealthRecord.setCardiacStrenthScale(standardScale.getCardiacStrength(profile.getGender(), profile.getAge()));
            ecgHealthRecord.setCardiacRiskScale(standardScale.getCardiacRisk(profile.getAge()));
        }
        HMLog.info(TAG, new e(timestamp, normalizedEcgUvData, averageHR, hRVRmssd, hwAFib, noisePercent, smoothResultSmoothHisWithRPeaks, noisePosition, ecgHealthRecord));
        ecgHealthRecord.setFatigue(hRVRmssd);
        ecgHealthRecord.setHr(averageHR);
        ecgHealthRecord.setHrvScale(StandardScale.INSTANCE.getHRV(profile.getGender(), profile.getAge()));
        return ecgHealthRecord;
    }

    public final void setHealthParameter(@Nullable HealthCare nativePtr, @Nullable UserProfile profile) {
        if (nativePtr == null) {
            throw new IllegalArgumentException();
        }
        HealthInfo healthInfo = profile != null ? profile.getHealthInfo() : null;
        if (profile == null || healthInfo == null) {
            return;
        }
        nativePtr.setHealthParameter(profile.getGender() == 0, healthInfo.isHtn(), healthInfo.isDiab(), healthInfo.isSmk(), profile.getAge(), healthInfo.getBpsys() < 0 ? 0 : healthInfo.getBpsys(), healthInfo.getBpdias() < 0 ? 0 : healthInfo.getBpdias(), healthInfo.getTolColCoff(), healthInfo.getHdColCoff(), profile.getHeight(), profile.getWeight(), 0, 0.0f);
    }

    @Nullable
    public final EcgHealthRecord getHealthRecord(long timestamp, @Nullable List<Float> data, @Nullable UserProfile userProfile, int source, @Nullable Pair<Integer, Integer> coeff) {
        if ((data == null || data.isEmpty()) || userProfile == null || coeff == null) {
            return null;
        }
        return getHealthRecord(timestamp, NormalizedTools.INSTANCE.normalizedUvData(coeff, data, false), userProfile);
    }
}
