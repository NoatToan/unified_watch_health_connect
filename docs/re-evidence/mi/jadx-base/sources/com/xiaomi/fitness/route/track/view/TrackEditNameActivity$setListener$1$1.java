package com.xiaomi.fitness.route.track.view;

import android.content.Intent;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.bus.LiveDataBus;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.route.export.track.UploadUserRoute;
import defpackage.x0j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.route.track.view.TrackEditNameActivity$setListener$1$1", f = "TrackEditNameActivity.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
public final class TrackEditNameActivity$setListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EditRouteBean $routeData;
    int label;
    final /* synthetic */ TrackEditNameActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackEditNameActivity$setListener$1$1(EditRouteBean editRouteBean, TrackEditNameActivity trackEditNameActivity, Continuation<? super TrackEditNameActivity$setListener$1$1> continuation) {
        super(2, continuation);
        this.$routeData = editRouteBean;
        this.this$0 = trackEditNameActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackEditNameActivity$setListener$1$1(this.$routeData, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$routeData.getValueMap().put("alias", String.valueOf(this.this$0.getEdit().getText()));
            CoroutineDispatcher io2 = Dispatchers.getIO();
            TrackEditNameActivity$setListener$1$1$uploadUserRoute$1 trackEditNameActivity$setListener$1$1$uploadUserRoute$1 = new TrackEditNameActivity$setListener$1$1$uploadUserRoute$1(this.this$0, this.$routeData, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, trackEditNameActivity$setListener$1$1$uploadUserRoute$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        UploadUserRoute uploadUserRoute = (UploadUserRoute) obj;
        this.this$0.dismissDialog();
        if (uploadUserRoute == null || !uploadUserRoute.getSuccess()) {
            ToastUtil.showShortToast(this.this$0.getString(x0j.o));
        } else {
            FitnessLogUtils.i(TrackEditNameActivity.TAG, "name:" + ((Object) this.this$0.getEdit().getText()));
            LiveDataBus.INSTANCE.get().with(TrackEditNameActivity.EDIT_NAME, String.class).postValue(String.valueOf(this.this$0.getEdit().getText()));
            ToastUtil.showShortToast(this.this$0.getString(x0j.p));
            Intent intent = new Intent();
            intent.putExtra("name", String.valueOf(this.this$0.getEdit().getText()));
            this.this$0.setResult(-1, intent);
            this.this$0.finish();
        }
        FitnessLogUtils.i(TrackEditNameActivity.TAG, "uploadUserRoute:" + uploadUserRoute);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackEditNameActivity$setListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
