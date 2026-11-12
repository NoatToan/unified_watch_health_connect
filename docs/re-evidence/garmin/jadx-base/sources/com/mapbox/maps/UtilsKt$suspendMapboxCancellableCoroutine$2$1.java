package com.mapbox.maps;

import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.common.Cancelable;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\u0003\u0018\u0001\"\u0016\b\u0002\u0010\u0004\u0018\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "E", "V", "T", "Lcom/mapbox/bindgen/Expected;", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
public final class UtilsKt$suspendMapboxCancellableCoroutine$2$1 extends w implements e23.l<Throwable, Unit> {
    final /* synthetic */ Cancelable $cancelable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$suspendMapboxCancellableCoroutine$2$1(Cancelable cancelable) {
        super(1);
        this.$cancelable = cancelable;
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th3) {
        invoke2(th3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th3) {
        this.$cancelable.cancel();
    }
}
