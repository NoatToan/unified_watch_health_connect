package com.huami.watchfacesstore.repo;

import com.huami.watchfacesstore.bean.WatchData;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/watchfacesstore/repo/HistoryRecordRepo;", "", "", "deviceId", "", DTransferConstants.PAGE, "perPage", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "getHistoryRecord", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ids", "", "deleteHistoryRecord", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface HistoryRecordRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object getHistoryRecord$default(HistoryRecordRepo historyRecordRepo, String str, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryRecord");
            }
            if ((i3 & 2) != 0) {
                i = 1;
            }
            if ((i3 & 4) != 0) {
                i2 = 10;
            }
            return historyRecordRepo.getHistoryRecord(str, i, i2, continuation);
        }
    }

    @Nullable
    Object deleteHistoryRecord(@NotNull String str, @NotNull List<Integer> list, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object getHistoryRecord(@NotNull String str, int i, int i2, @NotNull Continuation<? super List<WatchData>> continuation);
}
