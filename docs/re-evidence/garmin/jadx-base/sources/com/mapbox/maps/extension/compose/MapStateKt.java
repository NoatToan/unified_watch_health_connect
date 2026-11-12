package com.mapbox.maps.extension.compose;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import e23.a;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\b\u0006\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/compose/MapState;", "", "init", "rememberMapState", "(Ljava/lang/String;Le23/l;Lp3/m;II)Lcom/mapbox/maps/extension/compose/MapState;", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapStateKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapStateKt$rememberMapState$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass2 extends w implements a<MapState> {
        final /* synthetic */ l<MapState, Unit> $init;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(l<? super MapState, Unit> lVar) {
            super(0);
            this.$init = lVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final MapState invoke() {
            MapState mapState = new MapState();
            this.$init.invoke(mapState);
            return mapState;
        }
    }

    public static final MapState rememberMapState(String str, l<? super MapState, Unit> lVar, m mVar, int i14, int i15) {
        mVar.L(-231233878);
        if ((i15 & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i15 & 2) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        MapState mapState = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), str2, new AnonymousClass2(lVar), mVar, ((i14 << 6) & 896) | 72, 0);
        mVar.R();
        return mapState;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapStateKt$rememberMapState$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1 extends w implements l<MapState, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapState mapState) {
            invoke2(mapState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapState mapState) {
            mapState.getClass();
        }
    }
}
