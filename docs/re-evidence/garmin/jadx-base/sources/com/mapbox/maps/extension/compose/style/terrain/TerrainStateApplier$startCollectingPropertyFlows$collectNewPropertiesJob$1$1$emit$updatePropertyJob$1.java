package com.mapbox.maps.extension.compose.style.terrain;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import e23.p;
import o13.r;
import o2.c;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import r53.z1;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
@e(c = "com.mapbox.maps.extension.compose.style.terrain.TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1", f = "TerrainStateApplier.kt", l = {93}, m = "invokeSuspend")
public final class TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ MapboxMap $mapboxMap;
    final /* synthetic */ String $name;
    final /* synthetic */ z1<Value> $valueFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1(z1<Value> z1Var, String str, MapboxMap mapboxMap, d<? super TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1> dVar) {
        super(2, dVar);
        this.$valueFlow = z1Var;
        this.$name = str;
        this.$mapboxMap = mapboxMap;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1(this.$valueFlow, this.$name, this.$mapboxMap, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            z1<Value> z1Var = this.$valueFlow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$name, this.$mapboxMap);
            this.label = 1;
            if (z1Var.collect(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        c.f();
        return null;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.terrain.TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "value", "Lcom/mapbox/bindgen/Value;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements j<Value> {
        final /* synthetic */ MapboxMap $mapboxMap;
        final /* synthetic */ String $name;

        public AnonymousClass1(String str, MapboxMap mapboxMap) {
            this.$name = str;
            this.$mapboxMap = mapboxMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$0(String str, Value value, None none) {
            str.getClass();
            value.getClass();
            none.getClass();
            MapboxLogger.logD("TerrainStateApplier", "settingProperty: name=" + str + ", value=" + value + " executed");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$1(String str, Value value, String str2) {
            str.getClass();
            value.getClass();
            str2.getClass();
            MapboxLogger.logE("TerrainStateApplier", "Failed to set terrain property " + str + " as " + value + ": " + str2);
        }

        /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
        public final Object emit2(final Value value, d<? super Unit> dVar) {
            MapboxLogger.logD("TerrainStateApplier", "settingProperty: name=" + this.$name + ", value=" + value + " ...");
            Expected<String, None> styleTerrainProperty = this.$mapboxMap.setStyleTerrainProperty(this.$name, value);
            final String str = this.$name;
            final int i14 = 0;
            Expected<String, None> expectedOnValue = styleTerrainProperty.onValue(new Expected.Action() { // from class: com.mapbox.maps.extension.compose.style.terrain.a
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$0(str, value, (None) obj);
                            break;
                        default:
                            TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$1(str, value, (String) obj);
                            break;
                    }
                }
            });
            final String str2 = this.$name;
            final int i15 = 1;
            expectedOnValue.onError(new Expected.Action() { // from class: com.mapbox.maps.extension.compose.style.terrain.a
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$0(str2, value, (None) obj);
                            break;
                        default:
                            TerrainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$1(str2, value, (String) obj);
                            break;
                    }
                }
            });
            return Unit.INSTANCE;
        }

        @Override // r53.j
        public /* bridge */ /* synthetic */ Object emit(Value value, d dVar) {
            return emit2(value, (d<? super Unit>) dVar);
        }
    }
}
