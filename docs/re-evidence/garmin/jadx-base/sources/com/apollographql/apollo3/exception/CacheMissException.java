package com.apollographql.apollo3.exception;

import am.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/apollographql/apollo3/exception/CacheMissException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "", Action.KEY_ATTRIBUTE, "fieldName", "", "stale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getFieldName", "Z", "getStale", "()Z", "getStale$annotations", "()V", "Companion", "a", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CacheMissException extends ApolloException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fieldName;
    private final String key;
    private final boolean stale;

    /* JADX WARN: Illegal instructions before constructor call */
    public CacheMissException(String str, String str2, boolean z14) {
        String strG;
        str.getClass();
        INSTANCE.getClass();
        if (str2 == null) {
            strG = j.m("Object '", str, "' not found");
        } else if (z14) {
            strG = e0.g("Field '", str2, "' on object '", str, "' is stale");
        } else {
            strG = "Object '" + str + "' has no field named '" + str2 + CoreConstants.SINGLE_QUOTE_CHAR;
        }
        super(strG, null, 2, null);
        this.key = str;
        this.fieldName = str2;
        this.stale = z14;
    }

    public static /* synthetic */ void getStale$annotations() {
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getStale() {
        return this.stale;
    }

    /* JADX INFO: renamed from: com.apollographql.apollo3.exception.CacheMissException$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo3/exception/CacheMissException$a;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheMissException(String str, String str2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? false : z14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CacheMissException(String str, String str2) {
        this(str, str2, false);
        str.getClass();
    }
}
