package com.mapbox.maps.extension.compose.internal;

import e23.p;
import h4.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapPreviewPlaceholderKt$MapPreviewPlaceHolder$2 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ r $modifier;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ long $strokeColor;
    final /* synthetic */ int $strokeWidthInDp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPreviewPlaceholderKt$MapPreviewPlaceHolder$2(r rVar, long j8, int i14, long j14, int i15, int i16) {
        super(2);
        this.$modifier = rVar;
        this.$placeholderColor = j8;
        this.$strokeWidthInDp = i14;
        this.$strokeColor = j14;
        this.$$changed = i15;
        this.$$default = i16;
    }

    public final void invoke(m mVar, int i14) {
        MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(this.$modifier, this.$placeholderColor, this.$strokeWidthInDp, this.$strokeColor, mVar, this.$$changed | 1, this.$$default);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
