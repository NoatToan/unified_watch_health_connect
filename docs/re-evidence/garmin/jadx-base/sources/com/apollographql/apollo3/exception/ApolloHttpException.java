package com.apollographql.apollo3.exception;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import w63.g;
import wh.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloHttpException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "", "statusCode", "", "Lwh/e;", "headers", "Lw63/g;", TtmlNode.TAG_BODY, "", "message", "", "cause", "<init>", "(ILjava/util/List;Lw63/g;Ljava/lang/String;Ljava/lang/Throwable;)V", "I", "getStatusCode", "()I", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "Lw63/g;", "getBody", "()Lw63/g;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ApolloHttpException extends ApolloException {
    private final g body;
    private final List<e> headers;
    private final int statusCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloHttpException(int i14, List<e> list, g gVar, String str, Throwable th3) {
        super(str, th3);
        list.getClass();
        str.getClass();
        this.statusCode = i14;
        this.headers = list;
        this.body = gVar;
    }

    public final g getBody() {
        return this.body;
    }

    public final List<e> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public /* synthetic */ ApolloHttpException(int i14, List list, g gVar, String str, Throwable th3, int i15, j jVar) {
        this(i14, list, gVar, str, (i15 & 16) != 0 ? null : th3);
    }
}
