package com.mapbox.maps.extension.style.layers.properties.generated;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kg.f;
import o2.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LayerProperty;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IconAnchor implements LayerProperty {
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final IconAnchor CENTER = new IconAnchor(TtmlNode.CENTER);
    public static final IconAnchor LEFT = new IconAnchor(TtmlNode.LEFT);
    public static final IconAnchor RIGHT = new IconAnchor(TtmlNode.RIGHT);
    public static final IconAnchor TOP = new IconAnchor("top");
    public static final IconAnchor BOTTOM = new IconAnchor("bottom");
    public static final IconAnchor TOP_LEFT = new IconAnchor("top-left");
    public static final IconAnchor TOP_RIGHT = new IconAnchor("top-right");
    public static final IconAnchor BOTTOM_LEFT = new IconAnchor("bottom-left");
    public static final IconAnchor BOTTOM_RIGHT = new IconAnchor("bottom-right");

    private IconAnchor(String str) {
        this.value = str;
    }

    public static final IconAnchor valueOf(String str) {
        return INSTANCE.valueOf(str);
    }

    public boolean equals(Object other) {
        return (other instanceof IconAnchor) && s.g(getValue(), ((IconAnchor) other).getValue());
    }

    @Override // com.mapbox.maps.extension.style.layers.properties.generated.LayerProperty
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "IconAnchor(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor$Companion;", "", "()V", "BOTTOM", "Lcom/mapbox/maps/extension/style/layers/properties/generated/IconAnchor;", "BOTTOM_LEFT", "BOTTOM_RIGHT", "CENTER", "LEFT", "RIGHT", "TOP", "TOP_LEFT", "TOP_RIGHT", CoreConstants.VALUE_OF, "value", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final IconAnchor valueOf(String value) {
            value.getClass();
            switch (value.hashCode()) {
                case -475662734:
                    if (value.equals("TOP_RIGHT")) {
                        return IconAnchor.TOP_RIGHT;
                    }
                    break;
                case -154073903:
                    if (value.equals("TOP_LEFT")) {
                        return IconAnchor.TOP_LEFT;
                    }
                    break;
                case 83253:
                    if (value.equals("TOP")) {
                        return IconAnchor.TOP;
                    }
                    break;
                case 2332679:
                    if (value.equals("LEFT")) {
                        return IconAnchor.LEFT;
                    }
                    break;
                case 77974012:
                    if (value.equals("RIGHT")) {
                        return IconAnchor.RIGHT;
                    }
                    break;
                case 1533816552:
                    if (value.equals("BOTTOM_RIGHT")) {
                        return IconAnchor.BOTTOM_RIGHT;
                    }
                    break;
                case 1573315995:
                    if (value.equals("BOTTOM_LEFT")) {
                        return IconAnchor.BOTTOM_LEFT;
                    }
                    break;
                case 1965067819:
                    if (value.equals("BOTTOM")) {
                        return IconAnchor.BOTTOM;
                    }
                    break;
                case 1984282709:
                    if (value.equals("CENTER")) {
                        return IconAnchor.CENTER;
                    }
                    break;
            }
            f.n(c.c(']', "IconAnchor.valueOf does not support [", value));
            return null;
        }

        private Companion() {
        }
    }
}
