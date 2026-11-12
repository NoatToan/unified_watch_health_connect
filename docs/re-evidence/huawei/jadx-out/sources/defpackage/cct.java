package defpackage;

import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwbasemgr.ResponseCallback;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cct implements HiDataOperateListener {
    public final /* synthetic */ ResponseCallback e;

    @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
    public final void onResult(int i, Object obj) {
        this.e.onResponse(i, obj);
    }
}
