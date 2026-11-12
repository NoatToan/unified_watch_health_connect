package defpackage;

import android.util.Pair;
import com.huawei.ads.adsrec.f0;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.openplatform.abl.log.HiAdLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class aye implements f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f787c;
    private ayc d;
    private List<axh> e;

    protected Pair<List<axh>, List<axh>> b(List<axh> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (axh axhVar : list) {
            if (axhVar != null) {
                axhVar.i();
                axhVar.o();
                if ("1".equals(axhVar.o())) {
                    arrayList.add(axhVar);
                } else {
                    arrayList2.add(axhVar);
                }
            }
        }
        arrayList.size();
        arrayList2.size();
        return new Pair<>(arrayList, arrayList2);
    }

    @Override // com.huawei.ads.adsrec.f0
    public void a(int i) {
        if (HiAdLog.isDebugEnable() && !ListUtil.isEmpty(this.e)) {
            this.e.size();
        }
        if (i == 1) {
            a();
            return;
        }
        if (i == 2) {
            e(this.e);
            return;
        }
        if (i != 3) {
            if (i == 5) {
                d(this.e);
                return;
            } else if (i != 6) {
                c();
                return;
            }
        }
        c(this.e);
    }

    private void d(List<axh> list) {
        axd.c("strategySortation", list, this.f787c, this.d).a();
    }

    private void e(List<axh> list) {
        axd.c("modelSortation", list, this.d).a();
    }

    private void c() {
        Pair<List<axh>, List<axh>> pairB = b(this.e);
        d((List) pairB.first);
        c((List) pairB.second);
        axd.c("mixEcpmSortation", this.e, pairB.first, pairB.second).a();
    }

    private void c(List<axh> list) {
        axd.c("ecpmSortation", list, this.f787c, this.d).a();
    }

    private void a() {
        Pair<List<axh>, List<axh>> pairB = b(this.e);
        e((List) pairB.first);
        c((List) pairB.second);
        axd.c("mixEcpmSortation", this.e, pairB.first, pairB.second).a();
    }

    public aye(String str, List<axh> list, ayc aycVar) {
        this.f787c = str;
        this.e = list;
        this.d = aycVar;
    }
}
