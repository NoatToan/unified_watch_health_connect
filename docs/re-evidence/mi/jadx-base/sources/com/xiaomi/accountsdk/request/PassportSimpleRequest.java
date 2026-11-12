package com.xiaomi.accountsdk.request;

import com.miui.tsmclient.util.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class PassportSimpleRequest extends PassportRequest {
    public static final String HTTP_METHOD_GET = "GET";
    public static final String HTTP_METHOD_POST = "POST";
    protected final PassportRequestArguments arguments;

    public static class GetAsString extends PassportSimpleRequest {
        public GetAsString(PassportRequestArguments passportRequestArguments) {
            super(passportRequestArguments);
        }

        @Override // com.xiaomi.accountsdk.request.PassportRequest
        public SimpleRequest.StringContent execute() throws PassportRequestException, IOException {
            try {
                PassportRequestArguments passportRequestArguments = this.arguments;
                return SimpleRequestForAccount.getAsString(passportRequestArguments.url, passportRequestArguments.params, passportRequestArguments.headers, passportRequestArguments.cookies, passportRequestArguments.readBody, passportRequestArguments.timeoutMillis);
            } catch (AccessDeniedException e) {
                throw new PassportRequestException(e);
            } catch (AuthenticationFailureException e2) {
                throw new PassportRequestException(e2);
            }
        }

        @Override // com.xiaomi.accountsdk.request.PassportSimpleRequest
        public String getMethod() {
            return "GET";
        }
    }

    public static class PostAsString extends PassportSimpleRequest {
        public PostAsString(PassportRequestArguments passportRequestArguments) {
            super(passportRequestArguments);
        }

        @Override // com.xiaomi.accountsdk.request.PassportRequest
        public SimpleRequest.StringContent execute() throws PassportRequestException, IOException {
            try {
                PassportRequestArguments passportRequestArguments = this.arguments;
                return SimpleRequestForAccount.postAsString(passportRequestArguments.url, passportRequestArguments.params, passportRequestArguments.cookies, passportRequestArguments.headers, passportRequestArguments.urlParams, passportRequestArguments.readBody, passportRequestArguments.timeoutMillis);
            } catch (AccessDeniedException e) {
                throw new PassportRequestException(e);
            } catch (AuthenticationFailureException e2) {
                throw new PassportRequestException(e2);
            }
        }

        @Override // com.xiaomi.accountsdk.request.PassportSimpleRequest
        public String getMethod() {
            return "POST";
        }
    }

    public PassportSimpleRequest(PassportRequestArguments passportRequestArguments) {
        if (passportRequestArguments == null) {
            throw new IllegalArgumentException("arguments can't be null");
        }
        this.arguments = passportRequestArguments;
    }

    public PassportSimpleRequest copy() {
        PassportRequestArguments passportRequestArgumentsCopy = this.arguments.copy();
        if (this instanceof GetAsString) {
            return new GetAsString(passportRequestArgumentsCopy);
        }
        if (this instanceof PostAsString) {
            return new PostAsString(passportRequestArgumentsCopy);
        }
        throw new IllegalStateException("");
    }

    public abstract String getMethod();

    public boolean isHTTPS() {
        String str = this.arguments.url;
        return str != null && str.toLowerCase().startsWith(Constants.URI_SCHEME);
    }
}
