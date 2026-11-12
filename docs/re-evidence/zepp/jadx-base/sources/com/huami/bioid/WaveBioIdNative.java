package com.huami.bioid;

import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.algo.HealthNative;
import com.huami.algo.WaveFilterWrapper;
import com.huami.algo.healthcare.HealthCare;
import com.huami.algo.healthcare.ProcessResult;
import com.huami.ecg.EcgDataRepo;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.util.EcgRawFileOp;
import com.huami.ecg.core.util.EcgUtilKt;
import com.huami.ecg.sync.health.config.QLingConfig;
import com.huami.ecg.util.EcgCacheUtils;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b3\u00104J \u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u001f\u0010\u0012\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0002J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\tJ\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\tJ\u0016\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0002J\u0010\u0010$\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0002R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010%R\u0016\u0010'\u001a\u00020\u001d8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u001d8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010*\u001a\u00020\u001d8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010+\u001a\u00020\u001d8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u0010,\u001a\u00020\u001d8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010(R\u0016\u0010-\u001a\u00020\u001d8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010(R\u0016\u0010.\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010(R\u0016\u00100\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010(R\u0016\u00102\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010(¨\u00065"}, d2 = {"Lcom/huami/bioid/WaveBioIdNative;", "", "", "uid", "Lcom/huami/algo/healthcare/ProcessResult;", "result", "", "remove", "b", "", "a", "registerUvData", "matchUvData", "", "bookBioId", "", "lastTimestamp", "userId", "rebuildBioID", "(Ljava/lang/Long;Ljava/lang/String;)Z", "measuretime", "isLeft", "rebuildSmoothModel", "data", "upgradeBioID", "preBuildBioId", "inputUvData", "verifyBioId", "mod", "", "matchBioId", "Ljava/io/File;", "getBioModelFile", "timestamp", "", "updateBioIdSampleTime", "getBioIdSampleTime", "Ljava/lang/String;", "TAG", "UNDEFINE_ERROR_CODE", LogUtil.I, "PROCESS_RESULT_SUCCESS", "ADD_MODEL_FAILED", "BIOID_MATCH_SUCCESS", "BIOID_MATCH_FAILED", "BIOID_MATCH_BAD_QUALITY", "MAX_DATA_SIZE", "c", "SPLIT_DATA_START", GoogleApiAvailabilityLight.a, "SPLIT_DATA_STOP", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class WaveBioIdNative {
    public static final int ADD_MODEL_FAILED = 1;
    public static final int BIOID_MATCH_BAD_QUALITY = 2;
    public static final int BIOID_MATCH_FAILED = 1;
    public static final int BIOID_MATCH_SUCCESS = 0;
    public static final WaveBioIdNative INSTANCE = new WaveBioIdNative();
    public static final int PROCESS_RESULT_SUCCESS = 0;
    public static final int UNDEFINE_ERROR_CODE = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "WaveBioId";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int MAX_DATA_SIZE = 45000;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int SPLIT_DATA_START = 2500;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int SPLIT_DATA_STOP = 17500;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "bio model file not exists";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.LongRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.LongRef longRef) {
            super(0);
            this.a = longRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "bioid sample time:" + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "rebuildBioID user bioid list gone. Clear local stuff";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "rebuildBioID user bioid item gone after sync";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "rebuildSmoothModel user measuretime item gone after sync";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, long j, boolean z, boolean z2) {
            super(0);
            this.a = str;
            this.b = j;
            this.c = z;
            this.d = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "rebuildSmoothModel:" + this.a + ",measuretime:" + this.b + ",wearing:" + this.c + ",ret:" + this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "update bioid sample time:" + this.a;
        }
    }

    private WaveBioIdNative() {
    }

    private final float[] a(String uid) {
        File bioModelFile = getBioModelFile(uid);
        if (!bioModelFile.exists()) {
            HMLog.info(TAG, a.a);
            return null;
        }
        List<Float> floatListWithFile = EcgRawFileOp.INSTANCE.getFloatListWithFile(bioModelFile);
        if (!floatListWithFile.isEmpty()) {
            return CollectionsKt___CollectionsKt.toFloatArray(floatListWithFile);
        }
        HMLog.e(TAG, "getModel failed:" + uid, new Object[0]);
        return null;
    }

    private final boolean b(String uid, ProcessResult result, boolean remove) {
        File bioModelFile = getBioModelFile(uid);
        if (bioModelFile.exists() && remove) {
            bioModelFile.delete();
        }
        boolean zSaveFloatArrayData = EcgRawFileOp.INSTANCE.saveFloatArrayData(bioModelFile, result.getModel());
        if (!zSaveFloatArrayData) {
            HMLog.e(TAG, "saveModel failed:" + uid, new Object[0]);
        }
        return zSaveFloatArrayData;
    }

    public static /* synthetic */ long getBioIdSampleTime$default(WaveBioIdNative waveBioIdNative, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().userId();
        }
        return waveBioIdNative.getBioIdSampleTime(str);
    }

    public static /* synthetic */ boolean rebuildSmoothModel$default(WaveBioIdNative waveBioIdNative, long j, boolean z, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().userId();
        }
        return waveBioIdNative.rebuildSmoothModel(j, z, str);
    }

    public static /* synthetic */ void updateBioIdSampleTime$default(WaveBioIdNative waveBioIdNative, long j, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().userId();
        }
        waveBioIdNative.updateBioIdSampleTime(j, str);
    }

    @NotNull
    public final boolean[] bookBioId(@NotNull String uid, @Nullable float[] registerUvData, @Nullable float[] matchUvData) {
        if (TextUtils.isEmpty(uid) || EcgUtilKt.isNullOrEmpty(registerUvData) || EcgUtilKt.isNullOrEmpty(matchUvData)) {
            HMLog.e(TAG, "bookBioId invalid:" + uid, new Object[0]);
            return new boolean[]{false, false};
        }
        if (registerUvData == null) {
            Intrinsics.throwNpe();
        }
        if (matchUvData == null) {
            Intrinsics.throwNpe();
        }
        if (registerUvData.length > MAX_DATA_SIZE) {
            registerUvData = Arrays.copyOfRange(registerUvData, 2500, SPLIT_DATA_STOP);
        }
        if (matchUvData.length > MAX_DATA_SIZE) {
            matchUvData = Arrays.copyOfRange(matchUvData, 2500, SPLIT_DATA_STOP);
        }
        HealthCare healthCare = HealthNative.INSTANCE.getHealthCare(250);
        healthCare.initFilter(true);
        ProcessResult processResultBioIdPreProcess = healthCare.bioIdPreProcess(registerUvData);
        HMLog.i(TAG, "bookBioId bioIdPreProcess:" + processResultBioIdPreProcess.getCode() + ",reg:" + registerUvData.length + ",match:" + matchUvData.length + "," + processResultBioIdPreProcess.getModel().length, new Object[0]);
        if (processResultBioIdPreProcess.getCode() != 0) {
            HMLog.e(TAG, "bookBioId bioIdPreProcess failed:" + registerUvData.length + ":" + registerUvData[registerUvData.length / 2] + "," + matchUvData.length + ":" + matchUvData[matchUvData.length / 2], new Object[0]);
            healthCare.deinitFilter();
            healthCare.dispose();
            return new boolean[]{false, false};
        }
        if (healthCare.addModel(processResultBioIdPreProcess.getModel()) == 1) {
            HMLog.e(TAG, "bookBioId addModel failed:" + registerUvData.length + "," + matchUvData.length, new Object[0]);
            healthCare.deinitFilter();
            healthCare.dispose();
            return new boolean[]{false, false};
        }
        int iBioIdMatch = healthCare.bioIdMatch(matchUvData);
        healthCare.deinitFilter();
        healthCare.dispose();
        HMLog.i(TAG, "bookBioId:" + iBioIdMatch + "," + registerUvData.length + "," + matchUvData.length, new Object[0]);
        boolean[] zArr = new boolean[2];
        if (iBioIdMatch == 0) {
            boolean zB = b(uid, processResultBioIdPreProcess, true);
            zArr[0] = true;
            zArr[1] = zB;
        } else if (iBioIdMatch == 2) {
            zArr[0] = false;
            zArr[1] = false;
        } else {
            zArr[0] = false;
            zArr[1] = false;
        }
        return zArr;
    }

    public final long getBioIdSampleTime(@NotNull String userId) {
        Ref.LongRef longRef = new Ref.LongRef();
        long jLongValue = ((Number) EcgCacheUtils.INSTANCE.getCacheByUser(EcgCacheUtils.ECG_BIO_ID_SAMPLE, userId, -1L)).longValue();
        longRef.element = jLongValue;
        if (jLongValue < 0) {
            longRef.element = EcgCore.INSTANCE.getContext().getSharedPreferences(EcgCacheUtils.OLD_SP_FILE_NAME + userId, 0).getLong(EcgCacheUtils.ECG_BIO_ID_SAMPLE, -1L);
        }
        HMLog.info(TAG, new b(longRef));
        return longRef.element;
    }

    @NotNull
    public final File getBioModelFile(@NotNull String uid) {
        return EcgRawFileOp.INSTANCE.getBioIDPath(uid + "_bio.m");
    }

    public final int matchBioId(@NotNull float[] mod, @NotNull float[] inputUvData) {
        HealthCare healthCare = HealthNative.INSTANCE.getHealthCare(250);
        healthCare.initFilter(true);
        if (healthCare.addModel(mod) != 1) {
            int iBioIdMatch = healthCare.bioIdMatch(inputUvData);
            healthCare.deinitFilter();
            healthCare.dispose();
            return iBioIdMatch;
        }
        HMLog.e(TAG, "verifyBioId addModel failed:" + inputUvData.length, new Object[0]);
        healthCare.deinitFilter();
        healthCare.dispose();
        return -1;
    }

    @Nullable
    public final ProcessResult preBuildBioId(@NotNull float[] data) {
        HealthCare healthCare = HealthNative.INSTANCE.getHealthCare(250);
        healthCare.initFilter(true);
        ProcessResult processResultBioIdPreProcess = healthCare.bioIdPreProcess(data);
        HMLog.i(TAG, "upgradeBioID bioIdPreProcess:" + processResultBioIdPreProcess.getCode() + "," + processResultBioIdPreProcess.getModel().length, new Object[0]);
        if (processResultBioIdPreProcess.getCode() != 0) {
            HMLog.e(TAG, "upgradeBioID bioIdPreProcess failed:" + data.length, new Object[0]);
            healthCare.deinitFilter();
            healthCare.dispose();
            return null;
        }
        int iAddModel = healthCare.addModel(processResultBioIdPreProcess.getModel());
        healthCare.deinitFilter();
        healthCare.dispose();
        if (iAddModel != 1) {
            return processResultBioIdPreProcess;
        }
        HMLog.e(TAG, "upgradeBioID addModel failed:" + data.length, new Object[0]);
        return null;
    }

    public final boolean rebuildBioID(@Nullable Long lastTimestamp, @NotNull String userId) {
        if (lastTimestamp == null) {
            getBioModelFile(userId).delete();
            BioIdWrapper.INSTANCE.setId(-1L);
            HMLog.info(TAG, c.a);
            return true;
        }
        File ecgRawFile = new EcgDataRepo().getEcgRawFile(lastTimestamp.longValue());
        if (ecgRawFile == null || !ecgRawFile.exists()) {
            HMLog.info(TAG, d.a);
            return false;
        }
        File bioModelFile = getBioModelFile(userId);
        if (bioModelFile.exists()) {
            bioModelFile.delete();
        }
        boolean zUpgradeBioID = upgradeBioID(userId, EcgRawFileOp.INSTANCE.readNormalizedFloatUvData(ecgRawFile));
        if (zUpgradeBioID) {
            BioIdWrapper.INSTANCE.setId(lastTimestamp.longValue());
        }
        return zUpgradeBioID;
    }

    public final boolean rebuildSmoothModel(long measuretime, boolean isLeft, @NotNull String userId) {
        File ecgRawFile = new EcgDataRepo().getEcgRawFile(measuretime);
        if (ecgRawFile == null || !ecgRawFile.exists()) {
            HMLog.info(TAG, e.a);
            return false;
        }
        boolean zBuildEnrolledWithHand = WaveFilterWrapper.INSTANCE.buildEnrolledWithHand(userId, QLingConfig.INSTANCE.getCoeff(), EcgRawFileOp.INSTANCE.readNormalizedUVData(ecgRawFile), measuretime, isLeft);
        HMLog.info(TAG, new f(userId, measuretime, isLeft, zBuildEnrolledWithHand));
        return zBuildEnrolledWithHand;
    }

    public final void updateBioIdSampleTime(long timestamp, @NotNull String userId) {
        HMLog.info(TAG, new g(timestamp));
        EcgCacheUtils.INSTANCE.saveCacheByUser(EcgCacheUtils.ECG_BIO_ID_SAMPLE, userId, Long.valueOf(timestamp));
    }

    public final boolean upgradeBioID(@NotNull String uid, @Nullable float[] data) {
        if (!TextUtils.isEmpty(uid) && data != null) {
            if (!(data.length == 0)) {
                ProcessResult processResultPreBuildBioId = preBuildBioId(data);
                if (processResultPreBuildBioId != null) {
                    return b(uid, processResultPreBuildBioId, true);
                }
                return false;
            }
        }
        HMLog.e(TAG, "upgradeBioID invalid:" + uid, new Object[0]);
        return false;
    }

    @NotNull
    public final boolean[] verifyBioId(@NotNull String uid, @Nullable float[] inputUvData) {
        if (TextUtils.isEmpty(uid) || EcgUtilKt.isNullOrEmpty(inputUvData)) {
            HMLog.e(TAG, "verifyBioId invalid:" + uid, new Object[0]);
            return new boolean[]{false, false};
        }
        float[] fArrA = a(uid);
        if (EcgUtilKt.isNullOrEmpty(fArrA)) {
            StringBuilder sb = new StringBuilder();
            sb.append("verifyBioId model not exist:");
            if (inputUvData == null) {
                Intrinsics.throwNpe();
            }
            sb.append(inputUvData.length);
            HMLog.e(TAG, sb.toString(), new Object[0]);
            return new boolean[]{false, false};
        }
        if (fArrA == null) {
            Intrinsics.throwNpe();
        }
        if (inputUvData == null) {
            Intrinsics.throwNpe();
        }
        int iMatchBioId = matchBioId(fArrA, inputUvData);
        HMLog.i(TAG, "verifyBioId:" + iMatchBioId + "," + inputUvData.length, new Object[0]);
        if (iMatchBioId == -1) {
            return new boolean[]{false, false};
        }
        boolean[] zArr = new boolean[2];
        if (iMatchBioId == 0) {
            zArr[0] = true;
            zArr[1] = true;
        } else if (iMatchBioId == 2) {
            zArr[0] = false;
            zArr[1] = false;
        } else {
            zArr[0] = false;
            zArr[1] = true;
        }
        return zArr;
    }
}
