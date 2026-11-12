package com.huami.worldclock.add;

import com.huami.worldclock.bean.WorldClockBean;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/huami/worldclock/add/AddWorldClockCallback;", "", "", "onExceedLimit", "onDuplicateData", "Lcom/huami/worldclock/bean/WorldClockBean;", LargeWatchSkinActivity.KEY_BEAN, "onAddable", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public interface AddWorldClockCallback {
    void onAddable(@NotNull WorldClockBean bean);

    void onDuplicateData();

    void onExceedLimit();
}
