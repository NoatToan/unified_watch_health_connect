package defpackage;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface;
import health.compact.a.CommonUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class pni implements ShareDataHandlerInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<Integer, gye> f45720c = new ConcurrentHashMap<>();

    pni() throws Throwable {
        c();
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void updateData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gye)) {
            return;
        }
        if (pmvVar.c() == null) {
            pmvVar.a(new ArrayList());
        }
        if (!pmvVar.c().contains(Integer.valueOf(shareDataInfo.getId()))) {
            pmvVar.c().add(Integer.valueOf(shareDataInfo.getId()));
        }
        this.f45720c.put(Integer.valueOf(shareDataInfo.getId()), (gye) shareDataInfo);
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void deleteData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gye)) {
            return;
        }
        pmvVar.c().remove(Integer.valueOf(shareDataInfo.getId()));
        if (StringUtils.g(shareDataInfo.getSportTypes())) {
            this.f45720c.remove(Integer.valueOf(shareDataInfo.getId()));
        } else {
            this.f45720c.put(Integer.valueOf(shareDataInfo.getId()), (gye) shareDataInfo);
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public ShareDataInfo getShareDataById(int i) {
        if (this.f45720c.isEmpty()) {
            LogUtil.e("SportBackgroundHandler", "background map do not load.");
            return null;
        }
        return this.f45720c.get(Integer.valueOf(i));
    }

    private void c() throws Throwable {
        ConcurrentHashMap<Integer, gye> concurrentHashMap = this.f45720c;
        if (concurrentHashMap == null || !concurrentHashMap.isEmpty()) {
            return;
        }
        String strA = pnn.a(pld.i);
        if (StringUtils.g(strA)) {
            LogUtil.e("SportBackgroundHandler", "background config is empty.");
            this.f45720c = new ConcurrentHashMap<>();
        } else {
            this.f45720c = (ConcurrentHashMap) new GsonBuilder().create().fromJson(CommonUtil.ac(strA), new TypeToken<ConcurrentHashMap<Integer, gye>>() { // from class: com.huawei.pluginsocialshare.shareconfig.handler.SportBackgroundHandler$1
            }.getType());
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void writeJson() {
        ConcurrentHashMap<Integer, gye> concurrentHashMap = this.f45720c;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        LogUtil.a("SportBackgroundHandler", "write background config json result:", Boolean.valueOf(pnn.d(pld.i, new GsonBuilder().create().toJson(this.f45720c))));
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public List<ShareDataInfo> getShareDataByIdList(List<Integer> list) {
        gye gyeVar;
        if (CollectionUtils.a(list) || CollectionUtils.c(this.f45720c)) {
            LogUtil.j("SportBackgroundHandler", "getShareDataByIdList idList or mBackgroundInfoMap is empty.");
            return Collections.EMPTY_LIST;
        }
        ArrayList<Integer> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Integer num : arrayList) {
            if (num != null && (gyeVar = this.f45720c.get(num)) != null) {
                arrayList2.add(gyeVar);
            }
        }
        return arrayList2;
    }
}
