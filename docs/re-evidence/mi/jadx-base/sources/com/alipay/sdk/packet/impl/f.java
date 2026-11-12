package com.alipay.sdk.packet.impl;

import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.alipay.sdk.packet.e {
    @Override // com.alipay.sdk.packet.e
    public JSONObject i() throws JSONException {
        return com.alipay.sdk.packet.e.j("cashier", FaceSchema.FACE_PAGE_MAIN);
    }
}
