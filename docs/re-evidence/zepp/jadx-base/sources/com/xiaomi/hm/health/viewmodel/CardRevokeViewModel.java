package com.xiaomi.hm.health.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.arch.core.Fail;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.eid.ui.viewmodel.EidBaseViewModel;
import com.huami.nfc.base.PayResponse;
import com.huami.watch.companion.eid.EidDeviceUtil;
import com.xiaomi.hm.health.BraceletApp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/viewmodel/CardRevokeViewModel;", "Lcom/huami/eid/ui/viewmodel/EidBaseViewModel;", "", "revokeEidCard", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "Ljava/lang/Void;", "a", "Landroidx/lifecycle/MutableLiveData;", "getRevokeResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "revokeResultLiveData", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CardRevokeViewModel extends EidBaseViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<Void>> revokeResultLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "Ljava/lang/Void;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.viewmodel.CardRevokeViewModel$revokeEidCard$1", f = "CardRevokeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super State<? extends Void>>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Void>> continuation) {
            return invoke2((Continuation<? super State<Void>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Void>> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PayResponse<Void> payResponseRevoke = EidDeviceUtil.revoke(BraceletApp.getContext());
            if (payResponseRevoke.isSuccessful()) {
                return new Success(payResponseRevoke.getData());
            }
            return new Fail(new Throwable(payResponseRevoke.getCode() + AESEncryptionHelper.SEPARATOR + payResponseRevoke.getMessage()));
        }
    }

    @NotNull
    public final MutableLiveData<State<Void>> getRevokeResultLiveData() {
        return this.revokeResultLiveData;
    }

    public final void revokeEidCard() {
        startWithLoading(this.revokeResultLiveData, new a(null));
    }
}
