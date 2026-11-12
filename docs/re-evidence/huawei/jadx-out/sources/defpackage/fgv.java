package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorData;
import com.huawei.wearengine.monitor.MonitorItem;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class fgv {
    public static void a(final ResponseCallback<Boolean> responseCallback) {
        if (responseCallback == null) {
            return;
        }
        final yje yjeVarC = yhw.c(BaseApplication.b());
        yjeVarC.e().addOnSuccessListener(new OnSuccessListener() { // from class: fgw
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                fgv.d(responseCallback, yjeVarC, (Boolean) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: fgy
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                fgv.e(responseCallback, exc);
            }
        });
    }

    static /* synthetic */ void d(final ResponseCallback responseCallback, yje yjeVar, Boolean bool) {
        if (!bool.booleanValue()) {
            responseCallback.onResponse(-2, false);
        } else {
            yjeVar.c().addOnSuccessListener(new OnSuccessListener() { // from class: fgx
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    fgv.d((List) obj, responseCallback);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: fha
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    fgv.a(responseCallback, exc);
                }
            });
        }
    }

    static /* synthetic */ void a(ResponseCallback responseCallback, Exception exc) {
        LogUtil.e("WearCheckUtil", "checkWearStatus: call getBondedDevices exception: ", exc);
        responseCallback.onResponse(-1, false);
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, Exception exc) {
        LogUtil.e("WearCheckUtil", "checkWearStatus: call hasAvailableDevices exception: ", exc);
        responseCallback.onResponse(-1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(List<Device> list, final ResponseCallback<Boolean> responseCallback) {
        Device next;
        if (list == null || list.isEmpty()) {
            responseCallback.onResponse(-2, false);
            return;
        }
        Iterator<Device> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && next.isConnected()) {
                break;
            }
        }
        if (next == null) {
            responseCallback.onResponse(-2, false);
        } else {
            yhw.e(BaseApplication.b()).d(next, MonitorItem.MONITOR_ITEM_WEAR).addOnSuccessListener(new OnSuccessListener() { // from class: fhc
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    fgv.b(responseCallback, (MonitorData) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: fhb
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    fgv.c(responseCallback, exc);
                }
            });
        }
    }

    static /* synthetic */ void b(ResponseCallback responseCallback, MonitorData monitorData) {
        int iAsInt = monitorData.asInt();
        responseCallback.onResponse(iAsInt, Boolean.valueOf(iAsInt == 1));
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, Exception exc) {
        LogUtil.e("WearCheckUtil", "handleSuccess: call query exception: ", exc);
        responseCallback.onResponse(-1, false);
    }
}
