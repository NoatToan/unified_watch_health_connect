package com.mapbox.maps.extension.compose.internal;

import e23.l;
import gl1.y;
import n4.g;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import q4.f;
import q4.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapPreviewPlaceholderKt$MapPreviewPlaceHolder$1$1 extends w implements l<f, Unit> {
    final /* synthetic */ long $strokeColor;
    final /* synthetic */ int $strokeWidthInDp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPreviewPlaceholderKt$MapPreviewPlaceHolder$1$1(long j8, int i14) {
        super(1);
        this.$strokeColor = j8;
        this.$strokeWidthInDp = i14;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(f fVar) {
        fVar.getClass();
        float fG = g.g(fVar.b());
        float fD = g.d(fVar.b());
        long j8 = this.$strokeColor;
        long jB = fVar.b();
        float f14 = this.$strokeWidthInDp;
        g6.f.a aVar = g6.f.f75994b;
        f.A0(fVar, j8, 0L, jB, 0.0f, new k(fVar.s0(f14), 0.0f, 0, 0, null, 30, null), null, 106);
        f.G1(fVar, this.$strokeColor, y.f(fG, 0.0f), y.f(0.0f, fD), fVar.s0(this.$strokeWidthInDp), 0, null, 0, 496);
        f.G1(fVar, this.$strokeColor, y.f(0.0f, 0.0f), y.f(fG, fD), fVar.s0(this.$strokeWidthInDp), 0, null, 0, 496);
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(f fVar) {
        invoke2(fVar);
        return Unit.INSTANCE;
    }
}
