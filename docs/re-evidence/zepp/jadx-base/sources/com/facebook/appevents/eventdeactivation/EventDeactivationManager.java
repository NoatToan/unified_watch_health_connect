package com.facebook.appevents.eventdeactivation;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J&\u0010\r\u001a\u00020\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\nH\u0007R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager;", "", "", "enable", "a", "", "Lcom/facebook/appevents/AppEvent;", "events", "processEvents", "", "", "parameters", "eventName", "processDeprecatedParameters", "", "Z", Constants.ENABLED, "Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager$DeprecatedParamFilter;", "b", "Ljava/util/List;", "deprecatedParamFilters", "", "c", "Ljava/util/Set;", "deprecatedEvents", "<init>", "()V", "DeprecatedParamFilter", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class EventDeactivationManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean enabled;

    @NotNull
    public static final EventDeactivationManager INSTANCE = new EventDeactivationManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final List<DeprecatedParamFilter> deprecatedParamFilters = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final Set<String> deprecatedEvents = new HashSet();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager$DeprecatedParamFilter;", "", "", "a", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "eventName", "", "b", "Ljava/util/List;", "getDeprecateParams", "()Ljava/util/List;", "setDeprecateParams", "(Ljava/util/List;)V", "deprecateParams", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeprecatedParamFilter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private String eventName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private List<String> deprecateParams;

        public DeprecatedParamFilter(@NotNull String str, @NotNull List<String> list) {
            this.eventName = str;
            this.deprecateParams = list;
        }

        @NotNull
        public final List<String> getDeprecateParams() {
            return this.deprecateParams;
        }

        @NotNull
        public final String getEventName() {
            return this.eventName;
        }

        public final void setDeprecateParams(@NotNull List<String> list) {
            this.deprecateParams = list;
        }

        public final void setEventName(@NotNull String str) {
            this.eventName = str;
        }
    }

    private EventDeactivationManager() {
    }

    private final synchronized void a() {
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                FetchedAppSettings fetchedAppSettingsQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
                if (fetchedAppSettingsQueryAppSettings == null) {
                    return;
                }
                String restrictiveDataSetting = fetchedAppSettingsQueryAppSettings.getRestrictiveDataSetting();
                if (restrictiveDataSetting != null) {
                    if (restrictiveDataSetting.length() > 0) {
                        JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
                        deprecatedParamFilters.clear();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                if (jSONObject2.optBoolean("is_deprecated_event")) {
                                    deprecatedEvents.add(next);
                                } else {
                                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                    DeprecatedParamFilter deprecatedParamFilter = new DeprecatedParamFilter(next, new ArrayList());
                                    if (jSONArrayOptJSONArray != null) {
                                        deprecatedParamFilter.setDeprecateParams(Utility.convertJSONArrayToList(jSONArrayOptJSONArray));
                                    }
                                    deprecatedParamFilters.add(deprecatedParamFilter);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @JvmStatic
    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.a();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }

    @JvmStatic
    public static final void processDeprecatedParameters(@NotNull Map<String, String> parameters, @NotNull String eventName) {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            if (enabled) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (DeprecatedParamFilter deprecatedParamFilter : new ArrayList(deprecatedParamFilters)) {
                    if (!(!Intrinsics.areEqual(deprecatedParamFilter.getEventName(), eventName))) {
                        for (String str : arrayList) {
                            if (deprecatedParamFilter.getDeprecateParams().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }

    @JvmStatic
    public static final void processEvents(@NotNull List<AppEvent> events) {
        if (CrashShieldHandler.isObjectCrashing(EventDeactivationManager.class)) {
            return;
        }
        try {
            if (enabled) {
                Iterator<AppEvent> it2 = events.iterator();
                while (it2.hasNext()) {
                    if (deprecatedEvents.contains(it2.next().getName())) {
                        it2.remove();
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, EventDeactivationManager.class);
        }
    }
}
