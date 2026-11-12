package com.mi.health.message.center.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.mi.health.message.center.entity.AbnormalData;
import com.mi.health.message.center.entity.MessageData;
import com.mi.health.message.center.entity.RelativeExtraData;
import com.mi.health.message.center.ui.RelativeCareMessageFragment;
import com.mi.health.message.center.ui.adapter.RelativeCardMessageCenterAdapter;
import com.mi.health.message.center.util.MessageCenterExtKt;
import com.mi.health.message.center.util.SynDialogHelper;
import com.mi.health.message.center.viewModel.RelativeCareViewModel;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.mine.export.IWebSyncImpl;
import com.xiaomi.fitness.relative.export.IRelativeCareAccessApi;
import com.xiaomi.fitness.relative.export.RelativeCareAccessExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.export.SharedDataTypeMsgModel;
import defpackage.av6;
import defpackage.fzi;
import defpackage.grf;
import defpackage.vti;
import defpackage.zmi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000201B\u0007¢\u0006\u0004\b/\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0006R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R*\u0010-\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0,\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/mi/health/message/center/ui/RelativeCareMessageFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/mi/health/message/center/viewModel/RelativeCareViewModel;", "Lgrf;", "", "checkNetwork", "()V", Constants.KEY_REQUEST_DATA, "initRecyclerView", "Landroid/widget/TextView;", "tvReject", "Lcom/mi/health/message/center/entity/MessageData;", "Lcom/mi/health/message/center/entity/RelativeExtraData;", "messageData", "dealAdapterOnItemReject", "(Landroid/widget/TextView;Lcom/mi/health/message/center/entity/MessageData;)V", "tvAgree", "dealAdapterOnItemAgree", "dealAdapterOnItemClick", "(Lcom/mi/health/message/center/entity/MessageData;)V", "Lcom/mi/health/message/center/ui/RelativeCareMessageFragment$DialogDealCallback;", "dialogCallback", "showRequestDialogTip", "(Lcom/mi/health/message/center/ui/RelativeCareMessageFragment$DialogDealCallback;)V", "", "status", "updatePageWithStatus", "(I)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "Landroidx/recyclerview/widget/RecyclerView;", "msgRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "tvTip", "Landroid/widget/TextView;", "Lcom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter;", "messageCenterAdapter", "Lcom/mi/health/message/center/ui/adapter/RelativeCardMessageCenterAdapter;", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "relativeMessageLiveData", "Landroidx/lifecycle/LiveData;", "<init>", "Companion", "DialogDealCallback", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RelativeCareMessageFragment extends Hilt_RelativeCareMessageFragment<RelativeCareViewModel, grf> {
    public static final int STATUS_LOADING = 0;
    public static final int STATUS_NETWORK_ERROR = 2;
    public static final int STATUS_NORMAL = 4;
    public static final int STATUS_NO_DATA = 1;
    public static final int STATUS_OTHER_ERROR = 3;

    @NotNull
    public static final String TAG = "RelativeCareMessageFragment";
    private RelativeCardMessageCenterAdapter messageCenterAdapter;
    private RecyclerView msgRecyclerView;

    @Nullable
    private LiveData<PagingData<MessageData<RelativeExtraData>>> relativeMessageLiveData;
    private TextView tvTip;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/mi/health/message/center/ui/RelativeCareMessageFragment$DialogDealCallback;", "", "<init>", "()V", "dealAgree", "", "dealReject", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DialogDealCallback {
        public abstract void dealAgree();

        public void dealReject() {
        }
    }

    public RelativeCareMessageFragment() {
        super(vti.d);
    }

    private final void checkNetwork() {
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            updatePageWithStatus(2);
            return;
        }
        RelativeCardMessageCenterAdapter relativeCardMessageCenterAdapter = this.messageCenterAdapter;
        if (relativeCardMessageCenterAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageCenterAdapter");
            relativeCardMessageCenterAdapter = null;
        }
        if (relativeCardMessageCenterAdapter.getItemCount() <= 0) {
            updatePageWithStatus(0);
        }
        requestData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void dealAdapterOnItemAgree(final TextView tvAgree, final MessageData<RelativeExtraData> messageData) {
        if (messageData.getType() == 1) {
            SynDialogHelper synDialogHelper = SynDialogHelper.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            synDialogHelper.showSyncDialogIfNeed(fragmentActivityRequireActivity, new IWebSyncImpl() { // from class: com.mi.health.message.center.ui.RelativeCareMessageFragment.dealAdapterOnItemAgree.1
                @Override // com.xiaomi.fitness.mine.export.IWebSyncImpl, com.xiaomi.fitness.mine.export.IWebSync
                public void onWebSyncAccepted() {
                    super.onWebSyncAccepted();
                    final RelativeCareMessageFragment relativeCareMessageFragment = RelativeCareMessageFragment.this;
                    final MessageData<RelativeExtraData> messageData2 = messageData;
                    relativeCareMessageFragment.showRequestDialogTip(new DialogDealCallback() { // from class: com.mi.health.message.center.ui.RelativeCareMessageFragment$dealAdapterOnItemAgree$1$onWebSyncAccepted$1
                        @Override // com.mi.health.message.center.ui.RelativeCareMessageFragment.DialogDealCallback
                        public void dealAgree() {
                            IRelativeCareAccessApi instance = RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE);
                            Context contextRequireContext = relativeCareMessageFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                            instance.goToAcceptInvitation(contextRequireContext, MessageCenterExtKt.getToInvitationMsgModel(messageData2));
                        }
                    });
                }
            });
            return;
        }
        if (messageData.getType() == 2) {
            final SharedDataTypeMsgModel toSharedDataTypeMsgModel = MessageCenterExtKt.getToSharedDataTypeMsgModel(messageData);
            tvAgree.setEnabled(false);
            ((RelativeCareViewModel) getMViewModel()).getValidateAppliedSharedDataLiveData(toSharedDataTypeMsgModel).observe(this, new RelativeCareMessageFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tfk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RelativeCareMessageFragment.dealAdapterOnItemAgree$lambda$4(tvAgree, this, toSharedDataTypeMsgModel, (RelativeResult) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealAdapterOnItemAgree$lambda$4(TextView tvAgree, final RelativeCareMessageFragment this$0, final SharedDataTypeMsgModel msgModel, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(tvAgree, "$tvAgree");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msgModel, "$msgModel");
        Logger.i(TAG, "validateAppliedSharedDataLiveData result " + relativeResult);
        tvAgree.setEnabled(true);
        if (relativeResult.isSuccess()) {
            this$0.showRequestDialogTip(new DialogDealCallback() { // from class: com.mi.health.message.center.ui.RelativeCareMessageFragment$dealAdapterOnItemAgree$2$1
                @Override // com.mi.health.message.center.ui.RelativeCareMessageFragment.DialogDealCallback
                public void dealAgree() {
                    IRelativeCareAccessApi instance = RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE);
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    instance.goToAcceptAppliedSharedDataTypes(contextRequireContext, msgModel);
                }
            });
        } else if (relativeResult.getErrorCode() == -4002001 || relativeResult.getErrorCode() == -4002002) {
            ToastUtil.INSTANCE.showToast(fzi.g);
        } else {
            ToastUtil.INSTANCE.showToast(fzi.i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dealAdapterOnItemClick(MessageData<RelativeExtraData> messageData) {
        String nickName;
        RelativeExtraData relativeExtraData;
        AbnormalData abnormalData;
        String key;
        RelativeExtraData relativeExtraData2;
        AbnormalData abnormalData2;
        Long timeStamp;
        Integer dataStatus;
        if (messageData.getType() == 3 || (messageData.getType() == 6 && ((dataStatus = messageData.getDataStatus()) == null || dataStatus.intValue() != 0))) {
            IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Long senderUId = messageData.getSenderUId();
            long jLongValue = senderUId != null ? senderUId.longValue() : 0L;
            RelativeExtraData relativeExtraData3 = (RelativeExtraData) messageData.getExtraEntity();
            if (relativeExtraData3 == null || (nickName = relativeExtraData3.getNickName()) == null) {
                nickName = "";
            }
            IHealthPage.DefaultImpls.gotoRelativeHealthFragment$default(healthPageExtKt, contextRequireContext, jLongValue, nickName, null, 8, null);
            return;
        }
        if (messageData.getType() != 4 || (relativeExtraData = (RelativeExtraData) messageData.getExtraEntity()) == null || (abnormalData = relativeExtraData.getAbnormalData()) == null || (key = abnormalData.getKey()) == null || (relativeExtraData2 = (RelativeExtraData) messageData.getExtraEntity()) == null || (abnormalData2 = relativeExtraData2.getAbnormalData()) == null || (timeStamp = abnormalData2.getTimeStamp()) == null) {
            return;
        }
        long jLongValue2 = timeStamp.longValue();
        if (Intrinsics.areEqual(key, "low_spo2")) {
            IHealthPage healthPageExtKt2 = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Long senderUId2 = messageData.getSenderUId();
            healthPageExtKt2.gotoRelativeSpo2Fragment(contextRequireContext2, jLongValue2, senderUId2 != null ? senderUId2.longValue() : 0L);
            return;
        }
        IHealthPage healthPageExtKt3 = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
        Long senderUId3 = messageData.getSenderUId();
        healthPageExtKt3.gotoRelativeHrmFragment(contextRequireContext3, jLongValue2, senderUId3 != null ? senderUId3.longValue() : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void dealAdapterOnItemReject(final TextView tvReject, MessageData<RelativeExtraData> messageData) {
        tvReject.setEnabled(false);
        if (messageData.getType() == 1) {
            ((RelativeCareViewModel) getMViewModel()).getGoToRefuseInvitationLiveData(MessageCenterExtKt.getToInvitationMsgModel(messageData)).observe(getViewLifecycleOwner(), new RelativeCareMessageFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rfk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RelativeCareMessageFragment.dealAdapterOnItemReject$lambda$2(this.f32497a, tvReject, (RelativeResult) obj);
                }
            }));
        } else if (messageData.getType() == 2) {
            ((RelativeCareViewModel) getMViewModel()).getGoToRefuseAppliedSharedDataTypesLiveData(MessageCenterExtKt.getToSharedDataTypeMsgModel(messageData)).observe(getViewLifecycleOwner(), new RelativeCareMessageFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sfk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RelativeCareMessageFragment.dealAdapterOnItemReject$lambda$3(this.f33590a, tvReject, (RelativeResult) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealAdapterOnItemReject$lambda$2(RelativeCareMessageFragment this$0, TextView tvReject, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tvReject, "$tvReject");
        if (relativeResult.isSuccess()) {
            this$0.requestData();
        } else {
            tvReject.setEnabled(true);
            ToastUtil.INSTANCE.showToast(fzi.i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealAdapterOnItemReject$lambda$3(RelativeCareMessageFragment this$0, TextView tvReject, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tvReject, "$tvReject");
        Logger.i(TAG, "getGoToRefuseAppliedSharedDataTypes result " + relativeResult);
        if (relativeResult.isSuccess()) {
            this$0.requestData();
        } else {
            tvReject.setEnabled(true);
            if (relativeResult.getErrorCode() == -4002001 || relativeResult.getErrorCode() == -4002002) {
                ToastUtil.INSTANCE.showToast(fzi.g);
            } else {
                ToastUtil.INSTANCE.showToast(fzi.i);
            }
        }
        return Unit.INSTANCE;
    }

    private final void initRecyclerView() {
        RelativeCardMessageCenterAdapter relativeCardMessageCenterAdapter = new RelativeCardMessageCenterAdapter(new h.f<MessageData<RelativeExtraData>>() { // from class: com.mi.health.message.center.ui.RelativeCareMessageFragment.initRecyclerView.1
            @Override // androidx.recyclerview.widget.h.f
            public boolean areContentsTheSame(MessageData<RelativeExtraData> oldItem, MessageData<RelativeExtraData> newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getMessageId() == newItem.getMessageId() && Intrinsics.areEqual(oldItem.getLastModifyTime(), newItem.getLastModifyTime());
            }

            @Override // androidx.recyclerview.widget.h.f
            public boolean areItemsTheSame(MessageData<RelativeExtraData> oldItem, MessageData<RelativeExtraData> newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getMessageId() == newItem.getMessageId() && Intrinsics.areEqual(oldItem.getLastModifyTime(), newItem.getLastModifyTime());
            }
        });
        this.messageCenterAdapter = relativeCardMessageCenterAdapter;
        relativeCardMessageCenterAdapter.setOnItemClickListener(new RelativeCardMessageCenterAdapter.OnItemClickListener() { // from class: com.mi.health.message.center.ui.RelativeCareMessageFragment.initRecyclerView.2
            @Override // com.mi.health.message.center.ui.adapter.RelativeCardMessageCenterAdapter.OnItemClickListener
            public void onItemAgree(TextView tvAgree, MessageData<RelativeExtraData> messageData) {
                Intrinsics.checkNotNullParameter(tvAgree, "tvAgree");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                RelativeCareMessageFragment.this.dealAdapterOnItemAgree(tvAgree, messageData);
            }

            @Override // com.mi.health.message.center.ui.adapter.RelativeCardMessageCenterAdapter.OnItemClickListener
            public void onItemClick(MessageData<RelativeExtraData> messageData) {
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                RelativeCareMessageFragment.this.dealAdapterOnItemClick(messageData);
            }

            @Override // com.mi.health.message.center.ui.adapter.RelativeCardMessageCenterAdapter.OnItemClickListener
            public void onItemReject(TextView tvReject, MessageData<RelativeExtraData> messageData) {
                Intrinsics.checkNotNullParameter(tvReject, "tvReject");
                Intrinsics.checkNotNullParameter(messageData, "messageData");
                RelativeCareMessageFragment.this.dealAdapterOnItemReject(tvReject, messageData);
            }
        });
        RecyclerView recyclerView = this.msgRecyclerView;
        RelativeCardMessageCenterAdapter relativeCardMessageCenterAdapter2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("msgRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView2 = this.msgRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("msgRecyclerView");
            recyclerView2 = null;
        }
        RelativeCardMessageCenterAdapter relativeCardMessageCenterAdapter3 = this.messageCenterAdapter;
        if (relativeCardMessageCenterAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageCenterAdapter");
            relativeCardMessageCenterAdapter3 = null;
        }
        recyclerView2.setAdapter(relativeCardMessageCenterAdapter3);
        Function1<? super CombinedLoadStates, Unit> function1 = new Function1() { // from class: ufk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareMessageFragment.initRecyclerView$lambda$1(this.f35716a, (CombinedLoadStates) obj);
            }
        };
        RelativeCardMessageCenterAdapter relativeCardMessageCenterAdapter4 = this.messageCenterAdapter;
        if (relativeCardMessageCenterAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageCenterAdapter");
        } else {
            relativeCardMessageCenterAdapter2 = relativeCardMessageCenterAdapter4;
        }
        relativeCardMessageCenterAdapter2.addLoadStateListener(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRecyclerView$lambda$1(RelativeCareMessageFragment this$0, CombinedLoadStates it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        LoadState refresh = it.getRefresh();
        RelativeCardMessageCenterAdapter relativeCardMessageCenterAdapter = this$0.messageCenterAdapter;
        RelativeCardMessageCenterAdapter relativeCardMessageCenterAdapter2 = null;
        if (relativeCardMessageCenterAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageCenterAdapter");
            relativeCardMessageCenterAdapter = null;
        }
        Logger.i(TAG, "load state:" + refresh + ";itemCount:" + relativeCardMessageCenterAdapter.getItemCount());
        if (!(it.getRefresh() instanceof LoadState.Error)) {
            RelativeCardMessageCenterAdapter relativeCardMessageCenterAdapter3 = this$0.messageCenterAdapter;
            if (relativeCardMessageCenterAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageCenterAdapter");
            } else {
                relativeCardMessageCenterAdapter2 = relativeCardMessageCenterAdapter3;
            }
            this$0.updatePageWithStatus(relativeCardMessageCenterAdapter2.getItemCount() == 0 ? 1 : 4);
        } else if (NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            this$0.updatePageWithStatus(3);
        } else {
            this$0.updatePageWithStatus(2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        LiveData<PagingData<MessageData<RelativeExtraData>>> liveData = this.relativeMessageLiveData;
        if (liveData != null) {
            Intrinsics.checkNotNull(liveData);
            liveData.removeObservers(getViewLifecycleOwner());
        }
        LiveData<PagingData<MessageData<RelativeExtraData>>> liveDataQueryRelativeMessagePagingData = ((RelativeCareViewModel) getMViewModel()).queryRelativeMessagePagingData();
        this.relativeMessageLiveData = liveDataQueryRelativeMessagePagingData;
        Intrinsics.checkNotNull(liveDataQueryRelativeMessagePagingData);
        liveDataQueryRelativeMessagePagingData.observe(this, new RelativeCareMessageFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vfk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeCareMessageFragment.requestData$lambda$0(this.f36850a, (PagingData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(RelativeCareMessageFragment this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RelativeCardMessageCenterAdapter relativeCardMessageCenterAdapter = this$0.messageCenterAdapter;
        if (relativeCardMessageCenterAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageCenterAdapter");
            relativeCardMessageCenterAdapter = null;
        }
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        relativeCardMessageCenterAdapter.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRequestDialogTip(final DialogDealCallback dialogCallback) {
        CommonDialog commonDialogCreate = new CommonDialog.c("request_dialog").setDialogTitle(fzi.h).setDialogDescription(fzi.u).setPositiveText(fzi.f18395a).setNegativeText(fzi.f18396b).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).setCancelable(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.mi.health.message.center.ui.RelativeCareMessageFragment.showRequestDialogTip.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    dialogCallback.dealAgree();
                } else {
                    dialogCallback.dealReject();
                }
            }
        });
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    private final void updatePageWithStatus(int status) {
        TextView textView = null;
        RecyclerView recyclerView = null;
        TextView textView2 = null;
        TextView textView3 = null;
        TextView textView4 = null;
        if (status == 0) {
            TextView textView5 = this.tvTip;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTip");
                textView5 = null;
            }
            ViewExtKt.setVisible(textView5, true);
            RecyclerView recyclerView2 = this.msgRecyclerView;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("msgRecyclerView");
                recyclerView2 = null;
            }
            ViewExtKt.setVisible(recyclerView2, false);
            TextView textView6 = this.tvTip;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTip");
                textView6 = null;
            }
            textView6.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            TextView textView7 = this.tvTip;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTip");
            } else {
                textView = textView7;
            }
            textView.setText(getString(fzi.x));
            return;
        }
        if (status == 1) {
            TextView textView8 = this.tvTip;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTip");
                textView8 = null;
            }
            ViewExtKt.setVisible(textView8, true);
            RecyclerView recyclerView3 = this.msgRecyclerView;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("msgRecyclerView");
                recyclerView3 = null;
            }
            ViewExtKt.setVisible(recyclerView3, false);
            TextView textView9 = this.tvTip;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTip");
                textView9 = null;
            }
            textView9.setCompoundDrawablesWithIntrinsicBounds(0, zmi.c, 0, 0);
            TextView textView10 = this.tvTip;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTip");
            } else {
                textView4 = textView10;
            }
            textView4.setText(getString(fzi.w));
            return;
        }
        if (status == 2) {
            TextView textView11 = this.tvTip;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTip");
                textView11 = null;
            }
            ViewExtKt.setVisible(textView11, true);
            RecyclerView recyclerView4 = this.msgRecyclerView;
            if (recyclerView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("msgRecyclerView");
                recyclerView4 = null;
            }
            ViewExtKt.setVisible(recyclerView4, false);
            TextView textView12 = this.tvTip;
            if (textView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTip");
                textView12 = null;
            }
            textView12.setCompoundDrawablesWithIntrinsicBounds(0, zmi.f41465b, 0, 0);
            TextView textView13 = this.tvTip;
            if (textView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTip");
            } else {
                textView3 = textView13;
            }
            textView3.setText(getString(fzi.common_hint_network_unavailable));
            return;
        }
        if (status != 3) {
            if (status != 4) {
                return;
            }
            TextView textView14 = this.tvTip;
            if (textView14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTip");
                textView14 = null;
            }
            ViewExtKt.setVisible(textView14, false);
            RecyclerView recyclerView5 = this.msgRecyclerView;
            if (recyclerView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("msgRecyclerView");
            } else {
                recyclerView = recyclerView5;
            }
            ViewExtKt.setVisible(recyclerView, true);
            return;
        }
        TextView textView15 = this.tvTip;
        if (textView15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTip");
            textView15 = null;
        }
        ViewExtKt.setVisible(textView15, true);
        RecyclerView recyclerView6 = this.msgRecyclerView;
        if (recyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("msgRecyclerView");
            recyclerView6 = null;
        }
        ViewExtKt.setVisible(recyclerView6, false);
        TextView textView16 = this.tvTip;
        if (textView16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTip");
            textView16 = null;
        }
        textView16.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TextView textView17 = this.tvTip;
        if (textView17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTip");
        } else {
            textView2 = textView17;
        }
        textView2.setText(getString(fzi.common_load_fail));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        checkNetwork();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        this.msgRecyclerView = ((grf) getMBinding()).A;
        this.tvTip = ((grf) getMBinding()).B;
        initRecyclerView();
    }
}
