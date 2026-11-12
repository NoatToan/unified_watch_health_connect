package defpackage;

import com.huawei.ui.main.stories.template.BaseComponent;
import com.huawei.ui.main.stories.template.health.contract.DataDetailFragmentContract;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wpt implements DataDetailFragmentContract.DetailFragmentPresenter<DataDetailFragmentContract.DetailFragmentView> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected WeakReference<DataDetailFragmentContract.DetailFragmentView> f52330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<BaseComponent> f52331c;

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void attachView(DataDetailFragmentContract.DetailFragmentView detailFragmentView) {
        this.f52330b = new WeakReference<>(detailFragmentView);
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public boolean isViewAttached() {
        WeakReference<DataDetailFragmentContract.DetailFragmentView> weakReference = this.f52330b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public void detachView() {
        WeakReference<DataDetailFragmentContract.DetailFragmentView> weakReference = this.f52330b;
        if (weakReference != null) {
            weakReference.clear();
            this.f52330b = null;
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.contract.DataDetailFragmentContract.DetailFragmentPresenter
    public void setComponents(List<BaseComponent> list) {
        this.f52331c = list;
    }
}
