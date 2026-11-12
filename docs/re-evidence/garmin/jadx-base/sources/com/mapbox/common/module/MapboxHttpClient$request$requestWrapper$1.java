package com.mapbox.common.module;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/mapbox/common/module/RequestId;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapboxHttpClient$request$requestWrapper$1 extends w implements l<Long, Unit> {
    final /* synthetic */ MapboxHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxHttpClient$request$requestWrapper$1(MapboxHttpClient mapboxHttpClient) {
        super(1);
        this.this$0 = mapboxHttpClient;
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Long l14) {
        invoke(l14.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j8) {
        this.this$0.removeCall(j8);
    }
}
