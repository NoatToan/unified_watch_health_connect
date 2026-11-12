package com.huawei.agconnect.apms;

import com.google.gson.JsonArray;
import com.huawei.agconnect.apms.collect.type.CollectableArray;

/* JADX INFO: loaded from: classes22.dex */
public final class yxw extends CollectableArray {
    public long abc;
    public long bcd;
    public long cde;

    public yxw(long j, long j2, long j3) {
        this.abc = j;
        this.bcd = j2;
        this.cde = j3;
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
    public final JsonArray asJsonArray() {
        JsonArray jsonArray = new JsonArray();
        mno.abc(this.abc, jsonArray);
        mno.abc(this.bcd, jsonArray);
        mno.abc(this.cde, jsonArray);
        return jsonArray;
    }
}
