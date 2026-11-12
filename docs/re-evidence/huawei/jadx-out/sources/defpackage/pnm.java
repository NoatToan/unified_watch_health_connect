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
public class pnm implements ShareDataHandlerInterface {
    private ConcurrentHashMap<Integer, gyj> e = new ConcurrentHashMap<>();

    pnm() throws Throwable {
        e();
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void updateData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gyj)) {
            return;
        }
        if (pmvVar.d() == null) {
            pmvVar.e(new ArrayList());
        }
        if (!pmvVar.d().contains(Integer.valueOf(shareDataInfo.getId()))) {
            pmvVar.d().add(Integer.valueOf(shareDataInfo.getId()));
        }
        this.e.put(Integer.valueOf(shareDataInfo.getId()), (gyj) shareDataInfo);
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void deleteData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gyj)) {
            return;
        }
        pmvVar.d().remove(Integer.valueOf(shareDataInfo.getId()));
        if (StringUtils.g(shareDataInfo.getSportTypes())) {
            this.e.remove(Integer.valueOf(shareDataInfo.getId()));
        } else {
            this.e.put(Integer.valueOf(shareDataInfo.getId()), (gyj) shareDataInfo);
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public ShareDataInfo getShareDataById(int i) {
        if (this.e.isEmpty()) {
            LogUtil.e("WatermarkHandler", "watermark map do not load.");
            return null;
        }
        return this.e.get(Integer.valueOf(i));
    }

    private void e() throws Throwable {
        if (this.e.isEmpty()) {
            String strA = pnn.a(pld.r);
            if (StringUtils.g(strA)) {
                LogUtil.e("WatermarkHandler", "watermark config is empty.");
                this.e = new ConcurrentHashMap<>();
            } else {
                this.e = (ConcurrentHashMap) new GsonBuilder().create().fromJson(CommonUtil.ac(strA), new TypeToken<ConcurrentHashMap<Integer, gyj>>() { // from class: com.huawei.pluginsocialshare.shareconfig.handler.WatermarkHandler$1
                }.getType());
            }
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void writeJson() {
        ConcurrentHashMap<Integer, gyj> concurrentHashMap = this.e;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        LogUtil.a("WatermarkHandler", "write watermark config json result:", Boolean.valueOf(pnn.d(pld.r, new GsonBuilder().create().toJson(this.e))));
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public List<ShareDataInfo> getShareDataByIdList(List<Integer> list) {
        gyj gyjVar;
        if (CollectionUtils.a(list) || CollectionUtils.c(this.e)) {
            LogUtil.j("WatermarkHandler", "getShareDataByIdList idList or mWatermarkInfoMap is empty.");
            return Collections.EMPTY_LIST;
        }
        ArrayList<Integer> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Integer num : arrayList) {
            if (num != null && (gyjVar = this.e.get(num)) != null) {
                arrayList2.add(gyjVar);
            }
        }
        return arrayList2;
    }
}
