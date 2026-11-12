package com.service.mi.visa.entity.resp;

import com.service.mi.common.apdu.Capdu;
import com.service.mi.wallet.entity.resp.BaseWalletResponse;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ConfirmProvisioningResp extends BaseWalletResponse {
    private List<Capdu> apduCommands;
    private String messageId;

    public ConfirmProvisioningResp(String str, String str2) {
        super(str, str2);
    }

    public List<Capdu> getApduCommands() {
        return this.apduCommands;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setApduCommands(List<Capdu> list) {
        this.apduCommands = list;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }
}
