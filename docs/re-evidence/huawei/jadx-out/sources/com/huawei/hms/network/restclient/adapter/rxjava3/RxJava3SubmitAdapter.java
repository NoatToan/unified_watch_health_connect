package com.huawei.hms.network.restclient.adapter.rxjava3;

import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.restclient.SubmitAdapter;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
final class RxJava3SubmitAdapter<R> extends SubmitAdapter<R, Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;

    @Nullable
    private final Scheduler scheduler;

    RxJava3SubmitAdapter(Type type, @Nullable Scheduler scheduler, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.responseType = type;
        this.scheduler = scheduler;
        this.isResult = z2;
        this.isBody = z3;
        this.isSingle = z5;
        this.isAsync = z;
        this.isFlowable = z4;
        this.isCompletable = z7;
        this.isMaybe = z6;
    }

    @Override // com.huawei.hms.network.restclient.SubmitAdapter
    public Type responseType() {
        return this.responseType;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    @Override // com.huawei.hms.network.restclient.SubmitAdapter
    /* JADX INFO: renamed from: adapt */
    public Object adapt2(Submit<R> submit) {
        Observable bodyObservable;
        Scheduler scheduler;
        Observable submitEnqueueObservable = this.isAsync ? new SubmitEnqueueObservable(submit) : new SubmitExecuteObservable(submit);
        if (this.isResult) {
            bodyObservable = new ResultObservable(submitEnqueueObservable);
        } else {
            if (this.isBody) {
                bodyObservable = new BodyObservable(submitEnqueueObservable);
            }
            scheduler = this.scheduler;
            if (scheduler != null) {
                submitEnqueueObservable = submitEnqueueObservable.subscribeOn(scheduler);
            }
            if (this.isFlowable) {
                return submitEnqueueObservable.toFlowable(BackpressureStrategy.LATEST);
            }
            if (this.isSingle) {
                return submitEnqueueObservable.singleOrError();
            }
            if (this.isMaybe) {
                return submitEnqueueObservable.singleElement();
            }
            if (this.isCompletable) {
                return submitEnqueueObservable.ignoreElements();
            }
            return RxJavaPlugins.onAssembly(submitEnqueueObservable);
        }
        submitEnqueueObservable = bodyObservable;
        scheduler = this.scheduler;
        if (scheduler != null) {
            submitEnqueueObservable = submitEnqueueObservable.subscribeOn(scheduler);
        }
        if (this.isFlowable) {
            return submitEnqueueObservable.toFlowable(BackpressureStrategy.LATEST);
        }
        if (this.isSingle) {
            return submitEnqueueObservable.singleOrError();
        }
        if (this.isMaybe) {
            return submitEnqueueObservable.singleElement();
        }
        if (this.isCompletable) {
            return submitEnqueueObservable.ignoreElements();
        }
        return RxJavaPlugins.onAssembly(submitEnqueueObservable);
    }
}
