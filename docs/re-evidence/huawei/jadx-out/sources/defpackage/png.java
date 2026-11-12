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
public class png implements ShareDataHandlerInterface {
    private ConcurrentHashMap<Integer, gya> d = new ConcurrentHashMap<>();

    png() throws Throwable {
        e();
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void updateData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gya)) {
            return;
        }
        if (pmvVar.b() == null) {
            pmvVar.c(new ArrayList());
        }
        if (!pmvVar.b().contains(Integer.valueOf(shareDataInfo.getId()))) {
            pmvVar.b().add(Integer.valueOf(shareDataInfo.getId()));
        }
        if (CollectionUtils.c(this.d)) {
            LogUtil.j("RecommendHandler", "updateData mRecommendInfoMap isEmpty");
        } else {
            this.d.put(Integer.valueOf(shareDataInfo.getId()), (gya) shareDataInfo);
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void deleteData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gya)) {
            return;
        }
        pmvVar.b().remove(Integer.valueOf(shareDataInfo.getId()));
        if (CollectionUtils.c(this.d)) {
            LogUtil.j("RecommendHandler", "deleteData mRecommendInfoMap isEmpty");
        } else if (StringUtils.g(shareDataInfo.getSportTypes())) {
            this.d.remove(Integer.valueOf(shareDataInfo.getId()));
        } else {
            this.d.put(Integer.valueOf(shareDataInfo.getId()), (gya) shareDataInfo);
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public ShareDataInfo getShareDataById(int i) {
        if (CollectionUtils.c(this.d)) {
            LogUtil.e("RecommendHandler", "recommend map do not load.");
            return null;
        }
        return this.d.get(Integer.valueOf(i));
    }

    private void e() throws Throwable {
        if (CollectionUtils.c(this.d)) {
            String strA = pnn.a(pld.g);
            if (StringUtils.g(strA)) {
                LogUtil.e("RecommendHandler", "recommend config is empty.");
                this.d = new ConcurrentHashMap<>();
            } else {
                this.d = (ConcurrentHashMap) new GsonBuilder().create().fromJson(CommonUtil.ac(strA), new TypeToken<ConcurrentHashMap<Integer, gya>>() { // from class: com.huawei.pluginsocialshare.shareconfig.handler.RecommendHandler$1
                }.getType());
            }
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void writeJson() {
        ConcurrentHashMap<Integer, gya> concurrentHashMap = this.d;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        LogUtil.a("RecommendHandler", "write recommend config json result:", Boolean.valueOf(pnn.d(pld.g, new GsonBuilder().create().toJson(this.d))));
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public List<ShareDataInfo> getShareDataByIdList(List<Integer> list) {
        gya gyaVar;
        if (CollectionUtils.a(list) || CollectionUtils.c(this.d)) {
            LogUtil.j("RecommendHandler", "getShareDataByIdList idList or mRecommendInfoMap is empty.");
            return Collections.EMPTY_LIST;
        }
        ArrayList<Integer> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Integer num : arrayList) {
            if (num != null && (gyaVar = this.d.get(num)) != null) {
                arrayList2.add(gyaVar);
            }
        }
        return arrayList2;
    }
}
