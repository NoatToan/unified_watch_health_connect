package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/mapbox/common/Cancelable;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class NativeObserver$subscribeStyleDataLoaded$resubscriber$1 extends w implements e23.a<Cancelable> {
    final /* synthetic */ StyleDataLoadedCallback $styleDataLoadedCallback;
    final /* synthetic */ NativeObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeObserver$subscribeStyleDataLoaded$resubscriber$1(NativeObserver nativeObserver, StyleDataLoadedCallback styleDataLoadedCallback) {
        super(0);
        this.this$0 = nativeObserver;
        this.$styleDataLoadedCallback = styleDataLoadedCallback;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final Cancelable invoke() {
        return this.this$0.observable.subscribe(this.$styleDataLoadedCallback);
    }
}
