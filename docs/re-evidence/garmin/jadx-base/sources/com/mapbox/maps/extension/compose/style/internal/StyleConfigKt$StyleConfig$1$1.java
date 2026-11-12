package com.mapbox.maps.extension.compose.style.internal;

import com.mapbox.maps.extension.compose.internal.MapApplier;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleConfigKt$StyleConfig$1$1 extends w implements e23.a<StyleConfigNode> {
    final /* synthetic */ b0 $coroutineScope;
    final /* synthetic */ String $importId;
    final /* synthetic */ MapApplier $mapApplier;
    final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleConfigKt$StyleConfig$1$1(String str, String str2, MapApplier mapApplier, b0 b0Var) {
        super(0);
        this.$importId = str;
        this.$name = str2;
        this.$mapApplier = mapApplier;
        this.$coroutineScope = b0Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final StyleConfigNode invoke() {
        return new StyleConfigNode(this.$importId, this.$name, this.$mapApplier.getMapView().getMapboxMapDeprecated(), this.$coroutineScope);
    }
}
