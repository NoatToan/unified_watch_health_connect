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
public class pnl implements ShareDataHandlerInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<Integer, gym> f45723c = new ConcurrentHashMap<>();

    pnl() throws Throwable {
        a();
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void updateData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gym)) {
            return;
        }
        if (pmvVar.e() == null) {
            pmvVar.b(new ArrayList());
        }
        if (!pmvVar.e().contains(Integer.valueOf(shareDataInfo.getId()))) {
            pmvVar.e().add(Integer.valueOf(shareDataInfo.getId()));
        }
        this.f45723c.put(Integer.valueOf(shareDataInfo.getId()), (gym) shareDataInfo);
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void deleteData(pmv pmvVar, ShareDataInfo shareDataInfo) {
        if (pmvVar == null || !(shareDataInfo instanceof gym)) {
            return;
        }
        pmvVar.e().remove(Integer.valueOf(shareDataInfo.getId()));
        if (StringUtils.g(shareDataInfo.getSportTypes())) {
            this.f45723c.remove(Integer.valueOf(shareDataInfo.getId()));
        } else {
            this.f45723c.put(Integer.valueOf(shareDataInfo.getId()), (gym) shareDataInfo);
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public ShareDataInfo getShareDataById(int i) {
        if (this.f45723c.isEmpty()) {
            LogUtil.e("StickerHandler", "sticker map do not load.");
            return null;
        }
        return this.f45723c.get(Integer.valueOf(i));
    }

    private void a() throws Throwable {
        if (this.f45723c.isEmpty()) {
            String strA = pnn.a(pld.t);
            if (StringUtils.g(strA)) {
                LogUtil.e("StickerHandler", "sticker config is empty.");
                this.f45723c = new ConcurrentHashMap<>();
            } else {
                this.f45723c = (ConcurrentHashMap) new GsonBuilder().create().fromJson(CommonUtil.ac(strA), new TypeToken<ConcurrentHashMap<Integer, gym>>() { // from class: com.huawei.pluginsocialshare.shareconfig.handler.StickerHandler$1
                }.getType());
            }
        }
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public void writeJson() {
        ConcurrentHashMap<Integer, gym> concurrentHashMap = this.f45723c;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        LogUtil.a("StickerHandler", "write sticker config json result:", Boolean.valueOf(pnn.d(pld.t, new GsonBuilder().create().toJson(this.f45723c))));
    }

    @Override // com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface
    public List<ShareDataInfo> getShareDataByIdList(List<Integer> list) {
        gym gymVar;
        if (CollectionUtils.a(list) || CollectionUtils.c(this.f45723c)) {
            LogUtil.j("StickerHandler", "getShareDataByIdList idList or mStickerInfoMap is empty.");
            return Collections.EMPTY_LIST;
        }
        ArrayList<Integer> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Integer num : arrayList) {
            if (num != null && (gymVar = this.f45723c.get(num)) != null) {
                arrayList2.add(gymVar);
            }
        }
        return arrayList2;
    }
}
