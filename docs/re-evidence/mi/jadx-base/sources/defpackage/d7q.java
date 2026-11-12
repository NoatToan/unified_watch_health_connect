package defpackage;

import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class d7q extends q6q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15199b;
    public int c;

    public d7q() {
        super(2);
    }

    public static q6q b(JSONObject jSONObject) {
        int i;
        int i2;
        int i3 = 0;
        if (jSONObject.has(BroadcastsKt.SILENT_PUSHING_PROGRESS)) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(BroadcastsKt.SILENT_PUSHING_PROGRESS);
                i = jSONObject2.has(BroadcastsKt.SILENT_PUSHING_PROGRESS) ? jSONObject2.getInt(BroadcastsKt.SILENT_PUSHING_PROGRESS) : 0;
                try {
                    if (jSONObject2.has(SportDataTypeKt.DIMEN_TOTAL)) {
                        i3 = jSONObject2.getInt(SportDataTypeKt.DIMEN_TOTAL);
                    }
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (JSONException e2) {
                e = e2;
                i = 0;
            }
            i2 = i3;
            i3 = i;
        } else {
            i2 = 0;
        }
        return new d7q(i3, i2);
    }

    @Override // defpackage.q6q
    public JSONObject a() {
        JSONObject jSONObjectA = super.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BroadcastsKt.SILENT_PUSHING_PROGRESS, this.f15199b);
            jSONObject.put(SportDataTypeKt.DIMEN_TOTAL, this.c);
            jSONObjectA.put(BroadcastsKt.SILENT_PUSHING_PROGRESS, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObjectA;
    }

    public d7q(int i, int i2) {
        this();
        this.f15199b = i;
        this.c = i2;
    }
}
