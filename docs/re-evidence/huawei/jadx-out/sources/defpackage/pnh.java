package defpackage;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class pnh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, ShareDataHandlerInterface> f45719b;

    static class e {
        private static final pnh d = new pnh();
    }

    private pnh() {
        HashMap map = new HashMap(2);
        this.f45719b = map;
        map.put(2, new pni());
        this.f45719b.put(4, new pnj());
    }

    public static final pnh a() {
        return e.d;
    }

    public ShareDataHandlerInterface c(int i) {
        return this.f45719b.get(Integer.valueOf(i));
    }

    public void c() {
        Iterator<ShareDataHandlerInterface> it = this.f45719b.values().iterator();
        while (it.hasNext()) {
            it.next().writeJson();
        }
    }

    public gyf a(pmv pmvVar) {
        gyf gyfVar = new gyf();
        for (Map.Entry<Integer, ShareDataHandlerInterface> entry : this.f45719b.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            List<ShareDataInfo> listC = pnq.c(entry.getValue().getShareDataByIdList(pmvVar.e(iIntValue)));
            pnq.d(listC);
            gyfVar.a(iIntValue, listC);
        }
        return gyfVar;
    }
}
