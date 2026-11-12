package com.huami.identity.auth.alexa;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0016\u0010\u0006\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0016\u0010\u0007\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0016\u0010\b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0016\u0010\t\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0016\u0010\n\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0016\u0010\f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0016\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0010\u001a\u00020\r8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u0016\u0010\u0011\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0002¨\u0006\u0012"}, d2 = {"", "LWA_ENDPOINT", "Ljava/lang/String;", "SHA_256", "ALGORITHM_SHA_256", "PLAIN", "ARG_GRANT_TYPE", "ARG_CODE", "ARG_REDIRECT_URI", "ARG_CLIENT_ID", "ARG_CODE_VERIFIER", "ARG_REFRESH_TOKEN", "TAG", "", "AUTH_LOGIN_ERROR_NULL", LogUtil.I, "AUTH_LOGIN_ERROR_CANCEL", "LOGOUT_ACTION", "auth-alexa_release"}, k = 2, mv = {1, 5, 1})
public final class ConstantsKt {

    @NotNull
    public static final String ALGORITHM_SHA_256 = "SHA-256";

    @NotNull
    public static final String ARG_CLIENT_ID = "client_id";

    @NotNull
    public static final String ARG_CODE = "code";

    @NotNull
    public static final String ARG_CODE_VERIFIER = "code_verifier";

    @NotNull
    public static final String ARG_GRANT_TYPE = "grant_type";

    @NotNull
    public static final String ARG_REDIRECT_URI = "redirect_uri";

    @NotNull
    public static final String ARG_REFRESH_TOKEN = "refresh_token";
    public static final int AUTH_LOGIN_ERROR_CANCEL = -1;
    public static final int AUTH_LOGIN_ERROR_NULL = 0;

    @NotNull
    public static final String LOGOUT_ACTION = "com.huami.watch.companion.action.alexaLogout";

    @NotNull
    public static final String LWA_ENDPOINT = "https://api.amazon.com/auth/o2/token";

    @NotNull
    public static final String PLAIN = "plain";

    @NotNull
    public static final String SHA_256 = "S256";

    @NotNull
    public static final String TAG = "speech";
}
