package com.huami.identity.auth.alexa;

import com.amazon.identity.auth.device.api.authorization.AuthorizeResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u001c\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u00008@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/identity/auth/device/api/authorization/AuthorizeResult;", "", "getInfo", "(Lcom/amazon/identity/auth/device/api/authorization/AuthorizeResult;)Ljava/lang/String;", "info", "auth-alexa_release"}, k = 2, mv = {1, 5, 1})
public final class UtilsKt {
    @NotNull
    public static final String getInfo(@Nullable AuthorizeResult authorizeResult) {
        if (authorizeResult == null) {
            return "AuthorizeResult is null";
        }
        return "\naccessToken:       " + ((Object) authorizeResult.getAccessToken()) + "\nauthorizationCode: " + ((Object) authorizeResult.getAuthorizationCode()) + "\nclientId:          " + ((Object) authorizeResult.getClientId()) + "\nredirectURI:       " + ((Object) authorizeResult.getRedirectURI()) + "\nuser:              " + authorizeResult.getUser() + '\n';
    }
}
