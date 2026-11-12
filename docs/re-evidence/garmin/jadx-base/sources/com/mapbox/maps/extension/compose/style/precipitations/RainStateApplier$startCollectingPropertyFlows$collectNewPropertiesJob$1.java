package com.mapbox.maps.extension.compose.style.precipitations;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxMap;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import r53.y1;
import r53.z1;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
@e(c = "com.mapbox.maps.extension.compose.style.precipitations.RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1", f = "RainStateApplier.kt", l = {80}, m = "invokeSuspend")
public final class RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1 extends i implements p<b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ MapboxMap $mapboxMap;
    int label;
    final /* synthetic */ RainStateApplier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1(RainStateApplier rainStateApplier, MapboxMap mapboxMap, t13.d<? super RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1> dVar) {
        super(2, dVar);
        this.this$0 = rainStateApplier;
        this.$mapboxMap = mapboxMap;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1(this.this$0, this.$mapboxMap, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            y1 y1Var = this.this$0.propertiesFlowsToCollect;
            final RainStateApplier rainStateApplier = this.this$0;
            final MapboxMap mapboxMap = this.$mapboxMap;
            j<o13.p<? extends String, ? extends z1<Value>>> jVar = new j<o13.p<? extends String, ? extends z1<Value>>>() { // from class: com.mapbox.maps.extension.compose.style.precipitations.RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1.1
                /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
                public final Object emit2(o13.p<String, ? extends z1<Value>> pVar, t13.d<? super Unit> dVar) {
                    String str = pVar.f128594a;
                    rainStateApplier.propertiesUpdateJobs.add(ge1.b.T(rainStateApplier.coroutineScope, null, null, new RainStateApplier$startCollectingPropertyFlows$collectNewPropertiesJob$1$1$emit$updatePropertyJob$1((z1) pVar.f128595b, str, mapboxMap, rainStateApplier, null), 3));
                    return Unit.INSTANCE;
                }

                @Override // r53.j
                public /* bridge */ /* synthetic */ Object emit(o13.p<? extends String, ? extends z1<Value>> pVar, t13.d dVar) {
                    return emit2((o13.p<String, ? extends z1<Value>>) pVar, (t13.d<? super Unit>) dVar);
                }
            };
            this.label = 1;
            if (y1Var.collect(jVar, this) == aVar) {
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
}
