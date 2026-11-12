package com.service.mi.visa.entity.resp;

import com.service.mi.common.apdu.Capdu;
import com.service.mi.wallet.entity.AuthenticationMethod;
import com.service.mi.wallet.entity.resp.BaseWalletResponse;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ProvisionTokenResp extends BaseWalletResponse {
    private List<Capdu> apduCommands;
    private List<AuthenticationMethod> authenticationMethods;
    private String messageId;
    private boolean needAdditionalAuth;
    private String tdsRegistrationUrl;
    private String tokenUniqueReference;

    public ProvisionTokenResp(String str, String str2) {
        super(str, str2);
    }

    public List<Capdu> getApduCommands() {
        return this.apduCommands;
    }

    public List<AuthenticationMethod> getAuthenticationMethods() {
        return this.authenticationMethods;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getTdsRegistrationUrl() {
        return this.tdsRegistrationUrl;
    }

    public String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public boolean isNeedAdditionalAuth() {
        return this.needAdditionalAuth;
    }

    public void setApduCommands(List<Capdu> list) {
        this.apduCommands = list;
    }

    public void setAuthenticationMethods(List<AuthenticationMethod> list) {
        this.authenticationMethods = list;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setNeedAdditionalAuth(boolean z) {
        this.needAdditionalAuth = z;
    }

    public void setTdsRegistrationUrl(String str) {
        this.tdsRegistrationUrl = str;
    }

    public void setTokenUniqueReference(String str) {
        this.tokenUniqueReference = str;
    }
}
