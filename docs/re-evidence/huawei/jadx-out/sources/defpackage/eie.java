package defpackage;

import com.huawei.health.device.api.ResourceManagerApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hmf.annotation.ApiDefine;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
@ApiDefine(uri = ResourceManagerApi.class)
public class eie implements ResourceManagerApi {
    @Override // com.huawei.health.device.api.ResourceManagerApi
    public ArrayList<HealthDevice.HealthDeviceKind> getProductKinds(List<String> list) {
        LogUtil.a("ResourceManagerImpl", "run getProductKinds");
        ArrayList<HealthDevice.HealthDeviceKind> arrayList = new ArrayList<>(10);
        if (coq.d(list)) {
            LogUtil.d("ResourceManagerImpl", "getProductKinds bindProductLists is empty");
            return arrayList;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            elh elhVarD = ResourceManager.c().d(it.next());
            if (elhVarD != null && elhVarD.l() != null && elhVarD.l().b() != null && !elhVarD.l().b().trim().isEmpty()) {
                arrayList.add(elhVarD.m());
            }
        }
        return arrayList;
    }
}
