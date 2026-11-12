package com.mapbox.maps.renderer.widget;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapboxExperimental;
import java.util.Objects;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q6.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\"#$B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B'\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0016R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006%"}, d2 = {"Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "", "horizontal", "Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;", "vertical", "Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;", "(Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;)V", "horizontalAlignment", "verticalAlignment", "offsetX", "", "offsetY", "(Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;FF)V", "getHorizontal$annotations", "()V", "getHorizontal", "()Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;", "getHorizontalAlignment", "getOffsetX", "()F", "getOffsetY", "getVertical$annotations", "getVertical", "()Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;", "getVerticalAlignment", "equals", "", "other", "hashCode", "", "toBuilder", "Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;", "toString", "", "Builder", "Horizontal", "Vertical", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class WidgetPosition {
    private final Horizontal horizontal;
    private final Horizontal horizontalAlignment;
    private final float offsetX;
    private final float offsetY;
    private final Vertical vertical;
    private final Vertical verticalAlignment;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;", "", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Horizontal {
        LEFT,
        CENTER,
        RIGHT
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;", "", "(Ljava/lang/String;I)V", "TOP", "CENTER", "BOTTOM", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Vertical {
        TOP,
        CENTER,
        BOTTOM
    }

    private WidgetPosition(Horizontal horizontal, Vertical vertical, float f14, float f15) {
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.offsetX = f14;
        this.offsetY = f15;
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @e
    public static /* synthetic */ void getHorizontal$annotations() {
    }

    @e
    public static /* synthetic */ void getVertical$annotations() {
    }

    public boolean equals(Object other) {
        if (!(other instanceof WidgetPosition)) {
            return false;
        }
        WidgetPosition widgetPosition = (WidgetPosition) other;
        return this.horizontalAlignment == widgetPosition.horizontalAlignment && this.verticalAlignment == widgetPosition.verticalAlignment && Float.compare(this.offsetX, widgetPosition.offsetX) == 0 && Float.compare(this.offsetY, widgetPosition.offsetY) == 0;
    }

    public final Horizontal getHorizontal() {
        return this.horizontal;
    }

    public final Horizontal getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final Vertical getVertical() {
        return this.vertical;
    }

    public final Vertical getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        return Objects.hash(this.horizontalAlignment, this.verticalAlignment, Float.valueOf(this.offsetX), Float.valueOf(this.offsetY));
    }

    public final Builder toBuilder() {
        return new Builder().setHorizontalAlignment(this.horizontalAlignment).setVerticalAlignment(this.verticalAlignment).setOffsetX(this.offsetX).setOffsetY(this.offsetY);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("WidgetPosition(horizontalAlignment=");
        sb3.append(this.horizontalAlignment);
        sb3.append(",verticalAlignment=");
        sb3.append(this.verticalAlignment);
        sb3.append(",offsetX=");
        sb3.append(this.offsetX);
        sb3.append(",offsetY=");
        return f.p(sb3, this.offsetY, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;", "", "()V", "<set-?>", "Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;", "horizontalAlignment", "getHorizontalAlignment", "()Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;", "setHorizontalAlignment", "(Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;)V", "", "offsetX", "getOffsetX", "()F", "setOffsetX", "(F)V", "offsetY", "getOffsetY", "setOffsetY", "Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;", "verticalAlignment", "getVerticalAlignment", "()Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;", "setVerticalAlignment", "(Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;)V", "build", "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private float offsetX;
        private float offsetY;
        private Horizontal horizontalAlignment = Horizontal.LEFT;
        private Vertical verticalAlignment = Vertical.TOP;

        public final WidgetPosition build() {
            return new WidgetPosition(this.horizontalAlignment, this.verticalAlignment, this.offsetX, this.offsetY, null);
        }

        public final Horizontal getHorizontalAlignment() {
            return this.horizontalAlignment;
        }

        public final float getOffsetX() {
            return this.offsetX;
        }

        public final float getOffsetY() {
            return this.offsetY;
        }

        public final Vertical getVerticalAlignment() {
            return this.verticalAlignment;
        }

        /* JADX INFO: renamed from: setHorizontalAlignment, reason: collision with other method in class */
        public final /* synthetic */ void m316setHorizontalAlignment(Horizontal horizontal) {
            horizontal.getClass();
            this.horizontalAlignment = horizontal;
        }

        /* JADX INFO: renamed from: setOffsetX, reason: collision with other method in class */
        public final /* synthetic */ void m317setOffsetX(float f14) {
            this.offsetX = f14;
        }

        /* JADX INFO: renamed from: setOffsetY, reason: collision with other method in class */
        public final /* synthetic */ void m318setOffsetY(float f14) {
            this.offsetY = f14;
        }

        /* JADX INFO: renamed from: setVerticalAlignment, reason: collision with other method in class */
        public final /* synthetic */ void m319setVerticalAlignment(Vertical vertical) {
            vertical.getClass();
            this.verticalAlignment = vertical;
        }

        public final Builder setOffsetX(float offsetX) {
            this.offsetX = offsetX;
            return this;
        }

        public final Builder setOffsetY(float offsetY) {
            this.offsetY = offsetY;
            return this;
        }

        public final Builder setHorizontalAlignment(Horizontal horizontalAlignment) {
            horizontalAlignment.getClass();
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        public final Builder setVerticalAlignment(Vertical verticalAlignment) {
            verticalAlignment.getClass();
            this.verticalAlignment = verticalAlignment;
            return this;
        }
    }

    public /* synthetic */ WidgetPosition(Horizontal horizontal, Vertical vertical, float f14, float f15, j jVar) {
        this(horizontal, vertical, f14, f15);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public WidgetPosition(Horizontal horizontal, Vertical vertical) {
        this(horizontal, vertical, 0.0f, 0.0f);
        horizontal.getClass();
        vertical.getClass();
    }
}
