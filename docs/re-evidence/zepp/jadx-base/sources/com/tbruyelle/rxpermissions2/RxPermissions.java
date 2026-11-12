package com.tbruyelle.rxpermissions2;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class RxPermissions {
    public static final String b = "RxPermissions";
    public static final Object c = new Object();
    public RxPermissionsFragment a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements ObservableTransformer<T, Boolean> {
        public final /* synthetic */ String[] a;

        /* JADX INFO: renamed from: com.tbruyelle.rxpermissions2.RxPermissions$a$a, reason: collision with other inner class name */
        public class C0748a implements Function<List<Permission>, ObservableSource<Boolean>> {
            public C0748a() {
            }

            @Override // io.reactivex.functions.Function
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ObservableSource<Boolean> apply(List<Permission> list) throws Exception {
                if (list.isEmpty()) {
                    return Observable.empty();
                }
                Iterator<Permission> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().granted) {
                        return Observable.just(Boolean.FALSE);
                    }
                }
                return Observable.just(Boolean.TRUE);
            }
        }

        public a(String[] strArr) {
            this.a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource<Boolean> apply(Observable<T> observable) {
            return RxPermissions.this.i(observable, this.a).buffer(this.a.length).flatMap(new C0748a());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements ObservableTransformer<T, Permission> {
        public final /* synthetic */ String[] a;

        public b(String[] strArr) {
            this.a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource<Permission> apply(Observable<T> observable) {
            return RxPermissions.this.i(observable, this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class c<T> implements ObservableTransformer<T, Permission> {
        public final /* synthetic */ String[] a;

        public class a implements Function<List<Permission>, ObservableSource<Permission>> {
            public a() {
            }

            @Override // io.reactivex.functions.Function
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ObservableSource<Permission> apply(List<Permission> list) throws Exception {
                return list.isEmpty() ? Observable.empty() : Observable.just(new Permission(list));
            }
        }

        public c(String[] strArr) {
            this.a = strArr;
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource<Permission> apply(Observable<T> observable) {
            return RxPermissions.this.i(observable, this.a).buffer(this.a.length).flatMap(new a());
        }
    }

    public class d implements Function<Object, Observable<Permission>> {
        public final /* synthetic */ String[] a;

        public d(String[] strArr) {
            this.a = strArr;
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<Permission> apply(Object obj) throws Exception {
            return RxPermissions.this.j(this.a);
        }
    }

    public RxPermissions(@NonNull Activity activity) {
        this.a = d(activity);
    }

    private RxPermissionsFragment c(Activity activity) {
        return (RxPermissionsFragment) activity.getFragmentManager().findFragmentByTag(b);
    }

    private RxPermissionsFragment d(Activity activity) {
        RxPermissionsFragment rxPermissionsFragmentC = c(activity);
        if (!(rxPermissionsFragmentC == null)) {
            return rxPermissionsFragmentC;
        }
        RxPermissionsFragment rxPermissionsFragment = new RxPermissionsFragment();
        FragmentManager fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction().add(rxPermissionsFragment, b).commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        return rxPermissionsFragment;
    }

    private Observable<?> g(Observable<?> observable, Observable<?> observable2) {
        return observable == null ? Observable.just(c) : Observable.merge(observable, observable2);
    }

    private Observable<?> h(String... strArr) {
        for (String str : strArr) {
            if (!this.a.containsByPermission(str)) {
                return Observable.empty();
            }
        }
        return Observable.just(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable<Permission> i(Observable<?> observable, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        return g(observable, h(strArr)).flatMap(new d(strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(23)
    public Observable<Permission> j(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.a.c("Requesting permission " + str);
            if (isGranted(str)) {
                arrayList.add(Observable.just(new Permission(str, true, false)));
            } else if (isRevoked(str)) {
                arrayList.add(Observable.just(new Permission(str, false, false)));
            } else {
                PublishSubject<Permission> subjectByPermission = this.a.getSubjectByPermission(str);
                if (subjectByPermission == null) {
                    arrayList2.add(str);
                    subjectByPermission = PublishSubject.create();
                    this.a.setSubjectForPermission(str, subjectByPermission);
                }
                arrayList.add(subjectByPermission);
            }
        }
        if (!arrayList2.isEmpty()) {
            k((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return Observable.concat(Observable.fromIterable(arrayList));
    }

    @TargetApi(23)
    private boolean l(Activity activity, String... strArr) {
        for (String str : strArr) {
            if (!isGranted(str) && !activity.shouldShowRequestPermissionRationale(str)) {
                return false;
            }
        }
        return true;
    }

    public boolean e() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public <T> ObservableTransformer<T, Boolean> ensure(String... strArr) {
        return new a(strArr);
    }

    public <T> ObservableTransformer<T, Permission> ensureEach(String... strArr) {
        return new b(strArr);
    }

    public <T> ObservableTransformer<T, Permission> ensureEachCombined(String... strArr) {
        return new c(strArr);
    }

    public void f(String[] strArr, int[] iArr) {
        this.a.d(strArr, iArr, new boolean[strArr.length]);
    }

    public boolean isGranted(String str) {
        return !e() || this.a.a(str);
    }

    public boolean isRevoked(String str) {
        return e() && this.a.b(str);
    }

    @TargetApi(23)
    public void k(String[] strArr) {
        this.a.c("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.a.e(strArr);
    }

    public Observable<Boolean> request(String... strArr) {
        return Observable.just(c).compose(ensure(strArr));
    }

    public Observable<Permission> requestEach(String... strArr) {
        return Observable.just(c).compose(ensureEach(strArr));
    }

    public Observable<Permission> requestEachCombined(String... strArr) {
        return Observable.just(c).compose(ensureEachCombined(strArr));
    }

    public void setLogging(boolean z) {
        this.a.setLogging(z);
    }

    public Observable<Boolean> shouldShowRequestPermissionRationale(Activity activity, String... strArr) {
        return !e() ? Observable.just(Boolean.FALSE) : Observable.just(Boolean.valueOf(l(activity, strArr)));
    }
}
