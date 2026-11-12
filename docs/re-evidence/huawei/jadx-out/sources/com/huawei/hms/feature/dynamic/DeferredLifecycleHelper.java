package com.huawei.hms.feature.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.feature.dynamic.LifecycleDelegate;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    public static final int STATUS_ONCREATED = 1;
    public static final int STATUS_ONCREATEVIEW = 2;
    public static final int STATUS_ONINFLATE = 0;
    public static final int STATUS_ONRESUME = 5;
    public static final int STATUS_ONSTART = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13117a = "DeferredLifecycleHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f13118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f13119c;
    private LinkedList<g> d;
    private OnDelegateCreatedListener<T> e = new a();

    public interface g {
        int a();

        void a(LifecycleDelegate lifecycleDelegate);
    }

    public abstract void createDelegate(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    public void onStop() {
        T t = this.f13118b;
        if (t != null) {
            t.onStop();
        } else {
            a(4);
        }
    }

    public void onStart() {
        a((Bundle) null, new e());
    }

    public void onSaveInstanceState(Bundle bundle) {
        T t = this.f13118b;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f13119c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void onResume() {
        a((Bundle) null, new f());
    }

    public void onPause() {
        T t = this.f13118b;
        if (t != null) {
            t.onPause();
        } else {
            a(5);
        }
    }

    public void onLowMemory() {
        T t = this.f13118b;
        if (t != null) {
            t.onLowMemory();
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        a(bundle2, new b(activity, bundle, bundle2));
    }

    public void onDestroyView() {
        T t = this.f13118b;
        if (t != null) {
            t.onDestroyView();
        } else {
            a(1);
        }
    }

    public void onDestroy() {
        T t = this.f13118b;
        if (t != null) {
            t.onDestroy();
        } else {
            a(0);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        a(bundle, new d(frameLayout, layoutInflater, viewGroup, bundle));
        return frameLayout;
    }

    public void onCreate(Bundle bundle) {
        a(bundle, new c(bundle));
    }

    public T getDelegate() {
        return this.f13118b;
    }

    private void a(Bundle bundle, g gVar) {
        T t = this.f13118b;
        if (t != null) {
            gVar.a(t);
            return;
        }
        if (this.d == null) {
            this.d = new LinkedList<>();
        }
        this.d.add(gVar);
        if (bundle != null) {
            Bundle bundle2 = this.f13119c;
            if (bundle2 == null) {
                Object objClone = bundle.clone();
                if (objClone != null && (objClone instanceof Bundle)) {
                    this.f13119c = (Bundle) objClone;
                }
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.e);
    }

    private void a(int i) {
        while (!this.d.isEmpty() && this.d.getLast().a() >= i) {
            this.d.removeLast();
        }
    }

    public class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f13121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f13122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f13123c;

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
            return 0;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(LifecycleDelegate lifecycleDelegate) {
            DeferredLifecycleHelper.this.f13118b.onInflate(this.f13121a, this.f13122b, this.f13123c);
        }

        public b(Activity activity, Bundle bundle, Bundle bundle2) {
            this.f13121a = activity;
            this.f13122b = bundle;
            this.f13123c = bundle2;
        }
    }

    public class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f13124a;

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
            return 1;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f13117a, "IDelegateLifeCycleCall onCreate:");
            lifecycleDelegate.onCreate(this.f13124a);
        }

        public c(Bundle bundle) {
            this.f13124a = bundle;
        }
    }

    public class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f13126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LayoutInflater f13127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f13128c;
        public final /* synthetic */ Bundle d;

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
            return 2;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(LifecycleDelegate lifecycleDelegate) {
            this.f13126a.removeAllViews();
            this.f13126a.addView(DeferredLifecycleHelper.this.f13118b.onCreateView(this.f13127b, this.f13128c, this.d));
        }

        public d(FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.f13126a = frameLayout;
            this.f13127b = layoutInflater;
            this.f13128c = viewGroup;
            this.d = bundle;
        }
    }

    public class e implements g {
        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
            return 4;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f13117a, "IDelegateLifeCycleCall onStart:");
            lifecycleDelegate.onStart();
        }

        public e() {
        }
    }

    public class f implements g {
        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public int a() {
            return 5;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper.g
        public void a(LifecycleDelegate lifecycleDelegate) {
            Log.d(DeferredLifecycleHelper.f13117a, "IDelegateLifeCycleCall onResume:");
            lifecycleDelegate.onResume();
        }

        public f() {
        }
    }

    public class a implements OnDelegateCreatedListener<T> {
        @Override // com.huawei.hms.feature.dynamic.OnDelegateCreatedListener
        public void onDelegateCreated(T t) {
            DeferredLifecycleHelper.this.f13118b = t;
            Iterator it = DeferredLifecycleHelper.this.d.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(DeferredLifecycleHelper.this.f13118b);
            }
            DeferredLifecycleHelper.this.d.clear();
            DeferredLifecycleHelper.this.f13119c = null;
        }

        public a() {
        }
    }
}
