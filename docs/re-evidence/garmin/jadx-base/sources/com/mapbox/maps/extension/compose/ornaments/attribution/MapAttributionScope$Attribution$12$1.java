package com.mapbox.maps.extension.compose.ornaments.attribution;

import e23.a;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.p1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapAttributionScope$Attribution$12$1 extends w implements a<Unit> {
    final /* synthetic */ p1<Boolean> $showAttributionDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAttributionScope$Attribution$12$1(p1<Boolean> p1Var) {
        super(0);
        this.$showAttributionDialog$delegate = p1Var;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MapAttributionScope.Attribution_hYmLsZ8$lambda$4(this.$showAttributionDialog$delegate, false);
    }

    @Override // e23.a
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
