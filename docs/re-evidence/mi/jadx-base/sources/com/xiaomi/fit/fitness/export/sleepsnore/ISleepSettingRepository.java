package com.xiaomi.fit.fitness.export.sleepsnore;

import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/export/sleepsnore/ISleepSettingRepository;", "", "getLiveDataFromSP", "Landroidx/lifecycle/LiveData;", "T", "key", "", "defVal", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "getValueFromSP", "defValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "setBooleanFieldToSP", "", "value", "", "setIntFieldToSP", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISleepSettingRepository {
    @NotNull
    <T> LiveData<T> getLiveDataFromSP(@NotNull String key, T defVal);

    <T> T getValueFromSP(@NotNull String key, T defValue);

    void setBooleanFieldToSP(@NotNull String key, boolean value);

    void setIntFieldToSP(@NotNull String key, int value);
}
