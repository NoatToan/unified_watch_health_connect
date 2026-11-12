package com.xiaomi.fitness.watch.face.viewmodel;

import android.graphics.Color;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel$reqEdit$1$binPath$1", f = "FaceHMInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FaceHMInfoViewModel$reqEdit$1$binPath$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ List<String> $bgPathList;
    final /* synthetic */ HuamiApiCaller $huamiApiCaller;
    final /* synthetic */ String $skinPath;
    final /* synthetic */ String $spiritColor;
    int label;
    final /* synthetic */ FaceHMInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceHMInfoViewModel$reqEdit$1$binPath$1(String str, List<String> list, HuamiApiCaller huamiApiCaller, String str2, FaceHMInfoViewModel faceHMInfoViewModel, Continuation<? super FaceHMInfoViewModel$reqEdit$1$binPath$1> continuation) {
        super(2, continuation);
        this.$spiritColor = str;
        this.$bgPathList = list;
        this.$huamiApiCaller = huamiApiCaller;
        this.$skinPath = str2;
        this.this$0 = faceHMInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceHMInfoViewModel$reqEdit$1$binPath$1(this.$spiritColor, this.$bgPathList, this.$huamiApiCaller, this.$skinPath, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.$spiritColor;
        if (str == null || str.length() == 0) {
            bArr = null;
        } else {
            int validColor = FaceManager.INSTANCE.getValidColor(this.$spiritColor);
            bArr = new byte[]{(byte) Color.alpha(validColor), (byte) Color.red(validColor), (byte) Color.green(validColor), (byte) Color.blue(validColor)};
        }
        List<String> arrayList = this.$bgPathList.isEmpty() ? new ArrayList<>() : this.$bgPathList;
        HuamiApiCaller huamiApiCaller = this.$huamiApiCaller;
        String skinPath = huamiApiCaller != null ? huamiApiCaller.getSkinPath(this.$skinPath, arrayList, bArr) : null;
        Logger.i(this.this$0.getTAG(), "getSkinPath: bgPath = " + arrayList + ";  colorByte = " + bArr + "   time = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return skinPath;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((FaceHMInfoViewModel$reqEdit$1$binPath$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
