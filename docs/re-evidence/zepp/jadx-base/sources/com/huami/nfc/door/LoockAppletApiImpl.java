package com.huami.nfc.door;

import com.facebook.share.internal.ShareConstants;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.ConstantKt;
import com.huami.nfc.door.api.LoockAppletApi;
import com.huami.nfc.web.InitRequestTask;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/nfc/door/LoockAppletApiImpl;", "Lcom/huami/nfc/door/api/LoockAppletApi;", "Lcom/huami/nfc/base/PayResponse;", "", "installLoock", "aid", "deleteLoock", "Lcom/huami/nfc/web/InitRequestTask;", "a", "Lcom/huami/nfc/web/InitRequestTask;", "task", "<init>", "(Lcom/huami/nfc/web/InitRequestTask;)V", "Companion", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final class LoockAppletApiImpl implements LoockAppletApi {

    @NotNull
    public static final String LOOCK_APP_CODE = "1765";

    @NotNull
    public static final String LOOCK_PRODUCT_SUB_TYPE = "6";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InitRequestTask task;

    public LoockAppletApiImpl(@NotNull InitRequestTask initRequestTask) {
        this.task = initRequestTask;
    }

    @Override // com.huami.nfc.door.api.LoockAppletApi
    @NotNull
    public PayResponse<String> deleteLoock(@NotNull String aid) {
        return this.task.apply(r.mutableMapOf(TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "delete"), TuplesKt.to("biz_serial_no", ""), TuplesKt.to(ConstantKt.KEY_APP_CODE, LOOCK_APP_CODE), TuplesKt.to("product_sub_type", "6"), TuplesKt.to("aid", aid)));
    }

    @Override // com.huami.nfc.door.api.LoockAppletApi
    @NotNull
    public PayResponse<String> installLoock() {
        return this.task.apply(r.mutableMapOf(TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "issue"), TuplesKt.to("biz_serial_no", ""), TuplesKt.to(ConstantKt.KEY_APP_CODE, LOOCK_APP_CODE), TuplesKt.to("product_sub_type", "6")));
    }
}
