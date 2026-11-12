package com.mapbox.maps.extension.style.layers.properties.generated;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kg.f;
import o2.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LayerProperty;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IconRotationAlignment implements LayerProperty {
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final IconRotationAlignment MAP = new IconRotationAlignment("map");
    public static final IconRotationAlignment VIEWPORT = new IconRotationAlignment("viewport");
    public static final IconRotationAlignment AUTO = new IconRotationAlignment(TtmlNode.TEXT_EMPHASIS_AUTO);

    private IconRotationAlignment(String str) {
        this.value = str;
    }

    public static final IconRotationAlignment valueOf(String str) {
        return INSTANCE.valueOf(str);
    }

    public boolean equals(Object other) {
        return (other instanceof IconRotationAlignment) && s.g(getValue(), ((IconRotationAlignment) other).getValue());
    }

    @Override // com.mapbox.maps.extension.style.layers.properties.generated.LayerProperty
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "IconRotationAlignment(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment$Companion;", "", "()V", "AUTO", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconRotationAlignment;", "MAP", "VIEWPORT", CoreConstants.VALUE_OF, "value", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final IconRotationAlignment valueOf(String value) {
            value.getClass();
            int iHashCode = value.hashCode();
            if (iHashCode != 76092) {
                if (iHashCode != 2020783) {
                    if (iHashCode == 1979312294 && value.equals("VIEWPORT")) {
                        return IconRotationAlignment.VIEWPORT;
                    }
                } else if (value.equals("AUTO")) {
                    return IconRotationAlignment.AUTO;
                }
            } else if (value.equals("MAP")) {
                return IconRotationAlignment.MAP;
            }
            f.n(c.c(']', "IconRotationAlignment.valueOf does not support [", value));
            return null;
        }

        private Companion() {
        }
    }
}
