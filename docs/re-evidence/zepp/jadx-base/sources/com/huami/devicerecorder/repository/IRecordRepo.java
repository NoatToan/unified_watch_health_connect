package com.huami.devicerecorder.repository;

import com.huami.devicerecorder.model.RecordFile;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\tJ!\u0010\u000f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/devicerecorder/repository/IRecordRepo;", "", "", "Lcom/huami/devicerecorder/model/RecordFile;", "getRecordFiles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordFile", "", "deleteLocalRecordFile", "(Lcom/huami/devicerecorder/model/RecordFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "recordFiles", "deleteLocalRecordFiles", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addLocalRecordFile", "addLocalRecordFiles", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public interface IRecordRepo {
    @Nullable
    Object addLocalRecordFile(@NotNull RecordFile recordFile, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object addLocalRecordFiles(@NotNull List<RecordFile> list, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object deleteLocalRecordFile(@NotNull RecordFile recordFile, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object deleteLocalRecordFiles(@NotNull List<RecordFile> list, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object getRecordFiles(@NotNull Continuation<? super Collection<RecordFile>> continuation);
}
