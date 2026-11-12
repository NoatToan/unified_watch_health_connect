package com.mapbox.maps.extension.compose.style.precipitations;

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
@e(c = "com.mapbox.maps.extension.compose.style.precipitations.SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1", f = "SnowStateApplier.kt", l = {78}, m = "invokeSuspend")
public final class SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1 extends i implements p<b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ MapboxMap $mapboxMap;
    final /* synthetic */ String $name;
    final /* synthetic */ z1<Value> $valueFlow;
    int label;
    final /* synthetic */ SnowStateApplier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1(z1<Value> z1Var, String str, MapboxMap mapboxMap, SnowStateApplier snowStateApplier, t13.d<? super SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1> dVar) {
        super(2, dVar);
        this.$valueFlow = z1Var;
        this.$name = str;
        this.$mapboxMap = mapboxMap;
        this.this$0 = snowStateApplier;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1(this.$valueFlow, this.$name, this.$mapboxMap, this.this$0, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
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

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.precipitations.SnowStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "value", "Lcom/mapbox/bindgen/Value;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements j<Value> {
        final /* synthetic */ MapboxMap $mapboxMap;
        final /* synthetic */ String $name;
        final /* synthetic */ SnowStateApplier this$0;

        public AnonymousClass1(String str, MapboxMap mapboxMap, SnowStateApplier snowStateApplier) {
            this.$name = str;
            this.$mapboxMap = mapboxMap;
            this.this$0 = snowStateApplier;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$4(SnowStateApplier snowStateApplier, MapboxMap mapboxMap, String str, Value value, String str2) {
            snowStateApplier.getClass();
            mapboxMap.getClass();
            str.getClass();
            value.getClass();
            str2.getClass();
            if (!snowStateApplier.snowSet) {
                Value valueValueOf = Value.valueOf((HashMap<String, Value>) new HashMap());
                valueValueOf.getClass();
                mapboxMap.setStyleSnow(valueValueOf).onValue(new d(snowStateApplier, mapboxMap, str, value, str2, 1)).onError(new b(str, value, 4));
                return;
            }
            MapboxLogger.logE("SnowStateApplier", "Failed to set snow property " + str + " as " + value + ": " + str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$4$lambda$2(SnowStateApplier snowStateApplier, MapboxMap mapboxMap, String str, Value value, String str2, None none) {
            snowStateApplier.getClass();
            mapboxMap.getClass();
            str.getClass();
            value.getClass();
            str2.getClass();
            none.getClass();
            snowStateApplier.snowSet = true;
            mapboxMap.setStyleSnowProperty(str, value).onError(new a(str, str2, value, 1)).onValue(new b(str, value, 3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$4$lambda$2$lambda$0(String str, Value value, String str2, String str3) {
            str.getClass();
            value.getClass();
            str2.getClass();
            str3.getClass();
            MapboxLogger.logE("SnowStateApplier", "Failed to set snow property " + str + " as " + value + ": " + str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$4$lambda$2$lambda$1(String str, Value value, None none) {
            str.getClass();
            value.getClass();
            none.getClass();
            MapboxLogger.logD("SnowStateApplier", "settingProperty: name=" + str + ", value=" + value + " executed");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$4$lambda$3(String str, Value value, String str2) {
            str.getClass();
            value.getClass();
            str2.getClass();
            MapboxLogger.logE("SnowStateApplier", "Failed to set snow with no properties, error = ".concat(str2));
            MapboxLogger.logE("SnowStateApplier", "settingProperty: name=" + str + ", value=" + value + " ignored");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$5(String str, Value value, None none) {
            str.getClass();
            value.getClass();
            none.getClass();
            MapboxLogger.logD("SnowStateApplier", "settingProperty: name=" + str + ", value=" + value + " executed");
        }

        /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
        public final Object emit2(Value value, t13.d<? super Unit> dVar) {
            MapboxLogger.logD("SnowStateApplier", "settingProperty: name=" + this.$name + ", value=" + value + " ...");
            this.$mapboxMap.setStyleSnowProperty(this.$name, value).onError(new c(this.this$0, this.$mapboxMap, this.$name, value, 1)).onValue(new b(this.$name, value, 5));
            return Unit.INSTANCE;
        }

        @Override // r53.j
        public /* bridge */ /* synthetic */ Object emit(Value value, t13.d dVar) {
            return emit2(value, (t13.d<? super Unit>) dVar);
        }
    }
}
