package com.huami.watch.dataflow.sync;

import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.watch.dataflow.model.health.bean.AtrialFibrillationDataItem;
import com.huami.watch.util.Log;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006R7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/watch/dataflow/sync/AtriDbObserver;", "", "Lcom/huami/watch/dataflow/model/health/bean/AtrialFibrillationDataItem;", "data", "", "onNext", "Lio/reactivex/functions/Consumer;", "consumer", "Lio/reactivex/disposables/Disposable;", "safeObserve", "Lio/reactivex/ObservableEmitter;", "<set-?>", "a", "Lkotlin/properties/ReadWriteProperty;", "()Lio/reactivex/ObservableEmitter;", "b", "(Lio/reactivex/ObservableEmitter;)V", "mEmitter", "Lio/reactivex/Observable;", "Lio/reactivex/Observable;", "observer", "<init>", "()V", "Companion", "companionlib_release"}, k = 1, mv = {1, 4, 0})
public final class AtriDbObserver {
    private static final String d = "AtriDbObserver";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReadWriteProperty mEmitter = Delegates.INSTANCE.notNull();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Observable<AtrialFibrillationDataItem> observer = Observable.create(new a()).subscribeOn(Schedulers.io()).observeOn(Schedulers.io());
    public static final /* synthetic */ KProperty[] c = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(AtriDbObserver.class), "mEmitter", "getMEmitter()Lio/reactivex/ObservableEmitter;"))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtriDbObserver e = new AtriDbObserver();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/watch/dataflow/sync/AtriDbObserver$Companion;", "", "Lcom/huami/watch/dataflow/sync/AtriDbObserver;", DefaultSettingsSpiCall.n, "Lcom/huami/watch/dataflow/sync/AtriDbObserver;", "getInstance", "()Lcom/huami/watch/dataflow/sync/AtriDbObserver;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "companionlib_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final AtriDbObserver getInstance() {
            return AtriDbObserver.e;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/reactivex/ObservableEmitter;", "Lcom/huami/watch/dataflow/model/health/bean/AtrialFibrillationDataItem;", "emitter", "", "subscribe", "(Lio/reactivex/ObservableEmitter;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a<T> implements ObservableOnSubscribe<T> {
        public a() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public final void subscribe(@NotNull ObservableEmitter<AtrialFibrillationDataItem> observableEmitter) {
            AtriDbObserver.this.b(observableEmitter);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 4, 0})
    public static final class b<T> implements Consumer<Throwable> {
        public static final b a = new b();

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            Log.e(AtriDbObserver.d, th.getMessage(), th, new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c implements Action {
        public static final c a = new c();

        @Override // io.reactivex.functions.Action
        public final void run() {
        }
    }

    private AtriDbObserver() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ObservableEmitter<AtrialFibrillationDataItem> a() {
        return (ObservableEmitter) this.mEmitter.getValue(this, c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(ObservableEmitter<AtrialFibrillationDataItem> observableEmitter) {
        this.mEmitter.setValue(this, c[0], observableEmitter);
    }

    public final void onNext(@NotNull AtrialFibrillationDataItem data) {
        a().onNext(data);
    }

    @NotNull
    public final Disposable safeObserve(@NotNull Consumer<AtrialFibrillationDataItem> consumer) {
        return this.observer.subscribe(consumer, b.a, c.a);
    }
}
