package com.mi.fitness.menstrual;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.fitness.menstrual.api.IMenstrualAlgo;
import com.mi.fitness.menstrual.data.MenstrualCycleInfo;
import com.mi.fitness.menstrual.data.MenstrualPredictDateRequest;
import com.mi.fitness.menstrual.data.MenstrualSettingRequest;
import com.mi.fitness.menstrual.data.TemperatureBasicInfo;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.onetrack.OneTrack;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0018H\u0016J\u0011\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0001H\u0086 J\u0017\u0010&\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0086 J?\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010)\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0086 J\u0011\u0010+\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0086 J\u0019\u0010,\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0086 J\t\u0010\u001d\u001a\u00020\u000bH\u0086 J\u0019\u0010-\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0086 J\t\u0010.\u001a\u00020\u000bH\u0086 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u00061"}, d2 = {"Lcom/mi/fitness/menstrual/MenstrualAlgoNative;", "Lcom/mi/fitness/menstrual/api/IMenstrualAlgo;", "<init>", "()V", "mTemperatureDataCallback", "Lcom/mi/fitness/menstrual/MenstrualAlgoNative$JniDataCallback;", "getMTemperatureDataCallback", "()Lcom/mi/fitness/menstrual/MenstrualAlgoNative$JniDataCallback;", "setMTemperatureDataCallback", "(Lcom/mi/fitness/menstrual/MenstrualAlgoNative$JniDataCallback;)V", "initialize", "", "currentDateSec", "", "menstrualSetting", "Lcom/mi/fitness/menstrual/data/MenstrualSettingRequest;", "menstrualPredictDate", "Lcom/mi/fitness/menstrual/data/MenstrualPredictDateRequest;", "dataList", "", "", "tempTrendTimeList", "temperatureDataCallback", "requestType", "", OneTrack.Param.TZ, "setTempFileList", "onAlgoStatusCallBack", "state", "onTemperatureCallBack", "data", "Lcom/mi/fitness/menstrual/data/TemperatureBasicInfo;", "onMenstrualCallBack", "Lcom/mi/fitness/menstrual/data/MenstrualCycleInfo;", "onErrorCallBack", "errorCode", "init", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "putTemperatureDataList", "setAlgoParams", "time", "timeList", "", "setMenstrualSettings", "setMenstrualPredictDate", "setTemperatureTime", CervicalMucusRecord.Appearance.CLEAR, "Companion", "JniDataCallback", "temperature_algo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenstrualAlgoNative implements IMenstrualAlgo {

    @NotNull
    public static final String TAG = "MenstrualAlgoNative";
    public static final int TYPE_REQUEST_ALL = 0;
    public static final int TYPE_REQUEST_MENSTRUAL = 2;
    public static final int TYPE_REQUEST_TEMP = 1;
    public JniDataCallback mTemperatureDataCallback;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/mi/fitness/menstrual/MenstrualAlgoNative$JniDataCallback;", "", "onTempParseResult", "", "temperatureBasicInfo", "Lcom/mi/fitness/menstrual/data/TemperatureBasicInfo;", "onMenstrualParseResult", "menstrualCycleInfo", "Lcom/mi/fitness/menstrual/data/MenstrualCycleInfo;", "onError", "errorCode", "", Constants.EXTRA_ERROR_MESSAGE, "", "temperature_algo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface JniDataCallback {
        void onError(int errorCode, @NotNull String errorMsg);

        void onMenstrualParseResult(@NotNull MenstrualCycleInfo menstrualCycleInfo);

        void onTempParseResult(@NotNull TemperatureBasicInfo temperatureBasicInfo);
    }

    static {
        System.loadLibrary("menstrual_algo");
    }

    private final void setTempFileList(List<byte[]> dataList) {
        onTemperatureCallBack();
        putTemperatureDataList(dataList);
    }

    public final native void clear();

    @NotNull
    public final JniDataCallback getMTemperatureDataCallback() {
        JniDataCallback jniDataCallback = this.mTemperatureDataCallback;
        if (jniDataCallback != null) {
            return jniDataCallback;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mTemperatureDataCallback");
        return null;
    }

    public final native void init(@NotNull IMenstrualAlgo listener);

    public final void initialize(long currentDateSec, @NotNull MenstrualSettingRequest menstrualSetting, @NotNull MenstrualPredictDateRequest menstrualPredictDate, @NotNull List<byte[]> dataList, @Nullable List<Long> tempTrendTimeList, @NotNull JniDataCallback temperatureDataCallback, int requestType, int tz) {
        Intrinsics.checkNotNullParameter(menstrualSetting, "menstrualSetting");
        Intrinsics.checkNotNullParameter(menstrualPredictDate, "menstrualPredictDate");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(temperatureDataCallback, "temperatureDataCallback");
        Logger.i(TAG, "initialize,currentTzOffset = " + tz + ",menstrualSetting = " + menstrualSetting + ",menstrualPredictDate = " + menstrualPredictDate);
        setMTemperatureDataCallback(temperatureDataCallback);
        init(this);
        onTemperatureCallBack();
        setAlgoParams(currentDateSec, dataList, CollectionsKt___CollectionsKt.toLongArray(tempTrendTimeList == null ? CollectionsKt__CollectionsKt.emptyList() : tempTrendTimeList), menstrualSetting, menstrualPredictDate, tz);
    }

    @Override // com.mi.fitness.menstrual.api.IMenstrualAlgo
    public void onAlgoStatusCallBack(int state) {
        Logger.i(TAG, "onAlgoStatusCallBack, state: " + state);
    }

    @Override // com.mi.fitness.menstrual.api.IMenstrualAlgo
    public void onErrorCallBack(int errorCode) {
    }

    @Override // com.mi.fitness.menstrual.api.IMenstrualAlgo
    public void onMenstrualCallBack(@NotNull MenstrualCycleInfo data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Logger.i(TAG, "onMenstrualCallBack, data: " + data);
        getMTemperatureDataCallback().onMenstrualParseResult(data);
    }

    public final native void onTemperatureCallBack();

    @Override // com.mi.fitness.menstrual.api.IMenstrualAlgo
    public void onTemperatureCallBack(@NotNull TemperatureBasicInfo data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Logger.i(TAG, "onTemperatureCallBack, data: " + data);
        getMTemperatureDataCallback().onTempParseResult(data);
    }

    public final native int putTemperatureDataList(@NotNull List<byte[]> data);

    public final native int setAlgoParams(long time, @NotNull List<byte[]> data, @NotNull long[] timeList, @NotNull MenstrualSettingRequest menstrualSetting, @NotNull MenstrualPredictDateRequest menstrualPredictDate, int tz);

    public final void setMTemperatureDataCallback(@NotNull JniDataCallback jniDataCallback) {
        Intrinsics.checkNotNullParameter(jniDataCallback, "<set-?>");
        this.mTemperatureDataCallback = jniDataCallback;
    }

    public final native int setMenstrualPredictDate(@NotNull MenstrualPredictDateRequest menstrualPredictDate, int tz);

    public final native int setMenstrualSettings(@NotNull MenstrualSettingRequest menstrualSetting);

    public final native void setTemperatureTime(long time, int tz);
}
