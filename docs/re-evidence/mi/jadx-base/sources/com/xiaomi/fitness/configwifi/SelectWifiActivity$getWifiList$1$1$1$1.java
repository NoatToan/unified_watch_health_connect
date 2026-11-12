package com.xiaomi.fitness.configwifi;

import android.view.View;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.gh4;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.configwifi.SelectWifiActivity$getWifiList$1$1$1$1", f = "SelectWifiActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SelectWifiActivity$getWifiList$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SelectWifiActivity this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.configwifi.SelectWifiActivity$getWifiList$1$1$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.configwifi.SelectWifiActivity$getWifiList$1$1$1$1$1", f = "SelectWifiActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SelectWifiActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SelectWifiActivity selectWifiActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = selectWifiActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean zD = gh4.d(this.this$0.wifiList);
            if (zD) {
                this.this$0.registerBroadcastReceiver();
            } else if (this.this$0.wifiList.size() == 1) {
                WifiInfo$ScanResultProxy wifiInfo$ScanResultProxy = (WifiInfo$ScanResultProxy) this.this$0.wifiList.get(0);
                zD = wifiInfo$ScanResultProxy != null && wifiInfo$ScanResultProxy.h();
            }
            View view = this.this$0.llList;
            if (view != null) {
                view.setVisibility(zD ? 8 : 0);
            }
            View view2 = this.this$0.llNothing;
            if (view2 != null) {
                view2.setVisibility(zD ? 0 : 8);
            }
            this.this$0.initSsidAdapter();
            this.this$0.dismissDialog();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectWifiActivity$getWifiList$1$1$1$1(SelectWifiActivity selectWifiActivity, Continuation<? super SelectWifiActivity$getWifiList$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = selectWifiActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectWifiActivity$getWifiList$1$1$1$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ConfigWifiLogExtKt.logi("getWifiList,getWifiListByMobileSystem isMain(): " + this.this$0.isMain());
        ArrayList<WifiInfo$ScanResultProxy> wifiListByMobileSystem = SelectWifiActivity.INSTANCE.getWifiListByMobileSystem(this.this$0);
        ConfigWifiLogExtKt.logi("SelectWifiActivity#getWifiList, getWifiListObservable success, scanResultProxies.size: " + gh4.a(wifiListByMobileSystem));
        this.this$0.wifiList = wifiListByMobileSystem;
        ScopeExtKt.scope(Dispatchers.getMain(), new AnonymousClass1(this.this$0, null));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectWifiActivity$getWifiList$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
