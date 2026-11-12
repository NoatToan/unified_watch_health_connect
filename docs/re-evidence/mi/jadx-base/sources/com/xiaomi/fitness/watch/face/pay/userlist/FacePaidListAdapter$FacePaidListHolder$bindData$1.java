package com.xiaomi.fitness.watch.face.pay.userlist;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.widget.TextView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.export.MembershipHelperExtKt;
import com.xiaomi.fitness.membership.export.data.VipInfo;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListAdapter$FacePaidListHolder$bindData$1", f = "FacePaidListAdapter.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFacePaidListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePaidListAdapter.kt\ncom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListAdapter$FacePaidListHolder$bindData$1\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,111:1\n470#2:112\n*S KotlinDebug\n*F\n+ 1 FacePaidListAdapter.kt\ncom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListAdapter$FacePaidListHolder$bindData$1\n*L\n51#1:112\n*E\n"})
public final class FacePaidListAdapter$FacePaidListHolder$bindData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FaceData $faceData;
    int label;
    final /* synthetic */ FacePaidListAdapter.FacePaidListHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacePaidListAdapter$FacePaidListHolder$bindData$1(FaceData faceData, FacePaidListAdapter.FacePaidListHolder facePaidListHolder, Continuation<? super FacePaidListAdapter$FacePaidListHolder$bindData$1> continuation) {
        super(2, continuation);
        this.$faceData = faceData;
        this.this$0 = facePaidListHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FacePaidListAdapter$FacePaidListHolder$bindData$1(this.$faceData, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MembershipHelper membershipHelperExtKt = MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE);
            this.label = 1;
            obj = MembershipHelper.DefaultImpls.getVipInfo$default(membershipHelperExtKt, false, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        VipInfo vipInfo = (VipInfo) obj;
        if ((vipInfo == null || !vipInfo.getActive() || vipInfo == null || !vipInfo.getWatchface()) && this.$faceData.buyWithVip()) {
            this.this$0.binding.D.setImageTintList(ColorStateList.valueOf(Color.parseColor("#B3808080")));
            this.this$0.binding.D.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
            TextView invalidTag = this.this$0.binding.C;
            Intrinsics.checkNotNullExpressionValue(invalidTag, "invalidTag");
            ViewExtKt.visible(invalidTag);
        } else {
            this.this$0.binding.D.setImageTintList(null);
            this.this$0.binding.D.setImageTintMode(PorterDuff.Mode.CLEAR);
            TextView invalidTag2 = this.this$0.binding.C;
            Intrinsics.checkNotNullExpressionValue(invalidTag2, "invalidTag");
            ViewExtKt.invisible(invalidTag2);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FacePaidListAdapter$FacePaidListHolder$bindData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
