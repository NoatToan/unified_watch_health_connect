package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback;
import com.huawei.ui.main.stories.privacy.datasourcemanager.bean.SourceInfo;
import com.huawei.ui.main.stories.privacy.template.contract.PrivacyDetailFragmentContract;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDayDataFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class whw extends wib {
    @Override // defpackage.wib
    public void c(PageModelArgs pageModelArgs) {
        int dataSource = pageModelArgs.getDataSource();
        if (dataSource == 1) {
            d(pageModelArgs);
        } else if (dataSource == 2) {
            a(pageModelArgs.getTimestamp());
        } else {
            if (dataSource != 3) {
                return;
            }
            e(pageModelArgs);
        }
    }

    private void e(PageModelArgs pageModelArgs) {
        long jD;
        long jB;
        int pageType = pageModelArgs.getPageType();
        SourceInfo sourceInfo = pageModelArgs.getSourceInfo();
        if (pageType == 103) {
            jD = wgr.c(pageModelArgs.getTimestamp());
        } else {
            jD = wgr.d(pageModelArgs.getTimestamp());
        }
        long j = jD;
        if (pageType == 103) {
            jB = wgr.a(pageModelArgs.getTimestamp());
        } else {
            jB = wgr.b(pageModelArgs.getTimestamp());
        }
        long j2 = jB;
        int iD = sourceInfo == null ? 0 : wig.d(sourceInfo.getSourceType());
        String packageName = "";
        String deviceUniqueCode = sourceInfo == null ? "" : sourceInfo.getDeviceUniqueCode();
        if (sourceInfo != null) {
            packageName = sourceInfo.getPackageName();
        }
        vzo vzoVar = new vzo(j, j2, iD, deviceUniqueCode, packageName);
        vzoVar.a("categoryType", pageModelArgs.getInt("categoryType"));
        vzoVar.b(wig.b(pageModelArgs));
        new wel(pageModelArgs.getPageType()).e(vzoVar, new c(this));
    }

    private void d(PageModelArgs pageModelArgs) {
        if (pageModelArgs.getPageType() == 103) {
            new wel(pageModelArgs.getPageType()).e(new vzo(wgr.c(pageModelArgs.getTimestamp()), wgr.a(pageModelArgs.getTimestamp()), pageModelArgs.getClassType(), pageModelArgs.getUuid(), pageModelArgs.getPackageName()), new c(this));
        } else {
            new wel(pageModelArgs.getPageType()).e(pageModelArgs.getClassType(), pageModelArgs.getTimestamp(), pageModelArgs.getUuid(), pageModelArgs.getPackageName(), new c(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, List<PrivacyDataModel> list) {
        PrivacyDetailFragmentContract.PrivacyFragmentView privacyFragmentViewD = d();
        if (privacyFragmentViewD instanceof PrivacyDayDataFragment) {
            PrivacyDayDataFragment privacyDayDataFragment = (PrivacyDayDataFragment) privacyFragmentViewD;
            if (!isViewAttached()) {
                LogUtil.a("DayDataFragmentPresenter", "notifyDayDataChange isViewAttached false");
            } else {
                privacyDayDataFragment.a(i, list);
            }
        }
    }

    private void a(long j) {
        List<PrivacyDataModel> listD = whj.a().d(wig.j(j));
        PrivacyDetailFragmentContract.PrivacyFragmentView privacyFragmentViewD = d();
        if (privacyFragmentViewD instanceof PrivacyDayDataFragment) {
            PrivacyDayDataFragment privacyDayDataFragment = (PrivacyDayDataFragment) privacyFragmentViewD;
            if (njy.e(listD)) {
                LogUtil.a("DayDataFragmentPresenter", "getDayDataFromKit has no data");
                privacyDayDataFragment.a(0, new ArrayList());
            } else {
                privacyDayDataFragment.a(0, listD);
            }
        }
    }

    static class c implements DataSourceCallback<List<PrivacyDataModel>> {
        WeakReference<whw> e;

        c(whw whwVar) {
            this.e = new WeakReference<>(whwVar);
        }

        @Override // com.huawei.ui.main.stories.privacy.datasourcemanager.DataSourceCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<PrivacyDataModel> list) {
            whw whwVar;
            WeakReference<whw> weakReference = this.e;
            if (weakReference == null || (whwVar = weakReference.get()) == null) {
                return;
            }
            whwVar.c(i, list);
        }
    }
}
