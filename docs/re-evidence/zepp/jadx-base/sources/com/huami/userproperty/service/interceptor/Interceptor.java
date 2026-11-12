package com.huami.userproperty.service.interceptor;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\bJ#\u0010\u0006\u001a\u00028\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/huami/userproperty/service/interceptor/Interceptor;", "P", "R", "", "Lcom/huami/userproperty/service/interceptor/Interceptor$Chain;", "chain", "intercept", "(Lcom/huami/userproperty/service/interceptor/Interceptor$Chain;)Ljava/lang/Object;", "Chain", "service_release"}, k = 1, mv = {1, 5, 1})
public interface Interceptor<P, R> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003J\u000f\u0010\u0004\u001a\u00028\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/userproperty/service/interceptor/Interceptor$Chain;", "P", "R", "", "params", "()Ljava/lang/Object;", "handle", "(Ljava/lang/Object;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {1, 5, 1})
    public interface Chain<P, R> {
        R handle(P params);

        P params();
    }

    R intercept(@NotNull Chain<P, R> chain);
}
