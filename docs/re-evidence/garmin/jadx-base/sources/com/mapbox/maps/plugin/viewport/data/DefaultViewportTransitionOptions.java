package com.mapbox.maps.plugin.viewport.data;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.viewport.ViewportConstantsKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;", "", "maxDurationMs", "", "(J)V", "getMaxDurationMs", "()J", "equals", "", "other", "hashCode", "", "toBuilder", "Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions$Builder;", "toString", "", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DefaultViewportTransitionOptions {
    private final long maxDurationMs;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions$Builder;", "", "()V", "maxDurationMs", "", "build", "Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
        private long maxDurationMs = ViewportConstantsKt.DEFAULT_TRANSITION_MAX_DURATION_MS;

        public final DefaultViewportTransitionOptions build() {
            return new DefaultViewportTransitionOptions(this.maxDurationMs, null);
        }

        public final Builder maxDurationMs(long maxDurationMs) {
            this.maxDurationMs = maxDurationMs;
            return this;
        }
    }

    private DefaultViewportTransitionOptions(long j8) {
        this.maxDurationMs = j8;
    }

    public boolean equals(Object other) {
        return (other instanceof DefaultViewportTransitionOptions) && this.maxDurationMs == ((DefaultViewportTransitionOptions) other).maxDurationMs;
    }

    public final long getMaxDurationMs() {
        return this.maxDurationMs;
    }

    public int hashCode() {
        return Long.hashCode(this.maxDurationMs);
    }

    public final Builder toBuilder() {
        return new Builder().maxDurationMs(this.maxDurationMs);
    }

    public String toString() {
        return a0.l(new StringBuilder("DefaultViewportTransitionOptions(maxDurationMs="), this.maxDurationMs, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ DefaultViewportTransitionOptions(long j8, j jVar) {
        this(j8);
    }
}
