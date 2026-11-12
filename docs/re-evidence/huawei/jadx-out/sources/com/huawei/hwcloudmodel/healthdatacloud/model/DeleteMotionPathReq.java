package com.huawei.hwcloudmodel.healthdatacloud.model;

import com.huawei.hwcloudmodel.model.unite.DataDeleteCondition;
import com.huawei.networkclient.IRequest;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DeleteMotionPathReq implements IRequest {
    private List<DataDeleteCondition> conditions;

    public List<DataDeleteCondition> getDeleteMotionConditons() {
        return this.conditions;
    }

    public void setDeleteMotionConditons(List<DataDeleteCondition> list) {
        this.conditions = list;
    }

    public String toString() {
        return "DeleteMotionPathReq{DeleteConditons=" + this.conditions.toString() + "}";
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return Utils.b() + "/dataSync/path/deleteMotionPathData";
    }
}
