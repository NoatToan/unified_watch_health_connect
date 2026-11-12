package com.huawei.hihealthservice.store.interfaces;

import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hwcloudmodel.model.unite.DataTimeDelCondition;
import defpackage.kym;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IDataDelete {
    List<DataTimeDelCondition> deleteHealthData(HiDataDeleteOption hiDataDeleteOption, kym kymVar, int i);
}
