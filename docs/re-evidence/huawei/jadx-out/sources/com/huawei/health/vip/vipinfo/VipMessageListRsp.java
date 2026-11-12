package com.huawei.health.vip.vipinfo;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.vip.datatypes.MemberMessage;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class VipMessageListRsp extends CloudCommonReponse {

    @SerializedName("messages")
    private List<MemberMessage> messages;

    public List<MemberMessage> getMessages() {
        return this.messages;
    }
}
