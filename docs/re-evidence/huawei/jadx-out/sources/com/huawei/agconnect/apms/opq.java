package com.huawei.agconnect.apms;

import com.google.gson.JsonArray;
import com.huawei.agconnect.apms.collect.type.CollectableArray;

/* JADX INFO: loaded from: classes22.dex */
public final class opq extends CollectableArray {
    public long abc;
    public long bcd;
    public long cde;
    public long def;

    public opq(long j, long j2, long j3, long j4) {
        this.abc = j;
        this.bcd = j2;
        this.cde = j3;
        this.def = j4;
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
    public final JsonArray asJsonArray() {
        JsonArray jsonArray = new JsonArray();
        mno.abc(this.abc, jsonArray);
        mno.abc(this.bcd, jsonArray);
        mno.abc(this.cde, jsonArray);
        mno.abc(this.def, jsonArray);
        return jsonArray;
    }
}
