package com.huami.ecg.core.util;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.AdditionalInfo;
import com.huami.ecg.core.model.Diagnosis;
import com.huami.ecg.core.model.EcgAnalysisStatus;
import com.huami.ecg.core.model.ProbeGroupItem;
import com.huami.ecg.core.model.SeniorInterpretResult;
import com.huami.ecg.core.model.constant.EcgIsSelf;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.ecg.util.DeviceUtils;
import com.huami.tools.log.HMLog;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0004\u001a\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\f\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\t\u001a\n\u0010\u0012\u001a\u00020\u0011*\u00020\t\u001a\u000e\u0010\u0014\u001a\u00020\n*\u0004\u0018\u00010\u0013H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0015*\u0004\u0018\u00010\t\u001a\f\u0010\u0018\u001a\u00020\u0015*\u0004\u0018\u00010\u0017\u001a\f\u0010\u0019\u001a\u00020\u0015*\u00020\u0011H\u0002\u001a\u0012\u0010\u001b\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015\"\u0016\u0010\u001d\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001c¨\u0006\u001e"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "safeGson", "(Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/String;", "floatStr", "", "parseFloat", "defaultFloat", "Lcom/huami/ecg/core/db/entity/EcgData;", "", "isNoisyByRRPeaks", "Lcom/huami/ecg/core/model/AdditionalInfo;", "Lcom/huami/ecg/core/model/ProbeGroupItem;", "getProbeGroupInfo", "Lcom/huami/ecg/core/model/constant/EcgIsSelf;", "getEcgIsSelf", "", "getAFibDiagnosis", "", "isNullOrEmpty", "Lcom/huami/ecg/core/model/EcgAnalysisStatus;", "getAnalysisStatus", "Lcom/huami/ecg/core/model/SeniorInterpretResult;", "getSeniorAnalysisStatus", "a", "status", "combine", "Ljava/lang/String;", "TAG", "ecg-core_release"}, k = 2, mv = {1, 4, 0})
public final class EcgUtilKt {
    private static final String a = "EcgUtil";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "parseFloat error：numberFormat null, use default value";
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
            return "parseFloat error：" + this.a.getMessage();
        }
    }

    private static final EcgAnalysisStatus a(int i) {
        if (i != 0) {
            return i != 1 ? EcgAnalysisStatus.Analysising.INSTANCE : EcgAnalysisStatus.SUCCESS.INSTANCE;
        }
        return EcgAnalysisStatus.FAIL.INSTANCE;
    }

    @NotNull
    public static final EcgAnalysisStatus combine(@NotNull EcgAnalysisStatus ecgAnalysisStatus, @NotNull EcgAnalysisStatus ecgAnalysisStatus2) {
        if ((ecgAnalysisStatus instanceof EcgAnalysisStatus.Analysising) || (ecgAnalysisStatus2 instanceof EcgAnalysisStatus.Analysising)) {
            return EcgAnalysisStatus.Analysising.INSTANCE;
        }
        if ((ecgAnalysisStatus instanceof EcgAnalysisStatus.SUCCESS) || (ecgAnalysisStatus2 instanceof EcgAnalysisStatus.SUCCESS)) {
            return EcgAnalysisStatus.SUCCESS.INSTANCE;
        }
        return ((ecgAnalysisStatus instanceof EcgAnalysisStatus.FAIL) || (ecgAnalysisStatus2 instanceof EcgAnalysisStatus.FAIL)) ? EcgAnalysisStatus.FAIL.INSTANCE : EcgAnalysisStatus.NotAnalysis.INSTANCE;
    }

    public static final int getAFibDiagnosis(@NotNull EcgData ecgData) {
        AdditionalInfo additionalInfo = ecgData.getAdditionalInfo();
        if (additionalInfo != null) {
            return additionalInfo.getAFibResult();
        }
        return -1;
    }

    @NotNull
    public static final EcgAnalysisStatus getAnalysisStatus(@Nullable EcgData ecgData) {
        Diagnosis diagnosis;
        EcgAnalysisStatus ecgAnalysisStatusA;
        return (ecgData == null || (diagnosis = ecgData.getCom.huami.ecg.core.db.entity.EcgData.DIAGNOSIS java.lang.String()) == null || (ecgAnalysisStatusA = a(diagnosis.getResult())) == null) ? EcgAnalysisStatus.NotAnalysis.INSTANCE : ecgAnalysisStatusA;
    }

    @NotNull
    public static final EcgIsSelf getEcgIsSelf(@NotNull EcgData ecgData) {
        if (ecgData.getCom.huami.ecg.core.db.entity.EcgData.BIOID_FEEDBACK java.lang.String() == null || !DeviceUtils.INSTANCE.isECGMiliFamily(ecgData.getDeviceSource())) {
            return EcgIsSelf.GONE;
        }
        return ecgData.isSelf() ? EcgIsSelf.IS_SELF : EcgIsSelf.NOT_SELF;
    }

    @Nullable
    public static final ProbeGroupItem getProbeGroupInfo(@NotNull AdditionalInfo additionalInfo) {
        try {
            return (ProbeGroupItem) new Gson().fromJson(additionalInfo.getMProbeGroup(), ProbeGroupItem.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public static final EcgAnalysisStatus getSeniorAnalysisStatus(@Nullable SeniorInterpretResult seniorInterpretResult) {
        EcgAnalysisStatus ecgAnalysisStatusA;
        return (seniorInterpretResult == null || (ecgAnalysisStatusA = a(seniorInterpretResult.getResult())) == null) ? EcgAnalysisStatus.NotAnalysis.INSTANCE : ecgAnalysisStatusA;
    }

    public static final boolean isNoisyByRRPeaks(@NotNull EcgData ecgData) {
        if (ecgData.getAdditionalInfo() == null) {
            return false;
        }
        if (MeasureContentType.INSTANCE.isProbeGroup(ecgData.getMeasureContentType())) {
            AdditionalInfo additionalInfo = ecgData.getAdditionalInfo();
            if ((additionalInfo != null ? getProbeGroupInfo(additionalInfo) : null) != null) {
                AdditionalInfo additionalInfo2 = ecgData.getAdditionalInfo();
                if (additionalInfo2 == null) {
                    Intrinsics.throwNpe();
                }
                ProbeGroupItem probeGroupInfo = getProbeGroupInfo(additionalInfo2);
                if (probeGroupInfo == null) {
                    Intrinsics.throwNpe();
                }
                return probeGroupInfo.getCardiacRisk() < ((float) 15);
            }
        }
        if (DeviceUtils.INSTANCE.isJHSSeries(ecgData.getDeviceSource())) {
            AdditionalInfo additionalInfo3 = ecgData.getAdditionalInfo();
            if (additionalInfo3 == null) {
                Intrinsics.throwNpe();
            }
            if (additionalInfo3.getAFibResult() == 7) {
                return true;
            }
        }
        AdditionalInfo additionalInfo4 = ecgData.getAdditionalInfo();
        if (additionalInfo4 == null) {
            Intrinsics.throwNpe();
        }
        if (additionalInfo4.getRPeaksNum() >= 15) {
            return false;
        }
        AdditionalInfo additionalInfo5 = ecgData.getAdditionalInfo();
        if (additionalInfo5 == null) {
            Intrinsics.throwNpe();
        }
        return additionalInfo5.getMNoisyPercent() > 50;
    }

    public static final boolean isNullOrEmpty(@Nullable float[] fArr) {
        if (fArr != null) {
            if (!(fArr.length == 0)) {
                return false;
            }
        }
        return true;
    }

    public static final float parseFloat(@Nullable String str) {
        return parseFloat(str, 0.0f);
    }

    @Nullable
    public static final /* synthetic */ <T> T safeGson(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            Gson gson = new Gson();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) gson.fromJson(str, (Class) Object.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final float parseFloat(@Nullable String str, float f) {
        try {
            Number number = NumberFormat.getNumberInstance(Locale.ENGLISH).parse(str);
            if (number != null) {
                return number.floatValue();
            }
            HMLog.error$default(a, null, null, a.a, 6, null);
            return f;
        } catch (Exception e) {
            e.printStackTrace();
            HMLog.error$default(a, null, null, new b(e), 6, null);
        }
    }

    @Nullable
    public static final /* synthetic */ <T> String safeGson(@Nullable T t) {
        if (t != null) {
            return new Gson().toJson(t);
        }
        return null;
    }
}
