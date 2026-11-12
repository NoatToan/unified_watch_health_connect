package com.ximalaya.ting.android.opensdk.model.metadata;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class MetaDataList extends XimalayaResponse {
    private List<MetaData> metaDatas;

    public List<MetaData> getMetaDatas() {
        return this.metaDatas;
    }

    public void setMetaDatas(List<MetaData> list) {
        this.metaDatas = list;
    }
}
