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
public class pnj implements ShareDataHandlerInterface {
    private ConcurrentHashMap<Integer, gyi> e = new ConcurrentHashMap<>();

    pnj() throws Throwable {
        d();
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void updateData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gyi)) {
            return;
        }
        if (pmvVar.e() == null) {
            pmvVar.b(new ArrayList());
        }
        if (!pmvVar.e().contains(Integer.valueOf(shareDataInfo.getId()))) {
            pmvVar.e().add(Integer.valueOf(shareDataInfo.getId()));
        }
        this.e.put(Integer.valueOf(shareDataInfo.getId()), (gyi) shareDataInfo);
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void deleteData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gyi)) {
            return;
        }
        pmvVar.e().remove(Integer.valueOf(shareDataInfo.getId()));
        if (StringUtils.g(shareDataInfo.getSportTypes())) {
            this.e.remove(Integer.valueOf(shareDataInfo.getId()));
        } else {
            this.e.put(Integer.valueOf(shareDataInfo.getId()), (gyi) shareDataInfo);
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public ShareDataInfo getShareDataById(int i) {
        if (this.e.isEmpty()) {
            LogUtil.e("SportStickerHandler", "sticker map do not load.");
            return null;
        }
        return this.e.get(Integer.valueOf(i));
    }

    private void d() throws Throwable {
        if (this.e.isEmpty()) {
            String strA = pnn.a(pld.n);
            if (StringUtils.g(strA)) {
                LogUtil.e("SportStickerHandler", "sticker config is empty.");
                this.e = new ConcurrentHashMap<>();
            } else {
                this.e = (ConcurrentHashMap) new GsonBuilder().create().fromJson(CommonUtil.ac(strA), new TypeToken<ConcurrentHashMap<Integer, gyi>>() { // from class: com.huawei.pluginsocialshare.shareconfig.handler.SportStickerHandler$1
                }.getType());
            }
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void writeJson() {
        ConcurrentHashMap<Integer, gyi> concurrentHashMap = this.e;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        LogUtil.a("SportStickerHandler", "write sticker config json result:", Boolean.valueOf(pnn.d(pld.n, new GsonBuilder().create().toJson(this.e))));
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public List<ShareDataInfo> getShareDataByIdList(List<Integer> list) {
        gyi gyiVar;
        if (CollectionUtils.a(list) || CollectionUtils.c(this.e)) {
            LogUtil.j("SportStickerHandler", "getShareDataByIdList idList or mStickerInfoMap is empty.");
            return Collections.EMPTY_LIST;
        }
        ArrayList<Integer> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Integer num : arrayList) {
            if (num != null && (gyiVar = this.e.get(num)) != null) {
                arrayList2.add(gyiVar);
            }
        }
        return arrayList2;
    }
}
