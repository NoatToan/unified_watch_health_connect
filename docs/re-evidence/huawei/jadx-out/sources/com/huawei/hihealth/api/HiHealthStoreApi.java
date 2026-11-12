package com.huawei.hihealth.api;

import android.content.Context;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthStoreApi implements IStoreApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f12246a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiHealthNativeApi f12247c;

    private HiHealthStoreApi() {
        this.f12247c = HiHealthNativeApi.a(f12246a);
    }

    @Override // com.huawei.hihealth.api.IStoreApi
    public void aggregateHiHealthData(HiAggregateOption hiAggregateOption, HiAggregateListener hiAggregateListener) {
        this.f12247c.aggregateHiHealthData(hiAggregateOption, hiAggregateListener);
    }

    @Override // com.huawei.hihealth.api.IStoreApi
    public void insertHiHealthData(HiDataInsertOption hiDataInsertOption, HiDataOperateListener hiDataOperateListener) {
        this.f12247c.insertHiHealthData(hiDataInsertOption, hiDataOperateListener);
    }

    @Override // com.huawei.hihealth.api.IStoreApi
    public void readHiHealthData(HiDataReadOption hiDataReadOption, HiDataReadResultListener hiDataReadResultListener) {
        this.f12247c.readHiHealthData(hiDataReadOption, hiDataReadResultListener);
    }

    static class Instance {
        public static final HiHealthStoreApi e = new HiHealthStoreApi();

        private Instance() {
        }
    }
}
