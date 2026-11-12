package com.huami.watchfacesstore.repo;

import com.huami.watchfacesstore.api.HistoryRecordApi;
import com.huami.watchfacesstore.bean.WatchData;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/huami/watchfacesstore/repo/HistoryRecordRepoImpl;", "Lcom/huami/watchfacesstore/repo/HistoryRecordRepo;", "", "deviceId", "", DTransferConstants.PAGE, "perPage", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "getHistoryRecord", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ids", "", "deleteHistoryRecord", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/watchfacesstore/api/HistoryRecordApi;", "a", "Lcom/huami/watchfacesstore/api/HistoryRecordApi;", "api", "<init>", "(Lcom/huami/watchfacesstore/api/HistoryRecordApi;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HistoryRecordRepoImpl implements HistoryRecordRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HistoryRecordApi api;

    public HistoryRecordRepoImpl(@NotNull HistoryRecordApi historyRecordApi) {
        this.api = historyRecordApi;
    }

    @Override // com.huami.watchfacesstore.repo.HistoryRecordRepo
    @Nullable
    public Object deleteHistoryRecord(@NotNull String str, @NotNull List<Integer> list, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.api.deleteHistoryRecord(str, CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null)));
    }

    @Override // com.huami.watchfacesstore.repo.HistoryRecordRepo
    @Nullable
    public Object getHistoryRecord(@NotNull String str, int i, int i2, @NotNull Continuation<? super List<WatchData>> continuation) {
        return this.api.getHistoryRecord(str, i, i2).getData();
    }
}
