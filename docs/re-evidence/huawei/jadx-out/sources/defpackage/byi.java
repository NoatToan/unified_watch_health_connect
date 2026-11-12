package defpackage;

import android.util.SparseArray;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.hwbasemgr.ResponseCallback;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class byi implements ResponseCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskDataListener f1316b;

    @Override // com.huawei.hwbasemgr.ResponseCallback
    public final void onResponse(int i, Object obj) {
        this.f1316b.onDataChange(i, (SparseArray) obj);
    }
}
