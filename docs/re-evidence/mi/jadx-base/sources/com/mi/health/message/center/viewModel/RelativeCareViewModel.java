package com.mi.health.message.center.viewModel;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.mi.health.message.center.entity.MessageData;
import com.mi.health.message.center.entity.RelativeExtraData;
import com.mi.health.message.center.net.MessageCenterRequest;
import com.mi.health.message.center.ui.paging.MessageCenterPagingSource;
import com.mi.health.message.center.viewModel.RelativeCareViewModel;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.relative.export.IRelativeCareAccessApi;
import com.xiaomi.fitness.relative.export.InvitationMsgModel;
import com.xiaomi.fitness.relative.export.RelativeCareAccessExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.export.SharedDataTypeMsgModel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00072\u0006\u0010\u000e\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00072\u0006\u0010\u000e\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mi/health/message/center/viewModel/RelativeCareViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "messageCenterRequest", "Lcom/mi/health/message/center/net/MessageCenterRequest;", "<init>", "(Lcom/mi/health/message/center/net/MessageCenterRequest;)V", "queryRelativeMessagePagingData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/mi/health/message/center/entity/MessageData;", "Lcom/mi/health/message/center/entity/RelativeExtraData;", "getGoToRefuseInvitationLiveData", "Lcom/xiaomi/fitness/relative/export/RelativeResult;", "", "msgModel", "Lcom/xiaomi/fitness/relative/export/InvitationMsgModel;", "getGoToRefuseAppliedSharedDataTypesLiveData", "Lcom/xiaomi/fitness/relative/export/SharedDataTypeMsgModel;", "getValidateAppliedSharedDataLiveData", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelativeCareViewModel extends AbsViewModel {

    @NotNull
    private final MessageCenterRequest messageCenterRequest;

    public RelativeCareViewModel(@NotNull MessageCenterRequest messageCenterRequest) {
        Intrinsics.checkNotNullParameter(messageCenterRequest, "messageCenterRequest");
        this.messageCenterRequest = messageCenterRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource queryRelativeMessagePagingData$lambda$0(RelativeCareViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new MessageCenterPagingSource(1, this$0.messageCenterRequest, RelativeExtraData.class);
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> getGoToRefuseAppliedSharedDataTypesLiveData(@NotNull SharedDataTypeMsgModel msgModel) {
        Intrinsics.checkNotNullParameter(msgModel, "msgModel");
        return RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE).goToRefuseAppliedSharedDataTypes(ApplicationExtKt.getApplication(), msgModel);
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> getGoToRefuseInvitationLiveData(@NotNull InvitationMsgModel msgModel) {
        Intrinsics.checkNotNullParameter(msgModel, "msgModel");
        return RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE).goToRefuseInvitation(ApplicationExtKt.getApplication(), msgModel);
    }

    @NotNull
    public final LiveData<RelativeResult<Boolean>> getValidateAppliedSharedDataLiveData(@NotNull SharedDataTypeMsgModel msgModel) {
        Intrinsics.checkNotNullParameter(msgModel, "msgModel");
        return RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE).validateAppliedSharedDataTypes(msgModel);
    }

    @NotNull
    public final LiveData<PagingData<MessageData<RelativeExtraData>>> queryRelativeMessagePagingData() {
        return FlowLiveDataConversions.asLiveData$default(CachedPagingDataKt.cachedIn(new Pager(new PagingConfig(30, 5, false, 0, 0, 0, 56, null), null, new Function0() { // from class: ggk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RelativeCareViewModel.queryRelativeMessagePagingData$lambda$0(this.f18962a);
            }
        }, 2, null).getFlow(), ViewModelKt.getViewModelScope(this)), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
