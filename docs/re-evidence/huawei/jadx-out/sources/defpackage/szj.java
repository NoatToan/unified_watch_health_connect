package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.runcard.trackfragments.visibleutils.OnFragmentVisibilityChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class szj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final szj f48830b = new szj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48831a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<OnFragmentVisibilityChange> f48832c = new ArrayList(10);

    private szj() {
    }

    public static szj b() {
        return f48830b;
    }

    public void e() {
        if (this.f48831a != 0) {
            LogUtil.a("Track_FVCUtils", "The Utils is working,failed");
            return;
        }
        this.f48831a = 1;
        if (this.f48832c.size() != 0) {
            this.f48832c.clear();
        }
    }

    public void d() {
        this.f48831a = 0;
        this.f48832c.clear();
    }

    public void d(int i) {
        Iterator<OnFragmentVisibilityChange> it = this.f48832c.iterator();
        while (it.hasNext()) {
            it.next().onChange(i);
        }
    }
}
