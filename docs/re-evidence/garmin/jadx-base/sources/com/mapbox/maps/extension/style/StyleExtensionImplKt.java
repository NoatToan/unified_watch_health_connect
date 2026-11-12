package com.mapbox.maps.extension.style;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0001\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0001\u0010\u0007¨\u0006\b"}, d2 = {"", TtmlNode.TAG_STYLE, "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/StyleExtensionImpl$Builder;", "", "block", "Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;", "(Ljava/lang/String;Le23/l;)Lcom/mapbox/maps/extension/style/StyleContract$StyleExtension;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StyleExtensionImplKt {
    public static final StyleContract.StyleExtension style(String str, l<? super StyleExtensionImpl.Builder, Unit> lVar) {
        str.getClass();
        lVar.getClass();
        StyleExtensionImpl.Builder builder = new StyleExtensionImpl.Builder(str);
        lVar.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ StyleContract.StyleExtension style$default(String str, l lVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = "";
        }
        return style(str, lVar);
    }
}
