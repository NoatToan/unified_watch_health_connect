package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.GraphRequest;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001/B\u0017\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b-\u0010.J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nJ&\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0014\u0010\u0016\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0013\u0010)\u001a\u00020\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0019\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/facebook/appevents/SessionEventsState;", "", "Lcom/facebook/GraphRequest;", "request", "Landroid/content/Context;", "applicationContext", "", "numSkipped", "Lorg/json/JSONArray;", "events", "", "limitEventUsage", "", "a", "Lcom/facebook/appevents/AppEvent;", "event", "addEvent", "moveToAccumulated", "clearInFlightAndStats", "includeImplicitEvents", "populateRequest", "", "accumulatePersistedEvents", "", "Ljava/util/List;", "accumulatedEvents", "b", "inFlightEvents", "c", LogUtil.I, "numSkippedEventsDueToFullBuffer", "Lcom/facebook/internal/AttributionIdentifiers;", GoogleApiAvailabilityLight.a, "Lcom/facebook/internal/AttributionIdentifiers;", "attributionIdentifiers", "", "e", "Ljava/lang/String;", "anonymousAppDeviceGUID", "getAccumulatedEventCount", "()I", "accumulatedEventCount", "getEventsToPersist", "()Ljava/util/List;", "eventsToPersist", "<init>", "(Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class SessionEventsState {
    private static final String f = SessionEventsState.class.getSimpleName();
    private static final int g = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List<AppEvent> accumulatedEvents = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<AppEvent> inFlightEvents = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int numSkippedEventsDueToFullBuffer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AttributionIdentifiers attributionIdentifiers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String anonymousAppDeviceGUID;

    public SessionEventsState(@NotNull AttributionIdentifiers attributionIdentifiers, @NotNull String str) {
        this.attributionIdentifiers = attributionIdentifiers;
        this.anonymousAppDeviceGUID = str;
    }

    private final void a(GraphRequest request, Context applicationContext, int numSkipped, JSONArray events, boolean limitEventUsage) {
        JSONObject jSONObject;
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                jSONObject = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.attributionIdentifiers, this.anonymousAppDeviceGUID, limitEventUsage, applicationContext);
                if (this.numSkippedEventsDueToFullBuffer > 0) {
                    jSONObject.put("num_skipped_events", numSkipped);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            request.setGraphObject(jSONObject);
            Bundle parameters = request.getParameters();
            String string = events.toString();
            parameters.putString("custom_events", string);
            request.setTag(string);
            request.setParameters(parameters);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final synchronized void accumulatePersistedEvents(@NotNull List<AppEvent> events) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.accumulatedEvents.addAll(events);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final synchronized void addEvent(@NotNull AppEvent event) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.accumulatedEvents.size() + this.inFlightEvents.size() >= g) {
                this.numSkippedEventsDueToFullBuffer++;
            } else {
                this.accumulatedEvents.add(event);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final synchronized void clearInFlightAndStats(boolean moveToAccumulated) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        if (moveToAccumulated) {
            try {
                this.accumulatedEvents.addAll(this.inFlightEvents);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return;
            }
        }
        this.inFlightEvents.clear();
        this.numSkippedEventsDueToFullBuffer = 0;
    }

    public final synchronized int getAccumulatedEventCount() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.accumulatedEvents.size();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    @NotNull
    public final synchronized List<AppEvent> getEventsToPersist() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            List<AppEvent> list = this.accumulatedEvents;
            this.accumulatedEvents = new ArrayList();
            return list;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final int populateRequest(@NotNull GraphRequest request, @NotNull Context applicationContext, boolean includeImplicitEvents, boolean limitEventUsage) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            synchronized (this) {
                int i = this.numSkippedEventsDueToFullBuffer;
                EventDeactivationManager.processEvents(this.accumulatedEvents);
                this.inFlightEvents.addAll(this.accumulatedEvents);
                this.accumulatedEvents.clear();
                JSONArray jSONArray = new JSONArray();
                for (AppEvent appEvent : this.inFlightEvents) {
                    if (!appEvent.isChecksumValid()) {
                        Utility.logd(f, "Event with invalid checksum: " + appEvent);
                    } else if (includeImplicitEvents || !appEvent.isImplicit()) {
                        jSONArray.put(appEvent.getJsonObject());
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                Unit unit = Unit.INSTANCE;
                a(request, applicationContext, i, jSONArray, limitEventUsage);
                return jSONArray.length();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }
}
