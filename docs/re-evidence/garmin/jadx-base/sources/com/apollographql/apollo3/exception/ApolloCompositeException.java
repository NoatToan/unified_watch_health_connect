package com.apollographql.apollo3.exception;

import o13.e;
import o13.g;
import p005kotlin.Metadata;
import p13.h0;
import r1.q2;
import x13.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\u00020\u00018G¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00018G¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloCompositeException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "first", "", "second", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "getFirst$annotations", "()V", "getFirst", "()Lcom/apollographql/apollo3/exception/ApolloException;", "getSecond$annotations", "getSecond", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ApolloCompositeException extends ApolloException {
    public ApolloCompositeException(Throwable th3, Throwable th4) {
        super("multiple exceptions happened", th4);
        if (th3 != null) {
            g.a(this, th3);
        }
        if (th4 != null) {
            g.a(this, th4);
        }
    }

    public static /* synthetic */ void getFirst$annotations() {
    }

    public static /* synthetic */ void getSecond$annotations() {
    }

    @e
    public final ApolloException getFirst() {
        Throwable th3 = (Throwable) h0.d0(b.f188452a.b(this));
        ApolloException apolloException = th3 instanceof ApolloException ? (ApolloException) th3 : null;
        if (apolloException != null) {
            return apolloException;
        }
        q2.v("unexpected first exception", th3);
        return null;
    }

    @e
    public final ApolloException getSecond() {
        Throwable th3 = (Throwable) h0.e0(1, b.f188452a.b(this));
        ApolloException apolloException = th3 instanceof ApolloException ? (ApolloException) th3 : null;
        if (apolloException != null) {
            return apolloException;
        }
        q2.v("unexpected second exception", th3);
        return null;
    }
}
