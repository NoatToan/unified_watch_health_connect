package com.mapbox.maps.extension.compose;

import android.os.Parcelable;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettingsKt;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/MapState;", "holder", "Lcom/mapbox/maps/extension/compose/MapState$Holder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapState$Companion$Saver$2 extends w implements l<MapState.Holder, MapState> {
    public static final MapState$Companion$Saver$2 INSTANCE = new MapState$Companion$Saver$2();

    public MapState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final MapState invoke(MapState.Holder holder) {
        holder.getClass();
        Parcelable parcelable = holder.getSavedProperties().get("GesturesSettings");
        GesturesSettings GesturesSettings = parcelable instanceof GesturesSettings ? (GesturesSettings) parcelable : null;
        if (GesturesSettings == null) {
            GesturesSettings = GesturesSettingsKt.GesturesSettings(AnonymousClass1.INSTANCE);
        }
        MapboxLogger.logD("MapState", "restore: " + GesturesSettings);
        return new MapState(GesturesSettings);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapState$Companion$Saver$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings$Builder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<GesturesSettings.Builder, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(GesturesSettings.Builder builder) {
            invoke2(builder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GesturesSettings.Builder builder) {
            builder.getClass();
        }
    }
}
