package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.wearengine.p2p.IdentityInfo;
import com.huawei.wearengine.p2p.MessageParcel;
import com.huawei.wearengine.p2p.ReceiveResultCallback;
import com.huawei.wearengine.p2p.ReceiverCallback;
import com.huawei.wearengine.scope.ScopeInfoResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes46.dex */
public class yiz {
    private final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<ykh, Map<String, Map<IdentityInfo, List<IdentityInfo>>>> f53406c = new ConcurrentHashMap();

    public int b(String str, IdentityInfo identityInfo, IdentityInfo identityInfo2, ykh ykhVar) {
        if (identityInfo == null || identityInfo2 == null) {
            yit.b("ReceiverCallbackManager", "send pkgInfo is invalid");
            return 5;
        }
        if (!e(str, identityInfo.getPackageName(), identityInfo2.getPackageName(), ykhVar)) {
            yit.b("ReceiverCallbackManager", "HandleReceiverCallbackProxy parameters is invalid");
            return 5;
        }
        yit.a("ReceiverCallbackManager", "registerReceiver receiverCallbackProxy pid is:" + ykhVar.d() + ", hashcode is:" + ykhVar.b());
        int size = e(str, identityInfo, identityInfo2).size();
        synchronized (this.e) {
            ykh ykhVarC = c(ykhVar);
            if (ykhVarC != null) {
                yit.e("ReceiverCallbackManager", "registerReceiver already has receiver");
                c(str, identityInfo, identityInfo2, this.f53406c.get(ykhVarC));
            } else {
                if (size >= 10) {
                    return 11;
                }
                yit.e("ReceiverCallbackManager", "registerReceiver new receiver");
                a(str, identityInfo, identityInfo2, ykhVar);
            }
            yit.a("ReceiverCallbackManager", "handleReceiverCallbackProxy mDeviceReceiverCallbackMap is:" + this.f53406c.toString());
            return 0;
        }
    }

    private boolean e(String str, String str2, String str3, ykh ykhVar) {
        return (TextUtils.isEmpty(str) || ykhVar == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) ? false : true;
    }

    public ykh c(ykh ykhVar) {
        if (ykhVar == null) {
            return null;
        }
        yit.a("ReceiverCallbackManager", "getContainReceiver receiverCallbackProxy pid is:" + ykhVar.d() + ", hashcode is:" + ykhVar.b());
        for (ykh ykhVar2 : this.f53406c.keySet()) {
            if (ykhVar2.equals(ykhVar)) {
                yit.e("ReceiverCallbackManager", "getContainReceiver get the same receiverCallbackProxy");
                return ykhVar2;
            }
        }
        yit.e("ReceiverCallbackManager", "getContainReceiver no same receiverCallbackProxy");
        return null;
    }

    private List<ykh> e(String str, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        yit.e("ReceiverCallbackManager", "getReceiverList enter");
        ArrayList arrayList = new ArrayList();
        if (this.f53406c.isEmpty()) {
            yit.b("ReceiverCallbackManager", "getReceiverList deviceReceiverCallbackMap is null");
            return arrayList;
        }
        ScopeInfoResponse scopeInfoResponseE = !yik.b(identityInfo.getPackageName(), identityInfo.getFingerPrint()) ? ylo.e(yln.j(yiv.a(), identityInfo.getPackageName())) : null;
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<ykh, Map<String, Map<IdentityInfo, List<IdentityInfo>>>> entry : this.f53406c.entrySet()) {
            Map<IdentityInfo, List<IdentityInfo>> map = entry.getValue().get(str);
            if (map != null) {
                IdentityInfo identityInfoA = a(map.keySet(), identityInfo, scopeInfoResponseE);
                if (identityInfoA == null) {
                    yit.c("ReceiverCallbackManager", "getReceiverList do not have the phone destPkgInfo and continue");
                } else {
                    arrayList2.add(identityInfoA.getPackageName());
                    List<IdentityInfo> list = map.get(identityInfoA);
                    if (list != null) {
                        if (!c(list, identityInfo2)) {
                            yit.c("ReceiverCallbackManager", "getReceiverList do not have the watch srcPkgInfo and continue");
                        } else {
                            yit.e("ReceiverCallbackManager", "getReceiverList deviceReceiverCallbackMap hit");
                            arrayList.add(entry.getKey());
                        }
                    }
                }
            }
        }
        yit.e("ReceiverCallbackManager", "getReceiverList phonePkgNameList: " + arrayList2.toString());
        return arrayList;
    }

    private IdentityInfo a(Set<IdentityInfo> set, IdentityInfo identityInfo, ScopeInfoResponse scopeInfoResponse) {
        if (set == null) {
            return null;
        }
        for (IdentityInfo identityInfo2 : set) {
            if (TextUtils.equals(identityInfo2.getPackageName(), identityInfo.getPackageName())) {
                String fingerPrint = identityInfo2.getFingerPrint();
                String fingerPrint2 = identityInfo.getFingerPrint();
                if (TextUtils.equals(fingerPrint, fingerPrint2) || (scopeInfoResponse != null && (TextUtils.equals(fingerPrint2, scopeInfoResponse.getCertFingerprint()) || ylo.c(fingerPrint2, scopeInfoResponse.getCertFingerprintExtra())))) {
                    return identityInfo2;
                }
            }
        }
        return null;
    }

    private IdentityInfo b(Set<IdentityInfo> set, IdentityInfo identityInfo) {
        if (set == null) {
            return null;
        }
        for (IdentityInfo identityInfo2 : set) {
            if (TextUtils.equals(identityInfo2.getPackageName(), identityInfo.getPackageName()) && TextUtils.equals(identityInfo2.getFingerPrint(), identityInfo.getFingerPrint())) {
                return identityInfo2;
            }
        }
        return null;
    }

    private boolean c(List<IdentityInfo> list, IdentityInfo identityInfo) {
        return b(new HashSet(list), identityInfo) != null;
    }

    private void c(String str, IdentityInfo identityInfo, IdentityInfo identityInfo2, Map<String, Map<IdentityInfo, List<IdentityInfo>>> map) {
        if (!map.containsKey(str)) {
            yit.e("ReceiverCallbackManager", "addDestPkgInfo new device");
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(identityInfo2);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap.put(identityInfo, arrayList);
            map.put(str, concurrentHashMap);
            return;
        }
        yit.e("ReceiverCallbackManager", "addDestPkgInfo already has device");
        Map<IdentityInfo, List<IdentityInfo>> map2 = map.get(str);
        IdentityInfo identityInfoB = b(map2.keySet(), identityInfo);
        if (identityInfoB == null) {
            yit.e("ReceiverCallbackManager", "addDestPkgInfo new srcPkgInfo");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(identityInfo2);
            map2.put(identityInfo, arrayList2);
            return;
        }
        yit.e("ReceiverCallbackManager", "addDestPkgInfo already has srcPkgInfo");
        List<IdentityInfo> list = map2.get(identityInfoB);
        if (!c(list, identityInfo2)) {
            yit.e("ReceiverCallbackManager", "addDestPkgInfo new destPkgInfo");
            list.add(identityInfo2);
        }
        yit.e("ReceiverCallbackManager", "addDestPkgInfo already has destPkgInfo");
    }

    private void a(String str, IdentityInfo identityInfo, IdentityInfo identityInfo2, ykh ykhVar) {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(identityInfo2);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(identityInfo, arrayList);
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        concurrentHashMap2.put(str, concurrentHashMap);
        this.f53406c.putIfAbsent(ykhVar, concurrentHashMap2);
    }

    public void c(String str, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiveResultCallback receiveResultCallback) {
        yit.e("ReceiverCallbackManager", "handleReceive enter");
        if (this.f53406c.isEmpty()) {
            yit.b("ReceiverCallbackManager", "handleReceive deviceReceiverCallbackMap is null");
            return;
        }
        if (identityInfo == null || identityInfo2 == null) {
            yit.b("ReceiverCallbackManager", "handleReceive parameters is invalid");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(identityInfo.getPackageName()) || TextUtils.isEmpty(identityInfo2.getPackageName())) {
            yit.b("ReceiverCallbackManager", "handleReceive parameters is invalid");
            return;
        }
        if (messageParcel == null) {
            yit.b("ReceiverCallbackManager", "handleReceive parameters is invalid");
            return;
        }
        List<ykh> listE = e(str, identityInfo2, identityInfo);
        if (listE.isEmpty()) {
            yit.e("ReceiverCallbackManager", "handleReceive receiverList is empty");
            b(receiveResultCallback, 206);
            b(messageParcel);
            return;
        }
        b(receiveResultCallback, a.w);
        Iterator<ykh> it = listE.iterator();
        while (it.hasNext()) {
            ReceiverCallback receiverCallbackE = it.next().e();
            if (receiverCallbackE != null) {
                try {
                    d(receiverCallbackE, messageParcel);
                } catch (Exception unused) {
                    yit.c("ReceiverCallbackManager", "handleReceive exception");
                }
            }
        }
    }

    public void b(ykh ykhVar) {
        if (ykhVar != null) {
            this.f53406c.remove(ykhVar);
        }
        yit.e("ReceiverCallbackManager", "removeReceiverCallback deviceReceiverCallbackMap size is:" + this.f53406c.size());
    }

    public int e() {
        return this.f53406c.size();
    }

    public void b() {
        if (this.f53406c.isEmpty()) {
            yit.b("ReceiverCallbackManager", "clearDiedReceiver deviceReceiverCallbackMap is null");
            return;
        }
        Iterator<Map.Entry<ykh, Map<String, Map<IdentityInfo, List<IdentityInfo>>>>> it = this.f53406c.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getKey().e().asBinder().pingBinder()) {
                yit.a("ReceiverCallbackManager", "clearDiedReceiver hit died receiver and remove");
                it.remove();
            }
        }
        yit.e("ReceiverCallbackManager", "clearDiedReceiver deviceReceiverCallbackMap size is:" + this.f53406c.size());
    }

    public boolean d(String str, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        if (identityInfo == null || identityInfo2 == null) {
            yit.b("ReceiverCallbackManager", "isP2pReceiverExist IdentityInfo is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            yit.b("ReceiverCallbackManager", "isP2pReceiverExist deviceId is null");
            return false;
        }
        if (TextUtils.isEmpty(identityInfo.getPackageName()) || TextUtils.isEmpty(identityInfo2.getPackageName())) {
            yit.b("ReceiverCallbackManager", "isP2pReceiverExist package is null");
            return false;
        }
        List<ykh> listE = e(str, identityInfo, identityInfo2);
        if (listE.isEmpty()) {
            yit.b("ReceiverCallbackManager", "isP2pReceiverExist receiverList is empty");
            return false;
        }
        Iterator<ykh> it = listE.iterator();
        while (it.hasNext()) {
            if (it.next().e() != null) {
                yit.b("ReceiverCallbackManager", "isP2pReceiverExist return true");
                return true;
            }
        }
        yit.b("ReceiverCallbackManager", "isP2pReceiverExist return false");
        return false;
    }

    private void b(ReceiveResultCallback receiveResultCallback, int i) {
        if (receiveResultCallback == null) {
            yit.b("ReceiverCallbackManager", "notifyReceiveResult callback is null");
            return;
        }
        try {
            receiveResultCallback.onReceiveResult(i);
        } catch (RemoteException unused) {
            yit.b("ReceiverCallbackManager", "notifyReceiveResult RemoteException");
        }
    }

    private void b(MessageParcel messageParcel) {
        if (messageParcel == null) {
            yit.e("ReceiverCallbackManager", "closePfd messageParcel is null");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = messageParcel.getParcelFileDescriptor();
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
                yit.e("ReceiverCallbackManager", "pfd from messageParcel close");
            } catch (IOException unused) {
                yit.b("ReceiverCallbackManager", "closePfd IOException");
            }
        }
    }

    private void d(ReceiverCallback receiverCallback, MessageParcel messageParcel) throws RemoteException {
        int type = messageParcel.getType();
        yit.e("ReceiverCallbackManager", "dispatchMessage, type:" + type);
        if (type == 1) {
            receiverCallback.onReceiveMessage(messageParcel.getData());
        } else if (type == 2) {
            receiverCallback.onReceiveFileMessage(messageParcel);
        } else {
            yit.b("ReceiverCallbackManager", "dispatchMessage type is invalid");
        }
    }

    void a(int i) {
        yit.e("ReceiverCallbackManager", "before removeReceiverByPid size: " + this.f53406c.size());
        if (this.f53406c.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<ykh, Map<String, Map<IdentityInfo, List<IdentityInfo>>>>> it = this.f53406c.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().d() == i) {
                it.remove();
            }
        }
        yit.e("ReceiverCallbackManager", "after removeReceiverByPid size: " + this.f53406c.size());
    }

    void d(String str) {
        yit.e("ReceiverCallbackManager", "removeReceiverByDevice before : " + this.f53406c);
        if (this.f53406c.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<ykh, Map<String, Map<IdentityInfo, List<IdentityInfo>>>>> it = this.f53406c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<ykh, Map<String, Map<IdentityInfo, List<IdentityInfo>>>> next = it.next();
            if (next.getValue() != null) {
                e(str, next.getValue());
                if (next.getValue().size() == 0) {
                    it.remove();
                }
            }
        }
        yit.e("ReceiverCallbackManager", "removeReceiverByDevice after : " + this.f53406c);
    }

    private void e(String str, Map<String, Map<IdentityInfo, List<IdentityInfo>>> map) {
        Iterator<Map.Entry<String, Map<IdentityInfo, List<IdentityInfo>>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getKey())) {
                it.remove();
            }
        }
    }
}
