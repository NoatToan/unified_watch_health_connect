package com.apollographql.apollo3.exception;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloParseException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ApolloParseException extends ApolloException {
    public /* synthetic */ ApolloParseException(String str, Throwable th3, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : th3);
    }

    public ApolloParseException(String str, Throwable th3) {
        super(str, th3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApolloParseException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
