package com.xiaomi.fit.fitness.export.sleepsnore;

import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.lifecycle.LiveSharedPreHelper;
import com.xiaomi.fitness.common.lifecycle.LiveSharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u0002H\u000fH\u0016¢\u0006\u0002\u0010\u0012J#\u0010\u0013\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u0002H\u000fH\u0016¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/export/sleepsnore/AutoFileCacheSwitchRepository;", "Lcom/xiaomi/fit/fitness/export/sleepsnore/ISleepSettingRepository;", "<init>", "()V", "SPF_NAME", "", "KEY_CACHED_ENABLE", "mLiveSharedPreferences", "Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences;", "getMLiveSharedPreferences", "()Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences;", "setMLiveSharedPreferences", "(Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences;)V", "getLiveDataFromSP", "Landroidx/lifecycle/LiveData;", "T", "key", "defVal", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "getValueFromSP", "defValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "setBooleanFieldToSP", "", "value", "", "setIntFieldToSP", "", "getEditor", "Landroid/content/SharedPreferences$Editor;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoFileCacheSwitchRepository implements ISleepSettingRepository {

    @NotNull
    public static final String KEY_CACHED_ENABLE = "enable";

    @NotNull
    public static final AutoFileCacheSwitchRepository INSTANCE = new AutoFileCacheSwitchRepository();

    @NotNull
    private static final String SPF_NAME = "com.mi.health.audio_file_cached";

    @NotNull
    private static LiveSharedPreferences mLiveSharedPreferences = new LiveSharedPreferences(ApplicationExtKt.getApplication(), SPF_NAME);

    private AutoFileCacheSwitchRepository() {
    }

    private final SharedPreferences.Editor getEditor() {
        return mLiveSharedPreferences.edit();
    }

    @Override // com.xiaomi.fit.fitness.export.sleepsnore.ISleepSettingRepository
    @NotNull
    public <T> LiveData<T> getLiveDataFromSP(@NotNull String key, T defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        return LiveSharedPreHelper.INSTANCE.getPrefLiveData(mLiveSharedPreferences, key, defVal);
    }

    @NotNull
    public final LiveSharedPreferences getMLiveSharedPreferences() {
        return mLiveSharedPreferences;
    }

    @Override // com.xiaomi.fit.fitness.export.sleepsnore.ISleepSettingRepository
    public <T> T getValueFromSP(@NotNull String key, T defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) LiveSharedPreHelper.INSTANCE.getPrefValue(mLiveSharedPreferences, key, defValue);
    }

    @Override // com.xiaomi.fit.fitness.export.sleepsnore.ISleepSettingRepository
    public void setBooleanFieldToSP(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        getEditor().putBoolean(key, value).apply();
    }

    @Override // com.xiaomi.fit.fitness.export.sleepsnore.ISleepSettingRepository
    public void setIntFieldToSP(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        getEditor().putInt(key, value).apply();
    }

    public final void setMLiveSharedPreferences(@NotNull LiveSharedPreferences liveSharedPreferences) {
        Intrinsics.checkNotNullParameter(liveSharedPreferences, "<set-?>");
        mLiveSharedPreferences = liveSharedPreferences;
    }
}
