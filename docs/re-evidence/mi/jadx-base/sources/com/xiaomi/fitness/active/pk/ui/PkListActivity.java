package com.xiaomi.fitness.active.pk.ui;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.active.pk.ActivePkViewModel;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.active.pk.net.model.AggregatePkInfo;
import com.xiaomi.fitness.active.pk.net.model.InviteRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.net.model.UserPkDetail;
import com.xiaomi.fitness.active.pk.net.model.WithDrawPrivacyUser;
import com.xiaomi.fitness.active.pk.ui.PkListActivity;
import com.xiaomi.fitness.active.pk.ui.recyclerview.InviteListAdapter;
import com.xiaomi.fitness.active.pk.ui.recyclerview.PkHistoryBriefAdapter;
import com.xiaomi.fitness.active.pk.ui.recyclerview.PkRecordListAdapter;
import com.xiaomi.fitness.active.pk.util.BusinessFailDealUtil;
import com.xiaomi.fitness.active.pk.util.PkLogger;
import com.xiaomi.fitness.active.pk.util.SynDialogHelper;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.recyclerview.decoration.GridItemSpace;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ItemDecorationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.mine.export.IWebSyncImpl;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.av6;
import defpackage.bui;
import defpackage.jxh;
import defpackage.ozi;
import defpackage.wc0;
import defpackage.yv1;
import defpackage.zii;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.core.widget.NestedScrollView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bL\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u001f\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0006J#\u0010 \u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010\u0006J)\u0010'\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\fH\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010)H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0014¢\u0006\u0004\b-\u0010\u0006J\u0017\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H\u0014¢\u0006\u0004\b2\u0010\u0006R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u00107\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010BR\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010H¨\u0006M"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/PkListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/active/pk/ActivePkViewModel;", "Ljxh;", "", "requestWithDrawUsers", "()V", "showWithDrawPrivacyUserIfNeed", "initTitleEndView", Constants.KEY_REQUEST_DATA, "requestAggregateData", "onDataChangedIfNeed", "", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "list", "refreshPkRecordListAdapter", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;", "refreshHistoryListAdapter", "Lcom/xiaomi/fitness/active/pk/net/model/InviteRecordDetail;", "dataList", "refreshInviteListAdapter", "initRecyclerView", "initInviteListRecyclerView", "initPkListRecyclerView", "setPkListLayoutManager", "setHistoryLayoutManager", "initHistoryRecyclerView", "", "nickName", "", "userId", "showInviteDialog", "(Ljava/lang/String;Ljava/lang/Long;)V", PkConstants.PARAM_INVITER_UID, "dealInviteAccept", "(Ljava/lang/Long;)V", "checkNetwork", "ids", "showRecallPrivacyDialog", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_PAUSE, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", LifecycleConstantKt.ON_RESUME, "Landroidx/recyclerview/widget/RecyclerView;", "inviteListRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "historyListRecyclerView", "pkListRecyclerView", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/InviteListAdapter;", "inviteListAdapter", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/InviteListAdapter;", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkHistoryBriefAdapter;", "historyBriefAdapter", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkHistoryBriefAdapter;", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkRecordListAdapter;", "pkRecordListAdapter", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkRecordListAdapter;", "inviteListData", "Ljava/util/List;", "", "Lcom/xiaomi/fitness/active/pk/net/model/WithDrawPrivacyUser;", "withDrawUserList", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PkListActivity extends Hilt_PkListActivity<ActivePkViewModel, jxh> {
    private PkHistoryBriefAdapter historyBriefAdapter;
    private RecyclerView historyListRecyclerView;
    private InviteListAdapter inviteListAdapter;

    @Nullable
    private List<InviteRecordDetail> inviteListData;
    private RecyclerView inviteListRecyclerView;
    private RecyclerView pkListRecyclerView;
    private PkRecordListAdapter pkRecordListAdapter;

    @Nullable
    private List<WithDrawPrivacyUser> withDrawUserList;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ActivePkViewModel access$getMViewModel(PkListActivity pkListActivity) {
        return (ActivePkViewModel) pkListActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkNetwork() {
        NetUtil netUtil = NetUtil.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        if (netUtil.getNetWorkAvailable(application)) {
            TextView noNetwork = ((jxh) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
            ViewExtKt.setVisible(noNetwork, false);
            requestData();
            return;
        }
        TextView noNetwork2 = ((jxh) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(noNetwork2, "noNetwork");
        ViewExtKt.setVisible(noNetwork2, true);
        NestedScrollView container = ((jxh) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ViewExtKt.setVisible(container, false);
        TextView loading = ((jxh) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(loading, "loading");
        ViewExtKt.setVisible(loading, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void dealInviteAccept(Long inviterUid) {
        ((ActivePkViewModel) getMViewModel()).acceptOrRejectInvite(null, inviterUid, true, new Function1() { // from class: xyh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkListActivity.dealInviteAccept$lambda$8(this.f39587a, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: yyh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkListActivity.dealInviteAccept$lambda$9(this.f40687a, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealInviteAccept$lambda$8(PkListActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PkLogger.INSTANCE.i("PkListActivity", "dealInviteAccept success", new Object[0]);
        this$0.requestData();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealInviteAccept$lambda$9(PkListActivity this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BusinessFailDealUtil.INSTANCE.dealAcceptOrRejectInviteFail(this$0, it);
        return Unit.INSTANCE;
    }

    private final void initHistoryRecyclerView() {
        setHistoryLayoutManager();
        PkHistoryBriefAdapter pkHistoryBriefAdapter = new PkHistoryBriefAdapter();
        this.historyBriefAdapter = pkHistoryBriefAdapter;
        pkHistoryBriefAdapter.showHeader(ozi.s);
        PkHistoryBriefAdapter pkHistoryBriefAdapter2 = this.historyBriefAdapter;
        PkHistoryBriefAdapter pkHistoryBriefAdapter3 = null;
        if (pkHistoryBriefAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyBriefAdapter");
            pkHistoryBriefAdapter2 = null;
        }
        pkHistoryBriefAdapter2.setOnItemClickListener(new PkHistoryBriefAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity.initHistoryRecyclerView.1
            @Override // com.xiaomi.fitness.active.pk.ui.recyclerview.PkHistoryBriefAdapter.OnItemClickListener
            public void onClick(AggregatePkInfo recordDetail, boolean isClickAcceptDirectly) {
                Intrinsics.checkNotNullParameter(recordDetail, "recordDetail");
                UserInfo oppUserInfo = recordDetail.getOppUserInfo();
                final Long lValueOf = oppUserInfo != null ? Long.valueOf(oppUserInfo.getUserId()) : null;
                UserInfo oppUserInfo2 = recordDetail.getOppUserInfo();
                final String nickName = oppUserInfo2 != null ? oppUserInfo2.getNickName() : null;
                if (lValueOf == null || lValueOf.longValue() <= 0) {
                    return;
                }
                if (isClickAcceptDirectly) {
                    SynDialogHelper synDialogHelper = SynDialogHelper.INSTANCE;
                    final PkListActivity pkListActivity = PkListActivity.this;
                    synDialogHelper.showSyncDialogIfNeed(pkListActivity, new IWebSyncImpl() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity$initHistoryRecyclerView$1$onClick$1
                        @Override // com.xiaomi.fitness.mine.export.IWebSyncImpl, com.xiaomi.fitness.mine.export.IWebSync
                        public void onWebSyncAccepted() {
                            super.onWebSyncAccepted();
                            pkListActivity.showInviteDialog(nickName, lValueOf);
                        }
                    });
                } else {
                    Intent intent = new Intent(PkListActivity.this, (Class<?>) PkHistoryDetailActivity.class);
                    intent.putExtra(PkConstants.PARAM_PK_UID, lValueOf.longValue());
                    PkListActivity.this.startActivity(intent);
                }
            }
        });
        RecyclerView recyclerView = this.historyListRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyListRecyclerView");
            recyclerView = null;
        }
        PkHistoryBriefAdapter pkHistoryBriefAdapter4 = this.historyBriefAdapter;
        if (pkHistoryBriefAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyBriefAdapter");
        } else {
            pkHistoryBriefAdapter3 = pkHistoryBriefAdapter4;
        }
        recyclerView.setAdapter(pkHistoryBriefAdapter3);
    }

    private final void initInviteListRecyclerView() {
        RecyclerView recyclerView = this.inviteListRecyclerView;
        InviteListAdapter inviteListAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviteListRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        InviteListAdapter inviteListAdapter2 = new InviteListAdapter();
        this.inviteListAdapter = inviteListAdapter2;
        inviteListAdapter2.showHeader(ozi.B);
        InviteListAdapter inviteListAdapter3 = this.inviteListAdapter;
        if (inviteListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviteListAdapter");
            inviteListAdapter3 = null;
        }
        inviteListAdapter3.setOnItemClickListener(new InviteListAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity.initInviteListRecyclerView.1
            @Override // com.xiaomi.fitness.active.pk.ui.recyclerview.InviteListAdapter.OnItemClickListener
            public void onBottomClick(boolean z) {
                InviteListAdapter.OnItemClickListener.DefaultImpls.onBottomClick(this, z);
            }

            @Override // com.xiaomi.fitness.active.pk.ui.recyclerview.InviteListAdapter.OnItemClickListener
            public void onClick(InviteRecordDetail recordDetail, boolean isClickAcceptDirectly) {
                Intrinsics.checkNotNullParameter(recordDetail, "recordDetail");
                UserInfo inviterUserInfo = recordDetail.getInviterUserInfo();
                final Long lValueOf = inviterUserInfo != null ? Long.valueOf(inviterUserInfo.getUserId()) : null;
                if (isClickAcceptDirectly) {
                    SynDialogHelper synDialogHelper = SynDialogHelper.INSTANCE;
                    final PkListActivity pkListActivity = PkListActivity.this;
                    synDialogHelper.showSyncDialogIfNeed(pkListActivity, new IWebSyncImpl() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity$initInviteListRecyclerView$1$onClick$1
                        @Override // com.xiaomi.fitness.mine.export.IWebSyncImpl, com.xiaomi.fitness.mine.export.IWebSync
                        public void onWebSyncAccepted() {
                            super.onWebSyncAccepted();
                            pkListActivity.dealInviteAccept(lValueOf);
                        }
                    });
                } else {
                    Intent intent = new Intent(PkListActivity.this, (Class<?>) InviteReceiveActivity.class);
                    intent.putExtra(PkConstants.PARAM_INVITER_UID, lValueOf != null ? lValueOf.longValue() : 0L);
                    PkListActivity.this.startActivity(intent);
                }
            }

            @Override // com.xiaomi.fitness.active.pk.ui.recyclerview.InviteListAdapter.OnItemClickListener
            public void onHeaderClick() {
                InviteListAdapter.OnItemClickListener.DefaultImpls.onHeaderClick(this);
            }
        });
        RecyclerView recyclerView2 = this.inviteListRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviteListRecyclerView");
            recyclerView2 = null;
        }
        InviteListAdapter inviteListAdapter4 = this.inviteListAdapter;
        if (inviteListAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviteListAdapter");
        } else {
            inviteListAdapter = inviteListAdapter4;
        }
        recyclerView2.setAdapter(inviteListAdapter);
    }

    private final void initPkListRecyclerView() {
        setPkListLayoutManager();
        PkRecordListAdapter pkRecordListAdapter = new PkRecordListAdapter();
        this.pkRecordListAdapter = pkRecordListAdapter;
        pkRecordListAdapter.showHeader(ozi.K);
        PkRecordListAdapter pkRecordListAdapter2 = this.pkRecordListAdapter;
        PkRecordListAdapter pkRecordListAdapter3 = null;
        if (pkRecordListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pkRecordListAdapter");
            pkRecordListAdapter2 = null;
        }
        pkRecordListAdapter2.setOnItemClickListener(new PkRecordListAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity.initPkListRecyclerView.1
            @Override // com.xiaomi.fitness.active.pk.ui.recyclerview.PkRecordListAdapter.OnItemClickListener
            public void onClick(PkRecordDetail recordDetail) {
                UserInfo userInfo;
                Intrinsics.checkNotNullParameter(recordDetail, "recordDetail");
                Intent intent = new Intent(PkListActivity.this, (Class<?>) PkProcessDetailActivity.class);
                intent.putExtra(PkConstants.PARAM_PK_ID, recordDetail.getPkId());
                UserPkDetail oppPkDetail = recordDetail.getOppPkDetail();
                intent.putExtra(PkConstants.PARAM_PK_UID, (oppPkDetail == null || (userInfo = oppPkDetail.getUserInfo()) == null) ? 0L : userInfo.getUserId());
                PkListActivity.this.startActivity(intent);
            }
        });
        RecyclerView recyclerView = this.pkListRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pkListRecyclerView");
            recyclerView = null;
        }
        PkRecordListAdapter pkRecordListAdapter4 = this.pkRecordListAdapter;
        if (pkRecordListAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pkRecordListAdapter");
        } else {
            pkRecordListAdapter3 = pkRecordListAdapter4;
        }
        recyclerView.setAdapter(pkRecordListAdapter3);
    }

    private final void initRecyclerView() {
        initInviteListRecyclerView();
        initHistoryRecyclerView();
        initPkListRecyclerView();
    }

    private final void initTitleEndView() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            TextView textView = new TextView(miuiActionBar.getThemedContext());
            textView.setOnClickListener(new View.OnClickListener() { // from class: wyh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PkListActivity.initTitleEndView$lambda$2$lambda$1(this.f38478a, view);
                }
            });
            textView.setText(ozi.v);
            textView.setTextSize(16.0f);
            textView.setTextColor(getColor(zii.f41318b));
            textView.setTypeface(Typeface.create("mipro-regular", 1));
            miuiActionBar.setEndView(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitleEndView$lambda$2$lambda$1(PkListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SendingInvitationActivity.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataChangedIfNeed() {
        TextView noNetwork = ((jxh) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
        ViewExtKt.setVisible(noNetwork, false);
        TextView loading = ((jxh) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(loading, "loading");
        ViewExtKt.setVisible(loading, false);
        NestedScrollView container = ((jxh) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ViewExtKt.setVisible(container, true);
    }

    private final void refreshHistoryListAdapter(List<AggregatePkInfo> list) {
        onDataChangedIfNeed();
        PkHistoryBriefAdapter pkHistoryBriefAdapter = null;
        RecyclerView recyclerView = null;
        if (ArrayUtils.isEmpty(list)) {
            RecyclerView recyclerView2 = this.historyListRecyclerView;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("historyListRecyclerView");
            } else {
                recyclerView = recyclerView2;
            }
            ViewExtKt.setVisible(recyclerView, false);
            return;
        }
        RecyclerView recyclerView3 = this.historyListRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyListRecyclerView");
            recyclerView3 = null;
        }
        ViewExtKt.setVisible(recyclerView3, true);
        PkHistoryBriefAdapter pkHistoryBriefAdapter2 = this.historyBriefAdapter;
        if (pkHistoryBriefAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyBriefAdapter");
        } else {
            pkHistoryBriefAdapter = pkHistoryBriefAdapter2;
        }
        pkHistoryBriefAdapter.updateDataList(list);
    }

    private final void refreshInviteListAdapter(List<InviteRecordDetail> dataList) {
        onDataChangedIfNeed();
        this.inviteListData = dataList;
        RecyclerView recyclerView = null;
        if (ArrayUtils.isEmpty(dataList)) {
            RecyclerView recyclerView2 = this.inviteListRecyclerView;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inviteListRecyclerView");
            } else {
                recyclerView = recyclerView2;
            }
            ViewExtKt.setVisible(recyclerView, false);
            return;
        }
        RecyclerView recyclerView3 = this.inviteListRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviteListRecyclerView");
            recyclerView3 = null;
        }
        ViewExtKt.setVisible(recyclerView3, true);
        InviteListAdapter inviteListAdapter = this.inviteListAdapter;
        if (inviteListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inviteListAdapter");
            inviteListAdapter = null;
        }
        List<InviteRecordDetail> list = this.inviteListData;
        inviteListAdapter.updateDataList(list != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) list) : null);
    }

    private final void refreshPkRecordListAdapter(List<PkRecordDetail> list) {
        onDataChangedIfNeed();
        PkRecordListAdapter pkRecordListAdapter = null;
        RecyclerView recyclerView = null;
        if (ArrayUtils.isEmpty(list)) {
            RecyclerView recyclerView2 = this.pkListRecyclerView;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pkListRecyclerView");
            } else {
                recyclerView = recyclerView2;
            }
            ViewExtKt.setVisible(recyclerView, false);
            return;
        }
        RecyclerView recyclerView3 = this.pkListRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pkListRecyclerView");
            recyclerView3 = null;
        }
        ViewExtKt.setVisible(recyclerView3, true);
        PkRecordListAdapter pkRecordListAdapter2 = this.pkRecordListAdapter;
        if (pkRecordListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pkRecordListAdapter");
        } else {
            pkRecordListAdapter = pkRecordListAdapter2;
        }
        pkRecordListAdapter.updateDataList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void requestAggregateData() {
        ((ActivePkViewModel) getMViewModel()).queryPkAllAggregateHistoryListLiveData().observe(this, new PkListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vyh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkListActivity.requestAggregateData$lambda$5(this.f37365a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestAggregateData$lambda$5(PkListActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshHistoryListAdapter(list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        ((ActivePkViewModel) getMViewModel()).queryInviteRecordsLiveData().observe(this, new PkListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tyh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkListActivity.requestData$lambda$3(this.f35186a, (List) obj);
            }
        }));
        ((ActivePkViewModel) getMViewModel()).queryProcessPkRecordsDetailLiveData().observe(this, new PkListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: uyh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkListActivity.requestData$lambda$4(this.f36281a, (List) obj);
            }
        }));
        requestAggregateData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$3(PkListActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshInviteListAdapter(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$4(PkListActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshPkRecordListAdapter(list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestWithDrawUsers() {
        ((ActivePkViewModel) getMViewModel()).queryWithDrawPrivacyUserListLiveData().observe(this, new PkListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zyh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkListActivity.requestWithDrawUsers$lambda$0(this.f41803a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestWithDrawUsers$lambda$0(PkListActivity this$0, List list) {
        List<WithDrawPrivacyUser> mutableList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List list2 = list;
        if (ArrayUtils.isEmpty(list2)) {
            mutableList = null;
        } else {
            Intrinsics.checkNotNull(list);
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list2);
        }
        this$0.withDrawUserList = mutableList;
        this$0.showWithDrawPrivacyUserIfNeed();
        return Unit.INSTANCE;
    }

    private final void setHistoryLayoutManager() {
        RecyclerView.o linearLayoutManager;
        RecyclerView recyclerView = this.historyListRecyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyListRecyclerView");
            recyclerView = null;
        }
        ItemDecorationExtKt.clearAllItemDecorations(recyclerView);
        if (UIUtils.INSTANCE.getScreenState() == 0) {
            RecyclerView recyclerView3 = this.historyListRecyclerView;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("historyListRecyclerView");
                recyclerView3 = null;
            }
            recyclerView3.addItemDecoration(new GridItemSpace(ExtUtilsKt.getDp(12), ExtUtilsKt.getDp(6), false, 4, null));
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
            gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity$setHistoryLayoutManager$layoutManager$1$1
                @Override // androidx.recyclerview.widget.GridLayoutManager.b
                public int getSpanSize(int position) {
                    return position == 0 ? 2 : 1;
                }
            });
            linearLayoutManager = gridLayoutManager;
        } else {
            linearLayoutManager = new LinearLayoutManager(this);
        }
        RecyclerView recyclerView4 = this.historyListRecyclerView;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyListRecyclerView");
        } else {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
    }

    private final void setPkListLayoutManager() {
        RecyclerView.o linearLayoutManager;
        RecyclerView recyclerView = this.pkListRecyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pkListRecyclerView");
            recyclerView = null;
        }
        ItemDecorationExtKt.clearAllItemDecorations(recyclerView);
        if (UIUtils.INSTANCE.getScreenState() == 0) {
            RecyclerView recyclerView3 = this.pkListRecyclerView;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pkListRecyclerView");
                recyclerView3 = null;
            }
            recyclerView3.addItemDecoration(new GridItemSpace(ExtUtilsKt.getDp(12), ExtUtilsKt.getDp(6), false, 4, null));
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
            gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity$setPkListLayoutManager$layoutManager$1$1
                @Override // androidx.recyclerview.widget.GridLayoutManager.b
                public int getSpanSize(int position) {
                    return position == 0 ? 2 : 1;
                }
            });
            linearLayoutManager = gridLayoutManager;
        } else {
            linearLayoutManager = new LinearLayoutManager(this);
        }
        RecyclerView recyclerView4 = this.pkListRecyclerView;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pkListRecyclerView");
        } else {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showInviteDialog(final String nickName, final Long userId) {
        String string = !TextUtils.isEmpty(nickName) ? getString(ozi.P, nickName) : getString(ozi.O);
        Intrinsics.checkNotNull(string);
        CommonDialog commonDialogCreate = new CommonDialog.c("send_invitation_confirmation").setDialogDescriptionString(new DialogParams.DialogDescriptionString(string)).setPositiveText(ozi.c).setNegativeText(ozi.f29844b).setCancelable(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity.showInviteDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    ActivePkViewModel activePkViewModelAccess$getMViewModel = PkListActivity.access$getMViewModel(PkListActivity.this);
                    final PkListActivity pkListActivity = PkListActivity.this;
                    final String str = nickName;
                    Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity$showInviteDialog$1$onDialogClick$1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ Unit invoke2(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        public void invoke(long p1) {
                            PkListActivity pkListActivity2 = pkListActivity;
                            int i = ozi.Q;
                            Object[] objArr = new Object[1];
                            Object objValueOf = str;
                            if (objValueOf == null) {
                                objValueOf = Integer.valueOf(ozi.d0);
                            }
                            objArr[0] = objValueOf;
                            String string2 = pkListActivity2.getString(i, objArr);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            ToastExtKt.toastLong(pkListActivity2, string2);
                            pkListActivity.requestAggregateData();
                        }
                    };
                    final PkListActivity pkListActivity2 = PkListActivity.this;
                    activePkViewModelAccess$getMViewModel.createInviteRecord(function1, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity$showInviteDialog$1$onDialogClick$2
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                            invoke2(apiException);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public void invoke2(ApiException p1) {
                            Intrinsics.checkNotNullParameter(p1, "p1");
                            BusinessFailDealUtil.INSTANCE.dealCreateInviteRecordFail(pkListActivity2, p1);
                        }
                    }, userId);
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    private final void showRecallPrivacyDialog(String nickName, final List<Long> ids) {
        CommonDialog.c canceledOnBackPressed = new CommonDialog.c("recall_privacy").setDialogTitle(ozi.V).setCanceledOnBackPressed(false);
        int i = ozi.W;
        Object[] objArr = new Object[1];
        if (nickName == null) {
            nickName = "";
        }
        objArr[0] = nickName;
        CommonDialog commonDialogCreate = canceledOnBackPressed.setDialogDescriptionString(new DialogParams.DialogDescriptionString(i, objArr)).setPositiveText(ozi.X).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity.showRecallPrivacyDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    ActivePkViewModel activePkViewModelAccess$getMViewModel = PkListActivity.access$getMViewModel(PkListActivity.this);
                    List<Long> list = ids;
                    final PkListActivity pkListActivity = PkListActivity.this;
                    Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity$showRecallPrivacyDialog$1$onDialogClick$1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ Unit invoke2(Object obj) {
                            invoke2(obj);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public void invoke2(Object p1) {
                            Intrinsics.checkNotNullParameter(p1, "p1");
                            if (ArrayUtils.isEmpty(pkListActivity.withDrawUserList)) {
                                return;
                            }
                            List list2 = pkListActivity.withDrawUserList;
                            if (list2 != null) {
                            }
                            pkListActivity.showWithDrawPrivacyUserIfNeed();
                        }
                    };
                    final PkListActivity pkListActivity2 = PkListActivity.this;
                    activePkViewModelAccess$getMViewModel.updateWithDrawRecordIdsAsync(list, function1, new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.active.pk.ui.PkListActivity$showRecallPrivacyDialog$1$onDialogClick$2
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                            invoke2(apiException);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public void invoke2(ApiException p1) {
                            Intrinsics.checkNotNullParameter(p1, "p1");
                            PkLogger.INSTANCE.i("PkListAct", "updateWithDrawRecordIdsAsync " + p1, new Object[0]);
                            ToastExtKt.toastLong(pkListActivity2, ozi.H);
                        }
                    });
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWithDrawPrivacyUserIfNeed() {
        if (ArrayUtils.isEmpty(this.withDrawUserList)) {
            return;
        }
        List<WithDrawPrivacyUser> list = this.withDrawUserList;
        Intrinsics.checkNotNull(list);
        WithDrawPrivacyUser withDrawPrivacyUser = list.get(0);
        showRecallPrivacyDialog(withDrawPrivacyUser.getNickName(), withDrawPrivacyUser.component2());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return bui.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return yv1.f40598a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setPkListLayoutManager();
        setHistoryLayoutManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.active.pk.ui.Hilt_PkListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setBackgroundDrawable(new ColorDrawable(ResourceExtKt.getResourceColor(this, zii.c)));
        }
        setTitle(ozi.i);
        initTitleEndView();
        this.inviteListRecyclerView = ((jxh) getMBinding()).E;
        this.pkListRecyclerView = ((jxh) getMBinding()).F;
        this.historyListRecyclerView = ((jxh) getMBinding()).D;
        initRecyclerView();
        requestWithDrawUsers();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797"), "name", "competition_list_page", "page_fragment", "day", "title", "活力竞赛", "data", "1");
        super.onPause();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkNetwork();
    }
}
