package defpackage;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.huawei.hihealth.ISubScribeCallback;
import com.huawei.hihealth.model.Notification;
import com.huawei.hihealthservice.hihealthkit.model.DataObservable;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class lef extends DataObservable<ISubScribeCallback> {
    private void reportData(Notification notification, RemoteCallbackList<ISubScribeCallback> remoteCallbackList) {
        synchronized (remoteCallbackList) {
            try {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                LogUtil.a("SubscribeDataObservable", "calling remote callback, the length is ", Integer.valueOf(iBeginBroadcast));
                for (int i = 0; i < iBeginBroadcast; i++) {
                    try {
                        ((ISubScribeCallback) remoteCallbackList.getBroadcastItem(i)).onDataChanged(notification);
                    } catch (RemoteException e) {
                        ReleaseLogUtil.a("HiH_SubscribeDataObservable", "report RemoteException", LogAnonymous.b(e));
                    }
                }
                remoteCallbackList.finishBroadcast();
            } catch (IllegalStateException e2) {
                ReleaseLogUtil.a("HiH_SubscribeDataObservable", "report IllegalStateException", LogAnonymous.b(e2));
            }
        }
    }

    @Override // com.huawei.hihealthservice.hihealthkit.model.DataObservable
    public void notifyDataChanged(Object obj) {
        if (!(obj instanceof Notification)) {
            ReleaseLogUtil.e("HiH_SubscribeDataObservable", "wrong data type");
            return;
        }
        Notification notification = (Notification) obj;
        for (String str : this.mObservers.keySet()) {
            if (Arrays.asList(str.split("#")).contains(String.valueOf(notification.getDataType()))) {
                reportData(notification, (RemoteCallbackList) this.mObservers.get(str));
            }
        }
    }

    public boolean isTypeSubscribed(int i) {
        Iterator<String> it = this.mObservers.keySet().iterator();
        while (it.hasNext()) {
            if (Arrays.asList(it.next().split("#")).contains(String.valueOf(i))) {
                return true;
            }
        }
        return false;
    }
}
