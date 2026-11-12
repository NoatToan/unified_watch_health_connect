package defpackage;

import com.huawei.hwcommonmodel.accessibility.AbstractTouchNode;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lrn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<? extends AbstractTouchNode> f40727c;
    private final String e = "ChartTouchProvider";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<AbstractTouchNode> f40726a = new ArrayList();

    public lrn(Class<? extends AbstractTouchNode> cls) {
        this.f40727c = cls;
    }

    public int d() {
        return this.f40726a.size();
    }

    public int c(int i, int i2) {
        for (int i3 = 0; i3 < this.f40726a.size(); i3++) {
            if (this.f40726a.get(i3).getRect().contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    public AbstractTouchNode a(int i) {
        if (i >= this.f40726a.size()) {
            for (int size = this.f40726a.size(); size <= i; size++) {
                e();
            }
        }
        return this.f40726a.get(i);
    }

    public void b() {
        this.f40726a.clear();
    }

    private void e() {
        try {
            this.f40726a.add(this.f40727c.newInstance());
        } catch (IllegalAccessException | InstantiationException unused) {
            ReleaseLogUtil.a("ChartTouchProvider", "reflect error");
        }
    }
}
