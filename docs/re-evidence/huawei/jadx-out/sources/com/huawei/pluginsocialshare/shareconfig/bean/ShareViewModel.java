package com.huawei.pluginsocialshare.shareconfig.bean;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.pluginsocialshare.view.BaseSharePreView;
import defpackage.pmw;
import defpackage.pnb;
import defpackage.pnd;
import java.util.Objects;

/* JADX INFO: loaded from: classes42.dex */
public class ShareViewModel extends ViewModel {
    private final MutableLiveData<pnd> e = new MutableLiveData<>();
    private final MutableLiveData<ShareDataInfo> d = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MutableLiveData<pmw> f22569c = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MutableLiveData<pnb> f22568b = new MutableLiveData<>();

    public MutableLiveData<pnd> c() {
        return this.e;
    }

    public void b(pnd pndVar) {
        this.e.postValue(pndVar);
    }

    public void e(ShareDataInfo shareDataInfo) {
        this.d.postValue(shareDataInfo);
    }

    public void b(pmw pmwVar) {
        this.f22569c.postValue(pmwVar);
    }

    public void b(pnb pnbVar) {
        this.f22568b.postValue(pnbVar);
    }

    public void a(LifecycleOwner lifecycleOwner, final BaseSharePreView baseSharePreView) {
        MutableLiveData<pnd> mutableLiveData = this.e;
        Objects.requireNonNull(baseSharePreView);
        mutableLiveData.observe(lifecycleOwner, new Observer() { // from class: com.huawei.pluginsocialshare.shareconfig.bean.ShareViewModel$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                baseSharePreView.refreshViewHeight((pnd) obj);
            }
        });
        MutableLiveData<pmw> mutableLiveData2 = this.f22569c;
        Objects.requireNonNull(baseSharePreView);
        mutableLiveData2.observe(lifecycleOwner, new Observer() { // from class: com.huawei.pluginsocialshare.shareconfig.bean.ShareViewModel$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                baseSharePreView.refreshData((pmw) obj);
            }
        });
        MutableLiveData<ShareDataInfo> mutableLiveData3 = this.d;
        Objects.requireNonNull(baseSharePreView);
        mutableLiveData3.observe(lifecycleOwner, new Observer() { // from class: com.huawei.pluginsocialshare.shareconfig.bean.ShareViewModel$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                baseSharePreView.refreshBackground((ShareDataInfo) obj);
            }
        });
        MutableLiveData<pnb> mutableLiveData4 = this.f22568b;
        Objects.requireNonNull(baseSharePreView);
        mutableLiveData4.observe(lifecycleOwner, new Observer() { // from class: com.huawei.pluginsocialshare.shareconfig.bean.ShareViewModel$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                baseSharePreView.refreshStickerConfig((pnb) obj);
            }
        });
    }
}
