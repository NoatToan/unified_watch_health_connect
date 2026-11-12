package com.xiaomi.fitness.active.pk.ui;

import android.app.Application;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.paging.CombinedLoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import com.google.android.material.appbar.AppBarLayout;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.active.pk.ActivePkViewModel;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.active.pk.net.model.AggregatePkInfo;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.net.model.UserInfo;
import com.xiaomi.fitness.active.pk.ui.PkHistoryDetailActivity;
import com.xiaomi.fitness.active.pk.ui.recyclerview.PkUserHistoryRecordAdapter;
import com.xiaomi.fitness.active.pk.util.ImageUtils;
import com.xiaomi.fitness.active.pk.util.PkLogger;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bui;
import defpackage.fxh;
import defpackage.ozi;
import defpackage.wc0;
import defpackage.yv1;
import defpackage.zii;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0006R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/PkHistoryDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/active/pk/ActivePkViewModel;", "Lfxh;", "", "checkNetwork", "()V", Constants.KEY_REQUEST_DATA, "Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;", "it", "refreshTopCard", "(Lcom/xiaomi/fitness/active/pk/net/model/AggregatePkInfo;)V", "initRecyclerView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", PkConstants.PARAM_PK_UID, "Ljava/lang/Long;", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkUserHistoryRecordAdapter;", "historyRecordAdapter", "Lcom/xiaomi/fitness/active/pk/ui/recyclerview/PkUserHistoryRecordAdapter;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPkHistoryDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkHistoryDetailActivity.kt\ncom/xiaomi/fitness/active/pk/ui/PkHistoryDetailActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,143:1\n54#2,3:144\n24#2:147\n59#2,4:148\n63#2,2:163\n489#3,11:152\n*S KotlinDebug\n*F\n+ 1 PkHistoryDetailActivity.kt\ncom/xiaomi/fitness/active/pk/ui/PkHistoryDetailActivity\n*L\n105#1:144,3\n105#1:147\n105#1:148,4\n105#1:163,2\n106#1:152,11\n*E\n"})
public final class PkHistoryDetailActivity extends Hilt_PkHistoryDetailActivity<ActivePkViewModel, fxh> {

    @NotNull
    public static final String TAG = "PkHistoryDetailActivity";
    private PkUserHistoryRecordAdapter historyRecordAdapter;

    @Nullable
    private Long pkUid;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ fxh access$getMBinding(PkHistoryDetailActivity pkHistoryDetailActivity) {
        return (fxh) pkHistoryDetailActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkNetwork() {
        NetUtil netUtil = NetUtil.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        if (!netUtil.getNetWorkAvailable(application)) {
            TextView noNetwork = ((fxh) getMBinding()).I;
            Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
            ViewExtKt.setVisible(noNetwork, true);
            AppBarLayout appBar = ((fxh) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(appBar, "appBar");
            ViewExtKt.setVisible(appBar, false);
            return;
        }
        TextView noNetwork2 = ((fxh) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(noNetwork2, "noNetwork");
        ViewExtKt.setVisible(noNetwork2, false);
        AppBarLayout appBar2 = ((fxh) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(appBar2, "appBar");
        ViewExtKt.setVisible(appBar2, true);
        requestData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRecyclerView() {
        this.historyRecordAdapter = new PkUserHistoryRecordAdapter(new h.f<PkRecordDetail>() { // from class: com.xiaomi.fitness.active.pk.ui.PkHistoryDetailActivity.initRecyclerView.1
            @Override // androidx.recyclerview.widget.h.f
            public boolean areContentsTheSame(PkRecordDetail oldItem, PkRecordDetail newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getPkId() == newItem.getPkId();
            }

            @Override // androidx.recyclerview.widget.h.f
            public boolean areItemsTheSame(PkRecordDetail oldItem, PkRecordDetail newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getPkId() == newItem.getPkId();
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        final RecyclerView pkHistoryRecycler = ((fxh) getMBinding()).J;
        Intrinsics.checkNotNullExpressionValue(pkHistoryRecycler, "pkHistoryRecycler");
        pkHistoryRecycler.setLayoutManager(linearLayoutManager);
        PkUserHistoryRecordAdapter pkUserHistoryRecordAdapter = this.historyRecordAdapter;
        PkUserHistoryRecordAdapter pkUserHistoryRecordAdapter2 = null;
        if (pkUserHistoryRecordAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyRecordAdapter");
            pkUserHistoryRecordAdapter = null;
        }
        pkHistoryRecycler.setAdapter(pkUserHistoryRecordAdapter);
        Function1<? super CombinedLoadStates, Unit> function1 = new Function1() { // from class: xxh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkHistoryDetailActivity.initRecyclerView$lambda$4(this.f39561a, pkHistoryRecycler, (CombinedLoadStates) obj);
            }
        };
        PkUserHistoryRecordAdapter pkUserHistoryRecordAdapter3 = this.historyRecordAdapter;
        if (pkUserHistoryRecordAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyRecordAdapter");
        } else {
            pkUserHistoryRecordAdapter2 = pkUserHistoryRecordAdapter3;
        }
        pkUserHistoryRecordAdapter2.addLoadStateListener(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRecyclerView$lambda$4(PkHistoryDetailActivity this$0, RecyclerView pkHistoryRecycler, CombinedLoadStates it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pkHistoryRecycler, "$pkHistoryRecycler");
        Intrinsics.checkNotNullParameter(it, "it");
        PkUserHistoryRecordAdapter pkUserHistoryRecordAdapter = this$0.historyRecordAdapter;
        if (pkUserHistoryRecordAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyRecordAdapter");
            pkUserHistoryRecordAdapter = null;
        }
        ViewExtKt.setVisible(pkHistoryRecycler, !(pkUserHistoryRecordAdapter.getItemCount() == 0));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshTopCard(AggregatePkInfo it) {
        String nickName;
        UserInfo oppUserInfo = it != null ? it.getOppUserInfo() : null;
        UserInfo ownUserInfo = it != null ? it.getOwnUserInfo() : null;
        ImageUtils imageUtils = ImageUtils.INSTANCE;
        imageUtils.loadAvatar(((fxh) getMBinding()).E, oppUserInfo != null ? oppUserInfo.getIcon() : null);
        imageUtils.loadAvatar(((fxh) getMBinding()).G, ownUserInfo != null ? ownUserInfo.getIcon() : null);
        if (oppUserInfo == null || (nickName = oppUserInfo.getNickName()) == null) {
            nickName = "--";
        }
        ((fxh) getMBinding()).F.setText(nickName);
        setTitle(nickName);
        ((fxh) getMBinding()).H.setText(ResourceExtKt.getString(ozi.G));
        ((fxh) getMBinding()).L.setText(String.valueOf(it != null ? it.getOppWinCount() : 0));
        ((fxh) getMBinding()).M.setText(String.valueOf(it != null ? it.getOwnWinCount() : 0));
        final String medalUrl = it != null ? it.getMedalUrl() : null;
        if (TextUtils.isEmpty(medalUrl)) {
            ImageView ivMedal = ((fxh) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(ivMedal, "ivMedal");
            ViewExtKt.setVisible(ivMedal, false);
            View viewSpace = ((fxh) getMBinding()).N;
            Intrinsics.checkNotNullExpressionValue(viewSpace, "viewSpace");
            ViewExtKt.setVisible(viewSpace, false);
            return;
        }
        ImageView ivMedal2 = ((fxh) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(ivMedal2, "ivMedal");
        ViewExtKt.setVisible(ivMedal2, true);
        View viewSpace2 = ((fxh) getMBinding()).N;
        Intrinsics.checkNotNullExpressionValue(viewSpace2, "viewSpace");
        ViewExtKt.setVisible(viewSpace2, true);
        ImageView ivMedal3 = ((fxh) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(ivMedal3, "ivMedal");
        ImageLoader imageLoader = Coil.imageLoader(ivMedal3.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(ivMedal3.getContext()).data(medalUrl).target(ivMedal3);
        builderTarget.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.active.pk.ui.PkHistoryDetailActivity$refreshTopCard$lambda$3$$inlined$listener$default$1
            @Override // coil.request.ImageRequest.Listener
            public void onCancel(@NotNull ImageRequest request) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                PkLogger.INSTANCE.i(PkHistoryDetailActivity.TAG, "load error uri is " + medalUrl, new Object[0]);
                ImageView ivMedal4 = PkHistoryDetailActivity.access$getMBinding(this).D;
                Intrinsics.checkNotNullExpressionValue(ivMedal4, "ivMedal");
                ViewExtKt.setVisible(ivMedal4, false);
                View viewSpace3 = PkHistoryDetailActivity.access$getMBinding(this).N;
                Intrinsics.checkNotNullExpressionValue(viewSpace3, "viewSpace");
                ViewExtKt.setVisible(viewSpace3, false);
            }

            @Override // coil.request.ImageRequest.Listener
            public void onStart(@NotNull ImageRequest request) {
            }

            @Override // coil.request.ImageRequest.Listener
            public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
            }
        });
        imageLoader.enqueue(builderTarget.build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        ActivePkViewModel activePkViewModel = (ActivePkViewModel) getMViewModel();
        Long l = this.pkUid;
        Intrinsics.checkNotNull(l);
        activePkViewModel.queryPkUserAggregateHistoryLiveData(l.longValue()).observe(this, new PkHistoryDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yxh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkHistoryDetailActivity.requestData$lambda$0(this.f40668a, (AggregatePkInfo) obj);
            }
        }));
        ActivePkViewModel.queryHistoryPkRecordsDetailPagingData$default((ActivePkViewModel) getMViewModel(), this.pkUid, 0, 2, null).observe(this, new PkHistoryDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zxh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PkHistoryDetailActivity.requestData$lambda$1(this.f41779a, (PagingData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$0(PkHistoryDetailActivity this$0, AggregatePkInfo aggregatePkInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshTopCard(aggregatePkInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$1(PkHistoryDetailActivity this$0, PagingData pagingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PkUserHistoryRecordAdapter pkUserHistoryRecordAdapter = this$0.historyRecordAdapter;
        if (pkUserHistoryRecordAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyRecordAdapter");
            pkUserHistoryRecordAdapter = null;
        }
        Lifecycle lifecycle = this$0.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNull(pagingData);
        pkUserHistoryRecordAdapter.submitData(lifecycle, pagingData);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return bui.f4616a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return yv1.f40598a;
    }

    @Override // com.xiaomi.fitness.active.pk.ui.Hilt_PkHistoryDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarNormalTitleMode();
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setBackgroundDrawable(new ColorDrawable(ResourceExtKt.getResourceColor(this, zii.c)));
        }
        Intent intent = getIntent();
        Long lValueOf = intent != null ? Long.valueOf(intent.getLongExtra(PkConstants.PARAM_PK_UID, 0L)) : null;
        this.pkUid = lValueOf;
        PkLogger.INSTANCE.i(TAG, "pkUid:" + lValueOf, new Object[0]);
        Long l = this.pkUid;
        if (l != null) {
            Intrinsics.checkNotNull(l);
            if (l.longValue() > 0) {
                initRecyclerView();
                return;
            }
        }
        finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        checkNetwork();
    }
}
