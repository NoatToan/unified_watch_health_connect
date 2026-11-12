package com.facebook.appevents.codeless.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 /2\u00020\u0001:\u00030/1B[\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0019\u0010!\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0019\u0010$\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006R\u0019\u0010'\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u0019\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178F@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0019\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00178F@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010)¨\u00062"}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding;", "", "", "a", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "eventName", "Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "b", "Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "getMethod", "()Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "method", "Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "c", "Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "getType", "()Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "type", GoogleApiAvailabilityLight.a, "getAppVersion", "appVersion", "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "e", "Ljava/util/List;", "path", "Lcom/facebook/appevents/codeless/internal/ParameterComponent;", "f", "parameters", "g", "getComponentId", "componentId", "h", "getPathType", "pathType", "i", "getActivityName", "activityName", "getViewPath", "()Ljava/util/List;", "viewPath", "getViewParameters", "viewParameters", "<init>", "(Ljava/lang/String;Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "ActionType", "MappingMethod", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class EventBinding {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String eventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MappingMethod method;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ActionType type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String appVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<PathComponent> path;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<ParameterComponent> parameters;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String componentId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String pathType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final String activityName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "CLICK", "SELECTED", "TEXT_CHANGED", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$Companion;", "", "Lorg/json/JSONArray;", "array", "", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "parseArray", "Lorg/json/JSONObject;", "mapping", "getInstanceFromJson", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final EventBinding getInstanceFromJson(@NotNull JSONObject mapping) throws JSONException, IllegalArgumentException {
            String string = mapping.getString("event_name");
            String string2 = mapping.getString("method");
            Locale locale = Locale.ENGLISH;
            Objects.requireNonNull(string2, "null cannot be cast to non-null type java.lang.String");
            MappingMethod mappingMethodValueOf = MappingMethod.valueOf(string2.toUpperCase(locale));
            String string3 = mapping.getString("event_type");
            Objects.requireNonNull(string3, "null cannot be cast to non-null type java.lang.String");
            ActionType actionTypeValueOf = ActionType.valueOf(string3.toUpperCase(locale));
            String string4 = mapping.getString("app_version");
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new PathComponent(jSONArray.getJSONObject(i)));
            }
            String strOptString = mapping.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE);
            JSONArray jSONArrayOptJSONArray = mapping.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    arrayList2.add(new ParameterComponent(jSONArrayOptJSONArray.getJSONObject(i2)));
                }
            }
            return new EventBinding(string, mappingMethodValueOf, actionTypeValueOf, string4, arrayList, arrayList2, mapping.optString("component_id"), strOptString, mapping.optString("activity_name"));
        }

        @JvmStatic
        @NotNull
        public final List<EventBinding> parseArray(@Nullable JSONArray array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                try {
                    int length = array.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(getInstanceFromJson(array.getJSONObject(i)));
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL", "INFERENCE", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    public EventBinding(@NotNull String str, @NotNull MappingMethod mappingMethod, @NotNull ActionType actionType, @NotNull String str2, @NotNull List<PathComponent> list, @NotNull List<ParameterComponent> list2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this.eventName = str;
        this.method = mappingMethod;
        this.type = actionType;
        this.appVersion = str2;
        this.path = list;
        this.parameters = list2;
        this.componentId = str3;
        this.pathType = str4;
        this.activityName = str5;
    }

    @JvmStatic
    @NotNull
    public static final EventBinding getInstanceFromJson(@NotNull JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        return INSTANCE.getInstanceFromJson(jSONObject);
    }

    @JvmStatic
    @NotNull
    public static final List<EventBinding> parseArray(@Nullable JSONArray jSONArray) {
        return INSTANCE.parseArray(jSONArray);
    }

    @NotNull
    public final String getActivityName() {
        return this.activityName;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getComponentId() {
        return this.componentId;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final MappingMethod getMethod() {
        return this.method;
    }

    @NotNull
    public final String getPathType() {
        return this.pathType;
    }

    @NotNull
    public final ActionType getType() {
        return this.type;
    }

    @NotNull
    public final List<ParameterComponent> getViewParameters() {
        return Collections.unmodifiableList(this.parameters);
    }

    @NotNull
    public final List<PathComponent> getViewPath() {
        return Collections.unmodifiableList(this.path);
    }
}
