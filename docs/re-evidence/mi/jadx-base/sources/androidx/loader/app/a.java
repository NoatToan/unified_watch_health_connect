package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.collection.SparseArrayCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import defpackage.dvq;
import defpackage.rie;
import defpackage.sr5;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public class a extends LoaderManager {
    public static boolean c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f2587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f2588b;

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public static class C0043a<D> extends MutableLiveData<D> implements rie.b<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f2590b;
        public final rie<D> c;
        public LifecycleOwner d;
        public b<D> e;
        public rie<D> f;

        public C0043a(int i, Bundle bundle, rie<D> rieVar, rie<D> rieVar2) {
            this.f2589a = i;
            this.f2590b = bundle;
            this.c = rieVar;
            this.f = rieVar2;
            rieVar.registerListener(i, this);
        }

        @Override // rie.b
        public void a(rie<D> rieVar, D d) {
            if (a.c) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d);
            } else {
                boolean z = a.c;
                postValue(d);
            }
        }

        public rie<D> b(boolean z) {
            if (a.c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            this.c.cancelLoad();
            this.c.abandon();
            b<D> bVar = this.e;
            if (bVar != null) {
                removeObserver(bVar);
                if (z) {
                    bVar.c();
                }
            }
            this.c.unregisterListener(this);
            if ((bVar == null || bVar.b()) && !z) {
                return this.c;
            }
            this.c.reset();
            return this.f;
        }

        public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2589a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2590b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.c);
            this.c.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.e);
                this.e.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(d().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        public rie<D> d() {
            return this.c;
        }

        public void e() {
            LifecycleOwner lifecycleOwner = this.d;
            b<D> bVar = this.e;
            if (lifecycleOwner == null || bVar == null) {
                return;
            }
            super.removeObserver(bVar);
            observe(lifecycleOwner, bVar);
        }

        public rie<D> f(LifecycleOwner lifecycleOwner, LoaderManager.a<D> aVar) {
            b<D> bVar = new b<>(this.c, aVar);
            observe(lifecycleOwner, bVar);
            b<D> bVar2 = this.e;
            if (bVar2 != null) {
                removeObserver(bVar2);
            }
            this.d = lifecycleOwner;
            this.e = bVar;
            return this.c;
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            if (a.c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            this.c.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            if (a.c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            this.c.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(Observer<? super D> observer) {
            super.removeObserver(observer);
            this.d = null;
            this.e = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(D d) {
            super.setValue(d);
            rie<D> rieVar = this.f;
            if (rieVar != null) {
                rieVar.reset();
                this.f = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2589a);
            sb.append(" : ");
            sr5.a(this.c, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    public static class b<D> implements Observer<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rie<D> f2591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LoaderManager.a<D> f2592b;
        public boolean c = false;

        public b(rie<D> rieVar, LoaderManager.a<D> aVar) {
            this.f2591a = rieVar;
            this.f2592b = aVar;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }

        public boolean b() {
            return this.c;
        }

        public void c() {
            if (this.c) {
                if (a.c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f2591a);
                }
                this.f2592b.onLoaderReset(this.f2591a);
            }
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(D d) {
            if (a.c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f2591a);
                sb.append(": ");
                sb.append(this.f2591a.dataToString(d));
            }
            this.f2592b.onLoadFinished(this.f2591a, d);
            this.c = true;
        }

        public String toString() {
            return this.f2592b.toString();
        }
    }

    public static class c extends dvq {
        public static final ViewModelProvider.Factory c = new C0044a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArrayCompat<C0043a> f2593a = new SparseArrayCompat<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2594b = false;

        /* JADX INFO: renamed from: androidx.loader.app.a$c$a, reason: collision with other inner class name */
        public static class C0044a implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends dvq> T create(Class<T> cls) {
                return new c();
            }
        }

        public static c c(ViewModelStore viewModelStore) {
            return (c) new ViewModelProvider(viewModelStore, c).get(c.class);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2593a.size() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f2593a.size(); i++) {
                    C0043a c0043aValueAt = this.f2593a.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2593a.keyAt(i));
                    printWriter.print(": ");
                    printWriter.println(c0043aValueAt.toString());
                    c0043aValueAt.c(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void b() {
            this.f2594b = false;
        }

        public <D> C0043a<D> d(int i) {
            return this.f2593a.get(i);
        }

        public boolean e() {
            return this.f2594b;
        }

        public void f() {
            int size = this.f2593a.size();
            for (int i = 0; i < size; i++) {
                this.f2593a.valueAt(i).e();
            }
        }

        public void g(int i, C0043a c0043a) {
            this.f2593a.put(i, c0043a);
        }

        public void h() {
            this.f2594b = true;
        }

        @Override // defpackage.dvq
        public void onCleared() {
            super.onCleared();
            int size = this.f2593a.size();
            for (int i = 0; i < size; i++) {
                this.f2593a.valueAt(i).b(true);
            }
            this.f2593a.clear();
        }
    }

    public a(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f2587a = lifecycleOwner;
        this.f2588b = c.c(viewModelStore);
    }

    @Override // androidx.loader.app.LoaderManager
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2588b.a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> rie<D> c(int i, Bundle bundle, LoaderManager.a<D> aVar) {
        if (this.f2588b.e()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C0043a<D> c0043aD = this.f2588b.d(i);
        if (c) {
            StringBuilder sb = new StringBuilder();
            sb.append("initLoader in ");
            sb.append(this);
            sb.append(": args=");
            sb.append(bundle);
        }
        if (c0043aD == null) {
            return e(i, bundle, aVar, null);
        }
        if (c) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  Re-using existing loader ");
            sb2.append(c0043aD);
        }
        return c0043aD.f(this.f2587a, aVar);
    }

    @Override // androidx.loader.app.LoaderManager
    public void d() {
        this.f2588b.f();
    }

    public final <D> rie<D> e(int i, Bundle bundle, LoaderManager.a<D> aVar, rie<D> rieVar) {
        try {
            this.f2588b.h();
            rie<D> rieVarOnCreateLoader = aVar.onCreateLoader(i, bundle);
            if (rieVarOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (rieVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(rieVarOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + rieVarOnCreateLoader);
            }
            C0043a c0043a = new C0043a(i, bundle, rieVarOnCreateLoader, rieVar);
            if (c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Created new loader ");
                sb.append(c0043a);
            }
            this.f2588b.g(i, c0043a);
            this.f2588b.b();
            return c0043a.f(this.f2587a, aVar);
        } catch (Throwable th) {
            this.f2588b.b();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sr5.a(this.f2587a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
