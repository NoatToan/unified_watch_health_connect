package com.facebook.gamingservices.model;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0017\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R'\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/facebook/gamingservices/model/CustomUpdateLocalizedText;", "", "Lorg/json/JSONObject;", "toJSONObject", "", "component1", "Ljava/util/HashMap;", "component2", "default", "localizations", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getDefault", "()Ljava/lang/String;", "b", "Ljava/util/HashMap;", "getLocalizations", "()Ljava/util/HashMap;", "<init>", "(Ljava/lang/String;Ljava/util/HashMap;)V", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CustomUpdateLocalizedText {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String default;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final HashMap<String, String> localizations;

    public CustomUpdateLocalizedText(@NotNull String str, @Nullable HashMap<String, String> map) {
        this.default = str;
        this.localizations = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomUpdateLocalizedText copy$default(CustomUpdateLocalizedText customUpdateLocalizedText, String str, HashMap map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customUpdateLocalizedText.default;
        }
        if ((i & 2) != 0) {
            map = customUpdateLocalizedText.localizations;
        }
        return customUpdateLocalizedText.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDefault() {
        return this.default;
    }

    @Nullable
    public final HashMap<String, String> component2() {
        return this.localizations;
    }

    @NotNull
    public final CustomUpdateLocalizedText copy(@NotNull String str, @Nullable HashMap<String, String> localizations) {
        return new CustomUpdateLocalizedText(str, localizations);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomUpdateLocalizedText)) {
            return false;
        }
        CustomUpdateLocalizedText customUpdateLocalizedText = (CustomUpdateLocalizedText) other;
        return Intrinsics.areEqual(this.default, customUpdateLocalizedText.default) && Intrinsics.areEqual(this.localizations, customUpdateLocalizedText.localizations);
    }

    @NotNull
    public final String getDefault() {
        return this.default;
    }

    @Nullable
    public final HashMap<String, String> getLocalizations() {
        return this.localizations;
    }

    public int hashCode() {
        String str = this.default;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        HashMap<String, String> map = this.localizations;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("default", this.default);
        HashMap<String, String> map = this.localizations;
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("localizations", jSONObject2);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "CustomUpdateLocalizedText(default=" + this.default + ", localizations=" + this.localizations + ")";
    }

    public /* synthetic */ CustomUpdateLocalizedText(String str, HashMap map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map);
    }
}
