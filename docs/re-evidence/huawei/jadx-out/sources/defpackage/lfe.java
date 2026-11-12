package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.ISubScribeCallback;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.model.Notification;
import com.huawei.hihealth.model.SubscribeModel;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes10.dex */
public class lfe {
    private static volatile ConcurrentMap<Integer, Integer> d = new ConcurrentHashMap();
    private static volatile lfe e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f40018b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lef f40019c = new lef();

    private lfe(Context context) {
        this.f40017a = context.getApplicationContext();
    }

    public static lfe e(Context context) {
        if (e == null) {
            synchronized (lfc.class) {
                if (e == null) {
                    e = new lfe(context);
                }
            }
        }
        return e;
    }

    private void e(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) {
        synchronized (this.f40018b) {
            this.f40019c.registerObserver(subscribeModel, iSubScribeCallback);
        }
    }

    private void d(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback) {
        synchronized (this.f40018b) {
            this.f40019c.unregisterObserver(subscribeModel, iSubScribeCallback);
        }
    }

    public void b(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback, len lenVar) {
        e(subscribeModel, iSubScribeCallback);
        ArrayList arrayList = new ArrayList(subscribeModel.getDataTypes().length);
        ArrayList arrayList2 = new ArrayList(subscribeModel.getDataTypes().length);
        for (int i : subscribeModel.getDataTypes()) {
            Integer numValueOf = Integer.valueOf(i);
            if (d.containsKey(numValueOf)) {
                arrayList2.add(numValueOf);
            } else {
                arrayList.add(numValueOf);
            }
        }
        ReleaseLogUtil.d("HiH_SubscribeDataUtil", "hasSubscribedTypes = ", arrayList2.toString(), " tobeSubscribedTypes = ", arrayList.toString());
        if (arrayList.isEmpty()) {
            ReleaseLogUtil.d("HiH_SubscribeDataUtil", "has subscribed before");
            e(true, (List<Integer>) arrayList2, (List<Integer>) arrayList, iSubScribeCallback);
            lenVar.d(arrayList2, arrayList);
            return;
        }
        e(arrayList2, arrayList, iSubScribeCallback, lenVar);
    }

    private void e(final List<Integer> list, final List<Integer> list2, final ISubScribeCallback iSubScribeCallback, final len lenVar) {
        HiHealthNativeApi.a(this.f40017a).subscribeHiHealthData(list2, new HiSubscribeListener() { // from class: lfe.3
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list3, List<Integer> list4) {
                if (list3 == null || list3.isEmpty()) {
                    ReleaseLogUtil.e("HiH_SubscribeDataUtil", "all fail subscribe");
                    lfe.this.e(true, (List<Integer>) new ArrayList(), (List<Integer>) list2, iSubScribeCallback);
                    lenVar.d(new ArrayList(), list2);
                    return;
                }
                ReleaseLogUtil.e("HiH_SubscribeDataUtil", "subscribe fail list ", list4.toString());
                list2.removeAll(list4);
                for (int i = 0; i < list3.size(); i++) {
                    lfe.d.put((Integer) list2.get(i), list3.get(i));
                }
                list.addAll(list2);
                lfe.this.e(true, (List<Integer>) list, list4, iSubScribeCallback);
                lenVar.d(list, list4);
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                lfe.this.f40019c.notifyDataChanged(new Notification(i, 0, str));
            }
        });
    }

    public void e(SubscribeModel subscribeModel, ISubScribeCallback iSubScribeCallback, len lenVar) {
        d(subscribeModel, iSubScribeCallback);
        ArrayList arrayList = new ArrayList(subscribeModel.getDataTypes().length);
        ArrayList arrayList2 = new ArrayList(subscribeModel.getDataTypes().length);
        for (int i : subscribeModel.getDataTypes()) {
            Integer numValueOf = Integer.valueOf(i);
            lef lefVar = this.f40019c;
            numValueOf.getClass();
            if (lefVar.isTypeSubscribed(i)) {
                arrayList2.add(numValueOf);
            } else {
                arrayList.add(numValueOf);
            }
        }
        ReleaseLogUtil.d("HiH_SubscribeDataUtil", "hasUnsubscribedTypes: ", arrayList2.toString(), " toUnsubscribeTypes :", arrayList.toString());
        if (arrayList2.size() == subscribeModel.getDataTypes().length) {
            ReleaseLogUtil.d("HiH_SubscribeDataUtil", "no need to unsubscribe from platform");
            e(false, (List<Integer>) arrayList2, (List<Integer>) arrayList, iSubScribeCallback);
            lenVar.d(arrayList2, arrayList);
            return;
        }
        c(arrayList2, arrayList, iSubScribeCallback, lenVar);
    }

    private void c(final List<Integer> list, final List<Integer> list2, final ISubScribeCallback iSubScribeCallback, final len lenVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (d.containsKey(next)) {
                arrayList.add(d.get(next));
            } else {
                list.add(next);
                it.remove();
            }
        }
        HiHealthNativeApi.a(this.f40017a).unSubscribeHiHealthData(arrayList, new HiUnSubscribeListener() { // from class: lfh
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public final void onResult(boolean z) {
                this.d.d(list, list2, iSubScribeCallback, lenVar, z);
            }
        });
    }

    /* synthetic */ void d(List list, List list2, ISubScribeCallback iSubScribeCallback, len lenVar, boolean z) {
        if (z) {
            ReleaseLogUtil.d("HiH_SubscribeDataUtil", "unsubscribe success");
            list.addAll(list2);
            e(false, (List<Integer>) list, (List<Integer>) new ArrayList(), iSubScribeCallback);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                d.remove((Integer) it.next());
            }
            lenVar.d((List<Integer>) list, new ArrayList());
            return;
        }
        ReleaseLogUtil.d("HiH_SubscribeDataUtil", "unsubscribe fail");
        e(false, (List<Integer>) list, (List<Integer>) list2, iSubScribeCallback);
        lenVar.d((List<Integer>) list, (List<Integer>) list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z, List<Integer> list, List<Integer> list2, ISubScribeCallback iSubScribeCallback) {
        ReleaseLogUtil.d("HiH_SubscribeDataUtil", "subscribeOnResult: isSubscribeTag = ", Boolean.valueOf(z), " successTypes = ", list.toString(), " dataTypes = ", list2.toString());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Notification notification = new Notification(it.next().intValue(), 0, lcr.b(0));
            notification.setSubscribeTag(z);
            arrayList.add(notification);
        }
        Iterator<Integer> it2 = list2.iterator();
        while (it2.hasNext()) {
            Notification notification2 = new Notification(it2.next().intValue(), 4, lcr.b(4));
            notification2.setSubscribeTag(z);
            arrayList2.add(notification2);
        }
        try {
            iSubScribeCallback.onResult(arrayList, arrayList2);
        } catch (RemoteException e2) {
            ReleaseLogUtil.a("HiH_SubscribeDataUtil", "subscribeOnResult RemoteException: ", e2.getMessage());
        }
    }
}
