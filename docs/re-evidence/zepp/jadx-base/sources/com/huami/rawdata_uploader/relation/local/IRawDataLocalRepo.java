package com.huami.rawdata_uploader.relation.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J+\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fJ1\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/huami/rawdata_uploader/relation/local/IRawDataLocalRepo;", "", "Lcom/huami/rawdata_uploader/relation/local/RawDataDbVo;", "rawDataDbVo", "", "insertData", "", "userId", "", "dataType", "", "getUnSyncFileList", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "measureTimeList", "zipName", "updateZipNameByUserId", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSyncFileList", "deleteDataList", "(Ljava/lang/String;Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public interface IRawDataLocalRepo {
    @Nullable
    Object deleteDataList(@NotNull String str, @NotNull List<Long> list, int i, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getSyncFileList(@NotNull String str, int i, @NotNull Continuation<? super List<RawDataDbVo>> continuation);

    @Nullable
    Object getUnSyncFileList(@NotNull String str, int i, @NotNull Continuation<? super List<RawDataDbVo>> continuation);

    void insertData(@Nullable RawDataDbVo rawDataDbVo);

    @Nullable
    Object updateZipNameByUserId(@NotNull String str, @NotNull List<Long> list, @NotNull String str2, int i, @NotNull Continuation<? super Unit> continuation);
}
