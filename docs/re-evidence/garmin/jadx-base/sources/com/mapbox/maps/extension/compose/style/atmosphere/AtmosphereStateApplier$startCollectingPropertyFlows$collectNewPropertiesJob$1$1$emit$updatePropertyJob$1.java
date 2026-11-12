package com.mapbox.maps.extension.compose.style.atmosphere;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import e23.p;
import java.util.HashMap;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import r53.z1;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
@e(c = "com.mapbox.maps.extension.compose.style.atmosphere.AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1", f = "AtmosphereStateApplier.kt", l = {74}, m = "invokeSuspend")
public final class AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1 extends i implements p<b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ MapboxMap $mapboxMap;
    final /* synthetic */ String $name;
    final /* synthetic */ z1<Value> $valueFlow;
    int label;
    final /* synthetic */ AtmosphereStateApplier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1(z1<Value> z1Var, String str, MapboxMap mapboxMap, AtmosphereStateApplier atmosphereStateApplier, t13.d<? super AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1> dVar) {
        super(2, dVar);
        this.$valueFlow = z1Var;
        this.$name = str;
        this.$mapboxMap = mapboxMap;
        this.this$0 = atmosphereStateApplier;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1(this.$valueFlow, this.$name, this.$mapboxMap, this.this$0, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            z1<Value> z1Var = this.$valueFlow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$name, this.$mapboxMap, this.this$0);
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
        o2.c.f();
        return null;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.atmosphere.AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "value", "Lcom/mapbox/bindgen/Value;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements j<Value> {
        final /* synthetic */ MapboxMap $mapboxMap;
        final /* synthetic */ String $name;
        final /* synthetic */ AtmosphereStateApplier this$0;

        public AnonymousClass1(String str, MapboxMap mapboxMap, AtmosphereStateApplier atmosphereStateApplier) {
            this.$name = str;
            this.$mapboxMap = mapboxMap;
            this.this$0 = atmosphereStateApplier;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$4(final AtmosphereStateApplier atmosphereStateApplier, final MapboxMap mapboxMap, final String str, final Value value, final String str2) {
            atmosphereStateApplier.getClass();
            mapboxMap.getClass();
            str.getClass();
            value.getClass();
            str2.getClass();
            if (!atmosphereStateApplier.atmosphereSet) {
                Value valueValueOf = Value.valueOf((HashMap<String, Value>) new HashMap());
                valueValueOf.getClass();
                mapboxMap.setStyleAtmosphere(valueValueOf).onValue(new Expected.Action() { // from class: com.mapbox.maps.extension.compose.style.atmosphere.d
                    @Override // com.mapbox.bindgen.Expected.Action
                    public final void run(Object obj) {
                        AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$2(atmosphereStateApplier, mapboxMap, str, value, str2, (None) obj);
                    }
                }).onError(new b(str, value, 2));
                return;
            }
            MapboxLogger.logE("AtmosphereStateApplier", "Failed to set atmosphere property " + str + " as " + value + ": " + str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$4$lambda$2(AtmosphereStateApplier atmosphereStateApplier, MapboxMap mapboxMap, final String str, final Value value, final String str2, None none) {
            atmosphereStateApplier.getClass();
            mapboxMap.getClass();
            str.getClass();
            value.getClass();
            str2.getClass();
            none.getClass();
            atmosphereStateApplier.atmosphereSet = true;
            mapboxMap.setStyleAtmosphereProperty(str, value).onError(new Expected.Action() { // from class: com.mapbox.maps.extension.compose.style.atmosphere.c
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4$lambda$2$lambda$0(str, value, str2, (String) obj);
                }
            }).onValue(new b(str, value, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$4$lambda$2$lambda$0(String str, Value value, String str2, String str3) {
            str.getClass();
            value.getClass();
            str2.getClass();
            str3.getClass();
            MapboxLogger.logE("AtmosphereStateApplier", "Failed to set atmosphere property " + str + " as " + value + ": " + str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$4$lambda$2$lambda$1(String str, Value value, None none) {
            str.getClass();
            value.getClass();
            none.getClass();
            MapboxLogger.logD("AtmosphereStateApplier", "settingProperty: name=" + str + ", value=" + value + " executed");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$4$lambda$3(String str, Value value, String str2) {
            str.getClass();
            value.getClass();
            str2.getClass();
            MapboxLogger.logE("AtmosphereStateApplier", "Failed to set atmosphere with no properties, error = ".concat(str2));
            MapboxLogger.logE("AtmosphereStateApplier", "settingProperty: name=" + str + ", value=" + value + " ignored");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$5(String str, Value value, None none) {
            str.getClass();
            value.getClass();
            none.getClass();
            MapboxLogger.logD("AtmosphereStateApplier", "settingProperty: name=" + str + ", value=" + value + " executed");
        }

        /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
        public final Object emit2(final Value value, t13.d<? super Unit> dVar) {
            MapboxLogger.logD("AtmosphereStateApplier", "settingProperty: name=" + this.$name + ", value=" + value + " ...");
            Expected<String, None> styleAtmosphereProperty = this.$mapboxMap.setStyleAtmosphereProperty(this.$name, value);
            final AtmosphereStateApplier atmosphereStateApplier = this.this$0;
            final MapboxMap mapboxMap = this.$mapboxMap;
            final String str = this.$name;
            styleAtmosphereProperty.onError(new Expected.Action() { // from class: com.mapbox.maps.extension.compose.style.atmosphere.a
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    AtmosphereStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1.AnonymousClass1.emit$lambda$4(atmosphereStateApplier, mapboxMap, str, value, (String) obj);
                }
            }).onValue(new b(this.$name, value, 0));
            return Unit.INSTANCE;
        }

        @Override // r53.j
        public /* bridge */ /* synthetic */ Object emit(Value value, t13.d dVar) {
            return emit2(value, (t13.d<? super Unit>) dVar);
        }
    }
}
