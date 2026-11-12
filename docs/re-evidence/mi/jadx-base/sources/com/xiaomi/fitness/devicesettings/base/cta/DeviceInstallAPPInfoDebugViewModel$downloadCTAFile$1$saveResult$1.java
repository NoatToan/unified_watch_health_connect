package com.xiaomi.fitness.devicesettings.base.cta;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.v69;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$downloadCTAFile$1$saveResult$1", f = "DeviceInstallAPPInfoDebugViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DeviceInstallAPPInfoDebugViewModel$downloadCTAFile$1$saveResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<v69> $ctaAppBehaviorList;
    int label;
    final /* synthetic */ DeviceInstallAPPInfoDebugViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInstallAPPInfoDebugViewModel$downloadCTAFile$1$saveResult$1(DeviceInstallAPPInfoDebugViewModel deviceInstallAPPInfoDebugViewModel, List<v69> list, Continuation<? super DeviceInstallAPPInfoDebugViewModel$downloadCTAFile$1$saveResult$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceInstallAPPInfoDebugViewModel;
        this.$ctaAppBehaviorList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceInstallAPPInfoDebugViewModel$downloadCTAFile$1$saveResult$1(this.this$0, this.$ctaAppBehaviorList, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        File file = new File(ApplicationExtKt.getApplication().getExternalFilesDir(null), "/fitness/csv/cta");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "cta_data_v" + TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Boxing.boxLong(System.currentTimeMillis())) + ".csv");
        if (file2.exists()) {
            file2.delete();
        }
        if (!this.this$0.writeCSV(file2, this.this$0.getEachColumnStr(null), false)) {
            return Unit.INSTANCE;
        }
        Iterator<v69> it = this.$ctaAppBehaviorList.iterator();
        while (it.hasNext()) {
            this.this$0.writeCSV(file2, this.this$0.getEachColumnStr(it.next()), true);
        }
        this.this$0.getDownloadSaveResult().postValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceInstallAPPInfoDebugViewModel$downloadCTAFile$1$saveResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
