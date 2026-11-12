package com.xiaomi.fitness.sync.init;

import android.app.Activity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sync.WifiDataHandler;
import com.xiaomi.fitness.sync.export.SyncPreference;
import defpackage.gyo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sync.init.SyncComponent$initSync$1$1", f = "SyncComponent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SyncComponent$initSync$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SyncComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncComponent$initSync$1$1(SyncComponent syncComponent, Continuation<? super SyncComponent$initSync$1$1> continuation) {
        super(2, continuation);
        this.this$0 = syncComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SyncComponent$initSync$1$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gyo.a aVar;
        String str;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        SyncPreference syncPreference = SyncPreference.INSTANCE;
        long cached_wifi_save_time = syncPreference.getCACHED_WIFI_SAVE_TIME();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i(WifiDataHandler.REQ_WIFI_TAG, "app back to foreground, handle wifi time: " + cached_wifi_save_time + ", " + jCurrentTimeMillis);
        if (currentActivity != null && jCurrentTimeMillis - cached_wifi_save_time <= 300000 && (str = (aVar = (gyo.a) new Gson().fromJson(syncPreference.getCACHED_WIFI_INFO(), new TypeToken<gyo.a>() { // from class: com.xiaomi.fitness.sync.init.SyncComponent$initSync$1$1$basicInfo$1
        }.getType())).c) != null && str.length() != 0) {
            Logger.i(WifiDataHandler.REQ_WIFI_TAG, "app back to foreground, handle wifi dialog: " + aVar.c);
            WifiDataHandler wifiDataHandler = this.this$0.getWifiDataHandler();
            Intrinsics.checkNotNull(aVar);
            wifiDataHandler.handleWifiPacket(aVar);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SyncComponent$initSync$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
