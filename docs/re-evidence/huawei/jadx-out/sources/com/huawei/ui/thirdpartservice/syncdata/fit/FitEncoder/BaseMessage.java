package com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseMessage extends BaseData {
    public static final int DEFINITION_MESSAGE = 1;
    public static final int RECORD_DATA_MESSAGE = 0;
    protected FitDesign.e mHead = new FitDesign.e();
    public List<FitDesign.d> mFieldDefinitions = new ArrayList();

    @Override // com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData
    public int getSize() {
        return 0;
    }

    public void setFieldDefinitions(List<FitDesign.d> list) {
        this.mFieldDefinitions.addAll(list);
    }
}
