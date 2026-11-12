package defpackage;

import com.huawei.ui.main.stories.privacy.template.contract.PrivacyDetailFragmentContract;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.component.BaseComponent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public class wib implements PrivacyDetailFragmentContract.PrivacyFragmentPresenter<PrivacyDetailFragmentContract.PrivacyFragmentView> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<PrivacyDetailFragmentContract.PrivacyFragmentView> f52076b;

    @Override // com.huawei.ui.main.stories.privacy.template.contract.PrivacyDetailFragmentContract.PrivacyFragmentPresenter
    public void addComponents(BaseComponent baseComponent) {
    }

    public void c(PageModelArgs pageModelArgs) {
    }

    public PrivacyDetailFragmentContract.PrivacyFragmentView d() {
        WeakReference<PrivacyDetailFragmentContract.PrivacyFragmentView> weakReference = this.f52076b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void attachView(PrivacyDetailFragmentContract.PrivacyFragmentView privacyFragmentView) {
        this.f52076b = new WeakReference<>(privacyFragmentView);
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public boolean isViewAttached() {
        WeakReference<PrivacyDetailFragmentContract.PrivacyFragmentView> weakReference = this.f52076b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public void detachView() {
        WeakReference<PrivacyDetailFragmentContract.PrivacyFragmentView> weakReference = this.f52076b;
        if (weakReference != null) {
            weakReference.clear();
            this.f52076b = null;
        }
    }
}
