package defpackage;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gyg {
    private Map<Integer, List<ShareDataInfo>> e = new HashMap();

    public gyg() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.e.put(1, arrayList2);
        this.e.put(2, arrayList);
        this.e.put(3, arrayList3);
        this.e.put(4, arrayList4);
    }

    public List<ShareDataInfo> b() {
        return this.e.get(2);
    }

    public void a(List<ShareDataInfo> list) {
        this.e.put(2, list);
    }

    public List<ShareDataInfo> e() {
        return this.e.get(1);
    }

    public void i(List<ShareDataInfo> list) {
        this.e.put(1, list);
    }

    public List<ShareDataInfo> d() {
        return this.e.get(3);
    }

    public void g(List<ShareDataInfo> list) {
        this.e.put(3, list);
    }

    public List<ShareDataInfo> c() {
        return this.e.get(4);
    }

    public void f(List<ShareDataInfo> list) {
        this.e.put(4, list);
    }

    public List<ShareDataInfo> c(int i) {
        return this.e.get(Integer.valueOf(i)) == null ? Collections.EMPTY_LIST : this.e.get(Integer.valueOf(i));
    }

    public void b(int i, List<ShareDataInfo> list) {
        this.e.put(Integer.valueOf(i), list);
    }

    public List<ShareDataInfo> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(d());
        arrayList.addAll(b());
        arrayList.addAll(c());
        arrayList.addAll(e());
        return arrayList;
    }

    public void b(List<gyc> list) {
        if (list != null) {
            b().clear();
            b().addAll(list);
        }
    }

    public void e(List<gya> list) {
        if (list != null) {
            e().clear();
            e().addAll(list);
        }
    }

    public void d(List<gyj> list) {
        if (list != null) {
            d().clear();
            d().addAll(list);
        }
    }

    public void c(List<gym> list) {
        if (list != null) {
            c().clear();
            c().addAll(list);
        }
    }
}
