package com.mapbox.maps;

import android.view.ViewConfiguration;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapView$touchSlop$2 extends w implements e23.a<Integer> {
    final /* synthetic */ MapView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapView$touchSlop$2(MapView mapView) {
        super(0);
        this.this$0 = mapView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final Integer invoke() {
        return Integer.valueOf(ViewConfiguration.get(this.this$0.getContext()).getScaledTouchSlop());
    }
}
