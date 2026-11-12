package com.miui.tsmclient.net.doorcardv3.response;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.SectorKey;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PullSectorKeyResponse extends CommonResponseInfo {

    @SerializedName("data")
    private List<SectorKey> mSectorKeyList;

    public List<SectorKey> getSectorKeyList() {
        return this.mSectorKeyList;
    }
}
