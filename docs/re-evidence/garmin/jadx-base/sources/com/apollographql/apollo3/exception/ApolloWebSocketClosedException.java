package com.apollographql.apollo3.exception;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloWebSocketClosedException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "code", "", "reason", "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()I", "getReason", "()Ljava/lang/String;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ApolloWebSocketClosedException extends ApolloException {
    private final int code;
    private final String reason;

    public ApolloWebSocketClosedException(int i14, String str, Throwable th3) {
        super("WebSocket Closed code='" + i14 + "' reason='" + str + CoreConstants.SINGLE_QUOTE_CHAR, th3);
        this.code = i14;
        this.reason = str;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getReason() {
        return this.reason;
    }

    public /* synthetic */ ApolloWebSocketClosedException(int i14, String str, Throwable th3, int i15, j jVar) {
        this(i14, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : th3);
    }
}
