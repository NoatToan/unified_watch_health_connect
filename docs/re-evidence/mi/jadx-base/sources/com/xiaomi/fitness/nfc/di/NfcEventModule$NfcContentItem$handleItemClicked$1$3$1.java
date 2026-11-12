package com.xiaomi.fitness.nfc.di;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.ui.BankCardSplashFragment;
import com.xiaomi.fitness.nfc.utils.PageUtilsKt;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.o0j;
import defpackage.yzd;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.di.NfcEventModule$NfcContentItem$handleItemClicked$1$3$1", f = "NfcEventModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NfcEventModule$NfcContentItem$handleItemClicked$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $curActivity;
    final /* synthetic */ int $pinStatus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcEventModule$NfcContentItem$handleItemClicked$1$3$1(int i, FragmentActivity fragmentActivity, Continuation<? super NfcEventModule$NfcContentItem$handleItemClicked$1$3$1> continuation) {
        super(2, continuation);
        this.$pinStatus = i;
        this.$curActivity = fragmentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NfcEventModule$NfcContentItem$handleItemClicked$1$3$1(this.$pinStatus, this.$curActivity, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        switch (this.$pinStatus) {
            case 1:
            case 5:
                NfcEventModule.INSTANCE.toMasterCardListView(this.$curActivity);
                break;
            case 2:
            case 3:
            case 6:
            case 7:
                yzd.a aVar = this.$curActivity;
                if (aVar instanceof PageState) {
                    ((PageState) aVar).dismissDialog();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("sIsMaster", true);
                bundle.putInt("PIN_STATUS", this.$pinStatus);
                PageUtilsKt.gotoPage(this.$curActivity, BankCardSplashFragment.class, bundle);
                break;
            case 4:
                yzd.a aVar2 = this.$curActivity;
                if (aVar2 instanceof PageState) {
                    ((PageState) aVar2).dismissDialog();
                }
                String string = AppUtil.getApp().getString(o0j.d7);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                int i = o0j.J;
                FragmentManager supportFragmentManager = this.$curActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                UtilsKt.showMsgDialog((80 & 1) != 0 ? null : null, string, i, supportFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: com.xiaomi.fitness.nfc.di.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return NfcEventModule$NfcContentItem$handleItemClicked$1$3$1.invokeSuspend$lambda$0((DialogInterface) obj2);
                    }
                }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
                break;
            default:
                yzd.a aVar3 = this.$curActivity;
                if (aVar3 instanceof PageState) {
                    ((PageState) aVar3).dismissDialog();
                }
                ToastUtil.showShortToast(o0j.common_hint_unkonwn_error);
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NfcEventModule$NfcContentItem$handleItemClicked$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
