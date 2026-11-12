package com.garmin.android.lib.networking.authentication.ratelimit;

import com.google.firebase.messaging.Constants;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/lib/networking/authentication/ratelimit/RateLimitException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "serverResponseCode", "", "url", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "retryAfterTimestampUTC", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;J)V", "getServerResponseCode", "()I", "getUrl", "()Ljava/lang/String;", "getError", "getRetryAfterTimestampUTC", "()J", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RateLimitException extends Exception {
    private final String error;
    private final long retryAfterTimestampUTC;
    private final int serverResponseCode;
    private final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    public RateLimitException(int i14, String str, String str2, long j8) {
        str.getClass();
        String str3 = str2 == null ? "" : str2;
        StringBuilder sbR = g.r(i14, "RateLimitException -> ", StringUtils.SPACE, str, "\n");
        sbR.append(str3);
        super(sbR.toString());
        this.serverResponseCode = i14;
        this.url = str;
        this.error = str2;
        this.retryAfterTimestampUTC = j8;
    }

    public final String getError() {
        return this.error;
    }

    public final long getRetryAfterTimestampUTC() {
        return this.retryAfterTimestampUTC;
    }

    public final int getServerResponseCode() {
        return this.serverResponseCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ RateLimitException(int i14, String str, String str2, long j8, int i15, j jVar) {
        this(i14, str, (i15 & 4) != 0 ? null : str2, j8);
    }
}
