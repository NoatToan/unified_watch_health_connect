package com.mapbox.maps.extension.compose.style.terrain.generated;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.extension.compose.style.sources.generated.RasterDemSourceState;
import e23.a;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0006\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState;", "rasterDemSourceState", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "", "init", "rememberTerrainState", "(Lcom/mapbox/maps/extension/compose/style/sources/generated/RasterDemSourceState;Ljava/lang/String;Le23/l;Lp3/m;II)Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TerrainStateKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.terrain.generated.TerrainStateKt$rememberTerrainState$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass2 extends w implements a<TerrainState> {
        final /* synthetic */ l<TerrainState, Unit> $init;
        final /* synthetic */ RasterDemSourceState $rasterDemSourceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(RasterDemSourceState rasterDemSourceState, l<? super TerrainState, Unit> lVar) {
            super(0);
            this.$rasterDemSourceState = rasterDemSourceState;
            this.$init = lVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final TerrainState invoke() {
            TerrainState terrainState = new TerrainState(this.$rasterDemSourceState);
            this.$init.invoke(terrainState);
            return terrainState;
        }
    }

    public static final TerrainState rememberTerrainState(RasterDemSourceState rasterDemSourceState, String str, l<? super TerrainState, Unit> lVar, m mVar, int i14, int i15) {
        rasterDemSourceState.getClass();
        mVar.L(2126220653);
        if ((i15 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i15 & 4) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        TerrainState terrainState = (TerrainState) d4.a.d(new Object[0], TerrainState.INSTANCE.getSaver(), str2, new AnonymousClass2(rasterDemSourceState, lVar), mVar, ((i14 << 3) & 896) | 72, 0);
        mVar.R();
        return terrainState;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.terrain.generated.TerrainStateKt$rememberTerrainState$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1 extends w implements l<TerrainState, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(TerrainState terrainState) {
            invoke2(terrainState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TerrainState terrainState) {
            terrainState.getClass();
        }
    }
}
