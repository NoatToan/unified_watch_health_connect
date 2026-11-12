package com.mapbox.maps.extension.compose.style.internal;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class StyleSlotKt$StyleSlot$1$1$1 extends w implements e23.a<StyleSlotNode> {
    final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleSlotKt$StyleSlot$1$1$1(String str) {
        super(0);
        this.$name = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final StyleSlotNode invoke() {
        return new StyleSlotNode(this.$name);
    }
}
