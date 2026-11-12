package com.xiaomi.fitness.mine.personal.data.management.recycler;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.access.export.AccessManager;
import com.xiaomi.fitness.access.export.AccessManagerExtKt;
import com.xiaomi.fitness.access.export.bean.MiSportData;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.mine.personal.data.management.data.model.App;
import com.xiaomi.fitness.mine.personal.data.management.data.model.AppWrapper;
import com.xiaomi.fitness.mine.personal.data.management.data.model.AuthConfigItem;
import com.xiaomi.fitness.mine.personal.data.management.recycler.AuthConfigListAdapter;
import com.xiaomi.fitness.util.MineUtil;
import com.xiaomi.fitness.util.PersonalDataManagementUtilKt;
import com.xiaomi.fitness.widget.view.DividerView;
import com.xiaomi.onetrack.c.q;
import defpackage.lri;
import defpackage.m0j;
import defpackage.nuf;
import defpackage.rui;
import defpackage.vni;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006789:;<B\u000f\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b5\u00106J)\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00000\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0010\u0010\f\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\r2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\r2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J!\u0010\u0014\u001a\u00020\r2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J!\u0010\u0015\u001a\u00020\r2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J)\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R \u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00104¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/AuthConfigItem;", "authConfigList", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$UiModel;", "convertAuthConfigListToUiModelList", "(Ljava/util/List;)Ljava/util/List;", "", "authManagementType", "", "uiModeList", "", "addTitleIfNeed", "(ILjava/util/List;)V", "uiModelList", "addStravaAndGoogleFit", "(Ljava/util/List;)V", "addSuuntoUiMode", "addWechatAndAlipayUiModel", "addZeppLifeToUiModel", "authType", "addHealthConnectToUiModelIfNeeded", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$OnItemClickListener;", "onItemClickListener", "setOnItemClickListener", "(Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$OnItemClickListener;)V", "updateAuthConfigList", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "getContext", "()Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "mOnItemClickListener", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$OnItemClickListener;", "", "showGoogleFitEntrance", "Z", "Ljava/util/List;", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;)V", "Companion", "OnItemClickListener", "ItemViewHolder", "TwoLineItemViewHolder", "TitleDividerViewHolder", "UiModel", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAuthConfigListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthConfigListAdapter.kt\ncom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,394:1\n1863#2:395\n1863#2,2:396\n1864#2:398\n*S KotlinDebug\n*F\n+ 1 AuthConfigListAdapter.kt\ncom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter\n*L\n260#1:395\n270#1:396,2\n260#1:398\n*E\n"})
public final class AuthConfigListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "AuthConfigListAdapter";
    public static final int TYPE_APP_ITEM = 0;
    public static final int TYPE_APP_ITEM_TWO_LINE = 2;
    public static final int TYPE_TITLE_DIVIDER = 1;

    @NotNull
    private final BaseActivity context;

    @Nullable
    private OnItemClickListener mOnItemClickListener;
    private boolean showGoogleFitEntrance;

    @NotNull
    private List<UiModel> uiModelList;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$UiModel;", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;", "uiModel", "", "bindData", "(Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$UiModel;)V", "Landroid/widget/TextView;", "appNameTv", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "appIconIv", "Landroid/widget/ImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;Landroid/view/View;)V", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nAuthConfigListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthConfigListAdapter.kt\ncom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$ItemViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,394:1\n54#2,3:395\n24#2:398\n57#2,6:399\n63#2,2:406\n54#2,3:408\n24#2:411\n57#2,6:412\n63#2,2:419\n57#3:405\n57#3:418\n*S KotlinDebug\n*F\n+ 1 AuthConfigListAdapter.kt\ncom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$ItemViewHolder\n*L\n139#1:395,3\n139#1:398\n139#1:399,6\n139#1:406,2\n141#1:408,3\n141#1:411\n141#1:412,6\n141#1:419,2\n139#1:405\n141#1:418\n*E\n"})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView appIconIv;

        @NotNull
        private final TextView appNameTv;
        final /* synthetic */ AuthConfigListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull AuthConfigListAdapter authConfigListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = authConfigListAdapter;
            View viewFindViewById = itemView.findViewById(lri.g);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.appNameTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(lri.f);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.appIconIv = (ImageView) viewFindViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(AuthConfigListAdapter this$0, UiModel uiModel, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(uiModel, "$uiModel");
            Intrinsics.checkNotNullParameter(it, "it");
            nuf.f(it);
            OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
            if (onItemClickListener != null) {
                Long appId = uiModel.getAppId();
                Intrinsics.checkNotNull(appId);
                onItemClickListener.onItemClick(new AppWrapper(new App(appId.longValue(), uiModel.getAppIconUrlStr(), uiModel.getAppName(), uiModel.getThirdPartyType(), uiModel.getTenantId(), uiModel.getJumpLink()), uiModel.getAuthType()));
            }
            return Unit.INSTANCE;
        }

        public final void bindData(@NotNull final UiModel uiModel) {
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            this.appNameTv.setText(uiModel.getAppName());
            String appIconUrlStr = uiModel.getAppIconUrlStr();
            if (appIconUrlStr != null && !StringsKt__StringsKt.isBlank(appIconUrlStr)) {
                PersonalDataManagementUtilKt.loadImageWithUrlWithDefaultHandled(this.appIconIv, uiModel.getAppIconUrlStr());
                Unit unit = Unit.INSTANCE;
            } else if (uiModel.getIconDrawableResId() != null) {
                ImageView imageView = this.appIconIv;
                Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(uiModel.getIconDrawableResId()).target(imageView).build());
            } else {
                ImageView imageView2 = this.appIconIv;
                Coil.imageLoader(imageView2.getContext()).enqueue(new ImageRequest.Builder(imageView2.getContext()).data(Integer.valueOf(vni.q)).target(imageView2).build());
            }
            View view = this.itemView;
            final AuthConfigListAdapter authConfigListAdapter = this.this$0;
            ViewExtKt.clickWithTrigger$default(view, 0L, new Function1() { // from class: nq1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AuthConfigListAdapter.ItemViewHolder.bindData$lambda$0(authConfigListAdapter, uiModel, (View) obj);
                }
            }, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$OnItemClickListener;", "", "onItemClick", "", "appWrapper", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/AppWrapper;", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(@NotNull AppWrapper appWrapper);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$TitleDividerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$UiModel;", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;", "uiModel", "", "bindData", "(Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$UiModel;)V", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/widget/view/DividerView;", "divider", "Lcom/xiaomi/fitness/widget/view/DividerView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;Landroid/view/View;)V", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TitleDividerViewHolder extends RecyclerView.d0 {

        @NotNull
        private final DividerView divider;
        final /* synthetic */ AuthConfigListAdapter this$0;

        @NotNull
        private final TextView titleTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleDividerViewHolder(@NotNull AuthConfigListAdapter authConfigListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = authConfigListAdapter;
            View viewFindViewById = itemView.findViewById(lri.b1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.titleTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(lri.I);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.divider = (DividerView) viewFindViewById2;
        }

        public final void bindData(@NotNull UiModel uiModel) {
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            Logger.d(AuthConfigListAdapter.TAG, "TitleDividerViewHolder bindData uiModel=" + uiModel);
            this.titleTv.setText(uiModel.getTitle());
            if (uiModel.getShouldHideDivider()) {
                ViewExtKt.gone(this.divider);
            } else {
                ViewExtKt.visible(this.divider);
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$TwoLineItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$UiModel;", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;", "uiModel", "", "bindData", "(Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$UiModel;)V", "Landroid/widget/TextView;", "appNameTv", "Landroid/widget/TextView;", "description", "Landroid/widget/ImageView;", "appIconIv", "Landroid/widget/ImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;Landroid/view/View;)V", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nAuthConfigListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthConfigListAdapter.kt\ncom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$TwoLineItemViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,394:1\n54#2,3:395\n24#2:398\n57#2,6:399\n63#2,2:406\n54#2,3:408\n24#2:411\n57#2,6:412\n63#2,2:419\n57#3:405\n57#3:418\n*S KotlinDebug\n*F\n+ 1 AuthConfigListAdapter.kt\ncom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$TwoLineItemViewHolder\n*L\n168#1:395,3\n168#1:398\n168#1:399,6\n168#1:406,2\n170#1:408,3\n170#1:411\n170#1:412,6\n170#1:419,2\n168#1:405\n170#1:418\n*E\n"})
    public final class TwoLineItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView appIconIv;

        @NotNull
        private final TextView appNameTv;

        @NotNull
        private final TextView description;
        final /* synthetic */ AuthConfigListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TwoLineItemViewHolder(@NotNull AuthConfigListAdapter authConfigListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = authConfigListAdapter;
            View viewFindViewById = itemView.findViewById(lri.g);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.appNameTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(lri.F);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.description = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(lri.f);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.appIconIv = (ImageView) viewFindViewById3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(TwoLineItemViewHolder this$0, MiSportData.MiSportStatus it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            Logger.d(AuthConfigListAdapter.TAG, "getMiSportLastMigrateStatus status=" + it.status + " mCompleteTime=" + it.mCompleteTime);
            int i = it.status;
            if (i == -1) {
                ViewExtKt.visible(this$0.description);
                this$0.description.setText(ResourceExtKt.getString(m0j.H));
            } else if (i == 1) {
                ViewExtKt.visible(this$0.description);
                this$0.description.setText(ResourceExtKt.getString(m0j.G));
            } else if (i != 2) {
                ViewExtKt.invisible(this$0.description);
            } else {
                ViewExtKt.visible(this$0.description);
                this$0.description.setText(String.format(ResourceExtKt.getString(m0j.I), TimeDateUtil.getDateYYYYMMddLocalFormat(it.mCompleteTime * ((long) 1000)) + " " + TimeDateUtil.getDateHHmm24Format(it.mCompleteTime)));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$1(AuthConfigListAdapter this$0, UiModel uiModel, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(uiModel, "$uiModel");
            Intrinsics.checkNotNullParameter(it, "it");
            nuf.f(it);
            OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
            if (onItemClickListener != null) {
                Long appId = uiModel.getAppId();
                Intrinsics.checkNotNull(appId);
                onItemClickListener.onItemClick(new AppWrapper(new App(appId.longValue(), uiModel.getAppIconUrlStr(), uiModel.getAppName(), null, null, uiModel.getJumpLink(), 24, null), uiModel.getAuthType()));
            }
            return Unit.INSTANCE;
        }

        public final void bindData(@NotNull final UiModel uiModel) {
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            this.appNameTv.setText(uiModel.getAppName());
            String appIconUrlStr = uiModel.getAppIconUrlStr();
            if (appIconUrlStr != null && !StringsKt__StringsKt.isBlank(appIconUrlStr)) {
                PersonalDataManagementUtilKt.loadImageWithUrlWithDefaultHandled(this.appIconIv, uiModel.getAppIconUrlStr());
                Unit unit = Unit.INSTANCE;
            } else if (uiModel.getIconDrawableResId() != null) {
                ImageView imageView = this.appIconIv;
                Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(uiModel.getIconDrawableResId()).target(imageView).build());
            } else {
                ImageView imageView2 = this.appIconIv;
                Coil.imageLoader(imageView2.getContext()).enqueue(new ImageRequest.Builder(imageView2.getContext()).data(Integer.valueOf(vni.q)).target(imageView2).build());
            }
            String appDescription = uiModel.getAppDescription();
            if (appDescription == null || appDescription.length() == 0) {
                ViewExtKt.invisible(this.description);
            } else {
                ViewExtKt.visible(this.description);
                this.description.setText(uiModel.getAppDescription());
            }
            Long appId = uiModel.getAppId();
            if (appId != null && appId.longValue() == -103) {
                AccessManagerExtKt.getInstance(AccessManager.INSTANCE).getMiSportLastMigrateStatus(new Function1() { // from class: oq1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AuthConfigListAdapter.TwoLineItemViewHolder.bindData$lambda$0(this.f29380a, (MiSportData.MiSportStatus) obj);
                    }
                });
            }
            View view = this.itemView;
            final AuthConfigListAdapter authConfigListAdapter = this.this$0;
            ViewExtKt.clickWithTrigger$default(view, 0L, new Function1() { // from class: pq1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AuthConfigListAdapter.TwoLineItemViewHolder.bindData$lambda$1(authConfigListAdapter, uiModel, (View) obj);
                }
            }, 1, null);
        }
    }

    public AuthConfigListAdapter(@NotNull BaseActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.uiModelList = new ArrayList();
    }

    private final void addHealthConnectToUiModelIfNeeded(int authType, List<UiModel> uiModelList) {
        if (!AccessManagerExtKt.getInstance(AccessManager.INSTANCE).isHealthConnectSupported()) {
            Logger.i(TAG, "health connect is not available!!");
            return;
        }
        uiModelList.add(new UiModel(this, -107L, null, "Health Connect", null, authType, null, false, Integer.valueOf(vni.y), null, null, null, 1898, null));
    }

    private final void addStravaAndGoogleFit(List<UiModel> uiModelList) {
        uiModelList.add(new UiModel(this, -104L, null, ResourceExtKt.getString(m0j.i0), null, 3, null, false, Integer.valueOf(vni.v), null, null, null, 1866, null));
        if (this.showGoogleFitEntrance) {
            uiModelList.add(new UiModel(this, -105L, null, ResourceExtKt.getString(m0j.y), null, 3, null, false, Integer.valueOf(vni.t), null, null, null, 1866, null));
        }
    }

    private final void addSuuntoUiMode(List<UiModel> uiModelList) {
        uiModelList.add(new UiModel(this, -106L, null, ResourceExtKt.getString(m0j.d0), null, 3, null, false, Integer.valueOf(vni.d), null, null, null, 1866, null));
    }

    private final void addTitleIfNeed(int authManagementType, List<UiModel> uiModeList) {
        if ((!uiModeList.isEmpty()) && ((UiModel) CollectionsKt___CollectionsKt.last((List) uiModeList)).getAuthType() == authManagementType) {
            return;
        }
        uiModeList.add(new UiModel(this, null, PersonalDataManagementUtilKt.getAuthTypeNameStr(authManagementType), "", null, authManagementType, null, uiModeList.isEmpty(), null, null, null, null, 1953, null));
    }

    private final void addWechatAndAlipayUiModel(List<UiModel> uiModelList) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        String str2 = null;
        int i = 2;
        boolean z = false;
        Integer num = null;
        Long l = null;
        String str3 = null;
        UiModel uiModel = new UiModel(this, -101L, str, ResourceExtKt.getString(m0j.E0), str2, i, ResourceExtKt.getString(m0j.c0), z, Integer.valueOf(vni.e), num, l, str3, 1866, defaultConstructorMarker);
        UiModel uiModel2 = new UiModel(this, -102L, str, ResourceExtKt.getString(m0j.h), str2, i, null, z, Integer.valueOf(vni.o), num, l, str3, 1898, defaultConstructorMarker);
        uiModelList.add(uiModel);
        uiModelList.add(uiModel2);
    }

    private final void addZeppLifeToUiModel(List<UiModel> uiModelList) {
        uiModelList.add(new UiModel(this, -103L, null, "Zepp Life", null, 1, null, false, Integer.valueOf(vni.x), null, null, null, 1898, null));
    }

    private final List<UiModel> convertAuthConfigListToUiModelList(List<AuthConfigItem> authConfigList) {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        MineUtil mineUtil = MineUtil.INSTANCE;
        boolean zIsGlobalRegion = mineUtil.isGlobalRegion();
        String str2 = TAG;
        int i = 2;
        int i2 = 1;
        if (zIsGlobalRegion || mineUtil.isPlayChannel()) {
            str = TAG;
            arrayList = arrayList2;
            addTitleIfNeed(1, arrayList);
            addZeppLifeToUiModel(arrayList);
            if (mineUtil.isGlobalRegion() && mineUtil.isPlayChannel()) {
                addTitleIfNeed(3, arrayList);
                addHealthConnectToUiModelIfNeeded(3, arrayList);
                addStravaAndGoogleFit(arrayList);
                addSuuntoUiMode(arrayList);
            } else {
                addTitleIfNeed(2, arrayList);
                if (mineUtil.isGlobalRegion()) {
                    addHealthConnectToUiModelIfNeeded(3, arrayList);
                }
                addWechatAndAlipayUiModel(arrayList);
            }
        } else {
            if (authConfigList != null) {
                for (AuthConfigItem authConfigItem : authConfigList) {
                    int authType = authConfigItem.getAuthType();
                    if (authType == i2) {
                        addTitleIfNeed(authType, arrayList2);
                        addZeppLifeToUiModel(arrayList2);
                    }
                    if (authType == i) {
                        addTitleIfNeed(authType, arrayList2);
                        addWechatAndAlipayUiModel(arrayList2);
                    }
                    List<App> appList = authConfigItem.getAppList();
                    if (appList != null) {
                        for (App app : appList) {
                            int i3 = authType;
                            String str3 = str2;
                            ArrayList arrayList3 = arrayList2;
                            UiModel uiModel = new UiModel(this, Long.valueOf(app.getAppId()), null, app.getAppName(), app.getAppIcon(), authType, null, false, null, app.getThirdPartyType(), app.getTenantId(), app.getJumpLink(), 226, null);
                            addTitleIfNeed(i3, arrayList3);
                            arrayList3.add(uiModel);
                            Logger.d(str3, "convertAuthConfigListToUiModelList appModel=" + uiModel);
                            authType = i3;
                            arrayList2 = arrayList3;
                            str2 = str3;
                        }
                    }
                    arrayList2 = arrayList2;
                    str2 = str2;
                    i2 = 1;
                    i = 2;
                }
            }
            str = str2;
            arrayList = arrayList2;
        }
        Logger.d(str, "convertAuthConfigListToUiModelList uiModeList=" + arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateAuthConfigList$lambda$0(AuthConfigListAdapter this$0, List list, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showGoogleFitEntrance = bool.booleanValue();
        this$0.uiModelList = this$0.convertAuthConfigListToUiModelList(list);
        this$0.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    @NotNull
    public final BaseActivity getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        Logger.d(TAG, "getItemCount uiModeList size=" + this.uiModelList.size());
        return this.uiModelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        Long appId = this.uiModelList.get(position).getAppId();
        if ((appId != null && appId.longValue() == -101) || (appId != null && appId.longValue() == -103)) {
            return 2;
        }
        return this.uiModelList.get(position).getTitle() == null ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Long appId;
        Intrinsics.checkNotNullParameter(holder, "holder");
        UiModel uiModel = this.uiModelList.get(position);
        holder.setIsRecyclable(false);
        Logger.d(TAG, "onBindViewHolder position=" + position + " uiMode=" + uiModel);
        Long appId2 = uiModel.getAppId();
        if ((appId2 != null && appId2.longValue() == -103) || ((appId = uiModel.getAppId()) != null && appId.longValue() == -101)) {
            ((TwoLineItemViewHolder) holder).bindData(uiModel);
        } else if (uiModel.getTitle() == null) {
            ((ItemViewHolder) holder).bindData(uiModel);
        } else {
            ((TitleDividerViewHolder) holder).bindData(uiModel);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(rui.d, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new ItemViewHolder(this, viewInflate);
        }
        if (viewType != 2) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(rui.c, parent, false);
            Intrinsics.checkNotNull(viewInflate2);
            return new TitleDividerViewHolder(this, viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(rui.e, parent, false);
        Intrinsics.checkNotNull(viewInflate3);
        return new TwoLineItemViewHolder(this, viewInflate3);
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        if (onItemClickListener != null) {
            this.mOnItemClickListener = onItemClickListener;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateAuthConfigList(@Nullable final List<AuthConfigItem> authConfigList) {
        MineUtil mineUtil = MineUtil.INSTANCE;
        if (mineUtil.isPlayChannel() || mineUtil.isGlobalRegion()) {
            AccessManagerExtKt.getInstance(AccessManager.INSTANCE).getShowGoogleFitEntranceLiveData().observe(this.context, new AuthConfigListAdapter$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mq1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AuthConfigListAdapter.updateAuthConfigList$lambda$0(this.f27089a, authConfigList, (Boolean) obj);
                }
            }));
        } else {
            this.uiModelList = convertAuthConfigListToUiModelList(authConfigList);
            notifyDataSetChanged();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b#\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter$UiModel;", "", q.f13858b, "", "title", "", "appName", "appIconUrlStr", "authType", "", "appDescription", "shouldHideDivider", "", "iconDrawableResId", "thirdPartyType", CloudContract.COL_TENANT_ID, "jumpLink", "<init>", "(Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTitle", "()Ljava/lang/String;", "getAppName", "getAppIconUrlStr", "getAuthType", "()I", "getAppDescription", "getShouldHideDivider", "()Z", "getIconDrawableResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getThirdPartyType", "getTenantId", "getJumpLink", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class UiModel {

        @Nullable
        private final String appDescription;

        @Nullable
        private final String appIconUrlStr;

        @Nullable
        private final Long appId;

        @NotNull
        private final String appName;
        private final int authType;

        @Nullable
        private final Integer iconDrawableResId;

        @Nullable
        private final String jumpLink;
        private final boolean shouldHideDivider;

        @Nullable
        private final Long tenantId;

        @Nullable
        private final Integer thirdPartyType;
        final /* synthetic */ AuthConfigListAdapter this$0;

        @Nullable
        private final String title;

        public UiModel(@Nullable AuthConfigListAdapter authConfigListAdapter, @Nullable Long l, @NotNull String str, @Nullable String appName, String str2, @Nullable int i, String str3, @Nullable boolean z, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l2, String str4) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.this$0 = authConfigListAdapter;
            this.appId = l;
            this.title = str;
            this.appName = appName;
            this.appIconUrlStr = str2;
            this.authType = i;
            this.appDescription = str3;
            this.shouldHideDivider = z;
            this.iconDrawableResId = num;
            this.thirdPartyType = num2;
            this.tenantId = l2;
            this.jumpLink = str4;
        }

        @Nullable
        public final String getAppDescription() {
            return this.appDescription;
        }

        @Nullable
        public final String getAppIconUrlStr() {
            return this.appIconUrlStr;
        }

        @Nullable
        public final Long getAppId() {
            return this.appId;
        }

        @NotNull
        public final String getAppName() {
            return this.appName;
        }

        public final int getAuthType() {
            return this.authType;
        }

        @Nullable
        public final Integer getIconDrawableResId() {
            return this.iconDrawableResId;
        }

        @Nullable
        public final String getJumpLink() {
            return this.jumpLink;
        }

        public final boolean getShouldHideDivider() {
            return this.shouldHideDivider;
        }

        @Nullable
        public final Long getTenantId() {
            return this.tenantId;
        }

        @Nullable
        public final Integer getThirdPartyType() {
            return this.thirdPartyType;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public /* synthetic */ UiModel(AuthConfigListAdapter authConfigListAdapter, Long l, String str, String str2, String str3, int i, String str4, boolean z, Integer num, Integer num2, Long l2, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(authConfigListAdapter, (i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? null : str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? null : l2, (i2 & 1024) != 0 ? null : str5);
        }
    }
}
