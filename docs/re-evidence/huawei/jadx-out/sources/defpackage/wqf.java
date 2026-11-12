package defpackage;

import com.huawei.ui.main.stories.template.BaseView;
import com.huawei.ui.main.stories.template.data.PageDataObserver;
import com.huawei.ui.main.stories.template.health.module.nodevice.HealthNoDeviceContract;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wqf implements HealthNoDeviceContract.Presenter, PageDataObserver {
    private WeakReference<BaseView> d;

    public HealthNoDeviceContract.View a() {
        WeakReference<BaseView> weakReference = this.d;
        if (weakReference == null) {
            return null;
        }
        BaseView baseView = weakReference.get();
        if (baseView instanceof HealthNoDeviceContract.View) {
            return (HealthNoDeviceContract.View) baseView;
        }
        return null;
    }

    @Override // com.huawei.ui.main.stories.template.health.module.nodevice.HealthNoDeviceContract.Presenter
    public void requestActivityInfo(int i) {
        wpq.a().d(i, this);
        wpp.a().c(i);
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public void attachView(BaseView baseView) {
        this.d = new WeakReference<>(baseView);
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public boolean isViewAttached() {
        WeakReference<BaseView> weakReference = this.d;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public void detachView() {
        WeakReference<BaseView> weakReference = this.d;
        if (weakReference != null) {
            weakReference.clear();
            this.d = null;
        }
        wpq.a().e(this);
    }

    @Override // com.huawei.ui.main.stories.template.data.PageDataObserver
    public void update(wpq wpqVar, List<dlo> list) {
        if (a() != null) {
            a().onResponsePageModule(list);
        }
    }
}
