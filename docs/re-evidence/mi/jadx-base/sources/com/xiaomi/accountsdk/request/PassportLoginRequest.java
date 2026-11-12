package com.xiaomi.accountsdk.request;

import com.xiaomi.accountsdk.account.XMPassport;
import com.xiaomi.accountsdk.account.data.MetaLoginData;
import com.xiaomi.accountsdk.account.exception.InvalidUserNameException;
import com.xiaomi.accountsdk.utils.AccountLogger;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class PassportLoginRequest extends PassportRequest {
    private static final String TAG = "PassportLoginRequest";
    private final PassportRequest request;

    public static class ByPassToken extends PassportLoginRequest {
        public ByPassToken(PassportRequestArguments passportRequestArguments) {
            super(passportRequestArguments);
        }

        @Override // com.xiaomi.accountsdk.request.PassportLoginRequest
        public String getLoginType() {
            return "byPassToken";
        }

        @Override // com.xiaomi.accountsdk.request.PassportLoginRequest
        public PassportSimpleRequest makeHttpsRequest(PassportRequestArguments passportRequestArguments) {
            return new PassportSimpleRequest.GetAsString(passportRequestArguments);
        }
    }

    public static class ByPassword extends PassportLoginRequest {
        private final MetaLoginData mmetaLoginData;
        private final String serviceId;
        private final String userId;

        public ByPassword(PassportRequestArguments passportRequestArguments, String str, String str2, MetaLoginData metaLoginData) {
            super(passportRequestArguments);
            this.userId = str;
            this.serviceId = str2;
            this.mmetaLoginData = metaLoginData;
        }

        @Override // com.xiaomi.accountsdk.request.PassportLoginRequest
        public String getLoginType() {
            return "byPassword";
        }

        @Override // com.xiaomi.accountsdk.request.PassportLoginRequest
        public PassportSimpleRequest makeHttpsRequest(PassportRequestArguments passportRequestArguments) {
            return new PassportSimpleRequest.PostAsString(passportRequestArguments) { // from class: com.xiaomi.accountsdk.request.PassportLoginRequest.ByPassword.1
                @Override // com.xiaomi.accountsdk.request.PassportSimpleRequest.PostAsString, com.xiaomi.accountsdk.request.PassportRequest
                public SimpleRequest.StringContent execute() throws PassportRequestException, IOException {
                    MetaLoginData metaLoginData = ByPassword.this.mmetaLoginData;
                    if (metaLoginData == null) {
                        try {
                            metaLoginData = XMPassport.getMetaLoginData(ByPassword.this.userId, ByPassword.this.serviceId);
                            if (metaLoginData == null) {
                                throw new PassportRequestException(new InvalidResponseException("Empty meta login data"));
                            }
                        } catch (InvalidUserNameException e) {
                            throw new PassportRequestException(e);
                        } catch (AccessDeniedException e2) {
                            throw new PassportRequestException(e2);
                        } catch (AuthenticationFailureException e3) {
                            throw new PassportRequestException(e3);
                        } catch (InvalidResponseException e4) {
                            throw new PassportRequestException(e4);
                        } catch (IOException e5) {
                            throw e5;
                        }
                    }
                    this.arguments.params.easyPut("_sign", metaLoginData.sign);
                    this.arguments.params.easyPut("qs", metaLoginData.qs);
                    this.arguments.params.easyPut("callback", metaLoginData.callback);
                    return super.execute();
                }
            };
        }
    }

    public PassportLoginRequest(PassportRequestArguments passportRequestArguments) {
        this.request = makeHttpsRequest(passportRequestArguments);
        AccountLogger.log(TAG, "loginType:" + getLoginType());
    }

    @Override // com.xiaomi.accountsdk.request.PassportRequest
    public SimpleRequest.StringContent execute() throws PassportRequestException, IOException {
        return this.request.execute();
    }

    public abstract String getLoginType();

    public boolean isResultFromCA() {
        PassportRequest passportRequest = this.request;
        return (passportRequest instanceof PassportFallbackableRequest) && !((PassportFallbackableRequest) passportRequest).isRequest2Used();
    }

    public abstract PassportSimpleRequest makeHttpsRequest(PassportRequestArguments passportRequestArguments);
}
