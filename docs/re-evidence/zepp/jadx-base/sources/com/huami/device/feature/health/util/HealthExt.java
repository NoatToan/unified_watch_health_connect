package com.huami.device.feature.health.util;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.tools.log.HMLog;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\bJ\n\u0010\u000f\u001a\u00020\u000e*\u00020\rJ\n\u0010\u0010\u001a\u00020\u000e*\u00020\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lcom/huami/device/feature/health/util/HealthExt;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "tag", "default", "Lkotlin/Function0;", "run", "runCatchingAndElse", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lio/reactivex/Observable;", "Landroidx/lifecycle/LiveData;", "toLiveData", "Lcom/huami/device/feature/health/device/HealthDevice;", "", "isSupportAtrial", "isHrDetectMode", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class HealthExt {

    @NotNull
    public static final HealthExt INSTANCE = new HealthExt();

    private HealthExt() {
    }

    public final boolean isHrDetectMode(@NotNull HealthDevice healthDevice) {
        return (healthDevice.isHuamiOs() || healthDevice.isHealthDetect()) ? false : true;
    }

    public final boolean isSupportAtrial(@NotNull HealthDevice healthDevice) {
        return HealthFunc.ATRIAL.INSTANCE.isSupport();
    }

    public final /* synthetic */ <T> T runCatchingAndElse(String tag, T t, Function0<? extends T> run) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(run.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl == null) {
            return (T) objM3845constructorimpl;
        }
        HMLog.error(tag, "", thM3848exceptionOrNullimpl, new HealthExt$runCatchingAndElse$2$1(thM3848exceptionOrNullimpl));
        return t;
    }

    public final /* synthetic */ <T> LiveData<T> toLiveData(final Observable<T> observable) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Intrinsics.needClassReification();
        return new MutableLiveData<T>() { // from class: com.huami.device.feature.health.util.HealthExt.toLiveData.1
            @Override // androidx.p008lifecycle.LiveData
            public void onActive() {
                objectRef.element = (T) observable.observeOn(Schedulers.io()).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.huami.device.feature.health.util.HealthExt$toLiveData$1$onActive$1
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(T t) {
                        postValue(t);
                    }
                }, HealthExt$toLiveData$1$onActive$2.INSTANCE);
            }

            @Override // androidx.p008lifecycle.LiveData
            public void onInactive() {
                Disposable disposable = objectRef.element;
                if (disposable == null) {
                    return;
                }
                if (!(!disposable.isDisposed())) {
                    disposable = null;
                }
                if (disposable == null) {
                    return;
                }
                disposable.dispose();
            }
        };
    }
}
