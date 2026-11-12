package com.huami.nfc.web;

import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.base.PayResponseKt;
import com.huami.nfc.eid.ConsatntKt;
import com.huami.nfc.web.entity.ApduScript;
import com.huami.nfc.web.server.InitRequestServer;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/nfc/web/EidInitRequestApiImpl;", "Lcom/huami/nfc/web/InitRequestApi;", "", "", "", SportAnalytics.ParamValue.MapButtonType.MAP, "Lcom/huami/nfc/base/PayResponse;", "Lcom/huami/nfc/web/entity/ApduScript;", "initApdu", "requestApdu", "Lcom/huami/nfc/web/server/InitRequestServer;", "a", "Lcom/huami/nfc/web/server/InitRequestServer;", "service", "<init>", "(Lcom/huami/nfc/web/server/InitRequestServer;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final class EidInitRequestApiImpl implements InitRequestApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InitRequestServer service;

    public EidInitRequestApiImpl(@NotNull InitRequestServer initRequestServer) {
        this.service = initRequestServer;
    }

    @Override // com.huami.nfc.web.InitRequestApi
    @NotNull
    public PayResponse<ApduScript> initApdu(@NotNull Map<String, Object> map) {
        return PayResponseKt.toPayResponse(this.service.eidInit(ConsatntKt.EID_PRODUCT_TYPE, Constant.requestBody(map)).execute());
    }

    @Override // com.huami.nfc.web.InitRequestApi
    @NotNull
    public PayResponse<ApduScript> requestApdu(@NotNull Map<String, Object> map) {
        return PayResponseKt.toPayResponse(this.service.eidRequest(ConsatntKt.EID_PRODUCT_TYPE, Constant.requestBody(map)).execute());
    }
}
