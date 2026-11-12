package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class SettingsJsonParser {
    private final CurrentTimeProvider a;

    public SettingsJsonParser(CurrentTimeProvider currentTimeProvider) {
        this.a = currentTimeProvider;
    }

    private static c a(int i) {
        return i != 3 ? new a() : new d();
    }

    public SettingsData parseSettingsJson(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt(b.d)).b(this.a, jSONObject);
    }
}
