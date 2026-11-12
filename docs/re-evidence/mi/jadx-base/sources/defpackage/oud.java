package defpackage;

import com.xiaomi.smarthome.core.server.internal.util.JsonUtils;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class oud implements JsonUtils.CallbackJSONArray {
    @Override // com.xiaomi.smarthome.core.server.internal.util.JsonUtils.CallbackJSONArray
    public final Object addItem(JSONArray jSONArray, int i) {
        return jSONArray.optString(i);
    }
}
