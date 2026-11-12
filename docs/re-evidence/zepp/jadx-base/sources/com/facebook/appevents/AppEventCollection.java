package com.facebook.appevents;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.internal.AttributionIdentifiers;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eJ\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002R\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0013\u0010\u0017\u001a\u00020\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/AppEventCollection;", "", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "Lcom/facebook/appevents/SessionEventsState;", "a", "Lcom/facebook/appevents/PersistedEvents;", "persistedEvents", "", "addPersistedEvents", "accessTokenAppIdPair", "Lcom/facebook/appevents/AppEvent;", "appEvent", "addEvent", "", "keySet", "get", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "stateMap", "", "getEventCount", "()I", "eventCount", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppEventCollection {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HashMap<AccessTokenAppIdPair, SessionEventsState> stateMap = new HashMap<>();

    private final synchronized SessionEventsState a(AccessTokenAppIdPair accessTokenAppId) {
        SessionEventsState sessionEventsState = this.stateMap.get(accessTokenAppId);
        if (sessionEventsState == null) {
            Context applicationContext = FacebookSdk.getApplicationContext();
            AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(applicationContext);
            sessionEventsState = attributionIdentifiers != null ? new SessionEventsState(attributionIdentifiers, AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(applicationContext)) : null;
        }
        if (sessionEventsState == null) {
            return null;
        }
        this.stateMap.put(accessTokenAppId, sessionEventsState);
        return sessionEventsState;
    }

    public final synchronized void addEvent(@NotNull AccessTokenAppIdPair accessTokenAppIdPair, @NotNull AppEvent appEvent) {
        SessionEventsState sessionEventsStateA = a(accessTokenAppIdPair);
        if (sessionEventsStateA != null) {
            sessionEventsStateA.addEvent(appEvent);
        }
    }

    public final synchronized void addPersistedEvents(@Nullable PersistedEvents persistedEvents) {
        if (persistedEvents == null) {
            return;
        }
        for (AccessTokenAppIdPair accessTokenAppIdPair : persistedEvents.keySet()) {
            SessionEventsState sessionEventsStateA = a(accessTokenAppIdPair);
            if (sessionEventsStateA != null) {
                List<AppEvent> list = persistedEvents.get(accessTokenAppIdPair);
                if (list == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Iterator<AppEvent> it2 = list.iterator();
                while (it2.hasNext()) {
                    sessionEventsStateA.addEvent(it2.next());
                }
            }
        }
    }

    @Nullable
    public final synchronized SessionEventsState get(@NotNull AccessTokenAppIdPair accessTokenAppIdPair) {
        return this.stateMap.get(accessTokenAppIdPair);
    }

    public final synchronized int getEventCount() {
        int accumulatedEventCount;
        accumulatedEventCount = 0;
        Iterator<SessionEventsState> it2 = this.stateMap.values().iterator();
        while (it2.hasNext()) {
            accumulatedEventCount += it2.next().getAccumulatedEventCount();
        }
        return accumulatedEventCount;
    }

    @NotNull
    public final synchronized Set<AccessTokenAppIdPair> keySet() {
        return this.stateMap.keySet();
    }
}
