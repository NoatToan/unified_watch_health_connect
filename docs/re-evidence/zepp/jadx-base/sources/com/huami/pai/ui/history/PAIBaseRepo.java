package com.huami.pai.ui.history;

import com.huami.pai.vo.PAIDataVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/pai/ui/history/PAIBaseRepo;", "", "", "from", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/pai/vo/PAIDataVo;", "getAllDatas", "", "paiListJson", "", "uploadPaiList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRemoteDatas", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface PAIBaseRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Flow getAllDatas$default(PAIBaseRepo pAIBaseRepo, long j, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllDatas");
            }
            if ((i & 1) != 0) {
                j = 0;
            }
            return pAIBaseRepo.getAllDatas(j);
        }

        public static /* synthetic */ Object getAllRemoteDatas$default(PAIBaseRepo pAIBaseRepo, long j, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllRemoteDatas");
            }
            if ((i & 1) != 0) {
                j = 0;
            }
            return pAIBaseRepo.getAllRemoteDatas(j, continuation);
        }
    }

    @NotNull
    Flow<List<PAIDataVo>> getAllDatas(long from);

    @Nullable
    Object getAllRemoteDatas(long j, @NotNull Continuation<? super List<PAIDataVo>> continuation);

    @Nullable
    Object uploadPaiList(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);
}
