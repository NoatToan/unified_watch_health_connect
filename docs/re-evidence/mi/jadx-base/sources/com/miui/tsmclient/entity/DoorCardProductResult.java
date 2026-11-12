package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DoorCardProductResult extends CommonResponseInfo {

    @SerializedName("groupInfo")
    private List<DoorCardGroupInfo> mDoorCardGroupInfoList;

    public List<DoorCardGroupInfo> getDoorCardGroupInfoList() {
        return this.mDoorCardGroupInfoList;
    }
}
