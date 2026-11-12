package com.huami.nfc.car;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "", "asExtraInfo", "nfc-car_release"}, k = 2, mv = {1, 5, 1})
public final class CarAppletApiImplKt {
    @NotNull
    public static final String asExtraInfo(@NotNull Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject.toString();
    }
}
