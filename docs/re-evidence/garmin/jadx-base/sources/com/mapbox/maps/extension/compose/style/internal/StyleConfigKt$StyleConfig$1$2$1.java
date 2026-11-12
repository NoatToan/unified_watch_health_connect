package com.mapbox.maps.extension.compose.style.internal;

import com.mapbox.bindgen.Value;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleConfigKt$StyleConfig$1$2$1 extends w implements p<StyleConfigNode, Value, Unit> {
    final /* synthetic */ Value $property;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleConfigKt$StyleConfig$1$2$1(Value value) {
        super(2);
        this.$property = value;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StyleConfigNode styleConfigNode, Value value) {
        styleConfigNode.getClass();
        value.getClass();
        styleConfigNode.setProperty(this.$property);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(StyleConfigNode styleConfigNode, Value value) {
        invoke2(styleConfigNode, value);
        return Unit.INSTANCE;
    }
}
