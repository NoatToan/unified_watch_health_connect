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
public class pne implements ShareDataHandlerInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Integer, gyc> f45715a = new ConcurrentHashMap<>();

    pne() throws Throwable {
        d();
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void updateData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gyc)) {
            return;
        }
        if (pmvVar.c() == null) {
            pmvVar.a(new ArrayList());
        }
        if (!pmvVar.c().contains(Integer.valueOf(shareDataInfo.getId()))) {
            pmvVar.c().add(Integer.valueOf(shareDataInfo.getId()));
        }
        this.f45715a.put(Integer.valueOf(shareDataInfo.getId()), (gyc) shareDataInfo);
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void deleteData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gyc)) {
            return;
        }
        pmvVar.c().remove(Integer.valueOf(shareDataInfo.getId()));
        if (StringUtils.g(shareDataInfo.getSportTypes())) {
            this.f45715a.remove(Integer.valueOf(shareDataInfo.getId()));
        } else {
            this.f45715a.put(Integer.valueOf(shareDataInfo.getId()), (gyc) shareDataInfo);
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public ShareDataInfo getShareDataById(int i) {
        if (this.f45715a.isEmpty()) {
            LogUtil.e("BackgroundHandler", "background map do not load.");
            return null;
        }
        return this.f45715a.get(Integer.valueOf(i));
    }

    private void d() throws Throwable {
        ConcurrentHashMap<Integer, gyc> concurrentHashMap = this.f45715a;
        if (concurrentHashMap == null || !concurrentHashMap.isEmpty()) {
            return;
        }
        String strA = pnn.a(pld.f45586b);
        if (StringUtils.g(strA)) {
            LogUtil.e("BackgroundHandler", "background config is empty.");
            this.f45715a = new ConcurrentHashMap<>();
        } else {
            this.f45715a = (ConcurrentHashMap) new GsonBuilder().create().fromJson(CommonUtil.ac(strA), new TypeToken<ConcurrentHashMap<Integer, gyc>>() { // from class: com.huawei.pluginsocialshare.shareconfig.handler.BackgroundHandler$1
            }.getType());
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void writeJson() {
        ConcurrentHashMap<Integer, gyc> concurrentHashMap = this.f45715a;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        LogUtil.a("BackgroundHandler", "write background config json result:", Boolean.valueOf(pnn.d(pld.f45586b, new GsonBuilder().create().toJson(this.f45715a))));
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public List<ShareDataInfo> getShareDataByIdList(List<Integer> list) {
        gyc gycVar;
        if (CollectionUtils.a(list) || CollectionUtils.c(this.f45715a)) {
            LogUtil.j("BackgroundHandler", "getShareDataByIdList idList or mBackgroundInfoMap is empty.");
            return Collections.EMPTY_LIST;
        }
        ArrayList<Integer> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Integer num : arrayList) {
            if (num != null && (gycVar = this.f45715a.get(num)) != null) {
                arrayList2.add(gycVar);
            }
        }
        return arrayList2;
    }
}
