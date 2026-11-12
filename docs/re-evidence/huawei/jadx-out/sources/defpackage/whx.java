package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.template.contract.PrivacyDetailFragmentContract;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDoubleGroupDataFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class whx extends wib {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f52068b = "DoubleGroupDataFragmentPresenter";

    @Override // defpackage.wib
    public void c(PageModelArgs pageModelArgs) {
        e(pageModelArgs);
    }

    private void e(PageModelArgs pageModelArgs) {
        if (pageModelArgs != null && pageModelArgs.getDataSource() == 3) {
            a(pageModelArgs);
        }
    }

    private void a(PageModelArgs pageModelArgs) {
        int pageType = pageModelArgs.getPageType();
        if (pageType != 107) {
            return;
        }
        long j = pageModelArgs.getLong("startTime");
        long jCurrentTimeMillis = pageModelArgs.getLong("endTime");
        if (j == Long.MIN_VALUE) {
            j = 0;
        }
        long j2 = j;
        if (jCurrentTimeMillis == Long.MIN_VALUE) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        vzo vzoVar = new vzo(j2, jCurrentTimeMillis, 0, "", "");
        vzoVar.c(3);
        vzoVar.a("Subpage", pageModelArgs.getInt("Subpage"));
        if (pageModelArgs.getInt("Subpage") == 3) {
            new wel(pageType).a(vzoVar, new a(this));
        } else {
            new wel(pageType).b(vzoVar, new d(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, List<whr> list) {
        PrivacyDetailFragmentContract.PrivacyFragmentView privacyFragmentViewD = d();
        if (privacyFragmentViewD instanceof PrivacyDoubleGroupDataFragment) {
            PrivacyDoubleGroupDataFragment privacyDoubleGroupDataFragment = (PrivacyDoubleGroupDataFragment) privacyFragmentViewD;
            if (!isViewAttached()) {
                LogUtil.a(f52068b, "notifyDoubleGroupDataChange isViewAttached false");
                return;
            }
            if (i != 0) {
                list = new ArrayList<>(10);
            }
            privacyDoubleGroupDataFragment.b(list);
        }
    }

    static class d implements DataSourceCallback<List<whr>> {
        WeakReference<whx> d;

        d(whx whxVar) {
            this.d = new WeakReference<>(whxVar);
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<whr> list) {
            whx whxVar;
            WeakReference<whx> weakReference = this.d;
            if (weakReference == null || (whxVar = weakReference.get()) == null) {
                return;
            }
            whxVar.c(i, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Map<Integer, List<whr>> map) {
        PrivacyDetailFragmentContract.PrivacyFragmentView privacyFragmentViewD = d();
        if (privacyFragmentViewD instanceof PrivacyDoubleGroupDataFragment) {
            PrivacyDoubleGroupDataFragment privacyDoubleGroupDataFragment = (PrivacyDoubleGroupDataFragment) privacyFragmentViewD;
            if (!isViewAttached()) {
                LogUtil.a(f52068b, "notifyCategoryDoubleGroupData isViewAttached false");
                return;
            }
            if (i != 0) {
                map = new HashMap<>(10);
            }
            privacyDoubleGroupDataFragment.c(map);
        }
    }

    static class a implements DataSourceCallback<Map<Integer, List<whr>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<whx> f52069a;

        a(whx whxVar) {
            this.f52069a = new WeakReference<>(whxVar);
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Map<Integer, List<whr>> map) {
            whx whxVar;
            WeakReference<whx> weakReference = this.f52069a;
            if (weakReference == null || (whxVar = weakReference.get()) == null) {
                return;
            }
            whxVar.a(i, map);
        }
    }
}
