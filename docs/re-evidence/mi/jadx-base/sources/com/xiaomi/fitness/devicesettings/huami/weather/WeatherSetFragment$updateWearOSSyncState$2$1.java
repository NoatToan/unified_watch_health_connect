package com.xiaomi.fitness.devicesettings.huami.weather;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import defpackage.f9r;
import defpackage.wzi;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetFragment$updateWearOSSyncState$2$1", f = "WeatherSetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WeatherSetFragment$updateWearOSSyncState$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ f9r $weatherConfig;
    int label;
    final /* synthetic */ WeatherSetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeatherSetFragment$updateWearOSSyncState$2$1(WeatherSetFragment weatherSetFragment, f9r f9rVar, Continuation<? super WeatherSetFragment$updateWearOSSyncState$2$1> continuation) {
        super(2, continuation);
        this.this$0 = weatherSetFragment;
        this.$weatherConfig = f9rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WeatherSetFragment$updateWearOSSyncState$2$1(this.this$0, this.$weatherConfig, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f9r f9rVar;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!WeatherSetFragment.access$getMViewModel(this.this$0).getIsSupportConfig() || (f9rVar = this.$weatherConfig) == null) {
            RightArrowSingleLineTextView tempView = WeatherSetFragment.access$getMBinding(this.this$0).J;
            Intrinsics.checkNotNullExpressionValue(tempView, "tempView");
            ViewExtKt.gone(tempView);
            SwitchButtonTwoLineTextView alertsView = WeatherSetFragment.access$getMBinding(this.this$0).A;
            Intrinsics.checkNotNullExpressionValue(alertsView, "alertsView");
            ViewExtKt.gone(alertsView);
        } else {
            Logger.i(WeatherSetFragment.TAG, " BLE config unit = " + f9rVar.c + " alert = " + f9rVar.d);
            if (this.$weatherConfig.d == 0 || AppUtil.INSTANCE.isPlayChannel()) {
                SwitchButtonTwoLineTextView alertsView2 = WeatherSetFragment.access$getMBinding(this.this$0).A;
                Intrinsics.checkNotNullExpressionValue(alertsView2, "alertsView");
                ViewExtKt.gone(alertsView2);
            } else {
                SwitchButtonTwoLineTextView alertsView3 = WeatherSetFragment.access$getMBinding(this.this$0).A;
                Intrinsics.checkNotNullExpressionValue(alertsView3, "alertsView");
                ViewExtKt.visible(alertsView3);
                WeatherSetFragment.access$getMBinding(this.this$0).A.setSwitch(this.$weatherConfig.d == 1);
            }
            if (this.$weatherConfig.c == 0) {
                RightArrowSingleLineTextView tempView2 = WeatherSetFragment.access$getMBinding(this.this$0).J;
                Intrinsics.checkNotNullExpressionValue(tempView2, "tempView");
                ViewExtKt.gone(tempView2);
            } else {
                RightArrowSingleLineTextView tempView3 = WeatherSetFragment.access$getMBinding(this.this$0).J;
                Intrinsics.checkNotNullExpressionValue(tempView3, "tempView");
                ViewExtKt.visible(tempView3);
                this.this$0.mTempIndex = this.$weatherConfig.c - 1;
                RightArrowSingleLineTextView rightArrowSingleLineTextView = WeatherSetFragment.access$getMBinding(this.this$0).J;
                String string = null;
                if (this.this$0.mTempIndex == 1) {
                    FragmentActivity mActivity = this.this$0.getMActivity();
                    if (mActivity != null) {
                        string = mActivity.getString(wzi.O9);
                    }
                } else {
                    FragmentActivity mActivity2 = this.this$0.getMActivity();
                    if (mActivity2 != null) {
                        string = mActivity2.getString(wzi.P9);
                    }
                }
                rightArrowSingleLineTextView.setRemindText(string);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WeatherSetFragment$updateWearOSSyncState$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
