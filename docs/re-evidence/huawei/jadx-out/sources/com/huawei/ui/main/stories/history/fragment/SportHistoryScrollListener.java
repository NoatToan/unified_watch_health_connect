package com.huawei.ui.main.stories.history.fragment;

import android.widget.AbsListView;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import defpackage.vqu;
import defpackage.vrb;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class SportHistoryScrollListener implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SportScrollCallback f28332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28333c;
    private final List<vqu> e;

    public interface SportScrollCallback {
        void onResponse(long j, boolean z);

        void onScroll(int i);
    }

    public SportHistoryScrollListener(SportScrollCallback sportScrollCallback, List<vqu> list) {
        this.f28332b = sportScrollCallback;
        this.e = list;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            long jD = d();
            LogUtil.a("Track_SportHistoryScrollListener", "SCROLL_STATE_TOUCH loadTime", Long.valueOf(jD));
            if (jD != 0 && this.f28333c != jD) {
                this.f28333c = jD;
                this.f28332b.onResponse(jD, true);
            } else {
                this.f28332b.onResponse(0L, false);
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f28332b.onScroll(i);
    }

    private long d() {
        if (njy.e(this.e)) {
            LogUtil.j("Track_SportHistoryScrollListener", "isCheckLoadMore mGroupData is empty.");
            return 0L;
        }
        for (int i = 0; i < this.e.size(); i++) {
            vqu vquVar = this.e.get(i);
            if (vquVar != null && vquVar.n()) {
                vrb vrbVarD = vquVar.d(vquVar.b() - 1);
                if (vrbVarD == null) {
                    return 0L;
                }
                return vrbVarD.w();
            }
        }
        return 0L;
    }

    public void e(long j) {
        this.f28333c = j;
    }
}
