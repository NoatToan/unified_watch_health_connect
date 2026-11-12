package com.huami.algo;

import android.content.Context;
import android.util.Pair;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.ecg.core.util.EcgRawFileOp;
import com.huami.ecg.sync.health.model.HealthInfo;
import com.huami.ecg.sync.health.model.UserProfile;
import com.huami.ecg.util.DeviceUtils;
import com.huami.ecg.util.EcgMathTools;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J(\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0002J@\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJD\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\bJ\u0016\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010#R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010'\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010#¨\u0006,"}, d2 = {"Lcom/huami/algo/WaveFilterWrapper;", "", "Lcom/huami/ecg/core/db/entity/EcgData;", "item", "Lcom/huami/ecg/core/model/FilterRecord;", "record", "", "uid", "", "b", "", "timestamp", "", "a", "model", "remove", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "UVFilePath", "isCache", "isAdvance", "isSnapShotFilter", "loadFilters", "Landroid/util/Pair;", "", "coff", "", "", "srcRawData", "timeStamp", "isLeft", "buildEnrolledWithHand", "Ljava/io/File;", "getSmoothModelFile", "Ljava/lang/String;", "TAG", "J", "MIN_VALID_FILE_LENGTH", "CACHE_LENGTH", GoogleApiAvailabilityLight.a, "CACHE_VER", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class WaveFilterWrapper {
    public static final WaveFilterWrapper INSTANCE = new WaveFilterWrapper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "WaveFilterWrapper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long MIN_VALID_FILE_LENGTH = 3750;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final long CACHE_LENGTH = 13500;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String CACHE_VER = "v3";

    private WaveFilterWrapper() {
    }

    private final float[] a(String uid, long timestamp) {
        File smoothModelFile = getSmoothModelFile(uid, timestamp);
        if (!smoothModelFile.exists()) {
            return null;
        }
        List<Float> floatListWithFile = EcgRawFileOp.INSTANCE.getFloatListWithFile(smoothModelFile);
        if (!floatListWithFile.isEmpty()) {
            return CollectionsKt___CollectionsKt.toFloatArray(floatListWithFile);
        }
        HMLog.e(TAG, "getSmoothModelRaw failed:" + uid, new Object[0]);
        return null;
    }

    private final boolean b(EcgData item, FilterRecord record, String uid) {
        EcgRawFileOp ecgRawFileOp = EcgRawFileOp.INSTANCE;
        File ecgFilterFile = ecgRawFileOp.getEcgFilterFile(uid + CACHE_VER, item.getTimestamp());
        if (ecgFilterFile == null) {
            return true;
        }
        try {
            ecgRawFileOp.saveFloatArrayData(ecgFilterFile, CollectionsKt___CollectionsKt.toFloatArray(record.getFilter()));
            HMLog.d(TAG, "FILTER_CACHE:" + ecgFilterFile.getName() + " saved:" + ecgFilterFile.length(), new Object[0]);
            return true;
        } catch (IOException e) {
            HMLog.e(TAG, "save filter catch io exception" + e.getMessage(), new Object[0]);
            return false;
        }
    }

    private final boolean c(String uid, float[] model, long timestamp, boolean remove) {
        File smoothModelFile = getSmoothModelFile(uid, timestamp);
        if (smoothModelFile.exists() && remove) {
            smoothModelFile.delete();
        }
        boolean zSaveFloatArrayData = EcgRawFileOp.INSTANCE.saveFloatArrayData(smoothModelFile, model);
        if (!zSaveFloatArrayData) {
            HMLog.e(TAG, "saveSmoothModel failed:" + uid, new Object[0]);
        }
        return zSaveFloatArrayData;
    }

    public final boolean buildEnrolledWithHand(@NotNull String uid, @Nullable Pair<Integer, Integer> coff, @Nullable List<Float> srcRawData, long timeStamp, boolean isLeft) {
        if (srcRawData == null) {
            throw new IllegalArgumentException();
        }
        float[] fArrBuildEnrolledWithHand = WaveFilterNative.INSTANCE.buildEnrolledWithHand(srcRawData, coff, isLeft);
        if (fArrBuildEnrolledWithHand == null) {
            return false;
        }
        c(uid, fArrBuildEnrolledWithHand, timeStamp, true);
        return true;
    }

    @NotNull
    public final File getSmoothModelFile(@NotNull String uid, long timestamp) {
        return EcgRawFileOp.INSTANCE.getBioIDPath(uid + "_smooth_" + timestamp + ".m");
    }

    @Nullable
    public final FilterRecord loadFilters(@NotNull Context context, @NotNull EcgData item, @NotNull String UVFilePath, @NotNull String uid, boolean isCache, boolean isAdvance, boolean isSnapShotFilter) throws Throwable {
        float[] fArrA;
        EcgRawFileOp ecgRawFileOp = EcgRawFileOp.INSTANCE;
        List<Float> normalizedUVData = ecgRawFileOp.readNormalizedUVData(new File(UVFilePath));
        int size = normalizedUVData.size();
        if (size == 0) {
            return null;
        }
        boolean z = true;
        if (!isSnapShotFilter && isCache) {
            File ecgFilterFile = ecgRawFileOp.getEcgFilterFile(uid + CACHE_VER, item.getTimestamp());
            if (ecgFilterFile == null || !ecgFilterFile.exists() || ((int) ecgFilterFile.length()) <= CACHE_LENGTH) {
                HMLog.d(TAG, "FILTER_CACHE:" + item + ".timestamp not exists," + size, new Object[0]);
            } else {
                List<Float> floatListWithFile = ecgRawFileOp.getFloatListWithFile(ecgFilterFile);
                if (!floatListWithFile.isEmpty()) {
                    ArrayList arrayList = new ArrayList(normalizedUVData.size());
                    Iterator<Float> it2 = normalizedUVData.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Float.valueOf(it2.next().floatValue() / 1000));
                    }
                    HMLog.d(TAG, "FILTER_CACHE:" + ecgFilterFile.getName() + " exists:" + floatListWithFile.size() + "," + arrayList.size(), new Object[0]);
                    return new FilterRecord(floatListWithFile, arrayList, item.getDeviceSource());
                }
            }
        }
        if (isSnapShotFilter) {
            int[] stabilityRange = EcgMathTools.INSTANCE.getStabilityRange(size);
            normalizedUVData = normalizedUVData.subList(stabilityRange[0], stabilityRange[1]);
        }
        UserProfile userProfile = new UserProfile("", new HealthInfo(0, 0, 0, 0, 0, 0.0f, 0.0f, 127, null), null, 0, 0, 0, 0.0f, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
        FilterRecord filterRecordSmoothWithModel = (deviceUtils.isECGMiliFamily(item.getDeviceSource()) && userProfile.isMeasureHandMarked() && (fArrA = a(userProfile.getUserId(), userProfile.getMeasuretime())) != null) ? WaveFilterNative.INSTANCE.smoothWithModel(normalizedUVData, fArrA, item.getDeviceSource()) : null;
        if (filterRecordSmoothWithModel == null || filterRecordSmoothWithModel.getFilter().size() != normalizedUVData.size()) {
            filterRecordSmoothWithModel = deviceUtils.isECGMiliFamily(item.getDeviceSource()) ? WaveFilterNative.INSTANCE.smoothHis(normalizedUVData, isAdvance, item.getDeviceSource()) : WaveFilterNative.INSTANCE.smoothJhmHis(normalizedUVData, item.getDeviceSource());
            z = false;
        }
        if (isSnapShotFilter || !isCache || !z || filterRecordSmoothWithModel == null || filterRecordSmoothWithModel.getFilter().size() != size || b(item, filterRecordSmoothWithModel, uid)) {
            return filterRecordSmoothWithModel;
        }
        return null;
    }
}
