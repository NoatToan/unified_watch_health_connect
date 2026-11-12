package defpackage;

import android.content.res.Resources;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.contract.PrivacyActivityContract;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class wie implements PrivacyActivityContract.PrivacyActivityPresenter<PrivacyActivityContract.PrivacyActivityView> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<PrivacyActivityContract.PrivacyActivityView> f52078b;

    @Override // com.huawei.ui.main.stories.privacy.template.contract.PrivacyActivityContract.PrivacyActivityPresenter
    public void initPage(int i, String str, long j) {
        if (this.f52078b == null || a() == null) {
            return;
        }
        PrivacyActivityContract.PrivacyActivityView privacyActivityView = this.f52078b.get();
        Resources resources = a().getViewContext().getResources();
        if (i == 1) {
            a(resources, 1, j);
            privacyActivityView.showAllDataView();
        } else if (i == 2) {
            a(resources, 2, j);
            privacyActivityView.showSegmentDataView();
        } else {
            if (i != 3) {
                return;
            }
            a(resources, 3, j);
            privacyActivityView.showDoubleGroupDataView();
        }
    }

    private void a(Resources resources, int i, long j) {
        if (i == 1 || i == 3) {
            a().setTitle(resources.getString(R.string.IDS_privacy_all_record_data));
        } else {
            a().setTitle(String.format(Locale.ROOT, resources.getString(R.string.IDS_privacy_record_date), wig.j(j)));
        }
    }

    private PrivacyActivityContract.PrivacyActivityView a() {
        return this.f52078b.get();
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void attachView(PrivacyActivityContract.PrivacyActivityView privacyActivityView) {
        this.f52078b = new WeakReference<>(privacyActivityView);
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public boolean isViewAttached() {
        WeakReference<PrivacyActivityContract.PrivacyActivityView> weakReference = this.f52078b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public void detachView() {
        WeakReference<PrivacyActivityContract.PrivacyActivityView> weakReference = this.f52078b;
        if (weakReference != null) {
            weakReference.clear();
            this.f52078b = null;
        }
    }
}
