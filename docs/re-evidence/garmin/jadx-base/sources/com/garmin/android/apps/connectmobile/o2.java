package com.garmin.android.apps.connectmobile;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.google.maps.android.BuildConfig;
import java.lang.ref.WeakReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/o2;", "Lcom/garmin/android/apps/connectmobile/n2;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o2 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39654a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<Bundle> f39655b = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<WeakReference<Bundle>> f39656c = new SparseArray<>();

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.n2
    public final void a(Intent intent, Bundle bundle) {
        intent.putExtra("GCM_extra_large_bundle", new l2(h(bundle), bundle));
    }

    @Override // com.garmin.android.apps.connectmobile.n2
    public final Bundle b(z1 z1Var) {
        return g(z1Var.getIntent());
    }

    @Override // com.garmin.android.apps.connectmobile.n2
    public final Bundle c(Fragment fragment) {
        Parcelable parcelable;
        fragment.getClass();
        Bundle arguments = fragment.getArguments();
        Bundle bundleJ = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("GCM_extra_large_bundle", l2.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("GCM_extra_large_bundle");
                if (!(parcelable2 instanceof l2)) {
                    parcelable2 = null;
                }
                parcelable = (l2) parcelable2;
            }
            l2 l2Var = (l2) parcelable;
            bundleJ = l2Var != null ? j(l2Var.f37137a) : null;
            if (bundleJ == null) {
                return arguments;
            }
        }
        return bundleJ;
    }

    @Override // com.garmin.android.apps.connectmobile.n2
    public final void d(Bundle bundle, Bundle bundle2) {
        bundle2.getClass();
        bundle.putParcelable("GCM_extra_large_bundle", new l2(h(bundle2), bundle2));
    }

    @Override // com.garmin.android.apps.connectmobile.n2
    public final Bundle e(Bundle bundle) {
        Parcelable parcelable;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundle.getParcelable("GCM_extra_large_bundle", l2.class);
        } else {
            Parcelable parcelable2 = bundle.getParcelable("GCM_extra_large_bundle");
            if (!(parcelable2 instanceof l2)) {
                parcelable2 = null;
            }
            parcelable = (l2) parcelable2;
        }
        l2 l2Var = (l2) parcelable;
        if (l2Var != null) {
            return j(l2Var.f37137a);
        }
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.n2
    public final void f(int i14, Bundle bundle) {
        bundle.getClass();
        if (i14 <= 0) {
            return;
        }
        SparseArray<WeakReference<Bundle>> sparseArray = this.f39656c;
        WeakReference<Bundle> weakReference = sparseArray.get(i14);
        Bundle bundle2 = weakReference != null ? weakReference.get() : null;
        SparseArray<Bundle> sparseArray2 = this.f39655b;
        if (bundle2 == null && sparseArray2.get(i14) == null) {
            String strF = v.e0.f(i14, "updateBundle: unknown id = ", " or bundle has been garbage collected");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.p(a2Var, "LargeBundleManagerImpl", strF);
            return;
        }
        sparseArray2.put(i14, bundle);
        sparseArray.put(i14, new WeakReference<>(bundle));
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.n(a2Var2, "LargeBundleManagerImpl", "updateBundle: id = " + i14);
    }

    @Override // com.garmin.android.apps.connectmobile.n2
    public final Bundle g(Intent intent) {
        Parcelable parcelable;
        Bundle bundleJ = null;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("GCM_extra_large_bundle", l2.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("GCM_extra_large_bundle");
                if (!(parcelableExtra instanceof l2)) {
                    parcelableExtra = null;
                }
                parcelable = (l2) parcelableExtra;
            }
            l2 l2Var = (l2) parcelable;
            bundleJ = l2Var != null ? j(l2Var.f37137a) : null;
            if (bundleJ != null) {
                intent.putExtras(bundleJ);
            }
            if (bundleJ == null) {
                return intent.getExtras();
            }
        }
        return bundleJ;
    }

    @Override // com.garmin.android.apps.connectmobile.n2
    public final int h(Bundle bundle) {
        bundle.getClass();
        int i14 = this.f39654a;
        this.f39654a = i14 + 1;
        this.f39655b.put(i14, bundle);
        this.f39656c.put(i14, new WeakReference<>(bundle));
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.n(a2Var, "LargeBundleManagerImpl", "putBundle: id = " + i14);
        return i14;
    }

    @Override // com.garmin.android.apps.connectmobile.n2
    public final void i() {
        SparseArray<Bundle> sparseArray = this.f39655b;
        if (sparseArray.size() > 0) {
            String strF = androidx.core.view.j.f(sparseArray.size(), " of large bundles may have leaked. Release them.");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.p(a2Var, "LargeBundleManagerImpl", strF);
            sparseArray.clear();
        }
        SparseArray<WeakReference<Bundle>> sparseArray2 = this.f39656c;
        int size = sparseArray2.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (sparseArray2.valueAt(size).get() == null) {
                sparseArray2.removeAt(size);
            }
        }
    }

    public final Bundle j(int i14) {
        String str;
        WeakReference<Bundle> weakReference = this.f39656c.get(i14);
        Bundle bundle = weakReference != null ? weakReference.get() : null;
        this.f39655b.remove(i14);
        if (bundle == null) {
            str = BuildConfig.TRAVIS;
        } else if (bundle.size() > 0) {
            str = "[" + bundle.size() + "] {" + ((Object) bundle.keySet().iterator().next()) + "=...}";
        } else {
            str = "[0] {}";
        }
        String strE = sn.a.e(i14, "getBundle: id = ", ", bundle = ", str);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.n(a2Var, "LargeBundleManagerImpl", strE);
        return bundle;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/o2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
