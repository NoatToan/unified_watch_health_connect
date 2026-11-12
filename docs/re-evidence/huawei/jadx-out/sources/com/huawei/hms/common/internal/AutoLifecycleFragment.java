package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

/* JADX INFO: loaded from: classes10.dex */
public class AutoLifecycleFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<a> f13035a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13036b;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HuaweiApiClient f13037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final int f13038b;

        public a(int i, HuaweiApiClient huaweiApiClient) {
            this.f13037a = huaweiApiClient;
            this.f13038b = i;
        }

        public void a() {
            this.f13037a.disconnect();
        }
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
        Preconditions.checkMainThread("Must be called on the main thread");
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.getFragmentManager().findFragmentByTag("HmsAutoLifecycleFrag");
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (autoLifecycleFragment != null) {
                return autoLifecycleFragment;
            }
            AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
            fragmentManager.beginTransaction().add(autoLifecycleFragment2, "HmsAutoLifecycleFrag").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return autoLifecycleFragment2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag HmsAutoLifecycleFrag is not a AutoLifecycleFragment", e);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f13036b = true;
        for (int i = 0; i < this.f13035a.size(); i++) {
            this.f13035a.valueAt(i).f13037a.connect((Activity) null);
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f13036b = false;
        for (int i = 0; i < this.f13035a.size(); i++) {
            this.f13035a.valueAt(i).f13037a.disconnect();
        }
    }

    public void startAutoMange(int i, HuaweiApiClient huaweiApiClient) {
        Preconditions.checkNotNull(huaweiApiClient, "HuaweiApiClient instance cannot be null");
        Preconditions.checkState(this.f13035a.indexOfKey(i) < 0, "Already managing a HuaweiApiClient with this clientId: " + i);
        this.f13035a.put(i, new a(i, huaweiApiClient));
        if (this.f13036b) {
            huaweiApiClient.connect((Activity) null);
        }
    }

    public void stopAutoManage(int i) {
        a aVar = this.f13035a.get(i);
        this.f13035a.remove(i);
        if (aVar != null) {
            aVar.a();
        }
    }
}
