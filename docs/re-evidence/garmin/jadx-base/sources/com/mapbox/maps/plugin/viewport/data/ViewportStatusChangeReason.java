package com.mapbox.maps.plugin.viewport.data;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/data/ViewportStatusChangeReason;", "", "reason", "", "(Ljava/lang/String;)V", "equals", "", "other", "hashCode", "", "toString", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ViewportStatusChangeReason {
    private final String reason;
    public static final ViewportStatusChangeReason IDLE_REQUESTED = new ViewportStatusChangeReason("IDLE_REQUESTED");
    public static final ViewportStatusChangeReason TRANSITION_STARTED = new ViewportStatusChangeReason("TRANSITION_STARTED");
    public static final ViewportStatusChangeReason TRANSITION_SUCCEEDED = new ViewportStatusChangeReason("TRANSITION_SUCCEEDED");
    public static final ViewportStatusChangeReason TRANSITION_FAILED = new ViewportStatusChangeReason("TRANSITION_FAILED");
    public static final ViewportStatusChangeReason USER_INTERACTION = new ViewportStatusChangeReason("USER_INTERACTION");

    private ViewportStatusChangeReason(String str) {
        this.reason = str;
    }

    public boolean equals(Object other) {
        return (other instanceof ViewportStatusChangeReason) && s.g(this.reason, ((ViewportStatusChangeReason) other).reason);
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public String toString() {
        return a0.m(new StringBuilder("ViewportStatusChangeReason(reason="), this.reason, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
