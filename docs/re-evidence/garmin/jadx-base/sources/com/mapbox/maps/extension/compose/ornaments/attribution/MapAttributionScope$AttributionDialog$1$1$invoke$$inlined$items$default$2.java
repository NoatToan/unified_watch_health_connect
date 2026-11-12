package com.mapbox.maps.extension.compose.ornaments.attribution;

import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", FirebaseAnalytics.Param.INDEX, "", "invoke", "(I)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class MapAttributionScope$AttributionDialog$1$1$invoke$$inlined$items$default$2 extends w implements l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ l $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAttributionScope$AttributionDialog$1$1$invoke$$inlined$items$default$2(l lVar, List list) {
        super(1);
        this.$key = lVar;
        this.$items = list;
    }

    public final Object invoke(int i14) {
        return this.$key.invoke(this.$items.get(i14));
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
