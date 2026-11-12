package com.xiaomi.fitness.watch.face.debug.designer;

import android.content.Intent;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import defpackage.im9;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerFragment$openFile$1$1", f = "FaceDesignerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FaceDesignerFragment$openFile$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $data;
    final /* synthetic */ WearableDeviceModel $device;
    final /* synthetic */ String $faceId;
    final /* synthetic */ Function2<String, File, Unit> $file;
    final /* synthetic */ String $filePath;
    int label;
    final /* synthetic */ FaceDesignerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaceDesignerFragment$openFile$1$1(String str, Intent intent, FaceDesignerFragment faceDesignerFragment, WearableDeviceModel wearableDeviceModel, String str2, Function2<? super String, ? super File, Unit> function2, Continuation<? super FaceDesignerFragment$openFile$1$1> continuation) {
        super(2, continuation);
        this.$filePath = str;
        this.$data = intent;
        this.this$0 = faceDesignerFragment;
        this.$device = wearableDeviceModel;
        this.$faceId = str2;
        this.$file = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Function2 function2, String str, String str2) {
        function2.invoke(str, DialFileUtils.INSTANCE.checkUnzipFiles(str2, false));
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceDesignerFragment$openFile$1$1(this.$filePath, this.$data, this.this$0, this.$device, this.$faceId, this.$file, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        im9.y(this.$filePath);
        im9.v(this.$filePath, this.$data.getData());
        FaceDesignerFragment faceDesignerFragment = this.this$0;
        String str = this.$filePath;
        String did = this.$device.getDid();
        final String str2 = this.$faceId;
        final Function2<String, File, Unit> function2 = this.$file;
        faceDesignerFragment.unzipFile(str, did, str2, new Function1() { // from class: com.xiaomi.fitness.watch.face.debug.designer.a
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return FaceDesignerFragment$openFile$1$1.invokeSuspend$lambda$0(function2, str2, (String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceDesignerFragment$openFile$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
