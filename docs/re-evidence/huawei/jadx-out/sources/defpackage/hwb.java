package defpackage;

import android.app.Activity;
import android.content.Context;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.notify.Action;
import com.huawei.wearengine.notify.NotificationTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hwb {
    public static void d(final String str, final IntPlan intPlan) {
        final Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        yhw.c(activity).c().addOnSuccessListener(new OnSuccessListener() { // from class: hvz
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                hwb.d(arrayList, activity, intPlan, str, (List) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: hwi
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LogUtil.a("IntPlanWatchUtil", "get BondedDevices Failure: ", exc.getMessage());
            }
        });
    }

    static /* synthetic */ void d(List list, Context context, IntPlan intPlan, String str, List list2) {
        list.addAll(list2);
        Device device = null;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Device device2 = (Device) it.next();
                if (device2.isConnected()) {
                    LogUtil.a("IntPlanWatchUtil", "the device is Connected.");
                    device = device2;
                }
            }
        }
        if (device != null) {
            d(device, context, intPlan.getMetaInfo().getName(), str);
        }
    }

    private static void d(Device device, Context context, String str, final String str2) {
        yjw yjwVarA = yhw.a(context);
        yka.d dVar = new yka.d();
        dVar.c(new Action() { // from class: hwb.2
            @Override // com.huawei.wearengine.notify.Action
            public void onResult(yka ykaVar, int i) {
                LogUtil.a("IntPlanWatchUtil", "notifyMsgToWatch onResult feedback=", Integer.valueOf(i));
            }

            @Override // com.huawei.wearengine.notify.Action
            public void onError(yka ykaVar, int i, String str3) {
                LogUtil.a("IntPlanWatchUtil", "notifyMsgToWatch onError errorCode= ", Integer.valueOf(i), " errorMsg= ", str3);
            }
        });
        dVar.e(NotificationTemplate.NOTIFICATION_TEMPLATE_NO_BUTTON);
        dVar.b(context.getPackageName());
        dVar.d(hvu.c(str, 28));
        dVar.a(str2);
        yka ykaVarD = dVar.d();
        if (device == null || !device.isConnected()) {
            return;
        }
        yjwVarA.a(device, ykaVarD).addOnSuccessListener(new OnSuccessListener() { // from class: hwf
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                LogUtil.a("IntPlanWatchUtil", "the message is notified as: ", str2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: hwh
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LogUtil.a("IntPlanWatchUtil", exc.getMessage(), " failure on notifying the message:", str2);
            }
        });
    }
}
