package com.xiaomi.hm.health.device.setting.find;

import kotlin.Metadata;
import kotlinx.coroutines.CompletableDeferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/DialogCancelHandler;", "Lcom/xiaomi/hm/health/device/setting/find/IDialogActionHandler;", "", "onCancel", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/xiaomi/hm/health/device/setting/find/PageType;", "a", "Lkotlinx/coroutines/CompletableDeferred;", "wait", "<init>", "(Lkotlinx/coroutines/CompletableDeferred;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialogCancelHandler implements IDialogActionHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CompletableDeferred<PageType> wait;

    public DialogCancelHandler(@NotNull CompletableDeferred<PageType> completableDeferred) {
        this.wait = completableDeferred;
    }

    @Override // com.xiaomi.hm.health.device.setting.find.IDialogActionHandler
    public void onCancel() {
        this.wait.complete(PageType.None);
    }
}
