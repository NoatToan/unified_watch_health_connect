package com.huawei.health.knit;

import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.popupview.PopViewList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AdvancedSportFragment extends BaseFragment {
    protected d mPopViewController = new d();

    public static class d {
        private PopViewList.PopViewClickListener e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f7209c = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<String> f7208a = new ArrayList<>();

        public final void e(boolean z) {
            this.f7209c = z;
        }

        public final boolean d() {
            return this.f7209c;
        }

        public final ArrayList<String> c() {
            return this.f7208a;
        }

        public final void b(ArrayList<String> arrayList) {
            this.f7208a.clear();
            this.f7208a.addAll(arrayList);
        }

        public final PopViewList.PopViewClickListener b() {
            return this.e;
        }

        public final void a(PopViewList.PopViewClickListener popViewClickListener) {
            this.e = popViewClickListener;
        }
    }

    public d getPopViewController() {
        return this.mPopViewController;
    }
}
