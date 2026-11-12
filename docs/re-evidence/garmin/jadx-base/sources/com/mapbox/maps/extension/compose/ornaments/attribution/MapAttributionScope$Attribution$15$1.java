package com.mapbox.maps.extension.compose.ornaments.attribution;

import com.mapbox.maps.extension.compose.R;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapAttributionScope$Attribution$15$1 extends w implements a<Unit> {
    final /* synthetic */ p1<Boolean> $showTelemetryDialog$delegate;
    final /* synthetic */ MapAttributionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAttributionScope$Attribution$15$1(MapAttributionScope mapAttributionScope, p1<Boolean> p1Var) {
        super(0);
        this.this$0 = mapAttributionScope;
        this.$showTelemetryDialog$delegate = p1Var;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MapAttributionScope mapAttributionScope = this.this$0;
        String string = mapAttributionScope.mapView.getContext().getString(R.string.mapbox_telemetryLink);
        string.getClass();
        mapAttributionScope.showWebPage(string);
        MapAttributionScope.Attribution_hYmLsZ8$lambda$7(this.$showTelemetryDialog$delegate, false);
    }

    @Override // e23.a
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
