package com.xiaomi.mitv.airkan.sdk.impl;

import android.util.Pair;
import com.xiaomi.mitv.airkan.sdk.MiAirKan;
import com.xiaomi.mitv.airkan.sdk.util.JSONBuilder;
import com.xiaomi.mitv.airkan.sdk.util.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
final class d implements Runnable {
    private /* synthetic */ MiAirKan.Callback a;
    private /* synthetic */ c b;

    public d(c cVar, MiAirKan.Callback callback) {
        this.b = cVar;
        this.a = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Pair pair;
        Pair pair2;
        try {
            String strB = h.b(String.format("http://%s:6095/request?action=isAlive&t=%d", this.b.c, Long.valueOf(System.currentTimeMillis())));
            JSONObject jSONObject = new JSONBuilder(strB).toJSONObject();
            if (jSONObject.optInt("status") == 0 && "success".equals(jSONObject.optString("msg"))) {
                pair2 = new Pair(0, null);
            } else {
                Logger.i("isAlive failed : %s", strB);
                pair = new Pair(-1, strB);
                pair2 = pair;
            }
        } catch (g e) {
            e.printStackTrace();
            pair = new Pair(Integer.valueOf(e.a()), e.getMessage());
        }
        MiAirKan.Callback callback = this.a;
        if (callback != null) {
            callback.onResult(0, ((Integer) pair2.first).intValue(), (String) pair2.second);
        }
    }
}
