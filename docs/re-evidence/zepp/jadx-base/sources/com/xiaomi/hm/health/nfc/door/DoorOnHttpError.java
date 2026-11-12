package com.xiaomi.hm.health.nfc.door;

import com.huami.wallet.accessdoor.api.OnAccessDoorHttpError;
import com.xiaomi.hm.health.eventbus.EventHttpError;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/nfc/door/DoorOnHttpError;", "Lcom/huami/wallet/accessdoor/api/OnAccessDoorHttpError;", "", "errorCode", "errorMsg", "", "onHttpError", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DoorOnHttpError implements OnAccessDoorHttpError {
    @Override // com.huami.wallet.accessdoor.api.OnAccessDoorHttpError
    public void onHttpError(@NotNull String errorCode, @NotNull String errorMsg) {
        EventBus.getDefault().post(new EventHttpError(errorCode, errorMsg, 2));
    }
}
