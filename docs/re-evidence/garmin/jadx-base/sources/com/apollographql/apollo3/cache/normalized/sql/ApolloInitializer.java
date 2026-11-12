package com.apollographql.apollo3.cache.normalized.sql;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import zd.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo3/cache/normalized/sql/ApolloInitializer;", "Lzd/b;", "", "<init>", "()V", "a", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ApolloInitializer implements b<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f28438a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f28439b;

    @Override // zd.b
    public final Unit create(Context context) {
        context.getClass();
        f28438a.getClass();
        f28439b = context;
        return Unit.INSTANCE;
    }

    @Override // zd.b
    public final List<Class<? extends b<?>>> dependencies() {
        return new ArrayList();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo3/cache/normalized/sql/ApolloInitializer$a;", "", "<init>", "()V", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
