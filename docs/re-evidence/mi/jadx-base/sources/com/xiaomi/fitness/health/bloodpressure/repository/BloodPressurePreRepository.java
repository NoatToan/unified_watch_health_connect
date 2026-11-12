package com.xiaomi.fitness.health.bloodpressure.repository;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.lifecycle.DataHolder;
import com.xiaomi.fitness.common.lifecycle.IDataHandler;
import com.xiaomi.fitness.common.lifecycle.LiveSharedPreHelper;
import com.xiaomi.fitness.common.lifecycle.LiveSharedPreferences;
import com.xiaomi.fitness.health.bloodpressure.remind.BloodPressureRemindUtils;
import com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.i4b;
import defpackage.tz2;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0013\b\u0007\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/repository/BloodPressurePreRepository;", "Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "T", "", "key", "defValue", "Landroidx/lifecycle/LiveData;", "reqKeyLiveData", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "getPrefValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "setPreValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "Ltz2;", "dataMap", "updateRemindConfig", "(Ljava/util/Map;)V", "data", "(Ljava/lang/String;Ltz2;)V", "keyItem", "getMeasureRemindDataLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getMeasureRemindData", "(Ljava/lang/String;)Ltz2;", "getMeasureRemindLiveData", "()Landroidx/lifecycle/LiveData;", "getMeasureRemindSelectKeyLiveData", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences;", "mLiveSharedPreferences", "Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences;", "<init>", "(Landroid/content/Context;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodPressurePreRepository implements IBloodPressurePreRepository {

    @NotNull
    public static final String KEY_ITEM_CUSTOM = "custom";

    @NotNull
    public static final String KEY_ITEM_MID = "mid";

    @NotNull
    public static final String KEY_ITEM_MODERATE = "moderate";

    @NotNull
    public static final String KEY_ITEM_NORMAL = "normal";

    @NotNull
    public static final String KEY_ITEM_SEVERE = "severe";

    @NotNull
    public static final String KEY_MEASURE_REMIND_ENABLE = "remind_enable";

    @NotNull
    public static final String KEY_REMIND_DATA = "remind_data";

    @NotNull
    public static final String PREFERENCE_NAME = "pref:bp";

    @NotNull
    public static final String TAG = "BloodPressurePreRepository";

    @NotNull
    public static final String UNKNOWN = "unknown";

    @NotNull
    private final Context mContext;

    @NotNull
    private LiveSharedPreferences mLiveSharedPreferences;

    public BloodPressurePreRepository(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.mLiveSharedPreferences = new LiveSharedPreferences(mContext, PREFERENCE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData getMeasureRemindDataLiveData$lambda$0(String keyItem, String str) {
        Intrinsics.checkNotNullParameter(keyItem, "$keyItem");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new BloodPressurePreRepository$getMeasureRemindDataLiveData$1$1(str, keyItem, null), 3, (Object) null);
    }

    @Override // com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository
    @Nullable
    public tz2 getMeasureRemindData(@NotNull String keyItem) {
        Intrinsics.checkNotNullParameter(keyItem, "keyItem");
        return (tz2) i4b.a().fromJson(this.mLiveSharedPreferences.getString(keyItem, BloodPressureRemindUtils.INSTANCE.getDefaultRemindMeasureString(keyItem)), tz2.class);
    }

    @Override // com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository
    @NotNull
    public LiveData<tz2> getMeasureRemindDataLiveData(@NotNull final String keyItem) {
        Intrinsics.checkNotNullParameter(keyItem, "keyItem");
        return Transformations.switchMap(reqKeyLiveData(keyItem, ""), new Function1() { // from class: vz2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodPressurePreRepository.getMeasureRemindDataLiveData$lambda$0(keyItem, (String) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository
    @NotNull
    public LiveData<tz2> getMeasureRemindLiveData() {
        final String str = "select";
        final String str2 = "enable";
        return DataHolder.asLiveData$default(new DataHolder(new IDataHandler<tz2>() { // from class: com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository$getMeasureRemindLiveData$handler$1
            @Override // com.xiaomi.fitness.common.lifecycle.IDataHandler
            public tz2 onDataReady(IDataHandler.DataSet dataSet) {
                Intrinsics.checkNotNullParameter(dataSet, "dataSet");
                String str3 = (String) dataSet.get(str);
                Boolean bool = (Boolean) dataSet.get(str2);
                return (bool == null || str3 == null || !bool.booleanValue() || Intrinsics.areEqual("unknown", str3)) ? tz2.a() : (tz2) dataSet.get(str3);
            }
        }, false, 2, null).addSource("select", String.class, getMeasureRemindSelectKeyLiveData()).addSource("normal", tz2.class, getMeasureRemindDataLiveData("normal")).addSource(KEY_ITEM_MID, tz2.class, getMeasureRemindDataLiveData(KEY_ITEM_MID)).addSource(KEY_ITEM_SEVERE, tz2.class, getMeasureRemindDataLiveData(KEY_ITEM_SEVERE)).addSource("custom", tz2.class, getMeasureRemindDataLiveData("custom")).addSource("enable", Boolean.TYPE, reqKeyLiveData(KEY_MEASURE_REMIND_ENABLE, Boolean.FALSE)), null, 1, null);
    }

    @NotNull
    public final LiveData<String> getMeasureRemindSelectKeyLiveData() {
        DataHolder dataHolder = new DataHolder(new IDataHandler<String>() { // from class: com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository$getMeasureRemindSelectKeyLiveData$handler$1
            @Override // com.xiaomi.fitness.common.lifecycle.IDataHandler
            public String onDataReady(IDataHandler.DataSet dataSet) {
                Intrinsics.checkNotNullParameter(dataSet, "dataSet");
                Boolean bool = (Boolean) dataSet.get("normal");
                Boolean bool2 = (Boolean) dataSet.get(BloodPressurePreRepository.KEY_ITEM_MID);
                Boolean bool3 = (Boolean) dataSet.get(BloodPressurePreRepository.KEY_ITEM_SEVERE);
                Boolean bool4 = (Boolean) dataSet.get("custom");
                if (bool != null && bool.booleanValue()) {
                    return "normal";
                }
                if (bool2 != null && bool2.booleanValue()) {
                    return BloodPressurePreRepository.KEY_ITEM_MID;
                }
                if (bool3 == null || !bool3.booleanValue()) {
                    return (bool4 == null || !bool4.booleanValue()) ? "unknown" : "custom";
                }
                return BloodPressurePreRepository.KEY_ITEM_SEVERE;
            }
        }, false, 2, null);
        Class cls = Boolean.TYPE;
        Boolean bool = Boolean.FALSE;
        return DataHolder.asLiveData$default(dataHolder.addSource("normal", cls, reqKeyLiveData("normal_enable", bool)).addSource(KEY_ITEM_MID, cls, reqKeyLiveData("mid_enable", bool)).addSource(KEY_ITEM_SEVERE, cls, reqKeyLiveData("severe_enable", bool)).addSource("custom", cls, reqKeyLiveData("custom_enable", bool)), null, 1, null);
    }

    @Override // com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository
    @Nullable
    public <T> T getPrefValue(@NotNull String key, T defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) LiveSharedPreHelper.INSTANCE.getPrefValue(this.mLiveSharedPreferences, key, defValue);
    }

    @Override // com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository
    @NotNull
    public <T> LiveData<T> reqKeyLiveData(@NotNull String key, T defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return LiveSharedPreHelper.INSTANCE.getPrefLiveData(this.mLiveSharedPreferences, key, defValue);
    }

    @Override // com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository
    public <T> void setPreValue(@NotNull String key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveSharedPreHelper.INSTANCE.updatePrefValue(this.mLiveSharedPreferences, key, t);
    }

    @Override // com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository
    public void updateRemindConfig(@NotNull String key, @NotNull tz2 data) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(data, "data");
        SharedPreferences.Editor editorEdit = this.mLiveSharedPreferences.edit();
        Objects.requireNonNull(key);
        editorEdit.putString(key, i4b.a().toJson(data)).apply();
    }

    @Override // com.xiaomi.fitness.health.bloodpressure.repository.IBloodPressurePreRepository
    public void updateRemindConfig(@NotNull Map<String, ? extends tz2> dataMap) {
        Intrinsics.checkNotNullParameter(dataMap, "dataMap");
        Gson gsonA = i4b.a();
        Intrinsics.checkNotNullExpressionValue(gsonA, "createGson(...)");
        SharedPreferences.Editor editorEdit = this.mLiveSharedPreferences.edit();
        for (Map.Entry<String, ? extends tz2> entry : dataMap.entrySet()) {
            editorEdit.putString(entry.getKey(), gsonA.toJson(entry.getValue()));
        }
        editorEdit.apply();
    }
}
