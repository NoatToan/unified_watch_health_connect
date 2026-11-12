package com.huami.nfc.door;

import com.facebook.share.internal.ShareConstants;
import com.huami.nfc.applet.EntityKt;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.door.api.XiaoMiDoorAppletApi;
import com.huami.nfc.web.Constant;
import com.huami.nfc.web.InitRequestTask;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/nfc/door/XiaomiAccessDoorAppletApi;", "Lcom/huami/nfc/door/api/XiaoMiDoorAppletApi;", "Lcom/huami/nfc/door/NfcTag;", "tag", "Lcom/huami/nfc/base/PayResponse;", "", "b", "a", "install", "aid", "deleteApp", "Lcom/huami/nfc/web/InitRequestTask;", "Lcom/huami/nfc/web/InitRequestTask;", "task", "<init>", "(Lcom/huami/nfc/web/InitRequestTask;)V", "nfc-door_release"}, k = 1, mv = {1, 5, 1})
public final class XiaomiAccessDoorAppletApi implements XiaoMiDoorAppletApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InitRequestTask task;

    public XiaomiAccessDoorAppletApi(@NotNull InitRequestTask initRequestTask) {
        this.task = initRequestTask;
    }

    private final PayResponse<String> a() {
        return this.task.apply(r.mutableMapOf(TuplesKt.to("fareCardType", 1), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "copyFareCard"), TuplesKt.to("fetch_adpu_mode", EntityKt.FETCH_APDU_MODE_SYNC)));
    }

    private final PayResponse<String> b(NfcTag tag) {
        Map<String, Object> mapMutableMapOf = r.mutableMapOf(TuplesKt.to("atqa", tag.getAtqa()), TuplesKt.to("sak", tag.getSak()), TuplesKt.to("uid", tag.getUid()), TuplesKt.to("fareCardType", 0), TuplesKt.to("blockContent", tag.getBlockData()), TuplesKt.to("size", Integer.valueOf(tag.getBlockData().length() / 2)), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "copyFareCard"), TuplesKt.to("fetch_adpu_mode", EntityKt.FETCH_APDU_MODE_SYNC));
        WorkerInfo workerInfo = tag.getWorkerInfo();
        if (workerInfo != null) {
            mapMutableMapOf.put("bizType", 1);
            mapMutableMapOf.put("biz_info", Constant.jsonBody(q.mapOf(TuplesKt.to("workCode", workerInfo.getNumber()))).toString());
        }
        return this.task.apply(mapMutableMapOf);
    }

    @Override // com.huami.nfc.door.api.XiaoMiDoorAppletApi
    @NotNull
    public PayResponse<String> deleteApp(@NotNull String aid) {
        return this.task.apply(r.mutableMapOf(TuplesKt.to("aid", aid), TuplesKt.to(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "deleteapp")));
    }

    @Override // com.huami.nfc.door.api.XiaoMiDoorAppletApi
    @NotNull
    public PayResponse<String> install(@Nullable NfcTag tag) {
        return tag != null ? b(tag) : a();
    }
}
