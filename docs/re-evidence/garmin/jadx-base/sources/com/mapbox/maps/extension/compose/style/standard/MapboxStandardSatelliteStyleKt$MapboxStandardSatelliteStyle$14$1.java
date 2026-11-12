package com.mapbox.maps.extension.compose.style.standard;

import com.mapbox.maps.extension.compose.style.SlotsContent;
import e23.l;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapboxStandardSatelliteStyleKt$MapboxStandardSatelliteStyle$14$1 extends w implements l<SlotsContent, Unit> {
    final /* synthetic */ p<m, Integer, Unit> $bottomSlot;
    final /* synthetic */ p<m, Integer, Unit> $middleSlot;
    final /* synthetic */ p<m, Integer, Unit> $topSlot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapboxStandardSatelliteStyleKt$MapboxStandardSatelliteStyle$14$1(p<? super m, ? super Integer, Unit> pVar, p<? super m, ? super Integer, Unit> pVar2, p<? super m, ? super Integer, Unit> pVar3) {
        super(1);
        this.$topSlot = pVar;
        this.$middleSlot = pVar2;
        this.$bottomSlot = pVar3;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SlotsContent slotsContent) {
        slotsContent.getClass();
        p<m, Integer, Unit> pVar = this.$topSlot;
        if (pVar != null) {
            slotsContent.slot("top", pVar);
        }
        p<m, Integer, Unit> pVar2 = this.$middleSlot;
        if (pVar2 != null) {
            slotsContent.slot("middle", pVar2);
        }
        p<m, Integer, Unit> pVar3 = this.$bottomSlot;
        if (pVar3 != null) {
            slotsContent.slot("bottom", pVar3);
        }
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(SlotsContent slotsContent) {
        invoke2(slotsContent);
        return Unit.INSTANCE;
    }
}
