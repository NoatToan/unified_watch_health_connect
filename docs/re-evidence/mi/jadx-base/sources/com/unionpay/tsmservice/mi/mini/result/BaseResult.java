package com.unionpay.tsmservice.mi.mini.result;

import android.os.Parcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
abstract class BaseResult implements Parcelable {
    public abstract void initWithJSONObject(JSONObject jSONObject);

    public abstract JSONObject toJSONObject();
}
