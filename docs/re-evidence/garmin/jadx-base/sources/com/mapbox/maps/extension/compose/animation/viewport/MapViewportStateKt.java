package com.mapbox.maps.extension.compose.animation.viewport;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\b\u0006\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\u0004*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/compose/animation/viewport/MapViewportState;", "", "init", "rememberMapViewportState", "(Ljava/lang/String;Le23/l;Lp3/m;II)Lcom/mapbox/maps/extension/compose/animation/viewport/MapViewportState;", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "easeToImmediately", "(Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;Lcom/mapbox/maps/CameraOptions;)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapViewportStateKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportStateKt$rememberMapViewportState$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass2 extends w implements e23.a<MapViewportState> {
        final /* synthetic */ l<MapViewportState, Unit> $init;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(l<? super MapViewportState, Unit> lVar) {
            super(0);
            this.$init = lVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.a
        public final MapViewportState invoke() {
            MapViewportState mapViewportState = new MapViewportState(null, 1, 0 == true ? 1 : 0);
            this.$init.invoke(mapViewportState);
            return mapViewportState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void easeToImmediately(CameraAnimationsPlugin cameraAnimationsPlugin, CameraOptions cameraOptions) {
        MapAnimationOptions.Companion companion = MapAnimationOptions.INSTANCE;
        MapAnimationOptions.Builder builder = new MapAnimationOptions.Builder();
        builder.duration(0L);
        Unit unit = Unit.INSTANCE;
        CameraAnimationsPlugin.DefaultImpls.easeTo$default(cameraAnimationsPlugin, cameraOptions, builder.build(), null, 4, null);
    }

    public static final MapViewportState rememberMapViewportState(String str, l<? super MapViewportState, Unit> lVar, m mVar, int i14, int i15) {
        mVar.L(-135744814);
        if ((i15 & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i15 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        MapViewportState mapViewportState = (MapViewportState) d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), str2, new AnonymousClass2(lVar), mVar, ((i14 << 6) & 896) | 72, 0);
        mVar.R();
        return mapViewportState;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportStateKt$rememberMapViewportState$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1 extends w implements l<MapViewportState, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapViewportState mapViewportState) {
            invoke2(mapViewportState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapViewportState mapViewportState) {
            mapViewportState.getClass();
        }
    }
}
