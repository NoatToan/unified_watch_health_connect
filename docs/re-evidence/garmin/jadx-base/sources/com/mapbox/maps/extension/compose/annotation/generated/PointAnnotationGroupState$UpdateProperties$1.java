package com.mapbox.maps.extension.compose.annotation.generated;

import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class PointAnnotationGroupState$UpdateProperties$1 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ PointAnnotationManager $annotationManager;
    final /* synthetic */ PointAnnotationGroupState $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointAnnotationGroupState$UpdateProperties$1(PointAnnotationGroupState pointAnnotationGroupState, PointAnnotationManager pointAnnotationManager, int i14) {
        super(2);
        this.$tmp0_rcvr = pointAnnotationGroupState;
        this.$annotationManager = pointAnnotationManager;
        this.$$changed = i14;
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(m mVar, int i14) {
        this.$tmp0_rcvr.UpdateProperties$extension_compose_release(this.$annotationManager, mVar, this.$$changed | 1);
    }
}
