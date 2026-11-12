package com.huami.watch.companion.sync;

import com.huami.watch.companion.sport.pb.PersonalBest;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\b\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/huami/watch/companion/sync/PBSyncApi;", "", "", "supportSyncPb", "", "Lcom/huami/watch/companion/sport/pb/PersonalBest;", "pbInfos", "isFull", "sendPBInfos", "companion_release"}, k = 1, mv = {1, 5, 1})
public interface PBSyncApi {
    boolean sendPBInfos(@NotNull List<? extends PersonalBest> pbInfos, boolean isFull);

    boolean supportSyncPb();
}
