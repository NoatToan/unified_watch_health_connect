package com.huami.wallet.common.util;

import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.wallet.common.util.WalletRxBus;
import com.huami.watch.transport.httpsupport.model.DataItem;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006J\u0006\u0010\t\u001a\u00020\bR$\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00010\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/wallet/common/util/WalletRxBus;", "", "o", "", DataItem.HTTP_METHOD_POST, "postMainThread", "Lio/reactivex/Observable;", "toObservable", "", "hasObservers", "Lio/reactivex/subjects/Subject;", "kotlin.jvm.PlatformType", "a", "Lio/reactivex/subjects/Subject;", "subject", "<init>", "()V", "Companion", "common_release"}, k = 1, mv = {1, 5, 1})
public final class WalletRxBus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<WalletRxBus> b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) a.a);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Subject<Object> subject;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/wallet/common/util/WalletRxBus$Companion;", "", "Lcom/huami/wallet/common/util/WalletRxBus;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/huami/wallet/common/util/WalletRxBus;", DefaultSettingsSpiCall.n, "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), DefaultSettingsSpiCall.n, "getInstance()Lcom/huami/wallet/common/util/WalletRxBus;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WalletRxBus getInstance() {
            return (WalletRxBus) WalletRxBus.b.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/wallet/common/util/WalletRxBus;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<WalletRxBus> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WalletRxBus invoke() {
            return new WalletRxBus(null);
        }
    }

    private WalletRxBus() {
        this.subject = PublishSubject.create().toSerialized();
    }

    public /* synthetic */ WalletRxBus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(WalletRxBus walletRxBus, Object obj) {
        walletRxBus.subject.onNext(obj);
    }

    public final boolean hasObservers() {
        return this.subject.hasObservers();
    }

    public final void post(@NotNull Object o) {
        if (this.subject.hasObservers()) {
            this.subject.onNext(o);
        }
    }

    public final void postMainThread(@NotNull final Object o) {
        if (this.subject.hasObservers()) {
            AndroidSchedulers.mainThread().scheduleDirect(new Runnable() { // from class: he8
                @Override // java.lang.Runnable
                public final void run() {
                    WalletRxBus.b(this.a, o);
                }
            });
        }
    }

    @NotNull
    public final Observable<Object> toObservable() {
        return this.subject;
    }
}
