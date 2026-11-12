package com.mapbox.maps.extension.style.types;

import com.mapbox.bindgen.Value;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/extension/style/types/StyleTransition;", "", "builder", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "(Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;)V", "delay", "", "getDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "duration", "getDuration", "equals", "", "other", "hashCode", "", "toValue", "Lcom/mapbox/bindgen/Value;", "Builder", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StyleTransition {
    private final Long delay;
    private final Long duration;

    @LayersDsl
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004R$\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "()V", "<set-?>", "", "delay", "getDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "duration", "getDuration", "build", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private Long delay;
        private Long duration;

        public final StyleTransition build() {
            return new StyleTransition(this, null);
        }

        public final Builder delay(long delay) {
            this.delay = Long.valueOf(delay);
            return this;
        }

        public final Builder duration(long duration) {
            this.duration = Long.valueOf(duration);
            return this;
        }

        public final Long getDelay() {
            return this.delay;
        }

        public final Long getDuration() {
            return this.duration;
        }
    }

    private StyleTransition(Builder builder) {
        this.duration = builder.getDuration();
        this.delay = builder.getDelay();
    }

    public boolean equals(Object other) {
        if (!(other instanceof StyleTransition)) {
            return false;
        }
        StyleTransition styleTransition = (StyleTransition) other;
        return s.g(this.delay, styleTransition.delay) && s.g(this.duration, styleTransition.duration);
    }

    public final Long getDelay() {
        return this.delay;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public int hashCode() {
        Long l14 = this.duration;
        int iHashCode = (l14 != null ? l14.hashCode() : 0) * 31;
        Long l15 = this.delay;
        return iHashCode + (l15 != null ? l15.hashCode() : 0);
    }

    public final Value toValue() {
        HashMap map = new HashMap();
        map.put("delay", new Value(0L));
        map.put("duration", new Value(0L));
        Long l14 = this.delay;
        if (l14 != null) {
            map.put("delay", new Value(l14.longValue()));
        }
        Long l15 = this.duration;
        if (l15 != null) {
            map.put("duration", new Value(l15.longValue()));
        }
        return new Value((HashMap<String, Value>) map);
    }

    public /* synthetic */ StyleTransition(Builder builder, j jVar) {
        this(builder);
    }
}
