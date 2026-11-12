package com.huami.tools.analytics;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010#J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR*\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010\t\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00100\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\t\u001a\u0004\b.\u0010\u000b\"\u0004\b/\u0010\rR0\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0013\u0010:\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b9\u0010\u000b¨\u0006<"}, d2 = {"Lcom/huami/tools/analytics/Event;", "Lcom/huami/tools/analytics/HitEvent;", "", "other", "", "equals", "", "toString", "a", "Ljava/lang/String;", "getContextId", "()Ljava/lang/String;", "setContextId", "(Ljava/lang/String;)V", DbUtils.Const.Columns.Event.CONTEXT_ID, "b", "getEventId", "setEventId", DbUtils.Const.Columns.Event.EVENT_ID, "", "c", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "timestamp", GoogleApiAvailabilityLight.a, "getTimezone", "setTimezone", "timezone", "e", "getType", "setType", "getType$annotations", "()V", "type", "", "f", "Ljava/lang/Float;", "getNumberValue", "()Ljava/lang/Float;", "setNumberValue", "(Ljava/lang/Float;)V", DbUtils.Const.Columns.Event.NUMBER_VALUE, "g", "getStringValue", "setStringValue", DbUtils.Const.Columns.Event.STRING_VALUE, "", "h", "Ljava/util/Map;", "getMultipleValue", "()Ljava/util/Map;", "setMultipleValue", "(Ljava/util/Map;)V", DbUtils.Const.Columns.Event.MULTIPLE_VALUE, "getBasicInfo", "basicInfo", "<init>", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class Event extends HitEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private String contextId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String eventId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private Long timestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private String timezone;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private String type;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Float numberValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private String stringValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private Map<String, String> multipleValue;

    public static /* synthetic */ void getType$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Event)) {
            return false;
        }
        Event event = (Event) other;
        return Intrinsics.areEqual(this.eventId, event.eventId) && Intrinsics.areEqual(this.timestamp, event.timestamp);
    }

    @NotNull
    public final String getBasicInfo() {
        return "Event{eventId='" + ((Object) this.eventId) + "', timestamp=" + this.timestamp + ", timezone='" + ((Object) this.timezone) + "', type='" + ((Object) this.type) + "', contextId='" + ((Object) this.contextId) + "'}";
    }

    @Nullable
    public final String getContextId() {
        return this.contextId;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    public final Map<String, String> getMultipleValue() {
        return this.multipleValue;
    }

    @Nullable
    public final Float getNumberValue() {
        return this.numberValue;
    }

    @Nullable
    public final String getStringValue() {
        return this.stringValue;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTimezone() {
        return this.timezone;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setContextId(@Nullable String str) {
        this.contextId = str;
    }

    public final void setEventId(@Nullable String str) {
        this.eventId = str;
    }

    public final void setMultipleValue(@Nullable Map<String, String> map) {
        this.multipleValue = map;
    }

    public final void setNumberValue(@Nullable Float f) {
        this.numberValue = f;
    }

    public final void setStringValue(@Nullable String str) {
        this.stringValue = str;
    }

    public final void setTimestamp(@Nullable Long l) {
        this.timestamp = l;
    }

    public final void setTimezone(@Nullable String str) {
        this.timezone = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "Event{eventId='" + ((Object) this.eventId) + "', timestamp=" + this.timestamp + ", timezone='" + ((Object) this.timezone) + "', type='" + ((Object) this.type) + "', numberValue=" + this.numberValue + ", stringValue='" + ((Object) this.stringValue) + "', multipleValue=" + this.multipleValue + ", contextId='" + ((Object) this.contextId) + "'}";
    }
}
