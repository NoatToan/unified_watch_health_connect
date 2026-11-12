package com.xiaomi.fitness.watch.face.viewmodel;

import android.os.Bundle;
import com.xiaomi.fitness.watch.face.base.CommonBaseViewModel;
import com.xiaomi.fitness.watch.face.viewmodel.BaseStateViewModel;
import defpackage.jz6;
import defpackage.na4;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u000b\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0005¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/BaseStateViewModel;", "Lcom/xiaomi/fitness/watch/face/base/CommonBaseViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "Ljz6;", "disposable", "", "addDisposable", "(Ljz6;)V", "onCleared", "()V", "Landroid/os/Bundle;", "savedInstanceState", "attach", "(Landroid/os/Bundle;)V", "Lna4;", "mDisposables$delegate", "Lkotlin/Lazy;", "getMDisposables", "()Lna4;", "mDisposables", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class BaseStateViewModel extends CommonBaseViewModel implements CoroutineScope {
    private final /* synthetic */ CoroutineScope $$delegate_0 = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: mDisposables$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDisposables = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ce2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseStateViewModel.mDisposables_delegate$lambda$0();
        }
    });

    private final na4 getMDisposables() {
        return (na4) this.mDisposables.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final na4 mDisposables_delegate$lambda$0() {
        return new na4();
    }

    public final void addDisposable(@NotNull jz6 disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        getMDisposables().a(disposable);
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // defpackage.dvq
    public void onCleared() {
        super.onCleared();
        getMDisposables().d();
        CoroutineScopeKt.cancel$default(this, null, 1, null);
    }
}
