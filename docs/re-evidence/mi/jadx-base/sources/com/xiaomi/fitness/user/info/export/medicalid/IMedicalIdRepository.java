package com.xiaomi.fitness.user.info.export.medicalid;

import android.util.Pair;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 $2\u00020\u0001:\u0001$J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H&J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0014H&J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&J%\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u0002H\u0017H&¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H&J \u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H&J \u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH&J \u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0014H&J \u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&J+\u0010\u001f\u001a\n\u0012\u0004\u0012\u0002H\u0017\u0018\u00010\u001b\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u0002H\u0017H&¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0010H&J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u000bH&¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/medicalid/IMedicalIdRepository;", "", "isFirstInitStatus", "", "saveOrUpdateRecord", "", "medicalIdRecord", "Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "getMedicalIdRecord", "getBloodType", "Landroid/util/Pair;", "", "bloodType", "clearAllData", "getBooleanFromSP", "key", "", "defVal", "getIntFromSP", "getLongFromSP", "", "getStringFromSP", "getValueFromSP", "T", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "setIsFirstInitStatus", "getBooleanLiveDataFromSP", "Landroidx/lifecycle/LiveData;", "getIntLiveDataFromSP", "getLongLiveDataFromSP", "getStringLiveDataFromSP", "getLiveData", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "getGenderString", "getBloodString", "type", "Companion", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IMedicalIdRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/medicalid/IMedicalIdRepository$Companion;", "", "<init>", "()V", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void clearAllData();

    @NotNull
    String getBloodString(int type);

    @NotNull
    Pair<Integer, Integer> getBloodType(int bloodType);

    boolean getBooleanFromSP(@NotNull String key, boolean defVal);

    @Nullable
    LiveData<Boolean> getBooleanLiveDataFromSP(@NotNull String key, boolean defVal);

    @NotNull
    String getGenderString();

    int getIntFromSP(@NotNull String key, int defVal);

    @Nullable
    LiveData<Integer> getIntLiveDataFromSP(@NotNull String key, int defVal);

    @Nullable
    <T> LiveData<T> getLiveData(@NotNull String key, T defVal);

    long getLongFromSP(@NotNull String key, long defVal);

    @Nullable
    LiveData<Long> getLongLiveDataFromSP(@NotNull String key, long defVal);

    @NotNull
    MedicalIdRecord getMedicalIdRecord();

    @Nullable
    String getStringFromSP(@NotNull String key, @NotNull String defVal);

    @Nullable
    LiveData<String> getStringLiveDataFromSP(@NotNull String key, @NotNull String defVal);

    @Nullable
    <T> T getValueFromSP(@NotNull String key, T defVal);

    boolean isFirstInitStatus();

    void saveOrUpdateRecord(@NotNull MedicalIdRecord medicalIdRecord);

    void setIsFirstInitStatus(boolean isFirstInitStatus);
}
