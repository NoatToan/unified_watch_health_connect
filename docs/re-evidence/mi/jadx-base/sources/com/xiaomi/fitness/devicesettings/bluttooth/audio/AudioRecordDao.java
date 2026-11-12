package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordDao;", "", "list", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;", "did", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findById", "title", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "add", "", "audioRecordEntity", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "deleteOne", "update", "", "get", "timestamp", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AudioRecordDao {
    @Insert(onConflict = 1)
    @Nullable
    Object add(@NotNull AudioRecordEntity audioRecordEntity, @NotNull Continuation<? super Unit> continuation);

    @Query("DELETE FROM audio_record where did=:did")
    @Nullable
    Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Delete
    @Nullable
    Object deleteOne(@NotNull AudioRecordEntity audioRecordEntity, @NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM audio_record where did=:did and title=:title")
    @Nullable
    Object findById(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super AudioRecordEntity> continuation);

    @Query("SELECT * FROM audio_record where timestamp=:timestamp")
    @Nullable
    Object get(long j, @NotNull Continuation<? super AudioRecordEntity> continuation);

    @Query("SELECT * FROM audio_record where did=:did ORDER BY timestamp DESC")
    @Nullable
    Object list(@NotNull String str, @NotNull Continuation<? super List<AudioRecordEntity>> continuation);

    @Update
    @Nullable
    Object update(@NotNull AudioRecordEntity audioRecordEntity, @NotNull Continuation<? super Integer> continuation);
}
