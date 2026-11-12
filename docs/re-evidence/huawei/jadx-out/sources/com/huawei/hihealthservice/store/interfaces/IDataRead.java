package com.huawei.hihealthservice.store.interfaces;

import android.os.RemoteException;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.IDataReadResultListener;
import defpackage.kth;
import defpackage.kym;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IDataRead {
    List<HiHealthData> readAggregateData(kym kymVar, HiAggregateOption hiAggregateOption, kth kthVar);

    void readDataByAlignType(int i, kym kymVar, HiDataReadOption hiDataReadOption, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    void readDataByType(HiDataReadOption hiDataReadOption, kym kymVar, kth kthVar, IDataReadResultListener iDataReadResultListener) throws RemoteException;

    List<HiHealthData> readSportStatAggregateData(kym kymVar, HiSportStatDataAggregateOption hiSportStatDataAggregateOption);
}
