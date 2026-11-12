package oj0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Loj0/x;", "", "", "customerGuid", "Loj0/y;", "request", "Lc83/a0;", "a", "(Ljava/lang/String;Loj0/y;Lt13/d;)Ljava/lang/Object;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface x {
    @i83.o("/api/subscription/customers/{customerGuid}/optimisticsubscription")
    Object a(@i83.s("customerGuid") String str, @i83.a y yVar, t13.d<? super c83.a0<Object>> dVar);
}
