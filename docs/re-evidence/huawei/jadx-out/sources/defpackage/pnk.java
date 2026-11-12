package defpackage;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.pluginsocialshare.shareconfig.handler.ShareDataHandlerInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class pnk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, ShareDataHandlerInterface> f45721a;

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final pnk f45722c = new pnk();
    }

    private pnk() {
        HashMap map = new HashMap(4);
        this.f45721a = map;
        map.put(2, new pne());
        this.f45721a.put(1, new png());
        this.f45721a.put(3, new pnm());
        this.f45721a.put(4, new pnl());
    }

    public static final pnk a() {
        return d.f45722c;
    }

    public ShareDataHandlerInterface b(int i) {
        return this.f45721a.get(Integer.valueOf(i));
    }

    public void c() {
        Iterator<ShareDataHandlerInterface> it = this.f45721a.values().iterator();
        while (it.hasNext()) {
            it.next().writeJson();
        }
    }

    public gyg e(pmv pmvVar) {
        gyg gygVar = new gyg();
        for (Map.Entry<Integer, ShareDataHandlerInterface> entry : this.f45721a.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            List<ShareDataInfo> listC = pnq.c(entry.getValue().getShareDataByIdList(pmvVar.e(iIntValue)));
            pnq.d(listC);
            gygVar.b(iIntValue, listC);
        }
        return gygVar;
    }
}
