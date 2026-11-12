package com.huami.account.ui.login;

import com.huami.account.keeper.FrozenAccountKeeper;
import com.huami.web.service.event.EventWebActivityFinish;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/account/ui/login/FrozenWebViewExitReceiver;", "", "Lcom/huami/web/service/event/EventWebActivityFinish;", "event", "", "onEventMainThread", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class FrozenWebViewExitReceiver {
    public final void onEventMainThread(@NotNull EventWebActivityFinish event) {
        EventBus.getDefault().unregister(this);
        FrozenAccountKeeper.INSTANCE.unfreezeReset();
    }
}
