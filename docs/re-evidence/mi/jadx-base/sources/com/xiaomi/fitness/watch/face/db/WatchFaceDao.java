package com.xiaomi.fitness.watch.face.db;

import androidx.room.Insert;
import androidx.room.Query;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH§@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\rJ$\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H§@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/WatchFaceDao;", "", "getPhotos", "", "Lcom/xiaomi/fitness/watch/face/db/PhotoBean;", "nodeId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWatchFace", "Lcom/xiaomi/fitness/watch/face/db/FaceCommonEntity;", "combineId", "did", FaceInfoBase.FACE_ID, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWatchFacesByDid", "saveWatchFace", "", "value", "(Lcom/xiaomi/fitness/watch/face/db/FaceCommonEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteWatchFace", "deleteOtherWatchFace", "faceIds", "", "(Ljava/lang/String;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteWatchFacesByDid", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WatchFaceDao {
    @Query("DELETE FROM face_common_table WHERE did = :did AND faceId not in (:faceIds)")
    @Nullable
    Object deleteOtherWatchFace(@NotNull String str, @NotNull Collection<String> collection, @NotNull Continuation<? super Unit> continuation);

    @Query("DELETE FROM face_common_table WHERE did = :did AND faceId = :faceId")
    @Nullable
    Object deleteWatchFace(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Query("DELETE FROM face_common_table WHERE combineId = :combineId")
    @Nullable
    Object deleteWatchFace(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Query("DELETE FROM face_common_table WHERE did = :did")
    @Nullable
    Object deleteWatchFacesByDid(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Query("SELECT * FROM photo_bean WHERE nodeId = :nodeId")
    @Nullable
    Object getPhotos(@NotNull String str, @NotNull Continuation<? super List<PhotoBean>> continuation);

    @Query("SELECT * FROM face_common_table WHERE did = :did AND faceId = :faceId")
    @Nullable
    Object getWatchFace(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super FaceCommonEntity> continuation);

    @Query("SELECT * FROM face_common_table WHERE combineId = :combineId")
    @Nullable
    Object getWatchFace(@NotNull String str, @NotNull Continuation<? super FaceCommonEntity> continuation);

    @Query("SELECT * FROM face_common_table WHERE did = :did")
    @Nullable
    Object getWatchFacesByDid(@NotNull String str, @NotNull Continuation<? super List<FaceCommonEntity>> continuation);

    @Insert(entity = FaceCommonEntity.class, onConflict = 1)
    @Nullable
    Object saveWatchFace(@NotNull FaceCommonEntity faceCommonEntity, @NotNull Continuation<? super Unit> continuation);
}
