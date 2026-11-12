package com.xiaomi.fitness.homepage;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.util.HealthHelper;
import defpackage.c0j;
import defpackage.stb;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.homepage.HealthV2Fragment$mDataChangedReceiver$1$onReceive$1", f = "HealthV2Fragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HealthV2Fragment$mDataChangedReceiver$1$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $intent;
    int label;
    final /* synthetic */ HealthV2Fragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthV2Fragment$mDataChangedReceiver$1$onReceive$1(Intent intent, HealthV2Fragment healthV2Fragment, Continuation<? super HealthV2Fragment$mDataChangedReceiver$1$onReceive$1> continuation) {
        super(2, continuation);
        this.$intent = intent;
        this.this$0 = healthV2Fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HealthV2Fragment$mDataChangedReceiver$1$onReceive$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Intent intent = this.$intent;
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 1484986885) {
                if (iHashCode == 2086687690 && action.equals(FitnessDataConstants.ACTION_DATA_LIST_CHANGED_BROADCAST)) {
                    FitnessLogUtils.i(HealthV2Fragment.TAG, "onReceive: data list changed broadcast");
                    this.this$0.initDataItemCard(this.$intent.getIntegerArrayListExtra(FitnessDataConstants.EXTRA_DISPLAY_DATA_LIST));
                }
            } else if (action.equals("recent_data_changed_broadcast")) {
                if (this.this$0.isInvalid()) {
                    return Unit.INSTANCE;
                }
                String stringExtra = this.$intent.getStringExtra(FitnessDataConstants.EXTRA_DATA_CHANGED_REASON);
                int intExtra = this.$intent.getIntExtra("error_code", -1);
                boolean booleanExtra = this.$intent.getBooleanExtra(FitnessDataConstants.EXTRA_BOOLEAN_RESULT, true);
                boolean booleanExtra2 = this.$intent.getBooleanExtra(FitnessDataConstants.EXTRA_IS_FIRST_CLOUD_SYNC, false);
                if (booleanExtra && booleanExtra2) {
                    FitnessLogUtils.i(HealthV2Fragment.TAG, "isFirstCloudSync success");
                    HealthV2Fragment.initDataItemCard$default(this.this$0, null, 1, null);
                }
                if (!booleanExtra && this.this$0.mTrigger != null) {
                    stb stbVar = this.this$0.mTrigger;
                    Intrinsics.checkNotNull(stbVar);
                    if (stbVar.Z()) {
                        if (intExtra == 3) {
                            HealthHelper.Companion companion = HealthHelper.INSTANCE;
                            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                            HealthHelper singleHolder = companion.getInstance(fragmentActivityRequireActivity);
                            FragmentActivity fragmentActivityRequireActivity2 = this.this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                            singleHolder.showSyncSwitchOpenDialog(fragmentActivityRequireActivity2);
                        } else if (intExtra == 4) {
                            FragmentActivity fragmentActivityRequireActivity3 = this.this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "requireActivity(...)");
                            String string = this.this$0.getString(c0j.Z8);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            ToastExtKt.toastShort(fragmentActivityRequireActivity3, string);
                        } else if (intExtra != 5) {
                            FragmentActivity fragmentActivityRequireActivity4 = this.this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity4, "requireActivity(...)");
                            String string2 = this.this$0.getString(c0j.Y8);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            ToastExtKt.toastShort(fragmentActivityRequireActivity4, string2);
                        } else {
                            HealthHelper.Companion companion2 = HealthHelper.INSTANCE;
                            FragmentActivity fragmentActivityRequireActivity5 = this.this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity5, "requireActivity(...)");
                            HealthHelper singleHolder2 = companion2.getInstance(fragmentActivityRequireActivity5);
                            FragmentActivity fragmentActivityRequireActivity6 = this.this$0.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity6, "requireActivity(...)");
                            singleHolder2.showLoginConfirmDialog(fragmentActivityRequireActivity6);
                        }
                    }
                }
                FitnessLogUtils.i(HealthV2Fragment.TAG, "onReceive: data changed reason = " + stringExtra + ", code = " + intExtra);
                this.this$0.refreshPage();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HealthV2Fragment$mDataChangedReceiver$1$onReceive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
