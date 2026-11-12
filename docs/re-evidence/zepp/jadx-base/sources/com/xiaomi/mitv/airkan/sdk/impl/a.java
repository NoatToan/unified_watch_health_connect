package com.xiaomi.mitv.airkan.sdk.impl;

import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.mitv.airkan.sdk.MiAirKan;
import com.xiaomi.mitv.airkan.sdk.util.JSONBuilder;
import com.xiaomi.mitv.airkan.sdk.util.Logger;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
final class a implements MiAirKan.Key {
    private static final SparseArray d;
    private static final String e = "http://%s:6095/controller?action=keyevent&keycode=%s&t=%d";
    private String a;
    private Executor b;
    private MiAirKan.Callback c;

    static {
        SparseArray sparseArray = new SparseArray();
        d = sparseArray;
        sparseArray.append(21, "left");
        sparseArray.append(22, "right");
        sparseArray.append(19, "up");
        sparseArray.append(20, "down");
        sparseArray.append(66, "enter");
        sparseArray.append(82, "menu");
        sparseArray.append(4, "back");
        sparseArray.append(26, "power");
        sparseArray.append(25, "volumedown");
        sparseArray.append(24, "volumeup");
    }

    public a(Executor executor, MiAirKan.Callback callback) {
        this.b = executor;
        this.c = callback;
    }

    private void a(int i) {
        this.b.execute(new b(this, i));
    }

    public static /* synthetic */ void b(a aVar, int i) {
        if (TextUtils.isEmpty(aVar.a)) {
            Logger.i("no address", new Object[0]);
            return;
        }
        String str = (String) d.get(i);
        try {
            String strB = h.b(String.format(e, aVar.a, str, Long.valueOf(System.currentTimeMillis())));
            JSONObject jSONObject = new JSONBuilder(strB).toJSONObject();
            if (jSONObject.optInt("status") == 0 && "success".equals(jSONObject.optString("msg"))) {
                return;
            }
            Logger.i("send key %s failed with result :%s", str, strB);
            MiAirKan.Callback callback = aVar.c;
            if (callback != null) {
                callback.onResult(0, 0, strB);
            }
        } catch (g e2) {
            e2.printStackTrace();
            MiAirKan.Callback callback2 = aVar.c;
            if (callback2 != null) {
                callback2.onResult(0, e2.a(), e2.getMessage());
            }
        }
    }

    private void d(int i) {
        if (TextUtils.isEmpty(this.a)) {
            Logger.i("no address", new Object[0]);
            return;
        }
        String str = (String) d.get(i);
        try {
            String strB = h.b(String.format(e, this.a, str, Long.valueOf(System.currentTimeMillis())));
            JSONObject jSONObject = new JSONBuilder(strB).toJSONObject();
            if (jSONObject.optInt("status") == 0 && "success".equals(jSONObject.optString("msg"))) {
                return;
            }
            Logger.i("send key %s failed with result :%s", str, strB);
            MiAirKan.Callback callback = this.c;
            if (callback != null) {
                callback.onResult(0, 0, strB);
            }
        } catch (g e2) {
            e2.printStackTrace();
            MiAirKan.Callback callback2 = this.c;
            if (callback2 != null) {
                callback2.onResult(0, e2.a(), e2.getMessage());
            }
        }
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Key
    public final void back() {
        a(4);
    }

    public final void c(String str) {
        this.a = str;
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Key
    public final void down() {
        a(20);
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Key
    public final void left() {
        a(21);
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Key
    public final void menu() {
        a(82);
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Key
    public final void ok() {
        a(66);
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Key
    public final void power() {
        a(26);
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Key
    public final void right() {
        a(22);
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Key
    public final void up() {
        a(19);
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Key
    public final void volumeDown() {
        a(25);
    }

    @Override // com.xiaomi.mitv.airkan.sdk.MiAirKan.Key
    public final void volumeUp() {
        a(24);
    }
}
