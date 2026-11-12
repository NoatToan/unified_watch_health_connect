package com.huami.third.alipay;

import android.text.TextUtils;
import androidx.core.provider.FontsContractCompat;
import com.alipay.sdk.m.s.a;
import com.alipay.sdk.m.u.l;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.passport.Configs;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.Regex;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J&\u0010\u000e\u001a\u00020\r2\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\f\u001a\u00020\u0004R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000f\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013¨\u0006."}, d2 = {"Lcom/huami/third/alipay/AuthResult;", "", "", "str_", "", "remove", "b", "header", "data", "a", "", "rawResult", "removeBrackets", "", "parse", "Ljava/lang/String;", "getResultStatus", "()Ljava/lang/String;", "setResultStatus", "(Ljava/lang/String;)V", l.a, "getResult", "setResult", "result", "c", "getMemo", "setMemo", l.b, GoogleApiAvailabilityLight.a, "getResultCode", "setResultCode", "resultCode", "e", "getAuthCode", "setAuthCode", Configs.Params.AUTHCODE, "f", "getAlipayOpenId", "setAlipayOpenId", "alipayOpenId", "g", "getUserId", "setUserId", "userId", "<init>", "()V", "alipay_release"}, k = 1, mv = {1, 4, 1})
public final class AuthResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String resultStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String result;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String memo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String resultCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String authCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String alipayOpenId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String userId;

    private final String a(String header, String data) {
        return data.substring(header.length(), data.length());
    }

    private final String b(String str_, boolean remove) {
        if (!remove || TextUtils.isEmpty(str_)) {
            return str_;
        }
        if (m.startsWith$default(str_, "\"", false, 2, null)) {
            str_ = new Regex("\"").replaceFirst(str_, "");
        }
        return m.endsWith$default(str_, "\"", false, 2, null) ? str_.substring(0, str_.length() - 1) : str_;
    }

    @Nullable
    public final String getAlipayOpenId() {
        return this.alipayOpenId;
    }

    @Nullable
    public final String getAuthCode() {
        return this.authCode;
    }

    @Nullable
    public final String getMemo() {
        return this.memo;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    @Nullable
    public final String getResultCode() {
        return this.resultCode;
    }

    @Nullable
    public final String getResultStatus() {
        return this.resultStatus;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public final void parse(@NotNull Map<String, String> rawResult, boolean removeBrackets) {
        for (String str : rawResult.keySet()) {
            if (TextUtils.equals(str, l.a)) {
                this.resultStatus = rawResult.get(str);
            } else if (TextUtils.equals(str, "result")) {
                this.result = rawResult.get(str);
            } else if (TextUtils.equals(str, l.b)) {
                this.memo = rawResult.get(str);
            }
        }
        Object[] array = new Regex(a.l).split(this.result, 0).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        for (String str2 : (String[]) array) {
            if (m.startsWith$default(str2, "alipay_open_id", false, 2, null)) {
                this.alipayOpenId = b(a("alipay_open_id=", str2), removeBrackets);
            } else {
                if (m.startsWith$default(str2, "user_id", false, 2, null)) {
                    this.userId = b(a("user_id=", str2), removeBrackets);
                }
                if (m.startsWith$default(str2, Configs.Params.AUTH_CODE, false, 2, null)) {
                    this.authCode = b(a("auth_code=", str2), removeBrackets);
                } else if (m.startsWith$default(str2, FontsContractCompat.Columns.RESULT_CODE, false, 2, null)) {
                    this.resultCode = b(a("result_code=", str2), removeBrackets);
                }
            }
        }
    }

    public final void setAlipayOpenId(@Nullable String str) {
        this.alipayOpenId = str;
    }

    public final void setAuthCode(@Nullable String str) {
        this.authCode = str;
    }

    public final void setMemo(@Nullable String str) {
        this.memo = str;
    }

    public final void setResult(@Nullable String str) {
        this.result = str;
    }

    public final void setResultCode(@Nullable String str) {
        this.resultCode = str;
    }

    public final void setResultStatus(@Nullable String str) {
        this.resultStatus = str;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }
}
