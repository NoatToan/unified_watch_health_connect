package com.mapbox.maps.extension.compose.style.sources;

import com.mapbox.bindgen.Value;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class SourceState$setBuilderPropertyAction$1 extends q implements p<String, Value, Unit> {
    public SourceState$setBuilderPropertyAction$1(Object obj) {
        super(2, obj, SourceState.class, "setBuilderProperty", "setBuilderProperty$extension_compose_release(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, Value value) {
        str.getClass();
        value.getClass();
        ((SourceState) this.receiver).setBuilderProperty$extension_compose_release(str, value);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(String str, Value value) {
        invoke2(str, value);
        return Unit.INSTANCE;
    }
}
