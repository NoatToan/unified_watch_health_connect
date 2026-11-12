package org.koin.core.time;

import e53.c;
import e53.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Le53/c;", "", "getInMs-LRDsOJo", "(J)D", "inMs", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DurationExtKt {
    /* JADX INFO: renamed from: getInMs-LRDsOJo, reason: not valid java name */
    public static final double m498getInMsLRDsOJo(long j8) {
        c.a aVar = c.f63094b;
        return c.j(j8, f.MICROSECONDS) / 1000.0d;
    }
}
