package com.xiaomi.fitness.nfc.di;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment;
import com.xiaomi.fitness.nfc.utils.PageUtilsKt;
import defpackage.yzd;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.di.NfcEventModule$toMasterCardListView$1$1", f = "NfcEventModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NfcEventModule$toMasterCardListView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $curActivity;
    final /* synthetic */ boolean $isCheck;
    final /* synthetic */ String $message;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcEventModule$toMasterCardListView$1$1(FragmentActivity fragmentActivity, boolean z, String str, Continuation<? super NfcEventModule$toMasterCardListView$1$1> continuation) {
        super(2, continuation);
        this.$curActivity = fragmentActivity;
        this.$isCheck = z;
        this.$message = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NfcEventModule$toMasterCardListView$1$1(this.$curActivity, this.$isCheck, this.$message, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FragmentActivity fragmentActivity;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        yzd.a aVar = this.$curActivity;
        if (aVar instanceof PageState) {
            ((PageState) aVar).dismissDialog();
        }
        if (this.$isCheck) {
            NfcPreference.INSTANCE.setCheckUserBind(true);
            PageUtilsKt.gotoPage$default(this.$curActivity, MasterCardListFragment.class, null, 4, null);
        } else {
            String str = this.$message;
            if (str != null && str.length() != 0 && (fragmentActivity = this.$curActivity) != null) {
                ToastExtKt.toastShort(fragmentActivity, this.$message);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NfcEventModule$toMasterCardListView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
