package com.huami.bioid;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.algo.HealthCompatNative;
import com.huami.algo.healthcare.HealthCare;
import com.huami.ecg.EcgDataRepo;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.util.EcgRawFileOp;
import com.huami.ecg.sync.health.config.QLingConfig;
import com.huami.ecg.util.EcgCacheUtils;
import com.huami.ecg.util.NormalizedTools;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J&\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002JH\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010JB\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u0015J\u001e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0015J\u001e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J \u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\r2\b\b\u0002\u0010\u001b\u001a\u00020\u000bJ\u0016\u0010 \u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000eJ\u0006\u0010!\u001a\u00020\tJ\u000e\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010%\u001a\u00020\u001cJ\u0018\u0010&\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010\u001b\u001a\u00020\u000bJ\u0010\u0010'\u001a\u00020\u001c2\b\b\u0002\u0010\u001b\u001a\u00020\u000bR\u0016\u0010)\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010(R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010*R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/huami/bioid/BioIdWrapper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "srcUvData", "matchedUvData", "", "a", "", "b", "", "uid", "Landroid/util/Pair;", "", "coff", "", "", "srcRawData", "comparedRawData", "bookBioId", "Ljava/io/File;", "pairFile", "regBioId", "upgradeBioID", "ecgRawData", "verifyBioId", "userId", "", "getBioSampleFile", "online", "deviceSource", "isBioIdOn", "isBioIDRegistered", "timestamp", "", WebConst.QueryParam.SET_ID, "getId", "setBioINoneSelf", "getBioidNoneSelf", "Ljava/lang/String;", "TAG", LogUtil.I, "MIN_LENGTH", "c", "Z", "ECG_BIOID", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class BioIdWrapper {
    public static final BioIdWrapper INSTANCE = new BioIdWrapper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "BioIdWrapper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int MIN_LENGTH = 1250;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final boolean ECG_BIOID = false;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "authenticateBioId input null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "verifyBioId: bioId gone";
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
            return "verifyBioId: ecg raw data is empty";
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
            return "verifyBioId: bioId gone";
        }
    }

    private BioIdWrapper() {
    }

    private final boolean[] a(Context context, double[] srcUvData, double[] matchedUvData) {
        if (context != null) {
            if ((srcUvData != null ? srcUvData.length : 0) >= MIN_LENGTH) {
                if ((matchedUvData != null ? matchedUvData.length : 0) >= MIN_LENGTH) {
                    HealthCare healthCareCreate = HealthCompatNative.INSTANCE.create(null);
                    boolean[] zArrAuthenticate = BioIDNative.INSTANCE.authenticate(context, healthCareCreate, srcUvData, matchedUvData);
                    healthCareCreate.deinitFilter();
                    healthCareCreate.dispose();
                    return zArrAuthenticate;
                }
            }
        }
        HMLog.info(TAG, a.a);
        return new boolean[]{false, false};
    }

    private final boolean b() {
        String strUserId = EcgCore.INSTANCE.getWebSetting().userId();
        if (TextUtils.isEmpty(strUserId)) {
            return false;
        }
        File bioModelFile = WaveBioIdNative.INSTANCE.getBioModelFile(strUserId);
        return bioModelFile.exists() && bioModelFile.length() > 0;
    }

    public static /* synthetic */ Pair getBioSampleFile$default(BioIdWrapper bioIdWrapper, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().userId();
        }
        return bioIdWrapper.getBioSampleFile(str);
    }

    public static /* synthetic */ long getBioidNoneSelf$default(BioIdWrapper bioIdWrapper, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().userId();
        }
        return bioIdWrapper.getBioidNoneSelf(str);
    }

    public static /* synthetic */ void setBioINoneSelf$default(BioIdWrapper bioIdWrapper, long j, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().userId();
        }
        bioIdWrapper.setBioINoneSelf(j, str);
    }

    @NotNull
    public final boolean[] bookBioId(@NotNull Context context, @NotNull String uid, @Nullable Pair<Integer, Integer> coff, @NotNull List<Float> srcRawData, @NotNull List<Float> comparedRawData) {
        WaveBioIdNative waveBioIdNative = WaveBioIdNative.INSTANCE;
        NormalizedTools normalizedTools = NormalizedTools.INSTANCE;
        return waveBioIdNative.bookBioId(uid, normalizedTools.normalizedUvFData(coff, comparedRawData, false), normalizedTools.normalizedUvFData(coff, srcRawData, false));
    }

    @Nullable
    public final Pair<Long, File> getBioSampleFile(@NotNull String userId) {
        EcgDataRepo ecgDataRepo = new EcgDataRepo();
        long bioIdSampleTime = WaveBioIdNative.INSTANCE.getBioIdSampleTime(userId);
        EcgData ecg = bioIdSampleTime > 0 ? ecgDataRepo.getEcg(bioIdSampleTime, userId) : null;
        if (ecg != null) {
            return new Pair<>(Long.valueOf(ecg.getTimestamp()), ecgDataRepo.getEcgRawFile(ecg));
        }
        HMLog.error$default(TAG, null, null, b.a, 6, null);
        return null;
    }

    public final long getBioidNoneSelf(@NotNull String userId) {
        long jLongValue = ((Number) EcgCacheUtils.INSTANCE.getCacheByUser(EcgCacheUtils.ECG_NONE_BIOID_SELF, userId, -1L)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return EcgCore.INSTANCE.getContext().getSharedPreferences(EcgCacheUtils.OLD_SP_FILE_NAME + userId, 0).getLong(EcgCacheUtils.ECG_NONE_BIOID_SELF, -1L);
    }

    public final long getId() {
        return WaveBioIdNative.getBioIdSampleTime$default(WaveBioIdNative.INSTANCE, null, 1, null);
    }

    public final boolean isBioIDRegistered() {
        return EcgCore.INSTANCE.getEcgDevice().isBioID() && getId() > 0 && b();
    }

    public final boolean isBioIdOn(boolean online, int deviceSource) {
        if (online) {
            return EcgCore.INSTANCE.getEcgDevice().isBioID();
        }
        return isBioIDRegistered() && EcgCore.INSTANCE.getEcgDevice().isECGMiliFamily(deviceSource);
    }

    public final void setBioINoneSelf(long timestamp, @NotNull String userId) {
        EcgCacheUtils.INSTANCE.saveCacheByUser(EcgCacheUtils.ECG_NONE_BIOID_SELF, userId, Long.valueOf(timestamp));
    }

    public final void setId(long timestamp) {
        WaveBioIdNative.updateBioIdSampleTime$default(WaveBioIdNative.INSTANCE, timestamp, null, 2, null);
    }

    public final boolean upgradeBioID(@NotNull Context context, @NotNull String uid, @NotNull File regBioId) {
        return WaveBioIdNative.INSTANCE.upgradeBioID(uid, EcgRawFileOp.INSTANCE.readNormalizedFloatUvData(regBioId));
    }

    @NotNull
    public final boolean[] verifyBioId(@NotNull String uid, @Nullable List<Float> ecgRawData) {
        File file;
        if (ecgRawData == null || ecgRawData.isEmpty()) {
            HMLog.info(TAG, c.a);
            return new boolean[]{false, false};
        }
        Pair<Long, File> bioSampleFile = getBioSampleFile(uid);
        if (bioSampleFile != null && (file = (File) bioSampleFile.second) != null && file.exists()) {
            return WaveBioIdNative.INSTANCE.verifyBioId(uid, NormalizedTools.INSTANCE.normalizedUvFData(QLingConfig.INSTANCE.getCoeff(), ecgRawData, true));
        }
        HMLog.info(TAG, d.a);
        return new boolean[]{false, false};
    }

    @NotNull
    public final boolean[] bookBioId(@NotNull Context context, @NotNull String uid, @Nullable Pair<Integer, Integer> coff, @NotNull List<Float> srcRawData, @NotNull File pairFile) {
        return WaveBioIdNative.INSTANCE.bookBioId(uid, NormalizedTools.INSTANCE.normalizedUvFData(coff, srcRawData, false), EcgRawFileOp.INSTANCE.readNormalizedFloatUvData(pairFile));
    }
}
