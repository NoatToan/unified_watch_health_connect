package com.huawei.hwcommonmodel.utils;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class SimpleChain {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Emitter f17228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17229c;
    private volatile boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList<INext> f17227a = new LinkedList<>();
    private final AtomicBoolean d = new AtomicBoolean(false);

    public interface INext {
        void onNext(Emitter emitter, Object... objArr);
    }

    private SimpleChain(String str) {
        this.f17229c = "SimpleChain_" + str;
    }

    public static SimpleChain b(String str) {
        return new SimpleChain(str);
    }

    public SimpleChain e(INext iNext) {
        if (this.d.get()) {
            throw new IllegalStateException("SimpleChain isSubscribed, next");
        }
        this.f17227a.add(iNext);
        return this;
    }

    public void d(Emitter emitter, Object... objArr) {
        if (this.d.getAndSet(true)) {
            throw new IllegalStateException("SimpleChain isSubscribed, subscribe");
        }
        LogUtil.a(this.f17229c, "subscribe start");
        this.f17228b = emitter;
        a(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object... objArr) {
        if (this.e) {
            LogUtil.j(this.f17229c, "doNext isDisposed");
        } else if (this.f17227a.isEmpty()) {
            this.f17228b.onSuccess(objArr);
        } else {
            this.f17227a.removeFirst().onNext(new c(), objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (this.e) {
            LogUtil.j(this.f17229c, "doError isDisposed");
        } else {
            this.f17228b.onError(str);
        }
    }

    class c implements Emitter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f17230a = new AtomicBoolean(false);

        c() {
        }

        @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
        public void onSuccess(Object... objArr) {
            if (this.f17230a.getAndSet(true)) {
                LogUtil.j(SimpleChain.this.f17229c, "doNext isDone onSuccess");
            } else {
                SimpleChain.this.a(objArr);
            }
        }

        @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
        public void onError(String str) {
            if (this.f17230a.getAndSet(true)) {
                LogUtil.j(SimpleChain.this.f17229c, "doNext isDone onError");
            } else {
                SimpleChain.this.c(str);
            }
        }
    }

    public interface Emitter {
        void onSuccess(Object... objArr);

        default void onError(String str) {
            LogUtil.j("SimpleChain_Emitter", "onError: ", str);
        }
    }
}
