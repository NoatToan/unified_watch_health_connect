package com.huami.wallet.accessdoor.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.viewmodel.BaseViewModel;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJQ\u0010\u000e\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00052'\u0010\r\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bJE\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\f0\bJ\b\u0010\u0013\u001a\u00020\fH\u0014R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/wallet/accessdoor/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "", "tag", "Lorg/reactivestreams/Publisher;", "Lcom/huami/wallet/accessdoor/helper/Resource;", "publisher", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "resource", "", "callback", "publisherToResource", "Ljava/util/concurrent/Callable;", "callable", "value", "addCallable", "onCleared", "", "Lio/reactivex/disposables/Disposable;", "a", "Ljava/util/Map;", "disposableMap", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public class BaseViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Disposable> disposableMap = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function1 function1, Resource resource) {
        function1.invoke(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Function1 function1, Throwable th) {
        function1.invoke(Resource.error("Unknown", th.getMessage(), null));
    }

    public final <T> void addCallable(@NotNull String tag, @NotNull Callable<T> callable, @NotNull final Function1<? super T, Unit> callback) throws Exception {
        if (tag.length() == 0) {
            throw new Exception("publisherToResource tag 为 null");
        }
        this.disposableMap.put(tag, Flowable.fromCallable(callable).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: xr
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseViewModel.e(callback, obj);
            }
        }));
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Iterator<Map.Entry<String, Disposable>> it2 = this.disposableMap.entrySet().iterator();
        while (it2.hasNext()) {
            Disposable value = it2.next().getValue();
            if (!value.isDisposed()) {
                value.dispose();
            }
        }
    }

    public final <T> void publisherToResource(@NotNull String tag, @NotNull Publisher<Resource<T>> publisher, @NotNull final Function1<? super Resource<T>, Unit> callback) throws Exception {
        if (tag.length() == 0) {
            throw new Exception("publisherToResource tag 为 null");
        }
        this.disposableMap.put(tag, Flowable.fromPublisher(publisher).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: vr
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseViewModel.f(callback, (Resource) obj);
            }
        }, new Consumer() { // from class: wr
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseViewModel.g(callback, (Throwable) obj);
            }
        }));
    }
}
