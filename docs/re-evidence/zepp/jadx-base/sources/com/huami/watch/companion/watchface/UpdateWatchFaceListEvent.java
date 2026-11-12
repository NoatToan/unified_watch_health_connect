package com.huami.watch.companion.watchface;

import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/watch/companion/watchface/UpdateWatchFaceListEvent;", "", "Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;", "a", "Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;", "getWatch", "()Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;", "watch", "<init>", "(Lcom/huami/watch/companion/watchface/bean/WatchFaceBean;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class UpdateWatchFaceListEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceBean watch;

    public UpdateWatchFaceListEvent(@NotNull WatchFaceBean watchFaceBean) {
        this.watch = watchFaceBean;
    }

    @NotNull
    public final WatchFaceBean getWatch() {
        return this.watch;
    }
}
