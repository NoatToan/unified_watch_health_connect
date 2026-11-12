package com.huawei.hms.support.api.entity.hwid;

import com.huawei.hms.core.aidl.IMessageEntity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class AccountPickerSignOutReq implements IMessageEntity {
    public String toJson() {
        return new JSONObject().toString();
    }
}
