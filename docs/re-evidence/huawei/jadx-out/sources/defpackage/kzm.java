package defpackage;

import android.os.RemoteException;
import com.huawei.hihealth.IRealTimeDataCallback;
import com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class kzm implements HiHealthKitExtendBinder.Action {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IRealTimeDataCallback f39665b;

    @Override // com.huawei.hihealthservice.hihealthkit.HiHealthKitExtendBinder.Action
    public final void operate(int i) throws RemoteException {
        this.f39665b.onResult(i);
    }
}
