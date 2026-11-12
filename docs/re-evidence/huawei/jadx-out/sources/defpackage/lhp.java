package defpackage;

import android.content.Context;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import health.compact.a.HiCommonUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lhp {
    private static Context e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Integer> f40161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<SyncKey> f40162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f40163c;
    private List<SyncKey> d;

    private lhp() {
        this.f40163c = new ArrayList(20);
        e();
        this.f40161a = HiHealthDictManager.a(e).b();
    }

    static class e {
        private static final lhp d = new lhp();
    }

    private void e() {
        this.f40163c.clear();
        this.f40163c.add(1);
        this.f40163c.add(2);
        this.f40163c.add(4);
        this.f40163c.add(7);
        this.f40163c.add(9);
        this.f40163c.add(11);
        this.f40163c.add(13);
        this.f40163c.add(16);
        this.f40163c.add(19);
        this.f40163c.add(21);
        this.f40163c.add(900000000);
        this.f40163c.addAll(HiHealthDictManager.a(e).a());
        this.f40163c.add(12);
        this.f40163c.add(14);
        this.f40163c.add(34001);
        if (liq.f()) {
            return;
        }
        this.f40163c.add(15);
        this.f40163c.add(18);
    }

    public static lhp b(Context context) {
        e = context.getApplicationContext();
        return e.d;
    }

    public void c() throws lif {
        e();
        List<SyncKey> listD = lio.d(e, 2, this.f40163c, this.f40161a);
        if (njy.e(listD)) {
            return;
        }
        this.f40162b = new ArrayList(this.f40163c.size());
        this.d = new ArrayList(this.f40161a.size());
        for (SyncKey syncKey : listD) {
            if ("SampleStatistic".equals(syncKey.getCategory())) {
                this.d.add(syncKey);
            } else {
                this.f40162b.add(syncKey);
            }
        }
    }

    public void a() {
        if (!HiCommonUtil.b(this.f40162b)) {
            this.f40162b = null;
        }
        if (HiCommonUtil.b(this.d)) {
            return;
        }
        this.d = null;
    }

    public List<SyncKey> c(int i) {
        return b(Collections.singletonList(Integer.valueOf(i)));
    }

    public List<SyncKey> b(List<Integer> list) {
        return b(this.f40162b, list);
    }

    public List<SyncKey> a(List<Integer> list) {
        return b(this.d, list);
    }

    private static List<SyncKey> b(List<SyncKey> list, List<Integer> list2) {
        if (HiCommonUtil.b(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        for (Integer num : list2) {
            for (SyncKey syncKey : list) {
                if (num.equals(syncKey.getType())) {
                    if (syncKey.getVersion().longValue() == 0) {
                        ReleaseLogUtil.d("HiH_HiSyncVerMgr", "getSyncKeys cloudNoDt,tp=", num);
                        break;
                    }
                    arrayList.add(syncKey);
                    break;
                }
            }
        }
        return arrayList;
    }

    public Map<Integer, Long> d(List<Integer> list) throws lif {
        return liq.b(e, list);
    }
}
