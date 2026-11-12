package defpackage;

import android.text.TextUtils;
import com.huawei.unitedevice.p2p.IdentityInfo;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class xjc {
    private static final xjc d = new xjc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<xiy, Map<IdentityInfo, List<IdentityInfo>>> f53107a = new ConcurrentHashMap(16);

    private xjc() {
    }

    public int c(IdentityInfo identityInfo, IdentityInfo identityInfo2, xiy xiyVar) {
        LogUtil.b("ReceiverCallbackManager", "addReceiverCallback enter");
        if (identityInfo == null || identityInfo2 == null || !e(identityInfo.getPackageName(), identityInfo2.getPackageName(), xiyVar)) {
            LogUtil.e("ReceiverCallbackManager", "addReceiverCallback parameters is invalid");
            return 5;
        }
        xiy xiyVarC = c(xiyVar);
        if (xiyVarC == null) {
            int size = b(identityInfo, identityInfo2).size();
            if (size >= 10) {
                LogUtil.b("ReceiverCallbackManager", "addReceiverCallback exceed max receiver. max size: ", Integer.valueOf(size));
                return 11;
            }
            LogUtil.b("ReceiverCallbackManager", "addReceiverCallback new receiver");
            b(identityInfo, identityInfo2, xiyVar);
            return 0;
        }
        LogUtil.b("ReceiverCallbackManager", "addReceiverCallback already has receiver");
        Map<IdentityInfo, List<IdentityInfo>> concurrentHashMap = this.f53107a.get(xiyVarC);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>(16);
        }
        this.f53107a.remove(xiyVarC);
        this.f53107a.put(xiyVar, concurrentHashMap);
        b(identityInfo, identityInfo2, concurrentHashMap);
        return 0;
    }

    public List<xiy> c(String str, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        ArrayList arrayList = new ArrayList(16);
        if (this.f53107a.isEmpty()) {
            LogUtil.e("ReceiverCallbackManager", "getReceiverCallback deviceReceiverCallbackMap is empty");
            return arrayList;
        }
        if (identityInfo == null || identityInfo2 == null) {
            LogUtil.e("ReceiverCallbackManager", "getReceiverCallback parameters[srcInfo, dstInfo] is invalid");
            return arrayList;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(identityInfo.getPackageName()) || TextUtils.isEmpty(identityInfo2.getPackageName())) {
            LogUtil.e("ReceiverCallbackManager", "getReceiverCallback parameters[deviceId, packageName] is invalid");
            return arrayList;
        }
        List<xiy> listB = b(identityInfo2, identityInfo);
        if (listB.isEmpty()) {
            LogUtil.e("ReceiverCallbackManager", "getReceiverCallback can not find receiver.");
        }
        return listB;
    }

    public void d(xiy xiyVar) {
        if (xiyVar == null) {
            LogUtil.e("ReceiverCallbackManager", "removeReceiverCallback receiver is invalid.");
        } else if (this.f53107a.remove(xiyVar) == null) {
            LogUtil.e("ReceiverCallbackManager", "remove receiver is null.");
        }
    }

    private void b(IdentityInfo identityInfo, IdentityInfo identityInfo2, xiy xiyVar) {
        LogUtil.b("ReceiverCallbackManager", "addNewReceiverCallback enter");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(identityInfo2);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put(identityInfo, arrayList);
        this.f53107a.put(xiyVar, concurrentHashMap);
    }

    private void b(IdentityInfo identityInfo, IdentityInfo identityInfo2, Map<IdentityInfo, List<IdentityInfo>> map) {
        List<IdentityInfo> arrayList = map.get(identityInfo);
        if (arrayList == null) {
            arrayList = new ArrayList<>(16);
            map.put(identityInfo, arrayList);
        }
        if (!arrayList.contains(identityInfo2)) {
            LogUtil.b("ReceiverCallbackManager", "updateIdentityInfo new dstPkgInfo");
            arrayList.add(identityInfo2);
        } else {
            LogUtil.b("ReceiverCallbackManager", "updateIdentityInfo already has dstPkgInfo");
        }
    }

    private List<xiy> b(IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        LogUtil.b("ReceiverCallbackManager", "getReceiverList enter");
        ArrayList arrayList = new ArrayList(16);
        if (this.f53107a.isEmpty()) {
            LogUtil.e("ReceiverCallbackManager", "getReceiverList deviceReceiverCallbackMap is empty");
            return arrayList;
        }
        for (Map.Entry<xiy, Map<IdentityInfo, List<IdentityInfo>>> entry : this.f53107a.entrySet()) {
            Map<IdentityInfo, List<IdentityInfo>> value = entry.getValue();
            if (value != null) {
                LogUtil.b("ReceiverCallbackManager", "getReceiverList enter srcDestPkgMap");
                List<IdentityInfo> list = value.get(identityInfo);
                if (list == null) {
                    LogUtil.e("ReceiverCallbackManager", "getReceiverList do not have the phone dstPkgInfo and continue");
                } else if (!list.contains(identityInfo2)) {
                    LogUtil.e("ReceiverCallbackManager", "getReceiverList do not have the watch srcPkgInfo and continue");
                } else {
                    LogUtil.b("ReceiverCallbackManager", "getReceiverList deviceReceiverCallbackMap hit");
                    arrayList.add(entry.getKey());
                }
            }
        }
        return arrayList;
    }

    private xiy c(xiy xiyVar) {
        if (xiyVar == null) {
            return null;
        }
        for (xiy xiyVar2 : this.f53107a.keySet()) {
            if (xiyVar2.equals(xiyVar)) {
                LogUtil.b("ReceiverCallbackManager", "getContainReceiver get the same receiver");
                return xiyVar2;
            }
        }
        LogUtil.b("ReceiverCallbackManager", "getContainReceiver no same receiver");
        return null;
    }

    private boolean e(String str, String str2, xiy xiyVar) {
        return (xiyVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    public static xjc b() {
        return d;
    }
}
