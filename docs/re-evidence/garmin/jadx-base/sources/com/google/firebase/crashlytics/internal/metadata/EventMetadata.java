package com.google.firebase.crashlytics.internal.metadata;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.k0;
import q6.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/crashlytics/internal/metadata/EventMetadata;", "", "sessionId", "", "timestamp", "", "additionalCustomKeys", "", "<init>", "(Ljava/lang/String;JLjava/util/Map;)V", "getSessionId", "()Ljava/lang/String;", "getTimestamp", "()J", "getAdditionalCustomKeys", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EventMetadata {
    private final Map<String, String> additionalCustomKeys;
    private final String sessionId;
    private final long timestamp;

    public EventMetadata(String str, long j8, Map<String, String> map) {
        str.getClass();
        map.getClass();
        this.sessionId = str;
        this.timestamp = j8;
        this.additionalCustomKeys = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventMetadata copy$default(EventMetadata eventMetadata, String str, long j8, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = eventMetadata.sessionId;
        }
        if ((i14 & 2) != 0) {
            j8 = eventMetadata.timestamp;
        }
        if ((i14 & 4) != 0) {
            map = eventMetadata.additionalCustomKeys;
        }
        return eventMetadata.copy(str, j8, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final Map<String, String> component3() {
        return this.additionalCustomKeys;
    }

    public final EventMetadata copy(String sessionId, long timestamp, Map<String, String> additionalCustomKeys) {
        sessionId.getClass();
        additionalCustomKeys.getClass();
        return new EventMetadata(sessionId, timestamp, additionalCustomKeys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) other;
        return s.g(this.sessionId, eventMetadata.sessionId) && this.timestamp == eventMetadata.timestamp && s.g(this.additionalCustomKeys, eventMetadata.additionalCustomKeys);
    }

    public final Map<String, String> getAdditionalCustomKeys() {
        return this.additionalCustomKeys;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.additionalCustomKeys.hashCode() + f.e(this.sessionId.hashCode() * 31, 31, this.timestamp);
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.sessionId + ", timestamp=" + this.timestamp + ", additionalCustomKeys=" + this.additionalCustomKeys + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventMetadata(String str, long j8) {
        this(str, j8, null, 4, null);
        str.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EventMetadata(String str, long j8, Map map, int i14, j jVar) {
        if ((i14 & 4) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(str, j8, map);
    }
}
