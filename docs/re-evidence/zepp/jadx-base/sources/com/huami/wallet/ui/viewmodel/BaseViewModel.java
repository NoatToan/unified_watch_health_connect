package com.huami.wallet.ui.viewmodel;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.viewmodel.BaseViewModel;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'JQ\u0010\u000e\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00052'\u0010\r\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bJ\b\u0010\u000f\u001a\u00020\fH\u0014J=\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u001d\u0010\u0011\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\b\u0010R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006("}, d2 = {"Lcom/huami/wallet/ui/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "", "tag", "Lorg/reactivestreams/Publisher;", "Lcom/huami/wallet/lib/entity/Resource;", "publisher", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "resource", "", "callback", "publisherToResource", "onCleared", "Lkotlin/ExtensionFunctionType;", NotificationCompat.CATEGORY_CALL, "setLoadingStatus", "", "Lio/reactivex/disposables/Disposable;", "a", "Ljava/util/Map;", "disposableMap", "", "b", "getMap", "()Ljava/util/Map;", SportAnalytics.ParamValue.MapButtonType.MAP, "Landroidx/lifecycle/MediatorLiveData;", "c", "Landroidx/lifecycle/MediatorLiveData;", "getLoadingDialogStatusLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "loadingDialogStatusLiveData", GoogleApiAvailabilityLight.a, "getErrorMsgLiveData", "errorMsgLiveData", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public class BaseViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Disposable> disposableMap = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Boolean> map = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> loadingDialogStatusLiveData = new MediatorLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<String> errorMsgLiveData = new MediatorLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, Resource resource) {
        function1.invoke(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Throwable th) {
        function1.invoke(Resource.error("Unknown", th.getMessage(), null));
    }

    @NotNull
    public final MediatorLiveData<String> getErrorMsgLiveData() {
        return this.errorMsgLiveData;
    }

    @NotNull
    public final MediatorLiveData<Boolean> getLoadingDialogStatusLiveData() {
        return this.loadingDialogStatusLiveData;
    }

    @NotNull
    public final Map<String, Boolean> getMap() {
        return this.map;
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
        this.disposableMap.put(tag, Flowable.fromPublisher(publisher).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: yr
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseViewModel.c(callback, (Resource) obj);
            }
        }, new Consumer() { // from class: zr
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseViewModel.e(callback, (Throwable) obj);
            }
        }));
    }

    public final <T> void setLoadingStatus(@NotNull Resource<T> resource, @NotNull String str, @NotNull Function1<? super Resource<T>, Unit> function1) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.status.ordinal()];
        boolean z = false;
        if (i == 1) {
            this.map.put(str, Boolean.TRUE);
        } else if (i != 2) {
            this.map.put(str, Boolean.FALSE);
            String str2 = resource.message;
            if (!(str2 == null || str2.length() == 0)) {
                this.errorMsgLiveData.setValue(resource.message);
            }
        } else {
            this.map.put(str, Boolean.FALSE);
        }
        function1.invoke(resource);
        Iterator<Map.Entry<String, Boolean>> it2 = this.map.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().booleanValue()) {
                z = true;
                break;
            }
        }
        this.loadingDialogStatusLiveData.setValue(Boolean.valueOf(z));
    }
}
