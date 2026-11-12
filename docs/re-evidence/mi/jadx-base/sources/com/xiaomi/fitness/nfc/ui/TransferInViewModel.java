package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.sesdk.ServiceProtocolData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.fitness.nfc.ui.TransferInViewModel;
import defpackage.bg4;
import defpackage.j5h;
import defpackage.na4;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.vqg;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/TransferInViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lkotlin/Function1;", "Lcom/miui/tsmclient/sesdk/ServiceProtocolData;", "callback", "loadServiceProtocolData", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TransferInViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadServiceProtocolData$lambda$0(CardWrapper cardWrapper, v4h emitter) throws IOException {
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        vqg.d("loadServiceProtocolData start");
        ServiceProtocolData serviceProtocolData = cardWrapper.mSeCard.getServiceProtocolData();
        if (serviceProtocolData == null) {
            emitter.onError(new NfcException("serviceProtocolData return null"));
        } else {
            emitter.onNext(serviceProtocolData);
            emitter.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadServiceProtocolData$lambda$1(Function1 callback, ServiceProtocolData serviceProtocolData) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNull(serviceProtocolData);
        callback.invoke2(serviceProtocolData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadServiceProtocolData$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadServiceProtocolData$lambda$3(Throwable th) {
        vqg.c("loadServiceProtocolData", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadServiceProtocolData$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void loadServiceProtocolData(@NotNull final CardWrapper cardWrapper, @NotNull final Function1<? super ServiceProtocolData, Unit> callback) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o4h o4hVarH = o4h.f(new j5h() { // from class: xwp
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws IOException {
                TransferInViewModel.loadServiceProtocolData$lambda$0(cardWrapper, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: ywp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransferInViewModel.loadServiceProtocolData$lambda$1(callback, (ServiceProtocolData) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: zwp
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                TransferInViewModel.loadServiceProtocolData$lambda$2(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: axp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TransferInViewModel.loadServiceProtocolData$lambda$3((Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarH.O(bg4Var, new bg4() { // from class: bxp
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                TransferInViewModel.loadServiceProtocolData$lambda$4(function2, obj);
            }
        }));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }
}
