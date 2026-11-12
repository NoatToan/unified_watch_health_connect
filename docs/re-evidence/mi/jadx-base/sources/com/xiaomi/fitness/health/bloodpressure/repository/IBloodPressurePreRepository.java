package com.xiaomi.fitness.health.bloodpressure.repository;

import androidx.lifecycle.LiveData;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.tz2;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0016\u001a\u00020\u0003H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0003H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/repository/IBloodPressurePreRepository;", "", "T", "", "key", "defValue", "Landroidx/lifecycle/LiveData;", "reqKeyLiveData", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", DeviceTagInterface.CUSTOM_TAG_TYPE, "getPrefValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "", "setPreValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "Ltz2;", "dataMap", "updateRemindConfig", "(Ljava/util/Map;)V", "data", "(Ljava/lang/String;Ltz2;)V", "keyItem", "getMeasureRemindDataLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getMeasureRemindData", "(Ljava/lang/String;)Ltz2;", "getMeasureRemindLiveData", "()Landroidx/lifecycle/LiveData;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface IBloodPressurePreRepository {
    @Nullable
    tz2 getMeasureRemindData(@NotNull String keyItem);

    @NotNull
    LiveData<tz2> getMeasureRemindDataLiveData(@NotNull String keyItem);

    @NotNull
    LiveData<tz2> getMeasureRemindLiveData();

    @Nullable
    <T> T getPrefValue(@NotNull String key, T t);

    @NotNull
    <T> LiveData<T> reqKeyLiveData(@NotNull String key, T defValue);

    <T> void setPreValue(@NotNull String key, T t);

    void updateRemindConfig(@NotNull String key, @NotNull tz2 data);

    void updateRemindConfig(@NotNull Map<String, ? extends tz2> dataMap);
}
