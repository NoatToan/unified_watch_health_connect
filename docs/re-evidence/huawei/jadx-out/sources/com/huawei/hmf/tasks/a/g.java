package com.huawei.hmf.tasks.a;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.util.Log;
import com.huawei.hmf.tasks.ExecuteResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes33.dex */
public class g extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<Activity, WeakReference<g>> f12632b = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<WeakReference<ExecuteResult<?>>> f12633a = new ArrayList();

    public static void a(Activity activity, ExecuteResult executeResult) {
        g gVar;
        g gVar2;
        WeakReference<g> weakReference = f12632b.get(activity);
        if (weakReference == null || weakReference.get() == null) {
            FragmentManager fragmentManager = activity.getFragmentManager();
            g gVar3 = null;
            try {
                gVar = (g) fragmentManager.findFragmentByTag("com.huawei.hmf.tasks.lifecycle_fragment_tag");
                if (gVar == null) {
                    try {
                        g gVar4 = new g();
                        try {
                            fragmentManager.beginTransaction().add(gVar4, "com.huawei.hmf.tasks.lifecycle_fragment_tag").commitAllowingStateLoss();
                            gVar3 = gVar4;
                        } catch (Exception e) {
                            e = e;
                            gVar3 = gVar4;
                            try {
                                Log.e("LifecycleCallbackFrg", "create fragment failed." + e.getMessage());
                            } catch (ClassCastException e2) {
                                e = e2;
                                Log.e("LifecycleCallbackFrg", "found LifecycleCallbackFragment but the type do not match. " + e.getMessage());
                                gVar2 = gVar;
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } else {
                    gVar3 = gVar;
                }
                f12632b.put(activity, new WeakReference<>(gVar3));
                gVar2 = gVar3;
            } catch (ClassCastException e4) {
                e = e4;
                gVar = gVar3;
            }
        } else {
            gVar2 = weakReference.get();
        }
        if (gVar2 != null) {
            gVar2.a(executeResult);
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        synchronized (this.f12633a) {
            Iterator<WeakReference<ExecuteResult<?>>> it = this.f12633a.iterator();
            while (it.hasNext()) {
                ExecuteResult<?> executeResult = it.next().get();
                if (executeResult != null) {
                    executeResult.cancel();
                }
            }
            this.f12633a.clear();
        }
    }

    public final void a(ExecuteResult executeResult) {
        synchronized (this.f12633a) {
            this.f12633a.add(new WeakReference<>(executeResult));
        }
    }
}
