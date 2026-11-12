package defpackage;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class gyf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, List<ShareDataInfo>> f36226b = new HashMap();

    public gyf() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f36226b.put(2, arrayList);
        this.f36226b.put(4, arrayList2);
    }

    public List<ShareDataInfo> e() {
        return this.f36226b.get(2);
    }

    public void c(List<ShareDataInfo> list) {
        this.f36226b.put(2, list);
    }

    public List<ShareDataInfo> c() {
        return this.f36226b.get(4);
    }

    public void d(List<ShareDataInfo> list) {
        this.f36226b.put(4, list);
    }

    public List<ShareDataInfo> c(int i) {
        return this.f36226b.get(Integer.valueOf(i)) == null ? Collections.EMPTY_LIST : this.f36226b.get(Integer.valueOf(i));
    }

    public void a(int i, List<ShareDataInfo> list) {
        this.f36226b.put(Integer.valueOf(i), list);
    }

    public List<ShareDataInfo> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(e());
        arrayList.addAll(c());
        return arrayList;
    }

    public void a(List<gye> list) {
        List<ShareDataInfo> listE;
        if (list == null || (listE = e()) == null) {
            return;
        }
        listE.clear();
        listE.addAll(list);
    }

    public void e(List<gyi> list) {
        List<ShareDataInfo> listC;
        if (list == null || (listC = c()) == null) {
            return;
        }
        listC.clear();
        listC.addAll(list);
    }
}
