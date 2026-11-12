package com.huawei.hms.maps;

import android.content.Context;
import com.huawei.hms.feature.dynamic.DeferredLifecycleHelper;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.internal.ICoordinateConverterDelegate;
import com.huawei.hms.maps.internal.ICreator;
import com.huawei.hms.maps.internal.IDistanceCalculatorDelegate;
import com.huawei.hms.maps.internal.IMapAuthToProvider;
import com.huawei.hms.maps.internal.IMapClientIdentity;
import com.huawei.hms.maps.internal.IMapFragmentDelegate;
import com.huawei.hms.maps.internal.IMapViewDelegate;
import com.huawei.hms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.huawei.hms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.huawei.hms.maps.utils.DynamicUtil;
import com.huawei.hms.maps.utils.LogM;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
abstract class maa extends DeferredLifecycleHelper {
    private Disposable g;
    private boolean f = false;
    private ICreator h = new BinderC0150maa();

    class mac implements Consumer {
        private mac() {
        }

        /* synthetic */ mac(maa maaVar, BinderC0150maa binderC0150maa) {
            this();
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(ICreator iCreator) {
            maa.this.b();
            if (iCreator == null || iCreator == maa.this.h) {
                maa.this.f = false;
                LogM.e("AbsDeferredLifecycleHelper", "getCreator: creator == null, createdFlag = false");
            } else {
                LogM.i("AbsDeferredLifecycleHelper", "realCreateDelegate: start");
                maa.this.a(iCreator);
            }
        }
    }

    class mad implements Consumer {
        private mad() {
        }

        /* synthetic */ mad(maa maaVar, BinderC0150maa binderC0150maa) {
            this();
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            maa.this.b();
            maa.this.f = false;
            LogM.e("AbsDeferredLifecycleHelper", "getCreator: throwable = " + th.getMessage() + "; createdFlag = " + maa.this.f);
        }
    }

    static class mae implements Function {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14188a;

        private mae() {
            this.f14188a = 0;
        }

        /* synthetic */ mae(BinderC0150maa binderC0150maa) {
            this();
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable apply(Observable observable) {
            return observable.flatMap(new C0151maa());
        }

        /* JADX INFO: renamed from: com.huawei.hms.maps.maa$mae$maa, reason: collision with other inner class name */
        class C0151maa implements Function {
            @Override // io.reactivex.rxjava3.functions.Function
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ObservableSource apply(Throwable th) {
                if (mae.b(mae.this) > 3) {
                    return Observable.error(th);
                }
                LogM.w("AbsDeferredLifecycleHelper", "get MapCreator failed, retry counter :" + mae.this.f14188a);
                return Observable.timer(500L, TimeUnit.MILLISECONDS);
            }

            C0151maa() {
            }
        }

        static /* synthetic */ int b(mae maeVar) {
            int i = maeVar.f14188a + 1;
            maeVar.f14188a = i;
            return i;
        }
    }

    protected abstract void a(ICreator iCreator);

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Disposable disposable = this.g;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.g.dispose();
        this.g = null;
        LogM.d("AbsDeferredLifecycleHelper", "getCreator: disposable");
    }

    protected void a(Context context) {
        if (DynamicUtil.isAndroidN()) {
            return;
        }
        LogM.i("AbsDeferredLifecycleHelper", "getCreator: createdFlag = " + this.f);
        if (this.f) {
            return;
        }
        this.f = true;
        b();
        BinderC0150maa binderC0150maa = null;
        this.g = Observable.fromCallable(new mab(context)).subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).retryWhen(new mae(binderC0150maa)).subscribe(new mac(this, binderC0150maa), new mad(this, binderC0150maa));
        LogM.i("AbsDeferredLifecycleHelper", "getCreator: execute");
    }

    class mab implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f14184a;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ICreator call() {
            ICreator iCreatorB = com.huawei.hms.maps.internal.mab.b(this.f14184a);
            return iCreatorB == null ? maa.this.h : iCreatorB;
        }

        mab(Context context) {
            this.f14184a = context;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.maps.maa$maa, reason: collision with other inner class name */
    class BinderC0150maa extends ICreator.Stub {
        @Override // com.huawei.hms.maps.internal.ICreator
        public void init(IObjectWrapper iObjectWrapper, int i) {
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public void initAppContext(IObjectWrapper iObjectWrapper) {
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public ICoordinateConverterDelegate newCoordinateConverterDelegate(IObjectWrapper iObjectWrapper) {
            return null;
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public IDistanceCalculatorDelegate newDistanceCalculatorDelegate(IObjectWrapper iObjectWrapper) {
            return null;
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public IMapAuthToProvider newMapAuthToProvider(IObjectWrapper iObjectWrapper) {
            return null;
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public IMapClientIdentity newMapClientIdentity(IObjectWrapper iObjectWrapper) {
            return null;
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public IMapFragmentDelegate newMapFragmentDelegate(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
            return null;
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public IMapViewDelegate newMapViewDelegate(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
            return null;
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public mak newPlaceDelegate(IObjectWrapper iObjectWrapper) {
            return null;
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public IStreetViewPanoramaFragmentDelegate newStreetViewPanoramaFragmentDelegate(IObjectWrapper iObjectWrapper) {
            return null;
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public IStreetViewPanoramaViewDelegate newStreetViewPanoramaViewDelegate(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            return null;
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public IMapFragmentDelegate newTextureMapFragmentDelegate(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
            return null;
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public IMapViewDelegate newTextureMapViewDelegate(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
            return null;
        }

        @Override // com.huawei.hms.maps.internal.ICreator
        public IStreetViewPanoramaFragmentDelegate optStreetViewPanoramaFragmentDelegate(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            return null;
        }

        BinderC0150maa() {
        }
    }

    maa() {
    }
}
